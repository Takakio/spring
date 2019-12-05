package br.com.db1.db1start.bancoapi.controller;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.db1.db1start.bancoapi.adapter.CidadeAdapter;
import br.com.db1.db1start.bancoapi.dto.CidadeDTO;
import br.com.db1.db1start.bancoapi.dto.CidadeFormDTO;
import br.com.db1.db1start.bancoapi.entity.Cidade;
import br.com.db1.db1start.bancoapi.service.CidadeService;

@RestController
public class CidadeController {
	
	@Autowired CidadeService cidadeService;
	
	@GetMapping("/cidades")
	public List<CidadeDTO> buscarTodasAsCidades(){
		List<Cidade> entidadesCidade = cidadeService.buscarTodos();
		return entidadesCidade.stream()
                .map(CidadeAdapter::converteEntidadeCidadeParaDTO).collect(Collectors.toList());
		
	}
	
	@PostMapping("/cidades")
	public CidadeDTO criarCidade(@RequestBody CidadeFormDTO cidadeFormDTO) {
		Cidade cidade = cidadeService.criar(cidadeFormDTO.getNome(), cidadeFormDTO.getEstadoDTO().getId());
				return CidadeAdapter.converteEntidadeCidadeParaDTO(cidade);
	}
	
	
	@DeleteMapping("/cidades/{id}")
	public void deletarCidade(@PathVariable Long id) {
		cidadeService.deletarPorId(id);
	}
	
	@PutMapping("/cidades/{id}")
	public void alterarCidade(@PathVariable Long id, @RequestBody CidadeFormDTO alteracoes) {
		cidadeService.atualizar(id, alteracoes.getNome());
	}
}

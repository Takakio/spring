package br.com.db1.db1start.bancoapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.db1.db1start.bancoapi.adapter.AgenciaAdapter;
import br.com.db1.db1start.bancoapi.dto.AgenciaDTO;
import br.com.db1.db1start.bancoapi.dto.AgenciaFormDTO;
import br.com.db1.db1start.bancoapi.entity.Agencia;
import br.com.db1.db1start.bancoapi.service.AgenciaService;

@RestController
public class AgenciaController {
	
	@Autowired
	private AgenciaService agenciaService;
	
	@GetMapping("/agencias/{id}")
	public Agencia buscarAgenciaPeloId(@PathVariable Long id) {
		Agencia agencia = agenciaService.buscarPorId(id);
		return agencia;
	}
	
	/*@PostMapping("/agencias")
	public AgenciaDTO criarAgencia(@RequestBody AgenciaFormDTO agenciaFormDTO) {
		Agencia agencia = agenciaService.criar(agenciaFormDTO.getNumero(), agenciaFormDTO.getNumeroBanco(), agenciaFormDTO.getCidade());
		return AgenciaAdapter.converteEntidadeParaDTO(agencia);
	}*/
	
	
}

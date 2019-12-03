package br.com.db1.db1start.bancoapi.adapter;

import br.com.db1.db1start.bancoapi.dto.CidadeDTO;
import br.com.db1.db1start.bancoapi.dto.CidadeFormDTO;
import br.com.db1.db1start.bancoapi.entity.Cidade;

public class CidadeAdapter {
	public static CidadeDTO converteEntidadeCidadeParaDTO(Cidade cidade) {
        CidadeDTO cidadeDTO = new CidadeDTO();
        cidadeDTO.setId(cidade.getId());
        cidadeDTO.setNome(cidade.getNome());
        cidadeDTO.setEstado(cidade.getEstado());
        return cidadeDTO;
    }
	
	public static Cidade converteDTOParaEntidadeCidade(CidadeFormDTO dto) {
        Cidade cidade = new Cidade();
        cidade.setNome(dto.getNome());
        cidade.setEstado(dto.getEstado());
        return cidade;
    }
}

package br.com.db1.db1start.bancoapi.adapter;

import br.com.db1.db1start.bancoapi.dto.AgenciaDTO;
import br.com.db1.db1start.bancoapi.dto.AgenciaFormDTO;
import br.com.db1.db1start.bancoapi.entity.Agencia;

public class AgenciaAdapter {

		public static AgenciaDTO converteEntidadeParaDTO(Agencia agencia) {
			AgenciaDTO agenciaDTO = new AgenciaDTO();
			agenciaDTO.setId(agencia.getId());
			agenciaDTO.setNumero(agencia.getNumero());
			agenciaDTO.setNumeroBanco(agencia.getNumeroBanco());
			agenciaDTO.setCidade(agencia.getCidade());
			return agenciaDTO;
		}
		
		public static Agencia converteDTOParaEntidadeAgencia(AgenciaFormDTO dto) {
	        Agencia agencia = new Agencia();
	        agencia.setNumero(dto.getNumero());
	        agencia.setNumeroBanco(dto.getNumeroBanco());
	        agencia.setCidade(dto.getCidade());
	        return agencia;
	   }
}

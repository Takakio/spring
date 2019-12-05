package br.com.db1.db1start.bancoapi.dto;

import br.com.db1.db1start.bancoapi.entity.Estado;

public class CidadeFormDTO {
	
	private String nome;
	private Estado estado;
	private EstadoDTO estadoDTO;
	
	public String getNome() {
		return nome;
	}
	
	public Estado getEstado() {
		return estado;
	}
	
	public EstadoDTO getEstadoDTO() {
		return estadoDTO;
	}
}

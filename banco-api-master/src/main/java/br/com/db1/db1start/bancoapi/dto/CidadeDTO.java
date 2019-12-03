package br.com.db1.db1start.bancoapi.dto;

import br.com.db1.db1start.bancoapi.entity.Estado;

public class CidadeDTO {
	
	private Long id;
	private String nome;
	private Estado estado;
	
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	
	public Estado getEstado() {
		return estado;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}

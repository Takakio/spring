package br.com.db1.db1start.bancoapi.dto;

import br.com.db1.db1start.bancoapi.entity.Cidade;

public class AgenciaFormDTO {
	private Long id;
	private String numero;
	private String numeroBanco;
	private Cidade cidade;
	
	public Long getId() {
		return id;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public String getNumeroBanco() {
		return numeroBanco;
	}
	
	public Cidade getCidade() {
		return cidade;
	}
}
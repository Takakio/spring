package br.com.db1.db1start.bancoapi.dto;

import br.com.db1.db1start.bancoapi.entity.Cidade;

public class AgenciaDTO {
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
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void setNumeroBanco(String numeroBanco) {
		this.numeroBanco = numeroBanco;
	}
	
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	
	
}

package br.com.db1.db1start.bancoapi.dto;

public class CidadeDTO {
	
	private Long id;
	private String nome;
	private EstadoDTO estadoDTO;
	
	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public EstadoDTO getEstadoDto() {
		return estadoDTO;
	}
	
	public void setEstadoDto(EstadoDTO estadoDto) {
		this.estadoDTO = estadoDto;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}

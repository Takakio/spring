package br.com.db1.db1start.bancoapi.dto;

import br.com.db1.db1start.bancoapi.entity.Estado;

public class EstadoFormDTO {

    private String nome;
    private Estado estado;

    public String getNome() {
        return nome;
    }
    
    public Estado getEstado() {
    	return estado;
    }
}

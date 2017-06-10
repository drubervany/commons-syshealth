package br.com.syshealth.commons.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class EstadoCivil implements Serializable {

	private final Integer codigo;
	private final String nome;

	public EstadoCivil(Integer codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

}

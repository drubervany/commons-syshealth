package br.com.syshealth.commons.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Procedimento implements Serializable {

	private final Long codigo;
	private final String nome;

	public Procedimento(Long codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public Long getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

}

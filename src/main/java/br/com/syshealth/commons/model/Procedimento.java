package br.com.syshealth.commons.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Procedimento implements Serializable {

	private Long codigo;
	private String nome;

	public Procedimento() {
	}

	public Long getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}

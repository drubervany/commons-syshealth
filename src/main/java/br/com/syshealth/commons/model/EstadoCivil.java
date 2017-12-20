package br.com.syshealth.commons.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class EstadoCivil implements Serializable {

	private Integer codigo;

	private String nome;

	public EstadoCivil() {
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}

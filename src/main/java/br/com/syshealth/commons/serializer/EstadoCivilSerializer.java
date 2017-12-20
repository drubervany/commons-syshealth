package br.com.syshealth.commons.serializer;

import java.io.Serializable;

@SuppressWarnings("serial")
public class EstadoCivilSerializer implements Serializable {

	private Integer codigo;
	private String nome;

	public EstadoCivilSerializer() {
	}

	public EstadoCivilSerializer(Integer codigo, String nome) {
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

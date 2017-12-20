package br.com.syshealth.commons.serializer;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PrestadorSerializer implements Serializable {

	private Long codigo;

	private String nome;

	private String cpfCgcDoReferenciado;

	private String tipoDoReferenciado;

	public PrestadorSerializer() {

	}

	public PrestadorSerializer(Long codigo, String nome, String cpfCgcDoReferenciado, String tipoDoReferenciado) {
		this.codigo = codigo;
		this.nome = nome;
		this.cpfCgcDoReferenciado = cpfCgcDoReferenciado;
		this.tipoDoReferenciado = tipoDoReferenciado;
	}

	public Long getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getCpfCgcDoReferenciado() {
		return cpfCgcDoReferenciado;
	}

	public String getTipoDoReferenciado() {
		return tipoDoReferenciado;
	}

}

package br.com.syshealth.commons.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Prestador implements Serializable {

	private Long codigo;

	private String nome;

	private String cpfCgcDoReferenciado;

	private String tipoDoReferenciado;

	public Prestador() {
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

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpfCgcDoReferenciado(String cpfCgcDoReferenciado) {
		this.cpfCgcDoReferenciado = cpfCgcDoReferenciado;
	}

	public void setTipoDoReferenciado(String tipoDoReferenciado) {
		this.tipoDoReferenciado = tipoDoReferenciado;
	}

}

package br.com.syshealth.commons.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SubEmpresa implements Serializable {

	private Integer codigo;

	private String nome;

	private Copay copay;

	private Aporte aporte;

	public SubEmpresa() {
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public Aporte getAporte() {
		return aporte;
	}

	public Copay getCopay() {
		return copay;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCopay(Copay copay) {
		this.copay = copay;
	}

	public void setAporte(Aporte aporte) {
		this.aporte = aporte;
	}

}

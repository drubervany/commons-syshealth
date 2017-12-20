package br.com.syshealth.commons.model;

import java.io.Serializable;

import com.google.gson.GsonBuilder;

import br.com.syshealth.commons.utils.Sistema;

@SuppressWarnings("serial")
public class Cadastro implements Serializable {

	private Integer competencia;

	private Empresa empresa;

	private SubEmpresa subEmpresa;

	private Segurado segurado;

	public Integer getCompetencia() {
		return competencia;
	}

	public Cadastro() {
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public Segurado getSegurado() {
		return segurado;
	}

	public SubEmpresa getSubEmpresa() {
		return subEmpresa;
	}

	public void setCompetencia(Integer competencia) {
		this.competencia = competencia;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public void setSubEmpresa(SubEmpresa subEmpresa) {
		this.subEmpresa = subEmpresa;
	}

	public void setSegurado(Segurado segurado) {
		this.segurado = segurado;
	}

	public String toJson() {
		return new GsonBuilder().setDateFormat(Sistema.FORMATO_DATA.getValue()).create().toJson(this);
	}

	public static Cadastro fromJson(String json) {
		return new GsonBuilder().setDateFormat(Sistema.FORMATO_DATA.getValue()).create().fromJson(json, Cadastro.class);
	}
}

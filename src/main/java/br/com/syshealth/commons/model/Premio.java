package br.com.syshealth.commons.model;

import java.io.Serializable;
import java.math.BigDecimal;

import com.google.gson.GsonBuilder;

import br.com.syshealth.commons.utils.Sistema;

@SuppressWarnings("serial")
public class Premio implements Serializable {

	private Integer competencia;

	private Empresa empresa;

	private SubEmpresa subEmpresa;

	private Segurado segurado;

	private BigDecimal valorPremio;

	private BigDecimal valorTaxaAdm;

	private BigDecimal valorRemissao;

	private BigDecimal valorParteSegurado;

	public Premio() {
	}

	public Integer getCompetencia() {
		return competencia;
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

	public BigDecimal getValorPremio() {
		return valorPremio;
	}

	public BigDecimal getValorTaxaAdm() {
		return valorTaxaAdm;
	}

	public BigDecimal getValorRemissao() {
		return valorRemissao;
	}

	public BigDecimal getValorParteSegurado() {
		return valorParteSegurado;
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

	public void setValorPremio(BigDecimal valorPremio) {
		this.valorPremio = valorPremio;
	}

	public void setValorTaxaAdm(BigDecimal valorTaxaAdm) {
		this.valorTaxaAdm = valorTaxaAdm;
	}

	public void setValorRemissao(BigDecimal valorRemissao) {
		this.valorRemissao = valorRemissao;
	}

	public void setValorParteSegurado(BigDecimal valorParteSegurado) {
		this.valorParteSegurado = valorParteSegurado;
	}

	public String toJson() {
		return new GsonBuilder().setDateFormat(Sistema.FORMATO_DATA.getValue()).create().toJson(this);
	}

	public static Premio fromJson(String json) {
		return new GsonBuilder().setDateFormat(Sistema.FORMATO_DATA.getValue()).create().fromJson(json, Premio.class);
	}

}

package br.com.syshealth.model.relatorio;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VidasTipoBeneficiario {

	private String faixaEtaria;
	private Integer titular = 0;
	private Integer dependente = 0;
	private Integer afastado = 0;
	private Integer demitido = 0;
	private Integer aposentado = 0;
	private Integer agregado = 0;
	private BigDecimal percentual = BigDecimal.ZERO;

	public VidasTipoBeneficiario() {
	}

	public VidasTipoBeneficiario(String faixaEtaria, Integer titular, Integer dependente, Integer afastado,
			Integer demitido, Integer aposentado, Integer agregado) {

		this.faixaEtaria = faixaEtaria;
		this.titular = titular;
		this.dependente = dependente;
		this.afastado = afastado;
		this.demitido = demitido;
		this.aposentado = aposentado;
		this.agregado = agregado;
	}

	public String getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(String faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public Integer getTitular() {
		return titular;
	}

	public void setTitular(Integer titular) {
		this.titular = titular;
	}

	public Integer getDependente() {
		return dependente;
	}

	public void setDependente(Integer dependente) {
		this.dependente = dependente;
	}

	public Integer getAfastado() {
		return afastado;
	}

	public void setAfastado(Integer afastado) {
		this.afastado = afastado;
	}

	public Integer getDemitido() {
		return demitido;
	}

	public void setDemitido(Integer demitido) {
		this.demitido = demitido;
	}

	public Integer getAposentado() {
		return aposentado;
	}

	public void setAposentado(Integer aposentado) {
		this.aposentado = aposentado;
	}

	public Integer getAgregado() {
		return agregado;
	}

	public void setAgregado(Integer agregado) {
		this.agregado = agregado;
	}

	@JsonProperty
	public Integer getTotal() {
		return titular + dependente + afastado + demitido + aposentado + agregado;
	}

	public BigDecimal getPercentual() {
		return percentual;
	}

	public void setPercentual(BigDecimal percentual) {
		this.percentual = percentual;
	}

	@JsonIgnore
	public Integer getTotalDependentes() {
		return dependente + afastado + demitido + aposentado + agregado;
	}
}

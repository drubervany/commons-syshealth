package br.com.syshealth.model.relatorio;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SinistroFaixaEtaria {

	private String faixaEtaria;
	private Integer vidas = 0;
	private BigDecimal sinistro = BigDecimal.ZERO;
	private BigDecimal percVidas = BigDecimal.ZERO;
	private BigDecimal percSinistro = BigDecimal.ZERO;

	public SinistroFaixaEtaria() {
	}

	public String getFaixaEtaria() {
		return faixaEtaria;
	}

	public Integer getVidas() {
		return vidas;
	}

	public BigDecimal getSinistro() {
		return sinistro;
	}

	@JsonProperty
	public BigDecimal getSinistroPmpm() {
		if (this.vidas.intValue() == 0)
			return BigDecimal.ZERO;

		return this.sinistro.divide(new BigDecimal(this.vidas), 2, RoundingMode.HALF_UP);
	}

	public BigDecimal getPercVidas() {
		return percVidas;
	}

	public BigDecimal getPercSinistro() {
		return percSinistro;
	}

	public void setFaixaEtaria(String faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public void setVidas(Integer vidas) {
		this.vidas = vidas;
	}

	public void setSinistro(BigDecimal sinistro) {
		this.sinistro = sinistro;
	}

	public void setPercVidas(BigDecimal percVidas) {
		this.percVidas = percVidas;
	}

	public void setPercSinistro(BigDecimal percSinistro) {
		this.percSinistro = percSinistro;
	}

}
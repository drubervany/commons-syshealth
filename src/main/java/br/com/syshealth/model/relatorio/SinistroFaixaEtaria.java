package br.com.syshealth.model.relatorio;

import java.math.BigDecimal;

public class SinistroFaixaEtaria {

	private String faixaEtaria;
	private Integer vidas;
	private BigDecimal sinistro = BigDecimal.ZERO;
	private BigDecimal sinistroPmpm = BigDecimal.ZERO;
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

	public BigDecimal getSinistroPmpm() {
		return sinistroPmpm;
	}

	public BigDecimal getPercVidas() {
		return percVidas;
	}

	public BigDecimal getPercSinistro() {
		return percSinistro;
	}

	public void add(SinistroFaixaEtaria sinistroFaixaEtaria) {
		this.vidas += sinistroFaixaEtaria.getVidas();
		this.sinistro = this.sinistro.add(sinistroFaixaEtaria.getSinistro());
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

	public void setSinistroPmpm(BigDecimal sinistroPmpm) {
		this.sinistroPmpm = sinistroPmpm;
	}

	public void setPercVidas(BigDecimal percVidas) {
		this.percVidas = percVidas;
	}

	public void setPercSinistro(BigDecimal percSinistro) {
		this.percSinistro = percSinistro;
	}

}
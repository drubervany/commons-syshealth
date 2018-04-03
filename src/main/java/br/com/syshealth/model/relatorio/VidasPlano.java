package br.com.syshealth.model.relatorio;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VidasPlano {

	private String plano;
	private Integer vidas = 0;
	private Integer utilizacao = 0;
	private BigDecimal percentual = BigDecimal.ZERO;

	public VidasPlano() {
	}

	public VidasPlano(String plano, Integer vidas) {
		this.plano = plano;
		this.vidas = vidas;
	}

	public String getPlano() {
		return plano;
	}

	public void setPlano(String plano) {
		this.plano = plano;
	}

	public Integer getVidas() {
		return vidas;
	}

	public void setVidas(Integer vidas) {
		this.vidas = vidas;
	}

	public Integer getUtilizacao() {
		return utilizacao;
	}

	public void setUtilizacao(Integer utilizacao) {
		this.utilizacao = utilizacao;
	}

	public BigDecimal getPercentual() {
		if (percentual == null)
			percentual = BigDecimal.ZERO;
		return percentual;
	}

	public void setPercentual(BigDecimal percentual) {
		this.percentual = percentual;
	}

	public void add(VidasPlano vidasPlano) {
		this.vidas += vidasPlano.getVidas();
		this.utilizacao += vidasPlano.getUtilizacao();
	}
}

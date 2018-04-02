package br.com.syshealth.model.relatorio;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.syshealth.commons.utils.StringUtils;

public class EvolucaoVidas {

	private Integer competencia;
	private Integer vidas = 0;

	public EvolucaoVidas() {
	}

	public EvolucaoVidas(Integer competencia, Integer vidas) {
		this.competencia = competencia;
		this.vidas = vidas;
	}

	public Integer getCompetencia() {
		return competencia;
	}

	public void setCompetencia(Integer competencia) {
		this.competencia = competencia;
	}

	public Integer getVidas() {
		return vidas;
	}

	public void setVidas(Integer vidas) {
		this.vidas = vidas;
	}

	@JsonIgnore
	public String getCompetenciaConvertida() {
		return StringUtils.converteCompetenciaEmDataAbreviada(this.competencia);
	}

	public void add(EvolucaoVidas evolucaoVidas) {
		this.vidas += evolucaoVidas.getVidas();
	}

}

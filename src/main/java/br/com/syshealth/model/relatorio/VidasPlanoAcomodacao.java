package br.com.syshealth.model.relatorio;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.syshealth.commons.utils.StringUtils;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VidasPlanoAcomodacao {

	private Integer competencia;
	private Integer basico = 0;
	private Integer intermediario = 0;
	private Integer executivo = 0;

	public VidasPlanoAcomodacao() {
	}

	public VidasPlanoAcomodacao(final Integer competencia, final Integer basico, final Integer intermediario,
			final Integer executivo) {
		this.competencia = competencia;
		this.basico = basico;
		this.intermediario = intermediario;
		this.executivo = executivo;
	}

	public Integer getCompetencia() {
		return competencia;
	}

	public void setCompetencia(final Integer competencia) {
		this.competencia = competencia;
	}

	public Integer getBasico() {
		return basico;
	}

	public void setBasico(final Integer basico) {
		this.basico = basico;
	}

	public Integer getIntermediario() {
		return intermediario;
	}

	public void setIntermediario(final Integer intermediario) {
		this.intermediario = intermediario;
	}

	public Integer getExecutivo() {
		return executivo;
	}

	public void setExecutivo(final Integer executivo) {
		this.executivo = executivo;
	}

	@JsonProperty
	public Integer getTotal() {
		return basico + intermediario + executivo;
	}

	@JsonIgnore
	public String getCompetenciaConvertida() {
		return StringUtils.converteCompetenciaEmDataAbreviada(competencia);
	}
}

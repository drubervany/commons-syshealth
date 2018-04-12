package br.com.syshealth.model.relatorio;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.syshealth.commons.utils.StringUtils;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EvolucaoVidas {

	private Integer competencia;
	private Integer vidas = 0;

	private EvolucaoVidas(Builder builder) {
		this.competencia = builder.competencia;
		this.vidas = builder.vidas;
	}

	public EvolucaoVidas() {
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

	/**
	 * Creates builder to build {@link EvolucaoVidas}.
	 * 
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link EvolucaoVidas}.
	 */
	public static final class Builder {
		private Integer competencia;
		private Integer vidas = 0;

		private Builder() {
		}

		public Builder withCompetencia(Integer competencia) {
			this.competencia = competencia;
			return this;
		}

		public Builder withVidas(Integer vidas) {
			this.vidas = vidas;
			return this;
		}

		public EvolucaoVidas build() {
			return new EvolucaoVidas(this);
		}
	}

}

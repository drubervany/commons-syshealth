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

	private VidasPlanoAcomodacao(Builder builder) {
		this.competencia = builder.competencia;
		this.basico = builder.basico;
		this.intermediario = builder.intermediario;
		this.executivo = builder.executivo;
	}

	public VidasPlanoAcomodacao() {
	}

	public Integer getCompetencia() {
		return competencia;
	}

	public Integer getBasico() {
		return basico;
	}

	public Integer getIntermediario() {
		return intermediario;
	}

	public Integer getExecutivo() {
		return executivo;
	}

	@JsonProperty
	public Integer getTotal() {
		return this.basico + this.intermediario + this.executivo;
	}

	@JsonIgnore
	public String getCompetenciaConvertida() {
		return StringUtils.converteCompetenciaEmDataAbreviada(this.competencia);
	}

	/**
	 * Creates builder to build {@link VidasPlanoAcomodacao}.
	 * 
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link VidasPlanoAcomodacao}.
	 */
	public static final class Builder {
		private Integer competencia;
		private Integer basico = 0;
		private Integer intermediario = 0;
		private Integer executivo = 0;

		private Builder() {
		}

		public Builder withCompetencia(Integer competencia) {
			this.competencia = competencia;
			return this;
		}

		public Builder withBasico(Integer basico) {
			this.basico = basico;
			return this;
		}

		public Builder withIntermediario(Integer intermediario) {
			this.intermediario = intermediario;
			return this;
		}

		public Builder withExecutivo(Integer executivo) {
			this.executivo = executivo;
			return this;
		}

		public VidasPlanoAcomodacao build() {
			if (this.competencia != 0 && this.competencia != null)
				return new VidasPlanoAcomodacao(this);
			else
				return null;
		}
	}

}

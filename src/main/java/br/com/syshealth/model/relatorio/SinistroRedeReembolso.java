package br.com.syshealth.model.relatorio;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.syshealth.commons.utils.StringUtils;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SinistroRedeReembolso {

	private Integer competencia;
	private BigDecimal rede = BigDecimal.ZERO;
	private BigDecimal reembolso = BigDecimal.ZERO;
	private BigDecimal percentual = BigDecimal.ZERO;

	private SinistroRedeReembolso(Builder builder) {
		this.competencia = builder.competencia;
		this.rede = builder.rede;
		this.reembolso = builder.reembolso;
		this.percentual = builder.percentual;
	}

	public SinistroRedeReembolso() {
	}

	public Integer getCompetencia() {
		return competencia;
	}

	public void setCompetencia(Integer competencia) {
		this.competencia = competencia;
	}

	public BigDecimal getRede() {
		return rede;
	}

	public void setRede(BigDecimal rede) {
		this.rede = rede;
	}

	public BigDecimal getReembolso() {
		return reembolso;
	}

	public void setReembolso(BigDecimal reembolso) {
		this.reembolso = reembolso;
	}

	@JsonProperty
	public BigDecimal getTotal() {
		return this.rede.add(this.reembolso);
	}

	public BigDecimal getPercentual() {
		return percentual;
	}

	public void setPercentual(BigDecimal percentual) {
		this.percentual = percentual;
	}

	@JsonIgnore
	public String getCompetenciaConvertida() {
		return StringUtils.converteCompetenciaEmDataAbreviada(competencia);
	}

	/**
	 * Creates builder to build {@link SinistroRedeReembolso}.
	 * 
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link SinistroRedeReembolso}.
	 */
	public static final class Builder {
		private Integer competencia;
		private BigDecimal rede;
		private BigDecimal reembolso;
		private BigDecimal percentual;

		private Builder() {
		}

		public Builder withCompetencia(Integer competencia) {
			this.competencia = competencia;
			return this;
		}

		public Builder withRede(BigDecimal rede) {
			this.rede = rede;
			return this;
		}

		public Builder withReembolso(BigDecimal reembolso) {
			this.reembolso = reembolso;
			return this;
		}

		public Builder withPercentual(BigDecimal percentual) {
			this.percentual = percentual;
			return this;
		}

		public SinistroRedeReembolso build() {
			return new SinistroRedeReembolso(this);
		}
	}

}

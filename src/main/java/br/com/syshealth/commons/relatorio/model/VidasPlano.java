package br.com.syshealth.commons.relatorio.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VidasPlano {

	private String plano;
	private Integer vidas = 0;
	private Integer utilizacao = 0;
	private BigDecimal percentual = BigDecimal.ZERO;

	private VidasPlano(Builder builder) {
		this.plano = builder.plano;
		this.vidas = builder.vidas;
		this.utilizacao = builder.utilizacao;
		this.percentual = builder.percentual;
	}

	public VidasPlano() {
	}

	public String getPlano() {
		return plano;
	}

	public Integer getVidas() {
		return vidas;
	}

	public Integer getUtilizacao() {
		return utilizacao;
	}

	public BigDecimal getPercentual() {
		return percentual;
	}

	/**
	 * Creates builder to build {@link VidasPlano}.
	 * 
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link VidasPlano}.
	 */
	public static final class Builder {
		private String plano;
		private Integer vidas = 0;
		private Integer utilizacao = 0;
		private BigDecimal percentual = BigDecimal.ZERO;

		private Builder() {
		}

		public Builder withPlano(String plano) {
			this.plano = plano;
			return this;
		}

		public Builder withVidas(Integer vidas) {
			this.vidas = vidas;
			return this;
		}

		public Builder withUtilizacao(Integer utilizacao) {
			this.utilizacao = utilizacao;
			return this;
		}

		public Builder withPercentual(BigDecimal percentual) {
			this.percentual = percentual;
			return this;
		}

		public VidasPlano build() {
			return new VidasPlano(this);
		}
	}

}

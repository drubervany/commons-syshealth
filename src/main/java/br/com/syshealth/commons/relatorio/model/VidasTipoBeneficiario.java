package br.com.syshealth.commons.relatorio.model;

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

	private VidasTipoBeneficiario(Builder builder) {
		this.faixaEtaria = builder.faixaEtaria;
		this.titular = builder.titular;
		this.dependente = builder.dependente;
		this.afastado = builder.afastado;
		this.demitido = builder.demitido;
		this.aposentado = builder.aposentado;
		this.agregado = builder.agregado;
		this.percentual = builder.percentual;
	}

	public VidasTipoBeneficiario() {
	}

	public String getFaixaEtaria() {
		return faixaEtaria;
	}

	public Integer getTitular() {
		return titular;
	}

	public Integer getDependente() {
		return dependente;
	}

	public Integer getAfastado() {
		return afastado;
	}

	public Integer getDemitido() {
		return demitido;
	}

	public Integer getAposentado() {
		return aposentado;
	}

	public Integer getAgregado() {
		return agregado;
	}

	@JsonProperty
	public Integer getTotal() {
		return titular + dependente + afastado + demitido + aposentado + agregado;
	}

	public BigDecimal getPercentual() {
		return percentual;
	}

	@JsonIgnore
	public Integer getTotalDependentes() {
		return dependente + afastado + demitido + aposentado + agregado;
	}

	/**
	 * Creates builder to build {@link VidasTipoBeneficiario}.
	 * 
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link VidasTipoBeneficiario}.
	 */
	public static final class Builder {

		private String faixaEtaria;
		private Integer titular = 0;
		private Integer dependente = 0;
		private Integer afastado = 0;
		private Integer demitido = 0;
		private Integer aposentado = 0;
		private Integer agregado = 0;
		private BigDecimal percentual = BigDecimal.ZERO;

		private Builder() {
		}

		public Builder withFaixaEtaria(String faixaEtaria) {
			this.faixaEtaria = faixaEtaria;
			return this;
		}

		public Builder withTitular(Integer titular) {
			this.titular = titular;
			return this;
		}

		public Builder withDependente(Integer dependente) {
			this.dependente = dependente;
			return this;
		}

		public Builder withAfastado(Integer afastado) {
			this.afastado = afastado;
			return this;
		}

		public Builder withDemitido(Integer demitido) {
			this.demitido = demitido;
			return this;
		}

		public Builder withAposentado(Integer aposentado) {
			this.aposentado = aposentado;
			return this;
		}

		public Builder withAgregado(Integer agregado) {
			this.agregado = agregado;
			return this;
		}

		public Builder withPercentual(BigDecimal percentual) {
			this.percentual = percentual;
			return this;
		}

		public VidasTipoBeneficiario build() {
			return new VidasTipoBeneficiario(this);
		}
	}
}

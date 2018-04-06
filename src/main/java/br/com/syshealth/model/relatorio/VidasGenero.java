package br.com.syshealth.model.relatorio;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VidasGenero {

	private String faixaEtaria;
	private Integer masculino;
	private Integer feminino;
	private BigDecimal percentual;

	private VidasGenero(Builder builder) {
		this.faixaEtaria = builder.faixaEtaria;
		this.masculino = builder.masculino;
		this.feminino = builder.feminino;
		this.percentual = builder.percentual;
	}

	public VidasGenero() {
	}

	public String getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(String faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public Integer getMasculino() {
		return masculino;
	}

	public void setMasculino(Integer masculino) {
		this.masculino = masculino;
	}

	public Integer getFeminino() {
		return feminino;
	}

	public void setFeminino(Integer feminino) {
		this.feminino = feminino;
	}

	@JsonProperty
	public Integer getTotal() {
		return this.masculino + this.feminino;
	}

	public void setPercentual(BigDecimal percentual) {
		this.percentual = percentual;
	}

	public BigDecimal getPercentual() {
		return percentual;
	}

	/**
	 * Creates builder to build {@link VidasGenero}.
	 * 
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link VidasGenero}.
	 */
	public static final class Builder {
		private String faixaEtaria;
		private Integer masculino;
		private Integer feminino;
		private BigDecimal percentual;

		private Builder() {
		}

		public Builder withFaixaEtaria(String faixaEtaria) {
			this.faixaEtaria = faixaEtaria;
			return this;
		}

		public Builder withMasculino(Integer masculino) {
			this.masculino = masculino;
			return this;
		}

		public Builder withFeminino(Integer feminino) {
			this.feminino = feminino;
			return this;
		}

		public Builder withPercentual(BigDecimal percentual) {
			this.percentual = percentual;
			return this;
		}

		public VidasGenero build() {
			return new VidasGenero(this);
		}
	}
}

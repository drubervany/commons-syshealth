package br.com.syshealth.commons.relatorio.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.syshealth.commons.enums.GrupoServicoEnum;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SinistroGrupoConsolidado {

	private GrupoServicoEnum grupoServico;
	private Integer quantidade = 0;
	private BigDecimal sinistro = BigDecimal.ZERO;
	private BigDecimal frequencia = BigDecimal.ZERO;

	private SinistroGrupoConsolidado(Builder builder) {
		this.grupoServico = builder.grupoServico;
		this.quantidade = builder.quantidade;
		this.sinistro = builder.sinistro;
		this.frequencia = builder.frequencia;
	}

	public SinistroGrupoConsolidado() {
	}

	public GrupoServicoEnum getGrupoServico() {
		return grupoServico;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public BigDecimal getSinistro() {
		return sinistro;
	}

	public BigDecimal getFrequencia() {
		return frequencia;
	}

	@JsonProperty
	public BigDecimal getCustoMedio() {
		if (this.frequencia.intValue() == 0)
			return BigDecimal.ZERO;

		return this.sinistro.divide(this.frequencia, 2, RoundingMode.HALF_UP);
	}

	/**
	 * Creates builder to build {@link SinistroGrupoConsolidado}.
	 * 
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link SinistroGrupoConsolidado}.
	 */
	public static final class Builder {

		private GrupoServicoEnum grupoServico;
		private Integer quantidade = 0;
		private BigDecimal sinistro = BigDecimal.ZERO;
		private BigDecimal frequencia = BigDecimal.ZERO;

		private Builder() {
		}

		public Builder withGrupoServico(GrupoServicoEnum grupoServico) {
			this.grupoServico = grupoServico;
			return this;
		}

		public Builder withQuantidade(Integer quantidade) {
			this.quantidade = quantidade;
			return this;
		}

		public Builder withSinistro(BigDecimal sinistro) {
			this.sinistro = sinistro;
			return this;
		}

		public Builder withFrequencia(BigDecimal frequencia) {
			this.frequencia = frequencia;
			return this;
		}

		public SinistroGrupoConsolidado build() {
			return new SinistroGrupoConsolidado(this);
		}
	}
}

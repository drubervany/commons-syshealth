package br.com.syshealth.commons.serializer;

import java.math.BigDecimal;

public class PremioSerializer {

	private CobrancaSerializer cobranca;

	private BigDecimal valorPremio;

	private BigDecimal valorTaxaAdm;

	private BigDecimal valorRemissao;

	private BigDecimal valorParteSegurado;

	private PremioSerializer(Builder builder) {
		this.cobranca = builder.cobranca;
		this.valorPremio = builder.valorPremio;
		this.valorTaxaAdm = builder.valorTaxaAdm;
		this.valorRemissao = builder.valorRemissao;
		this.valorParteSegurado = builder.valorParteSegurado;
	}

	public PremioSerializer() {
	}

	public CobrancaSerializer getCobranca() {
		return cobranca;
	}

	public BigDecimal getValorPremio() {
		return valorPremio;
	}

	public BigDecimal getValorTaxaAdm() {
		return valorTaxaAdm;
	}

	public BigDecimal getValorRemissao() {
		return valorRemissao;
	}

	public BigDecimal getValorParteSegurado() {
		return valorParteSegurado;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {
		private CobrancaSerializer cobranca;
		private BigDecimal valorPremio;
		private BigDecimal valorTaxaAdm;
		private BigDecimal valorRemissao;
		private BigDecimal valorParteSegurado;

		private Builder() {
		}

		public Builder withCobranca(CobrancaSerializer cobranca) {
			this.cobranca = cobranca;
			return this;
		}

		public Builder withValorPremio(BigDecimal valorPremio) {
			this.valorPremio = valorPremio;
			return this;
		}

		public Builder withValorTaxaAdm(BigDecimal valorTaxaAdm) {
			this.valorTaxaAdm = valorTaxaAdm;
			return this;
		}

		public Builder withValorRemissao(BigDecimal valorRemissao) {
			this.valorRemissao = valorRemissao;
			return this;
		}

		public Builder withValorParteSegurado(BigDecimal valorParteSegurado) {
			this.valorParteSegurado = valorParteSegurado;
			return this;
		}

		public PremioSerializer build() {
			return new PremioSerializer(this);
		}
	}
}

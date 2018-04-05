package br.com.syshealth.commons.serializer;

import java.math.BigDecimal;

public class CopaySerializer {

	private String descricao;

	private BigDecimal valor;

	private CopaySerializer(Builder builder) {
		this.descricao = builder.descricao;
		this.valor = builder.valor;
	}

	public CopaySerializer() {

	}

	public String getDescricao() {
		return descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	/**
	 * Creates builder to build {@link CopaySerializer}.
	 * 
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link CopaySerializer}.
	 */
	public static final class Builder {
		private String descricao;
		private BigDecimal valor;

		private Builder() {
		}

		public Builder withDescricao(String descricao) {
			this.descricao = descricao;
			return this;
		}

		public Builder withValor(BigDecimal valor) {
			this.valor = valor;
			return this;
		}

		public CopaySerializer build() {
			return new CopaySerializer(this);
		}
	}

}

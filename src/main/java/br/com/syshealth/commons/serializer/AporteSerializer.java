package br.com.syshealth.commons.serializer;

import java.math.BigDecimal;

public class AporteSerializer {

	private String descricao;

	private BigDecimal valor;

	private AporteSerializer(Builder builder) {
		this.descricao = builder.descricao;
		this.valor = builder.valor;
	}

	public AporteSerializer() {

	}

	public String getDescricao() {
		return descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	/**
	 * Creates builder to build {@link AporteSerializer}.
	 * 
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link AporteSerializer}.
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

		public AporteSerializer build() {
			return new AporteSerializer(this);
		}
	}

}

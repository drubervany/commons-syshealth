package br.com.syshealth.commons.serializer;

import java.util.Date;

public class CobrancaSerializer {

	private Date dataLancamento;
	private String descricao;

	public CobrancaSerializer() {
	}

	private CobrancaSerializer(Builder builder) {
		this.dataLancamento = builder.dataLancamento;
		this.descricao = builder.descricao;
	}

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public String getDescricao() {
		return descricao;
	}

	/**
	 * Creates builder to build {@link CobrancaSerializer}.
	 * 
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link CobrancaSerializer}.
	 */
	public static final class Builder {
		private Date dataLancamento;
		private String descricao;

		private Builder() {
		}

		public Builder withDataLancamento(Date dataLancamento) {
			this.dataLancamento = dataLancamento;
			return this;
		}

		public Builder withDescricao(String descricao) {
			this.descricao = descricao;
			return this;
		}

		public CobrancaSerializer build() {
			return new CobrancaSerializer(this);
		}
	}

}

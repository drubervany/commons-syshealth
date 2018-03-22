package br.com.syshealth.commons.serializer;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ProcedimentoSerializer implements Serializable {

	private Long codigo;
	private String nome;

	private ProcedimentoSerializer(Builder builder) {
		this.codigo = builder.codigo;
		this.nome = builder.nome;
	}

	public ProcedimentoSerializer() {

	}

	public Long getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	/**
	 * Creates builder to build {@link ProcedimentoSerializer}.
	 * 
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link ProcedimentoSerializer}.
	 */
	public static final class Builder {
		private Long codigo;
		private String nome;

		private Builder() {
		}

		public Builder withCodigo(Long codigo) {
			this.codigo = codigo;
			return this;
		}

		public Builder withNome(String nome) {
			this.nome = nome;
			return this;
		}

		public ProcedimentoSerializer build() {
			return new ProcedimentoSerializer(this);
		}
	}

}

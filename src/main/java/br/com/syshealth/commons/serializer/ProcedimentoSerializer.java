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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProcedimentoSerializer other = (ProcedimentoSerializer) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}

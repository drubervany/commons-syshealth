package br.com.syshealth.commons.serializer;

import br.com.syshealth.commons.enums.AcomodacaoEnum;

public class PlanoSerializer {

	private String codigo;

	private String nome;

	private AcomodacaoEnum acomodacao;

	private PlanoSerializer(Builder builder) {
		this.codigo = builder.codigo;
		this.nome = builder.nome;
		this.acomodacao = builder.acomodacao;
	}

	public PlanoSerializer() {
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public AcomodacaoEnum getAcomodacao() {
		return acomodacao;
	}

	public void setAcomodacao(AcomodacaoEnum acomodacao) {
		this.acomodacao = acomodacao;
	}

	/**
	 * Creates builder to build {@link PlanoSerializer}.
	 * 
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link PlanoSerializer}.
	 */
	public static final class Builder {
		private String codigo;
		private String nome;
		private AcomodacaoEnum acomodacao;

		private Builder() {
		}

		public Builder withCodigo(String codigo) {
			this.codigo = codigo;
			return this;
		}

		public Builder withNome(String nome) {
			this.nome = nome;
			return this;
		}

		public Builder withAcomodacao(AcomodacaoEnum acomodacao) {
			this.acomodacao = acomodacao;
			return this;
		}

		public PlanoSerializer build() {
			return new PlanoSerializer(this);
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
		PlanoSerializer other = (PlanoSerializer) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
}

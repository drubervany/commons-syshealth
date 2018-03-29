package br.com.syshealth.commons.serializer;

public class PrestadorSerializer {

	private Long codigo;

	private String nome;

	private String cpfCgcDoReferenciado;

	private String tipoDoReferenciado;

	private PrestadorSerializer(Builder builder) {
		this.codigo = builder.codigo;
		this.nome = builder.nome;
		this.cpfCgcDoReferenciado = builder.cpfCgcDoReferenciado;
		this.tipoDoReferenciado = builder.tipoDoReferenciado;
	}

	public PrestadorSerializer() {

	}

	public Long getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getCpfCgcDoReferenciado() {
		return cpfCgcDoReferenciado;
	}

	public String getTipoDoReferenciado() {
		return tipoDoReferenciado;
	}

	/**
	 * Creates builder to build {@link PrestadorSerializer}.
	 * 
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link PrestadorSerializer}.
	 */
	public static final class Builder {
		private Long codigo;
		private String nome;
		private String cpfCgcDoReferenciado;
		private String tipoDoReferenciado;

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

		public Builder withCpfCgcDoReferenciado(String cpfCgcDoReferenciado) {
			this.cpfCgcDoReferenciado = cpfCgcDoReferenciado;
			return this;
		}

		public Builder withTipoDoReferenciado(String tipoDoReferenciado) {
			this.tipoDoReferenciado = tipoDoReferenciado;
			return this;
		}

		public PrestadorSerializer build() {
			return new PrestadorSerializer(this);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((cpfCgcDoReferenciado == null) ? 0 : cpfCgcDoReferenciado.hashCode());
		result = prime * result + ((tipoDoReferenciado == null) ? 0 : tipoDoReferenciado.hashCode());
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
		PrestadorSerializer other = (PrestadorSerializer) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (cpfCgcDoReferenciado == null) {
			if (other.cpfCgcDoReferenciado != null)
				return false;
		} else if (!cpfCgcDoReferenciado.equals(other.cpfCgcDoReferenciado))
			return false;
		if (tipoDoReferenciado == null) {
			if (other.tipoDoReferenciado != null)
				return false;
		} else if (!tipoDoReferenciado.equals(other.tipoDoReferenciado))
			return false;
		return true;
	}
}

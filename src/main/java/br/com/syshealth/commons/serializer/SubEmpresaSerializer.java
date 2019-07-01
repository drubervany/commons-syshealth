package br.com.syshealth.commons.serializer;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;

@Entity("subEmpresa")
public class SubEmpresaSerializer {

	@Id
	private Integer codigo;
	private String nome;

	public SubEmpresaSerializer() {
	}

	private SubEmpresaSerializer(Builder builder) {
		this.codigo = builder.codigo;
		this.nome = builder.nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	/**
	 * Creates builder to build {@link SubEmpresaSerializer}.
	 * 
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link SubEmpresaSerializer}.
	 */
	public static final class Builder {
		private Integer codigo;
		private String nome;

		private Builder() {
		}

		public Builder withCodigo(Integer codigo) {
			this.codigo = codigo;
			return this;
		}

		public Builder withNome(String nome) {
			this.nome = nome;
			return this;
		}

		public SubEmpresaSerializer build() {
			return new SubEmpresaSerializer(this);
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
		SubEmpresaSerializer other = (SubEmpresaSerializer) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
}

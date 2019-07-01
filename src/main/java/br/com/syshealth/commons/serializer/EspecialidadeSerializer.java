package br.com.syshealth.commons.serializer;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;

@Entity
public class EspecialidadeSerializer {

	@Id
	private Long codigo;
	private String nome;

	private EspecialidadeSerializer(Builder builder) {
		this.codigo = builder.codigo;
		this.nome = builder.nome;
	}

	public EspecialidadeSerializer() {

	}

	public Long getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	/**
	 * Creates builder to build {@link EspecialidadeSerializer}.
	 * 
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link EspecialidadeSerializer}.
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

		public EspecialidadeSerializer build() {
			return new EspecialidadeSerializer(this);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		EspecialidadeSerializer other = (EspecialidadeSerializer) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}

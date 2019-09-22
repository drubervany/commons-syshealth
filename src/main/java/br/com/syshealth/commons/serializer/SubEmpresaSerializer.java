package br.com.syshealth.commons.serializer;

import java.io.Serializable;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;

@Entity("subEmpresa")
public class SubEmpresaSerializer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private SubEmpresaId id;

	private Integer codigo;
	private String nome;

	public SubEmpresaSerializer() {
	}

	private SubEmpresaSerializer(Builder builder) {
		this.id = new SubEmpresaId(builder.codigo, builder.empresa);
		this.codigo = builder.codigo;
		this.nome = builder.nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
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
		private EmpresaSerializer empresa;
		private Integer codigo;
		private String nome;

		private Builder() {
		}

		public Builder withEmpresa(EmpresaSerializer empresa) {
			this.empresa = empresa;
			return this;
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
}

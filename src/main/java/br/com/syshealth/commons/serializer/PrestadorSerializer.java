package br.com.syshealth.commons.serializer;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;

@Entity("prestadores")
public class PrestadorSerializer {

	@Id
	private Long id;
	
	private String nome;
	private String cpfCgcDoReferenciado;
	private String tipoDoReferenciado;
	
	private EspecialidadeSerializer especialidade;

	private PrestadorSerializer(Builder builder) {
		this.id = builder.id;
		this.nome = builder.nome;
		this.cpfCgcDoReferenciado = builder.cpfCgcDoReferenciado;
		this.tipoDoReferenciado = builder.tipoDoReferenciado;
		this.especialidade = builder.especialidade;
	}

	public PrestadorSerializer() {
	}

	
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public EspecialidadeSerializer getEspecialidade() {
		return especialidade;
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
		private Long id;
		private String nome;
		private String cpfCgcDoReferenciado;
		private String tipoDoReferenciado;
		private EspecialidadeSerializer especialidade;

		private Builder() {
		}

		public Builder withCodigo(Long codigo) {
			this.id = codigo;
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

		public Builder withEspecialidade(EspecialidadeSerializer especialidade) {
			this.especialidade = especialidade;
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
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
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

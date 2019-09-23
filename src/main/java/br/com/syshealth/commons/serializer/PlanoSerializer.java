package br.com.syshealth.commons.serializer;

import java.io.Serializable;

import br.com.syshealth.commons.enums.AcomodacaoEnum;
import br.com.syshealth.commons.enums.OperadoraEnum;
import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;

@Entity("planos")
public class PlanoSerializer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private PlanoId id;
	private String codigo;
	private String nome;
	private AcomodacaoEnum acomodacao;

	public PlanoSerializer() {
	}

	private PlanoSerializer(Builder builder) {
		this.id = new PlanoId(builder.codigo, builder.operadora);
		this.codigo = builder.codigo;
		this.nome = builder.nome;
		this.acomodacao = builder.acomodacao;
	}

	public PlanoId getId() {
		return id;
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

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {
		private OperadoraEnum operadora;
		private String codigo;
		private String nome;
		private AcomodacaoEnum acomodacao;

		private Builder() {
		}

		public Builder withOperadora(OperadoraEnum operadora) {
			this.operadora = operadora;
			return this;
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
		PlanoSerializer other = (PlanoSerializer) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}

package br.com.syshealth.commons.serializer;

import java.io.Serializable;

import br.com.syshealth.commons.enums.AcomodacaoEnum;

@SuppressWarnings("serial")
public class PlanoSerializer implements Serializable {

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

}

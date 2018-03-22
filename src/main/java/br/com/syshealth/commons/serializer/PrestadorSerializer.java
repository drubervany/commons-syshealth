package br.com.syshealth.commons.serializer;

import java.io.Serializable;
import javax.annotation.Generated;

@SuppressWarnings("serial")
public class PrestadorSerializer implements Serializable {

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

}

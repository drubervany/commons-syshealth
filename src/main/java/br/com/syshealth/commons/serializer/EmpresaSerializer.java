package br.com.syshealth.commons.serializer;

import java.math.BigDecimal;

import br.com.syshealth.commons.enums.OperadoraEnum;

public class EmpresaSerializer {

	private Integer codigo;

	private String nome;

	private Long contrato;

	private OperadoraEnum operadora;

	private BigDecimal limiteTecnico;

	private EmpresaSerializer(Builder builder) {
		this.codigo = builder.codigo;
		this.nome = builder.nome;
		this.contrato = builder.contrato;
		this.operadora = builder.operadora;
		this.limiteTecnico = builder.limiteTecnico;
	}

	public EmpresaSerializer() {
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public Long getContrato() {
		return contrato;
	}

	public OperadoraEnum getOperadora() {
		return operadora;
	}

	public BigDecimal getLimiteTecnico() {
		return limiteTecnico;
	}

	public void setLimiteTecnico(BigDecimal limiteTecnico) {
		this.limiteTecnico = limiteTecnico;
	}

	/**
	 * Creates builder to build {@link EmpresaSerializer}.
	 * 
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link EmpresaSerializer}.
	 */
	public static final class Builder {
		private Integer codigo;
		private String nome;
		private Long contrato;
		private OperadoraEnum operadora;
		private BigDecimal limiteTecnico;

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

		public Builder withContrato(Long contrato) {
			this.contrato = contrato;
			return this;
		}

		public Builder withOperadora(OperadoraEnum operadora) {
			this.operadora = operadora;
			return this;
		}

		public Builder withLimiteTecnico(BigDecimal limiteTecnico) {
			this.limiteTecnico = limiteTecnico;
			return this;
		}

		public EmpresaSerializer build() {
			return new EmpresaSerializer(this);
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
		EmpresaSerializer other = (EmpresaSerializer) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
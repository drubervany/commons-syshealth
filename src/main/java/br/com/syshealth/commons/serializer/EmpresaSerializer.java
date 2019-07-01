package br.com.syshealth.commons.serializer;

import java.math.BigDecimal;

import br.com.syshealth.commons.enums.OperadoraEnum;
import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;

@Entity("empresa")
public class EmpresaSerializer {

	@Id
	private Integer codigo;
	private String nome;
	private Long contrato;
	private OperadoraEnum operadora;
	private BigDecimal limiteTecnico;

	private SubEmpresaSerializer subEmpresa;

	public EmpresaSerializer() {
	}

	private EmpresaSerializer(Builder builder) {
		this.codigo = builder.codigo;
		this.subEmpresa = builder.subEmpresa;
		this.nome = builder.nome;
		this.contrato = builder.contrato;
		this.operadora = builder.operadora;
		this.limiteTecnico = builder.limiteTecnico;
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

	public SubEmpresaSerializer getSubEmpresa() {
		return subEmpresa;
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
		private SubEmpresaSerializer subEmpresa;
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

		public Builder withSubEmpresa(SubEmpresaSerializer subEmpresa) {
			this.subEmpresa = subEmpresa;
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
		result = prime * result + ((subEmpresa == null) ? 0 : subEmpresa.hashCode());
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
		if (subEmpresa == null) {
			if (other.subEmpresa != null)
				return false;
		} else if (!subEmpresa.equals(other.subEmpresa))
			return false;
		return true;
	}
}
package br.com.syshealth.commons.serializer;

import java.io.Serializable;
import java.math.BigDecimal;

import br.com.syshealth.commons.enums.OperadoraEnum;
import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;

@Entity("empresas")
public class EmpresaSerializer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private EmpresaId id;

	private Long codigo;
	private String nome;
	private Long contrato;

	private BigDecimal limiteTecnico;

	public EmpresaSerializer() {
	}

	public EmpresaId getId() {
		return id;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setContrato(Long contrato) {
		this.contrato = contrato;
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
		EmpresaSerializer other = (EmpresaSerializer) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	private EmpresaSerializer(Builder builder) {
		this.id = new EmpresaId(builder.codigo, builder.operadora);
		this.codigo = builder.codigo;
		this.nome = builder.nome;
		this.contrato = builder.contrato;
//		this.operadora = builder.operadora;
		this.limiteTecnico = builder.limiteTecnico;
	}

	public Long getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public Long getContrato() {
		return contrato;
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
		private Long codigo;
		private String nome;
		private Long contrato;
		private OperadoraEnum operadora;
		private BigDecimal limiteTecnico;

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
}
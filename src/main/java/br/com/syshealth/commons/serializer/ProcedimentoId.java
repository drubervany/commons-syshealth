package br.com.syshealth.commons.serializer;

import java.io.Serializable;

import br.com.syshealth.commons.enums.OperadoraEnum;

public class ProcedimentoId implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long codigo;
	private OperadoraEnum operadora;

	public ProcedimentoId() {
	}

	public ProcedimentoId(Long codigo, OperadoraEnum operadora) {
		this.codigo = codigo;
		this.operadora = operadora;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getCodigo() {
		return codigo;
	}

	public OperadoraEnum getOperadora() {
		return operadora;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((operadora == null) ? 0 : operadora.hashCode());
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
		ProcedimentoId other = (ProcedimentoId) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (operadora != other.operadora)
			return false;
		return true;
	}
}

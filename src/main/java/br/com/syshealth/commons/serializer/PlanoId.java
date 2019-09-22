package br.com.syshealth.commons.serializer;

import java.io.Serializable;

import br.com.syshealth.commons.enums.OperadoraEnum;
import dev.morphia.annotations.Property;

public class PlanoId implements Serializable {

	private static final long serialVersionUID = 1L;

	@Property("codigo")
	private String codigo;

	@Property("operadora")
	private OperadoraEnum operadora;

	public PlanoId() {
	}

	public PlanoId(String codigo, OperadoraEnum operadora) {
		this.codigo = codigo;
		this.operadora = operadora;
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
		PlanoId other = (PlanoId) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (operadora == null) {
			if (other.operadora != null)
				return false;
		} else if (!operadora.equals(other.operadora))
			return false;
		return true;
	}

}

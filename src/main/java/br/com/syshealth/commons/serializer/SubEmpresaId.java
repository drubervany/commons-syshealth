package br.com.syshealth.commons.serializer;

import java.io.Serializable;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Property;

@Entity(noClassnameStored = true)
public class SubEmpresaId implements Serializable {

	private static final long serialVersionUID = 1L;

	@Property("codigo")
	private Integer codigo;

	@Property("empresa")
	private Long empresa;

	public SubEmpresaId() {
	}

	public SubEmpresaId(Integer codigo, EmpresaSerializer empresa) {
		this.codigo = codigo;
		this.empresa = empresa.getCodigo();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
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
		SubEmpresaId other = (SubEmpresaId) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		return true;
	}

}

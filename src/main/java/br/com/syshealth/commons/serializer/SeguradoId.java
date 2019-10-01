package br.com.syshealth.commons.serializer;

import java.io.Serializable;

import dev.morphia.annotations.Property;

public class SeguradoId implements Serializable {

	private static final long serialVersionUID = 1L;

	@Property("codigo")
	private Long codigo;
	@Property("empresa")
	private Long empresa;
	@Property("subEmpresa")
	private Integer subEmpresa;

	public SeguradoId() {
	}

	public SeguradoId(Long codigo, EmpresaSerializer empresa, SubEmpresaSerializer subEmpresa) {
		this.codigo = codigo;
		this.empresa = empresa.getCodigo();
		this.subEmpresa = subEmpresa.getCodigo();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
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
		SeguradoId other = (SeguradoId) obj;
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
		if (subEmpresa == null) {
			if (other.subEmpresa != null)
				return false;
		} else if (!subEmpresa.equals(other.subEmpresa))
			return false;
		return true;
	}
}

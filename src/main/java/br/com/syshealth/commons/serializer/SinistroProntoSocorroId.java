package br.com.syshealth.commons.serializer;

import java.io.Serializable;
import java.util.Date;

public class SinistroProntoSocorroId implements Serializable {

	private static final long serialVersionUID = 1L;

	private SeguradoId segurado;
	private Date dtAtendimento;

	public SinistroProntoSocorroId() {
	}

	public SinistroProntoSocorroId(SeguradoSerializer segurado, Date dtAtendimento) {
		this.segurado = segurado.getId();
		this.dtAtendimento = dtAtendimento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public SeguradoId getSegurado() {
		return segurado;
	}

	public Date getDtAtendimento() {
		return dtAtendimento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dtAtendimento == null) ? 0 : dtAtendimento.hashCode());
		result = prime * result + ((segurado == null) ? 0 : segurado.hashCode());
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
		SinistroProntoSocorroId other = (SinistroProntoSocorroId) obj;
		if (dtAtendimento == null) {
			if (other.dtAtendimento != null)
				return false;
		} else if (!dtAtendimento.equals(other.dtAtendimento))
			return false;
		if (segurado == null) {
			if (other.segurado != null)
				return false;
		} else if (!segurado.equals(other.segurado))
			return false;
		return true;
	}
}

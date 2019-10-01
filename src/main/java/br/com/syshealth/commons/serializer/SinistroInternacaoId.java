package br.com.syshealth.commons.serializer;

import java.io.Serializable;
import java.util.Date;

public class SinistroInternacaoId implements Serializable {

	private static final long serialVersionUID = 1L;

	private SeguradoId segurado;
	private Date dataAtendimento;
	private Date dataAlta;

	public SinistroInternacaoId() {
	}

	public SinistroInternacaoId(SeguradoSerializer segurado, Date dataAtendimento, Date dataAlta) {
		this.segurado = segurado.getId();
		this.dataAtendimento = dataAtendimento;
		this.dataAlta = dataAlta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataAtendimento == null) ? 0 : dataAtendimento.hashCode());
		result = prime * result + ((dataAlta == null) ? 0 : dataAlta.hashCode());
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
		SinistroInternacaoId other = (SinistroInternacaoId) obj;
		if (dataAtendimento == null) {
			if (other.dataAtendimento != null)
				return false;
		} else if (!dataAtendimento.equals(other.dataAtendimento))
			return false;
		if (dataAlta == null) {
			if (other.dataAlta != null)
				return false;
		} else if (!dataAlta.equals(other.dataAlta))
			return false;
		if (segurado == null) {
			if (other.segurado != null)
				return false;
		} else if (!segurado.equals(other.segurado))
			return false;
		return true;
	}

}

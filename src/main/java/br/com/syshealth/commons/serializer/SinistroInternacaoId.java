package br.com.syshealth.commons.serializer;

import java.io.Serializable;
import java.util.Date;

public class SinistroInternacaoId implements Serializable {

	private static final long serialVersionUID = 1L;

	private SeguradoId segurado;
	private Date dtAtendimentoPrimeiro;
	private Date dtAtendimentoUltimo;

	public SinistroInternacaoId() {
	}

	public SinistroInternacaoId(SeguradoSerializer segurado, Date dtAtendimentoPrimeiro, Date dtAtendimentoUltimo) {
		this.segurado = segurado.getId();
		this.dtAtendimentoPrimeiro = dtAtendimentoPrimeiro;
		this.dtAtendimentoUltimo = dtAtendimentoUltimo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dtAtendimentoPrimeiro == null) ? 0 : dtAtendimentoPrimeiro.hashCode());
		result = prime * result + ((dtAtendimentoUltimo == null) ? 0 : dtAtendimentoUltimo.hashCode());
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
		if (dtAtendimentoPrimeiro == null) {
			if (other.dtAtendimentoPrimeiro != null)
				return false;
		} else if (!dtAtendimentoPrimeiro.equals(other.dtAtendimentoPrimeiro))
			return false;
		if (dtAtendimentoUltimo == null) {
			if (other.dtAtendimentoUltimo != null)
				return false;
		} else if (!dtAtendimentoUltimo.equals(other.dtAtendimentoUltimo))
			return false;
		if (segurado == null) {
			if (other.segurado != null)
				return false;
		} else if (!segurado.equals(other.segurado))
			return false;
		return true;
	}

}

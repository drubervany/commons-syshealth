package br.com.syshealth.commons.model;

public class Prestador {

	private Long codigo;

	private String nome;

	private String cpfCgcDoReferenciado;

	private String tipoDoReferenciado;

	public Prestador() {
	}

	public Long getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getCpfCgcDoReferenciado() {
		return cpfCgcDoReferenciado;
	}

	public String getTipoDoReferenciado() {
		return tipoDoReferenciado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((cpfCgcDoReferenciado == null) ? 0 : cpfCgcDoReferenciado.hashCode());
		result = prime * result + ((tipoDoReferenciado == null) ? 0 : tipoDoReferenciado.hashCode());
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
		Prestador other = (Prestador) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (cpfCgcDoReferenciado == null) {
			if (other.cpfCgcDoReferenciado != null)
				return false;
		} else if (!cpfCgcDoReferenciado.equals(other.cpfCgcDoReferenciado))
			return false;
		if (tipoDoReferenciado == null) {
			if (other.tipoDoReferenciado != null)
				return false;
		} else if (!tipoDoReferenciado.equals(other.tipoDoReferenciado))
			return false;
		return true;
	}
}

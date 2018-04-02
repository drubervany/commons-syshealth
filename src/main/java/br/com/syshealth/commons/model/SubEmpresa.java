package br.com.syshealth.commons.model;

public class SubEmpresa {

	private Long codigo;

	private String nome;

	private Copay copay;

	private Aporte aporte;

	private Empresa empresa;

	public SubEmpresa() {
	}

	public Long getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public Aporte getAporte() {
		return aporte;
	}

	public Copay getCopay() {
		return copay;
	}

	public Empresa getEmpresa() {
		return empresa;
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
		SubEmpresa other = (SubEmpresa) obj;
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

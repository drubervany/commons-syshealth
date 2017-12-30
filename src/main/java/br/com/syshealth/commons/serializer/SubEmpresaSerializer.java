package br.com.syshealth.commons.serializer;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SubEmpresaSerializer implements Serializable {

	private Long codigo;

	private String nome;

	private CopaySerializer copay;

	private AporteSerializer aporte;

	public SubEmpresaSerializer(Long codigo, String nome, CopaySerializer copay, AporteSerializer aporte) {

		this.codigo = codigo;
		this.nome = nome;
		this.copay = copay;
		this.aporte = aporte;

	}

	public Long getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		SubEmpresaSerializer other = (SubEmpresaSerializer) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public AporteSerializer getAporte() {
		return aporte;
	}

	public CopaySerializer getCopay() {
		return copay;
	}

}

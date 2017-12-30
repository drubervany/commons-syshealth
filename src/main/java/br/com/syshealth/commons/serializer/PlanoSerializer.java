package br.com.syshealth.commons.serializer;

import java.io.Serializable;

import br.com.syshealth.commons.enums.AcomodacaoEnum;

@SuppressWarnings("serial")
public class PlanoSerializer implements Serializable {

	private String codigo;

	private String nome;

	private AcomodacaoEnum acomodacao;

	public PlanoSerializer() {

	}

	public String getCodigo() {
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
		PlanoSerializer other = (PlanoSerializer) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	public AcomodacaoEnum getAcomodacao() {
		return acomodacao;
	}

	public void setAcomodacao(AcomodacaoEnum acomodacao) {
		this.acomodacao = acomodacao;
	}

}

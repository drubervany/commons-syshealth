package br.com.syshealth.commons.serializer;

import java.io.Serializable;

import br.com.syshealth.commons.enums.OrigemArquivoEnum;
import dev.morphia.annotations.Entity;

@Entity(noClassnameStored = true)
public class ArquivoId implements Serializable {

	private static final long serialVersionUID = 1L;

	private OrigemArquivoEnum origem;
	private Long apolice;
	private Integer competencia;

	public ArquivoId() {
	}
	
	public ArquivoId(OrigemArquivoEnum origem, Long apolice, Integer competencia) {
		this.origem = origem;
		this.apolice = apolice;
		this.competencia = competencia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((competencia == null) ? 0 : competencia.hashCode());
		result = prime * result + ((apolice == null) ? 0 : apolice.hashCode());
		result = prime * result + ((origem == null) ? 0 : origem.hashCode());
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
		ArquivoId other = (ArquivoId) obj;
		if (competencia == null) {
			if (other.competencia != null)
				return false;
		} else if (!competencia.equals(other.competencia))
			return false;
		if (apolice == null) {
			if (other.apolice != null)
				return false;
		} else if (!apolice.equals(other.apolice))
			return false;
		if (origem != other.origem)
			return false;
		return true;
	}

}

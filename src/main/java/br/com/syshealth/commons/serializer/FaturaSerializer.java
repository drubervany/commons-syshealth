package br.com.syshealth.commons.serializer;

import java.util.List;

public class FaturaSerializer {

	private Integer competencia;
	private List<PremioSerializer> premios;

	private FaturaSerializer(Builder builder) {
		this.competencia = builder.competencia;
		this.premios = builder.premios;
	}

	public FaturaSerializer() {

	}

	public Integer getCompetencia() {
		return competencia;
	}

	public List<PremioSerializer> getPremios() {
		return premios;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((competencia == null) ? 0 : competencia.hashCode());
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
		FaturaSerializer other = (FaturaSerializer) obj;
		if (competencia == null) {
			if (other.competencia != null)
				return false;
		} else if (!competencia.equals(other.competencia))
			return false;
		return true;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {
		private Integer competencia;
		private List<PremioSerializer> premios;

		private Builder() {
		}

		public Builder withCompetencia(Integer competencia) {
			this.competencia = competencia;
			return this;
		}

		public Builder withPremios(List<PremioSerializer> premios) {
			this.premios = premios;
			return this;
		}

		public FaturaSerializer build() {
			return new FaturaSerializer(this);
		}
	}

}

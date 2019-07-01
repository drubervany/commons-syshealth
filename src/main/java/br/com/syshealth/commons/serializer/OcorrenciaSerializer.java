package br.com.syshealth.commons.serializer;

import java.util.List;

public class OcorrenciaSerializer {

	private Integer competencia;
	private List<SinistroSerializer> sinistros;

	private OcorrenciaSerializer(Builder builder) {
		this.competencia = builder.competencia;
		this.sinistros = builder.sinistros;
	}

	public OcorrenciaSerializer() {
	}

	public Integer getCompetencia() {
		return competencia;
	}

	public static Builder builder() {
		return new Builder();
	}

	public List<SinistroSerializer> getSinistros() {
		return sinistros;
	}

	public static final class Builder {
		private Integer competencia;
		private List<SinistroSerializer> sinistros;

		private Builder() {
		}

		public Builder withCompetencia(Integer competencia) {
			this.competencia = competencia;
			return this;
		}

		public Builder withSinistros(List<SinistroSerializer> sinistros) {
			this.sinistros = sinistros;
			return this;
		}

		public OcorrenciaSerializer build() {
			return new OcorrenciaSerializer(this);
		}

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
		OcorrenciaSerializer other = (OcorrenciaSerializer) obj;
		if (competencia == null) {
			if (other.competencia != null)
				return false;
		} else if (!competencia.equals(other.competencia))
			return false;
		return true;
	}
}

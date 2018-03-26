package br.com.syshealth.commons.serializer;

import java.io.Serializable;

import com.google.gson.GsonBuilder;

import br.com.syshealth.commons.utils.Sistema;

@SuppressWarnings("serial")
public class CadastroSerializer implements Serializable {

	private Integer competencia;

	private EmpresaSerializer empresa;

	private SubEmpresaSerializer subEmpresa;

	private SeguradoSerializer segurado;

	private CadastroSerializer(Builder builder) {
		this.competencia = builder.competencia;
		this.empresa = builder.empresa;
		this.subEmpresa = builder.subEmpresa;
		this.segurado = builder.segurado;
	}

	public CadastroSerializer() {
	}

	public EmpresaSerializer getEmpresa() {
		return empresa;
	}

	public SeguradoSerializer getSegurado() {
		return segurado;
	}

	public SubEmpresaSerializer getSubEmpresa() {
		return subEmpresa;
	}

	public Integer getCompetencia() {
		return competencia;
	}

	public String toJson() {
		return new GsonBuilder().setDateFormat(Sistema.FORMATO_DATA.getValue()).create().toJson(this);
	}

	/**
	 * Creates builder to build {@link CadastroSerializer}.
	 * 
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link CadastroSerializer}.
	 */
	public static final class Builder {
		private Integer competencia;
		private EmpresaSerializer empresa;
		private SubEmpresaSerializer subEmpresa;
		private SeguradoSerializer segurado;

		private Builder() {
		}

		public Builder withCompetencia(Integer competencia) {
			this.competencia = competencia;
			return this;
		}

		public Builder withEmpresa(EmpresaSerializer empresa) {
			this.empresa = empresa;
			return this;
		}

		public Builder withSubEmpresa(SubEmpresaSerializer subEmpresa) {
			this.subEmpresa = subEmpresa;
			return this;
		}

		public Builder withSegurado(SeguradoSerializer segurado) {
			this.segurado = segurado;
			return this;
		}

		public CadastroSerializer build() {
			return new CadastroSerializer(this);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((competencia == null) ? 0 : competencia.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result + ((segurado == null) ? 0 : segurado.hashCode());
		result = prime * result + ((subEmpresa == null) ? 0 : subEmpresa.hashCode());
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
		CadastroSerializer other = (CadastroSerializer) obj;
		if (competencia == null) {
			if (other.competencia != null)
				return false;
		} else if (!competencia.equals(other.competencia))
			return false;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		if (segurado == null) {
			if (other.segurado != null)
				return false;
		} else if (!segurado.equals(other.segurado))
			return false;
		if (subEmpresa == null) {
			if (other.subEmpresa != null)
				return false;
		} else if (!subEmpresa.equals(other.subEmpresa))
			return false;
		return true;
	}
	
	
}

package br.com.syshealth.commons.serializer;

import org.bson.types.ObjectId;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import dev.morphia.annotations.Reference;

@Entity("premios")
public class PremioSerializer {

	@Id
	private ObjectId id;

	private Integer competencia;

	@Reference
	private SeguradoSerializer segurado;

	private Double valorPremio;
	private Double valorTaxaAdm;
	private Double valorRemissao;
	private Double valorParteSegurado;

	private PremioSerializer(Builder builder) {
		this.competencia = builder.competencia;
		this.segurado = builder.segurado;
		this.valorPremio = builder.valorPremio;
		this.valorTaxaAdm = builder.valorTaxaAdm;
		this.valorRemissao = builder.valorRemissao;
		this.valorParteSegurado = builder.valorParteSegurado;
	}

	public PremioSerializer() {
	}

	public Double getValorPremio() {
		return valorPremio;
	}

	public Double getValorTaxaAdm() {
		return valorTaxaAdm;
	}

	public Double getValorRemissao() {
		return valorRemissao;
	}

	public Double getValorParteSegurado() {
		return valorParteSegurado;
	}

	public SeguradoSerializer getSegurado() {
		return segurado;
	}

	public Integer getCompetencia() {
		return competencia;
	}

	public static Builder builder() {
		return new Builder();
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public void setCompetencia(Integer competencia) {
		this.competencia = competencia;
	}

	public void setSegurado(SeguradoSerializer segurado) {
		this.segurado = segurado;
	}

	public void setValorPremio(Double valorPremio) {
		this.valorPremio = valorPremio;
	}

	public void setValorTaxaAdm(Double valorTaxaAdm) {
		this.valorTaxaAdm = valorTaxaAdm;
	}

	public void setValorRemissao(Double valorRemissao) {
		this.valorRemissao = valorRemissao;
	}

	public void setValorParteSegurado(Double valorParteSegurado) {
		this.valorParteSegurado = valorParteSegurado;
	}

	public static final class Builder {

		private Integer competencia;
		private SeguradoSerializer segurado;
		private Double valorPremio;
		private Double valorTaxaAdm;
		private Double valorRemissao;
		private Double valorParteSegurado;

		private Builder() {
		}

		public Builder withValorPremio(Double valorPremio) {
			this.valorPremio = valorPremio;
			return this;
		}

		public Builder withValorTaxaAdm(Double valorTaxaAdm) {
			this.valorTaxaAdm = valorTaxaAdm;
			return this;
		}

		public Builder withValorRemissao(Double valorRemissao) {
			this.valorRemissao = valorRemissao;
			return this;
		}

		public Builder withValorParteSegurado(Double valorParteSegurado) {
			this.valorParteSegurado = valorParteSegurado;
			return this;
		}

		public Builder withSegurado(SeguradoSerializer segurado) {
			this.segurado = segurado;
			return this;
		}

		public Builder withCompetencia(Integer competencia) {
			this.competencia = competencia;
			return this;
		}

		public PremioSerializer build() {
			return new PremioSerializer(this);
		}
	}
}

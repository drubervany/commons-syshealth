package br.com.syshealth.commons.serializer;

import java.io.Serializable;
import java.math.BigDecimal;

import com.google.gson.GsonBuilder;

import br.com.syshealth.commons.utils.Sistema;

@SuppressWarnings("serial")
public class PremioSerializer implements Serializable {

	private Integer competencia;

	private EmpresaSerializer empresa;

	private SubEmpresaSerializer subEmpresa;

	private SeguradoSerializer segurado;

	private BigDecimal valorPremio;

	private BigDecimal valorTaxaAdm;

	private BigDecimal valorRemissao;

	private BigDecimal valorParteSegurado;

	private PremioSerializer(Builder builder) {
		this.competencia = builder.competencia;
		this.empresa = builder.empresa;
		this.subEmpresa = builder.subEmpresa;
		this.segurado = builder.segurado;
		this.valorPremio = builder.valorPremio;
		this.valorTaxaAdm = builder.valorTaxaAdm;
		this.valorRemissao = builder.valorRemissao;
		this.valorParteSegurado = builder.valorParteSegurado;
	}

	public PremioSerializer() {

	}

	public Integer getCompetencia() {
		return competencia;
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

	public BigDecimal getValorPremio() {
		return valorPremio;
	}

	public BigDecimal getValorTaxaAdm() {
		return valorTaxaAdm;
	}

	public BigDecimal getValorRemissao() {
		return valorRemissao;
	}

	public BigDecimal getValorParteSegurado() {
		return valorParteSegurado;
	}

	public String toJson() {
		return new GsonBuilder().setDateFormat(Sistema.FORMATO_DATA.getValue()).create().toJson(this);
	}

	/**
	 * Creates builder to build {@link PremioSerializer}.
	 * 
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link PremioSerializer}.
	 */
	public static final class Builder {
		private Integer competencia;
		private EmpresaSerializer empresa;
		private SubEmpresaSerializer subEmpresa;
		private SeguradoSerializer segurado;
		private BigDecimal valorPremio;
		private BigDecimal valorTaxaAdm;
		private BigDecimal valorRemissao;
		private BigDecimal valorParteSegurado;

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

		public Builder withValorPremio(BigDecimal valorPremio) {
			this.valorPremio = valorPremio;
			return this;
		}

		public Builder withValorTaxaAdm(BigDecimal valorTaxaAdm) {
			this.valorTaxaAdm = valorTaxaAdm;
			return this;
		}

		public Builder withValorRemissao(BigDecimal valorRemissao) {
			this.valorRemissao = valorRemissao;
			return this;
		}

		public Builder withValorParteSegurado(BigDecimal valorParteSegurado) {
			this.valorParteSegurado = valorParteSegurado;
			return this;
		}

		public PremioSerializer build() {
			return new PremioSerializer(this);
		}
	}

}
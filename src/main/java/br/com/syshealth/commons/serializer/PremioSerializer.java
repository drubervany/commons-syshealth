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

	public PremioSerializer() {

	}

	public PremioSerializer(Integer competencia, EmpresaSerializer empresa, SubEmpresaSerializer subEmpresa,
			SeguradoSerializer segurado, BigDecimal valorPremio, BigDecimal valorTaxaAdm, BigDecimal valorRemissao,
			BigDecimal valorParteSegurado) {
		super();
		this.competencia = competencia;
		this.empresa = empresa;
		this.subEmpresa = subEmpresa;
		this.segurado = segurado;
		this.valorPremio = valorPremio;
		this.valorTaxaAdm = valorTaxaAdm;
		this.valorRemissao = valorRemissao;
		this.valorParteSegurado = valorParteSegurado;
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

	public static PremioSerializer fromJson(String json) {
		return new GsonBuilder().setDateFormat(Sistema.FORMATO_DATA.getValue()).create().fromJson(json,
				PremioSerializer.class);
	}

}

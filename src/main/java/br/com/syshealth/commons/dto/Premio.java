package br.com.syshealth.commons.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import com.google.gson.GsonBuilder;

import br.com.syshealth.commons.utils.Sistema;

@SuppressWarnings("serial")
public class Premio implements Serializable {

    private final Integer competencia;

    private final Empresa empresa;

    private final SubEmpresa subEmpresa;

    private final Segurado segurado;

    private final BigDecimal valorPremio;

    private final BigDecimal valorTaxaAdm;

    private final BigDecimal valorRemissao;

    private final BigDecimal valorParteSegurado;

    public Premio(Integer competencia, Empresa empresa, SubEmpresa subEmpresa, Segurado segurado, BigDecimal valorPremio,
            BigDecimal valorTaxaAdm, BigDecimal valorRemissao, BigDecimal valorParteSegurado) {
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

    public Empresa getEmpresa() {
        return empresa;
    }

    public Segurado getSegurado() {
        return segurado;
    }

    public SubEmpresa getSubEmpresa() {
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

    public static Premio fromJson(String json) {
        return new GsonBuilder().setDateFormat(Sistema.FORMATO_DATA.getValue()).create().fromJson(json, Premio.class);
    }

}

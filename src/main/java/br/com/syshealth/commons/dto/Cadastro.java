package br.com.syshealth.commons.dto;

import java.io.Serializable;

import com.google.gson.GsonBuilder;

import br.com.syshealth.commons.utils.Sistema;

@SuppressWarnings("serial")
public class Cadastro implements Serializable {

    private final Integer competencia;

    private final Empresa empresa;

    private final SubEmpresa subEmpresa;

    private final Segurado segurado;

    public Integer getCompetencia() {
        return competencia;
    }

    public Cadastro(Integer competencia, Empresa empresa, SubEmpresa subEmpresa, Segurado segurado) {
        super();
        this.competencia = competencia;
        this.empresa = empresa;
        this.subEmpresa = subEmpresa;
        this.segurado = segurado;
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

    public String toJson() {
        return new GsonBuilder().setDateFormat(Sistema.FORMATO_DATA.getValue()).create().toJson(this);
    }

    public static Cadastro fromJson(String json) {
        return new GsonBuilder().setDateFormat(Sistema.FORMATO_DATA.getValue()).create().fromJson(json, Cadastro.class);
    }
}

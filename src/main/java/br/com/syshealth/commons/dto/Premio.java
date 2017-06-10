package br.com.syshealth.commons.dto;

import java.io.Serializable;

import com.google.gson.GsonBuilder;

import br.com.syshealth.commons.utils.Sistema;

@SuppressWarnings("serial")
public class Premio implements Serializable {

    private final Integer competencia;

    private final EmpresaPremio empresa;

    public Premio(Integer competencia, EmpresaPremio empresa) {
        super();
        this.competencia = competencia;
        this.empresa = empresa;

    }

    public Integer getCompetencia() {
        return competencia;
    }

    public EmpresaPremio getEmpresa() {
        return empresa;
    }

    public String toJson() {
        return new GsonBuilder().setDateFormat(Sistema.FORMATO_DATA.getValue()).create().toJson(this);
    }

    public static Premio fromJson(String json) {
        return new GsonBuilder().setDateFormat(Sistema.FORMATO_DATA.getValue()).create().fromJson(json, Premio.class);
    }
}

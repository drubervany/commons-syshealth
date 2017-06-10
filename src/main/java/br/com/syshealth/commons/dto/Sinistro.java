package br.com.syshealth.commons.dto;

import java.io.Serializable;

import com.google.gson.GsonBuilder;

import br.com.syshealth.commons.utils.Sistema;

@SuppressWarnings("serial")
public class Sinistro implements Serializable {

    private final Integer competencia;

    private final EmpresaSinistro empresa;

    public Sinistro(Integer competencia, EmpresaSinistro empresa) {
        super();
        this.competencia = competencia;
        this.empresa = empresa;
    }

    public Integer getCompetencia() {
        return competencia;
    }

    public EmpresaSinistro getEmpresa() {
        return empresa;
    }

    public String toJson() {
        return new GsonBuilder().setDateFormat(Sistema.FORMATO_DATA.getValue()).create().toJson(this);
    }

    public static Sinistro fromJson(String json) {
        return new GsonBuilder().setDateFormat(Sistema.FORMATO_DATA.getValue()).create().fromJson(json, Sinistro.class);
    }

}

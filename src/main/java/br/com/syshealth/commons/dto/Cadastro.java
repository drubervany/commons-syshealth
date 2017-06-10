package br.com.syshealth.commons.dto;

import java.io.Serializable;

import com.google.gson.GsonBuilder;

import br.com.syshealth.commons.utils.Sistema;

@SuppressWarnings("serial")
public class Cadastro implements Serializable {

    private final Integer competencia;

    private final EmpresaCadastro empresa;

    public Cadastro(Integer competencia, EmpresaCadastro empresa) {
        super();
        this.competencia = competencia;
        this.empresa = empresa;
    }

    public Integer getCompetencia() {
        return competencia;
    }

    public EmpresaCadastro getEmpresa() {
        return empresa;
    }

    public String toJson() {
        return new GsonBuilder().setDateFormat(Sistema.FORMATO_DATA.getValue()).create().toJson(this);
    }

    public static Cadastro fromJson(String json) {
        return new GsonBuilder().setDateFormat(Sistema.FORMATO_DATA.getValue()).create().fromJson(json, Cadastro.class);
    }
}

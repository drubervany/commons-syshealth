package br.com.syshealth.commons.dto;

import java.io.Serializable;

import br.com.syshealth.commons.enums.OperadoraEnum;

@SuppressWarnings("serial")
public class Empresa implements Serializable {

    private final Integer codigo;

    private final String nome;

    private final Long contrato;

    private final OperadoraEnum operadora;

    public Empresa(Integer codigo, String nome, Long contrato, OperadoraEnum operadora) {
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.contrato = contrato;
        this.operadora = operadora;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Long getContrato() {
        return contrato;
    }

    public OperadoraEnum getOperadora() {
        return operadora;
    }
}
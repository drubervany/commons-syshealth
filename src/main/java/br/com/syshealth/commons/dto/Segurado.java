package br.com.syshealth.commons.dto;

import java.util.Date;

import com.google.gson.GsonBuilder;

import br.com.syshealth.commons.enums.EstadoCivilEnum;
import br.com.syshealth.commons.enums.GrauParentescoEnum;
import br.com.syshealth.commons.enums.SexoEnum;
import br.com.syshealth.commons.enums.TipoBeneficiarioEnum;
import br.com.syshealth.commons.utils.Sistema;

public class Segurado {

    private final Long codigo;

    private final String carteirinha;

    private final String nome;

    private final String cpf;

    private final Date dataNascimento;

    private final Date dataInicio;

    private final Date dataFim;

    private final TipoBeneficiarioEnum tipoBeneficiario;

    private final SexoEnum sexo;

    private final GrauParentescoEnum parentesco;

    private final EstadoCivilEnum estadoCivil;

    private final Integer idade;

    private final Plano plano;

    public Segurado(Long codigo, String carteirinha, String nome, String cpf, Date dataNascimento, Date dataInicio, Date dataFim,
            TipoBeneficiarioEnum tipoBeneficiario, SexoEnum sexo, GrauParentescoEnum parentesco, EstadoCivilEnum estadoCivil,
            Integer idade, Plano plano) {
        super();
        this.codigo = codigo;
        this.carteirinha = carteirinha;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.tipoBeneficiario = tipoBeneficiario;
        this.sexo = sexo;
        this.parentesco = parentesco;
        this.estadoCivil = estadoCivil;
        this.idade = idade;
        this.plano = plano;
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getCarteirinha() {
        return carteirinha;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public TipoBeneficiarioEnum getTipoBeneficiario() {
        return tipoBeneficiario;
    }

    public SexoEnum getSexo() {
        return sexo;
    }

    public GrauParentescoEnum getParentesco() {
        return parentesco;
    }

    public EstadoCivilEnum getEstadoCivil() {
        return estadoCivil;
    }

    public Integer getIdade() {
        return idade;
    }

    public Plano getPlano() {
        return plano;
    }

    public String toJson() {
        return new GsonBuilder().setDateFormat(Sistema.FORMATO_DATA.getValue()).create().toJson(this);
    }

    public static Segurado fromJson(String json) {
        return new GsonBuilder().setDateFormat(Sistema.FORMATO_DATA.getValue()).create().fromJson(json, Segurado.class);
    }

}

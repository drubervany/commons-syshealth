package br.com.syshealth.commons.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.google.gson.GsonBuilder;

import br.com.syshealth.commons.enums.RedeReembolsoEnum;
import br.com.syshealth.commons.enums.SimNaoEnum;
import br.com.syshealth.commons.utils.Sistema;

@SuppressWarnings("serial")
public class Sinistro implements Serializable {

    private final Integer competencia;

    private final Empresa empresa;

    private final SubEmpresa subEmpresa;

    private final Segurado segurado;

    private final String conta;

    private final Date dataAtendimento;

    private final Date dataPagamento;

    private final String grupoDespesa;

    private final Procedimento procedimento;

    private final Integer qtdeProcedimento;

    private final Prestador prestador;

    private final BigDecimal valorSinistro;

    private final BigDecimal valorRecibo;

    private final BigDecimal valorPago;

    private final BigDecimal valorInssIssFajtr;

    private final BigDecimal valorInssIssMoeda;

    private final String numDocumento;

    private final RedeReembolsoEnum redeReembolso;

    private final SimNaoEnum internado;

    private final String localAtendimento;

    private final String crmSolicitante;

    public Sinistro(Integer competencia, Empresa empresa, SubEmpresa subEmpresa, Segurado segurado, String conta, Date dataAtendimento,
            Date dataPagamento, String grupoDespesa, Procedimento procedimento, Integer qtdeProcedimento, Prestador prestador,
            BigDecimal valorSinistro, BigDecimal valorRecibo, BigDecimal valorPago, BigDecimal valorInssIssFajtr,
            BigDecimal valorInssIssMoeda, String numDocumento, RedeReembolsoEnum redeReembolso, SimNaoEnum internado,
            String localAtendimento, String crmSolicitante) {
        super();
        this.competencia = competencia;
        this.empresa = empresa;
        this.subEmpresa = subEmpresa;
        this.segurado = segurado;
        this.conta = conta;
        this.dataAtendimento = dataAtendimento;
        this.dataPagamento = dataPagamento;
        this.grupoDespesa = grupoDespesa;
        this.procedimento = procedimento;
        this.qtdeProcedimento = qtdeProcedimento;
        this.prestador = prestador;
        this.valorSinistro = valorSinistro;
        this.valorRecibo = valorRecibo;
        this.valorPago = valorPago;
        this.valorInssIssFajtr = valorInssIssFajtr;
        this.valorInssIssMoeda = valorInssIssMoeda;
        this.numDocumento = numDocumento;
        this.redeReembolso = redeReembolso;
        this.internado = internado;
        this.localAtendimento = localAtendimento;
        this.crmSolicitante = crmSolicitante;
    }

    public Integer getCompetencia() {
        return competencia;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public SubEmpresa getSubEmpresa() {
        return subEmpresa;
    }

    public Segurado getSegurado() {
        return segurado;
    }

    public String getConta() {
        return conta;
    }

    public Date getDataAtendimento() {
        return dataAtendimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public String getGrupoDespesa() {
        return grupoDespesa;
    }

    public Procedimento getProcedimento() {
        return procedimento;
    }

    public Integer getQtdeProcedimento() {
        return qtdeProcedimento;
    }

    public Prestador getPrestador() {
        return prestador;
    }

    public BigDecimal getValorSinistro() {
        return valorSinistro;
    }

    public BigDecimal getValorRecibo() {
        return valorRecibo;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public BigDecimal getValorInssIssFajtr() {
        return valorInssIssFajtr;
    }

    public BigDecimal getValorInssIssMoeda() {
        return valorInssIssMoeda;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public RedeReembolsoEnum getRedeReembolso() {
        return redeReembolso;
    }

    public SimNaoEnum getInternado() {
        return internado;
    }

    public String getLocalAtendimento() {
        return localAtendimento;
    }

    public String getCrmSolicitante() {
        return crmSolicitante;
    }

    public String toJson() {
        return new GsonBuilder().setDateFormat(Sistema.FORMATO_DATA.getValue()).create().toJson(this);
    }

    public static Sinistro fromJson(String json) {
        return new GsonBuilder().setDateFormat(Sistema.FORMATO_DATA.getValue()).create().fromJson(json, Sinistro.class);
    }

}

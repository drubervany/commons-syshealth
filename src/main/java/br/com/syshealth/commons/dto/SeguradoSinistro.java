package br.com.syshealth.commons.dto;

import java.math.BigDecimal;
import java.util.Date;

import br.com.syshealth.commons.enums.EstadoCivilEnum;
import br.com.syshealth.commons.enums.GrauParentescoEnum;
import br.com.syshealth.commons.enums.RedeReembolsoEnum;
import br.com.syshealth.commons.enums.SexoEnum;
import br.com.syshealth.commons.enums.SimNaoEnum;
import br.com.syshealth.commons.enums.TipoBeneficiarioEnum;

public class SeguradoSinistro extends Segurado {

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

    public SeguradoSinistro(Long codigo, String carteirinha, String nome, String cpf,
            Date dataNascimento, Date dataInicio, Date dataFim,
            TipoBeneficiarioEnum tipoBeneficiario, SexoEnum sexo, GrauParentescoEnum parentesco, EstadoCivilEnum estadoCivil, Integer idade,
            Plano plano, String conta, Date dataAtendimento, Date dataPagamento, String grupoDespesa, Procedimento procedimento,
            Integer qtdeProcedimento, Prestador prestador, BigDecimal valorSinistro, BigDecimal valorRecibo, BigDecimal valorPago,
            BigDecimal valorInssIssFajtr, BigDecimal valorInssIssMoeda, String numDocumento, RedeReembolsoEnum redeReembolso,
            SimNaoEnum internado,
            String localAtendimento, String crmSolicitante) {

        super(codigo, carteirinha, nome, cpf, dataNascimento, dataInicio, dataFim, tipoBeneficiario, sexo, parentesco, estadoCivil, idade,
                plano);
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

    public SimNaoEnum getInternado() {
        return internado;
    }

    public String getLocalAtendimento() {
        return localAtendimento;
    }

    public String getCrmSolicitante() {
        return crmSolicitante;
    }

    public RedeReembolsoEnum getRedeReembolso() {
        return redeReembolso;
    }

}

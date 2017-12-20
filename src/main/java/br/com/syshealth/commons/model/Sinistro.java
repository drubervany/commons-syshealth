package br.com.syshealth.commons.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.google.gson.GsonBuilder;

import br.com.syshealth.commons.enums.RedeReembolsoEnum;
import br.com.syshealth.commons.enums.SimNaoEnum;
import br.com.syshealth.commons.utils.Sistema;

@SuppressWarnings("serial")
public class Sinistro implements Serializable {

	private Integer competencia;

	private Empresa empresa;

	private SubEmpresa subEmpresa;

	private Segurado segurado;

	private String conta;

	private Date dataAtendimento;

	private Date dataPagamento;

	private String grupoDespesa;

	private Procedimento procedimento;

	private Integer qtdeProcedimento;

	private Prestador prestador;

	private BigDecimal valorSinistro;

	private BigDecimal valorRecibo;

	private BigDecimal valorPago;

	private BigDecimal valorInssIssFajtr;

	private BigDecimal valorInssIssMoeda;

	private String numDocumento;

	private RedeReembolsoEnum redeReembolso;

	private SimNaoEnum internado;

	private String localAtendimento;

	private String crmSolicitante;

	public Sinistro() {
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

	public void setCompetencia(Integer competencia) {
		this.competencia = competencia;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public void setSubEmpresa(SubEmpresa subEmpresa) {
		this.subEmpresa = subEmpresa;
	}

	public void setSegurado(Segurado segurado) {
		this.segurado = segurado;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public void setDataAtendimento(Date dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public void setGrupoDespesa(String grupoDespesa) {
		this.grupoDespesa = grupoDespesa;
	}

	public void setProcedimento(Procedimento procedimento) {
		this.procedimento = procedimento;
	}

	public void setQtdeProcedimento(Integer qtdeProcedimento) {
		this.qtdeProcedimento = qtdeProcedimento;
	}

	public void setPrestador(Prestador prestador) {
		this.prestador = prestador;
	}

	public void setValorSinistro(BigDecimal valorSinistro) {
		this.valorSinistro = valorSinistro;
	}

	public void setValorRecibo(BigDecimal valorRecibo) {
		this.valorRecibo = valorRecibo;
	}

	public void setValorPago(BigDecimal valorPago) {
		this.valorPago = valorPago;
	}

	public void setValorInssIssFajtr(BigDecimal valorInssIssFajtr) {
		this.valorInssIssFajtr = valorInssIssFajtr;
	}

	public void setValorInssIssMoeda(BigDecimal valorInssIssMoeda) {
		this.valorInssIssMoeda = valorInssIssMoeda;
	}

	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}

	public void setRedeReembolso(RedeReembolsoEnum redeReembolso) {
		this.redeReembolso = redeReembolso;
	}

	public void setInternado(SimNaoEnum internado) {
		this.internado = internado;
	}

	public void setLocalAtendimento(String localAtendimento) {
		this.localAtendimento = localAtendimento;
	}

	public void setCrmSolicitante(String crmSolicitante) {
		this.crmSolicitante = crmSolicitante;
	}

	public String toJson() {
		return new GsonBuilder().setDateFormat(Sistema.FORMATO_DATA.getValue()).create().toJson(this);
	}

	public static Sinistro fromJson(String json) {
		return new GsonBuilder().setDateFormat(Sistema.FORMATO_DATA.getValue()).create().fromJson(json, Sinistro.class);
	}

}

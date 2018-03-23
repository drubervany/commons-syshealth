package br.com.syshealth.commons.serializer;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.google.gson.GsonBuilder;

import br.com.syshealth.commons.enums.RedeReembolsoEnum;
import br.com.syshealth.commons.enums.SimNaoEnum;
import br.com.syshealth.commons.utils.Sistema;

@SuppressWarnings("serial")
public class SinistroSerializer implements Serializable {

	private Integer competencia;

	private EmpresaSerializer empresa;

	private SubEmpresaSerializer subEmpresa;

	private SeguradoSerializer segurado;

	private String conta;

	private Date dataAtendimento;

	private Date dataPagamento;

	private String grupoDespesa;

	private ProcedimentoSerializer procedimento;

	private Integer qtdeProcedimento;

	private PrestadorSerializer prestador;

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

	private SinistroSerializer(Builder builder) {
		this.competencia = builder.competencia;
		this.empresa = builder.empresa;
		this.subEmpresa = builder.subEmpresa;
		this.segurado = builder.segurado;
		this.conta = builder.conta;
		this.dataAtendimento = builder.dataAtendimento;
		this.dataPagamento = builder.dataPagamento;
		this.grupoDespesa = builder.grupoDespesa;
		this.procedimento = builder.procedimento;
		this.qtdeProcedimento = builder.qtdeProcedimento;
		this.prestador = builder.prestador;
		this.valorSinistro = builder.valorSinistro;
		this.valorRecibo = builder.valorRecibo;
		this.valorPago = builder.valorPago;
		this.valorInssIssFajtr = builder.valorInssIssFajtr;
		this.valorInssIssMoeda = builder.valorInssIssMoeda;
		this.numDocumento = builder.numDocumento;
		this.redeReembolso = builder.redeReembolso;
		this.internado = builder.internado;
		this.localAtendimento = builder.localAtendimento;
		this.crmSolicitante = builder.crmSolicitante;
	}

	public SinistroSerializer() {

	}

	public Integer getCompetencia() {
		return competencia;
	}

	public EmpresaSerializer getEmpresa() {
		return empresa;
	}

	public SubEmpresaSerializer getSubEmpresa() {
		return subEmpresa;
	}

	public SeguradoSerializer getSegurado() {
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

	public ProcedimentoSerializer getProcedimento() {
		return procedimento;
	}

	public Integer getQtdeProcedimento() {
		return qtdeProcedimento;
	}

	public PrestadorSerializer getPrestador() {
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

	/**
	 * Creates builder to build {@link SinistroSerializer}.
	 * 
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link SinistroSerializer}.
	 */
	public static final class Builder {
		private Integer competencia;
		private EmpresaSerializer empresa;
		private SubEmpresaSerializer subEmpresa;
		private SeguradoSerializer segurado;
		private String conta;
		private Date dataAtendimento;
		private Date dataPagamento;
		private String grupoDespesa;
		private ProcedimentoSerializer procedimento;
		private Integer qtdeProcedimento;
		private PrestadorSerializer prestador;
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

		private Builder() {
		}

		public Builder withCompetencia(Integer competencia) {
			this.competencia = competencia;
			return this;
		}

		public Builder withEmpresa(EmpresaSerializer empresa) {
			this.empresa = empresa;
			return this;
		}

		public Builder withSubEmpresa(SubEmpresaSerializer subEmpresa) {
			this.subEmpresa = subEmpresa;
			return this;
		}

		public Builder withSegurado(SeguradoSerializer segurado) {
			this.segurado = segurado;
			return this;
		}

		public Builder withConta(String conta) {
			this.conta = conta;
			return this;
		}

		public Builder withDataAtendimento(Date dataAtendimento) {
			this.dataAtendimento = dataAtendimento;
			return this;
		}

		public Builder withDataPagamento(Date dataPagamento) {
			this.dataPagamento = dataPagamento;
			return this;
		}

		public Builder withGrupoDespesa(String grupoDespesa) {
			this.grupoDespesa = grupoDespesa;
			return this;
		}

		public Builder withProcedimento(ProcedimentoSerializer procedimento) {
			this.procedimento = procedimento;
			return this;
		}

		public Builder withQtdeProcedimento(Integer qtdeProcedimento) {
			this.qtdeProcedimento = qtdeProcedimento;
			return this;
		}

		public Builder withPrestador(PrestadorSerializer prestador) {
			this.prestador = prestador;
			return this;
		}

		public Builder withValorSinistro(BigDecimal valorSinistro) {
			this.valorSinistro = valorSinistro;
			return this;
		}

		public Builder withValorRecibo(BigDecimal valorRecibo) {
			this.valorRecibo = valorRecibo;
			return this;
		}

		public Builder withValorPago(BigDecimal valorPago) {
			this.valorPago = valorPago;
			return this;
		}

		public Builder withValorInssIssFajtr(BigDecimal valorInssIssFajtr) {
			this.valorInssIssFajtr = valorInssIssFajtr;
			return this;
		}

		public Builder withValorInssIssMoeda(BigDecimal valorInssIssMoeda) {
			this.valorInssIssMoeda = valorInssIssMoeda;
			return this;
		}

		public Builder withNumDocumento(String numDocumento) {
			this.numDocumento = numDocumento;
			return this;
		}

		public Builder withRedeReembolso(RedeReembolsoEnum redeReembolso) {
			this.redeReembolso = redeReembolso;
			return this;
		}

		public Builder withInternado(SimNaoEnum internado) {
			this.internado = internado;
			return this;
		}

		public Builder withLocalAtendimento(String localAtendimento) {
			this.localAtendimento = localAtendimento;
			return this;
		}

		public Builder withCrmSolicitante(String crmSolicitante) {
			this.crmSolicitante = crmSolicitante;
			return this;
		}

		public SinistroSerializer build() {
			return new SinistroSerializer(this);
		}
	}

}
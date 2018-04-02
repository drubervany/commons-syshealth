package br.com.syshealth.commons.model;

import java.math.BigDecimal;
import java.util.Date;

import br.com.syshealth.commons.enums.RedeReembolsoEnum;
import br.com.syshealth.commons.enums.SimNaoEnum;

public class Sinistro {

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((competencia == null) ? 0 : competencia.hashCode());
		result = prime * result + ((dataAtendimento == null) ? 0 : dataAtendimento.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result + ((prestador == null) ? 0 : prestador.hashCode());
		result = prime * result + ((procedimento == null) ? 0 : procedimento.hashCode());
		result = prime * result + ((segurado == null) ? 0 : segurado.hashCode());
		result = prime * result + ((subEmpresa == null) ? 0 : subEmpresa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sinistro other = (Sinistro) obj;
		if (competencia == null) {
			if (other.competencia != null)
				return false;
		} else if (!competencia.equals(other.competencia))
			return false;
		if (dataAtendimento == null) {
			if (other.dataAtendimento != null)
				return false;
		} else if (!dataAtendimento.equals(other.dataAtendimento))
			return false;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		if (prestador == null) {
			if (other.prestador != null)
				return false;
		} else if (!prestador.equals(other.prestador))
			return false;
		if (procedimento == null) {
			if (other.procedimento != null)
				return false;
		} else if (!procedimento.equals(other.procedimento))
			return false;
		if (segurado == null) {
			if (other.segurado != null)
				return false;
		} else if (!segurado.equals(other.segurado))
			return false;
		if (subEmpresa == null) {
			if (other.subEmpresa != null)
				return false;
		} else if (!subEmpresa.equals(other.subEmpresa))
			return false;
		return true;
	}

}

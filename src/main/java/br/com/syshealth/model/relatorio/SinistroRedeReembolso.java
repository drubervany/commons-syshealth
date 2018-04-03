package br.com.syshealth.model.relatorio;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.syshealth.commons.utils.StringUtils;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SinistroRedeReembolso {

	private Integer competencia;
	private BigDecimal rede = BigDecimal.ZERO;
	private BigDecimal reembolso = BigDecimal.ZERO;
	private BigDecimal percentual = BigDecimal.ZERO;

	public SinistroRedeReembolso() {
	}

	public Integer getCompetencia() {
		return competencia;
	}

	public void setCompetencia(Integer competencia) {
		this.competencia = competencia;
	}

	public BigDecimal getRede() {
		return rede;
	}

	public void setRede(BigDecimal rede) {
		this.rede = rede;
	}

	public BigDecimal getReembolso() {
		return reembolso;
	}

	public void setReembolso(BigDecimal reembolso) {
		this.reembolso = reembolso;
	}

	@JsonProperty
	public BigDecimal getTotal() {
		return this.rede.add(this.reembolso);
	}

	public BigDecimal getPercentual() {
		return percentual;
	}

	public void setPercentual(BigDecimal percentual) {
		this.percentual = percentual;
	}

	@JsonIgnore
	public String getCompetenciaConvertida() {
		return StringUtils.converteCompetenciaEmDataAbreviada(competencia);
	}

	public void add(SinistroRedeReembolso sinistroRedeReembolso) {
		this.rede = this.rede.add(sinistroRedeReembolso.getRede());
		this.reembolso = this.reembolso.add(sinistroRedeReembolso.getReembolso());
	}
}

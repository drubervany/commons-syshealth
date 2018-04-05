package br.com.syshealth.model.relatorio;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.syshealth.commons.enums.GrupoServicoEnum;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SinistroGrupoConsolidado {

	private GrupoServicoEnum grupoServico;
	private Integer quantidade = 0;
	private BigDecimal sinistro = BigDecimal.ZERO;
	private BigDecimal frequencia = BigDecimal.ZERO;

	public SinistroGrupoConsolidado() {
	}

	public GrupoServicoEnum getGrupoServico() {
		return grupoServico;
	}

	public void setGrupoServico(GrupoServicoEnum grupoServico) {
		this.grupoServico = grupoServico;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getSinistro() {
		return sinistro;
	}

	public void setSinistro(BigDecimal sinistro) {
		this.sinistro = sinistro;
	}

	public BigDecimal getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(BigDecimal frequencia) {
		this.frequencia = frequencia;
	}

	@JsonProperty
	public BigDecimal getCustoMedio() {
		if (this.frequencia.intValue() == 0)
			return BigDecimal.ZERO;

		return this.sinistro.divide(this.frequencia);
	}

	public void add(SinistroGrupoConsolidado sinistroGrupoConsolidado) {
		this.quantidade += sinistroGrupoConsolidado.getQuantidade();
		this.sinistro = this.sinistro.add(sinistroGrupoConsolidado.getSinistro());
		this.frequencia = this.frequencia.add(sinistroGrupoConsolidado.getFrequencia());
	}

}

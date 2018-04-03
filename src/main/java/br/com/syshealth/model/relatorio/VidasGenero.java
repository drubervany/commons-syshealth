package br.com.syshealth.model.relatorio;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VidasGenero {

	private String faixaEtaria;
	private Integer masculino;
	private Integer feminino;
	private BigDecimal percentual;

	public VidasGenero() {
	}

	public VidasGenero(String faixaEtaria, Integer masculino, Integer feminino) {
		this.faixaEtaria = faixaEtaria;
		this.masculino = masculino;
		this.feminino = feminino;
	}

	public String getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(String faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public Integer getMasculino() {
		return masculino;
	}

	public void setMasculino(Integer masculino) {
		this.masculino = masculino;
	}

	public Integer getFeminino() {
		return feminino;
	}

	public void setFeminino(Integer feminino) {
		this.feminino = feminino;
	}

	@JsonProperty
	public Integer getTotal() {
		return this.masculino + this.feminino;
	}

	public void setPercentual(BigDecimal percentual) {
		this.percentual = percentual;
	}
	
	public BigDecimal getPercentual() {
		return percentual;
	}
}

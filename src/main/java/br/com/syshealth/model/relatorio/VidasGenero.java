package br.com.syshealth.model.relatorio;

import java.math.BigDecimal;

public class VidasGenero {

	private String faixaEtaria;
	private Integer masculino;
	private Integer feminino;
	private Integer total;
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

	public Integer getTotal() {

		this.total = this.masculino + this.feminino;

		return total;
	}

	public BigDecimal getPercentual() {
		return percentual;
	}

	public void add(VidasGenero vidasGenero) {
		this.masculino += vidasGenero.getMasculino();
		this.feminino += vidasGenero.getFeminino();
	}

}

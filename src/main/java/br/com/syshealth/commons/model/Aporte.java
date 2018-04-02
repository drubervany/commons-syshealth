package br.com.syshealth.commons.model;

import java.math.BigDecimal;

public class Aporte {

	private String descricao;

	private BigDecimal valor;

	public Aporte() {
	}

	public Aporte(String descricao, BigDecimal valor) {
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

}

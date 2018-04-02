package br.com.syshealth.commons.model;

import java.math.BigDecimal;

public class Copay {

	private String descricao;

	private BigDecimal valor;

	public Copay() {
	}

	public Copay(String descricao, BigDecimal valor) {
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

package br.com.syshealth.commons.model;

import java.io.Serializable;
import java.math.BigDecimal;

import com.google.gson.GsonBuilder;

import br.com.syshealth.commons.utils.Sistema;

@SuppressWarnings("serial")
public class Aporte implements Serializable {

	private String descricao;

	private BigDecimal valor;

	public Aporte() {
	}

	public String getDescricao() {
		return descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String toJson() {
		return new GsonBuilder().setDateFormat(Sistema.FORMATO_DATA.getValue()).create().toJson(this);
	}

	public static Aporte fromJson(String json) {
		return new GsonBuilder().setDateFormat(Sistema.FORMATO_DATA.getValue()).create().fromJson(json, Aporte.class);
	}
}

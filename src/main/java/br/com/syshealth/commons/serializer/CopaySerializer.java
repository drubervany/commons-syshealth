package br.com.syshealth.commons.serializer;

import java.io.Serializable;
import java.math.BigDecimal;

import com.google.gson.GsonBuilder;

import br.com.syshealth.commons.utils.Sistema;

@SuppressWarnings("serial")
public class CopaySerializer implements Serializable {

	private String descricao;

	private BigDecimal valor;

	public CopaySerializer() {

	}

	public CopaySerializer(String descricao, BigDecimal valor) {
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public String toJson() {
		return new GsonBuilder().setDateFormat(Sistema.FORMATO_DATA.getValue()).create().toJson(this);
	}

	public static CopaySerializer fromJson(String json) {
		return new GsonBuilder().setDateFormat(Sistema.FORMATO_DATA.getValue()).create().fromJson(json,
				CopaySerializer.class);
	}
}

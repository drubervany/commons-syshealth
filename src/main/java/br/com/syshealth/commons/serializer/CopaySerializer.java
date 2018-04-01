package br.com.syshealth.commons.serializer;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CopaySerializer {

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

}

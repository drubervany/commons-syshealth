package br.com.syshealth.commons.serializer;

import java.io.Serializable;
import java.math.BigDecimal;

import br.com.syshealth.commons.enums.OperadoraEnum;

@SuppressWarnings("serial")
public class EmpresaSerializer implements Serializable {

	private Integer codigo;

	private String nome;

	private Long contrato;

	private OperadoraEnum operadora;

	private BigDecimal limiteTecnico;

	public EmpresaSerializer() {

	}

	public EmpresaSerializer(Integer codigo, String nome, Long contrato, OperadoraEnum operadora) {
		this.codigo = codigo;
		this.nome = nome;
		this.contrato = contrato;
		this.operadora = operadora;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public Long getContrato() {
		return contrato;
	}

	public OperadoraEnum getOperadora() {
		return operadora;
	}

	public BigDecimal getLimiteTecnico() {
		return limiteTecnico;
	}

	public void setLimiteTecnico(BigDecimal limiteTecnico) {
		this.limiteTecnico = limiteTecnico;
	}
}
package br.com.syshealth.commons.model;

import java.io.Serializable;
import java.math.BigDecimal;

import br.com.syshealth.commons.enums.OperadoraEnum;

@SuppressWarnings("serial")
public class Empresa implements Serializable {

	private Integer codigo;

	private String nome;

	private Long contrato;

	private OperadoraEnum operadora;

	private BigDecimal limiteTecnico;

	public Empresa() {

	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setContrato(Long contrato) {
		this.contrato = contrato;
	}

	public void setOperadora(OperadoraEnum operadora) {
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
package br.com.syshealth.commons.model;

import java.math.BigDecimal;

import br.com.syshealth.commons.enums.OperadoraEnum;

public class Empresa {

	private Integer codigo;

	private String nome;

	private Long contrato;

	private OperadoraEnum operadora;

	private BigDecimal limiteTecnico;

	public Empresa() {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
package br.com.syshealth.commons.enums;

public enum SimNaoEnum {
	
	SIM("Sim"), 
	NAO("N�o");

	private final String descricao;

	private SimNaoEnum(final String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}

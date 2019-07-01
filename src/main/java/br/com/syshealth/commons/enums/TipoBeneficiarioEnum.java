package br.com.syshealth.commons.enums;

public enum TipoBeneficiarioEnum {
	
	TITULAR("Titular"), 
	DEPENDENTE("Dependente"), 
	AGREGADO("Agregado"), 
	DEMITIDO("Demitido"), 
	APOSENTADO("Aposentado"), 
	AFASTADO("Afastado"), 
	SEMTIPO("Não Informado");

	private String descricao;

	private TipoBeneficiarioEnum(final String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}

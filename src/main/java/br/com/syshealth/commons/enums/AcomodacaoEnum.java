package br.com.syshealth.commons.enums;

public enum AcomodacaoEnum {
	BASICO(1), 
	INTERMEDIARIO(2), 
	EXECUTIVO(3);

	private int codigo;

	private AcomodacaoEnum(final int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}
}
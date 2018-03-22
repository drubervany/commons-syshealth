package br.com.syshealth.commons.enums;

public enum GrauParentescoEnum {
	CONJUGE(1), FILHO(2), MAE(3), PAI(4), SOGRO(5), SOGRA(6), TUTELATO(7), OUTROS(8), TITULAR(0);

	private int codigo;

	private GrauParentescoEnum(final int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}
}

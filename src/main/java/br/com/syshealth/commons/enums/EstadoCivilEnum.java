package br.com.syshealth.commons.enums;

public enum EstadoCivilEnum {
	SOLTEIRO(1), CASADO(2), VIUVO(3), OUTROS(4);

	private int codigo;

	private EstadoCivilEnum(final int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}
}

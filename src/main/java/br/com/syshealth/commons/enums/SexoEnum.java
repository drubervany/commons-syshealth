package br.com.syshealth.commons.enums;

public enum SexoEnum {
	OUTRO(0, "Outro"),
	MASCULINO(1, "Masculino"), 
	FEMININO(2, "Feminino");

	private int codigo;
	private String descricao;

	private SexoEnum(final int codigo, final String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;

	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

}

package br.com.syshealth.commons.enums;

public enum GrupoServicoEnum {
	
	CONSULTA(1, "Consultas"), 
	PRONTO_SOCORRO(1, "Pronto Socorro"), 
	EXAMES_SIMPLES(1, "Exames Simples"), 
	EXAMES_ESPECIAIS(1, "Exames Especiais"), 
	INTERNACAO(1, "Internação"), 
	HONORARIO(1, "Honorário"), 
	TERAPIA(1, "Terapia"), 
	OUTROS(1, "Outros");

	private final Integer id;
	private final String descricao;

	private GrupoServicoEnum(Integer id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

}

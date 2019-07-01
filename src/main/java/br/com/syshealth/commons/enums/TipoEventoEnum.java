package br.com.syshealth.commons.enums;

public enum TipoEventoEnum {

	CONSULTA(1, "Consulta"), 
	EVENTO(2, "Evento"), 
	DESPESA_HOSPITALAR(3, "Desp. Hosp"), 
	HONORARIO_MEDICO(4, "Hon. Méd."),
	EXAME_SIMPLES(5, "Ex.Simples"), 
	EXAME_ESPECIAL(6, "Ex. Espec"), 
	CLINICA_ESPECIAL(7, "Cl. Esp"),
	FARMACIA(8, "Farmácia"), 
	TER_INF(9, "Ter.Inf"), 
	SINISTRO_MANUAL(0, "Sin.Man");

	private int codigo;
	private String descricao;

	private TipoEventoEnum(final int codigo, final String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getCodigo() {
		return codigo;
	}
}

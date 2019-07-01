package br.com.syshealth.commons.enums;

public enum OperadoraEnum {
	BRADESCO(1L, "Bradesco Saúde");
	// ALLIANZ,
	// AMIL,
	// BRADESCO,
	// CAIXASAUDE,
	// CAREPLUS,
	// CNUNIMED,
	// GOLDENCROSS,
	// GREENLINE,
	// HAPVIDA,
	// INTERMEDICA,
	// MARITIMA,
	// MEDISANITAS,
	// MEDISERVICE,
	// NEXTSEISA,
	// NOTREDAME,
	// OMINT,
	// ONEHEALTH,
	// PORTOSEGURO,
	// PORTOMED,
	// SAMEL,
	// SANTAHELENA,
	// SANTAMALIA,
	// SEGUROSUNIMED,
	// SULAMERICA,
	// TEMPOSAUDE,
	// UNIMEDABC,
	// UNIMEDFESP,
	// UNIMEDGUARULHOS,
	// UNIMEDPAULISTANA,
	// UNIMEDRJ;

	private final Long codigo;
	private final String nome;

	private OperadoraEnum(final Long codigo, final String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public Long getCodigo() {
		return codigo;
	}
}

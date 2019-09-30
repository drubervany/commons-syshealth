package br.com.syshealth.commons.enums;

public enum FaixaEtariaEnum {

	FAIXA_0_18(-999, 18), 
	FAIXA_19_23(19, 23), 
	FAIXA_24_28(24, 28), 
	FAIXA_29_33(29, 33), 
	FAIXA_34_38(34, 38),
	FAIXA_39_43(39, 43), 
	FAIXA_44_48(44, 48), 
	FAIXA_49_53(49, 53), 
	FAIXA_54_58(54, 58), 
	FAIXA_59_FINAL(59, 999);

	private Integer idadeInicio;
	private Integer idadeFinal;

	private FaixaEtariaEnum(final Integer idadeInicio, final Integer idadeFinal) {
		this.idadeInicio = idadeInicio;
		this.idadeFinal = idadeFinal;
	}

	public Integer getIdadeInicio() {
		return this.idadeInicio;
	}

	public Integer getIdadeFinal() {
		return this.idadeFinal;
	}

	public String getFaixaEtaria() {
		return this.idadeInicio + " - " + this.idadeFinal;
	}

	public static FaixaEtariaEnum getFaixaEtaria(final Integer idade) {
		for (FaixaEtariaEnum faixa : FaixaEtariaEnum.values()) {
			if (idade.intValue() >= faixa.getIdadeInicio().intValue()
					&& idade.intValue() <= faixa.getIdadeFinal().intValue())
				return faixa;

		}
		return null;
	}
}

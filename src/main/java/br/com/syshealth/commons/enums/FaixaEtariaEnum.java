package br.com.syshealth.commons.enums;

public enum FaixaEtariaEnum {

    FAIXA_0_18(0, 18),
    FAIXA_19_23(19, 23),
    FAIXA_24_28(24, 28),
    FAIXA_29_38(29, 38),
    FAIXA_39_43(39, 43),
    FAIXA_44_48(44, 48),
    FAIXA_49_53(49, 53),
    FAIXA_54_58(54, 58),
    FAIXA_FINAL(59, 999);

    private int idadeInicio;

    private int idadeFinal;

    private FaixaEtariaEnum(final int idadeInicio,
            final int idadeFinal) {
        this.idadeInicio = idadeInicio;
        this.idadeFinal = idadeFinal;
    }

    public int getIdadeInicio() {
        return this.idadeInicio;
    }

    public int getIdadeFinal() {
        return this.idadeFinal;
    }

    public String getFaixaEtaria() {
        return this.idadeInicio + " - " + this.idadeFinal;
    }
    
    

}

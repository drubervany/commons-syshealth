package br.com.syshealth.commons.enums;

public enum FaixaEtariaEnum {

    FAIXA_0_18(0, 18),
    FAIXA_19_24(19, 24),
    FAIXA_25_39(25, 39),
    FAIXA_FINAL(39, 999);

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

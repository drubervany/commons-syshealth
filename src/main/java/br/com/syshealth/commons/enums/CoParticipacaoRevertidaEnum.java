package br.com.syshealth.commons.enums;

public enum CoParticipacaoRevertidaEnum {
    OPERADORA_SEGURADORA("OS"),
    EMPRESA("EM");

    private String codigo;

    private CoParticipacaoRevertidaEnum(final String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
}

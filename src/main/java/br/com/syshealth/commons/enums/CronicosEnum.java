package br.com.syshealth.commons.enums;

public enum CronicosEnum {
    DIABETICOS(1),
    HIPERTENSOS(2),
    DPOC(3),
    ASMA(4);

    private int codigo;

    private CronicosEnum(final int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}

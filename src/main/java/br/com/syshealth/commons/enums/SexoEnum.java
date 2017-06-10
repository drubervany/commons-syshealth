package br.com.syshealth.commons.enums;

public enum SexoEnum {
    MASCULINO(1),
    FEMININO(2);

    private int codigo;

    private SexoEnum(final int codigo) {
        this.setCodigo(codigo);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}

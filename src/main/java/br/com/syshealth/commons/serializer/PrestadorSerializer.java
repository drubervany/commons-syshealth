package br.com.syshealth.commons.serializer;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PrestadorSerializer implements Serializable {

    private final Long codigo;

    private final String nome;

    private final String cpfCgcDoReferenciado;

    private final String tipoDoReferenciado;

    public PrestadorSerializer(Long codigo, String nome, String cpfCgcDoReferenciado, String tipoDoReferenciado) {
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.cpfCgcDoReferenciado = cpfCgcDoReferenciado;
        this.tipoDoReferenciado = tipoDoReferenciado;
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpfCgcDoReferenciado() {
        return cpfCgcDoReferenciado;
    }

    public String getTipoDoReferenciado() {
        return tipoDoReferenciado;
    }

}

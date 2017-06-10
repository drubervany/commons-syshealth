package br.com.syshealth.commons.dto;

import java.io.Serializable;
import java.util.Set;

@SuppressWarnings("serial")
public class SubEmpresaCadastro extends SubEmpresa implements Serializable {

    private final Set<Segurado> segurados;

    public SubEmpresaCadastro(Integer codigo, Set<Segurado> segurados) {
        super(codigo, null);
        this.segurados = segurados;
    }

    public Set<Segurado> getSegurados() {
        return segurados;
    }

}

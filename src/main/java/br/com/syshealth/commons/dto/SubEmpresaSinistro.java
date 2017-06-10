package br.com.syshealth.commons.dto;

import java.io.Serializable;
import java.util.Set;

@SuppressWarnings("serial")
public class SubEmpresaSinistro extends SubEmpresa implements Serializable {

    private final Set<SeguradoSinistro> segurados;

    public SubEmpresaSinistro(Integer codigo, String nome, Set<SeguradoSinistro> segurados) {
        super(codigo, nome);
        this.segurados = segurados;
    }

    public Set<SeguradoSinistro> getSegurados() {
        return segurados;
    }

}

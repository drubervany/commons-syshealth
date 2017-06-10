package br.com.syshealth.commons.dto;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class SubEmpresaPremio extends SubEmpresa implements Serializable {

    private final List<SeguradoPremio> segurados;

    private final Copay copay;

    private final Aporte aporte;

    public SubEmpresaPremio(Integer codigo, String nome, List<SeguradoPremio> segurados, Copay copay, Aporte aporte) {
        super(codigo, nome);
        this.segurados = segurados;
        this.copay = copay;
        this.aporte = aporte;
    }

    public List<SeguradoPremio> getSegurados() {
        return segurados;
    }

    public Aporte getAporte() {
        return aporte;
    }

    public Copay getCopay() {
        return copay;
    }

}

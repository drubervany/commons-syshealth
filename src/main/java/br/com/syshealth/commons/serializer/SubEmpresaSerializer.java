package br.com.syshealth.commons.serializer;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SubEmpresaSerializer implements Serializable {

    private final Integer codigo;

    private final String nome;

    private final CopaySerializer copay;

    private final AporteSerializer aporte;

    public SubEmpresaSerializer(Integer codigo, String nome, CopaySerializer copay, AporteSerializer aporte) {
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.copay = copay;
        this.aporte = aporte;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SubEmpresaSerializer other = (SubEmpresaSerializer) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    public AporteSerializer getAporte() {
        return aporte;
    }

    public CopaySerializer getCopay() {
        return copay;
    }

}

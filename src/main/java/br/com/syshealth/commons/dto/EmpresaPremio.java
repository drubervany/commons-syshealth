package br.com.syshealth.commons.dto;

import java.io.Serializable;
import java.util.List;

import br.com.syshealth.commons.enums.OperadoraEnum;

@SuppressWarnings("serial")
public class EmpresaPremio extends Empresa implements Serializable {

    private final List<SubEmpresaPremio> subEmpresas;

    public EmpresaPremio(Integer codigo, String nome, Long contrato, OperadoraEnum operadora, List<SubEmpresaPremio> subEmpresas) {
        super(codigo, nome, contrato, operadora);
        this.subEmpresas = subEmpresas;
    }

    public List<SubEmpresaPremio> getSubEmpresas() {
        return subEmpresas;
    }

}
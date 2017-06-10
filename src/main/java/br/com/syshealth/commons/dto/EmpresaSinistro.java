package br.com.syshealth.commons.dto;

import java.io.Serializable;
import java.util.Set;

import br.com.syshealth.commons.enums.OperadoraEnum;

@SuppressWarnings("serial")
public class EmpresaSinistro extends Empresa implements Serializable {

    private final Set<SubEmpresaSinistro> subEmpresas;

    public EmpresaSinistro(Integer codigo, String nome, Long contrato, OperadoraEnum operadora, Set<SubEmpresaSinistro> subEmpresas) {
        super(codigo, nome, contrato, operadora);
        this.subEmpresas = subEmpresas;
    }

    public Set<SubEmpresaSinistro> getSubEmpresas() {
        return subEmpresas;
    }

}
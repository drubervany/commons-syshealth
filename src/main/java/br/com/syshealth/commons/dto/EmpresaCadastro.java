package br.com.syshealth.commons.dto;

import java.io.Serializable;
import java.util.Set;

import br.com.syshealth.commons.enums.OperadoraEnum;

@SuppressWarnings("serial")
public class EmpresaCadastro extends Empresa implements Serializable {

    private final Set<SubEmpresaCadastro> subEmpresas;

    public EmpresaCadastro(Long contrato, OperadoraEnum operadora, Set<SubEmpresaCadastro> subEmpresas) {
        super(null, null, contrato, operadora);
        this.subEmpresas = subEmpresas;
    }

    public Set<SubEmpresaCadastro> getSubEmpresas() {
        return subEmpresas;
    }

}
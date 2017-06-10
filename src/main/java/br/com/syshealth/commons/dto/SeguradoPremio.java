package br.com.syshealth.commons.dto;

import java.math.BigDecimal;
import java.util.Date;

import br.com.syshealth.commons.enums.EstadoCivilEnum;
import br.com.syshealth.commons.enums.GrauParentescoEnum;
import br.com.syshealth.commons.enums.SexoEnum;
import br.com.syshealth.commons.enums.TipoBeneficiarioEnum;

public class SeguradoPremio extends Segurado {

    private final BigDecimal valorPremio;

    private final BigDecimal valorTaxaAdm;

    private final BigDecimal valorRemissao;

    private final BigDecimal valorParteSegurado;

    public SeguradoPremio(Long codigo, String carteirinha, String nome, String cpf, Date dataNascimento, Date dataInicio, Date dataFim,
            TipoBeneficiarioEnum tipoBeneficiario, SexoEnum sexo, GrauParentescoEnum parentesco, EstadoCivilEnum estadoCivil, Integer idade,
            Plano plano, BigDecimal valorPremio, BigDecimal valorTaxaAdm, BigDecimal valorRemissao, BigDecimal valorParteSegurado) {
        super(codigo, carteirinha, nome, cpf, dataNascimento, dataInicio, dataFim, tipoBeneficiario, sexo, parentesco, estadoCivil, idade,
                plano);

        this.valorPremio = valorPremio;
        this.valorTaxaAdm = valorTaxaAdm;
        this.valorRemissao = valorRemissao;
        this.valorParteSegurado = valorParteSegurado;
    }

    public BigDecimal getValorPremio() {
        return valorPremio;
    }

    public BigDecimal getValorTaxaAdm() {
        return valorTaxaAdm;
    }

    public BigDecimal getValorRemissao() {
        return valorRemissao;
    }

    public BigDecimal getValorParteSegurado() {
        return valorParteSegurado;
    }

}

package br.com.syshealth.commons.test;

import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import br.com.syshealth.commons.dto.Cadastro;
import br.com.syshealth.commons.dto.EmpresaCadastro;
import br.com.syshealth.commons.dto.Plano;
import br.com.syshealth.commons.dto.Segurado;
import br.com.syshealth.commons.dto.SubEmpresaCadastro;
import br.com.syshealth.commons.enums.EstadoCivilEnum;
import br.com.syshealth.commons.enums.OperadoraEnum;
import br.com.syshealth.commons.enums.SexoEnum;
import br.com.syshealth.commons.enums.TipoBeneficiarioEnum;

public class CadastroTest {

    public static void main(String[] args) {

        Set<Segurado> segurados = criaSegurados();
        Set<SubEmpresaCadastro> subEmpresas = criaSubEmpresas(segurados);

        Cadastro cadastro = new Cadastro(201402,
                new EmpresaCadastro(12345L, OperadoraEnum.BRADESCO,
                        subEmpresas));

        Stream<SubEmpresaCadastro> streamSubEmpresa = cadastro.getEmpresa().getSubEmpresas().stream();

        Stream<Set<Segurado>> mapSegurado = streamSubEmpresa.map(se -> se.getSegurados().stream().collect(Collectors.toSet()));

        Stream<Segurado> flatMapSegurado = mapSegurado.flatMap(s -> s.stream());

        Stream<Plano> map = flatMapSegurado.map(p -> p.getPlano());

        Map<String, Long> result = map.collect(
                Collectors.groupingBy(
                        Plano::getCodigo, Collectors.counting()));

        System.out.println(result);
    }

    private static Set<SubEmpresaCadastro> criaSubEmpresas(Set<Segurado> segurados) {
        Set<SubEmpresaCadastro> subEmpresas = new HashSet<>();
        SubEmpresaCadastro subEmpresa1 = new SubEmpresaCadastro(1, segurados);
        SubEmpresaCadastro subEmpresa2 = new SubEmpresaCadastro(2, segurados);
        subEmpresas.add(subEmpresa1);
        subEmpresas.add(subEmpresa2);
        return subEmpresas;
    }

    private static Set<Segurado> criaSegurados() {
        Set<Segurado> segurados = new HashSet<>();
        Segurado segurado1 = new Segurado(1L, "1", "Danilo", "22222", new Date(), new Date(), null,
                TipoBeneficiarioEnum.TITULAR, SexoEnum.MASCULINO, null, EstadoCivilEnum.CASADO,
                29, new Plano("TNQ2", "TNE1"));

        Segurado segurado2 = new Segurado(2L, "2", "Danilo", "22222", new Date(), new Date(), null,
                TipoBeneficiarioEnum.TITULAR, SexoEnum.MASCULINO, null, EstadoCivilEnum.CASADO,
                29, new Plano("TNE1", "TNE1"));
        segurados.add(segurado1);
        segurados.add(segurado2);
        return segurados;
    }
}

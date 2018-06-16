package br.com.syshealth.commons.utils;

import java.util.ArrayList;
import java.util.List;

import br.com.syshealth.commons.utils.StringUtils;

public class RelatorioUtils {

	public static List<Integer> competencias(Integer dataInicio, Integer dataFim) {

		List<Integer> listaCompetencias = new ArrayList<>();
		listaCompetencias.add(dataInicio);
		Integer competencia = dataInicio;
		while (dataFim.intValue() != competencia.intValue()) {
			competencia = StringUtils.addMonths(competencia, 1);
			listaCompetencias.add(competencia);
		}
		
		return listaCompetencias;

	}

}

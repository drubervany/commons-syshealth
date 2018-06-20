package br.com.syshealth.commons.utils;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

	public static <T> Map<Integer, T> ordernarCompetencia(Map<Integer, T> unsortMap) {

		return unsortMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors
				.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
	}
}

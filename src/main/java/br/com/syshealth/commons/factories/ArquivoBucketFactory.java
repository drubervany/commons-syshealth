package br.com.syshealth.commons.factories;

import br.com.syshealth.commons.enums.OperadoraEnum;

public class ArquivoBucketFactory {

	public static String criarNomeArquivo(Long contrato, Integer competencia, OperadoraEnum operadora) {

		return contrato + "_" + competencia + "_" + operadora.name() + ".json";
	}

	public static String criarNomeArquivoExcel(Long contrato, Integer dataInicio, Integer dataFim,
			OperadoraEnum operadora) {

		return contrato + "_" + dataInicio + "_" + dataFim + "_" + operadora.getNome() + ".xlsx";
	}
}

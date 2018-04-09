package br.com.syshealth.commons.factories;

import br.com.syshealth.commons.enums.OperadoraEnum;

public class ArquivoBucketFactory {

	private static final String XLSX = ".xlsx";
	private static final String JSON = ".json";

	public static String criarNomeArquivo(Long contrato, Integer competencia, OperadoraEnum operadora) {

		return contrato + "_" + competencia + "_" + operadora.name() + JSON;
	}

	public static String criarNomeArquivoRelatorio(Long contrato, Integer dataInicio, Integer dataFim,
			OperadoraEnum operadora) {

		return nomeArquivoRelatorio(contrato, dataInicio, dataFim, operadora, JSON);
	}

	public static String criarNomeArquivoExcel(Long contrato, Integer dataInicio, Integer dataFim,
			OperadoraEnum operadora) {

		return nomeArquivoRelatorio(contrato, dataInicio, dataFim, operadora, XLSX);
	}

	private static String nomeArquivoRelatorio(Long contrato, Integer dataInicio, Integer dataFim,
			OperadoraEnum operadora, String extencao) {
		return contrato + "_" + dataInicio + "_" + dataFim + "_" + operadora.name() + extencao;
	}
}

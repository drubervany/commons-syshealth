package br.com.syshealth.commons.factories;

import br.com.syshealth.commons.enums.OperadoraEnum;

public class ArquivoBucketFactory {

	private static final String XLSX = ".xlsx";
	private static final String JSON = ".json";

	public static String criarNomeArquivo(String entity, Integer codigo, OperadoraEnum operadora) {
		return entity + "_" + codigo + "_" + operadora.name() + JSON;
	}

	public static String criarNomeArquivo(String entity, Long codigo, OperadoraEnum operadora) {
		return entity + "_" + codigo + "_" + operadora.name() + JSON;
	}

	public static String criarNomeArquivo(String entity, String codigo, OperadoraEnum operadora) {
		return entity + "_" + codigo + "_" + operadora.name() + JSON;
	}

	public static String criarNomeArquivo(Integer codigo, OperadoraEnum operadora) {
		return codigo + "_" + operadora.name() + JSON;
	}

	public static String criarNomeArquivo(Long codigo, Integer competencia, OperadoraEnum operadora) {
		return codigo + "_" + competencia + "_" + operadora.name() + JSON;
	}

	public static String criarNomeArquivo(Integer codigo, Integer competencia, OperadoraEnum operadora) {
		return codigo + "_" + competencia + "_" + operadora.name() + JSON;
	}

	public static String criarNomeArquivoRelatorio(Integer contrato, Integer dataInicio, Integer dataFim,
			OperadoraEnum operadora) {
		return nomeArquivoRelatorio(contrato, dataInicio, dataFim, operadora, JSON);
	}

	public static String criarNomeArquivoExcel(Integer contrato, Integer dataInicio, Integer dataFim,
			OperadoraEnum operadora) {
		return nomeArquivoRelatorio(contrato, dataInicio, dataFim, operadora, XLSX);
	}

	private static String nomeArquivoRelatorio(Integer contrato, Integer dataInicio, Integer dataFim,
			OperadoraEnum operadora, String extencao) {
		return contrato + "_" + dataInicio + "_" + dataFim + "_" + operadora.name() + extencao;
	}
}

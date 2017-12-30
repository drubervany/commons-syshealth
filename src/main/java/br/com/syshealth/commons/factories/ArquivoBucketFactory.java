package br.com.syshealth.commons.factories;

import br.com.syshealth.commons.enums.OperadoraEnum;

public class ArquivoBucketFactory {

	public static String criarNomeArquivo(Long contrato, Integer competencia, OperadoraEnum operadora) {

		return contrato + "_" + competencia + "_" + operadora.getNome() + ".json";
	}
}

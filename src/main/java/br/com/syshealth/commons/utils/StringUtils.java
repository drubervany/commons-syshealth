package br.com.syshealth.commons.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

	private static String[] meses = { "", "Janeiro", "Fevereiro", "Mar�o", "Abril", "Maio", "Junho", "Julho",
			"Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" };
	private static String[] mesesAbreviado = { "", "Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out",
			"Nov", "Dez" };

	public static String converteCompetenciaEmData(Integer competencia) {

		String dataConvertida = meses[new Integer(competencia.toString().substring(4, 6))] + "/"
				+ new Integer(competencia.toString().substring(0, 4));

		return dataConvertida;
	}

	public static String converteCompetenciaEmDataAbreviada(Integer competencia) {

		String dataConvertida = mesesAbreviado[new Integer(competencia.toString().substring(4, 6))] + "."
				+ new Integer(competencia.toString().substring(2, 4));

		return dataConvertida;
	}

	public static String converteFaixaEtariaMaior59OuMias(Integer idadeDe, Integer idadeAte) {

		String faixa = idadeDe.toString() + " - " + idadeAte.toString();

		if ("59 - 999".equals(faixa))
			return "59 ou mais";
		else
			return faixa;
	}

	public static Integer converteDataStringParaInteger(Date dataString) {

		DateFormat sdf = new SimpleDateFormat("YYYYMMDD");
		Date dataNascInput = null;
		try {
			dataNascInput = sdf.parse(dataString.toString());
		} catch (Exception e) {
		}

		return new Integer(dataNascInput.toString());
	}

	public static Integer converteDataStringParaIntegerCompetencia(Date data) {

		SimpleDateFormat anoFormato = new SimpleDateFormat("yyyyMM");

		String dataFormatada = anoFormato.format(data);

		return new Integer(dataFormatada);
	}

	public static String converteDataStringParaString(Date data) {

		SimpleDateFormat anoFormato = new SimpleDateFormat("dd/MM/yyyy");

		String dataFormatada = anoFormato.format(data);

		return dataFormatada;
	}

	public static String lpad(String valueToPad, String filler, int size) {
		StringBuilder builder = new StringBuilder();

		while (builder.length() + valueToPad.length() < size) {
			builder.append(filler);
		}

		builder.append(valueToPad);
		return builder.toString();
	}

	public static int calculaIdade(Date dataNascInput) {

		if (dataNascInput != null) {
			Calendar dateOfBirth = new GregorianCalendar();
			dateOfBirth.setTime(dataNascInput);

			// Cria um objeto calendar com a data atual
			Calendar today = Calendar.getInstance();

			// Obt�m a idade baseado no ano
			int age = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);

			dateOfBirth.add(Calendar.YEAR, age);

			if (today.before(dateOfBirth)) {
				age--;
			}
			return age;
		}
		return 0;
	}

	public final static Date converteDataStringParaDate(String data) {
		try {
			SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

			String dataSinistro = data;
			String dia = dataSinistro.substring(6, 8);
			String mes = dataSinistro.substring(4, 6);
			String ano = dataSinistro.substring(0, 4);

			dataSinistro = dia + "/" + mes + "/" + ano;
			// System.out.println(dataSinistro);

			Date dataFormatada = fmt.parse(dataSinistro);
			// System.out.println(dataFormatada);

			return dataFormatada;
		} catch (ParseException p) {
		}
		return null;
	}

	public static String converteVigenciaParaCapa(Integer inicioVigencia, Integer fimVigencia) {

		String dataInicio = inicioVigencia.toString() + "01";
		String mes = dataInicio.substring(4, 6);
		String ano = dataInicio.substring(0, 4);

		String dataFim = fimVigencia.toString() + "01";
		String mesFim = dataFim.substring(4, 6);
		String anoFim = dataFim.substring(0, 4);

		String mesInicio = meses[new Integer(mes)];
		String mesIFim = meses[new Integer(mesFim)];

		return mesInicio + " de " + ano.toString() + " a " + mesIFim + " de " + anoFim.toString();
	}

	public static String converteVigenciaParaCapaUltimoMes(Integer fimVigencia) {

		String dataFim = fimVigencia.toString() + "01";
		String mesFim = dataFim.substring(4, 6);
		String anoFim = dataFim.substring(0, 4);

		String mesIFim = meses[new Integer(mesFim)];

		return mesIFim + " de " + anoFim.toString();
	}

	@SuppressWarnings("static-access")
	public static String converteVigenciaParaCapaApuracao(Integer inicioVigencia, Integer fimVigencia) {

		String dataInicio = inicioVigencia.toString() + "01";
		int mes = new Integer(dataInicio.substring(4, 6));
		int ano = new Integer(dataInicio.substring(0, 4));

		GregorianCalendar gcInicio = new GregorianCalendar(ano, mes, 1);
		gcInicio.add(gcInicio.MONTH, 1);

		String dataFim = fimVigencia.toString() + "01";
		int mesFim = new Integer(dataFim.substring(4, 6));
		int anoFim = new Integer(dataFim.substring(0, 4));

		GregorianCalendar gcFim = new GregorianCalendar(mesFim, anoFim, 1);
		gcFim.add(gcFim.MONTH, 1);

		String mesInicio = meses[gcInicio.MONTH];
		String mesIFim = meses[gcFim.MONTH];

		return mesInicio + " de " + gcInicio.YEAR + " a " + mesIFim + " de " + gcFim.YEAR;
	}

	public static String retornaDia(Date data) {
		SimpleDateFormat anoFormato = new SimpleDateFormat("dd");

		String dataFormatada = anoFormato.format(data);

		return dataFormatada;
	}

	public static String retornaMes(Date data) {
		SimpleDateFormat anoFormato = new SimpleDateFormat("MM");

		String dataFormatada = anoFormato.format(data);

		return converteCompetenciaEmDataAbreviada(new Integer(dataFormatada));
	}

	public static String retornaAno(Date data) {
		SimpleDateFormat anoFormato = new SimpleDateFormat("yyyy");

		String dataFormatada = anoFormato.format(data);

		return dataFormatada;
	}

	public static boolean verificaSeExisteLetra(String numDocumento) {

		Pattern pattern = Pattern.compile("[A-Z]");
		Matcher match = pattern.matcher(numDocumento.toUpperCase());

		if (match.find()) {
			return true;
		} else {
			return false;
		}
	}

	public static Calendar converteStringParaCalendar(String data_str) {

		if (data_str == null) {
			return null;
		}
		String[] data = data_str.split("/");

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, new Integer(data[0]));
		cal.set(Calendar.MONTH, new Integer(data[1]));
		cal.set(Calendar.YEAR, new Integer(data[2]));

		return cal;
	}

	public static Integer addMonths(Integer competencia, Integer qtdeMeses) {

		String dataString = "01/" + competencia.toString().substring(4, 6) + "/"
				+ new Integer(competencia.toString().substring(0, 4));

		Calendar cal = converteStringParaCalendar(dataString);
		cal.add(Calendar.MONTH, qtdeMeses);

		Integer ano = cal.get(Calendar.YEAR);
		Integer mes = cal.get(Calendar.MONTH);

		return Integer.parseInt(ano.toString() + lpad(mes.toString(), "0", 2));
	}
}
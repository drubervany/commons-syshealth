package br.com.syshealth.commons.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public final class DateUtil {

	private DateUtil() {}

	private static SimpleDateFormat dataSemHora = new SimpleDateFormat("dd/MM/yyyy");

	private static SimpleDateFormat dataCompleta = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private static SimpleDateFormat horaCompleta = new SimpleDateFormat("HH:mm:ss");

	private static SimpleDateFormat ano = new SimpleDateFormat("yyyy");

	private static SimpleDateFormat mes = new SimpleDateFormat("MM");

	private static SimpleDateFormat diaDoMes = new SimpleDateFormat("dd");

	private static SimpleDateFormat dataPOMxml = new SimpleDateFormat("dd-MM-yyyy HH:mm");

	public static synchronized String formataSemHora(Calendar cal) {

		if (cal == null) { return ""; }

		return dataSemHora.format(cal.getTime());
	}

	public static synchronized String formataSemHora(Date cal) {

		if (cal == null) { return ""; }

		return dataSemHora.format(cal.getTime());
	}

	public static Long minutosEmMilisegundos(Integer minutos) {

		return 60L * 1000 * minutos;

	}

	public static synchronized String formataComMes(Date date) {

		if (date == null) { return ""; }

		return mes.format(date);
	}

	public static synchronized String formataComAno(Date date) {

		if (date == null) { return ""; }

		return ano.format(date);
	}

	public static synchronized String formataCompleta(Date date) {

		if (date == null) { return ""; }

		return dataCompleta.format(date);
	}

	public static synchronized String formataSoHora(Date date) {

		if (date == null) { return ""; }

		return horaCompleta.format(date);
	}

	public static synchronized String dataDeInicioDoServidor() {

		java.lang.management.RuntimeMXBean rb = java.lang.management.ManagementFactory.getRuntimeMXBean();

		return dataCompleta.format(rb.getStartTime());
	}

	public static synchronized String getDiaDoMes() {

		Calendar hoje = new GregorianCalendar();

		return diaDoMes.format(hoje.getTime());

	}

	public static Calendar converteStringParaCalendar(String data_str) {

		if (data_str == null) { return null; }
		String[] data = data_str.split("/");

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH,new Integer(data[0]));
		cal.set(Calendar.MONTH,new Integer(data[1]));
		cal.set(Calendar.YEAR,new Integer(data[2]));

		return cal;
	}

	public static Date converteStringParaDate(String data_str) {

		if (data_str == null) { return null; }

		Date data = null;
		try {
			data = new Date(dataSemHora.parse(data_str).getTime());
		} catch (ParseException e) {
			throw new IllegalArgumentException("Erro converteStringParaDate  - Data:" + data_str, e.getCause());
		}

		return data;
	}

	public static XMLGregorianCalendar convertStringToXmlGregorian(String dateString)
	{
	      try {
	            Date date = dataSemHora.parse(dateString);
	            GregorianCalendar gc = (GregorianCalendar) GregorianCalendar.getInstance();
	            gc.setTime(date);
	            return DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
	        } catch (ParseException | DatatypeConfigurationException e) {
	            // Optimize exception handling
	            System.out.print(e.getMessage());
	            return null;
	        }

	}

	public static Date adicionarDias(Date data,int dias) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		calendar.add(Calendar.DAY_OF_MONTH,dias);

		dataSemHora.format(calendar.getTime());

		return converteStringParaDate(dataSemHora.format(calendar.getTime()));
	}

	public static synchronized String getDataNumerica(String data) {

		String resultado = "";
		try {
			Date dataDoPOM = dataPOMxml.parse(data);
			resultado = String.valueOf(dataDoPOM.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return resultado;

	}

	public static int dataDiff(java.util.Date dataLow,java.util.Date dataHigh) {

		GregorianCalendar startTime = new GregorianCalendar();
		GregorianCalendar endTime = new GregorianCalendar();

		GregorianCalendar curTime = new GregorianCalendar();
		GregorianCalendar baseTime = new GregorianCalendar();

		startTime.setTime(dataLow);
		endTime.setTime(dataHigh);

		int dif_multiplier = 1;

		// Verifica a ordem de inicio das datas
		if (dataLow.compareTo(dataHigh) < 0) {
			baseTime.setTime(dataHigh);
			curTime.setTime(dataLow);
			dif_multiplier = 1;
		} else {
			baseTime.setTime(dataLow);
			curTime.setTime(dataHigh);
			dif_multiplier = -1;
		}

		int result_years = 0;
		int result_months = 0;
		int result_days = 0;

		// Para cada mes e ano, vai de mes em mes pegar o ultimo dia para import acumulando
		// no total de dias. Ja leva em consideracao ano bissesto
		while (curTime.get(GregorianCalendar.YEAR) < baseTime.get(GregorianCalendar.YEAR) || curTime.get(GregorianCalendar.MONTH) < baseTime.get(GregorianCalendar.MONTH)) {

			int max_day = curTime.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
			result_months += max_day;
			curTime.add(GregorianCalendar.MONTH,1);

		}

		// Marca que é um saldo negativo ou positivo
		result_months = result_months * dif_multiplier;

		// Retirna a diferenca de dias do total dos meses
		result_days += endTime.get(GregorianCalendar.DAY_OF_MONTH) - startTime.get(GregorianCalendar.DAY_OF_MONTH);

		return result_years + result_months + result_days;
	}
	
	public static Integer quantidadeMeses(Integer dataInico, Integer dataFim) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("yyyyMM");

		Date dataInicoDate = formato.parse(dataInico.toString());
		Date dataFimDate = formato.parse(dataFim.toString());

		int count = 1;
		Calendar clStart = Calendar.getInstance();
		clStart.setTime(dataInicoDate);
		Calendar clEnd = Calendar.getInstance();
		clEnd.setTime(dataFimDate);
		while (clStart.get(Calendar.MONTH) != clEnd.get(Calendar.MONTH)
				|| clStart.get(Calendar.YEAR) != clEnd.get(Calendar.YEAR)) {
			clStart.add(Calendar.MONTH, 1);
			count++;
		}

		return count;
	}
}

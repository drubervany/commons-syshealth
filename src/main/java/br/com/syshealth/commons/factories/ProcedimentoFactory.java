package br.com.syshealth.commons.factories;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import br.com.syshealth.commons.serializer.SinistroSerializer;

public class ProcedimentoFactory {

	public static Date pesquisaUltimaData(final List<SinistroSerializer> procedimentos) {
		return procedimentos.stream()
				.collect(Collectors.maxBy(Comparator.comparing(SinistroSerializer::getDataAtendimento)))
				.map(SinistroSerializer::getDataAtendimento).get();
	}

	public static Date pesquisaPrimeidaData(final List<SinistroSerializer> procedimentos) {
		return procedimentos.stream()
				.collect(Collectors.minBy(Comparator.comparing(SinistroSerializer::getDataAtendimento)))
				.map(SinistroSerializer::getDataAtendimento).get();
	}

	public static Integer pesquisaMenorCompetencia(final List<SinistroSerializer> procedimentos) {
		return procedimentos.stream()
				.collect(Collectors.minBy(Comparator.comparing(SinistroSerializer::getCompetencia)))
				.map(SinistroSerializer::getCompetencia).get();
	}

	public static SinistroSerializer principalSinistroInternacao(final List<SinistroSerializer> procedimentos) {

		procedimentos.sort(new Comparator<SinistroSerializer>() {
			@Override
			public int compare(final SinistroSerializer m1, final SinistroSerializer m2) {
				if (m1.getValorSinistro().doubleValue() >= m2.getValorSinistro().doubleValue()) {
					return 1;
				} else {
					return 0;
				}
			}
		});

		procedimentos.sort(new Comparator<SinistroSerializer>() {
			@Override
			public int compare(final SinistroSerializer m1, final SinistroSerializer m2) {
				if (m1.getProcedimento().getCbhpm() != null && m2.getProcedimento().getCbhpm() != null)
					if (m1.getProcedimento().getCbhpm().getPorteNumerico().intValue() >= m2.getProcedimento().getCbhpm()
							.getPorteNumerico().intValue())
						return 1;
				return 0;
			}
		});

		procedimentos.sort(new Comparator<SinistroSerializer>() {
			@Override
			public int compare(final SinistroSerializer m1, final SinistroSerializer m2) {
				if (m1.getProcedimento().getCbhpm() != null && m2.getProcedimento().getCbhpm() != null)
					if (m1.getProcedimento().getCbhpm().getPorteAnestesico().intValue() >= m2.getProcedimento()
							.getCbhpm().getPorteAnestesico().intValue())
						return 1;
				return 0;
			}
		});

		return procedimentos.get(0);
	}
}

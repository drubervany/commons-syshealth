package br.com.syshealth.model.relatorio;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.syshealth.commons.enums.AcomodacaoEnum;
import br.com.syshealth.commons.serializer.CadastroSerializer;
import br.com.syshealth.commons.serializer.PlanoSerializer;
import br.com.syshealth.commons.serializer.SeguradoSerializer;
import br.com.syshealth.commons.utils.StringUtils;

public class VidasPlanoAcomodacao {

	private Integer competencia;
	private Integer basico = 0;
	private Integer intermediario = 0;
	private Integer executivo = 0;
	private Integer total = 0;

	public VidasPlanoAcomodacao() {
	}

	public VidasPlanoAcomodacao(final Integer competencia, final Integer basico, final Integer intermediario,
			final Integer executivo) {
		this.competencia = competencia;
		this.basico = basico;
		this.intermediario = intermediario;
		this.executivo = executivo;
	}

	public Integer getCompetencia() {
		return competencia;
	}

	public void setCompetencia(final Integer competencia) {
		this.competencia = competencia;
	}

	public Integer getBasico() {
		return basico;
	}

	public void setBasico(final Integer basico) {
		this.basico = basico;
	}

	public Integer getIntermediario() {
		return intermediario;
	}

	public void setIntermediario(final Integer intermediario) {
		this.intermediario = intermediario;
	}

	public Integer getExecutivo() {
		return executivo;
	}

	public void setExecutivo(final Integer executivo) {
		this.executivo = executivo;
	}

	public Integer getTotal() {

		this.total = basico + intermediario + executivo;

		return total;
	}

	@JsonIgnore
	public String getCompetenciaConvertida() {
		return StringUtils.converteCompetenciaEmDataAbreviada(competencia);
	}

	public static VidasPlanoAcomodacao toModel(final List<CadastroSerializer> cadastro) {

		if (cadastro == null || cadastro.isEmpty()) {
			return null;
		}

		final Integer competencia = cadastro.get(0).getCompetencia();

		final List<SeguradoSerializer> segurados = cadastro.stream().map(CadastroSerializer::getSegurado)
				.collect(Collectors.toList());

		final Set<PlanoSerializer> planos = segurados.stream().map(SeguradoSerializer::getPlano)
				.collect(Collectors.toSet());

		final Map<AcomodacaoEnum, Long> collectAcomodacao = planos.stream()
				.collect(Collectors.groupingBy(PlanoSerializer::getAcomodacao, Collectors.counting()));

		final Integer basico = collectAcomodacao.get(AcomodacaoEnum.BASICO).intValue();
		final Integer intermediario = collectAcomodacao.get(AcomodacaoEnum.INTERMEDIARIO).intValue();
		final Integer executivo = collectAcomodacao.get(AcomodacaoEnum.EXECUTIVO).intValue();

		return new VidasPlanoAcomodacao(competencia, basico, intermediario, executivo);
	}

	public void add(VidasPlanoAcomodacao vidasPlanoAcomodacao) {
		this.basico += vidasPlanoAcomodacao.getBasico();
		this.intermediario += vidasPlanoAcomodacao.getIntermediario();
		this.executivo += vidasPlanoAcomodacao.getExecutivo();
	}
}

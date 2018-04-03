package br.com.syshealth.model.relatorio;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.syshealth.commons.serializer.PrestadorSerializer;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RankingMaiorPrestador {

	private Integer ranking;
	private PrestadorSerializer prestador;
	private BigDecimal sinistro;
	private BigDecimal percSinistro;

	public RankingMaiorPrestador() {
	}

	public Integer getRanking() {
		return ranking;
	}

	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}

	public PrestadorSerializer getPrestador() {
		return prestador;
	}

	public void setPrestador(PrestadorSerializer prestador) {
		this.prestador = prestador;
	}

	public BigDecimal getSinistro() {
		return sinistro;
	}

	public void setSinistro(BigDecimal sinistro) {
		this.sinistro = sinistro;
	}

	public BigDecimal getPercSinistro() {
		return percSinistro;
	}

	public void setPercSinistro(BigDecimal percSinistro) {
		this.percSinistro = percSinistro;
	}

}

package br.com.syshealth.model.relatorio;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.syshealth.commons.serializer.SeguradoSerializer;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RankingMaiorUsuario {

	private Integer ranking;
	private SeguradoSerializer segurado;
	private BigDecimal sinistro;
	private BigDecimal percSinistro;

	public RankingMaiorUsuario() {
	}

	public Integer getRanking() {
		return ranking;
	}

	public void setRanking(Integer ranking) {
		this.ranking = ranking;
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

	public SeguradoSerializer getSegurado() {
		return segurado;
	}

	public void setSegurado(SeguradoSerializer segurado) {
		this.segurado = segurado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((segurado == null) ? 0 : segurado.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RankingMaiorUsuario other = (RankingMaiorUsuario) obj;
		if (segurado == null) {
			if (other.segurado != null)
				return false;
		} else if (!segurado.equals(other.segurado))
			return false;
		return true;
	}

}

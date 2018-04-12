package br.com.syshealth.model.relatorio;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.syshealth.commons.serializer.SeguradoSerializer;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RankingMaiorUsuario {

	private Integer ranking = 0;
	private SeguradoSerializer segurado;
	private BigDecimal sinistro = BigDecimal.ZERO;
	private BigDecimal percSinistro = BigDecimal.ZERO;

	private RankingMaiorUsuario(Builder builder) {
		this.ranking = builder.ranking;
		this.segurado = builder.segurado;
		this.sinistro = builder.sinistro;
		this.percSinistro = builder.percSinistro;
	}

	public RankingMaiorUsuario() {
	}

	public Integer getRanking() {
		return ranking;
	}

	public BigDecimal getSinistro() {
		return sinistro;
	}

	public BigDecimal getPercSinistro() {
		return percSinistro;
	}

	public SeguradoSerializer getSegurado() {
		return segurado;
	}

	public void setSegurado(SeguradoSerializer segurado) {
		this.segurado = segurado;
	}

	/**
	 * Creates builder to build {@link RankingMaiorUsuario}.
	 * 
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link RankingMaiorUsuario}.
	 */
	public static final class Builder {

		private Integer ranking = 0;
		private SeguradoSerializer segurado;
		private BigDecimal sinistro = BigDecimal.ZERO;
		private BigDecimal percSinistro = BigDecimal.ZERO;

		private Builder() {
		}

		public Builder withRanking(Integer ranking) {
			this.ranking = ranking;
			return this;
		}

		public Builder withSegurado(SeguradoSerializer segurado) {
			this.segurado = segurado;
			return this;
		}

		public Builder withSinistro(BigDecimal sinistro) {
			this.sinistro = sinistro;
			return this;
		}

		public Builder withPercSinistro(BigDecimal percSinistro) {
			this.percSinistro = percSinistro;
			return this;
		}

		public RankingMaiorUsuario build() {
			return new RankingMaiorUsuario(this);
		}
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

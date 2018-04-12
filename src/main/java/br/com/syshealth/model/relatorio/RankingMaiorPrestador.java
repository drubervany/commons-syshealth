package br.com.syshealth.model.relatorio;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.syshealth.commons.serializer.PrestadorSerializer;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RankingMaiorPrestador {

	private Integer ranking;
	private PrestadorSerializer prestador;
	private BigDecimal sinistro = BigDecimal.ZERO;
	private BigDecimal percSinistro = BigDecimal.ZERO;

	private RankingMaiorPrestador(Builder builder) {
		this.ranking = builder.ranking;
		this.prestador = builder.prestador;
		this.sinistro = builder.sinistro;
		this.percSinistro = builder.percSinistro;
	};

	public RankingMaiorPrestador() {
	}

	public Integer getRanking() {
		return ranking;
	}

	public PrestadorSerializer getPrestador() {
		return prestador;
	}

	public BigDecimal getSinistro() {
		return sinistro;
	}

	public BigDecimal getPercSinistro() {
		return percSinistro;
	}

	/**
	 * Creates builder to build {@link RankingMaiorPrestador}.
	 * 
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link RankingMaiorPrestador}.
	 */
	public static final class Builder {
		private Integer ranking;
		private PrestadorSerializer prestador;
		private BigDecimal sinistro = BigDecimal.ZERO;;
		private BigDecimal percSinistro = BigDecimal.ZERO;;

		private Builder() {
		}

		public Builder withRanking(Integer ranking) {
			this.ranking = ranking;
			return this;
		}

		public Builder withPrestador(PrestadorSerializer prestador) {
			this.prestador = prestador;
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

		public RankingMaiorPrestador build() {
			return new RankingMaiorPrestador(this);
		}
	}

}

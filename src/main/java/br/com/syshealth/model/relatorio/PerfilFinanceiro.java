package br.com.syshealth.model.relatorio;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.syshealth.commons.utils.StringUtils;

public class PerfilFinanceiro {

	private Integer competencia;
	private Integer vidas = 0;
	private BigDecimal premio = BigDecimal.ZERO;
	private BigDecimal premioPmpm = BigDecimal.ZERO;
	private BigDecimal aporte = BigDecimal.ZERO;
	private BigDecimal sinistro = BigDecimal.ZERO;
	private BigDecimal sinistroPmpm = BigDecimal.ZERO;
	private BigDecimal copay = BigDecimal.ZERO;
	private BigDecimal sinistralidade = BigDecimal.ZERO;

	private PerfilFinanceiro(Builder builder) {
		this.competencia = builder.competencia;
		this.vidas = builder.vidas;
		this.premio = builder.premio;
		this.aporte = builder.aporte;
		this.sinistro = builder.sinistro;
		this.copay = builder.copay;
	}

	public PerfilFinanceiro() {
	}

	public Integer getCompetencia() {
		return competencia;
	}

	public Integer getVidas() {
		return vidas;
	}

	public BigDecimal getPremio() {
		return premio;
	}

	public BigDecimal getPremioPmpm() {

		if (this.vidas != 0)
			this.premioPmpm = this.premio.divide(new BigDecimal(this.vidas));
		else
			this.premioPmpm = BigDecimal.ZERO;

		return premioPmpm;
	}

	public BigDecimal getSinistro() {
		return sinistro;
	}

	public BigDecimal getSinistroPmpm() {

		if (this.vidas != 0)
			this.sinistroPmpm = this.sinistro.divide(new BigDecimal(this.vidas));
		else
			this.sinistroPmpm = BigDecimal.ZERO;

		return sinistroPmpm;
	}

	public BigDecimal getCopay() {
		return copay;
	}

	public BigDecimal getSinistralidade() {

		if (this.premio != BigDecimal.ZERO)
			this.sinistralidade = this.sinistro.divide(this.premio);
		else
			this.sinistralidade = BigDecimal.ZERO;

		return sinistralidade;
	}

	public BigDecimal getAporte() {
		return aporte;
	}

	@JsonIgnore
	public String getCompetenciaConvertida() {
		return StringUtils.converteCompetenciaEmDataAbreviada(competencia);
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 59 * hash + (this.competencia != null ? this.competencia.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final PerfilFinanceiro other = (PerfilFinanceiro) obj;
		if ((this.competencia == null) ? (other.competencia != null) : !this.competencia.equals(other.competencia)) {
			return false;
		}
		return true;
	}

	public void add(PerfilFinanceiro perfilFinanceiro) {
		this.premio = perfilFinanceiro.getPremio();
		this.aporte = perfilFinanceiro.getAporte();
		this.sinistro = perfilFinanceiro.getSinistro();
		this.copay = perfilFinanceiro.getCopay();
	}

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {

		private Integer competencia;
		private Integer vidas = 0;
		private BigDecimal premio = BigDecimal.ZERO;
		private BigDecimal aporte = BigDecimal.ZERO;;
		private BigDecimal sinistro = BigDecimal.ZERO;;
		private BigDecimal copay = BigDecimal.ZERO;;

		private Builder() {
		}

		public Builder withCompetencia(Integer competencia) {
			this.competencia = competencia;
			return this;
		}

		public Builder withVidas(Integer vidas) {
			this.vidas = vidas;
			return this;
		}

		public Builder withPremio(BigDecimal premio) {
			this.premio = premio;
			return this;
		}

		public Builder withAporte(BigDecimal aporte) {
			this.aporte = aporte;
			return this;
		}

		public Builder withSinistro(BigDecimal sinistro) {
			this.sinistro = sinistro;
			return this;
		}

		public Builder withCopay(BigDecimal copay) {
			this.copay = copay;
			return this;
		}

		public PerfilFinanceiro build() {
			return new PerfilFinanceiro(this);
		}
	}

}

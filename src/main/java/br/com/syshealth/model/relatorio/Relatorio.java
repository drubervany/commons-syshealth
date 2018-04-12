package br.com.syshealth.model.relatorio;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.syshealth.commons.serializer.SubEmpresaSerializer;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Relatorio {

	private Integer competencia;
	private SubEmpresaSerializer subEmpresa;

	private EvolucaoVidas evolucaoVidas;
	private List<VidasGenero> vidasGenero;
	private List<VidasPlano> vidasPlano;
	private VidasPlanoAcomodacao vidasPlanoAcomodacao;
	private List<VidasTipoBeneficiario> vidasTipoBeneficiario;

	private PerfilFinanceiro perfilFinanceiro;

	private List<SinistroFaixaEtaria> sinistroFaixaEtaria;
	private List<SinistroGrupoConsolidado> sinistroGrupoConsolidado;
	private SinistroRedeReembolso sinistroRedeReembolso;

	private List<RankingMaiorUsuario> rankingMaiorUsuario;
	private List<RankingMaiorPrestador> rankingMaiorPrestador;

	public Relatorio() {
	}

	private Relatorio(Builder builder) {
		this.competencia = builder.competencia;
		this.subEmpresa = builder.subEmpresa;
		this.evolucaoVidas = builder.evolucaoVidas;
		this.vidasGenero = builder.vidasGenero;
		this.vidasPlano = builder.vidasPlano;
		this.vidasPlanoAcomodacao = builder.vidasPlanoAcomodacao;
		this.vidasTipoBeneficiario = builder.vidasTipoBeneficiario;
		this.perfilFinanceiro = builder.perfilFinanceiro;
		this.sinistroFaixaEtaria = builder.sinistroFaixaEtaria;
		this.sinistroGrupoConsolidado = builder.sinistroGrupoConsolidado;
		this.sinistroRedeReembolso = builder.sinistroRedeReembolso;
		this.rankingMaiorUsuario = builder.rankingMaiorUsuario;
		this.rankingMaiorPrestador = builder.rankingMaiorPrestador;
	}

	public Integer getCompetencia() {
		return competencia;
	}

	public SubEmpresaSerializer getSubEmpresa() {
		return subEmpresa;
	}

	public EvolucaoVidas getEvolucaoVidas() {
		return evolucaoVidas;
	}

	public List<VidasGenero> getVidasGenero() {
		return vidasGenero;
	}

	public List<VidasPlano> getVidasPlano() {
		return vidasPlano;
	}

	public VidasPlanoAcomodacao getVidasPlanoAcomodacao() {
		return vidasPlanoAcomodacao;
	}

	public List<VidasTipoBeneficiario> getVidasTipoBeneficiario() {
		return vidasTipoBeneficiario;
	}

	public PerfilFinanceiro getPerfilFinanceiro() {
		return perfilFinanceiro;
	}

	public List<SinistroFaixaEtaria> getSinistroFaixaEtaria() {
		return sinistroFaixaEtaria;
	}

	public List<SinistroGrupoConsolidado> getSinistroGrupoConsolidado() {
		return sinistroGrupoConsolidado;
	}

	public SinistroRedeReembolso getSinistroRedeReembolso() {
		return sinistroRedeReembolso;
	}

	public List<RankingMaiorUsuario> getRankingMaiorUsuario() {
		return rankingMaiorUsuario;
	}

	public List<RankingMaiorPrestador> getRankingMaiorPrestador() {
		return rankingMaiorPrestador;
	}

	public void setCompetencia(Integer competencia) {
		this.competencia = competencia;
	}

	public void setSubEmpresa(SubEmpresaSerializer subEmpresa) {
		this.subEmpresa = subEmpresa;
	}

	public void setEvolucaoVidas(EvolucaoVidas evolucaoVidas) {
		this.evolucaoVidas = evolucaoVidas;
	}

	public void setVidasGenero(List<VidasGenero> vidasGenero) {
		this.vidasGenero = vidasGenero;
	}

	public void setVidasPlano(List<VidasPlano> vidasPlano) {
		this.vidasPlano = vidasPlano;
	}

	public void setVidasPlanoAcomodacao(VidasPlanoAcomodacao vidasPlanoAcomodacao) {
		this.vidasPlanoAcomodacao = vidasPlanoAcomodacao;
	}

	public void setVidasTipoBeneficiario(List<VidasTipoBeneficiario> vidasTipoBeneficiario) {
		this.vidasTipoBeneficiario = vidasTipoBeneficiario;
	}

	public void setPerfilFinanceiro(PerfilFinanceiro perfilFinanceiro) {
		this.perfilFinanceiro = perfilFinanceiro;
	}

	public void setSinistroFaixaEtaria(List<SinistroFaixaEtaria> sinistroFaixaEtaria) {
		this.sinistroFaixaEtaria = sinistroFaixaEtaria;
	}

	public void setSinistroGrupoConsolidado(List<SinistroGrupoConsolidado> sinistroGrupoConsolidado) {
		this.sinistroGrupoConsolidado = sinistroGrupoConsolidado;
	}

	public void setSinistroRedeReembolso(SinistroRedeReembolso sinistroRedeReembolso) {
		this.sinistroRedeReembolso = sinistroRedeReembolso;
	}

	public void setRankingMaiorUsuario(List<RankingMaiorUsuario> rankingMaiorUsuario) {
		this.rankingMaiorUsuario = rankingMaiorUsuario;
	}

	public void setRankingMaiorPrestador(List<RankingMaiorPrestador> rankingMaiorPrestador) {
		this.rankingMaiorPrestador = rankingMaiorPrestador;
	}

	/**
	 * Creates builder to build {@link Relatorio}.
	 * 
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link Relatorio}.
	 */
	public static final class Builder {
		private Integer competencia;
		private SubEmpresaSerializer subEmpresa;
		private EvolucaoVidas evolucaoVidas;
		private List<VidasGenero> vidasGenero;
		private List<VidasPlano> vidasPlano;
		private VidasPlanoAcomodacao vidasPlanoAcomodacao;
		private List<VidasTipoBeneficiario> vidasTipoBeneficiario;
		private PerfilFinanceiro perfilFinanceiro;
		private List<SinistroFaixaEtaria> sinistroFaixaEtaria;
		private List<SinistroGrupoConsolidado> sinistroGrupoConsolidado;
		private SinistroRedeReembolso sinistroRedeReembolso;
		private List<RankingMaiorUsuario> rankingMaiorUsuario;
		private List<RankingMaiorPrestador> rankingMaiorPrestador;

		private Builder() {
		}

		public Builder withCompetencia(Integer competencia) {
			this.competencia = competencia;
			return this;
		}

		public Builder withSubEmpresa(SubEmpresaSerializer subEmpresa) {
			this.subEmpresa = subEmpresa;
			return this;
		}

		public Builder withEvolucaoVidas(EvolucaoVidas evolucaoVidas) {
			this.evolucaoVidas = evolucaoVidas;
			return this;
		}

		public Builder withVidasGenero(List<VidasGenero> vidasGenero) {
			this.vidasGenero = vidasGenero;
			return this;
		}

		public Builder withVidasPlano(List<VidasPlano> vidasPlano) {
			this.vidasPlano = vidasPlano;
			return this;
		}

		public Builder withVidasPlanoAcomodacao(VidasPlanoAcomodacao vidasPlanoAcomodacao) {
			this.vidasPlanoAcomodacao = vidasPlanoAcomodacao;
			return this;
		}

		public Builder withVidasTipoBeneficiario(List<VidasTipoBeneficiario> vidasTipoBeneficiario) {
			this.vidasTipoBeneficiario = vidasTipoBeneficiario;
			return this;
		}

		public Builder withPerfilFinanceiro(PerfilFinanceiro perfilFinanceiro) {
			this.perfilFinanceiro = perfilFinanceiro;
			return this;
		}

		public Builder withSinistroFaixaEtaria(List<SinistroFaixaEtaria> sinistroFaixaEtaria) {
			this.sinistroFaixaEtaria = sinistroFaixaEtaria;
			return this;
		}

		public Builder withSinistroGrupoConsolidado(List<SinistroGrupoConsolidado> sinistroGrupoConsolidado) {
			this.sinistroGrupoConsolidado = sinistroGrupoConsolidado;
			return this;
		}

		public Builder withSinistroRedeReembolso(SinistroRedeReembolso sinistroRedeReembolso) {
			this.sinistroRedeReembolso = sinistroRedeReembolso;
			return this;
		}

		public Builder withRankingMaiorUsuario(List<RankingMaiorUsuario> rankingMaiorUsuario) {
			this.rankingMaiorUsuario = rankingMaiorUsuario;
			return this;
		}

		public Builder withRankingMaiorPrestador(List<RankingMaiorPrestador> rankingMaiorPrestador) {
			this.rankingMaiorPrestador = rankingMaiorPrestador;
			return this;
		}

		public Relatorio build() {
			return new Relatorio(this);
		}
	}

}

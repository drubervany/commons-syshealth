package br.com.syshealth.model.relatorio;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.syshealth.commons.serializer.EmpresaSerializer;
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

	public Integer getCompetencia() {
		return competencia;
	}

	public void setCompetencia(Integer competencia) {
		this.competencia = competencia;
	}

	public EvolucaoVidas getEvolucaoVidas() {
		return evolucaoVidas;
	}

	public void setEvolucaoVidas(EvolucaoVidas evolucaoVidas) {
		this.evolucaoVidas = evolucaoVidas;
	}

	public List<VidasGenero> getVidasGenero() {
		return vidasGenero;
	}

	public void setVidasGenero(List<VidasGenero> vidasGenero) {
		this.vidasGenero = vidasGenero;
	}

	public List<VidasPlano> getVidasPlano() {
		return vidasPlano;
	}

	public void setVidasPlano(List<VidasPlano> vidasPlano) {
		this.vidasPlano = vidasPlano;
	}

	public VidasPlanoAcomodacao getVidasPlanoAcomodacao() {
		return vidasPlanoAcomodacao;
	}

	public void setVidasPlanoAcomodacao(VidasPlanoAcomodacao vidasPlanoAcomodacao) {
		this.vidasPlanoAcomodacao = vidasPlanoAcomodacao;
	}

	public List<VidasTipoBeneficiario> getVidasTipoBeneficiario() {
		return vidasTipoBeneficiario;
	}

	public void setVidasTipoBeneficiario(List<VidasTipoBeneficiario> VidasTipoBeneficiario) {
		this.vidasTipoBeneficiario = VidasTipoBeneficiario;
	}

	public PerfilFinanceiro getPerfilFinanceiro() {
		return perfilFinanceiro;
	}

	public void setPerfilFinanceiro(PerfilFinanceiro perfilFinanceiro) {
		this.perfilFinanceiro = perfilFinanceiro;
	}

	public List<SinistroFaixaEtaria> getSinistroFaixaEtaria() {
		return sinistroFaixaEtaria;
	}

	public void setSinistroFaixaEtaria(List<SinistroFaixaEtaria> sinistroFaixaEtaria) {
		this.sinistroFaixaEtaria = sinistroFaixaEtaria;
	}

	public List<SinistroGrupoConsolidado> getSinistroGrupoConsolidado() {
		return sinistroGrupoConsolidado;
	}

	public void setSinistroGrupoConsolidado(List<SinistroGrupoConsolidado> sinistroGrupoConsolidado) {
		this.sinistroGrupoConsolidado = sinistroGrupoConsolidado;
	}

	public SinistroRedeReembolso getSinistroRedeReembolso() {
		return sinistroRedeReembolso;
	}

	public void setSinistroRedeReembolso(SinistroRedeReembolso sinistroRedeReembolso) {
		this.sinistroRedeReembolso = sinistroRedeReembolso;
	}

	public SubEmpresaSerializer getSubEmpresa() {
		return subEmpresa;
	}

	public void setSubEmpresa(SubEmpresaSerializer subEmpresa) {
		this.subEmpresa = subEmpresa;
	}

	public List<RankingMaiorUsuario> getRankingMaiorUsuario() {
		return rankingMaiorUsuario;
	}

	public void setRankingMaiorUsuario(List<RankingMaiorUsuario> rankingMaiorUsuarioMes) {
		this.rankingMaiorUsuario = rankingMaiorUsuarioMes;
	}

	public List<RankingMaiorPrestador> getRankingMaiorPrestador() {
		return rankingMaiorPrestador;
	}

	public void setRankingMaiorPrestador(List<RankingMaiorPrestador> rankingMaiorPrestador) {
		this.rankingMaiorPrestador = rankingMaiorPrestador;
	}
}

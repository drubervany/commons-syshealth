package br.com.syshealth.commons.serializer;

import br.com.syshealth.commons.enums.TipoEventoEnum;
import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;

@Entity("procedimentos")
public class ProcedimentoSerializer {

	@Id
	private Long id;

	private TipoEventoEnum tipoEvento;

	private Long codigo;

	private String dsEvento;
	private String dsProcedimento;
	private String internacaoFinal;
	private Long codigoGrupo;
	private String grupo;
	private Long codigoSubGrupo;
	private String subGrupo;
	private String descricaoProcedimento;
	private String tipoEventoApoio;
	private String percentualPorte;
	private String porte;
	private String porteNumerico;
	private String valorCustoOperacional;
	private String numAux;
	private String porteAnestesico;
	private String valorFilme;
	private String incid;
	private String ur;
	private String dtAtualizacao;
	private String tipoCEMIG;
	private String tabela;
	private Long idEvento;
	private Long idEventoNivel1;

	private ProcedimentoSerializer(Builder builder) {
		this.id = builder.id;
		this.codigo = builder.codigo;
		this.dsEvento = builder.dsEvento;
		this.dsProcedimento = builder.dsProcedimento;
		this.internacaoFinal = builder.internacaoFinal;
		this.codigoGrupo = builder.codigoGrupo;
		this.grupo = builder.grupo;
		this.codigoSubGrupo = builder.codigoSubGrupo;
		this.subGrupo = builder.subGrupo;
		this.descricaoProcedimento = builder.descricaoProcedimento;
		this.tipoEventoApoio = builder.tipoEventoApoio;
		this.percentualPorte = builder.percentualPorte;
		this.porte = builder.porte;
		this.porteNumerico = builder.porteNumerico;
		this.valorCustoOperacional = builder.valorCustoOperacional;
		this.numAux = builder.numAux;
		this.porteAnestesico = builder.porteAnestesico;
		this.valorFilme = builder.valorFilme;
		this.incid = builder.incid;
		this.ur = builder.ur;
		this.dtAtualizacao = builder.dtAtualizacao;
		this.tipoCEMIG = builder.tipoCEMIG;
		this.tabela = builder.tabela;
		this.idEvento = builder.idEvento;
		this.idEventoNivel1 = builder.idEventoNivel1;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoEventoEnum getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(TipoEventoEnum tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDsEvento() {
		return dsEvento;
	}

	public void setDsEvento(String dsEvento) {
		this.dsEvento = dsEvento;
	}

	public String getDsProcedimento() {
		return dsProcedimento;
	}

	public void setDsProcedimento(String dsProcedimento) {
		this.dsProcedimento = dsProcedimento;
	}

	public String getInternacaoFinal() {
		return internacaoFinal;
	}

	public void setInternacaoFinal(String internacaoFinal) {
		this.internacaoFinal = internacaoFinal;
	}

	public Long getCodigoGrupo() {
		return codigoGrupo;
	}

	public void setCodigoGrupo(Long codigoGrupo) {
		this.codigoGrupo = codigoGrupo;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public Long getCodigoSubGrupo() {
		return codigoSubGrupo;
	}

	public void setCodigoSubGrupo(Long codigoSubGrupo) {
		this.codigoSubGrupo = codigoSubGrupo;
	}

	public String getSubGrupo() {
		return subGrupo;
	}

	public void setSubGrupo(String subGrupo) {
		this.subGrupo = subGrupo;
	}

	public String getDescricaoProcedimento() {
		return descricaoProcedimento;
	}

	public void setDescricaoProcedimento(String descricaoProcedimento) {
		this.descricaoProcedimento = descricaoProcedimento;
	}

	public String getTipoEventoApoio() {
		return tipoEventoApoio;
	}

	public void setTipoEventoApoio(String tipoEventoApoio) {
		this.tipoEventoApoio = tipoEventoApoio;
	}

	public String getPercentualPorte() {
		return percentualPorte;
	}

	public void setPercentualPorte(String percentualPorte) {
		this.percentualPorte = percentualPorte;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getPorteNumerico() {
		return porteNumerico;
	}

	public void setPorteNumerico(String porteNumerico) {
		this.porteNumerico = porteNumerico;
	}

	public String getValorCustoOperacional() {
		return valorCustoOperacional;
	}

	public void setValorCustoOperacional(String valorCustoOperacional) {
		this.valorCustoOperacional = valorCustoOperacional;
	}

	public String getNumAux() {
		return numAux;
	}

	public void setNumAux(String numAux) {
		this.numAux = numAux;
	}

	public String getPorteAnestesico() {
		return porteAnestesico;
	}

	public void setPorteAnestesico(String porteAnestesico) {
		this.porteAnestesico = porteAnestesico;
	}

	public String getValorFilme() {
		return valorFilme;
	}

	public void setValorFilme(String valorFilme) {
		this.valorFilme = valorFilme;
	}

	public String getIncid() {
		return incid;
	}

	public void setIncid(String incid) {
		this.incid = incid;
	}

	public String getUr() {
		return ur;
	}

	public void setUr(String ur) {
		this.ur = ur;
	}

	public String getDtAtualizacao() {
		return dtAtualizacao;
	}

	public void setDtAtualizacao(String dtAtualizacao) {
		this.dtAtualizacao = dtAtualizacao;
	}

	public String getTipoCEMIG() {
		return tipoCEMIG;
	}

	public void setTipoCEMIG(String tipoCEMIG) {
		this.tipoCEMIG = tipoCEMIG;
	}

	public String getTabela() {
		return tabela;
	}

	public void setTabela(String tabela) {
		this.tabela = tabela;
	}

	public Long getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Long idEvento) {
		this.idEvento = idEvento;
	}

	public Long getIdEventoNivel1() {
		return idEventoNivel1;
	}

	public void setIdEventoNivel1(Long idEventoNivel1) {
		this.idEventoNivel1 = idEventoNivel1;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {
		private Long id;
		private Long codigo;
		private String dsEvento;
		private String dsProcedimento;
		private String internacaoFinal;
		private Long codigoGrupo;
		private String grupo;
		private Long codigoSubGrupo;
		private String subGrupo;
		private String descricaoProcedimento;
		private String tipoEventoApoio;
		private String percentualPorte;
		private String porte;
		private String porteNumerico;
		private String valorCustoOperacional;
		private String numAux;
		private String porteAnestesico;
		private String valorFilme;
		private String incid;
		private String ur;
		private String dtAtualizacao;
		private String tipoCEMIG;
		private String tabela;
		private Long idEvento;
		private Long idEventoNivel1;

		private Builder() {
		}

		public Builder withCodigo(Long codigo) {
			this.codigo = codigo;
			return this;
		}

		public Builder withId(Long id) {
			this.id = id;
			return this;
		}

		public Builder withDsEvento(String dsEvento) {
			this.dsEvento = dsEvento;
			return this;
		}

		public Builder withDsProcedimento(String dsProcedimento) {
			this.dsProcedimento = dsProcedimento;
			return this;
		}

		public Builder withInternacaoFinal(String internacaoFinal) {
			this.internacaoFinal = internacaoFinal;
			return this;
		}

		public Builder withCodigoGrupo(Long codigoGrupo) {
			this.codigoGrupo = codigoGrupo;
			return this;
		}

		public Builder withGrupo(String grupo) {
			this.grupo = grupo;
			return this;
		}

		public Builder withCodigoSubGrupo(Long codigoSubGrupo) {
			this.codigoSubGrupo = codigoSubGrupo;
			return this;
		}

		public Builder withSubGrupo(String subGrupo) {
			this.subGrupo = subGrupo;
			return this;
		}

		public Builder withDescricaoProcedimento(String descricaoProcedimento) {
			this.descricaoProcedimento = descricaoProcedimento;
			return this;
		}

		public Builder withTipoEventoApoio(String tipoEventoApoio) {
			this.tipoEventoApoio = tipoEventoApoio;
			return this;
		}

		public Builder withPercentualPorte(String percentualPorte) {
			this.percentualPorte = percentualPorte;
			return this;
		}

		public Builder withPorte(String porte) {
			this.porte = porte;
			return this;
		}

		public Builder withPorteNumerico(String porteNumerico) {
			this.porteNumerico = porteNumerico;
			return this;
		}

		public Builder withValorCustoOperacional(String valorCustoOperacional) {
			this.valorCustoOperacional = valorCustoOperacional;
			return this;
		}

		public Builder withNumAux(String numAux) {
			this.numAux = numAux;
			return this;
		}

		public Builder withPorteAnestesico(String porteAnestesico) {
			this.porteAnestesico = porteAnestesico;
			return this;
		}

		public Builder withValorFilme(String valorFilme) {
			this.valorFilme = valorFilme;
			return this;
		}

		public Builder withIncid(String incid) {
			this.incid = incid;
			return this;
		}

		public Builder withUr(String ur) {
			this.ur = ur;
			return this;
		}

		public Builder withDtAtualizacao(String dtAtualizacao) {
			this.dtAtualizacao = dtAtualizacao;
			return this;
		}

		public Builder withTipoCEMIG(String tipoCEMIG) {
			this.tipoCEMIG = tipoCEMIG;
			return this;
		}

		public Builder withTabela(String tabela) {
			this.tabela = tabela;
			return this;
		}

		public Builder withIdEvento(Long idEvento) {
			this.idEvento = idEvento;
			return this;
		}

		public Builder withIdEventoNivel1(Long idEventoNivel1) {
			this.idEventoNivel1 = idEventoNivel1;
			return this;
		}

		public ProcedimentoSerializer build() {
			return new ProcedimentoSerializer(this);
		}
	}

}

package br.com.syshealth.commons.serializer;

import java.util.Date;

import org.bson.types.ObjectId;

import br.com.syshealth.commons.enums.FaixaEtariaEnum;
import br.com.syshealth.commons.enums.RedeReembolsoEnum;
import br.com.syshealth.commons.enums.SimNaoEnum;
import br.com.syshealth.commons.enums.TipoEventoEnum;
import br.com.syshealth.commons.utils.StringUtils;
import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Field;
import dev.morphia.annotations.Id;
import dev.morphia.annotations.Index;
import dev.morphia.annotations.IndexOptions;
import dev.morphia.annotations.Indexes;
import dev.morphia.annotations.NotSaved;
import dev.morphia.annotations.Reference;

@Entity("sinistros")
@Indexes({ @Index(fields = { @Field("segurado"),
		@Field("internado") }, options = @IndexOptions(name = "index_segurado_internado")), })
public class SinistroSerializer {

	@Id
	private ObjectId id;
	@NotSaved
	private Integer nroLinha;
	@NotSaved
	private String nomeArquivo;

	private Integer competencia;

	@Reference
	private EmpresaSerializer empresa;
	@Reference
	private SubEmpresaSerializer subEmpresa;
	@Reference
	private SeguradoSerializer segurado;
	@Reference
	private PrestadorSerializer prestador;
	@Reference
	private ProcedimentoSerializer procedimento;

	private String conta;
	private Date dataAtendimento;
	private Date dataPagamento;
	private String grupoDespesa;
	private RedeReembolsoEnum redeReembolso;
	private TipoEventoEnum tipoEvento;
	private SimNaoEnum internado;
	private String localAtendimento;
	private String crmSolicitante;
	private Long codigoDoenca;

	private String senha;

	private Integer idade;
	private FaixaEtariaEnum faixaEtaria;

	private Integer qtdeProcedimento;
	private Double valorSinistro;
	private Double valorRecibo;
	private Double valorPago;
	private Double valorInssIssFajtr;
	private Double valorInssIssMoeda;

	public SinistroSerializer() {
	}

	public String getConta() {
		return conta;
	}

	public Date getDataAtendimento() {
		return dataAtendimento;
	}

	public Date getDataAtendimentoProxima() {
		return StringUtils.adicionarDia(this.dataAtendimento, 1);
	}

	public Date getDataAtendimentoAnterior() {
		return StringUtils.adicionarDia(this.dataAtendimento, -1);
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public String getGrupoDespesa() {
		return grupoDespesa;
	}

	public ProcedimentoSerializer getProcedimento() {
		return procedimento;
	}

	public Integer getQtdeProcedimento() {
		return qtdeProcedimento;
	}

	public PrestadorSerializer getPrestador() {
		return prestador;
	}

	public Double getValorSinistro() {
		return valorSinistro;
	}

	public Double getValorRecibo() {
		return valorRecibo;
	}

	public Double getValorPago() {
		return valorPago;
	}

	public Double getValorInssIssFajtr() {
		return valorInssIssFajtr;
	}

	public Double getValorInssIssMoeda() {
		return valorInssIssMoeda;
	}

	public RedeReembolsoEnum getRedeReembolso() {
		return redeReembolso;
	}

	public SimNaoEnum getInternado() {
		return internado;
	}

	public String getLocalAtendimento() {
		return localAtendimento;
	}

	public String getCrmSolicitante() {
		return crmSolicitante;
	}

	public Long getCodigoDoenca() {
		return codigoDoenca;
	}

	public SeguradoSerializer getSegurado() {
		return segurado;
	}

	public Integer getCompetencia() {
		return competencia;
	}

	public FaixaEtariaEnum getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(FaixaEtariaEnum faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	private SinistroSerializer(Builder builder) {
		this.empresa = builder.empresa;
		this.subEmpresa = builder.subEmpresa;
		this.competencia = builder.competencia;
		this.segurado = builder.segurado;
		this.conta = builder.conta;
		this.dataAtendimento = builder.dataAtendimento;
		this.dataPagamento = builder.dataPagamento;
		this.grupoDespesa = builder.grupoDespesa;
		this.procedimento = builder.procedimento;
		this.qtdeProcedimento = builder.qtdeProcedimento;
		this.prestador = builder.prestador;
		this.valorSinistro = builder.valorSinistro;
		this.valorRecibo = builder.valorRecibo;
		this.valorPago = builder.valorPago;
		this.valorInssIssFajtr = builder.valorInssIssFajtr;
		this.valorInssIssMoeda = builder.valorInssIssMoeda;
		this.redeReembolso = builder.redeReembolso;
		this.tipoEvento = builder.tipoEvento;
		this.internado = builder.internado;
		this.localAtendimento = builder.localAtendimento;
		this.crmSolicitante = builder.crmSolicitante;
		this.codigoDoenca = builder.codigoDoenca;
		this.idade = builder.idade;
		this.faixaEtaria = builder.faixaEtaria;
		this.senha = builder.senha;
	}

	public static Builder builder() {
		return new Builder();
	}

	public Integer getNroLinha() {
		return nroLinha;
	}

	public void setNroLinha(Integer nroLinha) {
		this.nroLinha = nroLinha;
	}

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	public ObjectId getId() {
		return id;
	}

	public EmpresaSerializer getEmpresa() {
		return empresa;
	}

	public SubEmpresaSerializer getSubEmpresa() {
		return subEmpresa;
	}

	public TipoEventoEnum getTipoEvento() {
		return tipoEvento;
	}

	public static final class Builder {

		private EmpresaSerializer empresa;
		private SubEmpresaSerializer subEmpresa;
		private Integer competencia;
		private SeguradoSerializer segurado;
		private String conta;
		private Date dataAtendimento;
		private Date dataPagamento;
		private String grupoDespesa;
		private ProcedimentoSerializer procedimento;
		private Integer qtdeProcedimento;
		private PrestadorSerializer prestador;
		private Double valorSinistro;
		private Double valorRecibo;
		private Double valorPago;
		private Double valorInssIssFajtr;
		private Double valorInssIssMoeda;
		private RedeReembolsoEnum redeReembolso;
		private TipoEventoEnum tipoEvento;
		private SimNaoEnum internado;
		private String localAtendimento;
		private String crmSolicitante;
		private Long codigoDoenca;
		private Integer idade;
		private FaixaEtariaEnum faixaEtaria;
		private String senha;

		private Builder() {
		}

		public Builder withEmpresa(EmpresaSerializer empresa) {
			this.empresa = empresa;
			return this;
		}

		public Builder withSubEmpresa(SubEmpresaSerializer subEmpresa) {
			this.subEmpresa = subEmpresa;
			return this;
		}

		public Builder withConta(String conta) {
			this.conta = conta;
			return this;
		}

		public Builder withDataAtendimento(Date dataAtendimento) {
			this.dataAtendimento = dataAtendimento;
			return this;
		}

		public Builder withDataPagamento(Date dataPagamento) {
			this.dataPagamento = dataPagamento;
			return this;
		}

		public Builder withGrupoDespesa(String grupoDespesa) {
			this.grupoDespesa = grupoDespesa;
			return this;
		}

		public Builder withProcedimento(ProcedimentoSerializer procedimento) {
			this.procedimento = procedimento;
			return this;
		}

		public Builder withQtdeProcedimento(Integer qtdeProcedimento) {
			this.qtdeProcedimento = qtdeProcedimento;
			return this;
		}

		public Builder withPrestador(PrestadorSerializer prestador) {
			this.prestador = prestador;
			return this;
		}

		public Builder withValorSinistro(Double valorSinistro) {
			this.valorSinistro = valorSinistro;
			return this;
		}

		public Builder withValorRecibo(Double valorRecibo) {
			this.valorRecibo = valorRecibo;
			return this;
		}

		public Builder withValorPago(Double valorPago) {
			this.valorPago = valorPago;
			return this;
		}

		public Builder withValorInssIssFajtr(Double valorInssIssFajtr) {
			this.valorInssIssFajtr = valorInssIssFajtr;
			return this;
		}

		public Builder withValorInssIssMoeda(Double valorInssIssMoeda) {
			this.valorInssIssMoeda = valorInssIssMoeda;
			return this;
		}

		public Builder withRedeReembolso(RedeReembolsoEnum redeReembolso) {
			this.redeReembolso = redeReembolso;
			return this;
		}

		public Builder withInternado(SimNaoEnum internado) {
			this.internado = internado;
			return this;
		}

		public Builder withTipoEvento(TipoEventoEnum tipoEvento) {
			this.tipoEvento = tipoEvento;
			return this;
		}

		public Builder withLocalAtendimento(String localAtendimento) {
			this.localAtendimento = localAtendimento;
			return this;
		}

		public Builder withCrmSolicitante(String crmSolicitante) {
			this.crmSolicitante = crmSolicitante;
			return this;
		}

		public Builder withCodigoDoenca(Long codigoDoenca) {
			this.codigoDoenca = codigoDoenca;
			return this;
		}

		public Builder withSegurado(SeguradoSerializer segurado) {
			this.segurado = segurado;
			return this;
		}

		public Builder withCompetencia(Integer competencia) {
			this.competencia = competencia;
			return this;
		}

		public Builder withSenha(String senha) {
			this.senha = senha;
			return this;
		}

		public SinistroSerializer build() {
			this.idade = StringUtils.calculaIdade(this.segurado.getDataNascimento(), this.dataAtendimento);
			this.faixaEtaria = FaixaEtariaEnum.getFaixaEtaria(this.idade);
			return new SinistroSerializer(this);
		}
	}
}

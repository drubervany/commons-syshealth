
package br.com.syshealth.commons.serializer;

import java.util.Date;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import dev.morphia.annotations.Reference;

/**
 * @author danilo rubervany
 *
 */
@Entity("internacoes")
public class SinistroInternacao {

	@Id
	private SinistroInternacaoId id;

	private Integer dtCompetencia;

	@Reference
	private SeguradoSerializer segurado;

	@Reference
	private PrestadorSerializer prestador;

	private Date dtAtendimentoPrimeiro;
	private Date dtAtendimentoUltimo;

	@Reference
	private ProcedimentoSerializer procedimento;

	private String senha;
	private Integer qtdeProcedimento;
	private Double valorSinistro;
	private Double valorRecibo;
	private Double valorPago;
	private Double valorInssIssFajtr;
	private Double valorInssIssMoeda;

	public SinistroInternacao() {
	}

	public SinistroInternacaoId getId() {
		return id;
	}

	public Integer getDtCompetencia() {
		return dtCompetencia;
	}

	public SeguradoSerializer getSegurado() {
		return segurado;
	}

	public Date getDtAtendimentoPrimeiro() {
		return dtAtendimentoPrimeiro;
	}

	public Date getDtAtendimentoUltimo() {
		return dtAtendimentoUltimo;
	}

	public ProcedimentoSerializer getProcedimento() {
		return procedimento;
	}

	public String getSenha() {
		return senha;
	}

	public Integer getQtdeProcedimento() {
		return qtdeProcedimento;
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

	public PrestadorSerializer getPrestador() {
		return prestador;
	}

	private SinistroInternacao(Builder builder) {
		this.id = new SinistroInternacaoId(builder.segurado, builder.dtAtendimentoPrimeiro,
				builder.dtAtendimentoUltimo);
		this.dtCompetencia = builder.dtCompetencia;
		this.segurado = builder.segurado;
		this.prestador = builder.prestador;
		this.dtAtendimentoPrimeiro = builder.dtAtendimentoPrimeiro;
		this.dtAtendimentoUltimo = builder.dtAtendimentoUltimo;
		this.procedimento = builder.procedimento;
		this.senha = builder.senha;
		this.qtdeProcedimento = builder.qtdeProcedimento;
		this.valorSinistro = builder.valorSinistro;
		this.valorRecibo = builder.valorRecibo;
		this.valorPago = builder.valorPago;
		this.valorInssIssFajtr = builder.valorInssIssFajtr;
		this.valorInssIssMoeda = builder.valorInssIssMoeda;
	}

	/**
	 * Creates builder to build {@link SinistroInternacao}.
	 * 
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link SinistroInternacao}.
	 */
	public static final class Builder {
		private Integer dtCompetencia;
		private SeguradoSerializer segurado;
		private PrestadorSerializer prestador;
		private Date dtAtendimentoPrimeiro;
		private Date dtAtendimentoUltimo;
		private ProcedimentoSerializer procedimento;
		private String senha;
		private Integer qtdeProcedimento;
		private Double valorSinistro;
		private Double valorRecibo;
		private Double valorPago;
		private Double valorInssIssFajtr;
		private Double valorInssIssMoeda;

		private Builder() {
		}

		public Builder withDtCompetencia(Integer dtCompetencia) {
			this.dtCompetencia = dtCompetencia;
			return this;
		}

		public Builder withSegurado(SeguradoSerializer segurado) {
			this.segurado = segurado;
			return this;
		}

		public Builder withPrestador(PrestadorSerializer prestador) {
			this.prestador = prestador;
			return this;
		}

		public Builder withDtAtendimentoPrimeiro(Date dtAtendimentoPrimeiro) {
			this.dtAtendimentoPrimeiro = dtAtendimentoPrimeiro;
			return this;
		}

		public Builder withDtAtendimentoUltimo(Date dtAtendimentoUltimo) {
			this.dtAtendimentoUltimo = dtAtendimentoUltimo;
			return this;
		}

		public Builder withProcedimento(ProcedimentoSerializer procedimento) {
			this.procedimento = procedimento;
			return this;
		}

		public Builder withSenha(String senha) {
			this.senha = senha;
			return this;
		}

		public Builder withQtdeProcedimento(Integer qtdeProcedimento) {
			this.qtdeProcedimento = qtdeProcedimento;
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

		public SinistroInternacao build() {
			return new SinistroInternacao(this);
		}
	}

}

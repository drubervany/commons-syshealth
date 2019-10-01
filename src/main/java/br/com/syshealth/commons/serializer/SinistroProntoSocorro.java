
package br.com.syshealth.commons.serializer;

import java.util.Date;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Field;
import dev.morphia.annotations.Id;
import dev.morphia.annotations.Index;
import dev.morphia.annotations.IndexOptions;
import dev.morphia.annotations.Indexes;
import dev.morphia.annotations.Reference;

/**
 * @author danilo rubervany
 *
 */
@Entity("prontoSocorros")
@Indexes({ @Index(fields = { 
		@Field("segurado"),
		@Field("dataAtendimento") }, options = @IndexOptions(name = "index_segurado_pronto_socorro")), })
public class SinistroProntoSocorro {

	@Id
	private SinistroProntoSocorroId id;

	private Integer competencia;

	@Reference
	private SeguradoSerializer segurado;

	@Reference
	private PrestadorSerializer prestador;

	private Date dataAtendimento;

	@Reference
	private ProcedimentoSerializer procedimento;

	private String senha;
	private Integer qtdeProcedimento;
	private Double valorSinistro;
	private Double valorRecibo;
	private Double valorPago;
	private Double valorInssIssFajtr;
	private Double valorInssIssMoeda;

	public SinistroProntoSocorroId getId() {
		return id;
	}

	public Integer getCompetencia() {
		return competencia;
	}

	public SeguradoSerializer getSegurado() {
		return segurado;
	}

	public PrestadorSerializer getPrestador() {
		return prestador;
	}

	public Date getDataAtendimento() {
		return dataAtendimento;
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

	private SinistroProntoSocorro(Builder builder) {
		this.id = builder.id;
		this.competencia = builder.competencia;
		this.segurado = builder.segurado;
		this.prestador = builder.prestador;
		this.dataAtendimento = builder.dataAtendimento;
		this.procedimento = builder.procedimento;
		this.senha = builder.senha;
		this.qtdeProcedimento = builder.qtdeProcedimento;
		this.valorSinistro = builder.valorSinistro;
		this.valorRecibo = builder.valorRecibo;
		this.valorPago = builder.valorPago;
		this.valorInssIssFajtr = builder.valorInssIssFajtr;
		this.valorInssIssMoeda = builder.valorInssIssMoeda;
	}

	public SinistroProntoSocorro() {
	}

	/**
	 * Creates builder to build {@link SinistroProntoSocorro}.
	 * 
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link SinistroProntoSocorro}.
	 */
	public static final class Builder {
		private SinistroProntoSocorroId id;
		private Integer competencia;
		private SeguradoSerializer segurado;
		private PrestadorSerializer prestador;
		private Date dataAtendimento;
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

		public Builder withId(SinistroProntoSocorroId id) {
			this.id = id;
			return this;
		}

		public Builder withCompetencia(Integer competencia) {
			this.competencia = competencia;
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

		public Builder withDataAtendimento(Date dataAtendimento) {
			this.dataAtendimento = dataAtendimento;
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

		public SinistroProntoSocorro build() {
			return new SinistroProntoSocorro(this);
		}
	}

}

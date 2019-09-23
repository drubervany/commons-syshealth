package br.com.syshealth.commons.serializer;

import java.util.Date;

import javax.annotation.Generated;

import org.bson.types.ObjectId;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;

@Entity("premios")
public class CobrancaSerializer {

	@Id
	private ObjectId id;

	private Integer competencia;

	private Date dataLancamento;
	private String descricao;

	private Double valorPremio;
	private Double valorTaxaAdm;
	private Double valorRemissao;
	private Double valorParteSegurado;

	@Generated("SparkTools")
	private CobrancaSerializer(Builder builder) {
		this.competencia = builder.competencia;
		this.dataLancamento = builder.dataLancamento;
		this.descricao = builder.descricao;
		this.valorPremio = builder.valorPremio;
		this.valorTaxaAdm = builder.valorTaxaAdm;
		this.valorRemissao = builder.valorRemissao;
		this.valorParteSegurado = builder.valorParteSegurado;
	}

	public CobrancaSerializer() {
	}

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public String getDescricao() {
		return descricao;
	}

	public Integer getCompetencia() {
		return competencia;
	}

	public void setCompetencia(Integer competencia) {
		this.competencia = competencia;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public Double getValorPremio() {
		return valorPremio;
	}

	public void setValorPremio(Double valorPremio) {
		this.valorPremio = valorPremio;
	}

	public Double getValorTaxaAdm() {
		return valorTaxaAdm;
	}

	public void setValorTaxaAdm(Double valorTaxaAdm) {
		this.valorTaxaAdm = valorTaxaAdm;
	}

	public Double getValorRemissao() {
		return valorRemissao;
	}

	public void setValorRemissao(Double valorRemissao) {
		this.valorRemissao = valorRemissao;
	}

	public Double getValorParteSegurado() {
		return valorParteSegurado;
	}

	public void setValorParteSegurado(Double valorParteSegurado) {
		this.valorParteSegurado = valorParteSegurado;
	}

	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {
		private Integer competencia;
		private Date dataLancamento;
		private String descricao;
		private Double valorPremio;
		private Double valorTaxaAdm;
		private Double valorRemissao;
		private Double valorParteSegurado;

		private Builder() {
		}

		public Builder withCompetencia(Integer competencia) {
			this.competencia = competencia;
			return this;
		}

		public Builder withDataLancamento(Date dataLancamento) {
			this.dataLancamento = dataLancamento;
			return this;
		}

		public Builder withDescricao(String descricao) {
			this.descricao = descricao;
			return this;
		}

		public Builder withValorPremio(Double valorPremio) {
			this.valorPremio = valorPremio;
			return this;
		}

		public Builder withValorTaxaAdm(Double valorTaxaAdm) {
			this.valorTaxaAdm = valorTaxaAdm;
			return this;
		}

		public Builder withValorRemissao(Double valorRemissao) {
			this.valorRemissao = valorRemissao;
			return this;
		}

		public Builder withValorParteSegurado(Double valorParteSegurado) {
			this.valorParteSegurado = valorParteSegurado;
			return this;
		}

		public CobrancaSerializer build() {
			return new CobrancaSerializer(this);
		}
	}
}

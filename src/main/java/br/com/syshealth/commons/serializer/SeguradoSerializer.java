package br.com.syshealth.commons.serializer;

import java.util.Date;

import com.google.gson.GsonBuilder;

import br.com.syshealth.commons.enums.EstadoCivilEnum;
import br.com.syshealth.commons.enums.GrauParentescoEnum;
import br.com.syshealth.commons.enums.SexoEnum;
import br.com.syshealth.commons.enums.TipoBeneficiarioEnum;
import br.com.syshealth.commons.utils.Sistema;
import br.com.syshealth.commons.utils.StringUtils;

public class SeguradoSerializer {

	private Long codigo;

	private String carteirinha;

	private String nome;

	private String cpf;

	private Date dataNascimento;

	private Date dataInicio;

	private Date dataFim;

	private TipoBeneficiarioEnum tipoBeneficiario;

	private SexoEnum sexo;

	private GrauParentescoEnum parentesco;

	private EstadoCivilEnum estadoCivil;

	private Integer idade;

	private PlanoSerializer plano;

	private SeguradoSerializer(Builder builder) {
		this.codigo = builder.codigo;
		this.carteirinha = builder.carteirinha;
		this.nome = builder.nome;
		this.cpf = builder.cpf;
		this.dataNascimento = builder.dataNascimento;
		this.dataInicio = builder.dataInicio;
		this.dataFim = builder.dataFim;
		this.tipoBeneficiario = builder.tipoBeneficiario;
		this.sexo = builder.sexo;
		this.parentesco = builder.parentesco;
		this.estadoCivil = builder.estadoCivil;
		this.idade = StringUtils.calculaIdade(builder.dataNascimento);
		this.plano = builder.plano;
	}

	public SeguradoSerializer() {

	}

	public Long getCodigo() {
		return codigo;
	}

	public String getCarteirinha() {
		return carteirinha;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public TipoBeneficiarioEnum getTipoBeneficiario() {
		return tipoBeneficiario;
	}

	public SexoEnum getSexo() {
		return sexo;
	}

	public GrauParentescoEnum getParentesco() {
		return parentesco;
	}

	public EstadoCivilEnum getEstadoCivil() {
		return estadoCivil;
	}

	public Integer getIdade() {
		return idade;
	}

	public PlanoSerializer getPlano() {
		return plano;
	}

	public String toJson() {
		return new GsonBuilder().setDateFormat(Sistema.FORMATO_DATA.getValue()).create().toJson(this);
	}

	/**
	 * Creates builder to build {@link SeguradoSerializer}.
	 * 
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link SeguradoSerializer}.
	 */
	public static final class Builder {
		private Long codigo;
		private String carteirinha;
		private String nome;
		private String cpf;
		private Date dataNascimento;
		private Date dataInicio;
		private Date dataFim;
		private TipoBeneficiarioEnum tipoBeneficiario;
		private SexoEnum sexo;
		private GrauParentescoEnum parentesco;
		private EstadoCivilEnum estadoCivil;
		private PlanoSerializer plano;

		private Builder() {
		}

		public Builder withCodigo(Long codigo) {
			this.codigo = codigo;
			return this;
		}

		public Builder withCarteirinha(String carteirinha) {
			this.carteirinha = carteirinha;
			return this;
		}

		public Builder withNome(String nome) {
			this.nome = nome;
			return this;
		}

		public Builder withCpf(String cpf) {
			this.cpf = cpf;
			return this;
		}

		public Builder withDataNascimento(Date dataNascimento) {
			this.dataNascimento = dataNascimento;
			return this;
		}

		public Builder withDataInicio(Date dataInicio) {
			this.dataInicio = dataInicio;
			return this;
		}

		public Builder withDataFim(Date dataFim) {
			this.dataFim = dataFim;
			return this;
		}

		public Builder withTipoBeneficiario(TipoBeneficiarioEnum tipoBeneficiario) {
			this.tipoBeneficiario = tipoBeneficiario;
			return this;
		}

		public Builder withSexo(SexoEnum sexo) {
			this.sexo = sexo;
			return this;
		}

		public Builder withParentesco(GrauParentescoEnum parentesco) {
			this.parentesco = parentesco;
			return this;
		}

		public Builder withEstadoCivil(EstadoCivilEnum estadoCivil) {
			this.estadoCivil = estadoCivil;
			return this;
		}

		public Builder withPlano(PlanoSerializer plano) {
			this.plano = plano;
			return this;
		}

		public SeguradoSerializer build() {
			return new SeguradoSerializer(this);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		SeguradoSerializer other = (SeguradoSerializer) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}

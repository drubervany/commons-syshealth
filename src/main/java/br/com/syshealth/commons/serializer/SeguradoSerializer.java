package br.com.syshealth.commons.serializer;

import java.io.Serializable;
import java.util.Date;

import br.com.syshealth.commons.enums.EstadoCivilEnum;
import br.com.syshealth.commons.enums.GrauParentescoEnum;
import br.com.syshealth.commons.enums.OrigemArquivoEnum;
import br.com.syshealth.commons.enums.SexoEnum;
import br.com.syshealth.commons.enums.TipoBeneficiarioEnum;
import br.com.syshealth.commons.utils.StringUtils;
import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import dev.morphia.annotations.Reference;

@Entity("segurados")
public class SeguradoSerializer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private SeguradoId id;

	private Long codigo;
	@Reference
	private EmpresaSerializer empresa;
	@Reference
	private SubEmpresaSerializer subEmpresa;
	private String carteirinha;
	private String nome;
	private String cpf;
	private Date dataNascimento;
	private Date dataInicio;
	private Date dataFim;
	@Reference
	private TipoBeneficiarioEnum tipoBeneficiario;
	@Reference
	private SexoEnum sexo;
	@Reference
	private GrauParentescoEnum parentesco;
	@Reference
	private EstadoCivilEnum estadoCivil;
	private Integer idade;
	@Reference
	private PlanoSerializer plano;
	private String nomeDaMae;
	private Integer competencia;
	private OrigemArquivoEnum origem;

	@Reference
	private SeguradoSerializer titular;

	private SeguradoSerializer(Builder builder) {
		this.id = new SeguradoId(builder.codigo, builder.empresa, builder.subEmpresa);
		this.codigo = builder.codigo;
		this.empresa = builder.empresa;
		this.subEmpresa = builder.subEmpresa;
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
		this.idade = builder.idade;
		this.plano = builder.plano;
		this.titular = builder.titular;
		this.nomeDaMae = builder.nomeDaMae;
		this.competencia = builder.competencia;
		this.setOrigem(builder.origem);
	}

	public SeguradoSerializer() {
	}

	public SeguradoId getId() {
		return id;
	}

	public void setId(SeguradoId id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setCarteirinha(String carteirinha) {
		this.carteirinha = carteirinha;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public void setTipoBeneficiario(TipoBeneficiarioEnum tipoBeneficiario) {
		this.tipoBeneficiario = tipoBeneficiario;
	}

	public void setSexo(SexoEnum sexo) {
		this.sexo = sexo;
	}

	public void setParentesco(GrauParentescoEnum parentesco) {
		this.parentesco = parentesco;
	}

	public void setEstadoCivil(EstadoCivilEnum estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public void setPlano(PlanoSerializer plano) {
		this.plano = plano;
	}

	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}

	public void setCompetencia(Integer competencia) {
		this.competencia = competencia;
	}

	public void setTitular(SeguradoSerializer titular) {
		this.titular = titular;
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

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
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

	public SeguradoSerializer getTitular() {
		return titular;
	}

	public Integer getCompetencia() {
		return competencia;
	}

	public String getNomeDaMae() {
		return this.nomeDaMae;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	/**
	 * Creates builder to build {@link SeguradoSerializer}.
	 * 
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public EmpresaSerializer getEmpresa() {
		return empresa;
	}

	public void setEmpresa(EmpresaSerializer empresa) {
		this.empresa = empresa;
	}

	public SubEmpresaSerializer getSubEmpresa() {
		return subEmpresa;
	}

	public void setSubEmpresa(SubEmpresaSerializer subEmpresa) {
		this.subEmpresa = subEmpresa;
	}

	public OrigemArquivoEnum getOrigem() {
		return origem;
	}

	public void setOrigem(OrigemArquivoEnum origem) {
		this.origem = origem;
	}

	/**
	 * Builder to build {@link SeguradoSerializer}.
	 */
	public static final class Builder {

		private EmpresaSerializer empresa;
		private SubEmpresaSerializer subEmpresa;

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
		private SeguradoSerializer titular;
		private String nomeDaMae;
		private Integer idade;
		private Integer competencia;
		private OrigemArquivoEnum origem;

		private Builder() {
		}

		public Builder withCompetencia(Integer competencia) {
			this.competencia = competencia;
			return this;
		}

		public Builder withEmpresa(EmpresaSerializer empresa) {
			this.empresa = empresa;
			return this;
		}

		public Builder withSubEmpresa(SubEmpresaSerializer subEmpresa) {
			this.subEmpresa = subEmpresa;
			return this;
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
			this.idade = StringUtils.calculaIdade(dataNascimento);
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

		public Builder withTitular(SeguradoSerializer titular) {
			this.titular = titular;
			return this;
		}

		public Builder withNomeDaMae(String nomeDaMae) {
			this.nomeDaMae = nomeDaMae;
			return this;
		}

		public Builder withCalculaIdade(Date dataNascimento, Date dataAtendimento) {
			this.idade = StringUtils.calculaIdade(dataNascimento, dataAtendimento);
			return this;
		}

		public Builder withOrigemArquivo(OrigemArquivoEnum origem) {
			this.origem = origem;
			return this;
		}

		public SeguradoSerializer build() {
			return new SeguradoSerializer(this);
		}

	}
}

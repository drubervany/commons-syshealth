package br.com.syshealth.commons.serializer;

import java.util.Date;

import com.google.gson.GsonBuilder;

import br.com.syshealth.commons.enums.EstadoCivilEnum;
import br.com.syshealth.commons.enums.GrauParentescoEnum;
import br.com.syshealth.commons.enums.SexoEnum;
import br.com.syshealth.commons.enums.TipoBeneficiarioEnum;
import br.com.syshealth.commons.utils.Sistema;

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

	public SeguradoSerializer() {

	}

	public SeguradoSerializer(Long codigo, String carteirinha, String nome, String cpf, Date dataNascimento,
			Date dataInicio, Date dataFim, TipoBeneficiarioEnum tipoBeneficiario, SexoEnum sexo,
			GrauParentescoEnum parentesco, EstadoCivilEnum estadoCivil, Integer idade, PlanoSerializer plano) {

		this.codigo = codigo;
		this.carteirinha = carteirinha;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.tipoBeneficiario = tipoBeneficiario;
		this.sexo = sexo;
		this.parentesco = parentesco;
		this.estadoCivil = estadoCivil;
		this.idade = idade;
		this.plano = plano;
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

	public static SeguradoSerializer fromJson(String json) {
		return new GsonBuilder().setDateFormat(Sistema.FORMATO_DATA.getValue()).create().fromJson(json,
				SeguradoSerializer.class);
	}

}

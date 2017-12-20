package br.com.syshealth.commons.model;

import java.util.Date;

import com.google.gson.GsonBuilder;

import br.com.syshealth.commons.enums.EstadoCivilEnum;
import br.com.syshealth.commons.enums.GrauParentescoEnum;
import br.com.syshealth.commons.enums.SexoEnum;
import br.com.syshealth.commons.enums.TipoBeneficiarioEnum;
import br.com.syshealth.commons.utils.Sistema;

public class Segurado {

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

	private Plano plano;

	public Segurado() {

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

	public Plano getPlano() {
		return plano;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
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

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
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

	public void setPlano(Plano plano) {
		this.plano = plano;
	}

	public String toJson() {
		return new GsonBuilder().setDateFormat(Sistema.FORMATO_DATA.getValue()).create().toJson(this);
	}

	public static Segurado fromJson(String json) {
		return new GsonBuilder().setDateFormat(Sistema.FORMATO_DATA.getValue()).create().fromJson(json, Segurado.class);
	}

}

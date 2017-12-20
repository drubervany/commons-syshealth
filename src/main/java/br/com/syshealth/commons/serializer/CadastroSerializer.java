package br.com.syshealth.commons.serializer;

import java.io.Serializable;

import com.google.gson.GsonBuilder;

import br.com.syshealth.commons.utils.Sistema;

@SuppressWarnings("serial")
public class CadastroSerializer implements Serializable {

	private Integer competencia;

	private EmpresaSerializer empresa;

	private SubEmpresaSerializer subEmpresa;

	private SeguradoSerializer segurado;

	public CadastroSerializer() {

	}

	public CadastroSerializer(Integer competencia, EmpresaSerializer empresa, SubEmpresaSerializer subEmpresa,
			SeguradoSerializer segurado) {
		this.competencia = competencia;
		this.empresa = empresa;
		this.subEmpresa = subEmpresa;
		this.segurado = segurado;
	}

	public EmpresaSerializer getEmpresa() {
		return empresa;
	}

	public SeguradoSerializer getSegurado() {
		return segurado;
	}

	public SubEmpresaSerializer getSubEmpresa() {
		return subEmpresa;
	}

	public Integer getCompetencia() {
		return competencia;
	}

	public String toJson() {
		return new GsonBuilder().setDateFormat(Sistema.FORMATO_DATA.getValue()).create().toJson(this);
	}

	public static CadastroSerializer fromJson(String json) {
		return new GsonBuilder().setDateFormat(Sistema.FORMATO_DATA.getValue()).create().fromJson(json,
				CadastroSerializer.class);
	}
}

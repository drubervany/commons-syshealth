package br.com.syshealth.commons.serializer;

import java.util.Date;

import org.bson.types.ObjectId;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import dev.morphia.annotations.IndexOptions;
import dev.morphia.annotations.Indexed;

/**
 * The Class Internacao.
 * 
 * @author Danilo.Rubervany
 */
@Entity("SinistroPS")
public class SinistroProntoSocorro {

	@Id
	private ObjectId id;
	private int nroLinha;
	private String nomeArquivo;

	@Indexed(options = @IndexOptions(name = "index_competencia"))
	private Integer dtCompetencia;
	@Indexed(options = @IndexOptions(name = "index_idMatricula"))
	private Long idMatricula;
	private Long idServico;
	private Long idServicoOperadora;
	private String SenhaPS;
	private Double vlPago;
	private Long qtdServico;
	private Double vlPagoDemais;
	private Long qtdServicoDemais;
	private String Servico;
	private String PrestadorNome;
	private Date dtAtendimento;
	private String Nome;

	public SinistroProntoSocorro(SinistroBIAmbulatorial internacao) {
		this.nroLinha = internacao.getNroLinha();
		this.nomeArquivo = internacao.getNomeArquivo();
		this.dtCompetencia = internacao.getDtCompetencia();

		this.idMatricula = internacao.getIdMatricula();
		this.idServico = internacao.getIdServico();
		this.idServicoOperadora = internacao.getProcedimento();
		this.Servico = internacao.getServico();
		this.SenhaPS = internacao.getSenhaPS();
		this.vlPago = internacao.getVlPago();
		this.qtdServico = internacao.getQtdServico();
		this.PrestadorNome = internacao.getPrestadorNome();
		this.dtAtendimento = internacao.getDtAtendimento();
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public int getNroLinha() {
		return nroLinha;
	}

	public void setNroLinha(int nroLinha) {
		this.nroLinha = nroLinha;
	}

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	public Integer getDtCompetencia() {
		return dtCompetencia;
	}

	public void setDtCompetencia(Integer dtCompetencia) {
		this.dtCompetencia = dtCompetencia;
	}

	public Long getIdMatricula() {
		return idMatricula;
	}

	public void setIdMatricula(Long idMatricula) {
		this.idMatricula = idMatricula;
	}

	public Long getIdServico() {
		return idServico;
	}

	public void setIdServico(Long idServico) {
		this.idServico = idServico;
	}

	public Long getIdServicoOperadora() {
		return idServicoOperadora;
	}

	public void setIdServicoOperadora(Long idServicoOperadora) {
		this.idServicoOperadora = idServicoOperadora;
	}

	public String getSenhaPS() {
		return SenhaPS;
	}

	public void setSenhaPS(String senhaPS) {
		SenhaPS = senhaPS;
	}

	public Double getVlPago() {
		return vlPago;
	}

	public void setVlPago(Double vlPago) {
		this.vlPago = vlPago;
	}

	public Long getQtdServico() {
		return qtdServico;
	}

	public void setQtdServico(Long qtdServico) {
		this.qtdServico = qtdServico;
	}

	public Double getVlPagoDemais() {
		return vlPagoDemais;
	}

	public void setVlPagoDemais(Double vlPagoDemais) {
		this.vlPagoDemais = vlPagoDemais;
	}

	public Long getQtdServicoDemais() {
		return qtdServicoDemais;
	}

	public void setQtdServicoDemais(Long qtdServicoDemais) {
		this.qtdServicoDemais = qtdServicoDemais;
	}

	public String getServico() {
		return Servico;
	}

	public void setServico(String servico) {
		Servico = servico;
	}

	public String getPrestadorNome() {
		return PrestadorNome;
	}

	public void setPrestadorNome(String prestadorNome) {
		PrestadorNome = prestadorNome;
	}

	public Date getDtAtendimento() {
		return dtAtendimento;
	}

	public void setDtAtendimento(Date dtAtendimento) {
		this.dtAtendimento = dtAtendimento;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
}

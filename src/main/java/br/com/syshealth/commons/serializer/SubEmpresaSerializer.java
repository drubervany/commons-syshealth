package br.com.syshealth.commons.serializer;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SubEmpresaSerializer implements Serializable {

	private Long codigo;

	private String nome;

	private CopaySerializer copay;

	private AporteSerializer aporte;

	private EmpresaSerializer empresa;

	private SubEmpresaSerializer(Builder builder) {
		this.codigo = builder.codigo;
		this.nome = builder.nome;
		this.copay = builder.copay;
		this.aporte = builder.aporte;
		this.empresa = builder.empresa;
	}

	public SubEmpresaSerializer() {
	}

	public Long getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public AporteSerializer getAporte() {
		return aporte;
	}

	public CopaySerializer getCopay() {
		return copay;
	}

	/**
	 * Creates builder to build {@link SubEmpresaSerializer}.
	 * 
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	public EmpresaSerializer getEmpresa() {
		return empresa;
	}

	/**
	 * Builder to build {@link SubEmpresaSerializer}.
	 */
	public static final class Builder {
		private Long codigo;
		private String nome;
		private CopaySerializer copay;
		private AporteSerializer aporte;
		private EmpresaSerializer empresa;

		private Builder() {
		}

		public Builder withCodigo(Long codigo) {
			this.codigo = codigo;
			return this;
		}

		public Builder withNome(String nome) {
			this.nome = nome;
			return this;
		}

		public Builder withCopay(CopaySerializer copay) {
			this.copay = copay;
			return this;
		}

		public Builder withAporte(AporteSerializer aporte) {
			this.aporte = aporte;
			return this;
		}

		public Builder withEmpresa(EmpresaSerializer empresa) {
			this.empresa = empresa;
			return this;
		}

		public SubEmpresaSerializer build() {
			return new SubEmpresaSerializer(this);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
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
		SubEmpresaSerializer other = (SubEmpresaSerializer) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		return true;
	}

}

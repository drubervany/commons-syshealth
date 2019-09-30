package br.com.syshealth.commons.serializer;

import br.com.syshealth.commons.enums.OperadoraEnum;
import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import dev.morphia.annotations.Reference;

@Entity("procedimentos")
public class ProcedimentoSerializer {

	@Id
	private ProcedimentoId id;

	private Long codigo;
	private OperadoraEnum operadora;

	@Reference
	private CBHPMSerializer cbhpm;

	public ProcedimentoSerializer() {
	}

	public ProcedimentoId getId() {
		return id;
	}

	public Long getCodigo() {
		return codigo;
	}

	public OperadoraEnum getOperadora() {
		return operadora;
	}

	public CBHPMSerializer getCbhpm() {
		return cbhpm;
	}

	private ProcedimentoSerializer(Builder builder) {
		this.id = new ProcedimentoId(builder.codigo, builder.operadora);
		this.codigo = builder.codigo;
		this.operadora = builder.operadora;
		this.cbhpm = builder.cbhpm;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {
		private Long codigo;
		private OperadoraEnum operadora;
		private CBHPMSerializer cbhpm;

		private Builder() {
		}

		public Builder withCodigo(Long codigo) {
			this.codigo = codigo;
			return this;
		}

		public Builder withOperadora(OperadoraEnum operadora) {
			this.operadora = operadora;
			return this;
		}

		public Builder withCbhpm(CBHPMSerializer cbhpm) {
			this.cbhpm = cbhpm;
			return this;
		}

		public ProcedimentoSerializer build() {
			return new ProcedimentoSerializer(this);
		}
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
		ProcedimentoSerializer other = (ProcedimentoSerializer) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}

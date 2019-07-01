package br.com.syshealth.commons.serializer;

import br.com.syshealth.commons.enums.TipoEventoEnum;
import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;

@Entity("procedimento")
public class ProcedimentoSerializer {

	@Id
	private Long codigo;
	private String nome;
	private TipoEventoEnum tipoEvento;

	private ProcedimentoSerializer(Builder builder) {
		this.codigo = builder.codigo;
		this.nome = builder.nome;
		this.tipoEvento = builder.tipoEvento;
	}

	public ProcedimentoSerializer() {

	}

	public Long getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public TipoEventoEnum getTipoEvento() {
		return tipoEvento;
	}

	/**
	 * Creates builder to build {@link ProcedimentoSerializer}.
	 * 
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link ProcedimentoSerializer}.
	 */
	public static final class Builder {
		private Long codigo;
		private String nome;
		private TipoEventoEnum tipoEvento;

		private Builder() {
		}

		public Builder withCodigo(Long codigo) {
			this.codigo = codigo;
			return this;
		}

		public Builder withTipoEvento(TipoEventoEnum tipoEvento) {
			this.tipoEvento = tipoEvento;
			return this;
		}

		public Builder withNome(String nome) {
			this.nome = nome;
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
		ProcedimentoSerializer other = (ProcedimentoSerializer) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}

package br.com.syshealth.interfaces;

import java.util.List;
import java.util.Set;

import br.com.syshealth.commons.serializer.EmpresaSerializer;
import br.com.syshealth.commons.serializer.PlanoSerializer;
import br.com.syshealth.commons.serializer.PrestadorSerializer;
import br.com.syshealth.commons.serializer.ProcedimentoSerializer;
import br.com.syshealth.commons.serializer.SeguradoSerializer;
import br.com.syshealth.commons.serializer.SinistroSerializer;
import br.com.syshealth.commons.serializer.SubEmpresaSerializer;
import dev.morphia.Datastore;
import dev.morphia.query.Query;

public interface BiCommonsRepository {

	@SuppressWarnings("deprecation")
	public static void segurados(final Set<SeguradoSerializer> segurados, Datastore datastore) {
		segurados.forEach(segurado -> {
			final Query<SeguradoSerializer> seguradoQuery = datastore.find(SeguradoSerializer.class, "id",
					segurado.getId());
			if (0 == seguradoQuery.count())
				datastore.save(segurado);
		});
	}

	@SuppressWarnings("deprecation")
	public static void procedimentos(final Set<ProcedimentoSerializer> procedimentos, Datastore datastore) {
		procedimentos.forEach(procedimento -> {
			final Query<ProcedimentoSerializer> procedimentoQuery = datastore.find(ProcedimentoSerializer.class, "id",
					procedimento.getId());
			if (0 == procedimentoQuery.count())
				datastore.save(procedimento);
		});
	}

	@SuppressWarnings("deprecation")
	public static void prestadores(final Set<PrestadorSerializer> prestadores, Datastore datastore) {
		prestadores.forEach(prestador -> {
			final Query<PrestadorSerializer> prestadorQuery = datastore.find(PrestadorSerializer.class, "id",
					prestador.getId());
			if (0 == prestadorQuery.count())
				datastore.save(prestador);
		});
	}

	@SuppressWarnings("deprecation")
	public static void planos(final Set<PlanoSerializer> planos, Datastore datastore) {
		planos.forEach(plano -> {
			final Query<PlanoSerializer> planoQuery = datastore.find(PlanoSerializer.class, "id", plano.getId());
			if (0 == planoQuery.count())
				datastore.save(plano);
		});
	}

	public static void subEmpresa(final Set<SubEmpresaSerializer> subEmpresas, final EmpresaSerializer empresa,
			Datastore datastore) {
		subEmpresas.forEach(subEmpresa -> {
			final Query<SubEmpresaSerializer> subEmpresaQuery = datastore.find(SubEmpresaSerializer.class).field("id")
					.equal(empresa.getId()).field("nome").doesNotExist();
			if (0 == subEmpresaQuery.count())
				datastore.save(subEmpresa);
		});
	}

	public static void empresa(final EmpresaSerializer empresa, Datastore datastore) {
		final Query<EmpresaSerializer> empresaQuery = datastore.find(EmpresaSerializer.class).field("id")
				.equal(empresa.getId()).field("nome").doesNotExist();
		if (0 == empresaQuery.count())
			datastore.save(empresa);
	}

	public static void sinistros(List<SinistroSerializer> sinistros, Datastore datastore) {
		datastore.save(sinistros);
	}
}

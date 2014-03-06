package br.com.sramos.webservice.dao.impl;

import java.util.Collection;
import java.util.List;

import javax.inject.Named;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.sramos.webservice.dao.MarcaDAO;
import br.com.sramos.webservice.model.Marca;

@Named("marcaDAO")
public class MarcaJPA extends AbstractJPA implements MarcaDAO{

	private static final long serialVersionUID = -2157586550234739897L;

	@Override
	public Collection<Marca> buscarTodasMarcas() {
		String jpql = "select m from Marca m order by m.descricao";
		TypedQuery<Marca> query = getEntityManager().createQuery(jpql, Marca.class);
		List<Marca> marcas = query.getResultList();
		return marcas;
	}

	@Override
	public Marca buscarMarcaPorId(Long idMarca) {
		String jpql = "select m from Marca m where m.id = :idMarca";
		Query query = getEntityManager().createQuery(jpql, Marca.class);
		query.setParameter("idMarca", idMarca);
		Marca marca = (Marca) query.getSingleResult();
		return marca;
	}
}

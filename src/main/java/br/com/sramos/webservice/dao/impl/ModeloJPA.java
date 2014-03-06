package br.com.sramos.webservice.dao.impl;

import java.util.Collection;
import java.util.List;

import javax.inject.Named;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.sramos.webservice.dao.ModeloDAO;
import br.com.sramos.webservice.model.Marca;
import br.com.sramos.webservice.model.Modelo;

@Named("modeloDAO")
public class ModeloJPA extends AbstractJPA implements ModeloDAO {

	private static final long serialVersionUID = 2424084580974605143L;

	@Override
	public Collection<Modelo> buscarTodosModelos() {
		String jpql = "select m from Modelo m order by m.descricao";
		TypedQuery<Modelo> query = getEntityManager().createQuery(jpql, Modelo.class);
		List<Modelo> modelos = query.getResultList();
		return modelos;
	}

	@Override
	public Modelo buscarModeloPorId(Long idModelo) {
		String jpql = "select m from Modelo m where m.id = :idModelo";
		Query query = getEntityManager().createQuery(jpql, Marca.class);
		query.setParameter("idModelo", idModelo);
		Modelo modelo = (Modelo) query.getSingleResult();
		return modelo;
	}
}

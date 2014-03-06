package br.com.sramos.webservice.bo.impl;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import br.com.sramos.webservice.bo.ModeloBO;
import br.com.sramos.webservice.dao.ModeloDAO;
import br.com.sramos.webservice.exception.BusinessException;
import br.com.sramos.webservice.model.Modelo;

@Stateless(name="modeloBO")
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class ModeloBOImpl implements ModeloBO {

	private static final long serialVersionUID = -436286776947178375L;

	@Inject
	ModeloDAO modeloDAO;
	
	@Override
	public Collection<Modelo> buscarTodosModelos() throws BusinessException {
		try {
			Collection<Modelo> modelos = modeloDAO.buscarTodosModelos();
			return modelos;
		} catch (Exception e) {
			throw new BusinessException(e);
		}
	}

	@Override
	public Modelo buscarModeloPorId(Long idModelo) throws BusinessException {
		try {
			Modelo modelo = modeloDAO.buscarModeloPorId(idModelo);
			return modelo;
		} catch (Exception e) {
			throw new BusinessException(e);
		}
	}
}

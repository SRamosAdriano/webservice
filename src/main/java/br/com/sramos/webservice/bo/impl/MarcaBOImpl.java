package br.com.sramos.webservice.bo.impl;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import br.com.sramos.webservice.bo.MarcaBO;
import br.com.sramos.webservice.dao.MarcaDAO;
import br.com.sramos.webservice.exception.BusinessException;
import br.com.sramos.webservice.model.Marca;

@Stateless(name="marcaBO")
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class MarcaBOImpl implements MarcaBO{

	private static final long serialVersionUID = -4005895274703228487L;

	@Inject
	MarcaDAO marcaDAO;
	
	@Override
	public Collection<Marca> buscarTodasMarcas() throws BusinessException {
		try {
			Collection<Marca> marcas = marcaDAO.buscarTodasMarcas();
			return marcas;
		} catch (Exception e) {
			throw new BusinessException(e);
		}
	}

	@Override
	public Marca buscarMarcaPorId(Long idMarca) throws BusinessException {
		try {
			Marca marca = marcaDAO.buscarMarcaPorId(idMarca);
			return marca;
		} catch (Exception e) {
			throw new BusinessException(e);
		}
	}
}

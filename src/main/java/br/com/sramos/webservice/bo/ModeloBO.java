package br.com.sramos.webservice.bo;

import java.io.Serializable;
import java.util.Collection;

import br.com.sramos.webservice.exception.BusinessException;
import br.com.sramos.webservice.model.Modelo;

public interface ModeloBO extends Serializable{

	public Collection<Modelo> buscarTodosModelos() throws BusinessException;
	
	public Modelo buscarModeloPorId(Long idModelo) throws BusinessException;
}

package br.com.sramos.webservice.bo;

import java.io.Serializable;
import java.util.Collection;

import br.com.sramos.webservice.exception.BusinessException;
import br.com.sramos.webservice.model.Marca;

public interface MarcaBO extends Serializable{
	
	public Collection<Marca> buscarTodasMarcas() throws BusinessException;
	
	public Marca buscarMarcaPorId(Long idMarca) throws BusinessException;
}

package br.com.sramos.webservice.dao;

import java.io.Serializable;
import java.util.Collection;

import br.com.sramos.webservice.model.Marca;

public interface MarcaDAO extends Serializable{
	
	public Collection<Marca> buscarTodasMarcas();
	
	public Marca buscarMarcaPorId(Long idMarca);
}

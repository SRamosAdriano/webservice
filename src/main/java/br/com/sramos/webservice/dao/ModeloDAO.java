package br.com.sramos.webservice.dao;

import java.io.Serializable;
import java.util.Collection;

import br.com.sramos.webservice.model.Modelo;

public interface ModeloDAO extends Serializable{

	public Collection<Modelo> buscarTodosModelos();
	
	public Modelo buscarModeloPorId(Long idModelo);
}

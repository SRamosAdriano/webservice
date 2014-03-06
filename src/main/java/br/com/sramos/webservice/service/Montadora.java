package br.com.sramos.webservice.service;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import br.com.sramos.webservice.bo.MarcaBO;
import br.com.sramos.webservice.bo.ModeloBO;
import br.com.sramos.webservice.model.Marca;
import br.com.sramos.webservice.model.Modelo;

@Stateless
@WebService
public class Montadora implements MontadoraWS{

	@EJB
	MarcaBO marcaBO;
	
	@EJB
	ModeloBO modeloBO;
	
	@Override
	public Marca buscarMarcaPorId(Long idMarca) {
		Marca marca = marcaBO.buscarMarcaPorId(idMarca);
		return marca;
	}

	@Override
	public Collection<Marca> buscarTodasMarcas() {
		Collection<Marca> marcas = marcaBO.buscarTodasMarcas();
		return marcas;
	}

	@Override
	public Collection<Modelo> buscarTodosModelos() {
		Collection<Modelo> modelos = modeloBO.buscarTodosModelos();
		return modelos;
	}

	@Override
	public Modelo buscarModeloPorId(Long idModelo) {
		Modelo modelo = modeloBO.buscarModeloPorId(idModelo);
		return modelo;
	}
}

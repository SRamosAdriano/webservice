package br.com.sramos.webservice.service;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import br.com.sramos.webservice.bo.MarcaBO;
import br.com.sramos.webservice.model.Marca;

@Stateless
@WebService
public class Montadora implements MontadoraWS{

	@EJB
	MarcaBO marcaBO;
	
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
}

package br.com.sramos.webservice.service;

import java.util.Collection;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

import br.com.sramos.webservice.model.Marca;

@WebService
public interface MontadoraWS {
	
//	URL WSDL
//	http://localhost:8080/webservice/Montadora?wsdl
	
	@WebMethod
	public Marca buscarMarcaPorId(@XmlElement(required=true) @WebParam(name="idMarca") Long idMarca);
	
	@WebMethod
	public Collection<Marca> buscarTodasMarcas();
}

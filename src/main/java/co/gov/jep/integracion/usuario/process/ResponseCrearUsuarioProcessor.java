package co.gov.jep.integracion.usuario.process;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.http.MediaType;

import com.google.gson.Gson;

import co.gov.jep.integracion.contacto.model.CrearUsuarioResponse;
import co.gov.jep.integracion.contacto.model.Status;




public class ResponseCrearUsuarioProcessor implements Processor{

	public void process(Exchange exchange) throws Exception {
		
		  Gson gson = new Gson();
		  
		  CrearUsuarioResponse  crearUsuarioResponse = new CrearUsuarioResponse ();
	     

		  Status status = new Status();
		  status.setStatusDesc( (String)exchange.getProperty("descripcionTransaccion"));
		  status.setStatusCode("M0001");
		  crearUsuarioResponse.setStatus(status);
		  crearUsuarioResponse.setIdUsuario( (String)exchange.getProperty("idUsuario"));
		
		 String jsonString = gson.toJson(crearUsuarioResponse);
		
		exchange.getOut().setHeader(Exchange.HTTP_RESPONSE_CODE, 400);	
		exchange.getOut().setBody(jsonString);
		exchange.getOut().setHeader(Exchange.CONTENT_TYPE, MediaType.APPLICATION_JSON);	
		
		

	}





	

}

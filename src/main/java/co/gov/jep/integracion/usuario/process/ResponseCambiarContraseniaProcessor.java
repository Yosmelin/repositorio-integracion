package co.gov.jep.integracion.usuario.process;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.http.MediaType;

import com.google.gson.Gson;

import co.gov.jep.integracion.usuario.model.CambiarContraseniaResponse;
import co.gov.jep.integracion.usuario.model.Status;

public class ResponseCambiarContraseniaProcessor implements Processor{

	public void process(Exchange exchange) throws Exception {
		
		  Gson gson = new Gson();
	     
		  CambiarContraseniaResponse cambiarContraseniaResponse = new CambiarContraseniaResponse();
		  
		  
		  
		Status status = new Status();
		  status.setStatusDesc( (String)exchange.getProperty("descripcionTransaccion"));
		  status.setStatusCode("M0001");
		  cambiarContraseniaResponse.setStatus(status);
		  cambiarContraseniaResponse.setIdUsuario( (String)exchange.getProperty("idUsuario"));
		  
		 String jsonString = gson.toJson(cambiarContraseniaResponse);
		 
		 
		 
		 
		 
		
		exchange.getOut().setHeader(Exchange.HTTP_RESPONSE_CODE, 400);	
		exchange.getOut().setBody(jsonString);
		exchange.getOut().setHeader(Exchange.CONTENT_TYPE, MediaType.APPLICATION_JSON);	
		
	}

	}

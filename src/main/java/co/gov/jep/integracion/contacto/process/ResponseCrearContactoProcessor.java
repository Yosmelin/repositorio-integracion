package co.gov.jep.integracion.contacto.process;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.http.MediaType;

import com.google.gson.Gson;

import co.gov.jep.entidades.comun.Status;




public class ResponseCrearContactoProcessor  implements Processor {

	public void process(Exchange exchange) throws Exception {

		Gson gson = new Gson();

		Status response = new Status();
		response.setStatusDesc((String) exchange.getProperty("descripcionTransaccion"));
		response.setStatusCode("M0001");
		String jsonString = gson.toJson(response);

		exchange.getOut().setHeader(Exchange.HTTP_RESPONSE_CODE, 400);
		exchange.getOut().setBody(jsonString);
		exchange.getOut().setHeader(Exchange.CONTENT_TYPE, MediaType.APPLICATION_JSON);

	}

}





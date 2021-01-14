package co.gov.jep.integracion.contacto.process;

import java.util.ArrayList;
import java.util.List;

import co.gov.jep.entidades.contacto.Contacto;
import co.gov.jep.integracion.contacto.model.Contact;
import co.gov.jep.integracion.contacto.model.MainAddress;

public class ResquestMapping {
	
	public Contact crearContactoMapping(Contacto contacto ) { 
		
		
		Contact contact = new Contact();
		
		contact.setDocumentType(contacto.getTipoDeDocuento());
		contact.setDocumentNumber(contacto.getNumeroDeDocumento());
		contact.setFirstName(contacto.getPrimerNombre());
		contact.setMiddleName(contacto.getSegundoNombre());
		contact.setLastName(contacto.getPrimerApellido());
		contact.setSecondLastName(contacto.getSegundoApellido());
		contact.setBirthDate(contacto.getFechaDeNacimiento());
		contact.setAge(contacto.getEdad());
		contact.setGenre(contacto.getGenero());
		contact.setMaritalStatus(contacto.getEstadoCivil());
		contact.setSexualOrientation(contacto.getOrientacionSexual());
		contact.setEtareo(contacto.getEtareo());
		contact.setDisability(contacto.getDiscapacidad());
		contact.setEthnicGroup(contacto.getGrupoEtnico());
		contact.setGenderIdentity(contacto.getIdentidadDeGenero());
		contact.setIDLegaliPersona(contacto.getIDLegaliPersona());
		
   List<MainAddress> listMainAddress = new ArrayList<MainAddress>();
		for (int i = 0; i < contacto.getDireccionPrincipal().size(); i++) {
			MainAddress mainAddress= new MainAddress();
			
			mainAddress.setTerritory(contacto.getDireccionPrincipal().get(i).getTerritorio());
			mainAddress.setAddressType(contacto.getDireccionPrincipal().get(i).getTipoDeDireccion());
			mainAddress.setAddress(contacto.getDireccionPrincipal().get(i).getDireccionPrincipal());
			mainAddress.setSource(contacto.getDireccionPrincipal().get(i).getOrigenDireccion());
			mainAddress.setCountry(contacto.getDireccionPrincipal().get(i).getPais());
			mainAddress.setDepartment(contacto.getDireccionPrincipal().get(i).getDepartamento());
			mainAddress.setCity(contacto.getDireccionPrincipal().get(i).getMunicipio());
			mainAddress.setInspeccion(contacto.getDireccionPrincipal().get(i).getInspeccion());
			mainAddress.setCorregimiento(contacto.getDireccionPrincipal().get(i).getCorregimiento());
			mainAddress.setFarm(contacto.getDireccionPrincipal().get(i).getGranja());
			mainAddress.setNeighborhood(contacto.getDireccionPrincipal().get(i).getBarrio());
			mainAddress.setPopulated(contacto.getDireccionPrincipal().get(i).getCentroPoblado());
			mainAddress.setETCR(contacto.getDireccionPrincipal().get(i).getCodigoEtcr());
			mainAddress.setDetentionCenter(contacto.getDireccionPrincipal().get(i).getCentroDeReclusion());
			mainAddress.setOtherSite(contacto.getDireccionPrincipal().get(i).getOtroSitio());
			mainAddress.setPhoneNumber(contacto.getDireccionPrincipal().get(i).getTelefono());
			mainAddress.setMovil(contacto.getDireccionPrincipal().get(i).getCelular());
			mainAddress.setEmail(contacto.getDireccionPrincipal().get(i).getCorreoElectronico());
			
			listMainAddress.add(mainAddress);
		}

contact.setMainAddress(listMainAddress);
		
		return contact;
		
	
		
		
	};

}

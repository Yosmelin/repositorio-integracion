package co.gov.jep.integracion.usuario.model;



public class CambiarContraseniaResponse {
	
	
    private Status Status;
	private String idUsuario;
	public Status getStatus() {
		return Status;
	}
	public void setStatus(Status status) {
		Status = status;
	}
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	} 
	
	
}


package co.gov.jep.integracion.contacto.model;

import java.util.List;

public class Contacto {

    private String tipoDeDocuento;
    private String numeroDeDocumento;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String fechaDeNacimiento;
    private Integer edad;
    private String genero;
    private String estadoCivil;
    private String orientacionSexual;
    private String etareo;
    private String discapacidad;
    private String grupoEtnico;
    private String identidadDeGenero;
    private String iDLegaliPersona;
    private List<DireccionPrincipal> direccionPrincipal = null;
   
    public String getTipoDeDocuento() {
        return tipoDeDocuento;
    }

    public void setTipoDeDocuento(String tipoDeDocuento) {
        this.tipoDeDocuento = tipoDeDocuento;
    }

    public String getNumeroDeDocumento() {
        return numeroDeDocumento;
    }

    public void setNumeroDeDocumento(String numeroDeDocumento) {
        this.numeroDeDocumento = numeroDeDocumento;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getOrientacionSexual() {
        return orientacionSexual;
    }

    public void setOrientacionSexual(String orientacionSexual) {
        this.orientacionSexual = orientacionSexual;
    }

    public String getEtareo() {
        return etareo;
    }

    public void setEtareo(String etareo) {
        this.etareo = etareo;
    }

    public String getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(String discapacidad) {
        this.discapacidad = discapacidad;
    }

    public String getGrupoEtnico() {
        return grupoEtnico;
    }

    public void setGrupoEtnico(String grupoEtnico) {
        this.grupoEtnico = grupoEtnico;
    }

    public String getIdentidadDeGenero() {
        return identidadDeGenero;
    }

    public void setIdentidadDeGenero(String identidadDeGenero) {
        this.identidadDeGenero = identidadDeGenero;
    }

    public String getIDLegaliPersona() {
        return iDLegaliPersona;
    }

    public void setIDLegaliPersona(String iDLegaliPersona) {
        this.iDLegaliPersona = iDLegaliPersona;
    }

    public List<DireccionPrincipal> getDireccionPrincipal() {
        return direccionPrincipal;
    }

    public void setDireccionPrincipal(List<DireccionPrincipal> direccionPrincipal) {
        this.direccionPrincipal = direccionPrincipal;
    }

   
}

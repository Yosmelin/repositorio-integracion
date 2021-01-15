
package co.gov.jep.integracion.contacto.model;

import java.util.HashMap;
import java.util.Map;

public class DireccionPrincipal {

    private String territorio;
    private String tipoDeDireccion;
    private String direccionPrincipal;
    private String origenDireccion;
    private String pais;
    private String departamento;
    private String municipio;
    private String inspeccion;
    private String corregimiento;
    private String granja;
    private String barrio;
    private String centroPoblado;
    private String codigoEtcr;
    private String centroDeReclusion;
    private String otroSitio;
    private String telefono;
    private Integer celular;
    private String correoElectronico;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getTerritorio() {
        return territorio;
    }

    public void setTerritorio(String territorio) {
        this.territorio = territorio;
    }

    public String getTipoDeDireccion() {
        return tipoDeDireccion;
    }

    public void setTipoDeDireccion(String tipoDeDireccion) {
        this.tipoDeDireccion = tipoDeDireccion;
    }

    public String getDireccionPrincipal() {
        return direccionPrincipal;
    }

    public void setDireccionPrincipal(String direccionPrincipal) {
        this.direccionPrincipal = direccionPrincipal;
    }

    public String getOrigenDireccion() {
        return origenDireccion;
    }

    public void setOrigenDirecciN(String origenDireccion) {
        this.origenDireccion = origenDireccion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getInspeccion() {
        return inspeccion;
    }

    public void setInspeccion(String inspeccion) {
        this.inspeccion = inspeccion;
    }

    public String getCorregimiento() {
        return corregimiento;
    }

    public void setCorregimiento(String corregimiento) {
        this.corregimiento = corregimiento;
    }

    public String getGranja() {
        return granja;
    }

    public void setGranja(String granja) {
        this.granja = granja;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCentroPoblado() {
        return centroPoblado;
    }

    public void setCentroPoblado(String centroPoblado) {
        this.centroPoblado = centroPoblado;
    }

    public String getCodigoEtcr() {
        return codigoEtcr;
    }

    public void setCodigoEtcr(String codigoEtcr) {
        this.codigoEtcr = codigoEtcr;
    }

    public String getCentroDeReclusion() {
        return centroDeReclusion;
    }

    public void setCentroDeReclusion(String centroDeReclusion) {
        this.centroDeReclusion = centroDeReclusion;
    }

    public String getOtroSitio() {
        return otroSitio;
    }

    public void setOtroSitio(String otroSitio) {
        this.otroSitio = otroSitio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

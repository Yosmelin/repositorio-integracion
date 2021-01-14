
package co.gov.jep.integracion.contacto.model;

import java.util.HashMap;
import java.util.Map;

public class MainAddress {

    private String territory;
    private String addressType;
    private String address;
    private String source;
    private String country;
    private String department;
    private String city;
    private String inspeccion;
    private String corregimiento;
    private String farm;
    private String neighborhood;
    private String populated;
    private String eTCR;
    private String detentionCenter;
    private String otherSite;
    private String phoneNumber;
    private Integer movil;
    private String email;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public String getFarm() {
        return farm;
    }

    public void setFarm(String farm) {
        this.farm = farm;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getPopulated() {
        return populated;
    }

    public void setPopulated(String populated) {
        this.populated = populated;
    }

    public String getETCR() {
        return eTCR;
    }

    public void setETCR(String eTCR) {
        this.eTCR = eTCR;
    }

    public String getDetentionCenter() {
        return detentionCenter;
    }

    public void setDetentionCenter(String detentionCenter) {
        this.detentionCenter = detentionCenter;
    }

    public String getOtherSite() {
        return otherSite;
    }

    public void setOtherSite(String otherSite) {
        this.otherSite = otherSite;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getMovil() {
        return movil;
    }

    public void setMovil(Integer movil) {
        this.movil = movil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


package co.gov.jep.integracion.contacto.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Contact {

    private String documentType;
    private String documentNumber;
    private String firstName;
    private String middleName;
    private String lastName;
    private String secondLastName;
    private String birthDate;
    private Integer age;
    private String genre;
    private String maritalStatus;
    private String sexualOrientation;
    private String etareo;
    private String disability;
    private String ethnicGroup;
    private String genderIdentity;
    private String iDLegaliPersona;
    private List<MainAddress> mainAddress = null;
    

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getSexualOrientation() {
        return sexualOrientation;
    }

    public void setSexualOrientation(String sexualOrientation) {
        this.sexualOrientation = sexualOrientation;
    }

    public String getEtareo() {
        return etareo;
    }

    public void setEtareo(String etareo) {
        this.etareo = etareo;
    }

    public String getDisability() {
        return disability;
    }

    public void setDisability(String disability) {
        this.disability = disability;
    }

    public String getEthnicGroup() {
        return ethnicGroup;
    }

    public void setEthnicGroup(String ethnicGroup) {
        this.ethnicGroup = ethnicGroup;
    }

    public String getGenderIdentity() {
        return genderIdentity;
    }

    public void setGenderIdentity(String genderIdentity) {
        this.genderIdentity = genderIdentity;
    }

    public String getIDLegaliPersona() {
        return iDLegaliPersona;
    }

    public void setIDLegaliPersona(String iDLegaliPersona) {
        this.iDLegaliPersona = iDLegaliPersona;
    }

    public List<MainAddress> getMainAddress() {
        return mainAddress;
    }

    public void setMainAddress(List<MainAddress> mainAddress) {
        this.mainAddress = mainAddress;
    }

   

}

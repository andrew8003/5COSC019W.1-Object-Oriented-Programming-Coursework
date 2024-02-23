
package com.mycompany.westminsterskinconsultationmanager;

public class Doctor extends Person {
    private String medicalLicenseNumber;
    private String specialisation;

    // Get and set methods
    public String getMedicalLicenseNumber() {
        return this.medicalLicenseNumber;
    }

    public void setMedicalLicenseNumber(String medicalLicenseNumber) {
        this.medicalLicenseNumber = medicalLicenseNumber;
    }

    public String getSpecialisation() {
        return this.specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }
    
    public String toString(){
    return "\nName : " + name + "\nSurname : " + surname+"\nMedical Lisence : "+medicalLicenseNumber+"\nSpecialisation :  "+specialisation+"\nMobile Number : "+ mobileNumber;
    }
    void docPrint(){
    System.out.println("Lisence Number:" + medicalLicenseNumber);
    System.out.println("sepecialization:" + specialisation);
    }
}

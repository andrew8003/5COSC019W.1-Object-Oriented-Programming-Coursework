package com.mycompany.westminsterskinconsultationmanager;

import java.time.LocalDate;

public class Person {

    String name;
    String surname;
    String dob;
    String mobileNumber;

    // Get and set methods for each attribute
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDob() {
        return this.dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    
    public String toString(){
    return name + " " + surname +" "+dob+" "+mobileNumber;
    }
    
    
}
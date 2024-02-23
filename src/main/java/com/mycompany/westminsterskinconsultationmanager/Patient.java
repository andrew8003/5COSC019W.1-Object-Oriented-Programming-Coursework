package com.mycompany.westminsterskinconsultationmanager;

public class Patient extends Person {
    private int patientId;

    // Get and set methods for the patient ID attribute
    public int getPatientId() {
        return this.patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
}

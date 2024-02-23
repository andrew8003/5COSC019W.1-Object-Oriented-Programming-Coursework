package com.mycompany.westminsterskinconsultationmanager;

public interface SkinConsultationManager {
    // Method to add a new doctor to the list
    public void addDoctor(Doctor doctor);

    // Method to delete a doctor from the list
    public void deleteDoctor(Doctor doctor);

    // Method to add a new consultation
    public void addConsultation(Consultation consultation);

    // Method to cancel a consultation
    public void cancelConsultation(Consultation consultation);

    // Method to print a list of consultations
    public void printConsultations();

    // Method to save a list of consultations to a file
    public void saveConsultations(String fileName);
}
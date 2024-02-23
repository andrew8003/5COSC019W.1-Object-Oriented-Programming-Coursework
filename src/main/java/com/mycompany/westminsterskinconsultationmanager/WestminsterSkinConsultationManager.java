package com.mycompany.westminsterskinconsultationmanager;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFrame;

public class WestminsterSkinConsultationManager implements SkinConsultationManager {
    private static String dcotorlist;
    private List<Doctor> doctors;
    static int doctorCount = 0;
    private static int PatId = 0;

    // Constructor to initialize the list of doctors
    public WestminsterSkinConsultationManager() {
        this.doctors = new ArrayList<>();
    }


    public static void quit(){
    System.exit(0);
    }
    public static void addDoc(){
        String data;
        Scanner sc = new Scanner(System.in);
        Doctor doctor2 = new Doctor();
        System.out.print("Please enter doctor name: "); 
        data =(sc.nextLine());
        doctor2.setName(data);
        System.out.print("Please enter doctor surname: "); 
        data =(sc.nextLine());
        doctor2.setSurname(data);
        System.out.print("Please enter doctor lisence number: "); 
        data =(sc.nextLine());
        doctor2.setMedicalLicenseNumber(data);
        System.out.print("Please enter doctor specialisation: "); 
        data =(sc.nextLine());
        doctor2.setSpecialisation(data);
        System.out.print("Please enter doctor Mobile Number: "); 
        data =(sc.nextLine());
        doctor2.setMobileNumber(data);
        doctorCount ++;
        mainMenu();
    
    }
    
    public static void deleteDoc(){
    
    }
    public static void saveFile(){
    
    }
    public static void GUI(){
    Gui Gui = new Gui();
    Gui.setVisible(true);
    Gui.setSize(900, 500);
    Gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainMenu();
    }
    public static void mainMenu(){
            // menu 
        System.out.println("----------------------------------------");
        System.out.println("Add Doctor              - Press A");
        System.out.println("Delete Doctor           - Press D");
        System.out.println("Print List Of Doctors   - Press P");
        System.out.println("Save Data               - Press S");
        System.out.println("GUI Option              - Press G");
        System.out.println("Quit                    - Press Q");
        System.out.println("----------------------------------------");
        Scanner sc = new Scanner(System.in);
      char mainMenu = sc.next().charAt(0);
      if(mainMenu == 'a' || mainMenu == 'A'){
              addDoc();
              }else if(mainMenu == 'd' || mainMenu == 'D'){
              deleteDoc();
              }
              else if(mainMenu == 'p' || mainMenu == 'P'){
              
              }
              else if(mainMenu == 's' || mainMenu == 'S'){
              saveFile();
              }
              else if(mainMenu == 'q' || mainMenu == 'Q'){
              quit();
              // option to quit program
              }
              else if(mainMenu == 'g' || mainMenu == 'G'){
              GUI();
              // option to quit program
              }
              else{
              System.out.println("Please only enter the options printed");
              mainMenu();
              }
    }
    // Main method to run the program
    public static void main(String[] args) {
        
        //pre add doctor 
        Doctor doctor1 = new Doctor();
        doctor1.setName("John");
        doctor1.setSurname("Smith");
        doctor1.setMedicalLicenseNumber("123456");
        doctor1.setSpecialisation("Dermatology");
        doctor1.setMobileNumber("07934010441");
        doctorCount ++;
        
        //pre add patient
        PatId++;
        Patient patient1 = new Patient();
        patient1.setName("Julie");
        patient1.setSurname("Walters");
        patient1.setDob("22/10/2000");
        patient1.setMobileNumber("07964105445");
        patient1.setPatientId(PatId);
        
        // Create and add consultations to the manager
        Consultation consultation1 = new Consultation();
        consultation1.setDate(LocalDate.of(2022, 12, 7));
        consultation1.setTimeSlot("09:00 - 10:00");
        consultation1.setCost(100.00);
        consultation1.setNotes("no notes");
        
        mainMenu();
        WestminsterSkinConsultationManager manager = new WestminsterSkinConsultationManager();
        
        //print all doctor1
        System.out.println("doctor 1 -  " + doctor1);
        

     
        
        
    }

    @Override
    public void addDoctor(Doctor doctor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteDoctor(Doctor doctor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addConsultation(Consultation consultation) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void cancelConsultation(Consultation consultation) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void printConsultations() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void saveConsultations(String fileName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
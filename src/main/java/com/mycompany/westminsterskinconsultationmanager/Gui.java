package com.mycompany.westminsterskinconsultationmanager;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Gui extends JFrame{
    
    public Gui(){
        super("Skin Consultation Centre");
        // Panel p1 for the numbers
        JPanel p1 = new JPanel();
        p1.setBackground(Color.gray);
        
        
        ;
        
        JButton addConsultation = new JButton("Add Consultation");
        addConsultation.setPreferredSize(new Dimension(300, 140));
        p1.add(addConsultation);
        
        JButton viewDoc = new JButton("View Doctors");
        viewDoc.setPreferredSize(new Dimension(300, 140));
        p1.add (viewDoc);
        
        

        
        
        viewDoc.setBackground(Color.WHITE);
        viewDoc.setOpaque(true);
        viewDoc.setBorderPainted(false);
        viewDoc.setForeground(Color.BLACK);
        viewDoc.setFont(new Font("Arial", Font.BOLD, 30));
        
        
        //panel p2 for the operations
        JPanel p2 = new JPanel();
        p2.setBackground(Color.gray);
        
        
        JButton addPatient = new JButton("Add Patient");
        addPatient.setPreferredSize(new Dimension(300, 140));
        p2.add(addPatient);
        
        JButton checkAvail = new JButton("Check Availability");
        checkAvail.setPreferredSize(new Dimension(300, 140));
        p2.add(checkAvail);
        
        // set color for "+", "-" and "Clear"
        addConsultation.setBackground(Color.WHITE);
        addConsultation.setOpaque(true);
        addConsultation.setBorderPainted(false);
        addConsultation.setForeground(Color.BLACK);
        addConsultation.setFont(new Font("Arial", Font.BOLD, 30));
        
        
        addPatient.setBackground(Color.WHITE);
        addPatient.setOpaque(true);
        addPatient.setBorderPainted(false);
        addPatient.setForeground(Color.BLACK);
        addPatient.setFont(new Font("Arial", Font.BOLD, 30));
        
        checkAvail.setBackground(Color.WHITE);
        checkAvail.setOpaque(true);
        checkAvail.setBorderPainted(false);
        checkAvail.setForeground(Color.BLACK);
        checkAvail.setFont(new Font("Arial", Font.BOLD, 30));

        //panel p3 that combines p1 and p2
        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(1, 2));
        p3.add(p1);
        p3.add(p2);
        
      
        this.add(p3, BorderLayout.CENTER);
        
            
        
        
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
        Gui Gui = new Gui();
        Gui.setVisible(true);
        Gui.setSize(900, 500);
        Gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projwork;
import javax.swing.JFrame;


/**
 *
 * @author nohea
 */
public class Main extends JFrame {
    public static void main(String args[])
    {
        MainFrame menu = new MainFrame();
        menu.setVisible(true);
        BookFrame bookFrame = new BookFrame();
        bookFrame.setVisible(false);
        ThesisFrame thesisFrame = new ThesisFrame();
        thesisFrame.setVisible(false);
        DissertationFrame dissFrame = new DissertationFrame();
        dissFrame.setVisible(false);
        ConferenceFrame conFrame = new ConferenceFrame();
        conFrame.setVisible(false);
        JournalFrame journalFrame = new JournalFrame();
        journalFrame.setVisible(false);
        ResearchFrame researchFrame = new ResearchFrame();
        researchFrame.setVisible(false);
        MagazineFrame magFrame = new MagazineFrame();
        magFrame.setVisible(false);
        
        
        
        
        
    }
}

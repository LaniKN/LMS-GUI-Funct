/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projwork;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;


/**
 *
 * @author nohea
 */
public class Main extends JFrame {
    
    // Variables
    public static List<Book> bookSuper = new ArrayList<>();
    public static List<Thesis> thesisSuper = new ArrayList<>();
    public static List<Dissertation> dissertationSuper = new ArrayList<>();
    public static List<ConferencePaper> conferenceSuper = new ArrayList<>();
    public static List<JournalPaper> journalSuper = new ArrayList<>();
    public static List<ResearchReport> researchSuper = new ArrayList<>();
    public static List<Magazine> magazineSuper = new ArrayList<>();
    
   
    
    
    //selected items
     public static String itemSelected;
     public static Book bookSelected = new Book();
     public static Thesis thesisSelected;
     public static Dissertation dissSelected;
     public static ConferencePaper conSelected;
     public static Magazine magSelected;
     public static JournalPaper jourSelected;
     public static ResearchReport resSelected;
    
     
    //models
     public DefaultListModel<Publication> listOfItems = new DefaultListModel<>();
    
    //Use this function to iterate through item sin the JTextField for author/commitee member lists
    public List<Author> setAuthors(String txtField){
        List<Author> author = new ArrayList<Author>();
        String[] arrAuthors = txtField.split(";");
        for(String a : arrAuthors){
            String[] arrName = a.split(" ");
            author.add(new Author(arrName[0], arrName[1]));
        }
        return author;
    }


    public List<CommitteeMember> setCommitteeMems(String txtField){
        List<CommitteeMember> cmem = new ArrayList<>();
        String[] arrMembers = txtField.split(";");
        for(String a : arrMembers){
            a = a.trim();
            String[] arrChar = a.split(" ");
            cmem.add(new CommitteeMember(arrChar[0], arrChar[1]));
        }
        return cmem;
    }
    
    public void addBook(Book book) {
        for (Book sBook : bookSuper) {
            if (!book.equals(sBook)) {
               bookSuper.add(book); 
            }
        }
    }
    public void addThesis(Thesis thesis) {
        for (Thesis sThesis : thesisSuper) {
            if (!thesis.equals(sThesis)) {
               thesisSuper.add(thesis); 
            }
        }
    }
    public void addDiss(Dissertation diss) {
        for (Dissertation sDiss : dissertationSuper) {
            if (!diss.equals(sDiss)) {
               dissertationSuper.add(diss);
            }
        }
        
    }
    public void addCon(ConferencePaper con) {
        for (ConferencePaper sCon : conferenceSuper) {
            if (!con.equals(sCon)) {
               conferenceSuper.add(con);
            }
        }
        
    }
    public void addResearch(ResearchReport res) {
        for (ResearchReport sRes : researchSuper) {
            if (!res.equals(sRes)) {
               researchSuper.add(res);
            }
        }
    }
    public void addJournal(JournalPaper journal) {
        for (JournalPaper sJour : journalSuper) {
            if (!journal.equals(sJour)) {
               journalSuper.add(journal);
            }
        }
        
    }
    public void addMag(Magazine mag) {
        for (Magazine sMag : magazineSuper) {
            if (!mag.equals(sMag)) {
               magazineSuper.add(mag);
            }
        }
        
    }
    
    public void remBook(Book book) {
        bookSuper.remove(book);
    }
    public void remThesis(Thesis thesis) {
        thesisSuper.remove(thesis);
    }
    public void remDiss(Dissertation diss) {
        dissertationSuper.remove(diss);
    }
    public void remCon(ConferencePaper con) {
        conferenceSuper.remove(con);
    }
    public void remResearch(ResearchReport research) {
        researchSuper.remove(research);
    }
    public void remJournal(JournalPaper journal) {
        journalSuper.remove(journal);
    }
    public void remMag(Magazine mag) {
        magazineSuper.remove(mag);
    }

    
    private static final MainFrame menu = new MainFrame();
    
    public void backMenu(){
        menu.setVisible(true);
    }
    
    
    public static void main(String args[])
    {
        menu.setVisible(true);
    }
}

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
    //Super lists, we will be editting, adding, and removing from these!!!
//    public List<Book> bookSuper;
//    public List<Thesis> thesisSuper;
//    public List<Dissertation> dissertationSuper;
//    public List<ConferencePaper> conferenceSuper;
//    public List<JournalPaper> journalSuper;
//    public List<ResearchReport> researchSuper;
//    public List<Magazine> magazineSuper;
    
    
    public List<Book> bookSuper = new ArrayList<>();
    public List<Thesis> thesisSuper = new ArrayList<>();
    public List<Dissertation> dissertationSuper = new ArrayList<>();
    public List<ConferencePaper> conferenceSuper = new ArrayList<>();
    public List<JournalPaper> journalSuper = new ArrayList<>();
    public List<ResearchReport> researchSuper = new ArrayList<>();
    public List<Magazine> magazineSuper = new ArrayList<>();
    
   
    
    
    //selected items
     public Book bookSelected;
     public Thesis thesisSelected;
     public Dissertation dissSelected;
     public ConferencePaper conSelected;
     public Magazine magSelected;
     public JournalPaper jourSelected;
     public ResearchReport resSelected;
    
     
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
        bookSuper.add(book);
    }
    public void addThesis(Thesis thesis) {
        thesisSuper.add(thesis);
    }
    public void addDiss(Dissertation diss) {
        dissertationSuper.add(diss);
    }
    public void addCon(ConferencePaper con) {
        conferenceSuper.add(con);
    }
    public void addResearch(ResearchReport research) {
        researchSuper.add(research);
    }
    public void addJournal(JournalPaper journal) {
        journalSuper.add(journal);
    }
    public void addMag(Magazine mag) {
        magazineSuper.add(mag);
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
    
    public void setBook(Book book) {
        bookSelected = book;
    }
    public void setThesis(Thesis thesis) {
        thesisSelected = thesis;
    }
    public void setDiss(Dissertation diss) {
        dissSelected = diss;
    }
    public void setCon(ConferencePaper con) {
        conSelected = con;
    }
    public void setResearch(ResearchReport res) {
        resSelected = res;
    }
    public void setJournal(JournalPaper journal) {
        jourSelected = journal;
    }
    public void setMag(Magazine mag) {
        magSelected = mag;
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

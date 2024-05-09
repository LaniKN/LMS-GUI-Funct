/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projwork;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JList;


/**
 *
 * @author nohea
 */
public class Main extends JFrame {
    
    // Variables
    //Super lists, we will be editting, adding, and removing from these!!!
    public List<Book> bookSuper = new ArrayList<Book>();
    public List<Thesis> thesisSuper = new ArrayList<Thesis>();
    public List<Dissertation> dissertationSuper = new ArrayList<Dissertation>();
    public List<ConferencePaper> conferenceSuper = new ArrayList<ConferencePaper>();
    public List<JournalPaper> journalSuper = new ArrayList<JournalPaper>();
    public List<ResearchReport> researchSuper = new ArrayList<ResearchReport>();
    public List<Magazine> magazineSuper = new ArrayList<Magazine>();


    //Filter Lists, these are the "filters" we will use to take txt box inputs from user to find SUPER obj to find/edit
    public List<Book> bookFilter = new ArrayList<Book>();
    public List<Thesis> thesisFitler = new ArrayList<Thesis>();
    public List<Dissertation> dissertationFilter = new ArrayList<Dissertation>();
    public List<ConferencePaper> conferenceFilter = new ArrayList<ConferencePaper>();
    public List<JournalPaper> journalFilter = new ArrayList<JournalPaper>();
    public List<ResearchReport> researchFilter = new ArrayList<ResearchReport>();
    public List<Magazine> magazineFilter = new ArrayList<Magazine>();

    //Show JLists
    public JList<Book> bookList;
    public JList<Thesis> thesisList;
    public JList<Dissertation> dissertationList;
    public JList<ConferencePaper> conferenceList;
    public JList<JournalPaper> journalList;
    public JList<ResearchReport> researchList;
    public JList<Magazine> magazineList;


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
        List<CommitteeMember> cmem = new ArrayList<CommitteeMember>();
        String[] arrMembers = txtField.split(";");
        for(String a : arrMembers){
            String[] arrChar = a.split(" ");
            cmem.add(new CommitteeMember(arrChar[0], arrChar[1]));
        }
        return cmem;
    }
    
    public static void main(String args[])
    {
        MainFrame menu = new MainFrame();
        menu.setVisible(true);
    }
}

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
    
    
    //selected items
     public Book bookSelected = new Book();
     public Thesis thesisSelected = new Thesis();
     public Dissertation dissSelected = new Dissertation();
     public ConferencePaper conSelected = new ConferencePaper();
     public Magazine magSelected = new Magazine();
    
     
    //models
    public DefaultListModel bookModel = new DefaultListModel();
    public DefaultListModel thesisModel = new DefaultListModel();
    public DefaultListModel dissModel = new DefaultListModel();
    public DefaultListModel conModel = new DefaultListModel();
    public DefaultListModel journalModel = new DefaultListModel();
    public DefaultListModel researchModel = new DefaultListModel();
    public DefaultListModel magModel = new DefaultListModel();
    

    //Show JLists
    public JList bookList = new JList(bookModel);
    public JList thesisList = new JList(thesisModel);
    public JList dissertationList = new JList(dissModel);
    public JList conferenceList = new JList(conModel);
    public JList journalList = new JList(journalModel);
    public JList researchList = new JList(researchModel);
    public JList magazineList = new JList(magModel);

    
    

    //Use this function to iterate through item sin the JTextField for author/commitee member lists
    public List<Author> setAuthors(String txtField){
        List<Author> author = new ArrayList<Author>();
        String[] arrAuthors = txtField.split(";");
        for(String a : arrAuthors){
            String[] arrName = a.split(" ");
            System.out.println(arrName.length);
            author.add(new Author(arrName[0], arrName[1]));
        }
        return author;
    }


    public List<CommitteeMember> setCommitteeMems(String txtField){
        List<CommitteeMember> cmem = new ArrayList<CommitteeMember>();
        String[] arrMembers = txtField.split(";");
        for(String a : arrMembers){
            a = a.trim();
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

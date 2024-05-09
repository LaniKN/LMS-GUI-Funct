/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projwork;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.DefaultListModel;

/**
 *
 * @author nohea
 */
public class MainFrame extends Main {
    
    /**
     * Creates new form NewJFrame
     * public String title, pubYear;
    public int authNum;
    public Publisher publisher;
    public Chapters chap;
    public Figures fig;
    private int edNum;
     */
    //1st run: set up some default values
    public MainFrame() {
        initComponents();
        bookSuper = new ArrayList<>();
        thesisSuper = new ArrayList<>();
        dissertationSuper = new ArrayList<>();
        conferenceSuper = new ArrayList<>();
        journalSuper = new ArrayList<>();
        researchSuper = new ArrayList<>();
        magazineSuper = new ArrayList<>();
        
        //filter var established
        bookFilter = new ArrayList<>();
        thesisFitler = new ArrayList<>();
        dissertationFilter = new ArrayList<>();
        conferenceFilter = new ArrayList<>();
        journalFilter = new ArrayList<>();
        researchFilter = new ArrayList<>();
        magazineFilter = new ArrayList<>();
                
        //do this below for all types like 2-3 times
        bookSuper.add(new Book());
        bookSuper.add(new Book());
        thesisSuper.add(new Thesis());
        thesisSuper.add(new Thesis());
        dissertationSuper.add(new Dissertation());
        dissertationSuper.add(new Dissertation());
        conferenceSuper.add(new ConferencePaper());
        conferenceSuper.add(new ConferencePaper());
        journalSuper.add(new JournalPaper());
        journalSuper.add(new JournalPaper());
        researchSuper.add(new ResearchReport());
        researchSuper.add(new ResearchReport());
        magazineSuper.add(new Magazine());
        magazineSuper.add(new Magazine()); 
        
        
        //below is for testing of list population
//        for(Book book : super.bookSuper) {
//            super.listOfItems.addElement(book);
//        }
//        
//        for (Thesis thesis : super.thesisSuper) {
//            super.listOfItems.addElement(thesis);
//        }
//        
//        for (Dissertation diss : super.dissertationSuper) {
//            super.listOfItems.addElement(diss);
//        }
//        
//        for (ConferencePaper con : super.conferenceSuper) {
//            super.listOfItems.addElement(con);
//        }
//        
//        for (JournalPaper journal : super.journalSuper) {
//            super.listOfItems.addElement(journal);
//        }
//        
//        for (ResearchReport research : super.researchSuper) {
//            super.listOfItems.addElement(research);
//        }
//        
//        for (Magazine mag : super.magazineSuper) {
//            super.listOfItems.addElement(mag);
//        }
        
    }
    
    public MainFrame(Boolean back, Book newBook) {
        initComponents();
        bookSuper.add(newBook);
        super.listOfItems.clear();
    }
    
    public MainFrame(Boolean back, Thesis newThesis) {
        initComponents();
        thesisSuper.add(newThesis);
        super.listOfItems.clear();
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchTypeBtnGroup = new javax.swing.ButtonGroup();
        RootPanel = new javax.swing.JPanel();
        MainMenuTabs = new javax.swing.JTabbedPane();
        SearchPane = new javax.swing.JPanel();
        InnerBodyPanel = new javax.swing.JPanel();
        searchTitleLabel = new javax.swing.JLabel();
        searchTitleTxt = new javax.swing.JTextField();
        searchAuthorLabel = new javax.swing.JLabel();
        searchAuthorTxt = new javax.swing.JTextField();
        searchPubYearLabel = new javax.swing.JLabel();
        searchPubYearTxt = new javax.swing.JTextField();
        searchTypePanel = new javax.swing.JPanel();
        searchTypeBookBtn = new javax.swing.JRadioButton();
        searchTypeThesisBtn = new javax.swing.JRadioButton();
        searchTypeDissertationBtn = new javax.swing.JRadioButton();
        searchTypeConferenceBtn = new javax.swing.JRadioButton();
        searchTypeResearchBtn = new javax.swing.JRadioButton();
        searchTypeJournalBtn = new javax.swing.JRadioButton();
        searchTypeMagazineBtn = new javax.swing.JRadioButton();
        searchBtn = new javax.swing.JButton();
        searchScrollpane = new javax.swing.JScrollPane();
        searchResultList = new javax.swing.JList<>(super.listOfItems);
        ItmSearchDescLabel = new javax.swing.JLabel();
        ItmSearchLabel = new javax.swing.JLabel();
        addItemBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        GenReportPane = new javax.swing.JPanel();
        genReportBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        genReportTree = new javax.swing.JTree();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RootPanel.setBackground(new java.awt.Color(32, 58, 78));

        MainMenuTabs.setBackground(new java.awt.Color(203, 211, 217));
        MainMenuTabs.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N

        SearchPane.setBackground(new java.awt.Color(60, 91, 118));
        SearchPane.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        searchTitleLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        searchTitleLabel.setText("Title:");

        searchTitleTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        searchAuthorLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        searchAuthorLabel.setText("Author:");

        searchAuthorTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        searchPubYearLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        searchPubYearLabel.setText("Publication Year:");

        searchPubYearTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        searchTypePanel.setBackground(new java.awt.Color(203, 211, 217));

        searchTypeBtnGroup.add(searchTypeBookBtn);
        searchTypeBookBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        searchTypeBookBtn.setText("Book");

        searchTypeBtnGroup.add(searchTypeThesisBtn);
        searchTypeThesisBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        searchTypeThesisBtn.setText("Thesis");

        searchTypeBtnGroup.add(searchTypeDissertationBtn);
        searchTypeDissertationBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        searchTypeDissertationBtn.setText("Dissertation");

        searchTypeBtnGroup.add(searchTypeConferenceBtn);
        searchTypeConferenceBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        searchTypeConferenceBtn.setText("Conference Paper");

        searchTypeBtnGroup.add(searchTypeResearchBtn);
        searchTypeResearchBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        searchTypeResearchBtn.setText("Research Report");

        searchTypeBtnGroup.add(searchTypeJournalBtn);
        searchTypeJournalBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        searchTypeJournalBtn.setText("Journal Paper");

        searchTypeBtnGroup.add(searchTypeMagazineBtn);
        searchTypeMagazineBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        searchTypeMagazineBtn.setText("Magazine");

        javax.swing.GroupLayout searchTypePanelLayout = new javax.swing.GroupLayout(searchTypePanel);
        searchTypePanel.setLayout(searchTypePanelLayout);
        searchTypePanelLayout.setHorizontalGroup(
            searchTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchTypePanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(searchTypeBookBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchTypeThesisBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchTypeDissertationBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchTypeConferenceBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchTypeResearchBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchTypeJournalBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchTypeMagazineBtn)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        searchTypePanelLayout.setVerticalGroup(
            searchTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchTypePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(searchTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTypeBookBtn)
                    .addComponent(searchTypeThesisBtn)
                    .addComponent(searchTypeDissertationBtn)
                    .addComponent(searchTypeConferenceBtn)
                    .addComponent(searchTypeResearchBtn)
                    .addComponent(searchTypeJournalBtn)
                    .addComponent(searchTypeMagazineBtn))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        searchBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        searchResultList.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        searchResultList.setModel(super.listOfItems);
        searchResultList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        searchScrollpane.setViewportView(searchResultList);

        javax.swing.GroupLayout InnerBodyPanelLayout = new javax.swing.GroupLayout(InnerBodyPanel);
        InnerBodyPanel.setLayout(InnerBodyPanelLayout);
        InnerBodyPanelLayout.setHorizontalGroup(
            InnerBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InnerBodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InnerBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InnerBodyPanelLayout.createSequentialGroup()
                        .addComponent(searchTypePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(InnerBodyPanelLayout.createSequentialGroup()
                        .addComponent(searchTitleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchAuthorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchAuthorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchPubYearLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchPubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InnerBodyPanelLayout.createSequentialGroup()
                        .addComponent(searchScrollpane)
                        .addContainerGap())))
        );
        InnerBodyPanelLayout.setVerticalGroup(
            InnerBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InnerBodyPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(InnerBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTitleLabel)
                    .addComponent(searchTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchAuthorLabel)
                    .addComponent(searchAuthorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchPubYearLabel)
                    .addComponent(searchPubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchTypePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchScrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
        );

        ItmSearchDescLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        ItmSearchDescLabel.setForeground(new java.awt.Color(250, 250, 250));
        ItmSearchDescLabel.setText("Item Search");
        ItmSearchDescLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ItmSearchLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        ItmSearchLabel.setForeground(new java.awt.Color(250, 250, 250));
        ItmSearchLabel.setText("Please select the type of item you are looking for.");

        addItemBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        addItemBtn.setText("Add Item of Selected Type");
        addItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemBtnActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jButton1.setText("Edit/Remove Selected Item");

        javax.swing.GroupLayout SearchPaneLayout = new javax.swing.GroupLayout(SearchPane);
        SearchPane.setLayout(SearchPaneLayout);
        SearchPaneLayout.setHorizontalGroup(
            SearchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPaneLayout.createSequentialGroup()
                .addGroup(SearchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchPaneLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(SearchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SearchPaneLayout.createSequentialGroup()
                                .addComponent(ItmSearchLabel)
                                .addGap(45, 45, 45)
                                .addComponent(addItemBtn)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addComponent(ItmSearchDescLabel)))
                    .addGroup(SearchPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(InnerBodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SearchPaneLayout.setVerticalGroup(
            SearchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPaneLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(ItmSearchDescLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SearchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItmSearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addItemBtn)
                    .addComponent(jButton1))
                .addGap(23, 23, 23)
                .addComponent(InnerBodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        MainMenuTabs.addTab("Search", SearchPane);

        GenReportPane.setBackground(new java.awt.Color(60, 91, 118));
        GenReportPane.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N

        genReportBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        genReportBtn.setText("Generate Report");

        genReportTree.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(genReportTree);

        javax.swing.GroupLayout GenReportPaneLayout = new javax.swing.GroupLayout(GenReportPane);
        GenReportPane.setLayout(GenReportPaneLayout);
        GenReportPaneLayout.setHorizontalGroup(
            GenReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GenReportPaneLayout.createSequentialGroup()
                .addGroup(GenReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GenReportPaneLayout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(genReportBtn))
                    .addGroup(GenReportPaneLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        GenReportPaneLayout.setVerticalGroup(
            GenReportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GenReportPaneLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(genReportBtn)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        MainMenuTabs.addTab("Generate Report", GenReportPane);

        javax.swing.GroupLayout RootPanelLayout = new javax.swing.GroupLayout(RootPanel);
        RootPanel.setLayout(RootPanelLayout);
        RootPanelLayout.setHorizontalGroup(
            RootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainMenuTabs)
        );
        RootPanelLayout.setVerticalGroup(
            RootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainMenuTabs)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RootPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RootPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemBtnActionPerformed
        // TODO add your handling code here:
        
        for(Enumeration<AbstractButton> buttons = searchTypeBtnGroup.getElements() ; buttons.hasMoreElements();)
        {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                this.setVisible(false);
                String type = button.getText();
                if (type.contains("Book")){
                    BookFrame bookFrame = new BookFrame(1);
                    bookFrame.setVisible(true);
                    this.setVisible(false);
                } else if (type.contains("Thesis")) {
                    ThesisFrame thesisFrame = new ThesisFrame(1);
                    thesisFrame.setVisible(true);
                } else if (type.contains("Dissert")) {
                    DissertationFrame dissFrame = new DissertationFrame(1);
                    dissFrame.setVisible(true);
                } else if (type.contains("Conf")) {
                    ConferenceFrame conFrame = new ConferenceFrame(1);
                    conFrame.setVisible(true);
                } else if (type.contains("Journal")) {
                    JournalFrame journalFrame = new JournalFrame(1);
                    journalFrame.setVisible(true);
                } else if (type.contains("Research")) {
                    ResearchFrame researchFrame = new ResearchFrame(1);
                    researchFrame.setVisible(true);
                } else if (type.contains("Magazine")) {
                    MagazineFrame magFrame = new MagazineFrame(1);
                    magFrame.setVisible(true);
                }
                
            }
        }
        
        //Testing
        /*
        System.out.println("Add button pressed");
        this.setVisible(true);
        bookFrame.setVisible(true);
        */
    }//GEN-LAST:event_addItemBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        for(Enumeration<AbstractButton> buttons = searchTypeBtnGroup.getElements() ; buttons.hasMoreElements();)
        {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                String type = button.getText();
                
                //is title txt empty?
                if (!searchTitleTxt.getText().isEmpty()) { //has title
                    String titleFilter = searchTitleTxt.getText();
                    System.out.println("Has Text");
                    
                    //is it a magazine?
                    if (!type.contains("Magazine")) { //not magazine
                        
                        if (!searchAuthorTxt.getText().isEmpty()){//has author
                            List<Author> authors = super.setAuthors(searchAuthorTxt.getText());
                            System.out.println("Got author list from txt");
                            
                            //is the pubYear filled in?
                            if (!searchPubYearTxt.getText().isEmpty()) {//pub year
                                System.out.println("Pub year set");
                                String pubYearFilter = searchPubYearTxt.getText();
                                if (type.contains("Book")){
                                    System.out.println("Type is Book");
                                    System.out.println("Is bookSuper populated?: " + super.bookSuper.size());
                                       for (Book book : super.bookSuper) {
                                           System.out.println("Book: " + book.title);
                                           for (Author author : authors){
                                               System.out.println("Author check: " + author);
                                               for (int a = 0; a < book.authNum-1; a++){
                                                   System.out.println("Author check: " + author);
                                                   System.out.println("Author in book: " + book.author_list[a]);
                                                    if (book.title.contains(titleFilter) && book.author_list[a].equals(author) && book.pubYear.contains(pubYearFilter)) {
                                                        super.bookFilter.add(book);
                                                        super.listOfItems.addElement(book);
                                                        searchResultList.setModel(super.listOfItems);
                                                        System.out.println("Should be showing updated List");
                                                    }
                                               }
                                           }
                                       }
                                } else if (type.contains("Thesis")) {
                                    //super.bookModel.clear();
                                       for (Thesis thesis : super.thesisSuper) {
                                           for (Author author : authors){
                                               for (int a = 0; a < thesis.author_list.length-1; a++){
                                                    if (thesis.title.contains(titleFilter) && thesis.author_list[a].equals(author) && thesis.pubYear.contains(pubYearFilter)) {
                                                        super.thesisFitler.add(thesis);
//                                                        super.bookModel.addElement(book);
//                                                        searchResultList.setModel(super.bookModel);
//                                                        this.setVisible(true);
                                                    }
                                               }
                                           }
                                       }
                                } else if (type.contains("Dissert")) {

                                } else if (type.contains("Conf")) {

                                } else if (type.contains("Journal")) {

                                } else if (type.contains("Research")) {

                                }

                            } else {//does not have pub year
                                
                            }
                        } else {//does not have author
                            
                        }
                        
                    } else { //is magazine
                        
                    }
            
                } else { //does not have title

                }
            }
        }
        
    }//GEN-LAST:event_searchBtnActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */ 
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GenReportPane;
    private javax.swing.JPanel InnerBodyPanel;
    private javax.swing.JLabel ItmSearchDescLabel;
    private javax.swing.JLabel ItmSearchLabel;
    private javax.swing.JTabbedPane MainMenuTabs;
    private javax.swing.JPanel RootPanel;
    private javax.swing.JPanel SearchPane;
    private javax.swing.JButton addItemBtn;
    private javax.swing.JButton genReportBtn;
    private javax.swing.JTree genReportTree;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel searchAuthorLabel;
    private javax.swing.JTextField searchAuthorTxt;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel searchPubYearLabel;
    private javax.swing.JTextField searchPubYearTxt;
    public javax.swing.JList<Publication> searchResultList;
    private javax.swing.JScrollPane searchScrollpane;
    private javax.swing.JLabel searchTitleLabel;
    private javax.swing.JTextField searchTitleTxt;
    private javax.swing.JRadioButton searchTypeBookBtn;
    private javax.swing.ButtonGroup searchTypeBtnGroup;
    private javax.swing.JRadioButton searchTypeConferenceBtn;
    private javax.swing.JRadioButton searchTypeDissertationBtn;
    private javax.swing.JRadioButton searchTypeJournalBtn;
    private javax.swing.JRadioButton searchTypeMagazineBtn;
    private javax.swing.JPanel searchTypePanel;
    private javax.swing.JRadioButton searchTypeResearchBtn;
    private javax.swing.JRadioButton searchTypeThesisBtn;
    // End of variables declaration//GEN-END:variables
}

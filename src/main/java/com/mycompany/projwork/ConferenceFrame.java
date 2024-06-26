package com.mycompany.projwork;

import java.util.List;
import javax.swing.JList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author nohea
 */
public class ConferenceFrame extends Main {

    /**
     * Creates new form EditRemoveConference
     */
    public ConferenceFrame() {
        initComponents();
    }
    
    public ConferenceFrame(int type) {
        initComponents();
        if (type == 1) {
            editConferenceBtn.setVisible(false);
            removeConferenceBtn.setVisible(false);
        } else {
            addConferenceBtn.setVisible(false);
            eRConferenceTitleTxt.setText(super.conSelected.getTitle());
            eRConferenceNameTxt.setText(super.conSelected.conferenceName);
            String[] dates = super.conSelected.period.toString().split("-");
            eRConferenceBeginDateTxt.setText(dates[0]);
            eRConferenceEndDateTxt.setText(dates[1]);
            eRConferenceLocationTxt.setText(super.conSelected.location.toString());
            for(int i = 0; i < super.conSelected.author_list.length ; i++){
                eRConferenceAuthorTxt.setText(super.conSelected.author_list[i].toString());
                System.out.println(super.conSelected.author_list[i].toString());
            }
            eRConferencePubYearTxt.setText(super.conSelected.getPubYear());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ConferenceRootPanel = new javax.swing.JPanel();
        editRemoveConferenceLabel = new javax.swing.JLabel();
        editRemoveConferencePanel = new javax.swing.JPanel();
        eRConferenceTitleLabel = new javax.swing.JLabel();
        eRConferenceTitleTxt = new javax.swing.JTextField();
        eRConferencePubYearLabel = new javax.swing.JLabel();
        eRConferencePubYearTxt = new javax.swing.JTextField();
        eRConferenceNameLabel = new javax.swing.JLabel();
        eRConferenceNameTxt = new javax.swing.JTextField();
        eRConferenceBeginDateLabel = new javax.swing.JLabel();
        eRConferenceBeginDateTxt = new javax.swing.JFormattedTextField();
        eRConferenceEndDateLabel = new javax.swing.JLabel();
        eRConferenceEndDateTxt = new javax.swing.JFormattedTextField();
        eRConferenceLocationLabel = new javax.swing.JLabel();
        eRConferenceLocationTxt = new javax.swing.JTextField();
        eRConferenceAuthorInstrucLabel = new javax.swing.JLabel();
        eRConferenceAuthorLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        eRConferenceAuthorTxt = new javax.swing.JTextArea();
        removeConferenceBtn = new javax.swing.JButton();
        editConferenceBtn = new javax.swing.JButton();
        addConferenceBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ConferenceRootPanel.setBackground(new java.awt.Color(60, 91, 118));

        editRemoveConferenceLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        editRemoveConferenceLabel.setForeground(new java.awt.Color(250, 250, 250));
        editRemoveConferenceLabel.setText("Add/Edit/Remove Conference Paper");

        eRConferenceTitleLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        eRConferenceTitleLabel.setText("Title:");

        eRConferenceTitleTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        eRConferencePubYearLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        eRConferencePubYearLabel.setText("Publication Year:");

        eRConferencePubYearTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        eRConferenceNameLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        eRConferenceNameLabel.setText("Conference Name:");

        eRConferenceNameTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        eRConferenceBeginDateLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        eRConferenceBeginDateLabel.setText("Start Date:");

        eRConferenceBeginDateTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        eRConferenceBeginDateTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        eRConferenceEndDateLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        eRConferenceEndDateLabel.setText("End Date:");

        eRConferenceEndDateTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        eRConferenceEndDateTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        eRConferenceLocationLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        eRConferenceLocationLabel.setText("Location:");

        eRConferenceLocationTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        eRConferenceAuthorInstrucLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        eRConferenceAuthorInstrucLabel.setText("Enter the author(s) of the conference paper. If there are multiple, seprate them by a semicolon. (;)");

        eRConferenceAuthorLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        eRConferenceAuthorLabel.setText("Authors:");

        eRConferenceAuthorTxt.setColumns(20);
        eRConferenceAuthorTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        eRConferenceAuthorTxt.setRows(5);
        jScrollPane1.setViewportView(eRConferenceAuthorTxt);

        removeConferenceBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        removeConferenceBtn.setText("Remove Conference Paper");
        removeConferenceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeConferenceBtnActionPerformed(evt);
            }
        });

        editConferenceBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        editConferenceBtn.setText("Edit Conference Paper");
        editConferenceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editConferenceBtnActionPerformed(evt);
            }
        });

        addConferenceBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        addConferenceBtn.setText("Add Conference Paper");
        addConferenceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addConferenceBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editRemoveConferencePanelLayout = new javax.swing.GroupLayout(editRemoveConferencePanel);
        editRemoveConferencePanel.setLayout(editRemoveConferencePanelLayout);
        editRemoveConferencePanelLayout.setHorizontalGroup(
            editRemoveConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editRemoveConferencePanelLayout.createSequentialGroup()
                .addGroup(editRemoveConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editRemoveConferencePanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(editRemoveConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(eRConferenceNameLabel)
                            .addComponent(eRConferenceTitleLabel)
                            .addComponent(eRConferencePubYearLabel)
                            .addComponent(eRConferenceBeginDateLabel)
                            .addComponent(eRConferenceLocationLabel))
                        .addGap(18, 18, 18)
                        .addGroup(editRemoveConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eRConferenceTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eRConferencePubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eRConferenceNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(editRemoveConferencePanelLayout.createSequentialGroup()
                                .addComponent(eRConferenceBeginDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(eRConferenceEndDateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(eRConferenceEndDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(eRConferenceLocationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(editRemoveConferencePanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(eRConferenceAuthorInstrucLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(editRemoveConferencePanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(eRConferenceAuthorLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(editRemoveConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeConferenceBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editRemoveConferencePanelLayout.createSequentialGroup()
                        .addGroup(editRemoveConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addConferenceBtn)
                            .addComponent(editConferenceBtn))
                        .addGap(19, 19, 19)))
                .addGap(24, 24, 24))
        );
        editRemoveConferencePanelLayout.setVerticalGroup(
            editRemoveConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editRemoveConferencePanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(editRemoveConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eRConferenceTitleLabel)
                    .addComponent(eRConferenceTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editRemoveConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eRConferencePubYearLabel)
                    .addComponent(eRConferencePubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editRemoveConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eRConferenceNameLabel)
                    .addComponent(eRConferenceNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editRemoveConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eRConferenceBeginDateLabel)
                    .addComponent(eRConferenceBeginDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eRConferenceEndDateLabel)
                    .addComponent(eRConferenceEndDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editRemoveConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eRConferenceLocationLabel)
                    .addComponent(eRConferenceLocationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(eRConferenceAuthorInstrucLabel)
                .addGroup(editRemoveConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editRemoveConferencePanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(editRemoveConferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eRConferenceAuthorLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editRemoveConferencePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addConferenceBtn)
                        .addGap(18, 18, 18)
                        .addComponent(editConferenceBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removeConferenceBtn)
                        .addGap(53, 53, 53))))
        );

        backBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        backBtn.setText("Back to Search");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ConferenceRootPanelLayout = new javax.swing.GroupLayout(ConferenceRootPanel);
        ConferenceRootPanel.setLayout(ConferenceRootPanelLayout);
        ConferenceRootPanelLayout.setHorizontalGroup(
            ConferenceRootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConferenceRootPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(editRemoveConferenceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(31, 31, 31))
            .addGroup(ConferenceRootPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editRemoveConferencePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ConferenceRootPanelLayout.setVerticalGroup(
            ConferenceRootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConferenceRootPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(ConferenceRootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editRemoveConferenceLabel)
                    .addComponent(backBtn))
                .addGap(28, 28, 28)
                .addComponent(editRemoveConferencePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ConferenceRootPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ConferenceRootPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        super.backMenu();
    }//GEN-LAST:event_backBtnActionPerformed

    private void addConferenceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addConferenceBtnActionPerformed
        // TODO add your handling code here:
        if(eRConferenceTitleTxt.getText().isEmpty() && eRConferencePubYearTxt.getText().isEmpty() && eRConferenceAuthorTxt.getText().isEmpty() && eRConferenceNameTxt.getText().isEmpty() && eRConferenceLocationTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please fill in all parameters for adding a conference paper!");
        } else {
            //calling setAuthors to parse through text field for authors of new book
            List<Author> authors = super.setAuthors(eRConferenceAuthorTxt.getText());

            //number of authors for array size in classes
            int numAuthors = authors.size();


            //for Location and Period
            Location addConferenceLocation = new Location(eRConferenceLocationTxt.getText());
            Period addConferencePeriod = new Period(eRConferenceBeginDateTxt.getText(), eRConferenceEndDateTxt.getText());


            //this bookSuper.add is the justAddedBook
            ConferencePaper justAddedConference =  new ConferencePaper(eRConferenceTitleTxt.getText(), eRConferencePubYearTxt.getText(), numAuthors, eRConferenceNameTxt.getText(), addConferenceLocation, addConferencePeriod);

            //outer part makes sure we get only 1 book, the most recent
            for(int i = 1; i>0; i--){
//                super.conferenceSuper.get(super.conferenceSuper.size()-1);
                //this for loop goes through array size for the number of authors in this new book
                for (int num = 0; num < numAuthors; num++){
                    //we are adding the Authors for each index in the author_list for the new book.
                  justAddedConference.author_list[num] = authors.get(numAuthors - (1+num));
                }
            }
            
            super.addCon(justAddedConference);
            this.setVisible(false);
            super.backMenu();
        }
        
    }//GEN-LAST:event_addConferenceBtnActionPerformed

    private void removeConferenceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeConferenceBtnActionPerformed
        int m = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (m == JOptionPane.YES_OPTION) {
            for (ConferencePaper con : conferenceSuper) {
                
                if (con.toString().equalsIgnoreCase(super.itemSelected.toString())) {
                    super.remCon(con);
                    this.setVisible(false);
                    super.backMenu();
                }
            }
        } else {
            System.exit(0);
        }            
    }//GEN-LAST:event_removeConferenceBtnActionPerformed

    private void editConferenceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editConferenceBtnActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        if(eRConferenceTitleTxt.getText().isEmpty() && eRConferencePubYearTxt.getText().isEmpty() && eRConferenceAuthorTxt.getText().isEmpty() && eRConferenceNameTxt.getText().isEmpty() && eRConferenceLocationTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please fill in all parameters for adding a conference paper!");
        } else {
            //calling setAuthors to parse through text field for authors of new book
            List<Author> authors = super.setAuthors(eRConferenceAuthorTxt.getText());

            //number of authors for array size in classes
            int numAuthors = authors.size();


            //for Location and Period
            Location addConferenceLocation = new Location(eRConferenceLocationTxt.getText());
            Period addConferencePeriod = new Period(eRConferenceBeginDateTxt.getText(), eRConferenceEndDateTxt.getText());


            //this bookSuper.add is the justAddedBook
            ConferencePaper justAddedConference =  new ConferencePaper(eRConferenceTitleTxt.getText(), eRConferencePubYearTxt.getText(), numAuthors, eRConferenceNameTxt.getText(), addConferenceLocation, addConferencePeriod);

            //outer part makes sure we get only 1 book, the most recent
            for(int i = 1; i>0; i--){
//                super.conferenceSuper.get(super.conferenceSuper.size()-1);
                //this for loop goes through array size for the number of authors in this new book
                for (int num = 0; num < numAuthors; num++){
                    //we are adding the Authors for each index in the author_list for the new book.
                  justAddedConference.author_list[num] = authors.get(numAuthors - (1+num));
                }
            }
            
            super.remCon(super.conSelected);
            super.addCon(justAddedConference);
            this.setVisible(false);
            super.backMenu();
        }
    }//GEN-LAST:event_editConferenceBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ConferenceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConferenceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConferenceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConferenceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConferenceFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ConferenceRootPanel;
    private javax.swing.JButton addConferenceBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel eRConferenceAuthorInstrucLabel;
    private javax.swing.JLabel eRConferenceAuthorLabel;
    private javax.swing.JTextArea eRConferenceAuthorTxt;
    private javax.swing.JLabel eRConferenceBeginDateLabel;
    private javax.swing.JFormattedTextField eRConferenceBeginDateTxt;
    private javax.swing.JLabel eRConferenceEndDateLabel;
    private javax.swing.JFormattedTextField eRConferenceEndDateTxt;
    private javax.swing.JLabel eRConferenceLocationLabel;
    private javax.swing.JTextField eRConferenceLocationTxt;
    private javax.swing.JLabel eRConferenceNameLabel;
    private javax.swing.JTextField eRConferenceNameTxt;
    private javax.swing.JLabel eRConferencePubYearLabel;
    private javax.swing.JTextField eRConferencePubYearTxt;
    private javax.swing.JLabel eRConferenceTitleLabel;
    private javax.swing.JTextField eRConferenceTitleTxt;
    private javax.swing.JButton editConferenceBtn;
    private javax.swing.JLabel editRemoveConferenceLabel;
    private javax.swing.JPanel editRemoveConferencePanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeConferenceBtn;
    // End of variables declaration//GEN-END:variables
}

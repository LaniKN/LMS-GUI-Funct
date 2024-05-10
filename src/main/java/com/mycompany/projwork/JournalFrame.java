package com.mycompany.projwork;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.util.List;
import javax.swing.JList;
import javax.swing.JOptionPane;
/**
 *
 * @author nohea
 */
public class JournalFrame extends Main {

    /**
     * Creates new form JournalFrame
     */
    public JournalFrame() {
        initComponents();
    }
    
    public JournalFrame(int type) {
        initComponents();
        if (type == 1) {
            editJournalBtn.setVisible(false);
            removeJournalBtn.setVisible(false);
        } else {
            addJournalBtn.setVisible(false);
            eRJournalTitleTxt.setText(super.jourSelected.title);
            eRJournalAuthorTxt.setText(super.jourSelected.author_list.toString());
            eRJournalPubYearTxt.setText(super.jourSelected.pubYear);
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

        JournalRootPanel = new javax.swing.JPanel();
        editRemoveJournalLabel = new javax.swing.JLabel();
        editRemoveJournalPanel = new javax.swing.JPanel();
        eRJournalTitleLabel = new javax.swing.JLabel();
        eRJournalTitleTxt = new javax.swing.JTextField();
        eRJournalPubYearLabel = new javax.swing.JLabel();
        eRJournalPubYearTxt = new javax.swing.JTextField();
        eRJournalNameLabel = new javax.swing.JLabel();
        eRJournalNameTxt = new javax.swing.JTextField();
        eRJournalAuthorInstrucLabel = new javax.swing.JLabel();
        eRJournalAuthorLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        eRJournalAuthorTxt = new javax.swing.JTextArea();
        removeJournalBtn = new javax.swing.JButton();
        editJournalBtn = new javax.swing.JButton();
        addJournalBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JournalRootPanel.setBackground(new java.awt.Color(60, 91, 118));

        editRemoveJournalLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        editRemoveJournalLabel.setForeground(new java.awt.Color(250, 250, 250));
        editRemoveJournalLabel.setText("Add/Edit/Remove Journal Paper");

        eRJournalTitleLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        eRJournalTitleLabel.setText("Title:");

        eRJournalTitleTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        eRJournalPubYearLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        eRJournalPubYearLabel.setText("Publication Year:");

        eRJournalPubYearTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        eRJournalNameLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        eRJournalNameLabel.setText("Journal Name:");

        eRJournalNameTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        eRJournalAuthorInstrucLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        eRJournalAuthorInstrucLabel.setText("Enter the author(s) of the journal. If there are multiple, seprate them by a semicolon. (;)");

        eRJournalAuthorLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        eRJournalAuthorLabel.setText("Authors:");

        eRJournalAuthorTxt.setColumns(20);
        eRJournalAuthorTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        eRJournalAuthorTxt.setRows(5);
        jScrollPane1.setViewportView(eRJournalAuthorTxt);

        removeJournalBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        removeJournalBtn.setText("Remove Journal Paper");
        removeJournalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeJournalBtnActionPerformed(evt);
            }
        });

        editJournalBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        editJournalBtn.setText("Edit Journal Paper");
        editJournalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJournalBtnActionPerformed(evt);
            }
        });

        addJournalBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        addJournalBtn.setText("Add Journal Paper");
        addJournalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJournalBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editRemoveJournalPanelLayout = new javax.swing.GroupLayout(editRemoveJournalPanel);
        editRemoveJournalPanel.setLayout(editRemoveJournalPanelLayout);
        editRemoveJournalPanelLayout.setHorizontalGroup(
            editRemoveJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editRemoveJournalPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(eRJournalAuthorInstrucLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(editRemoveJournalPanelLayout.createSequentialGroup()
                .addGroup(editRemoveJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editRemoveJournalPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(eRJournalAuthorLabel)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editRemoveJournalPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(editRemoveJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(eRJournalPubYearLabel)
                            .addComponent(eRJournalTitleLabel)
                            .addComponent(eRJournalNameLabel))
                        .addGap(18, 18, 18)
                        .addGroup(editRemoveJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eRJournalPubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eRJournalNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                            .addComponent(eRJournalTitleTxt))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addGroup(editRemoveJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editRemoveJournalPanelLayout.createSequentialGroup()
                        .addComponent(removeJournalBtn)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editRemoveJournalPanelLayout.createSequentialGroup()
                        .addGroup(editRemoveJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addJournalBtn)
                            .addComponent(editJournalBtn))
                        .addGap(97, 97, 97))))
        );
        editRemoveJournalPanelLayout.setVerticalGroup(
            editRemoveJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editRemoveJournalPanelLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(editRemoveJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eRJournalTitleLabel)
                    .addComponent(eRJournalTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editRemoveJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eRJournalPubYearLabel)
                    .addComponent(eRJournalPubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editRemoveJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eRJournalNameLabel)
                    .addComponent(eRJournalNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(eRJournalAuthorInstrucLabel)
                .addGroup(editRemoveJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editRemoveJournalPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(editRemoveJournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eRJournalAuthorLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editRemoveJournalPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(addJournalBtn)
                        .addGap(18, 18, 18)
                        .addComponent(editJournalBtn)
                        .addGap(26, 26, 26)
                        .addComponent(removeJournalBtn)
                        .addGap(71, 71, 71))))
        );

        backBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        backBtn.setText("Back to Search");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JournalRootPanelLayout = new javax.swing.GroupLayout(JournalRootPanel);
        JournalRootPanel.setLayout(JournalRootPanelLayout);
        JournalRootPanelLayout.setHorizontalGroup(
            JournalRootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JournalRootPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(editRemoveJournalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(38, 38, 38))
            .addGroup(JournalRootPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editRemoveJournalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        JournalRootPanelLayout.setVerticalGroup(
            JournalRootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JournalRootPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(JournalRootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editRemoveJournalLabel)
                    .addComponent(backBtn))
                .addGap(18, 18, 18)
                .addComponent(editRemoveJournalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JournalRootPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JournalRootPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        super.backMenu();
    }//GEN-LAST:event_backBtnActionPerformed

    private void addJournalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJournalBtnActionPerformed
        // TODO add your handling code here:
        if(eRJournalTitleTxt.getText().isEmpty() && eRJournalPubYearTxt.getText().isEmpty() && eRJournalAuthorTxt.getText().isEmpty() && eRJournalNameTxt.getText().isEmpty()){

            JOptionPane.showMessageDialog(null,"Please fill in all parameters for adding a Journal!");
        } else {
            //calling setAuthors to parse through text field for authors of new book
            List<Author> authors = super.setAuthors(eRJournalAuthorTxt.getText());
            
            //number of authors for array size in classes
            int numAuthors = authors.size();

            //this bookSuper.add is the justAddedBook
            JournalPaper justAddedJournal = new JournalPaper(eRJournalTitleTxt.getText(), eRJournalPubYearTxt.getText(), numAuthors, eRJournalNameTxt.getText());

            
            //this for loop goes through array size for the number of authors in this new book
            for (int num = 0; num < numAuthors; num++){
                //we are adding the Authors for each index in the author_list for the new book.
              justAddedJournal.author_list[num] = authors.get(numAuthors - (1+num));
            }
            
            super.addJournal(justAddedJournal);
            this.setVisible(false);
            super.backMenu();

        }
    }//GEN-LAST:event_addJournalBtnActionPerformed

    private void removeJournalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeJournalBtnActionPerformed
        int m = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (m == JOptionPane.YES_OPTION) {
            for (JournalPaper jour : journalSuper) {
                if (jour.toString().equalsIgnoreCase(super.itemSelected.toString())) {
                    super.remJournal(jour);
                    this.setVisible(false);
                    super.backMenu();
                }
            }
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_removeJournalBtnActionPerformed

    private void editJournalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJournalBtnActionPerformed
        // TODO add your handling code here:
        if(eRJournalTitleTxt.getText().isEmpty() && eRJournalPubYearTxt.getText().isEmpty() && eRJournalAuthorTxt.getText().isEmpty() && eRJournalNameTxt.getText().isEmpty()){

            JOptionPane.showMessageDialog(null,"Please fill in all parameters for adding a Journal!");
        } else {
            //calling setAuthors to parse through text field for authors of new book
            List<Author> authors = super.setAuthors(eRJournalAuthorTxt.getText());
            
            //number of authors for array size in classes
            int numAuthors = authors.size();

            //this bookSuper.add is the justAddedBook
            JournalPaper justAddedJournal = new JournalPaper(eRJournalTitleTxt.getText(), eRJournalPubYearTxt.getText(), numAuthors, eRJournalNameTxt.getText());

            
            //this for loop goes through array size for the number of authors in this new book
            for (int num = 0; num < numAuthors; num++){
                //we are adding the Authors for each index in the author_list for the new book.
              justAddedJournal.author_list[num] = authors.get(numAuthors - (1+num));
            }
            
            super.remJournal(super.jourSelected);
            super.addJournal(justAddedJournal);
            this.setVisible(false);
            super.backMenu();

        }
    }//GEN-LAST:event_editJournalBtnActionPerformed

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
            java.util.logging.Logger.getLogger(JournalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JournalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JournalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JournalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JournalFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JournalRootPanel;
    private javax.swing.JButton addJournalBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel eRJournalAuthorInstrucLabel;
    private javax.swing.JLabel eRJournalAuthorLabel;
    private javax.swing.JTextArea eRJournalAuthorTxt;
    private javax.swing.JLabel eRJournalNameLabel;
    private javax.swing.JTextField eRJournalNameTxt;
    private javax.swing.JLabel eRJournalPubYearLabel;
    private javax.swing.JTextField eRJournalPubYearTxt;
    private javax.swing.JLabel eRJournalTitleLabel;
    private javax.swing.JTextField eRJournalTitleTxt;
    private javax.swing.JButton editJournalBtn;
    private javax.swing.JLabel editRemoveJournalLabel;
    private javax.swing.JPanel editRemoveJournalPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeJournalBtn;
    // End of variables declaration//GEN-END:variables
}

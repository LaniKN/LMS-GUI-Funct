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
public class ThesisFrame extends Main {

    /**
     * Creates new form EditRemoveThesis
     */
    public ThesisFrame() {
        initComponents();
    }
    
    //
    public ThesisFrame(int type) {
        initComponents();
        if (type == 1) {
            editThesisBtn.setVisible(false);
            removeThesisBtn.setVisible(false);
        } else {
            addThesisBtn.setVisible(false);
            eRThesisTitleTxt.setText(super.thesisSelected.title);
            eRThesisAuthorTxt.setText(super.thesisSelected.author_list.toString());
            eRThesisPubYearTxt.setText(super.thesisSelected.pubYear);
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

        jMenuItem1 = new javax.swing.JMenuItem();
        ThesisRootPanel = new javax.swing.JPanel();
        editRemoveThesisLabel = new javax.swing.JLabel();
        editRemoveThesisPanel = new javax.swing.JPanel();
        eRThesisTilteLabel = new javax.swing.JLabel();
        eRThesisTitleTxt = new javax.swing.JTextField();
        eRThesisPubYearLabel = new javax.swing.JLabel();
        eRThesisPubYearTxt = new javax.swing.JTextField();
        eRThesisDepLabel = new javax.swing.JLabel();
        eRThesisDepTxt = new javax.swing.JTextField();
        eRThesisDepBuildingLabel = new javax.swing.JLabel();
        eRThesisDepBuildingTxt = new javax.swing.JTextField();
        eRThesisChapLabel = new javax.swing.JLabel();
        eRThesisChapTxt = new javax.swing.JTextField();
        eRThesisFigLabel = new javax.swing.JLabel();
        eRThesisFigTxt = new javax.swing.JTextField();
        eRThesisAuthorLabel = new javax.swing.JLabel();
        eRThesisAuthorTxt = new javax.swing.JTextField();
        eRThesisComMemInstrucLabel = new javax.swing.JLabel();
        eRThesisComMemLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        eRThesisComMemTxt = new javax.swing.JTextArea();
        editThesisBtn = new javax.swing.JButton();
        removeThesisBtn = new javax.swing.JButton();
        addThesisBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ThesisRootPanel.setBackground(new java.awt.Color(60, 91, 118));

        editRemoveThesisLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        editRemoveThesisLabel.setForeground(new java.awt.Color(250, 250, 250));
        editRemoveThesisLabel.setText("Add/Edit/Remove Thesis");

        eRThesisTilteLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        eRThesisTilteLabel.setText("Title:");

        eRThesisTitleTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        eRThesisPubYearLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        eRThesisPubYearLabel.setText("Publication Year:");

        eRThesisPubYearTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        eRThesisDepLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        eRThesisDepLabel.setText("Department:");

        eRThesisDepTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        eRThesisDepBuildingLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        eRThesisDepBuildingLabel.setText("Building:");

        eRThesisDepBuildingTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        eRThesisChapLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        eRThesisChapLabel.setText("Chapters:");

        eRThesisChapTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        eRThesisFigLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        eRThesisFigLabel.setText("Number of Figures:");

        eRThesisFigTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        eRThesisAuthorLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        eRThesisAuthorLabel.setText("Author:");

        eRThesisAuthorTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        eRThesisComMemInstrucLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        eRThesisComMemInstrucLabel.setText("Enter the committee members, and committee name, and seprate them by a semicolon. (;)");

        eRThesisComMemLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        eRThesisComMemLabel.setText("Committee Members:");

        eRThesisComMemTxt.setColumns(20);
        eRThesisComMemTxt.setRows(5);
        jScrollPane1.setViewportView(eRThesisComMemTxt);

        editThesisBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        editThesisBtn.setText("Edit Thesis");

        removeThesisBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        removeThesisBtn.setText("Remove Thesis");
        removeThesisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeThesisBtnActionPerformed(evt);
            }
        });

        addThesisBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        addThesisBtn.setText("Add Thesis");
        addThesisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addThesisBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editRemoveThesisPanelLayout = new javax.swing.GroupLayout(editRemoveThesisPanel);
        editRemoveThesisPanel.setLayout(editRemoveThesisPanelLayout);
        editRemoveThesisPanelLayout.setHorizontalGroup(
            editRemoveThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editRemoveThesisPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(eRThesisComMemLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(removeThesisBtn)
                .addGap(71, 71, 71))
            .addGroup(editRemoveThesisPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(editRemoveThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(editRemoveThesisPanelLayout.createSequentialGroup()
                        .addGroup(editRemoveThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(editRemoveThesisPanelLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(eRThesisTilteLabel)
                                .addGap(18, 18, 18)
                                .addComponent(eRThesisTitleTxt))
                            .addGroup(editRemoveThesisPanelLayout.createSequentialGroup()
                                .addGroup(editRemoveThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(editRemoveThesisPanelLayout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(editRemoveThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(eRThesisDepLabel)
                                            .addComponent(eRThesisPubYearLabel)))
                                    .addComponent(eRThesisChapLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(editRemoveThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(editRemoveThesisPanelLayout.createSequentialGroup()
                                        .addGroup(editRemoveThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(eRThesisPubYearTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                            .addComponent(eRThesisDepTxt))
                                        .addGap(39, 39, 39)
                                        .addComponent(eRThesisDepBuildingLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(eRThesisDepBuildingTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(eRThesisChapTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(editRemoveThesisPanelLayout.createSequentialGroup()
                                .addGroup(editRemoveThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(eRThesisAuthorLabel)
                                    .addComponent(eRThesisFigLabel))
                                .addGap(18, 18, 18)
                                .addGroup(editRemoveThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eRThesisFigTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eRThesisAuthorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(154, 154, 154)
                        .addComponent(addThesisBtn))
                    .addGroup(editRemoveThesisPanelLayout.createSequentialGroup()
                        .addComponent(eRThesisComMemInstrucLabel)
                        .addGap(84, 84, 84)
                        .addComponent(editThesisBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        editRemoveThesisPanelLayout.setVerticalGroup(
            editRemoveThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editRemoveThesisPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(editRemoveThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eRThesisTilteLabel)
                    .addComponent(eRThesisTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editRemoveThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eRThesisPubYearLabel)
                    .addComponent(eRThesisPubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editRemoveThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eRThesisDepLabel)
                    .addComponent(eRThesisDepTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eRThesisDepBuildingLabel)
                    .addComponent(eRThesisDepBuildingTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editRemoveThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eRThesisChapLabel)
                    .addComponent(eRThesisChapTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editRemoveThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eRThesisFigLabel)
                    .addComponent(eRThesisFigTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editRemoveThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eRThesisAuthorLabel)
                    .addComponent(eRThesisAuthorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(eRThesisComMemInstrucLabel)
                .addGap(28, 28, 28)
                .addGroup(editRemoveThesisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eRThesisComMemLabel))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editRemoveThesisPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addThesisBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editThesisBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(removeThesisBtn)
                .addGap(154, 154, 154))
        );

        backBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        backBtn.setText("Back to Search");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ThesisRootPanelLayout = new javax.swing.GroupLayout(ThesisRootPanel);
        ThesisRootPanel.setLayout(ThesisRootPanelLayout);
        ThesisRootPanelLayout.setHorizontalGroup(
            ThesisRootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThesisRootPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(editRemoveThesisLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(70, 70, 70))
            .addGroup(ThesisRootPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editRemoveThesisPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ThesisRootPanelLayout.setVerticalGroup(
            ThesisRootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThesisRootPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(ThesisRootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editRemoveThesisLabel)
                    .addComponent(backBtn))
                .addGap(18, 18, 18)
                .addComponent(editRemoveThesisPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ThesisRootPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ThesisRootPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        super.backMenu();
    }//GEN-LAST:event_backBtnActionPerformed

    private void addThesisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addThesisBtnActionPerformed
        // TODO add your handling code here:
        if (eRThesisTitleTxt.getText().isEmpty() && eRThesisDepTxt.getText().isEmpty() && eRThesisPubYearTxt.getText().isEmpty() && eRThesisDepBuildingTxt.getText().isEmpty() && eRThesisFigTxt.getText().isEmpty() && eRThesisAuthorTxt.getText().isEmpty() && eRThesisComMemTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please fill in all parameters for adding a Thesis!");
        } else {
            //calling setComitteeMems to parse through text field for committee members and committee title of new dissertation/thesis
            List<CommitteeMember> committee = super.setCommitteeMems(eRThesisComMemTxt.getText());

            //number of authors for array size in classes
            int numCommittee = committee.size();

            //this bookSuper.add is the justAddedBook
            Department addThesisDepartment = new Department(eRThesisDepBuildingTxt.getText(), eRThesisDepTxt.getText());
            Chapters addThesisChapter = new Chapters(Integer.parseInt(eRThesisChapTxt.getText()));
            Figures addThesisFigure = new Figures(Integer.parseInt(eRThesisFigTxt.getText()));

            Thesis justAddedThesis =  new Thesis(eRThesisTitleTxt.getText(), eRThesisPubYearTxt.getText(), addThesisDepartment, numCommittee, addThesisChapter, addThesisFigure);
            // thesisSuper.author_list[0] = addThesisAuthorTxt.getText();
            

            //outer part makes sure we get only 1 book, the most recent
            for(int i = 1; i>0; i--){
                
                //this for loop goes through array size for the number of authors in this new book
                for (int num = 0; num < numCommittee; num++){
                    //we are adding the Authors for each index in the author_list for the new book.
                  justAddedThesis.committeeMembers[num] = committee.get(numCommittee - (1+num));
                }
            }
            
            super.addThesis(justAddedThesis);
            this.setVisible(false);
            super.backMenu();
    
        }
    }//GEN-LAST:event_addThesisBtnActionPerformed

    private void removeThesisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeThesisBtnActionPerformed
        int m = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (m == JOptionPane.YES_OPTION) {
            for (Thesis thesis : thesisSuper) {
                
                if (thesis.toString().equalsIgnoreCase(super.itemSelected.toString())) {
                    super.remThesis(thesis);
                    this.setVisible(false);
                    super.backMenu();
                    System.exit(0);
                }
            }
        } else {
            System.exit(0);
        }            
    }//GEN-LAST:event_removeThesisBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ThesisFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThesisFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThesisFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThesisFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThesisFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ThesisRootPanel;
    private javax.swing.JButton addThesisBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel eRThesisAuthorLabel;
    private javax.swing.JTextField eRThesisAuthorTxt;
    private javax.swing.JLabel eRThesisChapLabel;
    private javax.swing.JTextField eRThesisChapTxt;
    private javax.swing.JLabel eRThesisComMemInstrucLabel;
    private javax.swing.JLabel eRThesisComMemLabel;
    private javax.swing.JTextArea eRThesisComMemTxt;
    private javax.swing.JLabel eRThesisDepBuildingLabel;
    private javax.swing.JTextField eRThesisDepBuildingTxt;
    private javax.swing.JLabel eRThesisDepLabel;
    private javax.swing.JTextField eRThesisDepTxt;
    private javax.swing.JLabel eRThesisFigLabel;
    private javax.swing.JTextField eRThesisFigTxt;
    private javax.swing.JLabel eRThesisPubYearLabel;
    private javax.swing.JTextField eRThesisPubYearTxt;
    private javax.swing.JLabel eRThesisTilteLabel;
    private javax.swing.JTextField eRThesisTitleTxt;
    private javax.swing.JLabel editRemoveThesisLabel;
    private javax.swing.JPanel editRemoveThesisPanel;
    private javax.swing.JButton editThesisBtn;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeThesisBtn;
    // End of variables declaration//GEN-END:variables
}

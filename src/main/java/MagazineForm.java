/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author nohea
 */
public class MagazineForm extends javax.swing.JFrame {

    /**
     * Creates new form MagazineForm
     */
    public MagazineForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MagazineRootPanel = new javax.swing.JPanel();
        editRemoveMagazineLabel = new javax.swing.JLabel();
        editRemoveMagazinePanel = new javax.swing.JPanel();
        eRMagazineTitleLabel = new javax.swing.JLabel();
        eRMagazineTitleTxt = new javax.swing.JTextField();
        eRMagazinePubYearLabel = new javax.swing.JLabel();
        eRMagazinePubYearTxt = new javax.swing.JTextField();
        addMagazineBtn = new javax.swing.JButton();
        editMagazineBtn = new javax.swing.JButton();
        removeMagazineBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MagazineRootPanel.setBackground(new java.awt.Color(60, 91, 118));

        editRemoveMagazineLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        editRemoveMagazineLabel.setForeground(new java.awt.Color(250, 250, 250));
        editRemoveMagazineLabel.setText("Add/Edit/Remove Magazine");

        eRMagazineTitleLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        eRMagazineTitleLabel.setText("Title:");

        eRMagazineTitleTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        eRMagazineTitleTxt.setToolTipText("");

        eRMagazinePubYearLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        eRMagazinePubYearLabel.setText("Publication Year:");

        eRMagazinePubYearTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        addMagazineBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        addMagazineBtn.setText("Add Magazine");

        editMagazineBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        editMagazineBtn.setText("Edit Magazine");

        removeMagazineBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        removeMagazineBtn.setText("Remove Magazine");

        javax.swing.GroupLayout editRemoveMagazinePanelLayout = new javax.swing.GroupLayout(editRemoveMagazinePanel);
        editRemoveMagazinePanel.setLayout(editRemoveMagazinePanelLayout);
        editRemoveMagazinePanelLayout.setHorizontalGroup(
            editRemoveMagazinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editRemoveMagazinePanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(editRemoveMagazinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eRMagazineTitleLabel)
                    .addComponent(eRMagazinePubYearLabel))
                .addGap(18, 18, 18)
                .addGroup(editRemoveMagazinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eRMagazineTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eRMagazinePubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(editRemoveMagazinePanelLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(addMagazineBtn)
                .addGap(102, 102, 102)
                .addComponent(editMagazineBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(removeMagazineBtn)
                .addGap(93, 93, 93))
        );
        editRemoveMagazinePanelLayout.setVerticalGroup(
            editRemoveMagazinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editRemoveMagazinePanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(editRemoveMagazinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eRMagazineTitleLabel)
                    .addComponent(eRMagazineTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(editRemoveMagazinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eRMagazinePubYearLabel)
                    .addComponent(eRMagazinePubYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addGroup(editRemoveMagazinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMagazineBtn)
                    .addComponent(editMagazineBtn)
                    .addComponent(removeMagazineBtn))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        backBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        backBtn.setText("Back to Search");

        javax.swing.GroupLayout MagazineRootPanelLayout = new javax.swing.GroupLayout(MagazineRootPanel);
        MagazineRootPanel.setLayout(MagazineRootPanelLayout);
        MagazineRootPanelLayout.setHorizontalGroup(
            MagazineRootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MagazineRootPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(editRemoveMagazineLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(90, 90, 90))
            .addGroup(MagazineRootPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editRemoveMagazinePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        MagazineRootPanelLayout.setVerticalGroup(
            MagazineRootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MagazineRootPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(MagazineRootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backBtn)
                    .addComponent(editRemoveMagazineLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(editRemoveMagazinePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MagazineRootPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MagazineRootPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MagazineForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MagazineForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MagazineForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MagazineForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MagazineForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MagazineRootPanel;
    private javax.swing.JButton addMagazineBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel eRMagazinePubYearLabel;
    private javax.swing.JTextField eRMagazinePubYearTxt;
    private javax.swing.JLabel eRMagazineTitleLabel;
    private javax.swing.JTextField eRMagazineTitleTxt;
    private javax.swing.JButton editMagazineBtn;
    private javax.swing.JLabel editRemoveMagazineLabel;
    private javax.swing.JPanel editRemoveMagazinePanel;
    private javax.swing.JButton removeMagazineBtn;
    // End of variables declaration//GEN-END:variables
}

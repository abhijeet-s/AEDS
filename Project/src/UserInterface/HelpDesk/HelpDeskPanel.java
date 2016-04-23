/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HelpDesk;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.HelpDeskOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.ThreatRegistration.LoggingThreat;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import UserInterface.ThreatRegistration.LoggingThreat;
/**
 *
 * @author Abhijeet
 */
public class HelpDeskPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private HelpDeskOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    /**
     * Creates new form HelpDeskPanel
     */
    public HelpDeskPanel(JPanel upc, UserAccount account, HelpDeskOrganization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = upc;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnThreat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHelp = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        btnThreat.setText("Log Threat");
        btnThreat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreatActionPerformed(evt);
            }
        });

        tblHelp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Incident Id", "Name", "Description", "Phone"
            }
        ));
        jScrollPane1.setViewportView(tblHelp);

        jLabel1.setText("Active Incidents");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThreat)
                .addGap(119, 119, 119))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(btnThreat)
                .addContainerGap(108, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThreatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreatActionPerformed
        // TODO add your handling code here:

        LoggingThreat loggingThreatJPanel = new LoggingThreat(userProcessContainer, userAccount, enterprise);
        userProcessContainer.add("LoggingThreatJPanel", loggingThreatJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnThreatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThreat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHelp;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIWorkAdmin;

import Business.StoreDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author priyank
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private StoreDirectory storeDirectory;
    public AdminWorkAreaJPanel(JPanel userProcessContainer,StoreDirectory storeDirectory) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.storeDirectory = storeDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageStores = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnProductCatalog = new javax.swing.JButton();

        btnManageStores.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnManageStores.setText("Manage Stores >>");
        btnManageStores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageStoresActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Adminstrative Role");

        btnProductCatalog.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnProductCatalog.setText("Manage Product >>");
        btnProductCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductCatalogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnProductCatalog, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageStores, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(199, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 96, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 95, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(233, Short.MAX_VALUE)
                .addComponent(btnManageStores)
                .addGap(47, 47, 47)
                .addComponent(btnProductCatalog)
                .addGap(96, 96, 96))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 148, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 261, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageStoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageStoresActionPerformed
        ManageStores ms = new ManageStores(userProcessContainer, storeDirectory);
        userProcessContainer.add("ManageStoresAdministrative", ms);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageStoresActionPerformed

    private void btnProductCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductCatalogActionPerformed
        // TODO add your handling code here:
        ViewProduct vp = new ViewProduct(userProcessContainer, storeDirectory.getProductCatalog());
        userProcessContainer.add("ViewProduct", vp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnProductCatalogActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageStores;
    private javax.swing.JButton btnProductCatalog;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

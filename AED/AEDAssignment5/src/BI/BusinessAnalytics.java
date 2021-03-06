/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BI;

import Business.Business;
import Business.Customer;
import Business.MasterCatalog;
import Business.Product;
import Business.ProductCatalog;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Abhijeet;
 */

public class BusinessAnalytics extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Business business;
    /**
     * Creates new form BusinessAnalytics
     */
    public BusinessAnalytics(JPanel userProcessContainer, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTopSales = new javax.swing.JButton();
        btnMostPop = new javax.swing.JButton();
        btnAboveTarget = new javax.swing.JButton();
        btnBelowTarget = new javax.swing.JButton();
        btnBest = new javax.swing.JButton();
        btnTotal = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        btnTopSales.setText("The top 3 sales persons by sales volume");
        btnTopSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopSalesActionPerformed(evt);
            }
        });

        btnMostPop.setText("most popular product by sales volume");
        btnMostPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostPopActionPerformed(evt);
            }
        });

        btnAboveTarget.setText("For each sales person how many products sold above target price");
        btnAboveTarget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboveTargetActionPerformed(evt);
            }
        });

        btnBelowTarget.setText("For each sales person, how many products sold below target price");
        btnBelowTarget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBelowTargetActionPerformed(evt);
            }
        });

        btnBest.setText("Who is our best customer by sales volume");
        btnBest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBestActionPerformed(evt);
            }
        });

        btnTotal.setText("The total commission paid for each sales person");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBest, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTopSales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMostPop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAboveTarget, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBelowTarget, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(120, 120, 120))
            .addGroup(layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(btnTopSales)
                .addGap(36, 36, 36)
                .addComponent(btnMostPop)
                .addGap(32, 32, 32)
                .addComponent(btnAboveTarget)
                .addGap(34, 34, 34)
                .addComponent(btnBelowTarget)
                .addGap(43, 43, 43)
                .addComponent(btnBest)
                .addGap(38, 38, 38)
                .addComponent(btnTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTopSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopSalesActionPerformed
        // TODO add your handling code here:
        TopThree topThree = new TopThree(userProcessContainer,business);
           userProcessContainer.add("TopThree",topThree);
           CardLayout layout = (CardLayout)userProcessContainer.getLayout();
           layout.next(userProcessContainer); 
    }//GEN-LAST:event_btnTopSalesActionPerformed

    private void btnMostPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostPopActionPerformed
        // TODO add your handling code here:
        MasterCatalog moc = business.getMasterOrderCatalog();
        ProductCatalog pc = business.getProductCatalog();
        Product p = moc.getMostPopularProduct(pc);
         if(p!= null)
       {
        JOptionPane.showMessageDialog(this, p.getProdName(), "The Most Popular Product is ", JOptionPane.WARNING_MESSAGE);
       }
        else
       {
           JOptionPane.showMessageDialog(this, "No Products yet", "Sorry ", JOptionPane.WARNING_MESSAGE);
       } 
    }//GEN-LAST:event_btnMostPopActionPerformed

    private void btnAboveTargetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboveTargetActionPerformed
        // TODO add your handling code here:
         AboveTarget aboveTarget = new AboveTarget(userProcessContainer,business);
           userProcessContainer.add("AboveTarget",aboveTarget);
           CardLayout layout = (CardLayout)userProcessContainer.getLayout();
           layout.next(userProcessContainer); 
    }//GEN-LAST:event_btnAboveTargetActionPerformed

    private void btnBelowTargetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBelowTargetActionPerformed
        // TODO add your handling code here:
        BelowTarget belowTarget = new BelowTarget(userProcessContainer,business);
           userProcessContainer.add("BelowTarget",belowTarget);
           CardLayout layout = (CardLayout)userProcessContainer.getLayout();
           layout.next(userProcessContainer); 
    }//GEN-LAST:event_btnBelowTargetActionPerformed

    private void btnBestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBestActionPerformed
        // TODO add your handling code here:
       Customer Cust= business.getMasterOrderCatalog().getMostPopularCustomer(business.getCustomerCatalog());
       if(Cust!= null)
       {
       JOptionPane.showMessageDialog(this, Cust.getCustName(), "The Most Popular Customer is ", JOptionPane.WARNING_MESSAGE);
       }
       else
       {
           JOptionPane.showMessageDialog(this, "No Customer yet", "Sorry ", JOptionPane.WARNING_MESSAGE);
       }
    }//GEN-LAST:event_btnBestActionPerformed

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        // TODO add your handling code here:
         TotalCommision totalCommision = new TotalCommision(userProcessContainer,business);
           userProcessContainer.add("TotalCommision",totalCommision);
           CardLayout layout = (CardLayout)userProcessContainer.getLayout();
           layout.next(userProcessContainer); 
    }//GEN-LAST:event_btnTotalActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAboveTarget;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBelowTarget;
    private javax.swing.JButton btnBest;
    private javax.swing.JButton btnMostPop;
    private javax.swing.JButton btnTopSales;
    private javax.swing.JButton btnTotal;
    // End of variables declaration//GEN-END:variables
}

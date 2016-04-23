/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerWorkArea;

import Business.Enterprise.Enterprise;
import Business.Organization.CustomerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Transaction;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import static java.lang.Float.parseFloat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhijeet
 */
public class AccountDetailsJPanel extends javax.swing.JPanel {
private JPanel userProcessContainer;
    private CustomerOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    /**
     * Creates new form MyAccountJPanel
     */
    public AccountDetailsJPanel(JPanel upc, UserAccount account, CustomerOrganization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = upc;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        
        txtBalance.setText(String.valueOf(userAccount.getAccountBalance()));
        populate();
    }
public void populate(){
     DefaultTableModel model = (DefaultTableModel)tblDetail.getModel();
     model.setRowCount(0);
     Transaction trn= new Transaction();
      for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
          if (request instanceof Transaction)
          {
              trn = (Transaction) request;
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getSender().getPerson().getFirstName();
            
            row[2] =  ((Transaction) request).getReceiver().getPerson().getFirstName();
            row[3] =  ((Transaction) request).getRequestDate();
             row[4] =  trn.getTransList().getTransAmount();
             model.addRow(row);
          }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetail = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbUsers = new javax.swing.JComboBox<>();
        txtUser = new javax.swing.JTextField();
        btnTran = new java.awt.Button();
        jLabel3 = new javax.swing.JLabel();
        txtBalance = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        tblDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Reciever", "Date", "Amount"
            }
        ));
        jScrollPane1.setViewportView(tblDetail);

        jButton1.setText("View More Information");

        jLabel1.setText("Amount $");

        jLabel2.setText("To UserName");

        cbUsers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUsersActionPerformed(evt);
            }
        });

        btnTran.setLabel("Transfer");
        btnTran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTranActionPerformed(evt);
            }
        });

        jLabel3.setText("Balance");

        txtBalance.setEditable(false);

        btnBack.setText("<<BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(cbUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(btnTran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel3)
                .addGap(74, 74, 74)
                .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnBack)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jLabel3)
                            .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTranActionPerformed
        // TODO add your handling code here:
        String amount = txtAmount.getText();
        float amt = parseFloat(amount);
        String userName = txtUser.getText();
        UserAccount reciever = new UserAccount();
        
        if ((amount.length() * userName.length())== 0)
        {
            
        }
        for (Organization org :enterprise.getOrganizationDirectory().getOrganizationList())
        {
            if (org instanceof CustomerOrganization)
            {
            for (UserAccount user : org.getUserAccountDirectory().getUserAccountList())
           {
               if (user.getUsername().equals(userName))
               {
                   reciever = user;
               }
           }
            }
        }
        Transaction trn = new Transaction();
        trn.setMessage("transaction");
        trn.setSender(userAccount);
        trn.setReceiver(reciever);
        trn.getTransList().setTransAmount(amt);
     float stmp =    userAccount.getAccountBalance();
     float rtmp =    reciever.getAccountBalance();
     if (amt > userAccount.getAccountLimit() )
     {
          JOptionPane.showMessageDialog(null, "amount is greater that the limit");
         return;
     }
     if (amt > stmp)
      {
          JOptionPane.showMessageDialog(null, "amount is greater that the balance");
         return;
     }
     
     reciever.setAccountBalance(rtmp+amt);
     userAccount.setAccountBalance(stmp-amt); 
     txtBalance.setText(String.valueOf(userAccount.getAccountBalance()));
        userAccount.getWorkQueue().getWorkRequestList().add(trn);
        reciever.getWorkQueue().getWorkRequestList().add(trn);
    }//GEN-LAST:event_btnTranActionPerformed

    private void cbUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUsersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbUsersActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private java.awt.Button btnTran;
    private javax.swing.JComboBox<String> cbUsers;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDetail;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}

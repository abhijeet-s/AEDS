
package UISalesPerson;

import Business.Business;
import Business.Customer;
import Business.CustomerCatalog;
import Business.MasterCatalog;
import Business.ProductCatalog;
import Business.Employee;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Abhijeet
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
   ProductCatalog productCatalog;
    MasterCatalog masterCatalog;
    Employee salesPerson;
    CustomerCatalog customerCatalog;

    /** Creates new form ProductManagerWorkAreaJPanel */
    public CustomerWorkAreaJPanel(JPanel upc, ProductCatalog pc, MasterCatalog moc,Employee salesPerson,CustomerCatalog customerCatalog) {
        initComponents();
       this.userProcessContainer = upc;
       productCatalog = pc;
       masterCatalog = moc;
       this.salesPerson = salesPerson;
       this.customerCatalog = customerCatalog;
      
        populateCustCombo();
    }
    
   
    
    private void populateCustCombo() {
        custCombo.removeAllItems();
        for (Customer c : customerCatalog.getCustomerList()) {
            custCombo.addItem(c);
        }     
    }     
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        custCombo = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("My Work Area ");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Browse Product Catalog >>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Customer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel4)
                        .addGap(123, 123, 123)
                        .addComponent(custCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jButton1)))
                .addGap(226, 226, 226))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(custCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(jButton1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
     
        Customer customer = (Customer)custCombo.getSelectedItem();
        AddProducts bpjp = new AddProducts(userProcessContainer, productCatalog, masterCatalog,salesPerson,customer);
        userProcessContainer.add("BrowseProductsCustomer", bpjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox custCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}

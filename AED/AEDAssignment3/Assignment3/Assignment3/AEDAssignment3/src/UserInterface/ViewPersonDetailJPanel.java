/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Patient;
import Business.Person;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author priyank
 */
public class ViewPersonDetailJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPersonDetailJPanel
     */
    private Person person;
    private JPanel userProcessContainer;
    
    public ViewPersonDetailJPanel() {
    }

    public ViewPersonDetailJPanel(Person pe,JPanel userProcessContainer) {
        initComponents();
        this.person=pe;
        this.userProcessContainer=userProcessContainer;
         populateForm();
       
    }
 public void populateForm() {
        txtSSN.setText(String.valueOf(person.getSSN()));
        txtFirstName.setText(person.getFirstName());
        txtLastName.setText(person.getLastName());
         txtAge.setText(String.valueOf(person.getAge()));
          btnSave.setEnabled(false);
        Patient P = person.getPatient();
        if (P.getPatientID().equals(""))
        {
            btnCreatePatient.setEnabled(true);
            txtPatientID.setEnabled(false);
            txtPrimaryDoctorsName.setEnabled(false);
            txtPrefferedPharmacy.setEnabled(false);
            btnViewVital.setEnabled(false);
             txtPatientID.setVisible(false);
            txtPrimaryDoctorsName.setVisible(false);
            txtPrefferedPharmacy.setVisible(false);
            btnViewVital.setVisible(false);
            btnViewVital.setVisible(false);
            lblPID.setVisible(false);
            lblPD.setVisible(false);
            lblPP.setVisible(false);
            lblMsg.setVisible(true);
            btnUpdate.setEnabled(true);
            btnSave.setEnabled(false);
            
        }
        else
        {
             btnCreatePatient.setEnabled(false);
               btnCreatePatient.setVisible(false);
               lblMsg.setVisible(false);
               btnUpdate.setEnabled(true);
            btnSave.setEnabled(false);
             populatePatientDetail(P);
        }
    }
 private void populatePatientDetail(Patient P)
 {
     
      txtPatientID.setText(String.valueOf(P.getPatientID()));
        txtPrimaryDoctorsName.setText(String.valueOf(P.getPrimaryDoctorName()));
       txtPrefferedPharmacy.setText(String.valueOf(P.getPreferredPharmacy()));
 }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnCreatePatient = new javax.swing.JButton();
        lblPD = new javax.swing.JLabel();
        lblPP = new javax.swing.JLabel();
        txtPrimaryDoctorsName = new javax.swing.JTextField();
        txtPatientID = new javax.swing.JTextField();
        txtPrefferedPharmacy = new javax.swing.JTextField();
        lblPID = new javax.swing.JLabel();
        btnViewVital = new javax.swing.JButton();
        lblMsg = new javax.swing.JLabel();

        jLabel6.setText("Last Name");

        jLabel3.setText("SSN");

        txtSSN.setEditable(false);

        jLabel5.setText("First Name");

        txtFirstName.setEditable(false);

        txtLastName.setEditable(false);

        txtAge.setEditable(false);

        jLabel1.setText("Age");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel2.setText("View Person Details");

        btnCreatePatient.setText("Create Patient Details");
        btnCreatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePatientActionPerformed(evt);
            }
        });

        lblPD.setText("Primary Doctor Name");

        lblPP.setText("Preffered Pharmacy");

        txtPrimaryDoctorsName.setEditable(false);
        txtPrimaryDoctorsName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimaryDoctorsNameActionPerformed(evt);
            }
        });

        txtPatientID.setEditable(false);

        txtPrefferedPharmacy.setEditable(false);

        lblPID.setText("Patient ID");

        btnViewVital.setText("Manage Vital Sign");
        btnViewVital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewVitalActionPerformed(evt);
            }
        });

        lblMsg.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblMsg.setText("NOT A PATIENT");
        lblMsg.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAge)
                                    .addComponent(txtLastName)
                                    .addComponent(txtFirstName)
                                    .addComponent(txtSSN, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblPP)
                                    .addComponent(lblPID, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPD, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPrefferedPharmacy, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                    .addComponent(txtPrimaryDoctorsName, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                    .addComponent(txtPatientID, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                    .addComponent(btnCreatePatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnViewVital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMsg)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSave)
                                .addGap(99, 99, 99)
                                .addComponent(btnUpdate)))))
                .addGap(0, 106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(lblPID)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(lblPD)
                            .addGap(18, 18, 18)
                            .addComponent(lblPP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtPrimaryDoctorsName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtPrefferedPharmacy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMsg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCreatePatient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnViewVital)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate))
                .addGap(15, 15, 15)
                .addComponent(btnBack)
                .addGap(161, 161, 161))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtPrimaryDoctorsNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimaryDoctorsNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimaryDoctorsNameActionPerformed

    private void btnCreatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePatientActionPerformed
        // TODO add your handling code here:
        CreatePatientJPanel panel = new CreatePatientJPanel(person,userProcessContainer);
        userProcessContainer.add("CreatePatientJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreatePatientActionPerformed

    private void btnViewVitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewVitalActionPerformed
        // TODO add your handling code here:
         ManageVitalSignJPanel panel = new ManageVitalSignJPanel(person,userProcessContainer);
        userProcessContainer.add("ManageVitalSignJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewVitalActionPerformed
public void setEn(boolean t){
      txtFirstName.setEditable(t);
        txtLastName.setEditable(t);
        txtSSN.setEditable(t);
        txtAge.setEditable(t);
         Patient P = person.getPatient();
    
                 txtPatientID.setEditable(false);
        txtPrimaryDoctorsName.setEditable(false);
        txtPrefferedPharmacy.setEditable(false);
                
        
}
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
       setEn(true);
        
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnCreatePatient.setEnabled(false);
        btnViewVital.setEnabled(false);
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try {
            // first collect all the user input and make sure it's correct using
            // try catch.
               String firstName =toUpperCase(txtFirstName.getText().trim());
        String lastName = toUpperCase(txtLastName.getText().trim());
        int SSN = Integer.parseInt((txtSSN.getText().trim()));
        int age = Integer.parseInt((txtAge.getText().trim()));
            
            // if Integer.parseInt went wrong, no account will get created.
           
            person.setFirstName(firstName);
            person.setLastName(lastName);
        
            person.setAge(age);
            person.setSSN(SSN);
            setEn(false);
             populateForm();
            JOptionPane.showMessageDialog(null, "Person updated successfully .", "Information", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException nfe) {
            // Do something if you have time
            JOptionPane.showMessageDialog(null, "Correct format required.", "Information", JOptionPane.ERROR_MESSAGE);
        }
        
       
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreatePatient;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnViewVital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblPD;
    private javax.swing.JLabel lblPID;
    private javax.swing.JLabel lblPP;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtPrefferedPharmacy;
    private javax.swing.JTextField txtPrimaryDoctorsName;
    private javax.swing.JTextField txtSSN;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ThreatProcess;

import Business.Enterprise.Enterprise;
import Business.Organization.AnalysisTeamOrganization;
import Business.Organization.LegalTeamOrganization;
import Business.Organization.Organization;
import Business.WorkQueue.TierHelpDesk;
import UserInterface.Tier2.Tier2WorkAreaJPanel;
import UserInterface.Tier1.Tier1WorkAreaJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Abhijeet
 */
public class ThreatProcess extends javax.swing.JPanel {
JPanel userProcessContainer;
    TierHelpDesk request;
    Enterprise enterprise;
    int tier;
    /**
     * Creates new form ThreatProcess
     */
    public ThreatProcess(JPanel userProcessContainer, TierHelpDesk request, int tier,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.tier=tier;
         this.enterprise=enterprise;
        txtIncident.setText(request.getMessage());
        txtIN.setText(request.getStatus());
        txtIP.setText(request.getThreatDetails().getPriority());
        txtSev.setText(request.getThreatDetails().getSeverity());
        txtAB.setText(request.getSender().getPerson().getFirstName());
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRes = new javax.swing.JTextField();
        cbAnalysis = new javax.swing.JCheckBox();
        cbLegalTeam = new javax.swing.JCheckBox();
        btnSubmit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtIncident = new javax.swing.JTextField();
        txtIN = new javax.swing.JTextField();
        txtIP = new javax.swing.JTextField();
        txtSev = new javax.swing.JTextField();
        txtAB = new javax.swing.JTextField();

        jLabel1.setText("Incident ID");

        jLabel2.setText("Issue Name");

        jLabel3.setText("Priority");

        jLabel4.setText("Severity");

        jLabel5.setText("Resolution Details");

        cbAnalysis.setText(" Consult Analysis Team");
        cbAnalysis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAnalysisActionPerformed(evt);
            }
        });

        cbLegalTeam.setText("Consult Legal Team");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel6.setText("Assigned By");

        btnBack.setText("<<BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtIncident.setEditable(false);

        txtIN.setEditable(false);

        txtIP.setEditable(false);

        txtSev.setEditable(false);

        txtAB.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSubmit)
                            .addComponent(txtRes, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIN)
                            .addComponent(txtIP)
                            .addComponent(txtSev)
                            .addComponent(txtAB)
                            .addComponent(txtIncident))))
                .addGap(91, 91, 91))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbAnalysis, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbLegalTeam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(214, 214, 214))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIncident, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtSev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtAB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel5)
                                .addGap(76, 76, 76))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtRes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)))
                        .addComponent(cbAnalysis)
                        .addGap(18, 18, 18)
                        .addComponent(cbLegalTeam)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addGap(48, 48, 48)))
                .addComponent(btnSubmit)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
 userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        if (tier==1)
        {
            Tier1WorkAreaJPanel dwjp = (Tier1WorkAreaJPanel) component;
            dwjp.populateTable();
        }

        else{
        Tier2WorkAreaJPanel dwjp = (Tier2WorkAreaJPanel) component;
        dwjp.populateTable();
        }
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        try {
            
        request.setTestResult("Close");
        request.setStatus("Close");
        request.getThreatDetails().setResoultion(request.getReceiver().getUsername() + txtRes.getText().toString());
        if (cbAnalysis.isSelected())
        {
            for ( Organization org : enterprise.getOrganizationDirectory().getOrganizationList()){
                if (org instanceof AnalysisTeamOrganization )
                {
                    org.getWorkQueue().getWorkRequestList().add(request);
                }
            }
        }
        if (cbLegalTeam.isSelected())
        {
            for ( Organization org : enterprise.getOrganizationDirectory().getOrganizationList()){
                if (org instanceof LegalTeamOrganization )
                {
                    org.getWorkQueue().getWorkRequestList().add(request);
                }
            }
        }
        }
        catch (Exception ex)
        {
        JOptionPane.showMessageDialog(null, "Selected request is closed");
    }//GEN-LAST:event_btnSubmitActionPerformed
    }
    private void cbAnalysisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAnalysisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAnalysisActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JCheckBox cbAnalysis;
    private javax.swing.JCheckBox cbLegalTeam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtAB;
    private javax.swing.JTextField txtIN;
    private javax.swing.JTextField txtIP;
    private javax.swing.JTextField txtIncident;
    private javax.swing.JTextField txtRes;
    private javax.swing.JTextField txtSev;
    // End of variables declaration//GEN-END:variables
}

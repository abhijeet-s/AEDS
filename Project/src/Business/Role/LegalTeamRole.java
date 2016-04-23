/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.LegalTeamOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.LegalAdvisoryWorkArea.LegalWorkAreaJPanel;
import UserInterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Abhijeet
 */
public class LegalTeamRole extends Role {
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
       return new LegalWorkAreaJPanel(userProcessContainer, account, (LegalTeamOrganization)organization, enterprise);
    }
    
}

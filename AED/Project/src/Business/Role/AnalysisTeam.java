/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AnalysisTeamOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.AnalysisWingWorkArea.AnalysisTeamJPanel;
import UserInterface.LegalAdvisoryWorkArea.LegalWorkAreaJPanel;
import UserInterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Abhijeet
 */
public class AnalysisTeam extends Role {
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new AnalysisTeamJPanel(userProcessContainer, account, (AnalysisTeamOrganization)organization, enterprise);
    }
    
}

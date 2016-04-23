/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.Tier1Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Tier1.Tier1WorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Abhijeet
 */
public class Tier1Role extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new Tier1WorkAreaJPanel(userProcessContainer, account, (Tier1Organization)organization, enterprise);
    }
}

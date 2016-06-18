/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.Tier2Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Tier2.Tier2WorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Abhijeet
 */
public class Tier2Role extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
       return new Tier2WorkAreaJPanel(userProcessContainer, account, (Tier2Organization)organization, enterprise);
    }
}

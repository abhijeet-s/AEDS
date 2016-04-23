/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.Tier2Role;
import java.util.ArrayList;

/**
 *
 * @author Abhijeet
 */
public class Tier2Organization extends Organization{
      Tier2Organization(){
    super(Organization.Type.Tier2.getValue());
}
 @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new Tier2Role());
        return roles;
    }
}

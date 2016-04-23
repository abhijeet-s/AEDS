/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Role.Tier1Role;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author Abhijeet
 */
public class Tier1Organization extends Organization{
    Tier1Organization(){
    super(Organization.Type.Tier1.getValue());
}
 @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new Tier1Role());
        return roles;
    }
}

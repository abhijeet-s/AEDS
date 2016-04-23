/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AnalysisTeam;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhijeet
 */
public class AnalysisTeamOrganization extends Organization{
     AnalysisTeamOrganization() {
       super(Organization.Type.Analysis.getValue());
    }
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AnalysisTeam());
        return roles;
    }
}

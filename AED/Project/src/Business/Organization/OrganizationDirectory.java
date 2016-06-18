/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Abhijeet
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.HelpDesk.getValue())){
            organization = new HelpDeskOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Tier1.getValue())){
            organization = new Tier1Organization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Tier2.getValue())){
            organization = new Tier2Organization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Clerk.getValue())){
            organization = new ClerkOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Customer.getValue())){
            organization = new CustomerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Legal.getValue())){
            organization = new LegalTeamOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Analysis.getValue())){
            organization = new AnalysisTeamOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Abhijeet
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
      //  system.setUserid(1111);
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        boolean flg= true;
        for (Network n : system.getNetworkList())
        {
            for (Enterprise ent : n.getEnterpriseDirectory().getEnterpriseList() )
            {
               for (Organization org : ent.getOrganizationDirectory().getOrganizationList())
               {
                   for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList())
                   {
                       if (ua.getUsername().toString() == "a1112")
                       {
                           flg=false;
                       }
                   }
               }
            }
        }
        if (flg)
        {
        Person employee = system.getPersonDirectory().createPerson("SysAdmin","SysAdmin",0,0,"","","",0);
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
      //  ua.setLock(true);
        }
        return system;
    }
    
}

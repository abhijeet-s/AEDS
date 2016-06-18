/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.EcoSystem;
import Business.Person.Person;
import Business.Role.Role;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Abhijeet
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        int  f = 0;
   // UserAccount uacTemp = new UserAccount();
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username) ){
                if (ua.getPassword().equals(password)){
                    f = ua.getCount();
               if (f < 3 )
                   {
                ua.setCount(0);
                
                 
                   }
                return ua;
            }
                else
                {
                  
                    f = ua.getCount();
                  f = f+1;
                   ua.setCount(f);
                   
                   if (f > 4 )
                   {
                       ua.setLock(true);
                   }
                } 
        }
        }
        return null;
            
    }
     
    public UserAccount createUserAccount(String username, String password, Person person, Role role){
       EcoSystem system = EcoSystem.getInstance();
        int user =  system.getUserid();
       
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername("a"+user);
         JOptionPane.showMessageDialog(null, "User name created is "+"a"+user);
        userAccount.setPassword(password);
        userAccount.setPerson(person);
        userAccount.setRole(role);

      
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}

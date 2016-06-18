/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import java.util.ArrayList;

/**
 *
 * @author Abhijeet
 */
public class ChildMember {
    private ArrayList<UserAccount> childList;
    public ChildMember(){
        childList = new ArrayList < > ();
    }
    public void addMbr(UserAccount us) {
  
  childList.add(us);

 }
}

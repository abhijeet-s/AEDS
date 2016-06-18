/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author priyank
 */
public class PersonDirectory {
    
    
     private ArrayList<Person> PersonDirectory;
    
    public PersonDirectory(){
        PersonDirectory = new ArrayList<Person>();
        
    }

    public ArrayList<Person> getPersonDirectory() {
        return PersonDirectory;
    }

    public void setPersonDirectory(ArrayList<Person> PersonDirectory) {
        this.PersonDirectory = PersonDirectory;
    }
    
     public Person addPerson(){
        Person p = new Person();
        PersonDirectory.add(p);
        return p;
    }
    public void deletePerson (Person p)
    {
        PersonDirectory.remove(p);
    }
    public Person searchPerson(int keyWord){
        for(Person p : PersonDirectory){
            if(p.getSSN() == keyWord){
                return p;
            }
        }
        return null;
    }
    
    public boolean checkPerson(int SSN){
        for (Person a : getPersonDirectory()) {
            if (a.getSSN() == SSN){
                return true;
            }
            }
        return false;
        }
        
        
    }



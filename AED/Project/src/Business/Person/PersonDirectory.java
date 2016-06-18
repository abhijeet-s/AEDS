/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author Abhijeet
 */
public class PersonDirectory {
    
    private ArrayList<Person> personList;

    public PersonDirectory() {
        personList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }
    
    public Person createPerson(String fn, String ln , int SSN, int phone, String AL , String city, String state,int Zip){
        Person person = new Person();
        person.setFirstName(fn);
        person.setLastName(ln);
        person.setSSN(SSN);
        PersonAddress ad = new PersonAddress();
        
        ad.setaLine(AL);
        ad.setCity(city);
       ad.setState(state);
        ad.setZipCode(Zip);
        ad.setPhoneNumber(phone);
        person.setAddress(ad);
        personList.add(person);
        return person;
    }
   
}
package Business.Person;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhijeet
 */
public class Person {


   // private String name;
    private int id;
    private static int count = 1;
  private String firstName;
    private String lastName;
    private int SSN=0;
    private Business.Person.PersonAddress Address;


    public Person() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }



    @Override
    public String toString() {
        return firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public Business.Person.PersonAddress getAddress() {
        
        return Address;
    }

    public void setAddress(Business.Person.PersonAddress Address) {
        this.Address = Address;
    }

   
    
    
}

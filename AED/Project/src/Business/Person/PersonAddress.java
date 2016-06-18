/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Person.*;

/**
 *
 * @author Abhijeet
 */
public class PersonAddress {
    private String aLine="";

    public String getaLine() {
        return aLine;
    }

    public void setaLine(String aLine) {
        this.aLine = aLine;
    }
   
    private String City="";
    private String State="";
    
    private int zipCode=0;
   private int phoneNumber=0;

  

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

   
    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}

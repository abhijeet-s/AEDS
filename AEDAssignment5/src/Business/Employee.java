/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

/**
 *
 * @author Abhijeet
 */
public class Employee extends Person{
    private static int count = 1000;
    private String organization;
    private int employeeId;
    private float commisionEarned =0 ;

    public float getCommisionEarned() {
        return commisionEarned;
    }

    public void setCommisionEarned(float commisionEarned) {
        this.commisionEarned = commisionEarned;
    }
    public Employee(){
        employeeId = ++count;
    }
    
    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    
    @Override
    public String toString()
    {
        return this.getFirstName();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Abhijeet;
 */
public class SalesPersonComparator implements Comparable<SalesPersonComparator> {
    private Employee employee;
    private int totalSales;

    public Employee getSalesPerson() {
        return employee;
    }

    public void setSalesPerson(Employee employee) {
        this.employee = employee;
    }

    public int getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }

    @Override
    public String toString() {
        return employee.getFirstName();
    }

    @Override
    public int compareTo(SalesPersonComparator sp) {
        if( this.getTotalSales() > sp.getTotalSales()){
            return -1;
       }else if (this.getTotalSales() < sp.getTotalSales()){
            return 1;
       }else{ 
            return 0;
       }
    }
}

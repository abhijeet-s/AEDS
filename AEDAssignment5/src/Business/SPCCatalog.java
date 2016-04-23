/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Abhijeet;
 */
public class SPCCatalog {
     private ArrayList < SalesPersonComparator > SPCCatalog;

    public ArrayList<SalesPersonComparator> getSPCCatalog() {
        return SPCCatalog;
    }

    public void setSPCCatalog(ArrayList<SalesPersonComparator> SPCCatalog) {
        this.SPCCatalog = SPCCatalog;
    }

 

 public SalesPersonComparator addSalesPerson() {
  SalesPersonComparator salesPersonComparator = new SalesPersonComparator();
  SPCCatalog.add(salesPersonComparator);
  return salesPersonComparator;
 }

 public SPCCatalog(MasterCatalog mstc, EmployeeDirectory employeeDirectory) {
  SPCCatalog = new ArrayList < SalesPersonComparator > ();
  int totalSalesAmount = 0;
  SalesPersonComparator salesPersonComparator = new SalesPersonComparator();
  for (Employee e: employeeDirectory.getEmployeeList()) {
   totalSalesAmount = 0;
   totalSalesAmount = mstc.getSalesPersonC(e);
   //add here
   salesPersonComparator = this.addSalesPerson();
   salesPersonComparator.setSalesPerson(e);
   salesPersonComparator.setTotalSales(totalSalesAmount);
  }

  Collections.sort(this.getSPCCatalog());
 }
    
}

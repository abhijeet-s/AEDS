 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

import java.util.Random;

/**
 *
 * @author Abhijeet
 */
public class ConfigureBusiness {
   
    public static Business initializeBusiness(){
        Business business = Business.getInstance();
        Employee employee = business.getEmployeeDirectory().AddEmployee();
        employee.setFirstName("Admin");
        employee.setLastName("Admin");
        employee.setOrganization("Xerox");
        UserAccount userAccount = business.getUserAccountDirectory().AddUserAccount();
        userAccount.setUserName("admin");
        userAccount.setPassword("admin");
        userAccount.setPerson(employee);
        userAccount.setRole(UserAccount.ADMIN_ROLE);
        userAccount.setIsActive("Yes");
        Employee employee1 = business.getEmployeeDirectory().AddEmployee();
        employee1.setFirstName("sale1");
        employee1.setLastName("One");
        employee1.setOrganization("Xerox");
        UserAccount userAccount1 = business.getUserAccountDirectory().AddUserAccount();
        userAccount1.setUserName("sale1");
        userAccount1.setPassword("sale1");
        userAccount1.setPerson(employee1);
        userAccount1.setRole(UserAccount.EMPLOYEE_ROLE);
        userAccount1.setIsActive("Yes");
        Employee employee2 = business.getEmployeeDirectory().AddEmployee();
        employee2.setFirstName("sale2");
        employee2.setLastName("Two");
        employee2.setOrganization("Xerox");
        UserAccount userAccount2 = business.getUserAccountDirectory().AddUserAccount();
        userAccount2.setUserName("sale2");
        userAccount2.setPassword("sale2");
        userAccount2.setPerson(employee2);
        userAccount2.setRole(UserAccount.EMPLOYEE_ROLE);
        userAccount2.setIsActive("Yes");
         Employee employee3 = business.getEmployeeDirectory().AddEmployee();
        employee3.setFirstName("sale3");
        employee3.setLastName("Three");
        employee3.setOrganization("Xerox");
        UserAccount userAccount3 = business.getUserAccountDirectory().AddUserAccount();
        userAccount3.setUserName("sale3");
        userAccount3.setPassword("sale3");
        userAccount3.setPerson(employee3);
        userAccount3.setRole(UserAccount.EMPLOYEE_ROLE);
        userAccount3.setIsActive("Yes");
        String [] Manufacturer = {"DELL","TOSHIBA","LENEVO","HP","APPLE"};
     ProductCatalog pc = business.getProductCatalog();
     CustomerCatalog customerCatalog =  business.getCustomerCatalog();

    for (String manufacturer : Manufacturer){
        
       
      //  sp.setSupplierName(suppplierName);
        for( int i=1 ; i <= 2; i++){
            Random r= new Random();
            char X = (char) (r.nextInt(26)+'A');
            char Y = (char) (r.nextInt(26)+'A');
            char Z = (char) (r.nextInt(26)+'A');
            Product P = pc.addProduct();
            P.setManufacturer(manufacturer);
           P.setProdName(manufacturer + " " + X + Z + Y+ X + Z+Z+Z);
           int price = (int) (Math.random() * 500) + 100;
           P.setTprice(price);
           P.setCprice(price+50);
           if (price <50)
           {
               P.setFprice(0);
           }
           else{
           P.setFprice(price-50);
           }
           P.setAvail((int) (Math.random() * 50) + 10);
           
          
           
            
        }
    }
    Customer c1 = customerCatalog.addCustomer() ;
       
        c1.setCustID("123");
        c1.setCustName("HEY");
        c1.setCustPh("34534");
        c1.setCustAdd("Boston");
        
        Customer c2 = customerCatalog.addCustomer() ;
        c2.setCustID("124");
        c2.setCustName("Freddy");
        c2.setCustPh("23423");
        c2.setCustAdd("Mumbai");
        
        Customer c3 = customerCatalog.addCustomer() ;
        c3.setCustID("125");
        c3.setCustName("Bob");
        c3.setCustPh("12343432");
        c3.setCustAdd("Cali");
        
        Customer c4 = customerCatalog.addCustomer() ;
        c4.setCustID("126");
        c4.setCustName("Salman");
        c4.setCustPh("434323");
        c4.setCustAdd("Florida");
        return business;
    }
}

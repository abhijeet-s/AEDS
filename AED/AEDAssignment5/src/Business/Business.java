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
public class Business {
    private static Business business;
    private UserAccountDirectory userAccountDirectory;
    private EmployeeDirectory employeeDirectory;
    private CustomerCatalog customerCatalog;
    private ProductCatalog productCatalog;
    private MasterCatalog masterOrderCatalog;
    

    public MasterCatalog getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public void setMasterOrderCatalog(MasterCatalog masterOrderCatalog) {
        this.masterOrderCatalog = masterOrderCatalog;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    public CustomerCatalog getCustomerCatalog() {
        return customerCatalog;
    }

    public void setCustomerCatalog(CustomerCatalog customerCatalog) {
        this.customerCatalog = customerCatalog;
    }
    
    private Business(){
  
        userAccountDirectory = new UserAccountDirectory();
        employeeDirectory =  new EmployeeDirectory();
        customerCatalog = new CustomerCatalog();
        productCatalog = new ProductCatalog();
        masterOrderCatalog = new MasterCatalog();
        
    }
    
    public static Business getInstance(){
        if(business == null){
            business = new Business();
        }
        return business;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }        
}

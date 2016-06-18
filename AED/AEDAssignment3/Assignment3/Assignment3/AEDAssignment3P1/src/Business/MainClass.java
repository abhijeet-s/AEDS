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
public class MainClass {
    public static void main(String []args)
            
    {
        
    SupplierDirectory sd=new SupplierDirectory();
    String [] SupplierNames = {"DELL","TOSHIBA","LENEVO","HP","APPLE"};
    
    for (String suppplierName : SupplierNames){
        Supplier sp=sd.addSupplier();
       
        sp.setSupplierName(suppplierName);
        for( int i=1 ; i <= 10; i++){
            Random r= new Random();
            char X = (char) (r.nextInt(26)+'A');
            char Y = (char) (r.nextInt(26)+'A');
            char Z = (char) (r.nextInt(26)+'A');
            Product P = sp.getProductCatalog().addProduct();
           P.setProductName(suppplierName + " " + X + Z + Y+ X + Z+Z+Z);
           P.setPrice((int) (Math.random() * 500) + 100);
           P.setAvailability((int) (Math.random() * 50) + 10);
            
        }
        
    }
   
 int countS=1;
    for(Supplier s : sd.getSupplierDirectory()){
        
          System.out.println(countS +". Supplier Name : " + s.getSupplierName()); 
          int countP=1;
          for(Product p : s.getProductCatalog().getProductList()){
              System.out.println("Serial:  Product : "+ " Product Price : " +" Product Availbility : ");
              System.out.println(countP + "     :    "+ p.getProductName()+"     :    "+ p.getPrice()+"    :     "+ p.getAvailability());
              
            
              System.out.println();
              countP++;
          }
          countS++;
          System.out.println("***************************************");
          System.out.println();
          }
    
        }
    
    
    
   
    
    
    
    
    
    }


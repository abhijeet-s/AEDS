/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Random;
import java.util.function.Supplier;

/**
 *
 * @author priyank
 */
public class InitialisationClass {
    
   public  void Initilisation(StoreDirectory sd)
            
    {
        
    //Directory sd=new SupplierDirectory();
    String [] Manufacturer = {"DELL","TOSHIBA","LENEVO","HP","APPLE"};
  String [] StoreName = {"CALI","NEWYORK","BOSTON"};
     
    for (String storeName : StoreName){
    
    Store s = sd.addStore();
    s.setStoreName(storeName);
}
    for (String manufacturer : Manufacturer){
        
       
      //  sp.setSupplierName(suppplierName);
        for( int i=1 ; i <= 2; i++){
            Random r= new Random();
            char X = (char) (r.nextInt(26)+'A');
            char Y = (char) (r.nextInt(26)+'A');
            char Z = (char) (r.nextInt(26)+'A');
            Product P = sd.getProductCatalog().addProduct();
            P.setManufacturer(manufacturer);
           P.setProdName(manufacturer + " " + X + Z + Y+ X + Z+Z+Z);
           P.setListPrice((int) (Math.random() * 500) + 100);
           P.setAvail((int) (Math.random() * 50) + 10);
           
          
           
            
        }
    }
        for( Store s : sd.getStorelist()){
            Random r= new Random();
            char X = (char) (r.nextInt(26)+'A');
            char Y = (char) (r.nextInt(26)+'A');
            char Z = (char) (r.nextInt(26)+'A');
            
            Product P = sd.getProductCatalog().addProduct();
            P.setManufacturer("WIPRO");
           P.setProdName("WIPRO" + " " + X + Z + Y+ X + Z+Z+Z);
           int price =(int) (Math.random() * 500) + 100;
           P.setListPrice(price);
           int av=(int) (Math.random() * 50) + 10;
           P.setAvail(av);
           
           InventoryItem invt = s.getInventory().addInventoryItem(P, (av-5),price+100, 2);
          
           
            
        }
    }
       

}


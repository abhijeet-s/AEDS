/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author priyank
 */
public class StoreDirectory {
     private List<Store> storeList;
    private ProductCatalog productCatalog;
     public StoreDirectory() {
    
        storeList = new ArrayList<Store>();
        productCatalog = new ProductCatalog();
    }
    
    public List<Store> getStorelist(){
        return storeList;
    }
    
    public Store addStore(){
        Store s = new Store();
        storeList.add(s);
        return s;
    }
    
    public void removeStore(Store s){
        storeList.remove(s);
    }
    
    public Store searchStore(String keyword){
        for (Store store : storeList) {
            if(store.getStoreName().equals(keyword)){
                return store;
            }
        }
        return null;
    }

    public List<Store> getStoreList() {
        return storeList;
    }



    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }


}

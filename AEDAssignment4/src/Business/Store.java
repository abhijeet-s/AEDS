/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author priyank
 */
public class Store {
      private String storeName;
    private Inventory inventory;

    public Store() {
    inventory = new Inventory();
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory productCatalog) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return storeName; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

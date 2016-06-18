/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author priyank
 */
public class Inventory {
    
  private static int count = 0;
    private ArrayList<InventoryItem> inventoryItemList;
    
    
    public Inventory() {
       
       
        inventoryItemList = new ArrayList<>();
    }

    public void removeInventoryItem(InventoryItem o) {
        inventoryItemList.remove(o);
    }
    
    public InventoryItem addInventoryItem(Product p, int q, int price,int tHold) {
        InventoryItem i = new InventoryItem();
        i.setProduct(p);
        i.setQuantity(q);

        i.setSalesPrice(price);
        i.setThreshHold(tHold);
        i.setProfit(price-i.getProduct().getListPrice());
        inventoryItemList.add(i);
        return i;
    }
    
    public ArrayList<InventoryItem> getInventoryItemList() {
        return inventoryItemList;
    }
    
    public void setInventoryItemList(ArrayList<InventoryItem> orderItemList) {
        this.inventoryItemList = inventoryItemList;
    }
     public InventoryItem searchInventory(int id){
        for (InventoryItem inventory : inventoryItemList) {
            if(inventory.getProduct().getModelNumber()==id){
                return inventory;
            }
        }
        return null;
    }
    
    
    
}

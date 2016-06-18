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
public class InventoryItem {
    private Product product;
    private int quantity=0;
    private int salesPrice;
    private int ThreshHold;
    private int total;
private int profit;


    public int getThreshHold() {
        return ThreshHold;
    }

    public void setThreshHold(int ThreshHold) {
        this.ThreshHold = ThreshHold;
    }
    
    public Product getProduct() {
        return product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public int getSalesPrice() {
        return salesPrice;
    }
    
    public void setSalesPrice(int salesPrice) {
        this.salesPrice = salesPrice;
    }
    
    @Override
    public String toString() {
        return product.getProdName();
    }


    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }
}

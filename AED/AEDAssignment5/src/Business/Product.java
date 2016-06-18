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
public class Product {
        private String prodName;
    private int Fprice;
    private int Tprice;
    private int Cprice;
    private int modelNumber;
    private int avail;
    private String Manufacturer;
    private static int count =0;

    @Override
    public String toString() {
        return prodName; //To change body of generated methods, choose Tools | Templates.
    }

     public int getAvail() {
        return avail;
    }
    
    public void setAvail(int avail) {
        this.avail = avail;
    }
    
    public Product() {
    count++;
    modelNumber = count;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getFprice() {
        return Fprice;
    }

    public void setFprice(int Fprice) {
        this.Fprice = Fprice;
    }

    public int getTprice() {
        return Tprice;
    }

    public void setTprice(int Tprice) {
        this.Tprice = Tprice;
    }

    public int getCprice() {
        return Cprice;
    }

    public void setCprice(int Cprice) {
        this.Cprice = Cprice;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }
    
    
}

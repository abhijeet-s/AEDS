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
public class OrderItem {
      private Product product;
 private int quantity;
 private int salesPrice;
 private float commission = 0;


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

 public float getComm() {
  float com = 0;
  if (this.getSalesPrice() > this.getProduct().getFprice() && this.getSalesPrice() < this.getProduct().getTprice()) {
   com = (float)( this.getSalesPrice() * this.getQuantity()* 0.02 );
  } else if (this.getSalesPrice() == this.getProduct().getFprice()) {
   com = 0;
  } else  if (this.getSalesPrice() >= this.getProduct().getTprice() && this.getSalesPrice() <= this.getProduct().getCprice()) {
   com = (float)( this.getSalesPrice() * this.getQuantity()* 0.05 );
  }
  return com;
 }

 @Override
 public String toString() {
  return product.getProdName();
 }
}

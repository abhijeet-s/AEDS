/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Abhijeet
 */
public class Order {
      private static int count = 0;
 private ArrayList < OrderItem > orderItemList;
 private int orderNumber;
 private Employee salesPerson;
 private Customer customer;

 public Order(Employee sp, Customer cu) {
  count++;
  orderNumber = count;
  this.customer = cu;
  this.salesPerson = sp;
  orderItemList = new ArrayList < > ();
 }

 public Employee getSalesPerson() {
  return salesPerson;
 }

 public void setSalesPerson(Employee salesPerson) {
  this.salesPerson = salesPerson;
 }

 public Customer getCustomer() {
  return customer;
 }

 public void setCustomer(Customer customer) {
  this.customer = customer;
 }

 public int getOrderNumber() {
  return orderNumber;
 }

 public void removeOrderItem(OrderItem o) {
  orderItemList.remove(o);
 }

 public OrderItem addOrderItem(Product p, int q, int price) {
  OrderItem o = new OrderItem();
  o.setProduct(p);
  o.setQuantity(q);
  o.setSalesPrice(price);
  orderItemList.add(o);
  return o;
 }

 public ArrayList < OrderItem > getOrderItemList() {
  return orderItemList;
 }

 public void setOrderItemList(ArrayList < OrderItem > orderItemList) {
  this.orderItemList = orderItemList;
 }

 public int getOrderTotal() {
  int totalPrice = 0;
  for (OrderItem oi: getOrderItemList()) {
   totalPrice = totalPrice + oi.getSalesPrice() * oi.getQuantity();
  }
  return totalPrice;
 }

 public float getOrderTotalCOmmision() {
  float totalCommission = 0;
  for (OrderItem oi: getOrderItemList()) {
   totalCommission = totalCommission + oi.getComm();
  }
  return totalCommission;
 }
    
}

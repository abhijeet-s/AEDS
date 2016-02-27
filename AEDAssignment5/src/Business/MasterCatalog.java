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
public class MasterCatalog {
      private ArrayList<Order> oc;
    
    public MasterCatalog() {
        oc = new ArrayList<>();
    }
    
    public ArrayList<Order> getOrderCatalog() {
        return oc;
    }
    
    public Order addOrder(Order o) {
        oc.add(o);
        return o;
    }
    
    
      public int getCustBuy(Customer customer) {
  int TBA = 0;
  for (Order o: this.getOrderCatalog()) {
   if (o.getCustomer().getCustID() == customer.getCustID()) {
    TBA = TBA + o.getOrderTotal();
   }
  }
  return TBA;
 }
 public int getSalesProduct(Product p) {
  int totalProductVolume = 0;
  for (Order o: this.getOrderCatalog()) {
   for (OrderItem oi: o.getOrderItemList()) {
    if (oi.getProduct().getModelNumber() == p.getModelNumber()) {
     totalProductVolume = totalProductVolume + oi.getSalesPrice() * oi.getQuantity();
    }
   }
  }
  return totalProductVolume;
 }

 public int getProdTPSelling(Employee employee, boolean lessT) {
  int cnt = 0;
  for (Order o: this.getOrderCatalog()) {
   if (o.getSalesPerson().getEmployeeId() == employee.getEmployeeId()) {
    for (OrderItem oi: o.getOrderItemList()) {
     if (lessT == true) {
      if (oi.getSalesPrice() <= oi.getProduct().getTprice()) {
       cnt = cnt + oi.getQuantity();
      }
     } else if (lessT == false) {
      if (oi.getSalesPrice() > oi.getProduct().getTprice()) {
       cnt = cnt + oi.getQuantity();
      }
     }
    }
   }
  }
  return cnt;
 }





 public int getSalesPersonC(Employee employee) {
  int totalSalesAmount = 0;
  for (Order o: this.getOrderCatalog()) {
   if (o.getSalesPerson().getEmployeeId() == employee.getEmployeeId()) {
    totalSalesAmount = totalSalesAmount + o.getOrderTotal();
   }
  }

  return totalSalesAmount;
 }
 public Product getMostPopularProduct(ProductCatalog pc) {

  Product prod = null;
  Product prodT = null;
  int quantity = 0;
  int quantityT = 0;

  for (Product product: pc.getProductcatalog()) {
   prod = product;
   quantity = 0;

   for (Order o: this.getOrderCatalog()) {
    for (OrderItem oi: o.getOrderItemList()) {
     if (oi.getProduct().getModelNumber() == product.getModelNumber()) {
      quantity = quantity + oi.getQuantity();

     }
    }
   }
   if (quantityT < quantity) {
    quantityT = quantity;
    prodT = prod;
   }
  }

  return prodT;
 }


 public Customer getMostPopularCustomer(CustomerCatalog cc) {
  Customer cust = null;
  Customer custT = null;
  int qty = 0;
  int preQty = 0;
  for (Customer su: cc.getCustomerList()) {

   cust = su;
   qty = 0;
   for (Order o: this.getOrderCatalog()) {
    if (o.getCustomer().getCustID() == su.getCustID()) {
     qty = qty + o.getOrderTotal();

    }

    if (preQty < qty) {
     preQty = qty;

     custT = cust;
    }
   }
  }
  return custT;
 }
 public float getSPCommission(Employee employee) {
  float Comm = 0;
  for (Order o: this.getOrderCatalog()) {
   if (o.getSalesPerson().getEmployeeId() == employee.getEmployeeId()) {
    Comm = Comm + o.getOrderTotalCOmmision();
   }
  }

  return Comm;
 }
}

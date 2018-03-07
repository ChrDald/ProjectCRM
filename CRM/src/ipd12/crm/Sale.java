/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipd12.crm;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author D
 */
public class Sale {
    
    private long id;
    private long employeeId;
    private Date saleDate;
    private Date supportEnd;
    private long productId;
    private String productName;
    private String customerName;
    private long customerId;
    BigDecimal salePrice;
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public Date getSupportEnd() {
        return supportEnd;
    }

    public void setSupportEnd(Date supportEnd) {
        this.supportEnd = supportEnd;
    }
    
    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customer) {
        this.customerId = customer;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    
    
    @Override
    public String toString() {
        return "Sale ID: " + this.getId() + " Employee ID: " + this.getEmployeeId() + " Sale Date: " + this.getSaleDate() 
                + " Support End: " + this.getSupportEnd() + " Product ID: " + this.getProductId() + " Customer ID: " +
                this.getCustomerId() + " Sale Price: " + this.getSalePrice();
    }
}

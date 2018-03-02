/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipd12.crm;

import java.math.BigDecimal;

/**
 *
 * @author yasser
 */
public class Product {
    private long id;
    private String productName;
    private BigDecimal pricePerUnit;
    private int quantity;

    public Product(String productName, BigDecimal pricePerUnit, int quantity) {
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }
    
    public Product(long id, String productName, BigDecimal pricePerUnit, int quantity) {
        this.id = id;
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(BigDecimal pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("%d: %s %s %d", id, productName, pricePerUnit, quantity);
    }
    
    
            
}

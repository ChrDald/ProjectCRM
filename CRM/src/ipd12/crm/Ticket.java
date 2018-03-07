/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipd12.crm;

/**
 *
 * @author D
 */
public class Ticket {
    
    private int id;
    private int supportAgentId;
    private String description;
    private int customerId;
    private int productId;
    private String customerName;
    private String productName;
    private String supportAgent;

    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSupportAgentId() {
        return supportAgentId;
    }

    public void setSupportAgentId(int supportAgentId) {
        this.supportAgentId = supportAgentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the supportAgent
     */
    public String getSupportAgent() {
        return supportAgent;
    }

    /**
     * @param supportAgent the supportAgent to set
     */
    public void setSupportAgent(String supportAgent) {
        this.supportAgent = supportAgent;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipd12.crm;

/**
 *
 * @author yasser
 */
public class Customer {
    private long id;
    private String companyName;
    private String address;
    private String contactNum;

    public Customer(String companyName, String address, String contactNum) {
        this.companyName = companyName;
        this.address = address;
        this.contactNum = contactNum;
    }

    public Customer(long id, String companyName, String address, String contactNum) {
        this.id = id;
        this.companyName = companyName;
        this.address = address;
        this.contactNum = contactNum;
    }

    
    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the contactNum
     */
    public String getContactNum() {
        return contactNum;
    }

    /**
     * @param contactNum the contactNum to set
     */
    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }
    
    @Override
    public String toString(){
        return String.format("%d: %s %s %s", id, companyName, address, contactNum);
    }
}

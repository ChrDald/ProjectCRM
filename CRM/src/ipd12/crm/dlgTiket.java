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
public class dlgTiket {
    private long idCompany;
    private String company;

    public dlgTiket(long idCompany, String company) {
        this.idCompany = idCompany;
        this.company = company;
    }

    

    public long getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(long idCompany) {
        this.idCompany = idCompany;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    
}

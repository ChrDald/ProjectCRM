/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipd12.crm;

/**
 *
 * @author 1796146
 */
public class Employee {
    long id;
    String firstName;
    String lastName;
    Department dept;
    String password;
    enum Department {Sales, Support, Management };
    
    @Override
    public String toString() {
        return this.lastName + " " + this.firstName + " " + this.dept;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
 
}

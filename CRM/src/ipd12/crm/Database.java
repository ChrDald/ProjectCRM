package ipd12.crm;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

class RecordNotFoundException extends SQLException {

    public RecordNotFoundException() {
    }

    public RecordNotFoundException(String msg) {
        super(msg);
    }

    public RecordNotFoundException(String msg, Throwable cause) {
        super(msg, cause);
    }
}

public class Database {

    private String url = "jdbc:sqlserver://crmproject.database.windows.net:1433;databaseName=CRMProject;user=java3project;password=CRMdbroot11";  
    
    private Connection conn;  
    
    public Database() {
        try {    
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
            conn = DriverManager.getConnection(url); 
        } catch (SQLException e) {
            System.err.println("Error connecting to databse...");
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found exception...");
        }
        System.err.println("Connected");
    }

    public void addEmployee(Employee employee) throws SQLException {
        String sql = "INSERT INTO employees (firstName, lastName, department, employeePassword) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, employee.getFirstName());
            stmt.setString(2, employee.getLastName());
            String department = employee.dept.toString();   // check this for errors
            stmt.setString(3, department);
            stmt.setString(4, employee.getPassword());
            stmt.executeUpdate();
        }
    }

    public ArrayList<Employee> getAllEmployees() throws SQLException {
        String sql = "SELECT * FROM employees";
        ArrayList<Employee> list = new ArrayList<>();

        try (Statement stmt = conn.createStatement()) {
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                Employee employee = new Employee();
                employee.setId(result.getInt("id"));
                employee.setFirstName(result.getString("firstName"));
                employee.setLastName(result.getString("lastName"));
                employee.dept = Employee.Department.valueOf(result.getString("department"));    // maybe errors here
                employee.setPassword(result.getString("employeePassword"));
         
                list.add(employee);
            }
        }
        return list;
    }
    
    public void updateEmployee(Employee employee) throws SQLException {
        String sql = "UPDATE employees SET firstName=?, lastName=?, department =?, employeePassword=? WHERE id=?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, employee.getFirstName());
            stmt.setString(2, employee.getLastName());
            stmt.setString(3, employee.dept.toString());
            stmt.setString(4, employee.getPassword());
            stmt.setLong(5, employee.getId());
            stmt.executeUpdate();
        }
    }

    public void deleteEmployeeById(long id) throws SQLException {
        String sql = "DELETE FROM employees WHERE id=?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        }
    }
    
    public List<Employee> loadEmployeeList() {
         
        String sql = "SELECT id, firstName, lastName, department FROM employees;";
        List<Employee> list = new ArrayList<>();
        
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
              
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getInt("id"));
                employee.setFirstName(rs.getString("firstName"));
                employee.setLastName(rs.getString("lastName"));
                employee.dept = Employee.Department.valueOf(rs.getString("department"));
                
                list.add(employee);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
//================ Add Method ====================================
    
    
    public void addCustomer(Customer customer) throws SQLException {
        String sql = "INSERT INTO customers (companyName, address, contactNum) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, customer.getCompanyName());
            stmt.setString(2, customer.getAddress());
            stmt.setString(3, customer.getContactNum());
            stmt.executeUpdate();
        }
    }
    
    public void addProduct(Product product) throws SQLException {
        String sql = "INSERT INTO products (productName, pricePerUnit, quantity) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, product.getProductName());
            stmt.setBigDecimal(2, product.getPricePerUnit());
            stmt.setInt(3, product.getQuantity());
            stmt.executeUpdate();
        }
    }
    
    //=============================== ArrayList ===== getAll Method ===============================//
    
    public ArrayList<Customer> getAllCustomers() throws SQLException {
        String sql = "SELECT * FROM customers";
        ArrayList<Customer> list = new ArrayList<>();

        try (Statement stmt = conn.createStatement()) {
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                int id = result.getInt("id");
                String companyName = result.getString("companyName");
                String address = result.getString("Address");
                String contactNum = result.getString("contactNum");
                Customer customer = new Customer(id, companyName, address, contactNum);
                list.add(customer);
            }
        }
        return list;
    }
    
    public ArrayList<Product> getAllProducts() throws SQLException {
        String sql = "SELECT * FROM products";
        ArrayList<Product> list = new ArrayList<>();

        try (Statement stmt = conn.createStatement()) {
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                int id = result.getInt("id");
                String productName = result.getString("productName");
                BigDecimal pericePerUnit = result.getBigDecimal("pricePerUnit");
                int quantity = result.getInt("quantity");
                Product product = new Product(id, productName, pericePerUnit, quantity);
                list.add(product);
            }
        }
        return list;
    }
    
//============================= Get By ID ==================================
    
    public Customer getCustomerById(int id) throws SQLException {
        // FIXME: Preapred statement is required if id may contain malicious SQL injection code
        String sql = "SELECT * FROM customers WHERE id=" + id;

        try (Statement stmt = conn.createStatement()) {
            ResultSet result = stmt.executeQuery(sql);
            if (result.next()) {
                String companyName = result.getString("companyName");
                String address = result.getString("Address");
                String contactNum = result.getString("contactNum");
                
                Customer customer = new Customer(id, companyName, address, contactNum);
                return customer;
            } else {
                throw new RecordNotFoundException("Not found id=" + id);
                // return null;
            }
        }
    }
    //==================== Update ====================
    
    public void updateCustomer(Customer customer) throws SQLException {
        String sql = "UPDATE customers SET companyName=?, Address=?, contactNum=? WHERE id=?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, customer.getCompanyName());
            stmt.setString(2, customer.getAddress());
            stmt.setString(3, customer.getContactNum());
            stmt.setLong(4, customer.getId());
            stmt.executeUpdate();
        }
    }
    
    public void updateProduct(Product product) throws SQLException {
        String sql = "UPDATE products SET productName=?, pricePerUnit=?, quantity =? WHERE id=?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, product.getProductName());
            stmt.setBigDecimal(2, product.getPricePerUnit());
            stmt.setInt(3, product.getQuantity());
            stmt.setLong(4, product.getId());
            stmt.executeUpdate();
        }
    }
    
    
    //==================== Delete ====================
    
    public void deleteCustomerById(long id) throws SQLException {
        String sql = "DELETE FROM customers WHERE id=?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        }
    }
    
    public void deleteProductById(long id) throws SQLException {
        String sql = "DELETE FROM products WHERE id=?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        }
    }
    
    
    //=======================================================
    public void loadTable(DefaultTableModel model) {
        
        model.setRowCount(0);
        List<Employee> list = new ArrayList<>();
           
        try (Statement stmt = conn.createStatement()) {
            String sql= "SELECT firstName, lastName, department, id FROM employees";
            ResultSet rs = stmt.executeQuery(sql);
        
            while(rs.next()) {
                Employee employee = new Employee();
                employee.setFirstName(rs.getString("firstName"));
                employee.setLastName(rs.getString("lastName"));
                employee.dept = Employee.Department.valueOf(rs.getString("department"));
                employee.setId((long) rs.getInt("id"));
                list.add(employee);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Employees.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0; i < list.size(); i++){
            String firstName = list.get(i).getFirstName();
            String lastName = list.get(i).getLastName();
            String department = list.get(i).dept.toString();
            Long id = list.get(i).getId();
            
            Object[] data = {firstName, lastName, department, id};
            
            model.addRow(data);
        }
    }
    
    public String login(String firstName, String password) {
               
        String sql = "SELECT firstName, department, employeePassword "
                + "FROM employees WHERE firstName = ? AND employeePassword = ?";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, firstName);
            stmt.setString(2, password);
                        
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                if (firstName.equals(rs.getString("firstName")) && password.equals(rs.getString("employeePassword"))) {
                String dept = rs.getString("department");
                return dept;
                }
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        String nullLogin = null;
        return nullLogin;
    }
    
}
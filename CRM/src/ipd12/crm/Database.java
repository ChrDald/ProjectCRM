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
            stmt.setString(3, employee.dept.toString());    // errors here...
            stmt.setString(4, employee.getPassword());
            
            stmt.executeUpdate();
        }
    }

    public void deleteEmployeeById(int id) throws SQLException {
        String sql = "DELETE FROM employees WHERE id=?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
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
    
    public void loadTable(DefaultTableModel model) {
        
        model.setRowCount(0);
        List<Employee> list = new ArrayList<>();
           
        try (Statement stmt = conn.createStatement()) {
            String sql= "SELECT firstName, lastName, department FROM employees";
            ResultSet rs = stmt.executeQuery(sql);
        
            while(rs.next()) {
                Employee employee = new Employee();
                employee.setFirstName(rs.getString("firstName"));
                employee.setLastName(rs.getString("lastName"));
                employee.dept = Employee.Department.valueOf(rs.getString("department"));
                
                list.add(employee);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Employees.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0; i < list.size(); i++){
            String firstName = list.get(i).getFirstName();
            String lastName = list.get(i).getLastName();
            String department = list.get(i).dept.toString();
            
            Object[] data = {firstName, lastName, department};
            
            model.addRow(data);
        }
    }
    

}
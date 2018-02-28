package ipd12.crm;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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

    private final static String HOSTNAME = "localhost";
    private final static String DBNAME = "first";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "root";

    private Connection conn;

    public Database() throws SQLException {
        conn = DriverManager.getConnection(
                "jdbc:mysql://" + HOSTNAME + "/" + DBNAME,
                USERNAME, PASSWORD);
    }

    public void addEmployee(Employee employee) throws SQLException {
        String sql = "INSERT INTO employees (deposit, withdrawal) VALUES (?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setBigDecimal(1, employee.getDeposit());
            stmt.setBigDecimal(2, employee.getWithdrawal());
            stmt.executeUpdate();
        }
    }

    public BigDecimal getBalance() throws SQLException {
        String sql = "SELECT SUM(deposit-withdrawal) as sum FROM employeeactions";
        try (Statement stmt = conn.createStatement()) {
            ResultSet result = stmt.executeQuery(sql);
            if (result.next()) {
                BigDecimal sum = result.getBigDecimal("sum");
                return sum;
            } else {
                return new BigDecimal(0); // no records found
            }
        }
    }

    public ArrayList<Employee> getAllEmployees() throws SQLException {
        String sql = "SELECT * FROM employeeactions";
        ArrayList<Employee> list = new ArrayList<>();

        try (Statement stmt = conn.createStatement()) {
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                int id = result.getInt("id");
                BigDecimal deposit = result.getBigDecimal("deposit");
                BigDecimal withdrawal = result.getBigDecimal("withdrawal");
                java.util.Date opdate = result.getDate("opDate");
                Employee employee = new Employee(id, deposit, withdrawal, opdate);
                list.add(employee);
            }
        }
        return list;
    }

    public Employee getEmployeeById(int id) throws SQLException {
        // FIXME: Preapred statement is required if id may contain malicious SQL injection code
        String sql = "SELECT * FROM employeeactions WHERE id=" + id;

        try (Statement stmt = conn.createStatement()) {
            ResultSet result = stmt.executeQuery(sql);
            if (result.next()) {
                BigDecimal deposit = result.getBigDecimal("deposit");
                BigDecimal withdrawal = result.getBigDecimal("withdrawal");
                java.util.Date opdate = result.getDate("opDate");
                Employee employee = new Employee(id, deposit, withdrawal, opdate);
                return employee;
            } else {
                throw new RecordNotFoundException("Not found id=" + id);
                // return null;
            }
        }
    }

    public void updateEmployee(Employee employee) throws SQLException {
        String sql = "UPDATE employeeactions SET task=?, dueDate=?, isDone=? WHERE id=?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setBigDecimal(1, employee.getDeposit());
            stmt.setBigDecimal(2, employee.getWithdrawal());
            stmt.setDate(3, new java.sql.Date(employee.getOpDate().getTime()));
            stmt.executeUpdate();
        }
    }

    public void deleteEmployeeById(int id) throws SQLException {
        String sql = "DELETE FROM employeeactions WHERE id=?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipd12.crm;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yasser
 */
public class Employees extends javax.swing.JFrame {

    Database db;
    DefaultTableModel model = new DefaultTableModel(new String[]{"First Name", "Last Name", "Department", "Id"}, 0);
   
    
    public Employees() {
        initComponents();
        
        db = new Database();
        db.loadTable(model);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgAdd = new javax.swing.JDialog();
        dlgAdd_lblId = new javax.swing.JLabel();
        dlgAdd_lblFirstName = new javax.swing.JLabel();
        dlgAdd_tfFirstName = new javax.swing.JTextField();
        dlgAdd_lblPassword = new javax.swing.JLabel();
        dlgAdd_btCancel = new javax.swing.JButton();
        dlgAdd_btSave = new javax.swing.JButton();
        dlgAdd_lblIdValue = new javax.swing.JLabel();
        dlgAdd_lblLastName = new javax.swing.JLabel();
        dlgAdd_tfLastName = new javax.swing.JTextField();
        dlgAdd_tfPassword = new javax.swing.JTextField();
        dlgAdd_lblDepartment = new javax.swing.JLabel();
        dlgAdd_cbDepartment = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Employee_btAdd = new javax.swing.JButton();
        Employee_btEdit = new javax.swing.JButton();
        Employee_btDelete = new javax.swing.JButton();
        Employee_btPrint = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;   //Disallow the editing of any cell
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuEmployees = new javax.swing.JMenu();
        menuCustomer = new javax.swing.JMenu();
        menuSales = new javax.swing.JMenu();
        menuSupport = new javax.swing.JMenu();
        menuLogin = new javax.swing.JMenu();

        dlgAdd_lblId.setText("Id");

        dlgAdd_lblFirstName.setText("First Name");

        dlgAdd_lblPassword.setText("Password");

        dlgAdd_btCancel.setText("Cancel");
        dlgAdd_btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgAdd_btCancelActionPerformed(evt);
            }
        });

        dlgAdd_btSave.setText("Save");
        dlgAdd_btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgAdd_btSaveActionPerformed(evt);
            }
        });

        dlgAdd_lblIdValue.setText("...");

        dlgAdd_lblLastName.setText("Last Name");

        dlgAdd_lblDepartment.setText("Department");

        dlgAdd_cbDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sales", "Support", "Management" }));

        javax.swing.GroupLayout dlgAddLayout = new javax.swing.GroupLayout(dlgAdd.getContentPane());
        dlgAdd.getContentPane().setLayout(dlgAddLayout);
        dlgAddLayout.setHorizontalGroup(
            dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAddLayout.createSequentialGroup()
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgAddLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dlgAddLayout.createSequentialGroup()
                                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dlgAdd_lblPassword)
                                    .addComponent(dlgAdd_lblDepartment))
                                .addGap(26, 26, 26)
                                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dlgAdd_tfPassword)
                                    .addGroup(dlgAddLayout.createSequentialGroup()
                                        .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(dlgAdd_btSave)
                                            .addComponent(dlgAdd_cbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 44, Short.MAX_VALUE))))
                            .addGroup(dlgAddLayout.createSequentialGroup()
                                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dlgAdd_lblFirstName)
                                    .addComponent(dlgAdd_lblLastName)
                                    .addComponent(dlgAdd_lblId))
                                .addGap(32, 32, 32)
                                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(dlgAddLayout.createSequentialGroup()
                                        .addComponent(dlgAdd_lblIdValue, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(dlgAdd_tfFirstName)
                                    .addComponent(dlgAdd_tfLastName)))))
                    .addGroup(dlgAddLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(dlgAdd_btCancel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        dlgAddLayout.setVerticalGroup(
            dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAddLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlgAdd_lblId)
                    .addComponent(dlgAdd_lblIdValue))
                .addGap(18, 18, 18)
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlgAdd_lblFirstName)
                    .addComponent(dlgAdd_tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlgAdd_tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dlgAdd_lblLastName))
                .addGap(18, 18, 18)
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlgAdd_lblPassword)
                    .addComponent(dlgAdd_tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlgAdd_lblDepartment)
                    .addComponent(dlgAdd_cbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlgAdd_btCancel)
                    .addComponent(dlgAdd_btSave)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_END);

        Employee_btAdd.setText("Add");
        Employee_btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Employee_btAddActionPerformed(evt);
            }
        });

        Employee_btEdit.setText("Edit");
        Employee_btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Employee_btEditActionPerformed(evt);
            }
        });

        Employee_btDelete.setText("Delete");
        Employee_btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Employee_btDeleteActionPerformed(evt);
            }
        });

        Employee_btPrint.setText("Print");

        jLabel25.setText("Employees");

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(model);
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Employee_btDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Employee_btEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Employee_btAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Employee_btPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel25))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Employee_btAdd)
                        .addGap(18, 18, 18)
                        .addComponent(Employee_btEdit)
                        .addGap(18, 18, 18)
                        .addComponent(Employee_btDelete)
                        .addGap(18, 18, 18)
                        .addComponent(Employee_btPrint))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        menuFile.setText("File");
        jMenuBar1.add(menuFile);

        menuEmployees.setText("Employees");
        jMenuBar1.add(menuEmployees);

        menuCustomer.setText("Customers");
        jMenuBar1.add(menuCustomer);

        menuSales.setText("Sales");
        jMenuBar1.add(menuSales);

        menuSupport.setText("Support");
        jMenuBar1.add(menuSupport);

        menuLogin.setText("Login");
        jMenuBar1.add(menuLogin);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Employee_btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Employee_btAddActionPerformed

        // set dialog to clean initial state
        dlgAdd_tfFirstName.setText("");
        dlgAdd_tfLastName.setText("");
        dlgAdd_tfPassword.setText("");
        dlgAdd_cbDepartment.setSelectedIndex(0);

        // show it
        dlgAdd.pack();
        dlgAdd.setVisible(true);
    }//GEN-LAST:event_Employee_btAddActionPerformed

    private void dlgAdd_btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgAdd_btCancelActionPerformed
        dlgAdd.setVisible(false);
    }//GEN-LAST:event_dlgAdd_btCancelActionPerformed

    private void dlgAdd_btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgAdd_btSaveActionPerformed
    
        try {
            Employee employee = new Employee();
            employee.setFirstName(dlgAdd_tfFirstName.getText());
            employee.setLastName(dlgAdd_tfLastName.getText());
            employee.setPassword(dlgAdd_tfPassword.getText());
            employee.dept = Employee.Department.valueOf(dlgAdd_cbDepartment.getSelectedItem().toString());
            
            // Check if the dialog is to edit or add a new entry
            if (dlgAdd_lblIdValue.getText().equals("...")) { // if youre editing, this would be false
                db.addEmployee(employee);
            }
            else {
                try {
                    employee.setId(Long.valueOf(dlgAdd_lblIdValue.getText()));
                } catch (NumberFormatException e) {
                    System.err.println("Invalid id value, could not format to long");
                } catch (NullPointerException e) {
                    System.err.println("Id value is null");
                }
                
                db.updateEmployee(employee);
            }
        } catch (SQLException ex) {
            System.err.println("SQL Exception");
            Logger.getLogger(Employees.class.getName()).log(Level.SEVERE, null, ex);
        }
        dlgAdd.setVisible(false);
        db.loadTable(model);
    }//GEN-LAST:event_dlgAdd_btSaveActionPerformed

    private void Employee_btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Employee_btDeleteActionPerformed
        
        int decision = JOptionPane.showOptionDialog(
            this,   // parent element, this referes to the frame
            "Are you sure you want to delete this item?", // the message
            "Alert",    // message icon
            JOptionPane.YES_NO_OPTION,  // how many buttons (in this case 2, yes and no)
            JOptionPane.WARNING_MESSAGE,
            null,   // custom icon
            null,
            null
        );

        if (decision == JOptionPane.YES_OPTION) {

            int rowIndex = jTable1.getSelectedRow();
            long id = 0;
            try {
                id = (long) jTable1.getValueAt(rowIndex, 3);
            } catch (ClassCastException e) {
                System.err.println("Delete could not be performed, please try again later...");
            }

            try {
                db.deleteEmployeeById(id);
            } catch (SQLException ex) {
                System.err.println("Error deleting from database, check your query");
                Logger.getLogger(Employees.class.getName()).log(Level.SEVERE, null, ex);
            }
            db.loadTable(model);
        }
    }//GEN-LAST:event_Employee_btDeleteActionPerformed

    private void Employee_btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Employee_btEditActionPerformed
          
        Employee employee = new Employee();
        int rowIndex = jTable1.getSelectedRow();
        
        try {
            String firstName = String.valueOf(jTable1.getValueAt(rowIndex, 0)); // get first name
            String lastName = String.valueOf(jTable1.getValueAt(rowIndex, 1)); // get last name
            String id = String.valueOf(jTable1.getValueAt(rowIndex, 3)); // get the employee id
            
            employee.setFirstName(firstName);
            employee.setLastName(lastName);
            
            dlgAdd_lblIdValue.setText(id);
            dlgAdd_tfFirstName.setText(firstName);
            dlgAdd_tfLastName.setText(lastName);
            dlgAdd_tfPassword.setText("****"); // maybe add click event on this text field, when clicked clear all data in the
                                               // text field
            dlgAdd.pack();
            dlgAdd.setVisible(true);
        } catch (ClassCastException e) {
            System.err.println("Casting exception");
        }
        
        
                
        
    }//GEN-LAST:event_Employee_btEditActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employees().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Employee_btAdd;
    private javax.swing.JButton Employee_btDelete;
    private javax.swing.JButton Employee_btEdit;
    private javax.swing.JButton Employee_btPrint;
    private javax.swing.JDialog dlgAdd;
    private javax.swing.JButton dlgAdd_btCancel;
    private javax.swing.JButton dlgAdd_btSave;
    private javax.swing.JComboBox<String> dlgAdd_cbDepartment;
    private javax.swing.JLabel dlgAdd_lblDepartment;
    private javax.swing.JLabel dlgAdd_lblFirstName;
    private javax.swing.JLabel dlgAdd_lblId;
    private javax.swing.JLabel dlgAdd_lblIdValue;
    private javax.swing.JLabel dlgAdd_lblLastName;
    private javax.swing.JLabel dlgAdd_lblPassword;
    private javax.swing.JTextField dlgAdd_tfFirstName;
    private javax.swing.JTextField dlgAdd_tfLastName;
    private javax.swing.JTextField dlgAdd_tfPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu menuCustomer;
    private javax.swing.JMenu menuEmployees;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuLogin;
    private javax.swing.JMenu menuSales;
    private javax.swing.JMenu menuSupport;
    // End of variables declaration//GEN-END:variables
}

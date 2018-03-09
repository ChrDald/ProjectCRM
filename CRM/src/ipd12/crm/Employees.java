/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipd12.crm;

import com.sun.xml.internal.ws.policy.sourcemodel.ModelNode;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuBar;
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
        
        // Restrictions on users
        if (!Login.department.equals("Management")) {
            btAdd.setEnabled(false);
            btEdit.setEnabled(false);
            btDelete.setEnabled(false);
        }
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btAdd = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btPrint = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;   //Disallow the editing of any cell
            }
        };
        btSupport = new javax.swing.JButton();
        btSales = new javax.swing.JButton();
        btCustomers = new javax.swing.JButton();
        btEmployees = new javax.swing.JButton();
        btSupport1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuSales = new javax.swing.JMenu();
        menuSupport = new javax.swing.JMenu();
        menuSupport1 = new javax.swing.JMenu();
        menuSupport2 = new javax.swing.JMenu();
        menuSupport3 = new javax.swing.JMenu();
        menuLogout = new javax.swing.JMenu();

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

        jLabel1.setText("Employees");
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_END);

        btAdd.setText("Add");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btEdit.setText("Edit");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        btDelete.setText("Delete");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btPrint.setText("Print");
        btPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrintActionPerformed(evt);
            }
        });

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(model);
        jScrollPane2.setViewportView(jTable1);

        btSupport.setText("Support");
        btSupport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSupportActionPerformed(evt);
            }
        });

        btSales.setText("Sales");
        btSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalesActionPerformed(evt);
            }
        });

        btCustomers.setText("Customers");
        btCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCustomersActionPerformed(evt);
            }
        });

        btEmployees.setBackground(new java.awt.Color(255, 255, 255));
        btEmployees.setText("Employees");
        btEmployees.setSelected(true);

        btSupport1.setText("Products");
        btSupport1.setSelected(true);
        btSupport1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSupport1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btEmployees)
                        .addGap(0, 0, 0)
                        .addComponent(btCustomers)
                        .addGap(0, 0, 0)
                        .addComponent(btSales, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btSupport, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btSupport1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEmployees)
                    .addComponent(btCustomers)
                    .addComponent(btSales)
                    .addComponent(btSupport)
                    .addComponent(btSupport1))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btEdit)
                        .addGap(18, 18, 18)
                        .addComponent(btDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btPrint))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        menuFile.setText("File");
        jMenuBar1.add(menuFile);

        menuSales.setText("Import");
        jMenuBar1.add(menuSales);

        menuSupport.setText("Export");

        menuSupport1.setText("Export");
        menuSupport.add(menuSupport1);

        jMenuBar1.add(menuSupport);

        menuSupport2.setText("Print");

        menuSupport3.setText("Export");
        menuSupport2.add(menuSupport3);

        jMenuBar1.add(menuSupport2);

        menuLogout.setText("Logout");
        menuLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuLogoutMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuLogout);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed

        // set dialog to clean initial state
        dlgAdd_tfFirstName.setText("");
        dlgAdd_tfLastName.setText("");
        dlgAdd_tfPassword.setText("");
        dlgAdd_cbDepartment.setSelectedIndex(0);

        // show it
        dlgAdd.pack();
        dlgAdd.setVisible(true);
    }//GEN-LAST:event_btAddActionPerformed

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

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        
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
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this,
                "Cannot delete selected employee. Database referential integrity would be comprised.",
                "Database conflict",
                JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(Employees.class.getName()).log(Level.SEVERE, null, e);
            }              
        }
        db.loadTable(model);
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
          
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
        
    }//GEN-LAST:event_btEditActionPerformed

    private void btSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalesActionPerformed
        this.dispose();
        Sales.main(null);
    }//GEN-LAST:event_btSalesActionPerformed

    private void btCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCustomersActionPerformed
        this.dispose();
        Customers.main(null);                
    }//GEN-LAST:event_btCustomersActionPerformed

    private void btSupportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSupportActionPerformed
        this.dispose();
        Support.main(null);
    }//GEN-LAST:event_btSupportActionPerformed

    private void btSupport1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSupport1ActionPerformed
        this.dispose();
        Products.main(null);
    }//GEN-LAST:event_btSupport1ActionPerformed

    private void menuLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLogoutMouseClicked
        int decision = JOptionPane.showOptionDialog(
            this,
            "Are you sure you want to logout?",
            "Alert",    // message icon
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE,
            null,
            null,
            null
        );

        if (decision == JOptionPane.YES_OPTION) {
            this.dispose();
            Login.main(null);
        }
    }//GEN-LAST:event_menuLogoutMouseClicked

    private void btPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrintActionPerformed
        MessageFormat header = new MessageFormat("Report Print");
        MessageFormat footer = new MessageFormat("Page {0,number,integer}");
        
        try{
            
            jTable1.print(JTable.PrintMode.NORMAL, header, footer);
            
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Can not print %s%n", e.getMessage());
        }
    }//GEN-LAST:event_btPrintActionPerformed

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
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btCustomers;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btEmployees;
    private javax.swing.JButton btPrint;
    private javax.swing.JButton btSales;
    private javax.swing.JButton btSupport;
    private javax.swing.JButton btSupport1;
    private javax.swing.ButtonGroup buttonGroup1;
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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuLogout;
    private javax.swing.JMenu menuSales;
    private javax.swing.JMenu menuSupport;
    private javax.swing.JMenu menuSupport1;
    private javax.swing.JMenu menuSupport2;
    private javax.swing.JMenu menuSupport3;
    // End of variables declaration//GEN-END:variables
}

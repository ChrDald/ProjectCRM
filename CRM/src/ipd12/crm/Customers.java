/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipd12.crm;

import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author yasser
 */
public class Customers extends javax.swing.JFrame {

    Database db;

    /**
     * Creates new form jcrm
     */
    public Customers() {
        db = new Database();
        initComponents();
        loadCustomers();
    }

    public void loadCustomers() {
        try {
            
            DefaultTableModel model = (DefaultTableModel) customersTable.getModel();
            model.setRowCount(0);
            ArrayList<Customer> list = db.getAllCustomers();
            Object rowData[] = new Object[4];
            for (int i = 0; i < list.size(); i++) {
                rowData[0] = list.get(i).getId();
                rowData[1] = list.get(i).getCompanyName();
                rowData[2] = list.get(i).getAddress();
                rowData[3] = list.get(i).getContactNum();
                model.addRow(rowData);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            // display dialog with error message and terminate the program
            JOptionPane.showMessageDialog(this,
                    "Error: unable to reload customers\n" + ex.getMessage(),
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
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

        Add_Customer = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dlgAddCustomer_tfCompanyName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dlgAddCustomer_btCancel = new javax.swing.JButton();
        dlgAddCustomer_btSave = new javax.swing.JButton();
        dlgAddCustomer_lbId = new javax.swing.JLabel();
        dlgAddCustomer_tfAddress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dlgAddCustomer_tfContactNumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        customer_btAdd = new javax.swing.JButton();
        customer_btEdit = new javax.swing.JButton();
        customer_btDelete = new javax.swing.JButton();
        customer_btPrint = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        customersTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuEmployees = new javax.swing.JMenu();
        menuCustomer = new javax.swing.JMenu();
        menuSales = new javax.swing.JMenu();
        menuSupport = new javax.swing.JMenu();
        menuLogin = new javax.swing.JMenu();

        jLabel2.setText("Id");

        jLabel3.setText("Company Name");

        jLabel4.setText("Address");

        dlgAddCustomer_btCancel.setText("Cancel");

        dlgAddCustomer_btSave.setText("Save");
        dlgAddCustomer_btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgAddCustomer_btSaveActionPerformed(evt);
            }
        });

        dlgAddCustomer_lbId.setText("...");

        jLabel8.setText("Contact Number");

        javax.swing.GroupLayout Add_CustomerLayout = new javax.swing.GroupLayout(Add_Customer.getContentPane());
        Add_Customer.getContentPane().setLayout(Add_CustomerLayout);
        Add_CustomerLayout.setHorizontalGroup(
            Add_CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_CustomerLayout.createSequentialGroup()
                .addGroup(Add_CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Add_CustomerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Add_CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Add_CustomerLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(dlgAddCustomer_tfCompanyName))
                            .addGroup(Add_CustomerLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(26, 26, 26)
                                .addComponent(dlgAddCustomer_tfAddress))
                            .addGroup(Add_CustomerLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(88, 88, 88)
                                .addComponent(dlgAddCustomer_lbId, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(Add_CustomerLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(dlgAddCustomer_tfContactNumber))))
                    .addGroup(Add_CustomerLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(dlgAddCustomer_btCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(dlgAddCustomer_btSave)
                        .addGap(36, 36, 36)))
                .addContainerGap())
        );
        Add_CustomerLayout.setVerticalGroup(
            Add_CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_CustomerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Add_CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dlgAddCustomer_lbId))
                .addGap(18, 18, 18)
                .addGroup(Add_CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dlgAddCustomer_tfCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Add_CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dlgAddCustomer_tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Add_CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(dlgAddCustomer_tfContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Add_CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlgAddCustomer_btCancel)
                    .addComponent(dlgAddCustomer_btSave)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_END);

        customer_btAdd.setText("Add");
        customer_btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_btAddActionPerformed(evt);
            }
        });

        customer_btEdit.setText("Edit");
        customer_btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_btEditActionPerformed(evt);
            }
        });

        customer_btDelete.setText("Delete");
        customer_btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_btDeleteActionPerformed(evt);
            }
        });

        customer_btPrint.setText("Print");

        jLabel25.setText("Customers");

        customersTable.setAutoCreateRowSorter(true);
        customersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Company Name", "Address", "Contact Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(customersTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(customer_btDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(customer_btEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(customer_btAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(customer_btPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel25))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(customer_btAdd)
                        .addGap(18, 18, 18)
                        .addComponent(customer_btEdit)
                        .addGap(18, 18, 18)
                        .addComponent(customer_btDelete)
                        .addGap(18, 18, 18)
                        .addComponent(customer_btPrint)
                        .addContainerGap(129, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
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

    private void customer_btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_btAddActionPerformed
        Add_Customer.pack();
        Add_Customer.setVisible(true);
    }//GEN-LAST:event_customer_btAddActionPerformed

    private void dlgAddCustomer_btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgAddCustomer_btSaveActionPerformed
        try {
            String companyName = dlgAddCustomer_tfCompanyName.getText();
            String address = dlgAddCustomer_tfAddress.getText();
            String contactNum = dlgAddCustomer_tfContactNumber.getText();
            

            Customer c;
            c = new Customer(0, companyName, address, contactNum);
            db.addCustomer(c);

            loadCustomers();
        } catch (SQLException ex) {
            ex.printStackTrace();
            // display dialog with error message and terminate the program
            JOptionPane.showMessageDialog(this,
                    "Error: unable to reload customer\n" + ex.getMessage(),
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_dlgAddCustomer_btSaveActionPerformed

    private void customer_btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_btEditActionPerformed
        
        int rowIndex = customersTable.getSelectedRow();
        
        try {
            String id = String.valueOf(customersTable.getValueAt(rowIndex, 0)); 
            String companyName = String.valueOf(customersTable.getValueAt(rowIndex, 1));
            String address = String.valueOf(customersTable.getValueAt(rowIndex, 2));
            String contactNum = String.valueOf(customersTable.getValueAt(rowIndex, 3));
            
            Customer c;
            c = new Customer(companyName, address, contactNum);
            
            c.setCompanyName(companyName);
            c.setAddress(address);
            c.setContactNum(contactNum);
            
            dlgAddCustomer_lbId.setText(id);
            dlgAddCustomer_tfCompanyName.setText(companyName);
            dlgAddCustomer_tfAddress.setText(address);
            dlgAddCustomer_tfContactNumber.setText(contactNum);
            
            //dlgAdd_lblIdValue.setText(id);
            //dlgAdd_tfFirstName.setText(firstName);
            //dlgAdd_tfLastName.setText(lastName);
            //dlgAdd_tfPassword.setText("****"); // maybe add click event on this text field, when clicked clear all data in the
                                               // text field
            Add_Customer.pack();
            Add_Customer.setVisible(true);
        } catch (ClassCastException e) {
            System.err.println("Casting exception");
        }
    }//GEN-LAST:event_customer_btEditActionPerformed

    private void customer_btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_btDeleteActionPerformed
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

            int rowIndex = customersTable.getSelectedRow();
            long id = 0;
            try {
                id = (long) customersTable.getValueAt(rowIndex, 3);
            } catch (ClassCastException e) {
                System.err.println("Delete could not be performed, please try again later...");
            }

            try {
                db.deleteCustomerById(id);
            } catch (SQLException ex) {
                System.err.println("Error deleting from database, check your query");
                Logger.getLogger(Employees.class.getName()).log(Level.SEVERE, null, ex);
            }
            loadCustomers();
        }
    }//GEN-LAST:event_customer_btDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Add_Customer;
    private javax.swing.JButton customer_btAdd;
    private javax.swing.JButton customer_btDelete;
    private javax.swing.JButton customer_btEdit;
    private javax.swing.JButton customer_btPrint;
    private javax.swing.JTable customersTable;
    private javax.swing.JButton dlgAddCustomer_btCancel;
    private javax.swing.JButton dlgAddCustomer_btSave;
    private javax.swing.JLabel dlgAddCustomer_lbId;
    private javax.swing.JTextField dlgAddCustomer_tfAddress;
    private javax.swing.JTextField dlgAddCustomer_tfCompanyName;
    private javax.swing.JTextField dlgAddCustomer_tfContactNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu menuCustomer;
    private javax.swing.JMenu menuEmployees;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuLogin;
    private javax.swing.JMenu menuSales;
    private javax.swing.JMenu menuSupport;
    // End of variables declaration//GEN-END:variables
}

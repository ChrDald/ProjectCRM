/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipd12.crm;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yasser
 */
public class Support extends javax.swing.JFrame {

    Database db;
    DefaultTableModel model = new DefaultTableModel(new String[]
    {"Ticket Id", "Agent Id", "Customer Id", "Product Id", "Description"}, 0);
    
    public Support() {
        initComponents();
        db = new Database();
        loadTickets();
        
        // Restrictions on users
        if (!Login.department.equals("Management")) {
            btDelete.setEnabled(false);
        }
        if (!Login.department.equals("Support") && !Login.department.equals("Management")) {
            btAdd.setEnabled(false);
            btEdit.setEnabled(false);
        }
    }
    public void loadTickets() {
        
        try {            
            model.setRowCount(0);
            ArrayList<Ticket> list = db.getAllTickets();
            Object rowData[] = new Object[5];
            for (int i = 0; i < list.size(); i++) {
                rowData[0] = list.get(i).getId();
                rowData[1] = list.get(i).getSupportAgentId();
                rowData[2] = list.get(i).getDescription();
                rowData[3] = list.get(i).getCustomerId();
                rowData[4] = list.get(i).getProductId();
                model.addRow(rowData);
                
                // line below only applies when this method is called from the Support class
                try {
                    Support.dlgAddTicket_cbProduct.addItem(rowData[1].toString());
                } catch (NullPointerException e) {
                    
                }
                
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            // display dialog with error message and terminate the program
            JOptionPane.showMessageDialog(this,
                    "Error: unable to reload products\n" + ex.getMessage(),
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

        dlgAddTicket = new javax.swing.JDialog();
        jLabel19 = new javax.swing.JLabel();
        dlgAddTicket_lbId = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        dlgAddTicket_cbProduct = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        dlgAddTicket_tfDescription = new javax.swing.JTextField();
        dlgAddTicket_rbIsDone = new javax.swing.JRadioButton();
        dlgAddTicket_rbIsNotDone = new javax.swing.JRadioButton();
        dlgAddTicket_btSave = new javax.swing.JButton();
        dlgAddTicket_btCancel = new javax.swing.JButton();
        dlgAddTicket_lblAgentId = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dlgAddTicket_cbCustomerId = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btAdd = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btPrint = new javax.swing.JButton();
        btEmployees = new javax.swing.JButton();
        btCustomers = new javax.swing.JButton();
        btSales = new javax.swing.JButton();
        btSupport = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbSupport = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;   //Disallow the editing of any cell
            }
        };
        btSupport1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuSales = new javax.swing.JMenu();
        menuSupport = new javax.swing.JMenu();
        menuSupport1 = new javax.swing.JMenu();
        menuSupport2 = new javax.swing.JMenu();
        menuSupport3 = new javax.swing.JMenu();
        menuLogout = new javax.swing.JMenu();

        jLabel19.setText("Ticket id: ");

        dlgAddTicket_lbId.setText("...");

        jLabel21.setText("Customer Id:");

        jLabel22.setText("Product:");

        dlgAddTicket_cbProduct.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dlgAddTicket_cbProductItemStateChanged(evt);
            }
        });

        jLabel23.setText("Support Agent id:");

        jLabel24.setText("Description of the issue:");

        dlgAddTicket_tfDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgAddTicket_tfDescriptionActionPerformed(evt);
            }
        });

        dlgAddTicket_rbIsDone.setText("Is Done");

        dlgAddTicket_rbIsNotDone.setText("Is Not Done");

        dlgAddTicket_btSave.setText("Save");
        dlgAddTicket_btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgAddTicket_btSaveActionPerformed(evt);
            }
        });

        dlgAddTicket_btCancel.setText("Cancel");
        dlgAddTicket_btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgAddTicket_btCancelActionPerformed(evt);
            }
        });

        dlgAddTicket_lblAgentId.setText("placeholder");

        dlgAddTicket_cbCustomerId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dlgAddTicket_cbCustomerIdItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout dlgAddTicketLayout = new javax.swing.GroupLayout(dlgAddTicket.getContentPane());
        dlgAddTicket.getContentPane().setLayout(dlgAddTicketLayout);
        dlgAddTicketLayout.setHorizontalGroup(
            dlgAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgAddTicketLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(dlgAddTicket_btCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dlgAddTicket_btSave)
                .addGap(119, 119, 119))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgAddTicketLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dlgAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dlgAddTicketLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(dlgAddTicket_cbProduct, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dlgAddTicketLayout.createSequentialGroup()
                        .addGroup(dlgAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel19)
                            .addGroup(dlgAddTicketLayout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dlgAddTicket_lblAgentId))
                            .addComponent(jLabel3)
                            .addGroup(dlgAddTicketLayout.createSequentialGroup()
                                .addComponent(dlgAddTicket_rbIsDone)
                                .addGap(18, 18, 18)
                                .addComponent(dlgAddTicket_rbIsNotDone)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(dlgAddTicketLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(dlgAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dlgAddTicket_cbCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dlgAddTicket_lbId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dlgAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(dlgAddTicket_tfDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        dlgAddTicketLayout.setVerticalGroup(
            dlgAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAddTicketLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dlgAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(dlgAddTicket_lbId)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(dlgAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dlgAddTicket_tfDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dlgAddTicketLayout.createSequentialGroup()
                        .addGroup(dlgAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(dlgAddTicket_cbCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(dlgAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(dlgAddTicket_cbProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(dlgAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(dlgAddTicket_lblAgentId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(dlgAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dlgAddTicket_rbIsDone)
                            .addComponent(dlgAddTicket_rbIsNotDone))))
                .addGap(18, 18, 18)
                .addGroup(dlgAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlgAddTicket_btSave)
                    .addComponent(dlgAddTicket_btCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_END);

        btAdd.setText("Add");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btEdit.setText("Edit");

        btDelete.setText("Delete");

        btPrint.setText("Print");

        btEmployees.setText("Employees");
        btEmployees.setFocusable(false);
        btEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmployeesActionPerformed(evt);
            }
        });

        btCustomers.setText("Customers");
        btCustomers.setFocusable(false);
        btCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCustomersActionPerformed(evt);
            }
        });

        btSales.setText("Sales");
        btSales.setFocusable(false);
        btSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalesActionPerformed(evt);
            }
        });

        btSupport.setBackground(new java.awt.Color(255, 255, 255));
        btSupport.setText("Support");
        btSupport.setSelected(true);
        btSupport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSupportActionPerformed(evt);
            }
        });

        tbSupport.setAutoCreateRowSorter(true);
        tbSupport.setModel(model);
        jScrollPane2.setViewportView(tbSupport);

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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addComponent(btPrint)
                        .addContainerGap(146, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
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
    }// </editor-fold>//GEN-END:initComponents

    private void dlgAddTicket_tfDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgAddTicket_tfDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dlgAddTicket_tfDescriptionActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed

        try {
            ArrayList<Customer> customers = db.getAllCustomers();
            ArrayList<Long> customerIds = new ArrayList<>();
            
            for (int i = 0; i < customers.size(); i++) {
                customerIds.add(customers.get(i).getId());
            }          
            System.err.println(customerIds); // test line
            // add the IDs to the combo box
            for (int i = 0; i < customerIds.size(); i++) {
                dlgAddTicket_cbCustomerId.addItem(customerIds.get(i).toString());
            }
           
            getCustomerProducts();
        } catch (SQLException ex) {
            Logger.getLogger(Support.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        dlgAddTicket.dispose();
        dlgAddTicket.pack();
        
        dlgAddTicket_lblAgentId.setText(Login.userId + "");
        dlgAddTicket.setVisible(true);
    }//GEN-LAST:event_btAddActionPerformed

    private void dlgAddTicket_btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgAddTicket_btCancelActionPerformed
        dlgAddTicket.setVisible(false);
    }//GEN-LAST:event_dlgAddTicket_btCancelActionPerformed

    private void btCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCustomersActionPerformed
        this.dispose();
        Customers.main(null);
    }//GEN-LAST:event_btCustomersActionPerformed

    private void btSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalesActionPerformed
        this.dispose();
        Sales.main(null);
    }//GEN-LAST:event_btSalesActionPerformed

    private void btSupportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSupportActionPerformed
        this.dispose();
        Support.main(null);
    }//GEN-LAST:event_btSupportActionPerformed

    private void dlgAddTicket_btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgAddTicket_btSaveActionPerformed
        
        try {
            // supportAgentId, description, customerId, productId
            Ticket ticket = new Ticket();
            // ticket.setId **When adding, the id doesnt exist yet**
            ticket.setSupportAgentId(Integer.valueOf(dlgAddTicket_lblAgentId.getText().trim()));
            ticket.setDescription(dlgAddTicket_tfDescription.getText());
            ticket.setCustomerId(Integer.parseInt(dlgAddTicket_cbCustomerId.getSelectedItem().toString()));
 
            // get product id
            switch (dlgAddTicket_cbProduct.getSelectedItem().toString()) {
                case "sw":
                    ticket.setId(1);
                    break;
                case "sw2960":
                    ticket.setId(2);
                    break;
                case "UTMCisco":
                    ticket.setId(4);
                    break;
                default:
                    JOptionPane.showMessageDialog(this,
                            "Invalid Product Selected",
                            "Internal Error",
                            JOptionPane.ERROR_MESSAGE);
                    break;
            }
            System.err.println("Ticket id: " + ticket.getId());
            db.addTicket(ticket);

        } catch (SQLException ex) {
            System.err.println("SQL Exception");
            Logger.getLogger(Employees.class.getName()).log(Level.SEVERE, null, ex);
        } 
        dlgAddTicket.setVisible(false);
        loadTickets();
    }//GEN-LAST:event_dlgAddTicket_btSaveActionPerformed

    private void btSupport1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSupport1ActionPerformed
        this.dispose();
        Products.main(null);
    }//GEN-LAST:event_btSupport1ActionPerformed

    private void dlgAddTicket_cbProductItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dlgAddTicket_cbProductItemStateChanged

        
    }//GEN-LAST:event_dlgAddTicket_cbProductItemStateChanged

    private void dlgAddTicket_cbCustomerIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dlgAddTicket_cbCustomerIdItemStateChanged
       
        getCustomerProducts();
    }//GEN-LAST:event_dlgAddTicket_cbCustomerIdItemStateChanged

    private void btEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmployeesActionPerformed
        this.dispose();
        Employees.main(null);
    }//GEN-LAST:event_btEmployeesActionPerformed

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

    public void getCustomerProducts() {
        try {
            dlgAddTicket_cbProduct.removeAllItems();
            
            // get all products that the selected customer has
            int selectedCustomerId = Integer.parseInt(dlgAddTicket_cbCustomerId.getSelectedItem().toString());
            ArrayList<String> customerProducts = db.getCustomerProductsById(selectedCustomerId);
            
            // add the products to the list
            for (int i = 0; i < customerProducts.size(); i++) {
                dlgAddTicket_cbProduct.addItem(customerProducts.get(i));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Support.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
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
            java.util.logging.Logger.getLogger(Support.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Support.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Support.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Support.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Support().setVisible(true);
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
    private javax.swing.JDialog dlgAddTicket;
    private javax.swing.JButton dlgAddTicket_btCancel;
    private javax.swing.JButton dlgAddTicket_btSave;
    private javax.swing.JComboBox<String> dlgAddTicket_cbCustomerId;
    public static javax.swing.JComboBox<String> dlgAddTicket_cbProduct;
    private javax.swing.JLabel dlgAddTicket_lbId;
    private javax.swing.JLabel dlgAddTicket_lblAgentId;
    private javax.swing.JRadioButton dlgAddTicket_rbIsDone;
    private javax.swing.JRadioButton dlgAddTicket_rbIsNotDone;
    private javax.swing.JTextField dlgAddTicket_tfDescription;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuLogout;
    private javax.swing.JMenu menuSales;
    private javax.swing.JMenu menuSupport;
    private javax.swing.JMenu menuSupport1;
    private javax.swing.JMenu menuSupport2;
    private javax.swing.JMenu menuSupport3;
    private javax.swing.JTable tbSupport;
    // End of variables declaration//GEN-END:variables
}

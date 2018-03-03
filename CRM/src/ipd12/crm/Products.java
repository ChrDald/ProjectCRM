/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipd12.crm;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yasser
 */
public class Products extends javax.swing.JFrame {

    Database db;

    public Products() {
        db = new Database();
        initComponents();
        loadProducts();
    }

    public void loadProducts() {
<<<<<<< HEAD

=======
        
>>>>>>> 448b5db767bd623f3ae1ea67f508851610c665a1
        try {            
            DefaultTableModel model = (DefaultTableModel) productTable.getModel();
            model.setRowCount(0);
            ArrayList<Product> list = db.getAllProducts();
            Object rowData[] = new Object[4];
            for (int i = 0; i < list.size(); i++) {
                rowData[0] = list.get(i).getId();
                rowData[1] = list.get(i).getProductName();
                rowData[2] = list.get(i).getPricePerUnit();
                rowData[3] = list.get(i).getQuantity();
<<<<<<< HEAD
                model.addRow(rowData);  
=======
                model.addRow(rowData);
                
                // line below only applies when this method is called from the Support class
                try {
                    Support.dlgAddTicket_cbProduct.addItem(rowData[1].toString());
                } catch (NullPointerException e) {
                    
                }
                
>>>>>>> 448b5db767bd623f3ae1ea67f508851610c665a1
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

        Add_Product = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dlgAddProduct_tfProduct = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dlgAddProduct_btCancel = new javax.swing.JButton();
        dlgAddProduct_btSave = new javax.swing.JButton();
        dlgAddProduct_lbId = new javax.swing.JLabel();
        dlgAddProduct_tfPricePerUnit = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dlgAddProduct_tfQuantity = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        products_btAdd = new javax.swing.JButton();
        products_btEdit = new javax.swing.JButton();
        products_btDelete = new javax.swing.JButton();
        products_btPrint = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
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
        menuLogin = new javax.swing.JMenu();
        menuLogout = new javax.swing.JMenu();

        jLabel2.setText("Id");

        jLabel3.setText("Product Name");

        jLabel4.setText("PricePerUnit");

        dlgAddProduct_btCancel.setText("Cancel");

        dlgAddProduct_btSave.setText("Save");
        dlgAddProduct_btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgAddProduct_btSaveActionPerformed(evt);
            }
        });

        dlgAddProduct_lbId.setText("...");

        jLabel8.setText("Quantity");

        javax.swing.GroupLayout Add_ProductLayout = new javax.swing.GroupLayout(Add_Product.getContentPane());
        Add_Product.getContentPane().setLayout(Add_ProductLayout);
        Add_ProductLayout.setHorizontalGroup(
            Add_ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_ProductLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Add_ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Add_ProductLayout.createSequentialGroup()
                        .addGroup(Add_ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Add_ProductLayout.createSequentialGroup()
                                .addGroup(Add_ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(25, 25, 25)
                                .addGroup(Add_ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dlgAddProduct_tfProduct)
                                    .addComponent(dlgAddProduct_tfPricePerUnit)))
                            .addGroup(Add_ProductLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(88, 88, 88)
                                .addComponent(dlgAddProduct_lbId, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(Add_ProductLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(46, 46, 46)
                                .addComponent(dlgAddProduct_tfQuantity)))
                        .addContainerGap())
                    .addGroup(Add_ProductLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(dlgAddProduct_btCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(dlgAddProduct_btSave)
                        .addGap(54, 54, 54))))
        );
        Add_ProductLayout.setVerticalGroup(
            Add_ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_ProductLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Add_ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dlgAddProduct_lbId))
                .addGap(28, 28, 28)
                .addGroup(Add_ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dlgAddProduct_tfProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Add_ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dlgAddProduct_tfPricePerUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Add_ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(dlgAddProduct_tfQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Add_ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlgAddProduct_btCancel)
                    .addComponent(dlgAddProduct_btSave)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_END);

        products_btAdd.setText("Add");
        products_btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                products_btAddActionPerformed(evt);
            }
        });

        products_btEdit.setText("Edit");
        products_btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                products_btEditActionPerformed(evt);
            }
        });

        products_btDelete.setText("Delete");
        products_btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                products_btDeleteActionPerformed(evt);
            }
        });

        products_btPrint.setText("Print");

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Product Name", "Price Per Unit", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(productTable);

        btSupport.setText("Support");
        btSupport.setSelected(true);
        btSupport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSupportActionPerformed(evt);
            }
        });

        btSales.setText("Sales");
        btSales.setFocusable(false);
        btSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalesActionPerformed(evt);
            }
        });

        btCustomers.setText("Customers");
        btCustomers.setFocusable(false);
        btCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCustomersActionPerformed(evt);
            }
        });

        btEmployees.setText("Employees");
        btEmployees.setFocusable(false);

        btSupport1.setBackground(new java.awt.Color(255, 255, 255));
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
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(products_btDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(products_btEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(products_btAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(products_btPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(products_btAdd)
                        .addGap(18, 18, 18)
                        .addComponent(products_btEdit)
                        .addGap(18, 18, 18)
                        .addComponent(products_btDelete)
                        .addGap(18, 18, 18)
                        .addComponent(products_btPrint)))
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

        menuLogin.setText("Login");
        jMenuBar1.add(menuLogin);

        menuLogout.setText("Logout");
        jMenuBar1.add(menuLogout);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void products_btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_products_btAddActionPerformed
        Add_Product.pack();
        Add_Product.setVisible(true);
    }//GEN-LAST:event_products_btAddActionPerformed

    private void dlgAddProduct_btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgAddProduct_btSaveActionPerformed
        try {
            String productName = dlgAddProduct_tfProduct.getText();
            String price = dlgAddProduct_tfPricePerUnit.getText();
            BigDecimal pricePerUnit = new BigDecimal(price);
            String q = dlgAddProduct_tfQuantity.getText();
            int quantity = Integer.parseInt(q);
            Product p;
            p = new Product(productName, pricePerUnit, quantity);
            if (dlgAddProduct_lbId.getText().equals("...")) { // if youre editing, this would be false  
            db.addProduct(p);
            }
            else {
                try {
                    p.setId(Long.valueOf(dlgAddProduct_lbId.getText()));
                } catch (NumberFormatException e) {
                    System.err.println("Invalid id value, could not format to long");
                } catch (NullPointerException e) {
                    System.err.println("Id value is null");
                }
                
                db.updateProduct(p);
            }
            

            loadProducts();
        } catch (SQLException ex) {
            ex.printStackTrace();
            // display dialog with error message and terminate the program
            JOptionPane.showMessageDialog(this,
                    "Error: unable to reload products\n" + ex.getMessage(),
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_dlgAddProduct_btSaveActionPerformed

    private void products_btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_products_btEditActionPerformed
        int rowIndex = productTable.getSelectedRow();
        
        try {
            String id = String.valueOf(productTable.getValueAt(rowIndex, 0)); 
            String productName = String.valueOf(productTable.getValueAt(rowIndex, 1));
            String pricePerUnit = String.valueOf(productTable.getValueAt(rowIndex, 2));
            String quantity = String.valueOf(productTable.getValueAt(rowIndex, 3));
            
            
            dlgAddProduct_lbId.setText(id);
            dlgAddProduct_tfProduct.setText(productName);
            dlgAddProduct_tfPricePerUnit.setText(pricePerUnit);
            dlgAddProduct_tfQuantity.setText(quantity);
            
            Add_Product.pack();
            Add_Product.setVisible(true);
        } catch (ClassCastException e) {
            System.err.println("Casting exception");
        }
    }//GEN-LAST:event_products_btEditActionPerformed

    private void products_btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_products_btDeleteActionPerformed
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

            int rowIndex = productTable.getSelectedRow();
            long id = 0;
            try {
                id = (long) productTable.getValueAt(rowIndex, 0);
            } catch (ClassCastException e) {
                System.err.println("Delete could not be performed, please try again later...");
            }

            try {
                db.deleteProductById(id);
            } catch (SQLException ex) {
                System.err.println("Error deleting from database, check your query");
                Logger.getLogger(Employees.class.getName()).log(Level.SEVERE, null, ex);
            }
            loadProducts();
        }
    }//GEN-LAST:event_products_btDeleteActionPerformed

    private void btSupportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSupportActionPerformed
        this.dispose();
        Support.main(null);
    }//GEN-LAST:event_btSupportActionPerformed

    private void btSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalesActionPerformed
        this.dispose();
        Sales.main(null);
    }//GEN-LAST:event_btSalesActionPerformed

    private void btCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCustomersActionPerformed
        this.dispose();
        Customers.main(null);
    }//GEN-LAST:event_btCustomersActionPerformed

    private void btSupport1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSupport1ActionPerformed
        this.dispose();
        Products.main(null);
    }//GEN-LAST:event_btSupport1ActionPerformed

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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Add_Product;
    private javax.swing.JButton btCustomers;
    private javax.swing.JButton btEmployees;
    private javax.swing.JButton btSales;
    private javax.swing.JButton btSupport;
    private javax.swing.JButton btSupport1;
    private javax.swing.JButton dlgAddProduct_btCancel;
    private javax.swing.JButton dlgAddProduct_btSave;
    private javax.swing.JLabel dlgAddProduct_lbId;
    private javax.swing.JTextField dlgAddProduct_tfPricePerUnit;
    private javax.swing.JTextField dlgAddProduct_tfProduct;
    private javax.swing.JTextField dlgAddProduct_tfQuantity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuLogin;
    private javax.swing.JMenu menuLogout;
    private javax.swing.JMenu menuSales;
    private javax.swing.JMenu menuSupport;
    private javax.swing.JMenu menuSupport1;
    private javax.swing.JMenu menuSupport2;
    private javax.swing.JMenu menuSupport3;
    private javax.swing.JTable productTable;
    private javax.swing.JButton products_btAdd;
    private javax.swing.JButton products_btDelete;
    private javax.swing.JButton products_btEdit;
    private javax.swing.JButton products_btPrint;
    // End of variables declaration//GEN-END:variables

}

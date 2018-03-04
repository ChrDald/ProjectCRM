/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipd12.crm;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yasser
 */
public class Sales extends javax.swing.JFrame {

    
    Database db;
    DefaultTableModel model = new DefaultTableModel(new String[]
    {"Sale Id", "Employee Id", "Sale Date", "Support End", "Product Id", "Customer Id", "Sale Price"}, 0);
    
    public Sales() {
        db = new Database();
        db.loadSalesTable(model);
        initComponents();
        
        // Restrictions on users
        if (!Login.department.equals("Management")) {
            btDelete.setEnabled(false);
        }
        if (!Login.department.equals("Sales") && !Login.department.equals("Management")) {
            btAdd.setEnabled(false);
            btEdit.setEnabled(false);
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

        dlgAddSales = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dlgAddSales_cbProduct = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        dlgAddSales_cbSupportDate = new javax.swing.JComboBox<>();
        dlgAddSales_btCancel = new javax.swing.JButton();
        dlgAddSales_btSave = new javax.swing.JButton();
        dlgAddSales_btPrint = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        dlgAddSales_tfTotalPrice = new javax.swing.JTextField();
        dlgAddSales_lbId = new javax.swing.JLabel();
        dlgAddSales_btAddCustomer = new javax.swing.JButton();
        dlgAddSales_cbCustomerId = new javax.swing.JComboBox<>();
        dlgAddCustomer = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dlgAddCustomer_tfCompanyName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dlgAddCustomer_btCancel = new javax.swing.JButton();
        dlgAddCustomer_btSave = new javax.swing.JButton();
        dlgAddCustomer_lbId = new javax.swing.JLabel();
        dlgAddCustomer_tfAddress = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        dlgAddCustomer_tfContactNumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btAdd = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btPrint = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbSupport = new javax.swing.JTable(){
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
        menuSales1 = new javax.swing.JMenu();
        menuSupport1 = new javax.swing.JMenu();
        menuSupport2 = new javax.swing.JMenu();
        menuSupport3 = new javax.swing.JMenu();
        menuSupport4 = new javax.swing.JMenu();
        menuLogout = new javax.swing.JMenu();

        jLabel2.setText("Employee Id:");

        jLabel3.setText("Customer Id:");

        jLabel4.setText("Product Name:");

        jLabel5.setText("Support end Date:");

        dlgAddSales_cbSupportDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Year", "2 Years", "3 Years" }));

        dlgAddSales_btCancel.setText("Cancel");
        dlgAddSales_btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgAddSales_btCancelActionPerformed(evt);
            }
        });

        dlgAddSales_btSave.setText("Save");
        dlgAddSales_btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgAddSales_btSaveActionPerformed(evt);
            }
        });

        dlgAddSales_btPrint.setText("Print");

        jLabel6.setText("Total Sale Price:");

        dlgAddSales_lbId.setText("...");

        dlgAddSales_btAddCustomer.setText("Add new customer");
        dlgAddSales_btAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgAddSales_btAddCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dlgAddSalesLayout = new javax.swing.GroupLayout(dlgAddSales.getContentPane());
        dlgAddSales.getContentPane().setLayout(dlgAddSalesLayout);
        dlgAddSalesLayout.setHorizontalGroup(
            dlgAddSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAddSalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dlgAddSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgAddSalesLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(34, 34, 34)
                        .addComponent(dlgAddSales_tfTotalPrice))
                    .addGroup(dlgAddSalesLayout.createSequentialGroup()
                        .addGroup(dlgAddSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGroup(dlgAddSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgAddSalesLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(dlgAddSales_btAddCustomer))
                            .addGroup(dlgAddSalesLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(dlgAddSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dlgAddSales_cbCustomerId, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dlgAddSales_cbProduct, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dlgAddSales_cbSupportDate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(dlgAddSalesLayout.createSequentialGroup()
                        .addComponent(dlgAddSales_btCancel)
                        .addGap(18, 18, 18)
                        .addComponent(dlgAddSales_btSave)
                        .addGap(18, 18, 18)
                        .addComponent(dlgAddSales_btPrint)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(dlgAddSalesLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dlgAddSales_lbId, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        dlgAddSalesLayout.setVerticalGroup(
            dlgAddSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAddSalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dlgAddSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dlgAddSales_lbId))
                .addGap(28, 28, 28)
                .addGroup(dlgAddSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dlgAddSales_cbCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dlgAddSales_btAddCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dlgAddSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dlgAddSales_cbProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dlgAddSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dlgAddSales_cbSupportDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dlgAddSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(dlgAddSales_tfTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dlgAddSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlgAddSales_btCancel)
                    .addComponent(dlgAddSales_btSave)
                    .addComponent(dlgAddSales_btPrint))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel7.setText("Id");

        jLabel8.setText("Company Name");

        jLabel9.setText("Address");

        dlgAddCustomer_btCancel.setText("Cancel");
        dlgAddCustomer_btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgAddCustomer_btCancelActionPerformed(evt);
            }
        });

        dlgAddCustomer_btSave.setText("Save");
        dlgAddCustomer_btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgAddCustomer_btSaveActionPerformed(evt);
            }
        });

        dlgAddCustomer_lbId.setText("...");

        jLabel10.setText("Contact Number");

        javax.swing.GroupLayout dlgAddCustomerLayout = new javax.swing.GroupLayout(dlgAddCustomer.getContentPane());
        dlgAddCustomer.getContentPane().setLayout(dlgAddCustomerLayout);
        dlgAddCustomerLayout.setHorizontalGroup(
            dlgAddCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAddCustomerLayout.createSequentialGroup()
                .addGroup(dlgAddCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dlgAddCustomerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(dlgAddCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dlgAddCustomerLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(dlgAddCustomer_tfContactNumber))
                            .addGroup(dlgAddCustomerLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dlgAddCustomer_lbId, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dlgAddCustomerLayout.createSequentialGroup()
                                .addGroup(dlgAddCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(21, 21, 21)
                                .addGroup(dlgAddCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dlgAddCustomer_tfAddress)
                                    .addComponent(dlgAddCustomer_tfCompanyName)))))
                    .addGroup(dlgAddCustomerLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(dlgAddCustomer_btCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(dlgAddCustomer_btSave)
                        .addGap(36, 36, 36)))
                .addContainerGap())
        );
        dlgAddCustomerLayout.setVerticalGroup(
            dlgAddCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAddCustomerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dlgAddCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(dlgAddCustomer_lbId))
                .addGap(18, 18, 18)
                .addGroup(dlgAddCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(dlgAddCustomer_tfCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dlgAddCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(dlgAddCustomer_tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dlgAddCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(dlgAddCustomer_tfContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dlgAddCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlgAddCustomer_btCancel)
                    .addComponent(dlgAddCustomer_btSave)))
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

        tbSupport.setAutoCreateRowSorter(true);
        tbSupport.setModel(model);
        jScrollPane2.setViewportView(tbSupport);

        btSupport.setText("Support");
        btSupport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSupportActionPerformed(evt);
            }
        });

        btSales.setBackground(new java.awt.Color(255, 255, 255));
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
        btEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmployeesActionPerformed(evt);
            }
        });

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
                        .addComponent(btEmployees)
                        .addGap(0, 0, 0)
                        .addComponent(btCustomers)
                        .addGap(0, 0, 0)
                        .addComponent(btSales, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btSupport, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btSupport1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(204, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
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
                        .addGap(0, 128, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        menuFile.setText("File");
        jMenuBar1.add(menuFile);

        menuSales1.setText("Import");
        jMenuBar1.add(menuSales1);

        menuSupport1.setText("Export");

        menuSupport2.setText("Export");
        menuSupport1.add(menuSupport2);

        jMenuBar1.add(menuSupport1);

        menuSupport3.setText("Print");

        menuSupport4.setText("Export");
        menuSupport3.add(menuSupport4);

        jMenuBar1.add(menuSupport3);

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

    private void btEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmployeesActionPerformed
        this.dispose();
        Employees.main(null);
    }//GEN-LAST:event_btEmployeesActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        
        // clear list contents
        dlgAddSales_cbCustomerId.removeAllItems();
        dlgAddSales_cbProduct.removeAllItems();
        try  {     
            // add current employee id
            dlgAddSales_lbId.setText(Login.userId + "");
            // load the product list         
            ArrayList<String> products = new ArrayList<>();
            
            for (int i = 0; i < db.getAllProducts().size(); i++) {
                products.add(db.getAllProducts().get(i).getProductName());
            }
            for (int i = 0; i < products.size(); i++) {
                dlgAddSales_cbProduct.addItem(products.get(i));
            }
            // load the customer id list
            ArrayList<Long> customerIds = new ArrayList<>();
            
            for (int i = 0; i < db.getAllCustomers().size(); i++) {
                customerIds.add(db.getAllCustomers().get(i).getId());
                dlgAddSales_cbCustomerId.addItem(String.valueOf(customerIds.get(i)));
            }
            
            
            dlgAddSales_cbCustomerId.setSelectedIndex(0);
            dlgAddSales_cbProduct.setSelectedIndex(0);
            dlgAddSales_cbSupportDate.setSelectedIndex(0);
            dlgAddSales_tfTotalPrice.setText("");
            dlgAddSales.pack();
            dlgAddSales.setVisible(true);
        } catch (SQLException ex) {
            System.err.println("Error loading product list");
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btAddActionPerformed

    private void dlgAddSales_btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgAddSales_btCancelActionPerformed
        dlgAddSales.setVisible(false);
    }//GEN-LAST:event_dlgAddSales_btCancelActionPerformed

    private void dlgAddSales_btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgAddSales_btSaveActionPerformed
        
        Sale sale = new Sale();
        // SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date saleDate = new Date();
        Date endDate = new Date();
        
        sale.setEmployeeId(Long.parseLong(dlgAddSales_lbId.getText()));
        sale.setSaleDate(saleDate);
        
        switch (dlgAddSales_cbSupportDate.getSelectedItem().toString().trim()) {
            case "1 Year":
                endDate.toInstant().plus( Duration.ofDays(365 ) );
                break;
            case "2 Years":
                endDate.toInstant().plus( Duration.ofDays(730 ) );
                break;
            case "3 Years":
                endDate.toInstant().plus( Duration.ofDays(730 ) );
                break;
            default:
                System.err.println("Invalid support end date selected");
                break;
        }
        sale.setSupportEnd(endDate);
        sale.setCustomerId(Long.parseLong(dlgAddSales_cbCustomerId.getSelectedItem().toString().trim()));
        String productName = dlgAddSales_cbProduct.getSelectedItem().toString().trim();
        try {
            sale.setProductId(db.getProductIdByName(productName));
            BigDecimal salePrice = new BigDecimal(dlgAddSales_tfTotalPrice.getText());
            sale.setSalePrice(salePrice);
            db.addSale(sale);
            dlgAddSales.setVisible(false);
            db.loadSalesTable(model);
        } catch (SQLException ex) {
            System.err.println("Database error, make sure product name is selected and unique");
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dlgAddSales_btSaveActionPerformed

    private void dlgAddSales_btAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgAddSales_btAddCustomerActionPerformed
        
        // adding a new customer and reloading the customer id combo box
        dlgAddCustomer.pack();
        dlgAddCustomer.setVisible(true);
    }//GEN-LAST:event_dlgAddSales_btAddCustomerActionPerformed

    private void dlgAddCustomer_btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgAddCustomer_btCancelActionPerformed

        dlgAddCustomer.dispose();
    }//GEN-LAST:event_dlgAddCustomer_btCancelActionPerformed

    private void dlgAddCustomer_btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgAddCustomer_btSaveActionPerformed
        try {
            String companyName = dlgAddCustomer_tfCompanyName.getText();
            String address = dlgAddCustomer_tfAddress.getText();
            String contactNum = dlgAddCustomer_tfContactNumber.getText();

            Customer c;
            c = new Customer(companyName, address, contactNum);
            
            db.addCustomer(c);
            dlgAddCustomer.setVisible(false);

            
            // reload customers
            dlgAddSales_cbCustomerId.removeAllItems();
            ArrayList<Long> customerIds = new ArrayList<>();
            
            for (int i = 0; i < db.getAllCustomers().size(); i++) {
                customerIds.add(db.getAllCustomers().get(i).getId());
                dlgAddSales_cbCustomerId.addItem(String.valueOf(customerIds.get(i)));
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            // display dialog with error message and terminate the program
            JOptionPane.showMessageDialog(this,
                "Error: unable to reload customer\n" + ex.getMessage(),
                "Database error",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_dlgAddCustomer_btSaveActionPerformed

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
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sales().setVisible(true);
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
    public javax.swing.JDialog dlgAddCustomer;
    private javax.swing.JButton dlgAddCustomer_btCancel;
    private javax.swing.JButton dlgAddCustomer_btSave;
    private javax.swing.JLabel dlgAddCustomer_lbId;
    private javax.swing.JTextField dlgAddCustomer_tfAddress;
    private javax.swing.JTextField dlgAddCustomer_tfCompanyName;
    private javax.swing.JTextField dlgAddCustomer_tfContactNumber;
    private javax.swing.JDialog dlgAddSales;
    private javax.swing.JButton dlgAddSales_btAddCustomer;
    private javax.swing.JButton dlgAddSales_btCancel;
    private javax.swing.JButton dlgAddSales_btPrint;
    private javax.swing.JButton dlgAddSales_btSave;
    private javax.swing.JComboBox<String> dlgAddSales_cbCustomerId;
    private javax.swing.JComboBox<String> dlgAddSales_cbProduct;
    private javax.swing.JComboBox<String> dlgAddSales_cbSupportDate;
    private javax.swing.JLabel dlgAddSales_lbId;
    private javax.swing.JTextField dlgAddSales_tfTotalPrice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuLogout;
    private javax.swing.JMenu menuSales1;
    private javax.swing.JMenu menuSupport1;
    private javax.swing.JMenu menuSupport2;
    private javax.swing.JMenu menuSupport3;
    private javax.swing.JMenu menuSupport4;
    private javax.swing.JTable tbSupport;
    // End of variables declaration//GEN-END:variables
}

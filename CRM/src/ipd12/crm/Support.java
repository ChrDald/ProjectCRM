/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipd12.crm;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author yasser
 */
public class Support extends javax.swing.JFrame {
DefaultComboBoxModel modelCompanyCombo = new DefaultComboBoxModel();
    
    Database db;
    
    public Support() {
        initComponents();
    try {
        db.getIDandCustomers();
    } catch (SQLException ex) {
        Logger.getLogger(Support.class.getName()).log(Level.SEVERE, null, ex);
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
        dlg_cbProduct = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        dlgAddTicket_rbIsDone = new javax.swing.JRadioButton();
        dlgAddTicket_rbIsNotDone = new javax.swing.JRadioButton();
        dlgAddTicket_btSave = new javax.swing.JButton();
        dlgAddTicket_btCancel = new javax.swing.JButton();
        dlg_cbSupportAgent = new javax.swing.JComboBox<>();
        dlg_cbCompany = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btAdd = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuEmployees = new javax.swing.JMenu();
        menuCustomer = new javax.swing.JMenu();
        menuSales = new javax.swing.JMenu();
        menuSupport = new javax.swing.JMenu();
        menuLogin = new javax.swing.JMenu();

        jLabel19.setText("Id");

        dlgAddTicket_lbId.setText("...");

        jLabel21.setText("Company");

        jLabel22.setText("Product");

        jLabel23.setText("Support Agent");

        dlgAddTicket_rbIsDone.setText("Is Done");

        dlgAddTicket_rbIsNotDone.setText("Is Not Done");

        dlgAddTicket_btSave.setText("Save");

        dlgAddTicket_btCancel.setText("Cancel");

        dlg_cbSupportAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout dlgAddTicketLayout = new javax.swing.GroupLayout(dlgAddTicket.getContentPane());
        dlgAddTicket.getContentPane().setLayout(dlgAddTicketLayout);
        dlgAddTicketLayout.setHorizontalGroup(
            dlgAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAddTicketLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dlgAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addGroup(dlgAddTicketLayout.createSequentialGroup()
                        .addGroup(dlgAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dlgAddTicketLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(dlgAddTicket_lbId, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dlgAddTicketLayout.createSequentialGroup()
                                .addGroup(dlgAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgAddTicketLayout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgAddTicketLayout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addGap(37, 37, 37)))
                                .addGroup(dlgAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dlg_cbSupportAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dlg_cbCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(dlgAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(dlgAddTicketLayout.createSequentialGroup()
                                        .addComponent(dlgAddTicket_rbIsDone)
                                        .addGap(18, 18, 18)
                                        .addComponent(dlgAddTicket_rbIsNotDone))
                                    .addGroup(dlgAddTicketLayout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dlg_cbProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(dlgAddTicketLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(dlgAddTicket_btCancel)
                .addGap(155, 155, 155)
                .addComponent(dlgAddTicket_btSave)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dlgAddTicketLayout.setVerticalGroup(
            dlgAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAddTicketLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dlgAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(dlgAddTicket_lbId))
                .addGap(18, 18, 18)
                .addGroup(dlgAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(dlg_cbProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dlg_cbCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dlgAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(dlg_cbSupportAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dlgAddTicket_rbIsDone)
                    .addComponent(dlgAddTicket_rbIsNotDone))
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(dlgAddTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlgAddTicket_btCancel)
                    .addComponent(dlgAddTicket_btSave)))
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

        jButton5.setText("Edit");

        jButton6.setText("Delete");

        jButton7.setText("Print");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Agent Id", "Customer Id", "Product Id", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btAdd)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
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

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        // set dialog to clean initial state
        //dlgAdd_tfFirstName.setText("");
        //dlgAdd_tfLastName.setText("");
        //dlgAdd_tfPassword.setText("");
        //dlgAdd_cbDepartment.setSelectedIndex(0);

        Products products = new Products();
        products.loadProducts();
        // show it
        dlgAddTicket.pack();
        dlgAddTicket.setVisible(true);
    }//GEN-LAST:event_btAddActionPerformed

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
    private javax.swing.JDialog dlgAddTicket;
    private javax.swing.JButton dlgAddTicket_btCancel;
    private javax.swing.JButton dlgAddTicket_btSave;
    private javax.swing.JLabel dlgAddTicket_lbId;
    private javax.swing.JRadioButton dlgAddTicket_rbIsDone;
    private javax.swing.JRadioButton dlgAddTicket_rbIsNotDone;
    public javax.swing.JComboBox<Customer> dlg_cbCompany;
    public static javax.swing.JComboBox<String> dlg_cbProduct;
    private javax.swing.JComboBox<String> dlg_cbSupportAgent;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenu menuCustomer;
    private javax.swing.JMenu menuEmployees;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuLogin;
    private javax.swing.JMenu menuSales;
    private javax.swing.JMenu menuSupport;
    // End of variables declaration//GEN-END:variables
}

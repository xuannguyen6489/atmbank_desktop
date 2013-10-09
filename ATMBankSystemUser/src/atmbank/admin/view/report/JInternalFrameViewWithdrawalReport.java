/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atmbank.admin.view.report;

import atmbank.admin.controllers.TransactionController;
import atmbank.admin.model.CustomerTransaction;
import atmbank.admin.model.QueryFilter;
import atmbank.admin.model.SystemUser;
import java.awt.print.PrinterException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Xuan Nguyen
 */
public class JInternalFrameViewWithdrawalReport extends javax.swing.JInternalFrame {
    String adminID;
    /**
     * Creates new form WithdrawalReport
     */
    public JInternalFrameViewWithdrawalReport() {
        initComponents();
        this.loadTable();
    }

    private void loadTable() {
        String typeReport = "Withdraw";
        TransactionController Controller = new TransactionController();
        Object[] ColumnNames = new String[]{"Tran ID", "Tran Type", "Acc ID", "Admin ID", "Tran Amount", "Balance", "Reason", "Tran Date"};
        DefaultTableModel tableModel = new DefaultTableModel(ColumnNames, 0) {
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return columnIndex == -1;
            }
        };
        CustomerTransaction transaction = new CustomerTransaction();
        List<CustomerTransaction> list = Controller.getAllTransaction(typeReport);
        SystemUser systemUser = new SystemUser();
        if (list == null) {
            withdrawtable.setModel(tableModel);
        } else {
            for (Object obj : list) {
                transaction = (CustomerTransaction) obj;
                if(transaction.getAdminID() == null){
                     systemUser.setUserID(null);
                     transaction.setAdminID(systemUser);
                 }
                 if(transaction.getAdminID().getUserID() == null){
                     adminID = "";
                 }else{
                     adminID = "" + transaction.getAdminID().getUserID();
                 }
                tableModel.addRow(new Object[]{transaction.getTranID(), transaction.getTranType(), transaction.getAccID().getAccID(), adminID, transaction.getTranAmount(), transaction.getTranBalance(), transaction.getTranReason(), transaction.getTranDate()});
            }
        }
        withdrawtable.setModel(tableModel);
        Controller.close();
    }

    public void updateTable(List<CustomerTransaction> result) {
        Object[] ColumnNames = new String[]{"Tran ID", "Tran Type", "Acc ID", "Admin ID", "Tran Amount", "Balance", "Reason", "Tran Date"};
        DefaultTableModel tableModel = new DefaultTableModel(ColumnNames, 0) {
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return columnIndex == -1;
            }
        };
                SystemUser systemUser = new SystemUser();
        if (result.isEmpty()) {
            withdrawtable.setModel(tableModel);
        } else {
            for (CustomerTransaction transaction : result) {
                  if(transaction.getAdminID() == null){
                  systemUser.setUserID(null);
                     transaction.setAdminID(systemUser);
                 }
                 if(transaction.getAdminID().getUserID() == null){
                     adminID = "";
                 }else{
                     adminID = "" + transaction.getAdminID().getUserID();
                 }
                tableModel.addRow(new Object[]{transaction.getTranID(), transaction.getTranType(), transaction.getAccID().getAccID(), adminID, transaction.getTranAmount(), transaction.getTranBalance(), transaction.getTranReason(), transaction.getTranDate()});
            }
        }
        withdrawtable.setModel(tableModel);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFromDate = new com.toedter.calendar.JDateChooser();
        txtFromDate1 = new com.toedter.calendar.JDateChooser();
        btnLoad = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnClean = new javax.swing.JButton();
        btnPrinter = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        withdrawtable = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Withdrawal Report");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/withdrawal.gif"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(1002, 480));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WITHDRAWAL REPORT");
        jLabel1.setPreferredSize(new java.awt.Dimension(966, 25));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(966, 60));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("From Date:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("To Date:");

        btnLoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon22x22_refresh.png"))); // NOI18N
        btnLoad.setText("Load");
        btnLoad.setPreferredSize(new java.awt.Dimension(111, 31));
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFromDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtFromDate1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(txtFromDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)))))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Action", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 0, 0))); // NOI18N

        btnClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gnome_edit_clear.png"))); // NOI18N
        btnClean.setText("Clean");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        btnPrinter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/printer.png"))); // NOI18N
        btnPrinter.setText("Printer");
        btnPrinter.setPreferredSize(new java.awt.Dimension(95, 41));
        btnPrinter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrinterActionPerformed(evt);
            }
        });

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon22x22_cancel.png"))); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setPreferredSize(new java.awt.Dimension(95, 41));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnClean, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(btnPrinter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(btnClean)
                .addGap(18, 18, 18)
                .addComponent(btnPrinter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "List withdrawal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 0, 51))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(821, 323));

        withdrawtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tran_ID", "Tran_Type", "Acc_ID", "Admin_ID", "Tran_Amount", "Tran_Balance", "Tran_Reason", "Tran_Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        withdrawtable.setToolTipText("");
        jScrollPane2.setViewportView(withdrawtable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 974, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 974, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        // TODO add your handling code here:
        TransactionController controller = new TransactionController();
        QueryFilter filter = new QueryFilter();
        filter.setDateFrom(txtFromDate.getDate());
        filter.setDateTo(txtFromDate1.getDate());
        filter.setType("Withdraw");

        List<CustomerTransaction> result = controller.searchTransaction(filter);

        this.updateTable(result);

    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        // TODO add your handling code here:
        Object[] Columnames = new String[]{"Tran ID", "Tran Type", "Acc ID", "Admin ID", "Tran Amount", "Balance", "Reason", "Tran Date"};
        DefaultTableModel tableModel = new DefaultTableModel(Columnames, 0);
        this.withdrawtable.setModel(tableModel);
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnPrinterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrinterActionPerformed
        // TODO add your handling code here:
        try {
            boolean finish = this.withdrawtable.print();
        } catch (PrinterException pe) {
            pe.printStackTrace();
            JOptionPane.showMessageDialog(null, "Printer is not found");
        }
    }//GEN-LAST:event_btnPrinterActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnPrinter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser txtFromDate;
    private com.toedter.calendar.JDateChooser txtFromDate1;
    private javax.swing.JTable withdrawtable;
    // End of variables declaration//GEN-END:variables
}
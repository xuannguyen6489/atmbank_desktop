/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atmbank.admin.view.account;

import atmbank.admin.controllers.AccountController;
import atmbank.admin.model.Account;
import atmbank.admin.model.SystemUser;
import atmbank.admin.security.SystemValidation;
import atmbank.admin.view.systemframe.SystemAdmin;
import java.awt.event.ItemEvent;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Xuan Nguyen
 */
public class JInternalFrameViewAccountManagement extends javax.swing.JInternalFrame {
    AccountController accountController;
    DefaultTableModel tableModel;
    String status,CardNo,checkAcc,reason;
    int AccID;
    SystemValidation valid;
    Account account;
    SystemAdmin systemAdmin;
    SystemUser SystemUser;
    /**
     * Creates new form JInternalFrameViewAccountManagement
     */
    public JInternalFrameViewAccountManagement(SystemAdmin systemadmin,SystemUser SystemUser) {
        this.SystemUser = SystemUser;
        initComponents();
        this.systemAdmin = systemadmin;
    }
    private void loadTable(){
        accountController = new AccountController();
        Object[] ColumnNames = new String[]{"Account ID.","Acc No.","Card ID.","Balance","CurrencySymbol","Fullname","Gender","Phone","Address","DoB","Status"};
        tableModel = new DefaultTableModel(ColumnNames,0){
        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return columnIndex == -1;
        }
    };
        account = new Account();
        List<Account> list = accountController.getAllAccount();
        if(list == null){
                tableModel.addRow(new Object[]{});
                tbList.setModel(tableModel);           
        }else{
            for(Object obj : list){
               account = (Account) obj;
               tableModel.addRow(new Object[]{account.getAccID(),account.getAccNo(),account.getCustomerID().getIDCardNo(),account.getAccBalance(),account.getCurrencyID().getCurrencySymbol()
                                ,account.getCustomerID().getCustomerFullName(),account.getCustomerID().getCustomerGender(),account.getCustomerID().getCustomerPhone()
                                ,account.getCustomerID().getCustomerAddress(),account.getCustomerID().getCustomerDoB(),account.getAccStatus()});
            }
        }
        tbList.setModel(tableModel);
        accountController.close();
    }
    private void loadTableAccountEnable(){
        accountController = new AccountController();
            Object[] ColumnNames = new String[]{"Account ID.","Acc No.","Card ID.","Balance","CurrencySymbol","Fullname","Gender","Phone","Address","DoB","Status"};
            tableModel = new DefaultTableModel(ColumnNames,0){
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return columnIndex == -1;
                    }
                }; 
            account = new Account();
            List<Account> list = accountController.getAllAccountEnable();
            if(list == null){
                tableModel.addRow(new Object[]{});
                tbList.setModel(tableModel);
            }else{
                for(Object obj : list){
                    account = (Account) obj;
                    tableModel.addRow(new Object[]{account.getAccID(),account.getAccNo(),account.getCustomerID().getIDCardNo(),account.getAccBalance(),account.getCurrencyID().getCurrencySymbol()
                                ,account.getCustomerID().getCustomerFullName(),account.getCustomerID().getCustomerGender(),account.getCustomerID().getCustomerPhone()
                                ,account.getCustomerID().getCustomerAddress(),account.getCustomerID().getCustomerDoB(),account.getAccStatus()});
                }
                tbList.setModel(tableModel);
                accountController.close();
            }
    }
    private void loadTableAccountDisable(){
        accountController = new AccountController();
            Object[] ColumnNames = new String[]{"Account ID.","Acc No.","Card ID.","Balance","CurrencySymbol","Fullname","Gender","Phone","Address","DoB","Status","Reason Disable"};
            tableModel = new DefaultTableModel(ColumnNames,0){
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return columnIndex == -1;
                }
            }; 
            account = new Account();
            List<Account> list = accountController.getAllAccountDisable();
            if(list == null){
                tbList.setModel(tableModel);
            }else{
                for(Object obj : list){
                    account = (Account) obj;
                    tableModel.addRow(new Object[]{account.getAccID(),account.getAccNo(),account.getCustomerID().getIDCardNo(),account.getAccBalance(),account.getCurrencyID().getCurrencySymbol()
                                ,account.getCustomerID().getCustomerFullName(),account.getCustomerID().getCustomerGender(),account.getCustomerID().getCustomerPhone()
                                ,account.getCustomerID().getCustomerAddress(),account.getCustomerID().getCustomerDoB(),account.getAccStatus(),account.getAccStatusReason()});
                }
                tbList.setModel(tableModel);
                accountController.close();
            }
    }
    private void loadTableAfterSearchAccNo(){
       Object[] ColumnNames = new String[]{"Account ID.","Acc No.","Card ID.","Balance","CurrencySymbol","Fullname","Gender","Phone","Address","DoB","Status"}; 
       tableModel = new DefaultTableModel(ColumnNames,0){
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return columnIndex == -1;
                }
            };
       tableModel.addRow(new Object[]{account.getAccID(),account.getAccNo(),account.getCustomerID().getIDCardNo(),account.getAccBalance(),account.getCurrencyID().getCurrencySymbol()
                            ,account.getCustomerID().getCustomerFullName(),account.getCustomerID().getCustomerGender(),account.getCustomerID().getCustomerPhone()
                            ,account.getCustomerID().getCustomerAddress(),account.getCustomerID().getCustomerDoB(),account.getAccStatus()});
       tbList.setModel(tableModel);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtAccNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFullname = new javax.swing.JTextField();
        txtCardID = new javax.swing.JTextField();
        txtAccountID = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        lblIconStatus = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        btnAddNew = new javax.swing.JButton();
        btnDisable = new javax.swing.JButton();
        btnEnable = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbList = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        cbxStatus = new javax.swing.JComboBox();

        setClosable(true);
        setIconifiable(true);
        setTitle("Account Management");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon24x24_user_management.png"))); // NOI18N

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(51, 51, 51));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Account Management");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 0, 51))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Acc No.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Card ID No.");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Full Name:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Account ID:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Phone :");

        lblIconStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon24x24_correct.gif"))); // NOI18N
        lblIconStatus.setText("Enable");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Status :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCardID, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAccountID, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPhone))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIconStatus)
                        .addGap(0, 139, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIconStatus))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCardID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(txtAccountID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Action", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 51, 51))); // NOI18N

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon32x32_search.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gnome_edit_clear.png"))); // NOI18N
        btnClean.setText("Clean");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        btnAddNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon22x22_add_new.png"))); // NOI18N
        btnAddNew.setText("Add New");
        btnAddNew.setMaximumSize(new java.awt.Dimension(101, 41));
        btnAddNew.setMinimumSize(new java.awt.Dimension(101, 41));
        btnAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewActionPerformed(evt);
            }
        });

        btnDisable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon24x24_incorrect.png"))); // NOI18N
        btnDisable.setText("Disable");
        btnDisable.setMaximumSize(new java.awt.Dimension(101, 41));
        btnDisable.setMinimumSize(new java.awt.Dimension(101, 41));
        btnDisable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisableActionPerformed(evt);
            }
        });

        btnEnable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon24x24_correct.gif"))); // NOI18N
        btnEnable.setText("Enable");
        btnEnable.setMaximumSize(new java.awt.Dimension(101, 41));
        btnEnable.setMinimumSize(new java.awt.Dimension(101, 41));
        btnEnable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnableActionPerformed(evt);
            }
        });

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon22x22_cancel.png"))); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setMaximumSize(new java.awt.Dimension(101, 41));
        btnCancel.setMinimumSize(new java.awt.Dimension(101, 41));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnLoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon22x22_refresh.png"))); // NOI18N
        btnLoad.setText("Load / Reload");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDisable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEnable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClean, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLoad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLoad, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddNew, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDisable, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEnable, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "List Account", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 0, 0))); // NOI18N

        tbList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account ID", "Acc No.", "Card ID.", "Balance", "CurrencySymbol", "Fullname", "Gender", "Phone", "Address", "DoB", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbList.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbList);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Select :");

        cbxStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Enable", "Disable" }));
        cbxStatus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxStatusItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        loadTable();
    }//GEN-LAST:event_btnLoadActionPerformed

    private void tbListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbListMouseClicked
        int RowNo = tbList.getSelectedRow();
        if(evt.getClickCount() == 2){
            account = new Account();
            accountController = new AccountController();
            AccID = Integer.parseInt(tbList.getValueAt(RowNo, 0).toString());
            account = accountController.SearchAccountById(AccID);
            JInternalFrameViewAccountDetails accountDetails = new JInternalFrameViewAccountDetails(account,systemAdmin,SystemUser);
            systemAdmin.ShowJInternalFrame(accountDetails);
            systemAdmin.SetJIF(accountDetails);
            accountController.close();
        }else{
            txtAccountID.setText(tbList.getValueAt(RowNo, 0).toString());
            txtAccNo.setText(tbList.getValueAt(RowNo, 1).toString());
            txtCardID.setText(tbList.getValueAt(RowNo, 2).toString());
            txtFullname.setText(tbList.getValueAt(RowNo, 5).toString());
            txtPhone.setText(tbList.getValueAt(RowNo, 7).toString());
            status = tbList.getValueAt(RowNo, 10).toString();
            if(status.equals("Enable")){
                lblIconStatus.setIcon(SystemValidation.CORRECT_ICON);
                lblIconStatus.setText("Enable");
            }else{
                lblIconStatus.setIcon(SystemValidation.INCORRECT_ICON);
                lblIconStatus.setText("Disable");
            }
        }
    }//GEN-LAST:event_tbListMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try { 
            JFormattedTextField jff = new JFormattedTextField(new MaskFormatter("####-####-####-####"));
            int check = JOptionPane.showConfirmDialog(null, jff,"Enter Account No.",JOptionPane.YES_NO_OPTION);
            if(check == JOptionPane.YES_OPTION){
                checkAcc = jff.getText().trim();
                if(checkAcc.length() != 19){
                    JOptionPane.showMessageDialog(null, "It not Account No. !! Please try again","Error",JOptionPane.ERROR_MESSAGE);
                }else{
                    accountController = new AccountController();
                    account = new Account();
                    List<Account> list = accountController.getAccNoByAccNo(checkAcc);
                    if(list == null){
                        JOptionPane.showMessageDialog(null, "Can't find Account No in data");
                    }else{
                        for(Object obj : list){
                            account = (Account) obj;
                            txtAccNo.setText(account.getAccNo());
                            txtAccountID.setText(String.valueOf(account.getAccID()));
                            txtCardID.setText(account.getCustomerID().getIDCardNo());
                            txtFullname.setText(account.getCustomerID().getCustomerFullName());
                            txtPhone.setText(account.getCustomerID().getCustomerPhone());
                            lblIconStatus.setText(account.getAccStatus());
                            lblIconStatus.setIcon(account.getAccStatus().equals("Enable") ? SystemValidation.CORRECT_ICON:SystemValidation.INCORRECT_ICON);
                            loadTableAfterSearchAccNo();
                        }
                    }
                    accountController.close();
                }
            }
        } catch (ParseException ex) {
            Logger.getLogger(JInternalFrameViewAccountManagement.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed

        txtAccNo.setText("");
       txtAccountID.setText("");
       txtCardID.setText("");
       txtFullname.setText("");
       txtPhone.setText("");
       Object[] ColumnNames = new String[]{"Account ID.","Acc No.","Card ID.","Balance","CurrencySymbol","Fullname","Gender","Phone","Address","DoB","Status"}; 
       tableModel = new DefaultTableModel(ColumnNames,0);
       tbList.setModel(tableModel);       
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewActionPerformed
        JInternalFrameViewAccountAddNew accountAddNew = new JInternalFrameViewAccountAddNew();
        systemAdmin.ShowJInternalFrame(accountAddNew);
    }//GEN-LAST:event_btnAddNewActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
       dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDisableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisableActionPerformed

        if(!txtAccountID.getText().trim().equals("")){
            if(lblIconStatus.getText().equals("Enable")){
                int check = JOptionPane.showConfirmDialog(null, "Do you want disable account ID : " + txtAccountID.getText() + " - Account No : " + txtAccNo.getText(), "Disable Account", JOptionPane.YES_NO_CANCEL_OPTION);
                if(check == JOptionPane.YES_OPTION){
                  reason = JOptionPane.showInputDialog("Reason disable ?");
                    accountController = new AccountController();
                    accountController.UpdateAccountDisable(Integer.parseInt(txtAccountID.getText()), reason);
                    JOptionPane.showMessageDialog(null, "Disable account No :" + txtAccNo.getText() +" successfully !!");
                    lblIconStatus.setIcon(SystemValidation.INCORRECT_ICON);
                    lblIconStatus.setText("Disable");
                    accountController.close();
                }
            }
        }
    }//GEN-LAST:event_btnDisableActionPerformed

    private void btnEnableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnableActionPerformed
        if(!txtAccountID.getText().trim().equals("")){
            if(lblIconStatus.getText().equals("Disable")){
                int check = JOptionPane.showConfirmDialog(null, "Do you want enable account ID : " + txtAccountID.getText() + " - Account No : " + txtAccNo.getText(), "Disable Account", JOptionPane.YES_NO_CANCEL_OPTION); 
                if(check == JOptionPane.YES_OPTION){
                    accountController = new AccountController();
                    accountController.UpdateAccountEnable(Integer.parseInt(txtAccountID.getText()));
                    JOptionPane.showMessageDialog(null, "Enable account No : " + txtAccNo.getText() + " successfully !!");
                    lblIconStatus.setIcon(SystemValidation.CORRECT_ICON);
                    lblIconStatus.setText("Enable");
                }
             }
        }
    }//GEN-LAST:event_btnEnableActionPerformed

    private void cbxStatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxStatusItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){
            if(cbxStatus.getSelectedItem().equals("All")){
                loadTable();
            }
            if(cbxStatus.getSelectedItem().equals("Enable")){
                loadTableAccountEnable();
            }
            if(cbxStatus.getSelectedItem().equals("Disable")){
                loadTableAccountDisable();
            }
        }
    }//GEN-LAST:event_cbxStatusItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNew;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnDisable;
    private javax.swing.JButton btnEnable;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbxStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIconStatus;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tbList;
    private javax.swing.JTextField txtAccNo;
    private javax.swing.JTextField txtAccountID;
    private javax.swing.JTextField txtCardID;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}

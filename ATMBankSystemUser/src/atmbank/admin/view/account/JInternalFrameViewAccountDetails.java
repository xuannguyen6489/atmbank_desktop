/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atmbank.admin.view.account;

import atmbank.admin.controllers.AccountController;
import atmbank.admin.controllers.TransactionController;
import atmbank.admin.model.Account;
import atmbank.admin.model.CustomerTransaction;
import atmbank.admin.model.SystemUser;
import atmbank.admin.security.SystemValidation;
import atmbank.admin.view.systemframe.SystemAdmin;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Xuan Nguyen
 */
public class JInternalFrameViewAccountDetails extends javax.swing.JInternalFrame {
    Account account;
    String gender,FromDate,Todate,adminID;
    SystemValidation valid;
    SystemAdmin systemAdmin;
    SystemUser SystemUser;
    TransactionController transactionController;
    AccountController accountController;
    int countDeposit,countWithdraw,amountDeposit,amountWithdraw,AccID;
    DefaultTableModel tableModel;
    CustomerTransaction customerTransaction;
    /**
     * Creates new form JInternalFrameViewAccountDetails
     */
    public JInternalFrameViewAccountDetails(Account account,SystemAdmin systemAdmin,SystemUser SystemUser) {
        this.account = account;
        this.systemAdmin = systemAdmin;
        this.SystemUser = SystemUser;
        initComponents();
        checkAccount();
        loadInforAccount();
        loadTable();
    }
    private void checkAccount(){
        if(this.account.getAccStatus().equals("Disable")){
            btnDeposit.setEnabled(false);
            btnWithdraw.setEnabled(false);
            btnRefresh.setEnabled(false);
            btnResetPin.setEnabled(false);
        }
    }
    private void loadInforAccount(){
        transactionController = new TransactionController();
        lblAccNo.setText("Account No. " + account.getAccNo());
        lblIdCardNo.setText(account.getCustomerID().getIDCardNo());
        gender = account.getCustomerID().getCustomerGender();
        if(gender.equals("Male")){
            rdMale.setSelected(true);
        }else{
            rdFemale.setSelected(true);
        }
        txtAddress.setText(account.getCustomerID().getCustomerAddress());        
        txtDate.setDate(account.getCustomerID().getCustomerDoB());
        txtFullName.setText(account.getCustomerID().getCustomerFullName());
        txtPhone.setText(account.getCustomerID().getCustomerPhone());
        lblStatus.setIcon(account.getAccStatus().equals("Enable") ? SystemValidation.CORRECT_ICON:SystemValidation.INCORRECT_ICON);
        lblBalance.setText("Balance: $"+ SystemValidation.ConvertMoneyToString((float) account.getAccBalance()));
        if(transactionController.SearchAccInTransaction(account.getAccID()) || transactionController.checkDateTransactionToDay(account.getAccID())){
            lblAmountDeposit.setText("Amount : $0 (Not more than 25$000)");
            lblCountDepost.setText("Count : 0 Time(s).(Not more than 5)");
            lblAmountWithdraw.setText("Amount : $0 (Not more than 25$000)");
            lblCountWithdraw.setText("Count : 0 Time(s).(Not more than 5)");
        }else{   
            ShowCountAccount();  
        }
        transactionController.close();
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblAccNo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblIdCardNo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        txtFullName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        rdMale = new javax.swing.JRadioButton();
        rdFemale = new javax.swing.JRadioButton();
        txtDate = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtFromDate = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbListTransaction = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        btnLoadDate = new javax.swing.JButton();
        txtToDate = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        txtPIN = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnResetPin = new javax.swing.JButton();
        btnWithdraw = new javax.swing.JButton();
        lblCountWithdraw = new javax.swing.JLabel();
        lblAmountWithdraw = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblAmountDeposit = new javax.swing.JLabel();
        lblCountDepost = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        btnDeposit = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Account Details");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon32x32_account.png"))); // NOI18N

        lblAccNo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAccNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAccNo.setText("Account No. 0000-0000-0000-0000");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 0, 51))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("ID Card No.");

        lblIdCardNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblIdCardNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIdCardNo.setText("179-234-123");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Gender :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Full name :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Phone :");

        txtPhone.setEditable(false);

        txtFullName.setEditable(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Address:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Birthday :");

        txtAddress.setEditable(false);

        buttonGroup1.add(rdMale);
        rdMale.setText("Male");

        buttonGroup1.add(rdFemale);
        rdFemale.setText("Female");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Status :");

        lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon24x24_correct.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblIdCardNo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(23, 23, 23)
                                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdMale)
                        .addGap(18, 18, 18)
                        .addComponent(rdFemale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(lblStatus))
                    .addComponent(txtAddress))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblIdCardNo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(rdMale)
                                .addComponent(rdFemale))
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Transaction", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 0, 51))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("From Date :");

        tbListTransaction.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DateTime", "Description", "Reason"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbListTransaction);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("To Date :");

        btnLoadDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon22x22_refresh.png"))); // NOI18N
        btnLoadDate.setText("Load");
        btnLoadDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(btnLoadDate, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel15)
                                .addComponent(jLabel16)))
                        .addComponent(btnLoadDate)
                        .addComponent(txtToDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFromDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Account", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 51, 51))); // NOI18N

        txtPIN.setEditable(false);
        txtPIN.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPIN.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Total deposit today :");

        btnResetPin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon32x32_reset_pin.png"))); // NOI18N
        btnResetPin.setText("ResetPIN");
        btnResetPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetPinActionPerformed(evt);
            }
        });

        btnWithdraw.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnWithdraw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon32x32_money.png"))); // NOI18N
        btnWithdraw.setText("Withdraw");
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawActionPerformed(evt);
            }
        });

        lblCountWithdraw.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCountWithdraw.setText("Count :");

        lblAmountWithdraw.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAmountWithdraw.setText("Amount :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Total withdraw today :");

        lblAmountDeposit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAmountDeposit.setText("Amount : ");

        lblCountDepost.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCountDepost.setText("Count :");

        lblBalance.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        lblBalance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBalance.setText("Balance: $100,000");

        btnDeposit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDeposit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon32x32_money.png"))); // NOI18N
        btnDeposit.setText("Deposit");
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon22x22_refresh.png"))); // NOI18N
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnResetPin, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAmountWithdraw)
                                    .addComponent(jLabel1)
                                    .addComponent(lblCountWithdraw)
                                    .addComponent(jLabel6)
                                    .addComponent(lblAmountDeposit)
                                    .addComponent(lblCountDepost)))
                            .addComponent(btnWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(lblAmountDeposit)
                .addGap(13, 13, 13)
                .addComponent(lblCountDepost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAmountWithdraw)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCountWithdraw)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPIN)
                    .addComponent(btnResetPin, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAccNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void loadTable(){
        transactionController = new TransactionController();
        Object[] ColumnNames = new String[]{"DateTime","Description","Reason"};
        tableModel = new DefaultTableModel(ColumnNames,0);
         customerTransaction = new CustomerTransaction();
         SystemUser systemUser = new SystemUser();
         if(transactionController.SearchAccInTransaction(account.getAccID())){
             tbListTransaction.setModel(tableModel);
         }else{
             List<CustomerTransaction> list = transactionController.GetListTransaction(account.getAccID());
             for(Object obj : list){
                 customerTransaction = (CustomerTransaction) obj;
                 if(customerTransaction.getAdminID() == null){
                     systemUser.setUserID(null);
                     customerTransaction.setAdminID(systemUser);
                 }
                 if(customerTransaction.getAdminID().getUserID() == null){
                     adminID = "";
                 }else{
                     adminID = " Administrator ID : " + customerTransaction.getAdminID().getUserID();
                 }
                 tableModel.addRow(new Object[]{customerTransaction.getTranDate(),adminID + " " +customerTransaction.getTranType() 
                                                + " with amount : $" + SystemValidation.ConvertFloatToString((float) customerTransaction.getTranAmount()) + " ,Balance : $" + SystemValidation.ConvertFloatToString((float) customerTransaction.getTranBalance()),customerTransaction.getTranReason() });
             }
             tbListTransaction.setModel(tableModel);
             transactionController.close();
         }        
    }
    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed

        JInternalFrameViewAccountTransaction accountTransaction = new JInternalFrameViewAccountTransaction(account,1,SystemUser);
        systemAdmin.ShowJInternalFrame(accountTransaction);
        systemAdmin.SetJIF(accountTransaction);
    }//GEN-LAST:event_btnDepositActionPerformed

    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawActionPerformed
        JInternalFrameViewAccountTransaction accountTransaction = new JInternalFrameViewAccountTransaction(account,2,SystemUser);
        systemAdmin.ShowJInternalFrame(accountTransaction);
        systemAdmin.SetJIF(accountTransaction);
    }//GEN-LAST:event_btnWithdrawActionPerformed
    private void ShowCountAccount(){
        countDeposit = transactionController.GetCountTransactionToDay(account.getAccID(), "Deposit");
        countWithdraw = transactionController.GetCountTransactionToDay(account.getAccID(), "Withdraw");
        amountDeposit = transactionController.GetSumAmountToDayDeposit(account.getAccID(), "Deposit");
        amountWithdraw = transactionController.GetSumAmountToDayDeposit(account.getAccID(), "Withdraw");
        if(countDeposit >= 5 || amountDeposit == 25000){
                btnDeposit.setEnabled(false);
         }
         if(countWithdraw >= 5 || amountWithdraw == 25000){
                btnWithdraw.setEnabled(false);
         }
         lblAmountDeposit.setText("Amount : $"+ amountDeposit + " (Not more than $25000)");
         lblCountDepost.setText("Count : " + countDeposit + " Time(s).(Not more than 5)");
         lblAmountWithdraw.setText("Amount : $"+amountWithdraw+ " (Not more than $25000)");
         lblCountWithdraw.setText("Count : " + countWithdraw + " Time(s).(Not more than 5)"); 
    }
    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        transactionController = new TransactionController();
        accountController = new AccountController();
        AccID = account.getAccID();
        account = new Account(); 
        account = accountController.SearchAccountById(AccID);
        lblBalance.setText("Balance: $"+SystemValidation.ConvertMoneyToString((float) account.getAccBalance()));
        ShowCountAccount();
        loadTable();
    }//GEN-LAST:event_btnRefreshActionPerformed
   
    private void btnResetPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetPinActionPerformed
        int check = JOptionPane.showConfirmDialog(null, " DO you want reset PIN account No : " + account.getAccNo() + " ?");
        if(check == JOptionPane.YES_OPTION){
        String AccPin = SystemValidation.Convert(new Random().nextInt(9999), 4);
        txtPIN.setText(AccPin); 
        accountController = new AccountController();
        account.setAccPIN(AccPin);
        accountController.UpdateAccountPIN(account);
        JOptionPane.showMessageDialog(null, "Reset PIN account successfully","Reset PIN",JOptionPane.INFORMATION_MESSAGE);
        accountController.close();
        }
    }//GEN-LAST:event_btnResetPinActionPerformed

    private void btnLoadDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadDateActionPerformed

        FromDate = SystemValidation.ConvertDateToString(txtFromDate.getDate());
        Todate = SystemValidation.ConvertDateToString(txtToDate.getDate());
        Object[] ColumnNames = new String[]{"DateTime","Description","Reason"};
        tableModel = new DefaultTableModel(ColumnNames,0);
        transactionController = new TransactionController();
        customerTransaction = new CustomerTransaction();
         SystemUser systemUser = new SystemUser();
        List<CustomerTransaction> list = transactionController.GetDataFromDateToDate(account.getAccID(), FromDate, Todate);
        if(list == null){
            tbListTransaction.setModel(tableModel);
        }else{
             for(Object obj : list){
                 customerTransaction = (CustomerTransaction) obj;
                 if(customerTransaction.getAdminID() == null){
                     systemUser.setUserID(null);
                     customerTransaction.setAdminID(systemUser);
                 }
                 if(customerTransaction.getAdminID().getUserID() == null){
                     adminID = "";
                 }else{
                     adminID = " Administrator ID : " + customerTransaction.getAdminID().getUserID();
                 }
                 tableModel.addRow(new Object[]{customerTransaction.getTranDate(),adminID + " " +customerTransaction.getTranType() 
                                                + " with amount : $" + SystemValidation.ConvertFloatToString((float) customerTransaction.getTranAmount()) + " ,Balance : $" + SystemValidation.ConvertFloatToString((float) customerTransaction.getTranBalance()),customerTransaction.getTranReason() });
             }
                 tbListTransaction.setModel(tableModel);
        }
        transactionController.close();
    }//GEN-LAST:event_btnLoadDateActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnLoadDate;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnResetPin;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAccNo;
    private javax.swing.JLabel lblAmountDeposit;
    private javax.swing.JLabel lblAmountWithdraw;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblCountDepost;
    private javax.swing.JLabel lblCountWithdraw;
    private javax.swing.JLabel lblIdCardNo;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JRadioButton rdFemale;
    private javax.swing.JRadioButton rdMale;
    private javax.swing.JTable tbListTransaction;
    private javax.swing.JTextField txtAddress;
    private com.toedter.calendar.JDateChooser txtDate;
    private com.toedter.calendar.JDateChooser txtFromDate;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtPIN;
    private javax.swing.JTextField txtPhone;
    private com.toedter.calendar.JDateChooser txtToDate;
    // End of variables declaration//GEN-END:variables
}

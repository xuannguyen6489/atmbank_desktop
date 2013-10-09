package group4.atmbank.customer.views;



    
import atmbank.customer.controllers.AccountController;
import atmbank.customer.controllers.TransactionController;
import atmbank.customer.controllers.TransferController;
import atmbank.customer.model.Account;
import atmbank.customer.model.CustomerTransaction;
import atmbank.customer.model.Transfer;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Group 4
 */
public class Transfers extends javax.swing.JFrame {
    int a=0;
    int AmountRequestDeposit,AmountRequestWithdraw;
    Account Account;
    Account Accounttransfer;
    AccountController accountController;
    CustomerTransaction transaction;
    CustomerTransaction transactiontransfer;
    Transfer transfer;
    TransactionController transactionController;
    TransferController transferController;
    boolean CheckAcc=false;
    /**
     * Creates new form Control
     */
    public Transfers(Control cl,Account account) {
        this.Account=account;
        accountController=new AccountController();
        transactionController = new TransactionController();
        transferController = new TransferController();
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/logo.png"));
        Image image = icon.getImage();
        setIconImage(image);
        initComponents();
        btnTransfer.setEnabled(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon("src/images/bg.jpg");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon("src/images/nen.png");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        jButton9 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon("src/images/nen.png");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        jLabel3 = new javax.swing.JLabel();
        btnTransfer = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtMoney = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCardTransfer = new javax.swing.JTextField();
        btnEnter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/atm.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setText("Copyright © Group4");

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.setContentAreaFilled(false);
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        btnExit.setBorder(null);
        btnExit.setContentAreaFilled(false);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jPanel2.setLayout(new java.awt.GridLayout(4, 3, 5, 5));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/7.png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/8.png"))); // NOI18N
        jButton12.setBorder(null);
        jButton12.setContentAreaFilled(false);
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/9.png"))); // NOI18N
        jButton11.setBorder(null);
        jButton11.setContentAreaFilled(false);
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11);

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4.png"))); // NOI18N
        jButton15.setBorder(null);
        jButton15.setContentAreaFilled(false);
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton15);

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/5.png"))); // NOI18N
        jButton14.setBorder(null);
        jButton14.setContentAreaFilled(false);
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14);

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/6.png"))); // NOI18N
        jButton13.setBorder(null);
        jButton13.setContentAreaFilled(false);
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13);

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.png"))); // NOI18N
        jButton16.setBorder(null);
        jButton16.setContentAreaFilled(false);
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton16);

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2.png"))); // NOI18N
        jButton17.setBorder(null);
        jButton17.setContentAreaFilled(false);
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton17);

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3.png"))); // NOI18N
        jButton18.setBorder(null);
        jButton18.setContentAreaFilled(false);
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton18);

        jButton19.setBorder(null);
        jButton19.setContentAreaFilled(false);
        jButton19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jButton19);

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/0.png"))); // NOI18N
        jButton20.setBorder(null);
        jButton20.setContentAreaFilled(false);
        jButton20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton20);

        jLabel3.setFont(new java.awt.Font("Lifestyle Marker M54", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("MONEY");
        jLabel3.setPreferredSize(new java.awt.Dimension(34, 40));

        btnTransfer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transfer1.png"))); // NOI18N
        btnTransfer.setBorder(null);
        btnTransfer.setContentAreaFilled(false);
        btnTransfer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferActionPerformed(evt);
            }
        });

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset.png"))); // NOI18N
        btnReset.setBorder(null);
        btnReset.setContentAreaFilled(false);
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        txtMoney.setEditable(false);
        txtMoney.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtMoney.setPreferredSize(new java.awt.Dimension(240, 40));

        jLabel4.setFont(new java.awt.Font("Lifestyle Marker M54", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("CARD TRANSFER");
        jLabel4.setPreferredSize(new java.awt.Dimension(34, 40));

        txtCardTransfer.setEditable(false);
        txtCardTransfer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtCardTransfer.setPreferredSize(new java.awt.Dimension(240, 40));

        btnEnter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/enter.png"))); // NOI18N
        btnEnter.setBorder(null);
        btnEnter.setContentAreaFilled(false);
        btnEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEnter)
                        .addGap(34, 34, 34)
                        .addComponent(btnTransfer)
                        .addGap(36, 36, 36)
                        .addComponent(btnReset)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCardTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCardTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMoney, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTransfer)
                    .addComponent(btnReset)
                    .addComponent(btnEnter))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(253, 253, 253)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit)
                        .addGap(18, 18, 18))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(29, 29, 29))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferActionPerformed
        if(txtMoney.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter Money");
        }
        else{
            String str=txtMoney.getText();
            float money=0;
            if(str.contains(",")){
                money = Float.parseFloat(str.replaceAll(",", ""));
            }
            else money = Float.parseFloat(str);
            double Balance1=Account.getAccBalance();
            if(Balance1>=money){
                int check = JOptionPane.showConfirmDialog(null, "Do you want deposit Account No.: " + Account.getAccNo() + "with amount : " + txtMoney.getText(),"Transfer",JOptionPane.YES_NO_CANCEL_OPTION);
                if(check == JOptionPane.YES_OPTION){
                    double Balance2 = Accounttransfer.getAccBalance();
                    double transfer1=(Balance1-money);
                    double transfer2= (Balance2 + money);
                    AmountRequestWithdraw = (25000 - transactionController.GetSumAmountToDayDeposit(Account.getAccID(), "Withdraw"));
                    AmountRequestDeposit = (25000 - transactionController.GetSumAmountToDayDeposit(Accounttransfer.getAccID(), "Deposit"));
                    if(AmountRequestWithdraw<money || AmountRequestDeposit<money){
                        JOptionPane.showMessageDialog(null, "You don't Transfer money,please enter money again","Transfer",JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        Accounttransfer.setAccBalance(transfer2);
                        accountController.UpdateAccNo(Accounttransfer);
                        Account.setAccBalance(transfer1);
                        accountController.UpdateAccNo(Account);
                        
                        transaction = new CustomerTransaction();
                        transaction.setAccID(Account);
                        transaction.setTranAmount(money);
                        transaction.setTranBalance(Account.getAccBalance() - money);
                        transaction.setTranType("Withdraw");
                        transactionController.InsertTransaction(transaction);
                        
                        transactiontransfer = new CustomerTransaction();
                        transactiontransfer.setAccID(Accounttransfer);
                        transactiontransfer.setTranAmount(money);
                        transactiontransfer.setTranBalance(Accounttransfer.getAccBalance() + money);
                        transactiontransfer.setTranType("Deposit");
                        transactionController.InsertTransaction(transactiontransfer);
                        
                        System.out.println(transaction);
                        transfer = new Transfer();
                        transfer.setAccfrom(Account);
                        transfer.setAccto(Accounttransfer.getAccID());
                        transfer.setAmount(money);
                        transfer.setAccount(Account);
                        transfer.setTransactionfromID(transaction);
                        transfer.setTransferdate(new Date());
                        transfer.setTransactiontoID(transactiontransfer);
                        TransferController tran = new TransferController();
                        tran.InsertTransfer(transfer);
                        JOptionPane.showMessageDialog(null, "You are Transfer Money successfully");
                        this.setVisible(false);
                    }
                }
            }
            else {
                txtMoney.setText("");
                JOptionPane.showMessageDialog(null, "You understate money for Transfer,please enter money again","Transfer",JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_btnTransferActionPerformed
    private void insertTranfer(){
    
    }
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        a=0;
        btnEnter.setEnabled(true);
        btnTransfer.setEnabled(false);
        txtCardTransfer.setText("");
        txtMoney.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        if(a==0) {
            if(txtCardTransfer.getText().length()<19){
                if(txtCardTransfer.getText().length()==4 || txtCardTransfer.getText().length()==9 || txtCardTransfer.getText().length()==14) txtCardTransfer.setText(txtCardTransfer.getText()+"-");
                txtCardTransfer.setText(txtCardTransfer.getText()+0);
            }
        }
        else txtMoney.setText(txtMoney.getText()+0);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        if(a==0) {
            if(txtCardTransfer.getText().length()<19){ 
                if(txtCardTransfer.getText().length()==4 || txtCardTransfer.getText().length()==9 || txtCardTransfer.getText().length()==14) txtCardTransfer.setText(txtCardTransfer.getText()+"-");
                txtCardTransfer.setText(txtCardTransfer.getText()+1);
            }
        }
        else txtMoney.setText(txtMoney.getText()+1);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        if(a==0) {
            if(txtCardTransfer.getText().length()<19){
                if(txtCardTransfer.getText().length()==4 || txtCardTransfer.getText().length()==9 || txtCardTransfer.getText().length()==14) txtCardTransfer.setText(txtCardTransfer.getText()+"-");
                txtCardTransfer.setText(txtCardTransfer.getText()+2);
            }
        }
        else txtMoney.setText(txtMoney.getText()+2);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        if(a==0) {
            if(txtCardTransfer.getText().length()<19){
                if(txtCardTransfer.getText().length()==4 || txtCardTransfer.getText().length()==9 || txtCardTransfer.getText().length()==14) txtCardTransfer.setText(txtCardTransfer.getText()+"-");
                txtCardTransfer.setText(txtCardTransfer.getText()+3);
            }
        }
        else txtMoney.setText(txtMoney.getText()+3);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        if(a==0) {
            if(txtCardTransfer.getText().length()<19){
                if(txtCardTransfer.getText().length()==4 || txtCardTransfer.getText().length()==9 || txtCardTransfer.getText().length()==14) txtCardTransfer.setText(txtCardTransfer.getText()+"-");
                txtCardTransfer.setText(txtCardTransfer.getText()+4);
            }
        }
        else txtMoney.setText(txtMoney.getText()+4);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        if(a==0) {
            if(txtCardTransfer.getText().length()<19){
                if(txtCardTransfer.getText().length()==4 || txtCardTransfer.getText().length()==9 || txtCardTransfer.getText().length()==14) txtCardTransfer.setText(txtCardTransfer.getText()+"-");
                txtCardTransfer.setText(txtCardTransfer.getText()+5);
            }
        }
        else txtMoney.setText(txtMoney.getText()+5);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        if(a==0) {
            if(txtCardTransfer.getText().length()<19){
                if(txtCardTransfer.getText().length()==4 || txtCardTransfer.getText().length()==9 || txtCardTransfer.getText().length()==14) txtCardTransfer.setText(txtCardTransfer.getText()+"-");
                txtCardTransfer.setText(txtCardTransfer.getText()+6);
            }
        }
        else txtMoney.setText(txtMoney.getText()+6);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(a==0) {
            if(txtCardTransfer.getText().length()<19){
                if(txtCardTransfer.getText().length()==4 || txtCardTransfer.getText().length()==9 || txtCardTransfer.getText().length()==14) txtCardTransfer.setText(txtCardTransfer.getText()+"-");
                txtCardTransfer.setText(txtCardTransfer.getText()+7);
            }
        }
        else txtMoney.setText(txtMoney.getText()+7);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if(a==0) {
            if(txtCardTransfer.getText().length()<19){
                if(txtCardTransfer.getText().length()==4 || txtCardTransfer.getText().length()==9 || txtCardTransfer.getText().length()==14) txtCardTransfer.setText(txtCardTransfer.getText()+"-");
                txtCardTransfer.setText(txtCardTransfer.getText()+8);
            }
        }
        else txtMoney.setText(txtMoney.getText()+8);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if(a==0) {
            if(txtCardTransfer.getText().length()<19){
                if(txtCardTransfer.getText().length()==4 || txtCardTransfer.getText().length()==9 || txtCardTransfer.getText().length()==14) txtCardTransfer.setText(txtCardTransfer.getText()+"-");
                txtCardTransfer.setText(txtCardTransfer.getText()+9);
            }
        }
        else txtMoney.setText(txtMoney.getText()+9);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        if(a==0) {
            if(txtCardTransfer.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please enter Card Transfer");
            }
            else if(txtCardTransfer.getText().length()<19) JOptionPane.showMessageDialog(null, "Card Transfer lack,please added","Transfer",JOptionPane.ERROR_MESSAGE);
            else if(txtCardTransfer.getText().length()==19) {
                String accno = txtCardTransfer.getText().trim();
                if(accountController.LoginAccNoSystem(accno)){
                    Accounttransfer = accountController.getAccByAccnoo(accno);
                    CheckAcc=Account.equals(Accounttransfer);
                    if(CheckAcc==true){
                        JOptionPane.showMessageDialog(null, "Card were identical,please enter Card Transfer again!","Transfer",JOptionPane.ERROR_MESSAGE);
                        txtCardTransfer.setText("");
                    }
                    else{
                        a=1;
                        btnEnter.setEnabled(false);
                        btnTransfer.setEnabled(true);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Card No wrong,please enter Card Transfer again!","Transfer",JOptionPane.ERROR_MESSAGE);
                    txtCardTransfer.setText("");
                }
            }
        }
        
    }//GEN-LAST:event_btnEnterActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTransfer;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtCardTransfer;
    private javax.swing.JTextField txtMoney;
    // End of variables declaration//GEN-END:variables
}

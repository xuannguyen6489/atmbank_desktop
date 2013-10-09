package group4.atmbank.customer.views;



    
import atmbank.customer.controllers.AccountController;
import atmbank.customer.controllers.TransactionController;
import atmbank.customer.model.Account;
import atmbank.customer.model.CustomerTransaction;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
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
public class Withdraw extends javax.swing.JFrame {
    int AmountRequest;
    Account Account;
    AccountController accountController;
    CustomerTransaction transaction;
    TransactionController transactionController;
    
    /**
     * Creates new form Control
     */
    public Withdraw(Control cl,Account account) {
        this.Account=account;
        accountController=new AccountController();
        transactionController = new TransactionController();
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/logo.png"));
        Image image = icon.getImage();
        setIconImage(image);
        initComponents();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1000.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2000.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/5000.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/other.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(156, 156, 156))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
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

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        WithdrawOther withdrawother = new WithdrawOther(this,Account);
        withdrawother.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double balance = Account.getAccBalance();
        double money=1000;
        AmountRequest = (25000 - transactionController.GetSumAmountToDayDeposit(Account.getAccID(), "Withdraw"));
        if(balance>money){
            if(AmountRequest>money){
                int check = JOptionPane.showConfirmDialog(null, "Do you want withdraw Account No.: " + Account.getAccNo() + "with amount : " + "1.000","Withdraw - Transaction",JOptionPane.YES_NO_CANCEL_OPTION);
                if(check == JOptionPane.YES_OPTION){
                    transaction = new CustomerTransaction();
                    transaction.setAccID(Account);
                    transaction.setTranAmount(money);
                    transaction.setTranBalance(Account.getAccBalance() - money);
                    transaction.setTranType("Withdraw");
                    transactionController.InsertTransaction(transaction);
                    double transfer=balance-money;
                    Account.setAccBalance(transfer);
                    accountController.UpdateAccNo(Account);
                    accountController.close();
                    JOptionPane.showMessageDialog(null, "You are Withdraw Money successfully");
                    this.setVisible(false);
                }
            }else JOptionPane.showMessageDialog(null, "You only withdraw "+ AmountRequest+ " $,please choose money again","Withdraw - Transaction",JOptionPane.ERROR_MESSAGE);
        }
        else JOptionPane.showMessageDialog(null, "You understate money for Withdraw,please choose money again","Withdraw - Transaction",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        double balance = Account.getAccBalance();
        double money=2000;
        AmountRequest = (25000 - transactionController.GetSumAmountToDayDeposit(Account.getAccID(), "Withdraw"));
        if(balance>money){
            if(AmountRequest>money){
                int check = JOptionPane.showConfirmDialog(null, "Do you want withdraw Account No.: " + Account.getAccNo() + "with amount : " + "2.000","Withdraw - Transaction",JOptionPane.YES_NO_CANCEL_OPTION);
                if(check == JOptionPane.YES_OPTION){
                    transaction = new CustomerTransaction();
                    transaction.setAccID(Account);
                    transaction.setTranAmount(money);
                    transaction.setTranBalance(Account.getAccBalance() - money);
                    transaction.setTranType("Withdraw");
                    transactionController.InsertTransaction(transaction);
                    double transfer=balance-money;
                    Account.setAccBalance(transfer);
                    accountController.UpdateAccNo(Account);
                    accountController.close();
                    JOptionPane.showMessageDialog(null, "You are Withdraw Money successfully");
                    this.setVisible(false);
                }
            }else JOptionPane.showMessageDialog(null, "You only withdraw "+ AmountRequest+ " $,please choose money again","Withdraw - Transaction",JOptionPane.ERROR_MESSAGE); 
        }
        else JOptionPane.showMessageDialog(null, "You understate money for Withdraw,please choose money again","Withdraw - Transaction",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        double balance = Account.getAccBalance();
        double money=5000;
        AmountRequest = (25000 - transactionController.GetSumAmountToDayDeposit(Account.getAccID(), "Withdraw"));
        if(balance>money){
            if(AmountRequest>money){
                int check = JOptionPane.showConfirmDialog(null, "Do you want withdraw Account No.: " + Account.getAccNo() + "with amount : " + "5.000","Withdraw - Transaction",JOptionPane.YES_NO_CANCEL_OPTION);
                if(check == JOptionPane.YES_OPTION){
                    transaction = new CustomerTransaction();
                    transaction.setAccID(Account);
                    transaction.setTranAmount(money);
                    transaction.setTranBalance(Account.getAccBalance() - money);
                    transaction.setTranType("Withdraw");
                    transactionController.InsertTransaction(transaction);
                    double transfer=balance-money;
                    Account.setAccBalance(transfer);
                    accountController.UpdateAccNo(Account);
                    accountController.close();
                    JOptionPane.showMessageDialog(null, "You are Withdraw Money successfully");
                    this.setVisible(false);
                }
            }else JOptionPane.showMessageDialog(null, "You only withdraw "+ AmountRequest+ " $,please choose money again","Withdraw - Transaction",JOptionPane.ERROR_MESSAGE); 
        }
        else JOptionPane.showMessageDialog(null, "You understate money for Withdraw,please choose money again","Withdraw - Transaction",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
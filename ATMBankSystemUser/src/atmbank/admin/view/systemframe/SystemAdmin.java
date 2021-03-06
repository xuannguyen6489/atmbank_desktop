/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atmbank.admin.view.systemframe;

import atmbank.admin.view.report.JInternalFrameViewTransferReport;
import atmbank.admin.view.report.JInternalFrameViewWithdrawalReport;
import atmbank.admin.view.report.JInternalFrameViewDepositReport;
import atmbank.admin.view.report.JInternalFrameViewAccountReport;
import atmbank.admin.controllers.CustomerController;
import atmbank.admin.model.Customer;
import atmbank.admin.view.systemuser.*;
import atmbank.admin.model.SystemUser;
import atmbank.admin.view.account.JInternalFrameViewAccountAddNew;
import atmbank.admin.view.account.JInternalFrameViewAccountManagement;
import atmbank.admin.view.customer.JInternalFrameViewAddNewCustomer;
import atmbank.admin.view.customer.JInternalFrameViewCustomerManagement;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 *
 * @author Xuan Nguyen
 */
public class SystemAdmin extends javax.swing.JFrame implements ActionListener {

    SystemUser systemUser;
    Customer customer;
    CustomerController customerController;

    /**
     * Creates new form SystemAdmin
     */
    public SystemAdmin(ViewAdminLogin val, SystemUser systemUser) {
        val.setVisible(false);
        this.systemUser = systemUser;
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/logo.png"));
        Image image = icon.getImage();
        setIconImage(image);
        initComponents();
        setSize(this);
        viewProfile.addActionListener(this);
        mnExit.addActionListener(this);
        mnChangePassword.addActionListener(this);
        mnManagement.addActionListener(this);
        mnCreateNewUser.addActionListener(this);
        mnCreateNewAccount.addActionListener(this);
        mnAccManagement.addActionListener(this);
        mnCustomerManagement.addActionListener(this);
        mnCreateNewCustomer.addActionListener(this);
        mnAbout.addActionListener(this);
        bankInfo.addActionListener(this);
        withdrawReport.addActionListener(this);
        depositReport.addActionListener(this);       
        accountReport.addActionListener(this);
        transferReport.addActionListener(this);
        mnClock.addActionListener(this);
        mnCalendar.addActionListener(this);
    }

    public void setAccountDisable() {
        viewProfile.setEnabled(false);
        mnChangePassword.setEnabled(false);
        mnAdminManagement.setEnabled(false);
    }

    public void ShowJInternalFrame(JInternalFrame frame) {
        try {
            frame.setVisible(true);
            JDestop.add(frame);
            frame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(SystemAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void SetJIF(JInternalFrame frame) {
        Dimension destopSize = JDestop.getSize();
        Dimension jInternalFrameSize = frame.getSize();
        int width = (destopSize.width - jInternalFrameSize.width) / 2;
        int height = (destopSize.height - jInternalFrameSize.height) / 2;
        frame.setLocation(width, height);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        JDestop = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        viewProfile = new javax.swing.JMenuItem();
        mnChangePassword = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        bankInfo = new javax.swing.JMenuItem();
        mnAdminManagement = new javax.swing.JMenu();
        mnManagement = new javax.swing.JMenuItem();
        mnCreateNewUser = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnAccManagement = new javax.swing.JMenuItem();
        mnCreateNewAccount = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnCustomerManagement = new javax.swing.JMenuItem();
        mnCreateNewCustomer = new javax.swing.JMenuItem();
        mnSystemReport = new javax.swing.JMenu();
        withdrawReport = new javax.swing.JMenuItem();
        depositReport = new javax.swing.JMenuItem();
        transferReport = new javax.swing.JMenuItem();
        accountReport = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mnAbout = new javax.swing.JMenuItem();
        mnCalendar = new javax.swing.JMenuItem();
        mnClock = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin System");

        JDestop.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon24x24_admin.png"))); // NOI18N
        jMenu1.setText("Administrator");

        viewProfile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        viewProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon20x20_profile.png"))); // NOI18N
        viewProfile.setText("View Profile");
        viewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProfileActionPerformed(evt);
            }
        });
        jMenu1.add(viewProfile);

        mnChangePassword.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        mnChangePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon20x20_change-password.png"))); // NOI18N
        mnChangePassword.setText("Change Password");
        jMenu1.add(mnChangePassword);
        jMenu1.add(jSeparator1);

        mnExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon20x20_exit.png"))); // NOI18N
        mnExit.setText("Exit");
        jMenu1.add(mnExit);

        menuBar.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon24x24_management.png"))); // NOI18N
        jMenu2.setText("Management");

        bankInfo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        bankInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon24x24_bank_info.png"))); // NOI18N
        bankInfo.setText("Bank Infomation");
        bankInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankInfoActionPerformed(evt);
            }
        });
        jMenu2.add(bankInfo);

        mnAdminManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon24x24_admin_management.png"))); // NOI18N
        mnAdminManagement.setText("Administrator Management");

        mnManagement.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        mnManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon24x24_admin_management.png"))); // NOI18N
        mnManagement.setText("Management");
        mnAdminManagement.add(mnManagement);

        mnCreateNewUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mnCreateNewUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon24x24_add_admin.png"))); // NOI18N
        mnCreateNewUser.setText("Create New User");
        mnAdminManagement.add(mnCreateNewUser);

        jMenu2.add(mnAdminManagement);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon24x24_user_management.png"))); // NOI18N
        jMenu3.setText("Account Management");

        mnAccManagement.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnAccManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon24x24_user_management.png"))); // NOI18N
        mnAccManagement.setText("Management");
        jMenu3.add(mnAccManagement);

        mnCreateNewAccount.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnCreateNewAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aa.png"))); // NOI18N
        mnCreateNewAccount.setText("Create New Account");
        jMenu3.add(mnCreateNewAccount);

        jMenu2.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconcustomer.png"))); // NOI18N
        jMenu4.setText("Customer Management");

        mnCustomerManagement.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnCustomerManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconcustomer.png"))); // NOI18N
        mnCustomerManagement.setText("Mangement");
        jMenu4.add(mnCustomerManagement);

        mnCreateNewCustomer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnCreateNewCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon22x22_add_new.png"))); // NOI18N
        mnCreateNewCustomer.setText("Create New Customer");
        jMenu4.add(mnCreateNewCustomer);

        jMenu2.add(jMenu4);

        menuBar.add(jMenu2);

        mnSystemReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon24x24_system_report.png"))); // NOI18N
        mnSystemReport.setText("System Report");

        withdrawReport.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        withdrawReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/withdrawal.gif"))); // NOI18N
        withdrawReport.setText("Withdrawal Report");
        mnSystemReport.add(withdrawReport);

        depositReport.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        depositReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/deposit.png"))); // NOI18N
        depositReport.setText("Deposit Report");
        mnSystemReport.add(depositReport);

        transferReport.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        transferReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transfer.png"))); // NOI18N
        transferReport.setText("Transfer Report");
        mnSystemReport.add(transferReport);

        accountReport.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        accountReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account.png"))); // NOI18N
        accountReport.setText("Account Report");
        accountReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountReportActionPerformed(evt);
            }
        });
        mnSystemReport.add(accountReport);

        menuBar.add(mnSystemReport);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon20x20_help.png"))); // NOI18N
        jMenu5.setText("Help");

        mnAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        mnAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon20x20_aboutus.png"))); // NOI18N
        mnAbout.setText("About ");
        jMenu5.add(mnAbout);

        mnCalendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon20x20_calendar.png"))); // NOI18N
        mnCalendar.setText("Calendar");
        mnCalendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCalendarActionPerformed(evt);
            }
        });
        jMenu5.add(mnCalendar);

        mnClock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chronometer.png"))); // NOI18N
        mnClock.setText("Digital Clock");
        jMenu5.add(mnClock);

        menuBar.add(jMenu5);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDestop, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDestop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewProfileActionPerformed

    private void bankInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankInfoActionPerformed
        // TODO add your handling code here:
        JInternalFrameViewBankInfo bankinfo = new JInternalFrameViewBankInfo();
        bankinfo.setVisible(true);
    }//GEN-LAST:event_bankInfoActionPerformed
    public void SetShowCalendar(JInternalFrame frame){
        Dimension destopSize = JDestop.getSize();
        Dimension jInternalFrameSize = frame.getSize();
        int width = (destopSize.width - jInternalFrameSize.width)/2 + 475;
        int height = (destopSize.height - jInternalFrameSize.height) / 2 - 150;
        frame.setLocation(width, height);
    }
        public void SetShowClock(JInternalFrame frame){
        Dimension destopSize = JDestop.getSize();
        Dimension jInternalFrameSize = frame.getSize();
        int width = (destopSize.width - jInternalFrameSize.width)/2 + 570;
        int height = (destopSize.height - jInternalFrameSize.height) / 2 + 270;
        frame.setLocation(width, height);
    }
    private void accountReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountReportActionPerformed

    private void mnCalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCalendarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnCalendarActionPerformed
    private void setSize(JFrame frame) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = (int) tk.getScreenSize().getWidth();
        int ySize = (int) tk.getScreenSize().getHeight();
        frame.setSize(xSize, ySize);
    }
    //private void setPanel(JLabel lable){
    // Toolkit tk  = Toolkit.getDefaultToolkit();
    // Dimension label2 = lable.getSize();
    // int xSize =   (int) ((tk.getScreenSize().getWidth() - label2.getWidth())/2);
    // int ySize = (int) ((tk.getScreenSize().getHeight() - label2.getHeight())/2 - 50);
    // lable.setLocation(xSize, ySize);
    //}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JDestop;
    private javax.swing.JMenuItem accountReport;
    private javax.swing.JMenuItem bankInfo;
    private javax.swing.JMenuItem depositReport;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mnAbout;
    private javax.swing.JMenuItem mnAccManagement;
    private javax.swing.JMenu mnAdminManagement;
    private javax.swing.JMenuItem mnCalendar;
    private javax.swing.JMenuItem mnChangePassword;
    private javax.swing.JMenuItem mnClock;
    private javax.swing.JMenuItem mnCreateNewAccount;
    private javax.swing.JMenuItem mnCreateNewCustomer;
    private javax.swing.JMenuItem mnCreateNewUser;
    private javax.swing.JMenuItem mnCustomerManagement;
    private javax.swing.JMenuItem mnExit;
    private javax.swing.JMenuItem mnManagement;
    private javax.swing.JMenu mnSystemReport;
    private javax.swing.JMenuItem transferReport;
    private javax.swing.JMenuItem viewProfile;
    private javax.swing.JMenuItem withdrawReport;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewProfile) {
            JInternalFrameViewProfileAdmin viewProfileAdmin = new JInternalFrameViewProfileAdmin(systemUser, this);
            ShowJInternalFrame(viewProfileAdmin);
        }
        if (e.getSource() == mnExit) {
            System.exit(0);
        }
        if (e.getSource() == mnChangePassword) {
            JInternalFrameViewChangePassword changePassword = new JInternalFrameViewChangePassword(systemUser);
            ShowJInternalFrame(changePassword);
            SetJIF(changePassword);
        }
        if (e.getSource() == mnManagement) {
            JInternalFrameViewAdminManagement adminManage = new JInternalFrameViewAdminManagement(this);
            ShowJInternalFrame(adminManage);
        }
        if (e.getSource() == mnCreateNewUser) {
            JInternalFrameViewAdminAddNew addnew = new JInternalFrameViewAdminAddNew();
            ShowJInternalFrame(addnew);
        }
        if (e.getSource() == mnCreateNewAccount) {
            JInternalFrameViewAccountAddNew AccountAddnew = new JInternalFrameViewAccountAddNew();
            ShowJInternalFrame(AccountAddnew);
        }
        if (e.getSource() == mnAccManagement) {
            JInternalFrameViewAccountManagement accManagement = new JInternalFrameViewAccountManagement(this, systemUser);
            ShowJInternalFrame(accManagement);
        }
        if (e.getSource() == mnCustomerManagement) {
            JInternalFrameViewCustomerManagement customerManagement = new JInternalFrameViewCustomerManagement(this, systemUser);
            ShowJInternalFrame(customerManagement);
        }
        if (e.getSource() == mnCreateNewCustomer) {
            JInternalFrameViewAddNewCustomer addNewCustomer = new JInternalFrameViewAddNewCustomer();
            ShowJInternalFrame(addNewCustomer);
            SetJIF(addNewCustomer);
        }
        if (e.getSource() == mnAbout) {
            JInternalFrameViewAboutUs aboutUs = new JInternalFrameViewAboutUs();
            ShowJInternalFrame(aboutUs);
            SetJIF(aboutUs);
        }
        if (e.getSource() == bankInfo) {
            JInternalFrameViewBankInfo bankinfo = new JInternalFrameViewBankInfo();
            ShowJInternalFrame(bankinfo);
        }
        if (e.getSource() == withdrawReport) {
            JInternalFrameViewWithdrawalReport report = new JInternalFrameViewWithdrawalReport();
            ShowJInternalFrame(report);
        }
        if (e.getSource() == depositReport) {
            JInternalFrameViewDepositReport report = new JInternalFrameViewDepositReport();
            ShowJInternalFrame(report);
        }        
        if (e.getSource() == accountReport) {
            JInternalFrameViewAccountReport report = new JInternalFrameViewAccountReport();
            ShowJInternalFrame(report);
        }
        if (e.getSource() == transferReport) {
            JInternalFrameViewTransferReport report = new JInternalFrameViewTransferReport();
            ShowJInternalFrame(report);
        }
        if(e.getSource() == mnClock){
            JInternalFrameClock clock = new JInternalFrameClock();
            ShowJInternalFrame(clock);
            SetShowClock(clock);
        }
        if(e.getSource() == mnCalendar){
            JInternalFrameViewCalendar calendar = new JInternalFrameViewCalendar();
            ShowJInternalFrame(calendar);
            SetShowCalendar(calendar);
        }
    }
}

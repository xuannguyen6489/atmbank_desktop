/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atmbank.admin.view.systemuser;

import atmbank.admin.controllers.AdminController;
import atmbank.admin.model.SystemUser;
import atmbank.admin.model.UserGroup;
import atmbank.admin.security.SecurityUtils;
import atmbank.admin.security.SystemGetManagement;
import atmbank.admin.security.SystemValidation;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Xuan Nguyen
 */
public class JInternalFrameViewAdminAddNew extends javax.swing.JInternalFrame {
    AdminController adminController;
    DefaultComboBoxModel modelCombo;
    SystemValidation valid;
    SystemUser systemUser;
    UserGroup userGroup;
    SystemGetManagement systemManagement;
    /**
     * Creates new form JInternalFrameViewAdminAddNew
     */
    String username,password1,password2,fullname,dob,address,phone,email,date,messError;
    boolean ValidUsername = false;
    boolean ValidPass1 = false;
    boolean ValidPass2 = false;
    boolean ValidFullName = false;
    boolean ValidEmail = false;
    boolean ValidPhone = false;
    boolean ValidAdress = false;
    public JInternalFrameViewAdminAddNew() {
        initComponents();
        valid = new SystemValidation();
        systemManagement = new SystemGetManagement();
        systemManagement.getAllPermission(modelCombo, cbxPermission);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        rdnBtnMale = new javax.swing.JRadioButton();
        rdnBtnFemale = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taAddress = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblIconArdds = new javax.swing.JLabel();
        lblIconFullname = new javax.swing.JLabel();
        txtDate = new com.toedter.calendar.JDateChooser();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblIconPhone = new javax.swing.JLabel();
        lblIconEmail = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSubmit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lblIconUsername = new javax.swing.JLabel();
        lblIconPass1 = new javax.swing.JLabel();
        lblIconPass2 = new javax.swing.JLabel();
        cbxPermission = new javax.swing.JComboBox();
        txtPass1 = new javax.swing.JPasswordField();
        txtPass2 = new javax.swing.JPasswordField();

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon24x24_incorrect.png"))); // NOI18N

        setClosable(true);
        setIconifiable(true);
        setTitle("Register Account");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon24x24_add_admin.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Username:");

        txtUsername.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Password:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Confirm Password:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Permission: ");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 51, 51))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Full name:");

        txtFullName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtFullName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFullNameFocusGained(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Gender:");

        rdnBtnMale.setBackground(java.awt.Color.white);
        buttonGroup1.add(rdnBtnMale);
        rdnBtnMale.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdnBtnMale.setSelected(true);
        rdnBtnMale.setText("Male");

        rdnBtnFemale.setBackground(java.awt.Color.white);
        buttonGroup1.add(rdnBtnFemale);
        rdnBtnFemale.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdnBtnFemale.setText("Female");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("DoB:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Address:");

        taAddress.setColumns(20);
        taAddress.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        taAddress.setRows(5);
        taAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                taAddressFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(taAddress);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Phone:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Email:");

        lblIconArdds.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon24x24_incorrect.png"))); // NOI18N

        lblIconFullname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon24x24_incorrect.png"))); // NOI18N

        txtPhone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPhoneFocusGained(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
        });

        lblIconPhone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon24x24_incorrect.png"))); // NOI18N

        lblIconEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon24x24_incorrect.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdnBtnMale)
                        .addGap(34, 34, 34)
                        .addComponent(rdnBtnFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIconEmail)
                            .addComponent(lblIconPhone)
                            .addComponent(lblIconFullname)
                            .addComponent(lblIconArdds))))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdnBtnMale)
                            .addComponent(jLabel11))
                        .addComponent(rdnBtnFemale))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIconFullname)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(lblIconArdds)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                                .addComponent(lblIconPhone)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblIconEmail))))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        btnSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon22x22_ok.png"))); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel2.add(btnSubmit);

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon22x22_refresh.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel2.add(btnReset);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon22x22_cancel.png"))); // NOI18N
        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        lblIconUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon24x24_incorrect.png"))); // NOI18N

        lblIconPass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon24x24_incorrect.png"))); // NOI18N

        lblIconPass2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon24x24_incorrect.png"))); // NOI18N

        txtPass1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPass1FocusGained(evt);
            }
        });

        txtPass2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPass2FocusGained(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxPermission, 0, 181, Short.MAX_VALUE)
                            .addComponent(txtPass1)
                            .addComponent(txtPass2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIconUsername)
                            .addComponent(lblIconPass1)
                            .addComponent(lblIconPass2))
                        .addGap(64, 64, 64))))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(txtPass2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblIconUsername)
                                    .addGap(30, 30, 30))
                                .addComponent(lblIconPass1))
                            .addGap(30, 30, 30))
                        .addComponent(lblIconPass2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxPermission, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void ChecktxtUsername(){
        username = txtUsername.getText().trim();
        ValidUsername = true;
        if(username.equals("") || username.length() < 6 || username.length() > 20){
            ValidUsername = false;
        }
        lblIconUsername.setIcon(ValidUsername ? SystemValidation.CORRECT_ICON : SystemValidation.INCORRECT_ICON);
    }
    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        txtUsername.selectAll();
        txtUsername.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                ChecktxtUsername(); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                ChecktxtUsername(); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                ChecktxtUsername(); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }//GEN-LAST:event_txtUsernameFocusGained
    private void CheckFullName(){
        fullname = txtFullName.getText().trim();
        ValidFullName = true;
        if(fullname.equals("") ){
          ValidFullName  = false; 
        }
        lblIconFullname.setIcon(ValidFullName ? SystemValidation.CORRECT_ICON : SystemValidation.INCORRECT_ICON);
    }
    private void txtFullNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFullNameFocusGained
        txtFullName.selectAll();
        txtFullName.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
               CheckFullName(); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                CheckFullName(); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                CheckFullName(); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }//GEN-LAST:event_txtFullNameFocusGained
    private void CheckAddress(){
        address = taAddress.getText().trim();
        ValidAdress = true;
        if(address.equals("") || address.length() > 333){
             ValidAdress = false;
        }
        lblIconArdds.setIcon(ValidAdress ? SystemValidation.CORRECT_ICON : SystemValidation.INCORRECT_ICON);
    }
    private void taAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_taAddressFocusGained
        taAddress.selectAll();
        taAddress.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                CheckAddress(); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                CheckAddress(); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                CheckAddress(); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }//GEN-LAST:event_taAddressFocusGained
    private void CheckPhone(){
        phone = txtPhone.getText().trim();
        ValidPhone = true;
        if(!valid.validatePhone(phone)){
            ValidPhone = false;
        }
        lblIconPhone.setIcon(ValidPhone ? SystemValidation.CORRECT_ICON : SystemValidation.INCORRECT_ICON);
    }
    private void txtPhoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhoneFocusGained
        txtPhone.selectAll();
        txtPhone.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                CheckPhone(); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                CheckPhone(); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                CheckPhone(); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }//GEN-LAST:event_txtPhoneFocusGained
    private void CheckEmail(){
        email = txtEmail.getText().trim();
        ValidEmail = true;
        if(!valid.validateEmail(email)){
          ValidEmail = false;  
        }
        lblIconEmail.setIcon(ValidEmail ? SystemValidation.CORRECT_ICON : SystemValidation.INCORRECT_ICON);
    }
    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        txtEmail.selectAll();
        txtEmail.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                CheckEmail(); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                CheckEmail(); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                CheckEmail(); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }//GEN-LAST:event_txtEmailFocusGained
    private void CheckPass1(){
        password1 = String.valueOf(txtPass1.getPassword()).trim();
        password2 = String.valueOf(txtPass2.getPassword()).trim();
        ValidPass1 = true;
        if(password2.equals("")){
            if(password1.length() < 6 || password1.length() > 20){
                ValidPass1 = false;
            }
        }else if(!password1.equals(password2)){
            ValidPass1 = false;
        }
        lblIconPass1.setIcon(ValidPass1 ? SystemValidation.CORRECT_ICON : SystemValidation.INCORRECT_ICON);
    }
    private void txtPass1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPass1FocusGained
        txtPass1.selectAll();
        txtPass1.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                CheckPass1(); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
               CheckPass1(); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                CheckPass1(); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }//GEN-LAST:event_txtPass1FocusGained
    private void CheckPass2(){
        password1 = String.valueOf(txtPass1.getPassword()).trim();
        password2 = String.valueOf(txtPass2.getPassword()).trim();
        ValidPass2 = true;
        if(password1.equals("")){
            ValidPass2 = false;
        }else if(!password2.equals(password1)){
            ValidPass2 = false;
        }
       lblIconPass2.setIcon(ValidPass2 ? SystemValidation.CORRECT_ICON : SystemValidation.INCORRECT_ICON); 
    }
    private void txtPass2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPass2FocusGained
        txtPass2.selectAll();
        txtPass2.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                 CheckPass2(); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                CheckPass2(); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                 CheckPass2(); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }//GEN-LAST:event_txtPass2FocusGained
    private boolean checkAlreadyExistsForm(){
        date = String.valueOf(txtDate.getDate()).trim();
        if(ValidAdress && ValidEmail && ValidFullName && ValidPass1 && ValidPass2 && ValidPhone && ValidUsername){
            if(!valid.validateIsDate(date)){
             messError = "Invalid Date . Please select Date";
             txtDate.requestFocus();
            }else if(txtDate.getDate().after(new Date())){
                messError = "Date not more than current Date . Please try again";
            }else if(adminController.CheckUsernameExists(txtUsername.getText().trim())){
                  messError = "Username already exists . Please try again";
                  txtUsername.requestFocus();
            }else if(adminController.CheckEmailExistsAdd(txtEmail.getText().trim())){
                  messError = "Email already exists . Please try again"; 
                  txtEmail.requestFocus();
             }else{
                return true;
            }
        }else{
            messError = "Please check field";
            return false;
        }
        return false;   
    }
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        adminController = new AdminController();
        String Newpass1 = String.valueOf(txtPass1.getPassword());
        String hashPassword;
            try {
                hashPassword = SecurityUtils.md5PasswordEncrypt(Newpass1);
            } catch (NoSuchAlgorithmException ex) {
                hashPassword = Newpass1;
                Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            }
        if(!checkAlreadyExistsForm()){
             JOptionPane.showMessageDialog(this,messError,"Register Error",JOptionPane.ERROR_MESSAGE);
        }else{
             userGroup = new UserGroup();
             userGroup.setGroupId(cbxPermission.getSelectedIndex()+1);
             systemUser = new SystemUser();
             systemUser.setGroupId(userGroup);
             systemUser.setUserAddress(taAddress.getText());
             systemUser.setUserDoB(txtDate.getDate());
             systemUser.setUserEmail(txtEmail.getText());
             systemUser.setUserFullName(txtFullName.getText());
             systemUser.setUserGender(rdnBtnMale.isSelected() ? "Male" : "Female");
             systemUser.setUserPassword(hashPassword);
             systemUser.setUserPhone(txtPhone.getText());
             systemUser.setUserStatus("Enable");
             systemUser.setUserUsername(txtUsername.getText());
             adminController.AddUserAdmin(systemUser);
             adminController.close();
             JOptionPane.showMessageDialog(this,"Added Account Successfully !!.","Create New Administrator",JOptionPane.INFORMATION_MESSAGE);               
             }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtDate.setMaxSelectableDate(Calendar.getInstance().getTime());
        txtEmail.setText("");
        txtFullName.setText("");
        txtPass1.setText("");
        txtPass2.setText("");
        txtPhone.setText("");
        txtUsername.setText("");
        taAddress.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbxPermission;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIconArdds;
    private javax.swing.JLabel lblIconEmail;
    private javax.swing.JLabel lblIconFullname;
    private javax.swing.JLabel lblIconPass1;
    private javax.swing.JLabel lblIconPass2;
    private javax.swing.JLabel lblIconPhone;
    private javax.swing.JLabel lblIconUsername;
    private javax.swing.JRadioButton rdnBtnFemale;
    private javax.swing.JRadioButton rdnBtnMale;
    private javax.swing.JTextArea taAddress;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JPasswordField txtPass1;
    private javax.swing.JPasswordField txtPass2;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

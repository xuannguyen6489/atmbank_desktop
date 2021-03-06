/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atmbank.admin.view.systemframe;

import atmbank.admin.controllers.BankInfoController;
import atmbank.admin.controllers.CommonController;
import atmbank.admin.security.SystemValidation;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Xuan Nguyen
 */
public class JInternalFrameViewBankInfo extends javax.swing.JInternalFrame {

    atmbank.admin.model.BankInfo bankData = null;
    String bankName, bankPhone, bankFax, bankAddress;
    boolean validBankName = false;
    boolean validBankPhone = false;
    boolean validBankAddress = false;
    boolean validBankFax = false;
    BankInfoController controller;

    /**
     * Creates new form BankInfo
     */
    public JInternalFrameViewBankInfo() {
        initComponents();
        this.controller = new BankInfoController();
        this.bankData = controller.getBankInfo();
        this.loadData();
        this.checktxtBankNamẹ();
        this.checktxtBankAddress();
        this.checktxtBankPhone();
        this.checktxtBankFax();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void checktxtBankNamẹ() {
        bankName = txtBankName.getText().trim();
        validBankName = true;
        if (txtBankName.equals("") || bankName.length() < 6 || bankName.length() > 20) {
            validBankName = false;
        }
        lblBankName.setIcon(validBankName ? SystemValidation.CORRECT_ICON : SystemValidation.INCORRECT_ICON);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtBankName = new javax.swing.JTextField();
        txtBankAddress = new javax.swing.JTextField();
        txtBankPhone = new javax.swing.JTextField();
        txtBankFax = new javax.swing.JTextField();
        lblBankName = new javax.swing.JLabel();
        lblBankAddress = new javax.swing.JLabel();
        lblBankPhone = new javax.swing.JLabel();
        lblBankFax = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Bank Information");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1376892_606855336024151_2116915140_n.jpg"))); // NOI18N

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bank Information");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1376892_606855336024151_2116915140_n.jpg"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Name: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Address:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Phone:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Fax:");

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon22x22_ok.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon22x22_refresh.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon22x22_cancel.png"))); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txtBankName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtBankName.setPreferredSize(new java.awt.Dimension(230, 28));
        txtBankName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBankNameFocusGained(evt);
            }
        });

        txtBankAddress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtBankAddress.setPreferredSize(new java.awt.Dimension(230, 28));
        txtBankAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBankAddressFocusGained(evt);
            }
        });

        txtBankPhone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtBankPhone.setPreferredSize(new java.awt.Dimension(230, 28));
        txtBankPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBankPhoneFocusGained(evt);
            }
        });

        txtBankFax.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtBankFax.setPreferredSize(new java.awt.Dimension(230, 28));
        txtBankFax.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBankFaxFocusGained(evt);
            }
        });

        lblBankName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon24x24_incorrect.png"))); // NOI18N

        lblBankAddress.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon24x24_incorrect.png"))); // NOI18N

        lblBankPhone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon24x24_incorrect.png"))); // NOI18N

        lblBankFax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon24x24_incorrect.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtBankAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblBankAddress))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblBankName))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtBankFax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtBankPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBankPhone)
                                    .addComponent(lblBankFax))))
                        .addGap(40, 40, 40))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBankName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBankName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBankAddress)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtBankAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBankPhone)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtBankPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBankFax)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtBankFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnReset)
                    .addComponent(btnCancel))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        this.txtBankName.setText("");
        this.txtBankFax.setText("");
        this.txtBankPhone.setText("");
        this.txtBankAddress.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtBankNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBankNameFocusGained
        // TODO add your handling code here:
        txtBankName.selectAll();
        txtBankName.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checktxtBankNamẹ(); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checktxtBankNamẹ(); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checktxtBankNamẹ(); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }//GEN-LAST:event_txtBankNameFocusGained
    private void checktxtBankAddress() {
        bankAddress = txtBankAddress.getText().trim();
        validBankAddress = true;
        if (bankAddress.equals("") || bankAddress.length() < 6) {
            validBankAddress = false;
        }
        lblBankAddress.setIcon(validBankAddress ? SystemValidation.CORRECT_ICON : SystemValidation.INCORRECT_ICON);
    }
    private void txtBankAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBankAddressFocusGained
        // TODO add your handling code here:
        txtBankAddress.selectAll();
        txtBankAddress.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checktxtBankAddress();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checktxtBankAddress();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checktxtBankAddress();
            }
        });
    }//GEN-LAST:event_txtBankAddressFocusGained

    private void txtBankPhoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBankPhoneFocusGained
        txtBankPhone.selectAll();
        txtBankPhone.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checktxtBankPhone();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checktxtBankPhone();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checktxtBankPhone();
            }
        });
    }//GEN-LAST:event_txtBankPhoneFocusGained

    private void txtBankFaxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBankFaxFocusGained
        txtBankFax.selectAll();
        txtBankFax.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checktxtBankFax();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checktxtBankFax();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checktxtBankFax();
            }
        });
    }//GEN-LAST:event_txtBankFaxFocusGained

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        if (validBankName && validBankAddress && validBankPhone && validBankFax) {
            bankData.setBankName(this.txtBankName.getText());
            bankData.setBankAddress(this.txtBankAddress.getText());
            bankData.setBankPhone(this.txtBankPhone.getText());
            bankData.setBankFax(this.txtBankFax.getText());
            this.controller.updateBankInfo(bankData);
            JOptionPane.showMessageDialog(null, "Updated sucessfully");
        } else {
            JOptionPane.showMessageDialog(null, "Please check fields");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void checktxtBankPhone() {
        bankPhone = txtBankPhone.getText().trim();
        validBankPhone = true;
        if (bankPhone.equals("") || bankPhone.length() < 6 || bankPhone.length() > 11) {
            validBankPhone = false;
        }
        lblBankPhone.setIcon(validBankPhone ? SystemValidation.CORRECT_ICON : SystemValidation.INCORRECT_ICON);
    }

    private void checktxtBankFax() {
        bankFax = txtBankFax.getText().trim();
        validBankFax = true;
        if (bankFax.equals("") || bankFax.length() < 6 || bankFax.length() > 11) {
            validBankFax = false;
        }
        lblBankFax.setIcon(validBankFax ? SystemValidation.CORRECT_ICON : SystemValidation.INCORRECT_ICON);
    }

    public void loadData() {
        txtBankName.setText(this.bankData.getBankName());
        txtBankAddress.setText(this.bankData.getBankAddress());
        txtBankPhone.setText(this.bankData.getBankPhone());
        txtBankFax.setText(this.bankData.getBankFax());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBankAddress;
    private javax.swing.JLabel lblBankFax;
    private javax.swing.JLabel lblBankName;
    private javax.swing.JLabel lblBankPhone;
    private javax.swing.JTextField txtBankAddress;
    private javax.swing.JTextField txtBankFax;
    private javax.swing.JTextField txtBankName;
    private javax.swing.JTextField txtBankPhone;
    // End of variables declaration//GEN-END:variables
}

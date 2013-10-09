/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atmbank.admin.security;

import atmbank.admin.controllers.AdminController;
import atmbank.admin.controllers.CurrencyController;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Xuan Nguyen
 */
public class SystemGetManagement {
    CurrencyController currencyController;
    AdminController adminController;
    public void getCurrencySymbol(DefaultComboBoxModel comboxModel, JComboBox cbxCurrency){
        currencyController = new CurrencyController();
        List<?> list = currencyController.getCurrencySymBol();
        comboxModel = new DefaultComboBoxModel();
        for(Object obj  : list){
            comboxModel.addElement(obj);
        }
        cbxCurrency.setModel(comboxModel);
        currencyController.close();
    }
        public void getAllPermission(DefaultComboBoxModel modelCombo,JComboBox cbxPer){
        adminController = new AdminController();
        modelCombo = new DefaultComboBoxModel();
        List<?> list= adminController.getListPermission();
        for(Object obj : list){
            modelCombo.addElement(obj);
        }
        cbxPer.setModel(modelCombo);
    }
}

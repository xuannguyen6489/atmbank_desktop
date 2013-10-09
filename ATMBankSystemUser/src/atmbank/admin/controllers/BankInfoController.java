/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atmbank.admin.controllers;

import atmbank.admin.model.BankInfo;

/**
 *
 * @author Xuan Nguyen
 */
public class BankInfoController extends CommonController {

    public BankInfo getBankInfo() {
        return this.entityManager.find(atmbank.admin.model.BankInfo.class, 1);
    }

    public void updateBankInfo(BankInfo bankdata) {
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(bankdata);
        this.entityManager.getTransaction().commit();
    }
}

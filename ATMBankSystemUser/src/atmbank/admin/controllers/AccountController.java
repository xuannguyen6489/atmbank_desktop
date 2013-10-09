/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atmbank.admin.controllers;

import atmbank.admin.model.Account;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Xuan Nguyen
 */
public class AccountController extends CommonController{
    public AccountController(){
        super();
    }
    public Account SearchAccountById(int AccID){
        return this.entityManager.find(Account.class, AccID);
    }
    public void UpdateAccount(Account account){
        this.entityManager.getTransaction().begin();
        this.entityManager.merge(account);
        this.entityManager.getTransaction().commit();
    }
    public void UpdateAccountDisable(int AccID,String reason){
        Account account = SearchAccountById(AccID);
        account.setAccStatus("Disable");
        account.setAccStatusReason(reason);
        UpdateAccount(account);
    }
    public void UpdateAccountEnable(int AccID){
        Account account = SearchAccountById(AccID);
        account.setAccStatus("Enable");
        UpdateAccount(account);
    }
    public void UpdateBalanceDeposit(Account account,float money){
        this.entityManager.getTransaction().begin();
        Account accountX = SearchAccountById(account.getAccID());
        accountX.setAccBalance(account.getAccBalance() + money);
        this.entityManager.getTransaction().commit(); 
    }
    public void UpdateBalanceWithdraw(Account account,float money){
        this.entityManager.getTransaction().begin();
        Account accountX = SearchAccountById(account.getAccID());
        accountX.setAccBalance(account.getAccBalance() - money);
        this.entityManager.getTransaction().commit(); 
    }    
    public List<Account> getAccByIDCardNo(String IDCardNo){
       Query query = this.entityManager.createNamedQuery("Account.ListAccByAccNo").setParameter("iDCardNo", IDCardNo);
        List<Account>  list = query.getResultList();
       if(!list.isEmpty()){
           return list;
       }
       return null;
    }
    public float getBalanceAccountByID(int accID){        
        Query query = this.entityManager.createNamedQuery("Account.getBalanceAccByID").setParameter("accID", accID);
        int money = ((Number)query.getSingleResult()).intValue();
        return money;
    }
    public List<Account> getAccNoByAccNo(String accno){
        Query query = this.entityManager.createNamedQuery("Account.findByAccNo").setParameter("accNo", accno);
        List<Account> list = query.getResultList();
        if(!list.isEmpty()){
            return list;
        }
        return null;
    }
    public void AddNewAccount(Account account){
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(account);
        this.entityManager.getTransaction().commit();
    }
    public boolean CheckAccNoExists(String AccNo){
        Query query = this.entityManager.createNamedQuery("Account.findAccNoByAccNo").setParameter("accNo", AccNo);
        List<?> list = query.getResultList();
        if(list.isEmpty()){
            return true;
        }
        return false;   
    }
    public List<String> getAllAccNo(){
        Query query = this.entityManager.createNamedQuery("Account.findAllAccNo");
        List<String> list = query.getResultList();
        if(!list.isEmpty()){
            return list;
        }
        return null;
    }
    public List<Account> getAllAccount(){
        Query query = this.entityManager.createNamedQuery("Account.findAll");
        List<Account> list = query.getResultList();
            if(!list.isEmpty()){
                return list;
            }
        return null;
    }
    public void close(){
        if(this.entityManager.getTransaction().isActive()){
            this.entityManager.getTransaction().rollback();
        }
    }

    public List<Account> getAllAccountEnable(){
        Query query = this.entityManager.createNamedQuery("Account.findByAccStatus").setParameter("accStatus", "Enable");
        List<Account> list = query.getResultList();
        if(!list.isEmpty()){
            return list;
        }
        return null;
    }
    public List<Account> getAllAccountDisable(){
        Query query = this.entityManager.createNamedQuery("Account.findByAccStatus").setParameter("accStatus", "Disable");
        List<Account> list = query.getResultList();
        if(!list.isEmpty()){
            return list;
        }
        return null;
    }
        public void UpdateAccountPIN(Account account){
        this.entityManager.getTransaction().begin();
        Account accountX = SearchAccountById(account.getAccID());
        accountX.setAccPIN(account.getAccPIN());
        this.entityManager.getTransaction().commit(); 
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atmbank.customer.controllers;

import atmbank.customer.model.Account;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Group 4
 */
public class AccountController extends CommonController{
    public AccountController(){
        super();
    }
    public void close(){
        if(this.entityManager.getTransaction().isActive()){
            this.entityManager.getTransaction().rollback();
        }
    }
    public boolean LoginAccNoSystem(String accno){
        String sql = "select s from Account s where s.accNo = :accno and s.accStatus = 'Enable'";
        Query query = this.entityManager.createQuery(sql)
                    .setParameter("accno", accno);
        List list = query.getResultList();
        if(!list.isEmpty()){
            return true;
        }
        return false;
    }
    public boolean LoginSystem(String accno,String accpin){
        String sql = "select s from Account s where s.accNo = :accno and s.accPIN = :accpin and s.accStatus = 'Enable'";
        Query query = this.entityManager.createQuery(sql)
                    .setParameter("accno", accno)
                    .setParameter("accpin", accpin);
        List list = query.getResultList();
        if(!list.isEmpty()){
            return true;
        }
        return false;
    }
    public boolean ChangePINSystem(String accno,String accpin){
        String sql = "select s from Account s where s.accNo = :accno and s.accPIN = :accpin";
        Query query = this.entityManager.createQuery(sql)
                    .setParameter("accno", accno)
                    .setParameter("accpin", accpin);
        List list = query.getResultList();
        if(!list.isEmpty()){
            return true;
        }
        return false;
    }
    public Account getAccByAccnoo(String accno){
        Query query = this.entityManager.createNamedQuery("Account.findByAccNo").setParameter("accNo", accno);
        List<?> Account = query.getResultList();
            if(!Account.isEmpty()){
                for(Object obj : Account){
                    Account account = (Account) obj;
                    return account;
                }
            }
        return null;
    }
    public void UpdateAccNo(Account account){
        this.entityManager.getTransaction().begin();
        this.entityManager.merge(account);
        this.entityManager.getTransaction().commit();  
    }
    
}

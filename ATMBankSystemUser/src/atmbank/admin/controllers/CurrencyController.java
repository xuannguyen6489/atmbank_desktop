/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atmbank.admin.controllers;

import atmbank.admin.model.Currency;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Xuan Nguyen
 */
public class CurrencyController extends CommonController{
    public CurrencyController(){
        super();
    }
    public List getCurrencyName(){
        Query query = this.entityManager.createNamedQuery("Currency.getAllCurrencyName");
        List<?> list = query.getResultList();
        if(!list.isEmpty()){
            return list;
        }
        return null;
    }
    public List getCurrencySymBol(){
        Query query = this.entityManager.createNamedQuery("Currency.getAllCurrencySymbol");
        List<?> list = query.getResultList();
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
}

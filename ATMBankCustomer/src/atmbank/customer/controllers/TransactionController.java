/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atmbank.customer.controllers;


import atmbank.customer.model.CustomerTransaction;
import javax.persistence.Query;

/**
 *
 * @author Group 4
 */
public class TransactionController extends CommonController{
    public TransactionController(){
        super();
    }
    public int GetSumAmountToDayDeposit(int idAccPri,String TranType){
        int a;
        try{
        Query query = this.entityManager.createNamedQuery("Transaction.SumAmountToDay").setParameter("accID", idAccPri).setParameter("tranType", TranType);               
        a = ((Number)query.getSingleResult()).intValue();
        return a;
        }catch(Exception e){
            return a = 0;
        }
    }
    public int GetCountTransactionToDay(int idAccPri,String TranType){
        int a;
        try{
        Query query = this.entityManager.createNamedQuery("Transaction.countTransactionToDay").setParameter("accID", idAccPri).setParameter("tranType", TranType);               
        a = ((Number)query.getSingleResult()).intValue();
        return a;
        }catch(Exception e){
            return a = 0;
        }
    }
    public void close(){
        if(this.entityManager.getTransaction().isActive()){
            this.entityManager.getTransaction().rollback();
        }
    }
    public void InsertTransaction(CustomerTransaction tbtransaction){
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(tbtransaction);
        this.entityManager.getTransaction().commit();
    }

}

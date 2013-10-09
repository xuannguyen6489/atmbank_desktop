/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atmbank.customer.controllers;


import atmbank.customer.model.Transfer;

/**
 *
 * @author Group 4
 */
public class TransferController extends CommonController{
    public TransferController(){
        super();
    }
    
    public void close(){
        if(this.entityManager.getTransaction().isActive()){
            this.entityManager.getTransaction().rollback();
        }
    }
    public void InsertTransfer(Transfer tbtransfer){
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(tbtransfer);
        this.entityManager.getTransaction().commit();
    }

}

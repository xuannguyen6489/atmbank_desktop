/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atmbank.customer.controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Group 4
 */
public class CommonController {
    
    protected EntityManagerFactory entityManagerFactory;
    protected EntityManager entityManager;
    
    public CommonController(){
        this.entityManagerFactory = Persistence.createEntityManagerFactory("Group4ATMBankCustumerPU");
        this.entityManager = entityManagerFactory.createEntityManager();
    }
    
}

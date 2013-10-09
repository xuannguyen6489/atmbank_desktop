/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atmbank.admin.controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Xuan Nguyen
 */
public class CommonController {
    
    protected EntityManagerFactory entityManagerFactory;
    public EntityManager entityManager;
    
    public CommonController(){
        this.entityManagerFactory = Persistence.createEntityManagerFactory("ATMBank2PU");
        this.entityManager = entityManagerFactory.createEntityManager();
    }
    
}

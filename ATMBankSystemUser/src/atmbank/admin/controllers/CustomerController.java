/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atmbank.admin.controllers;

import atmbank.admin.model.Customer;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Xuan Nguyen
 */
public class CustomerController extends CommonController{
    Customer customer;
    public CustomerController(){
        super();
    }
    public List<Customer> ListAllCustomer(){
        Query query = this.entityManager.createNamedQuery("Customer.findAll");
        List<Customer> list = query.getResultList();
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
    public void AddNewAccount(Customer customer){
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(customer);
        this.entityManager.getTransaction().commit();
    }
    public Customer SearchCustomerByID(int userid){
        return this.entityManager.find(Customer.class,userid);
    }
    public void UpdateCustomer(Customer customer){
        this.entityManager.getTransaction().begin();
        Customer custumerX = SearchCustomerByID(customer.getCustomerID());
        custumerX.setCustomerAddress(customer.getCustomerAddress());
        custumerX.setCustomerDoB(customer.getCustomerDoB());
        custumerX.setCustomerFullName(customer.getCustomerFullName());
        custumerX.setCustomerGender(customer.getCustomerGender());
        custumerX.setCustomerPhone(customer.getCustomerPhone());
        custumerX.setIDCardNo(customer.getIDCardNo());
        this.entityManager.getTransaction().commit(); 
    }
    public boolean CheckIDCardExists(String idcard){
        Query query = this.entityManager.createNamedQuery("Customer.findIdCardNoByIDCardNo").setParameter("iDCardNo", idcard);
        List<?> list = query.getResultList();
        if(list.isEmpty()){
            return true;
        }
        return false;
    }
    public boolean CheckIDCardExistsEdit(String idcard,int idcustomer){
        Query query = this.entityManager.createNamedQuery("Customer.findByIDCardNoEdit").setParameter("iDCardNo", idcard).setParameter("customerID", idcustomer);
        List<?> list = query.getResultList();
        if(list.isEmpty()){
            return true;
        }
        return false;
    }    
    public Customer GetCustomerByCardID(String CardID){
        Query query = this.entityManager.createNamedQuery("Customer.findByIDCardNo").setParameter("iDCardNo", CardID);
        List<Customer> list = query.getResultList();
        if(list.isEmpty()){
            return null;
        }else{
            for(Object obj : list){
                customer = (Customer) obj;
            } 
            return customer;
        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atmbank.admin.controllers;


import atmbank.admin.model.Account;
import atmbank.admin.model.CustomerTransaction;
import atmbank.admin.model.QueryFilter;
import atmbank.admin.model.Transfer;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Xuan Nguyen
 */
public class TransactionController extends CommonController{
    public TransactionController(){
        super();
    }
    public List<CustomerTransaction> GetListTransaction(int accID){
        Query query = this.entityManager.createNamedQuery("Transaction.findTransactionByAccID").setParameter("accID", accID);
        query.setMaxResults(15);
        List<CustomerTransaction> list = query.getResultList();
        if(!list.isEmpty()){
            return list;
        }
        return null;
    
    }
    public List<CustomerTransaction> GetDataFromDateToDate(int accID,String fromDate,String toDate){
        Query query = this.entityManager.createNamedQuery("Transaction.getDataFromDateToDate").setParameter("accID", accID).setParameter("FromDate", fromDate).setParameter("ToDate", toDate);
        List<CustomerTransaction> list = query.getResultList();
        if(!list.isEmpty()){
            return list;
        }
        return null;
    }
    public  boolean SearchAccInTransaction(int idAccPri){
        Query query = this.entityManager.createNamedQuery("Tbtransaction.findIDAccPriInTransaction").setParameter("accID", idAccPri);
        List<?> list = query.getResultList();
        if(list.isEmpty()){
            return true;
        }
        return false;
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
    
    public boolean checkDateTransactionToDay(int idAccpri){
        Query query = this.entityManager.createNamedQuery("Transaction.findDateTransactionToDay").setParameter("accID", idAccpri);
        List<?> list = query.getResultList();
        if(list == null){
            return true;
        }
        return false;
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
    
    public List<CustomerTransaction> getAllTransaction(String type){
        Query query = this.entityManager.createNamedQuery("Transaction.findByTransactionType").setParameter("type", type);
        List<CustomerTransaction> list = query.getResultList();
            if(!list.isEmpty()){
                return list;
            }
        return null;
    }
    public List<Account> getAllAccount(){
        Query query = this.entityManager.createNamedQuery("Transfer.findAll");
        List<Account> list = query.getResultList();
            if(!list.isEmpty()){
                return list;
            }
        return null;
    }
    public List<CustomerTransaction> searchTransaction(QueryFilter filter) {
        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append(" SELECT transaction FROM CustomerTransaction transaction ");
        boolean firstCondition = true;
        if(filter.getDateFrom() != null) {
            if(firstCondition) {
                queryBuilder.append(" WHERE transaction.tranDate >= :dateFrom ");
                firstCondition = false;
            } else {
                queryBuilder.append(" AND transaction.tranDate >= :dateFrom ");
            }       
        }
        
        if(filter.getDateTo() != null) {
            if(firstCondition) {
                queryBuilder.append(" WHERE transaction.tranDate <= :dateTo ");
                firstCondition = false;
            } else {
                queryBuilder.append(" AND transaction.tranDate <= :dateTo ");
            }    
        }
        
        if(!filter.getType().equals("")) {
            if(firstCondition) {
                queryBuilder.append(" WHERE transaction.tranType = :tranT ");
                firstCondition = false;
            } else {
                queryBuilder.append(" AND transaction.tranType = :tranT ");
            }    
        }
        
        String query = queryBuilder.toString();
        
        Query hibernateQuery = this.entityManager.createQuery(query);
        
        //Set parameter
        
        if(filter.getDateFrom() != null) {
            hibernateQuery.setParameter("dateFrom", filter.getDateFrom());  
        }
        
        if(filter.getDateTo() != null) {
            hibernateQuery.setParameter("dateTo", filter.getDateTo());
        }
        
        if(!filter.getType().equals("")) {
            hibernateQuery.setParameter("tranT", filter.getType());
        }
        this.close();
        return hibernateQuery.getResultList();
    }
        //transfer search
    public List<Transfer> getAllTransfers() {
        Query query = this.entityManager.createNamedQuery("Transfer.findAll");
        List<Transfer> list = query.getResultList();
            if(!list.isEmpty()){
                return list;
            }
        return null;
    }
    
    public List<Transfer> searchTransfer(QueryFilter filter){
        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append(" SELECT transfer FROM Transfer transfer");
        boolean firstCondition = true;
        if(filter.getDateFrom() != null){
            if(firstCondition){
                queryBuilder.append(" WHERE transfer.transferdate >= :dateFrom ");
                firstCondition = false;
            }else {
                queryBuilder.append(" AND transfer.transferdate >= :dateFrom ");
            }
        }
        
        if(filter.getDateTo() != null) {
            if(firstCondition) {
                queryBuilder.append(" WHERE transfer.transferdate <= :dateTo ");
                firstCondition = false;
            } else {
                queryBuilder.append(" AND transfer.transferdate <= :dateTo ");
            }    
        }      
        String query = queryBuilder.toString();
        
        Query hibernateQuery = this.entityManager.createQuery(query);
        
        //Set parameter
        
        if(filter.getDateFrom() != null) {
            hibernateQuery.setParameter("dateFrom", filter.getDateFrom());  
        }
        
        if(filter.getDateTo() != null) {
            hibernateQuery.setParameter("dateTo", filter.getDateTo());
        }
        
        this.close();
        return hibernateQuery.getResultList();
    }
}

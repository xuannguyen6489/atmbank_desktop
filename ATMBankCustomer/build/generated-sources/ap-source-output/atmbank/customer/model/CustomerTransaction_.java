package atmbank.customer.model;

import atmbank.customer.model.Account;
import atmbank.customer.model.SystemUser;
import atmbank.customer.model.Transfer;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-10-03T10:37:00")
@StaticMetamodel(CustomerTransaction.class)
public class CustomerTransaction_ { 

    public static volatile SingularAttribute<CustomerTransaction, String> tranReason;
    public static volatile SingularAttribute<CustomerTransaction, Date> tranDate;
    public static volatile CollectionAttribute<CustomerTransaction, Transfer> transferCollection;
    public static volatile SingularAttribute<CustomerTransaction, Double> tranAmount;
    public static volatile SingularAttribute<CustomerTransaction, SystemUser> adminID;
    public static volatile CollectionAttribute<CustomerTransaction, Transfer> transferCollection1;
    public static volatile SingularAttribute<CustomerTransaction, Integer> tranID;
    public static volatile SingularAttribute<CustomerTransaction, Double> tranBalance;
    public static volatile SingularAttribute<CustomerTransaction, String> tranType;
    public static volatile SingularAttribute<CustomerTransaction, Account> accID;

}
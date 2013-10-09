package atmbank.customer.model;

import atmbank.customer.model.Currency;
import atmbank.customer.model.Customer;
import atmbank.customer.model.CustomerTransaction;
import atmbank.customer.model.Transfer;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-10-03T10:37:00")
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile SingularAttribute<Account, Transfer> transfer;
    public static volatile CollectionAttribute<Account, Transfer> transferCollection;
    public static volatile SingularAttribute<Account, String> accNo;
    public static volatile CollectionAttribute<Account, CustomerTransaction> customerTransactionCollection;
    public static volatile SingularAttribute<Account, String> accStatus;
    public static volatile SingularAttribute<Account, String> accStatusReason;
    public static volatile SingularAttribute<Account, Double> accBalance;
    public static volatile SingularAttribute<Account, String> accPIN;
    public static volatile SingularAttribute<Account, Currency> currencyID;
    public static volatile SingularAttribute<Account, Customer> customerID;
    public static volatile SingularAttribute<Account, Integer> accID;

}
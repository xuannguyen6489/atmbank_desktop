package atmbank.customer.model;

import atmbank.customer.model.Account;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-10-03T10:37:00")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, Date> customerDoB;
    public static volatile SingularAttribute<Customer, String> customerGender;
    public static volatile SingularAttribute<Customer, String> iDCardNo;
    public static volatile SingularAttribute<Customer, String> customerFullName;
    public static volatile SingularAttribute<Customer, String> customerAddress;
    public static volatile SingularAttribute<Customer, String> customerStatus;
    public static volatile SingularAttribute<Customer, String> customerStatusReason;
    public static volatile SingularAttribute<Customer, String> customerPhone;
    public static volatile SingularAttribute<Customer, Integer> customerID;
    public static volatile CollectionAttribute<Customer, Account> accountCollection;

}
package atmbank.customer.model;

import atmbank.customer.model.Account;
import atmbank.customer.model.CustomerTransaction;
import atmbank.customer.model.SystemUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-10-03T10:37:00")
@StaticMetamodel(Transfer.class)
public class Transfer_ { 

    public static volatile SingularAttribute<Transfer, Integer> transferID;
    public static volatile SingularAttribute<Transfer, Double> amount;
    public static volatile SingularAttribute<Transfer, SystemUser> adminID;
    public static volatile SingularAttribute<Transfer, Date> transferdate;
    public static volatile SingularAttribute<Transfer, Account> account;
    public static volatile SingularAttribute<Transfer, CustomerTransaction> transactionfromID;
    public static volatile SingularAttribute<Transfer, Integer> accto;
    public static volatile SingularAttribute<Transfer, CustomerTransaction> transactiontoID;
    public static volatile SingularAttribute<Transfer, Account> accfrom;

}
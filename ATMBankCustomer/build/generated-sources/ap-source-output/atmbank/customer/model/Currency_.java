package atmbank.customer.model;

import atmbank.customer.model.Account;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-10-03T10:37:00")
@StaticMetamodel(Currency.class)
public class Currency_ { 

    public static volatile SingularAttribute<Currency, String> currencyName;
    public static volatile SingularAttribute<Currency, String> currencySymbol;
    public static volatile SingularAttribute<Currency, Double> exchangeRate;
    public static volatile SingularAttribute<Currency, Integer> currencyID;
    public static volatile CollectionAttribute<Currency, Account> accountCollection;

}
package atmbank.customer.model;

import atmbank.customer.model.SystemUser;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-10-03T10:37:00")
@StaticMetamodel(UserGroup.class)
public class UserGroup_ { 

    public static volatile SingularAttribute<UserGroup, Integer> groupId;
    public static volatile SingularAttribute<UserGroup, String> groupName;
    public static volatile CollectionAttribute<UserGroup, SystemUser> systemUserCollection;

}
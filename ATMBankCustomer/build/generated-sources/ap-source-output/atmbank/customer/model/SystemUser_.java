package atmbank.customer.model;

import atmbank.customer.model.UserGroup;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-10-03T10:37:00")
@StaticMetamodel(SystemUser.class)
public class SystemUser_ { 

    public static volatile SingularAttribute<SystemUser, String> userAddress;
    public static volatile SingularAttribute<SystemUser, UserGroup> groupId;
    public static volatile SingularAttribute<SystemUser, Integer> userID;
    public static volatile SingularAttribute<SystemUser, String> userGender;
    public static volatile SingularAttribute<SystemUser, Date> userDoB;
    public static volatile SingularAttribute<SystemUser, String> userStatus;
    public static volatile SingularAttribute<SystemUser, String> userPassword;
    public static volatile SingularAttribute<SystemUser, String> userUsername;
    public static volatile SingularAttribute<SystemUser, String> userPhone;
    public static volatile SingularAttribute<SystemUser, String> userEmail;
    public static volatile SingularAttribute<SystemUser, String> userFullName;
    public static volatile SingularAttribute<SystemUser, String> userStatusReason;

}
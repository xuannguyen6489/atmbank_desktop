/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atmbank.admin.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Xuan Nguyen
 */
@Entity
@Table(name = "SystemUser")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SystemUSER.findAll", query = "SELECT s FROM SystemUser s"),
    @NamedQuery(name = "SystemUSER.findAcc", query = "SELECT s FROM SystemUser s WHERE s.userUsername = :userUsername AND s.userPassword = :userPassword AND s.userStatus = :userStatus"),
    @NamedQuery(name = "SystemUSER.findAllUserEnable",query = "SELECT s FROM SystemUser s WHERE s.userStatus = :Enable"),
    @NamedQuery(name = "SystemUSER.findAllUserDisable",query = "SELECT s FROM SystemUser s WHERE s.userStatus = :Disable"),
    @NamedQuery(name = "SystemUSER.findByUserID", query = "SELECT s FROM SystemUser s WHERE s.userID = :userID"),
    @NamedQuery(name = "SystemUSER.findByUserUsername", query = "SELECT s FROM SystemUser s WHERE s.userUsername = :userUsername"),
    @NamedQuery(name = "SystemUSER.findByUserPassword", query = "SELECT s FROM SystemUser s WHERE s.userPassword = :userPassword"),
    @NamedQuery(name = "SystemUSER.findByUserFullName", query = "SELECT s FROM SystemUser s WHERE s.userFullName = :userFullName"),
    @NamedQuery(name = "SystemUSER.findByUserDoB", query = "SELECT s FROM SystemUser s WHERE s.userDoB = :userDoB"),
    @NamedQuery(name = "SystemUSER.findByUserGender", query = "SELECT s FROM SystemUser s WHERE s.userGender = :userGender"),
    @NamedQuery(name = "SystemUSER.findByUserAddress", query = "SELECT s FROM SystemUser s WHERE s.userAddress = :userAddress"),
    @NamedQuery(name = "SystemUSER.findByUserPhone", query = "SELECT s FROM SystemUser s WHERE s.userPhone = :userPhone"),
    @NamedQuery(name = "SystemUSER.findByUserEmail", query = "SELECT s FROM SystemUser s WHERE s.userEmail = :userEmail"),
    @NamedQuery(name = "SystemUSER.findByUserEmailExists", query = "SELECT s FROM SystemUser s WHERE s.userEmail = :userEmail AND s.userID != :userID"),
    @NamedQuery(name = "SystemUSER.findByUserStatus", query = "SELECT s FROM SystemUser s WHERE s.userStatus = :userStatus"),
    @NamedQuery(name = "SystemUSER.findByUserStatusReason", query = "SELECT s FROM SystemUser s WHERE s.userStatusReason = :userStatusReason")})
public class SystemUser implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment") 
    @Basic(optional = false)
    @Column(name = "User_ID")
    private Integer userID;
    @Basic(optional = false)
    @Column(name = "User_Username")
    private String userUsername;
    @Basic(optional = false)
    @Column(name = "User_Password")
    private String userPassword;
    @Column(name = "User_FullName")
    private String userFullName;
    @Column(name = "User_DoB")
    @Temporal(TemporalType.TIMESTAMP)
    private Date userDoB;
    @Column(name = "User_Gender")
    private String userGender;
    @Column(name = "User_Address")
    private String userAddress;
    @Column(name = "User_Phone")
    private String userPhone;
    @Column(name = "User_Email")
    private String userEmail;
    @Basic(optional = false)
    @Column(name = "User_Status")
    private String userStatus;
    @Column(name = "User_Status_Reason")
    private String userStatusReason;
    @JoinColumn(name = "Group_Id", referencedColumnName = "Group_Id")
    @ManyToOne
    private UserGroup groupId;
    @OneToMany(mappedBy = "adminID")
    private Collection<CustomerTransaction> customerTransactionCollection;
    @OneToMany(mappedBy = "adminID")
    private Collection<Transfer> transferCollection;

    public SystemUser() {
    }

    public SystemUser(Integer userID) {
        this.userID = userID;
    }

    public SystemUser(Integer userID, String userUsername, String userPassword, String userStatus) {
        this.userID = userID;
        this.userUsername = userUsername;
        this.userPassword = userPassword;
        this.userStatus = userStatus;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public Date getUserDoB() {
        return userDoB;
    }

    public void setUserDoB(Date userDoB) {
        this.userDoB = userDoB;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserStatusReason() {
        return userStatusReason;
    }

    public void setUserStatusReason(String userStatusReason) {
        this.userStatusReason = userStatusReason;
    }

    public UserGroup getGroupId() {
        return groupId;
    }

    public void setGroupId(UserGroup groupId) {
        this.groupId = groupId;
    }

    @XmlTransient
    public Collection<CustomerTransaction> getCustomerTransactionCollection() {
        return customerTransactionCollection;
    }

    public void setCustomerTransactionCollection(Collection<CustomerTransaction> customerTransactionCollection) {
        this.customerTransactionCollection = customerTransactionCollection;
    }

    @XmlTransient
    public Collection<Transfer> getTransferCollection() {
        return transferCollection;
    }

    public void setTransferCollection(Collection<Transfer> transferCollection) {
        this.transferCollection = transferCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userID != null ? userID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SystemUser)) {
            return false;
        }
        SystemUser other = (SystemUser) object;
        if ((this.userID == null && other.userID != null) || (this.userID != null && !this.userID.equals(other.userID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "atmbank.admin.view.model.SystemUser[ userID=" + userID + " ]";
    }
    
}

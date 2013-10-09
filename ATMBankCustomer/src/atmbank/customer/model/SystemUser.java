/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atmbank.customer.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Group 4
 */
@Entity
@Table(name = "SystemUser")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SystemUser.findAll", query = "SELECT s FROM SystemUser s"),
    @NamedQuery(name = "SystemUser.findByUserID", query = "SELECT s FROM SystemUser s WHERE s.userID = :userID"),
    @NamedQuery(name = "SystemUser.findByUserUsername", query = "SELECT s FROM SystemUser s WHERE s.userUsername = :userUsername"),
    @NamedQuery(name = "SystemUser.findByUserPassword", query = "SELECT s FROM SystemUser s WHERE s.userPassword = :userPassword"),
    @NamedQuery(name = "SystemUser.findByUserFullName", query = "SELECT s FROM SystemUser s WHERE s.userFullName = :userFullName"),
    @NamedQuery(name = "SystemUser.findByUserDoB", query = "SELECT s FROM SystemUser s WHERE s.userDoB = :userDoB"),
    @NamedQuery(name = "SystemUser.findByUserGender", query = "SELECT s FROM SystemUser s WHERE s.userGender = :userGender"),
    @NamedQuery(name = "SystemUser.findByUserAddress", query = "SELECT s FROM SystemUser s WHERE s.userAddress = :userAddress"),
    @NamedQuery(name = "SystemUser.findByUserPhone", query = "SELECT s FROM SystemUser s WHERE s.userPhone = :userPhone"),
    @NamedQuery(name = "SystemUser.findByUserEmail", query = "SELECT s FROM SystemUser s WHERE s.userEmail = :userEmail"),
    @NamedQuery(name = "SystemUser.findByUserStatus", query = "SELECT s FROM SystemUser s WHERE s.userStatus = :userStatus"),
    @NamedQuery(name = "SystemUser.findByUserStatusReason", query = "SELECT s FROM SystemUser s WHERE s.userStatusReason = :userStatusReason")})
public class SystemUser implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
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
        return "atmbank.customer.model.SystemUser[ userID=" + userID + " ]";
    }
    
}

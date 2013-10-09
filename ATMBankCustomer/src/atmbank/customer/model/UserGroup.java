/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atmbank.customer.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Group 4
 */
@Entity
@Table(name = "User_Group")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserGroup.findAll", query = "SELECT u FROM UserGroup u"),
    @NamedQuery(name = "UserGroup.findByGroupId", query = "SELECT u FROM UserGroup u WHERE u.groupId = :groupId"),
    @NamedQuery(name = "UserGroup.findByGroupName", query = "SELECT u FROM UserGroup u WHERE u.groupName = :groupName")})
public class UserGroup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Group_Id")
    private Integer groupId;
    @Basic(optional = false)
    @Column(name = "Group_Name")
    private String groupName;
    @OneToMany(mappedBy = "groupId")
    private Collection<SystemUser> systemUserCollection;

    public UserGroup() {
    }

    public UserGroup(Integer groupId) {
        this.groupId = groupId;
    }

    public UserGroup(Integer groupId, String groupName) {
        this.groupId = groupId;
        this.groupName = groupName;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @XmlTransient
    public Collection<SystemUser> getSystemUserCollection() {
        return systemUserCollection;
    }

    public void setSystemUserCollection(Collection<SystemUser> systemUserCollection) {
        this.systemUserCollection = systemUserCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (groupId != null ? groupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserGroup)) {
            return false;
        }
        UserGroup other = (UserGroup) object;
        if ((this.groupId == null && other.groupId != null) || (this.groupId != null && !this.groupId.equals(other.groupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "atmbank.customer.model.UserGroup[ groupId=" + groupId + " ]";
    }
    
}

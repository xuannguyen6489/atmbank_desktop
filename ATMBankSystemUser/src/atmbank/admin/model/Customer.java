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
@Table(name = "Customer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c"),
    @NamedQuery(name = "Customer.findIdCardNoByIDCardNo", query = "SELECT c.iDCardNo FROM Customer c WHERE c.iDCardNo = :iDCardNo"),
    @NamedQuery(name = "Customer.findByCustomerID", query = "SELECT c FROM Customer c WHERE c.customerID = :customerID"),
    @NamedQuery(name = "Customer.findByIDCardNo", query = "SELECT c FROM Customer c WHERE c.iDCardNo = :iDCardNo"),
    @NamedQuery(name = "Customer.findByIDCardNoEdit", query = "SELECT c FROM Customer c WHERE c.iDCardNo = :iDCardNo AND c.customerID != :customerID"),
    @NamedQuery(name = "Customer.findByCustomerFullName", query = "SELECT c FROM Customer c WHERE c.customerFullName = :customerFullName"),
    @NamedQuery(name = "Customer.findByCustomerDoB", query = "SELECT c FROM Customer c WHERE c.customerDoB = :customerDoB"),
    @NamedQuery(name = "Customer.findByCustomerGender", query = "SELECT c FROM Customer c WHERE c.customerGender = :customerGender"),
    @NamedQuery(name = "Customer.findByCustomerPhone", query = "SELECT c FROM Customer c WHERE c.customerPhone = :customerPhone"),
    @NamedQuery(name = "Customer.findByCustomerAddress", query = "SELECT c FROM Customer c WHERE c.customerAddress = :customerAddress"),
    @NamedQuery(name = "Customer.findByCustomerStatus", query = "SELECT c FROM Customer c WHERE c.customerStatus = :customerStatus"),
    @NamedQuery(name = "Customer.findByCustomerStatusReason", query = "SELECT c FROM Customer c WHERE c.customerStatusReason = :customerStatusReason")})
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
        @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment") 
    @Basic(optional = false)
    @Column(name = "Customer_ID")
    private Integer customerID;
    @Column(name = "ID_Card_No")
    private String iDCardNo;
    @Column(name = "Customer_FullName")
    private String customerFullName;
    @Column(name = "Customer_DoB")
    @Temporal(TemporalType.TIMESTAMP)
    private Date customerDoB;
    @Column(name = "Customer_Gender")
    private String customerGender;
    @Column(name = "Customer_Phone")
    private String customerPhone;
    @Column(name = "Customer_Address")
    private String customerAddress;
    @Column(name = "Customer_Status")
    private String customerStatus;
    @Column(name = "Customer_Status_Reason")
    private String customerStatusReason;
    @OneToMany(mappedBy = "customerID")
    private Collection<Account> accountCollection;

    public Customer() {
    }

    public Customer(Integer customerID) {
        this.customerID = customerID;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public String getIDCardNo() {
        return iDCardNo;
    }

    public void setIDCardNo(String iDCardNo) {
        this.iDCardNo = iDCardNo;
    }

    public String getCustomerFullName() {
        return customerFullName;
    }

    public void setCustomerFullName(String customerFullName) {
        this.customerFullName = customerFullName;
    }

    public Date getCustomerDoB() {
        return customerDoB;
    }

    public void setCustomerDoB(Date customerDoB) {
        this.customerDoB = customerDoB;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus;
    }

    public String getCustomerStatusReason() {
        return customerStatusReason;
    }

    public void setCustomerStatusReason(String customerStatusReason) {
        this.customerStatusReason = customerStatusReason;
    }

    @XmlTransient
    public Collection<Account> getAccountCollection() {
        return accountCollection;
    }

    public void setAccountCollection(Collection<Account> accountCollection) {
        this.accountCollection = accountCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerID != null ? customerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.customerID == null && other.customerID != null) || (this.customerID != null && !this.customerID.equals(other.customerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "atmbank.admin.view.model.Customer[ customerID=" + customerID + " ]";
    }
    
}

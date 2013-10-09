/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atmbank.admin.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Xuan Nguyen
 */
@Entity
@Table(name = "Account")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Account.findAll", query = "SELECT a FROM Account a"),
    @NamedQuery(name = "Account.findAllAccNo", query = "SELECT a.accNo FROM Account a"),
    @NamedQuery(name = "Account.getBalanceAccByID" , query = "SELECT a.accBalance FROM Account a WHERE a.accID = :accID"),
    @NamedQuery(name = "Account.findByAccID", query = "SELECT a FROM Account a WHERE a.accID = :accID"),
    @NamedQuery(name = "Account.findByAccNo", query = "SELECT a FROM Account a WHERE a.accNo = :accNo"),
    @NamedQuery(name = "Account.ListAccByAccNo", query = "SELECT a FROM Account a WHERE a.customerID.iDCardNo = :iDCardNo"),
    @NamedQuery(name = "Account.findAccNoByAccNo", query = "SELECT a.accNo FROM Account a WHERE a.accNo = :accNo"),
    @NamedQuery(name = "Account.findByAccPIN", query = "SELECT a FROM Account a WHERE a.accPIN = :accPIN"),
    @NamedQuery(name = "Account.findByAccBalance", query = "SELECT a FROM Account a WHERE a.accBalance = :accBalance"),
    @NamedQuery(name = "Account.findByAccStatus", query = "SELECT a FROM Account a WHERE a.accStatus = :accStatus"),
    @NamedQuery(name = "Account.findByAccStatusReason", query = "SELECT a FROM Account a WHERE a.accStatusReason = :accStatusReason")})
public class Account implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment") 
    @Basic(optional = false)
    @Column(name = "Acc_ID")
    private Integer accID;
    @Column(name = "Acc_No")
    private String accNo;
    @Basic(optional = false)
    @Column(name = "Acc_PIN")
    private String accPIN;
    @Basic(optional = false)
    @Column(name = "Acc_Balance")
    private double accBalance;
    @Column(name = "Acc_Status")
    private String accStatus;
    @Column(name = "Acc_Status_Reason")
    private String accStatusReason;
    @JoinColumn(name = "Customer_ID", referencedColumnName = "Customer_ID")
    @ManyToOne
    private Customer customerID;
    @JoinColumn(name = "Currency_ID", referencedColumnName = "Currency_ID")
    @ManyToOne
    private Currency currencyID;
    @OneToMany(mappedBy = "accID")
    private Collection<CustomerTransaction> customerTransactionCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "account")
    private Transfer transfer;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accfrom")
    private Collection<Transfer> transferCollection;

    public Account() {
    }

    public Account(Integer accID) {
        this.accID = accID;
    }

    public Account(Integer accID, String accPIN, double accBalance) {
        this.accID = accID;
        this.accPIN = accPIN;
        this.accBalance = accBalance;
    }

    public Integer getAccID() {
        return accID;
    }

    public void setAccID(Integer accID) {
        this.accID = accID;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getAccPIN() {
        return accPIN;
    }

    public void setAccPIN(String accPIN) {
        this.accPIN = accPIN;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public String getAccStatus() {
        return accStatus;
    }

    public void setAccStatus(String accStatus) {
        this.accStatus = accStatus;
    }

    public String getAccStatusReason() {
        return accStatusReason;
    }

    public void setAccStatusReason(String accStatusReason) {
        this.accStatusReason = accStatusReason;
    }

    public Customer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Customer customerID) {
        this.customerID = customerID;
    }

    public Currency getCurrencyID() {
        return currencyID;
    }

    public void setCurrencyID(Currency currencyID) {
        this.currencyID = currencyID;
    }

    @XmlTransient
    public Collection<CustomerTransaction> getCustomerTransactionCollection() {
        return customerTransactionCollection;
    }

    public void setCustomerTransactionCollection(Collection<CustomerTransaction> customerTransactionCollection) {
        this.customerTransactionCollection = customerTransactionCollection;
    }

    public Transfer getTransfer() {
        return transfer;
    }

    public void setTransfer(Transfer transfer) {
        this.transfer = transfer;
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
        hash += (accID != null ? accID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Account)) {
            return false;
        }
        Account other = (Account) object;
        if ((this.accID == null && other.accID != null) || (this.accID != null && !this.accID.equals(other.accID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "atmbank.admin.view.model.Account[ accID=" + accID + " ]";
    }
}

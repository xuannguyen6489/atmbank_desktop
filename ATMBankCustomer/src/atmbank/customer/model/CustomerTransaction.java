/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atmbank.customer.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Group 4
 */
@Entity
@Table(name = "CustomerTransaction")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CustomerTransaction.findAll", query = "SELECT c FROM CustomerTransaction c"),
    @NamedQuery(name = "Transaction.countTransactionToDay", query = "SELECT COUNT(t) FROM CustomerTransaction t WHERE t.accID.accID = :accID AND t.tranType = :tranType AND CONVERT(varchar(10),getdate(),126) LIKE CONVERT(varchar(10),t.tranDate,126)"),
    @NamedQuery(name = "Transaction.SumAmountToDay", query = "SELECT SUM(t.tranAmount) FROM CustomerTransaction t WHERE t.accID.accID = :accID AND t.tranType = :tranType AND CONVERT(varchar(10),getdate(),126) LIKE CONVERT(varchar(10),t.tranDate,126)"),
    @NamedQuery(name = "CustomerTransaction.findByTranID", query = "SELECT c FROM CustomerTransaction c WHERE c.tranID = :tranID"),
    @NamedQuery(name = "CustomerTransaction.findByTranType", query = "SELECT c FROM CustomerTransaction c WHERE c.tranType = :tranType"),
    @NamedQuery(name = "CustomerTransaction.findByTranAmount", query = "SELECT c FROM CustomerTransaction c WHERE c.tranAmount = :tranAmount"),
    @NamedQuery(name = "CustomerTransaction.findByTranBalance", query = "SELECT c FROM CustomerTransaction c WHERE c.tranBalance = :tranBalance"),
    @NamedQuery(name = "CustomerTransaction.findByTranDate", query = "SELECT c FROM CustomerTransaction c WHERE c.tranDate = :tranDate")})
public class CustomerTransaction implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment") 
    @Basic(optional = false)
    @Column(name = "Tran_ID")
    private Integer tranID;
    @Basic(optional = false)
    @Column(name = "Tran_Type")
    private String tranType;
    @Basic(optional = false)
    @Column(name = "Tran_Amount")
    private double tranAmount;
    @Basic(optional = false)
    @Column(name = "Tran_Balance")
    private double tranBalance;
    @Lob
    @Column(name = "Tran_Reason")
    private String tranReason;
    @Column(name = "Tran_Date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tranDate;
    @JoinColumn(name = "Admin_ID", referencedColumnName = "User_ID")
    @ManyToOne
    private SystemUser adminID;
    @JoinColumn(name = "Acc_ID", referencedColumnName = "Acc_ID")
    @ManyToOne
    private Account accID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "transactiontoID")
    private Collection<Transfer> transferCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "transactionfromID")
    private Collection<Transfer> transferCollection1;

    public CustomerTransaction() {
    }
    @PrePersist
    protected void onCreate(){
        this.tranDate = new Date();
    }
    public CustomerTransaction(Integer tranID) {
        this.tranID = tranID;
    }
 
    public CustomerTransaction(Integer tranID, String tranType, double tranAmount, double tranBalance) {
        this.tranID = tranID;
        this.tranType = tranType;
        this.tranAmount = tranAmount;
        this.tranBalance = tranBalance;
    }

    public Integer getTranID() {
        return tranID;
    }

    public void setTranID(Integer tranID) {
        this.tranID = tranID;
    }

    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType;
    }

    public double getTranAmount() {
        return tranAmount;
    }

    public void setTranAmount(double tranAmount) {
        this.tranAmount = tranAmount;
    }

    public double getTranBalance() {
        return tranBalance;
    }

    public void setTranBalance(double tranBalance) {
        this.tranBalance = tranBalance;
    }

    public String getTranReason() {
        return tranReason;
    }

    public void setTranReason(String tranReason) {
        this.tranReason = tranReason;
    }

    public Date getTranDate() {
        return tranDate;
    }

    public void setTranDate(Date tranDate) {
        this.tranDate = tranDate;
    }

    public SystemUser getAdminID() {
        return adminID;
    }

    public void setAdminID(SystemUser adminID) {
        this.adminID = adminID;
    }

    public Account getAccID() {
        return accID;
    }

    public void setAccID(Account accID) {
        this.accID = accID;
    }

    @XmlTransient
    public Collection<Transfer> getTransferCollection() {
        return transferCollection;
    }

    public void setTransferCollection(Collection<Transfer> transferCollection) {
        this.transferCollection = transferCollection;
    }

    @XmlTransient
    public Collection<Transfer> getTransferCollection1() {
        return transferCollection1;
    }

    public void setTransferCollection1(Collection<Transfer> transferCollection1) {
        this.transferCollection1 = transferCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tranID != null ? tranID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomerTransaction)) {
            return false;
        }
        CustomerTransaction other = (CustomerTransaction) object;
        if ((this.tranID == null && other.tranID != null) || (this.tranID != null && !this.tranID.equals(other.tranID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "atmbank.customer.model.CustomerTransaction[ tranID=" + tranID + " ]";
    }
    
}

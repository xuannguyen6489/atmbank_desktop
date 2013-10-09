/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atmbank.admin.model;

import java.io.Serializable;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Xuan Nguyen
 */
@Entity
@Table(name = "Transfer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transfer.findAll", query = "SELECT t FROM Transfer t"),
    @NamedQuery(name = "Transfer.findByTransferID", query = "SELECT t FROM Transfer t WHERE t.transferID = :transferID"),
    @NamedQuery(name = "Transfer.findByAccto", query = "SELECT t FROM Transfer t WHERE t.accto = :accto"),
    @NamedQuery(name = "Transfer.findByAmount", query = "SELECT t FROM Transfer t WHERE t.amount = :amount"),
    @NamedQuery(name = "Transfer.findByTransferdate", query = "SELECT t FROM Transfer t WHERE t.transferdate = :transferdate")})
public class Transfer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment") 
    @Basic(optional = false)
    @Column(name = "Transfer_ID")
    private Integer transferID;
    @Basic(optional = false)
    @Column(name = "Acc_to")
    private int accto;
    @Basic(optional = false)
    @Column(name = "Amount")
    private double amount;
    @Basic(optional = false)
    @Column(name = "Transfer_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transferdate;
    @JoinColumn(name = "Admin_ID", referencedColumnName = "User_ID")
    @ManyToOne
    private SystemUser adminID;
    @JoinColumn(name = "Transaction_to_ID", referencedColumnName = "Tran_ID")
    @ManyToOne(optional = false)
    private CustomerTransaction transactiontoID;
    @JoinColumn(name = "Transaction_from_ID", referencedColumnName = "Tran_ID")
    @ManyToOne(optional = false)
    private CustomerTransaction transactionfromID;
    @JoinColumn(name = "Transfer_ID", referencedColumnName = "Acc_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Account account;
    @JoinColumn(name = "Acc_from", referencedColumnName = "Acc_ID")
    @ManyToOne(optional = false)
    private Account accfrom;

    public Transfer() {
    }

    public Transfer(Integer transferID) {
        this.transferID = transferID;
    }

    public Transfer(Integer transferID, int accto, double amount, Date transferdate) {
        this.transferID = transferID;
        this.accto = accto;
        this.amount = amount;
        this.transferdate = transferdate;
    }

    public Integer getTransferID() {
        return transferID;
    }

    public void setTransferID(Integer transferID) {
        this.transferID = transferID;
    }

    public int getAccto() {
        return accto;
    }

    public void setAccto(int accto) {
        this.accto = accto;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getTransferdate() {
        return transferdate;
    }

    public void setTransferdate(Date transferdate) {
        this.transferdate = transferdate;
    }

    public SystemUser getAdminID() {
        return adminID;
    }

    public void setAdminID(SystemUser adminID) {
        this.adminID = adminID;
    }

    public CustomerTransaction getTransactiontoID() {
        return transactiontoID;
    }

    public void setTransactiontoID(CustomerTransaction transactiontoID) {
        this.transactiontoID = transactiontoID;
    }

    public CustomerTransaction getTransactionfromID() {
        return transactionfromID;
    }

    public void setTransactionfromID(CustomerTransaction transactionfromID) {
        this.transactionfromID = transactionfromID;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccfrom() {
        return accfrom;
    }

    public void setAccfrom(Account accfrom) {
        this.accfrom = accfrom;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transferID != null ? transferID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transfer)) {
            return false;
        }
        Transfer other = (Transfer) object;
        if ((this.transferID == null && other.transferID != null) || (this.transferID != null && !this.transferID.equals(other.transferID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "atmbank.admin.view.model.Transfer[ transferID=" + transferID + " ]";
    }
    
}

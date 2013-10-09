/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atmbank.customer.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Group 4
 */
@Entity
@Table(name = "BankInfo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BankInfo.findAll", query = "SELECT b FROM BankInfo b"),
    @NamedQuery(name = "BankInfo.findByBankID", query = "SELECT b FROM BankInfo b WHERE b.bankID = :bankID"),
    @NamedQuery(name = "BankInfo.findByBankName", query = "SELECT b FROM BankInfo b WHERE b.bankName = :bankName"),
    @NamedQuery(name = "BankInfo.findByBankAddress", query = "SELECT b FROM BankInfo b WHERE b.bankAddress = :bankAddress"),
    @NamedQuery(name = "BankInfo.findByBankPhone", query = "SELECT b FROM BankInfo b WHERE b.bankPhone = :bankPhone"),
    @NamedQuery(name = "BankInfo.findByBankFax", query = "SELECT b FROM BankInfo b WHERE b.bankFax = :bankFax")})
public class BankInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Bank_ID")
    private Integer bankID;
    @Basic(optional = false)
    @Column(name = "Bank_Name")
    private String bankName;
    @Basic(optional = false)
    @Column(name = "Bank_Address")
    private String bankAddress;
    @Column(name = "Bank_Phone")
    private String bankPhone;
    @Column(name = "Bank_Fax")
    private String bankFax;

    public BankInfo() {
    }

    public BankInfo(Integer bankID) {
        this.bankID = bankID;
    }

    public BankInfo(Integer bankID, String bankName, String bankAddress) {
        this.bankID = bankID;
        this.bankName = bankName;
        this.bankAddress = bankAddress;
    }

    public Integer getBankID() {
        return bankID;
    }

    public void setBankID(Integer bankID) {
        this.bankID = bankID;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public String getBankPhone() {
        return bankPhone;
    }

    public void setBankPhone(String bankPhone) {
        this.bankPhone = bankPhone;
    }

    public String getBankFax() {
        return bankFax;
    }

    public void setBankFax(String bankFax) {
        this.bankFax = bankFax;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bankID != null ? bankID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BankInfo)) {
            return false;
        }
        BankInfo other = (BankInfo) object;
        if ((this.bankID == null && other.bankID != null) || (this.bankID != null && !this.bankID.equals(other.bankID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "atmbank.customer.model.BankInfo[ bankID=" + bankID + " ]";
    }
    
}

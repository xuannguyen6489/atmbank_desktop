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
@Table(name = "Currency")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Currency.findAll", query = "SELECT c FROM Currency c"),
    @NamedQuery(name = "Currency.findByCurrencyID", query = "SELECT c FROM Currency c WHERE c.currencyID = :currencyID"),
    @NamedQuery(name = "Currency.findByCurrencySymbol", query = "SELECT c FROM Currency c WHERE c.currencySymbol = :currencySymbol"),
    @NamedQuery(name = "Currency.findByCurrencyName", query = "SELECT c FROM Currency c WHERE c.currencyName = :currencyName"),
    @NamedQuery(name = "Currency.findByExchangeRate", query = "SELECT c FROM Currency c WHERE c.exchangeRate = :exchangeRate")})
public class Currency implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Currency_ID")
    private Integer currencyID;
    @Column(name = "Currency_Symbol")
    private String currencySymbol;
    @Column(name = "Currency_Name")
    private String currencyName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Exchange_Rate")
    private Double exchangeRate;
    @OneToMany(mappedBy = "currencyID")
    private Collection<Account> accountCollection;

    public Currency() {
    }

    public Currency(Integer currencyID) {
        this.currencyID = currencyID;
    }

    public Integer getCurrencyID() {
        return currencyID;
    }

    public void setCurrencyID(Integer currencyID) {
        this.currencyID = currencyID;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public Double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
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
        hash += (currencyID != null ? currencyID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Currency)) {
            return false;
        }
        Currency other = (Currency) object;
        if ((this.currencyID == null && other.currencyID != null) || (this.currencyID != null && !this.currencyID.equals(other.currencyID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "atmbank.customer.model.Currency[ currencyID=" + currencyID + " ]";
    }
    
}

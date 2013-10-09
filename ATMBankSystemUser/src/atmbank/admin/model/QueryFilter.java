/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atmbank.admin.model;

import java.util.Date;

/**
 *
 * @author Xuan Nguyen
 */
public class QueryFilter {

    private Date dateFrom;
    private Date dateTo;
    private String stringFrom;
    private String stringTo;
    private Integer intFrom;
    private Integer intTo;
    private Double doubleFrom;
    private Double doubleTo;
    private String type = "";

    public QueryFilter() {
    }

    public QueryFilter(Date dateFrom, Date dateTo, String stringFrom, String stringTo, Integer intFrom, Integer intTo, Double doubleFrom, Double doubleTo) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.stringFrom = stringFrom;
        this.stringTo = stringTo;
        this.intFrom = intFrom;
        this.intTo = intTo;
        this.doubleFrom = doubleFrom;
        this.doubleTo = doubleTo;
    }

    
    /**
     * @return the dateFrom
     */
    public Date getDateFrom() {
        return dateFrom;
    }

    /**
     * @param dateFrom the dateFrom to set
     */
    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    /**
     * @return the dateTo
     */
    public Date getDateTo() {
        return dateTo;
    }

    /**
     * @param dateTo the dateTo to set
     */
    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    /**
     * @return the stringFrom
     */
    public String getStringFrom() {
        return stringFrom;
    }

    /**
     * @param stringFrom the stringFrom to set
     */
    public void setStringFrom(String stringFrom) {
        this.stringFrom = stringFrom;
    }

    /**
     * @return the stringTo
     */
    public String getStringTo() {
        return stringTo;
    }

    /**
     * @param stringTo the stringTo to set
     */
    public void setStringTo(String stringTo) {
        this.stringTo = stringTo;
    }

    /**
     * @return the intFrom
     */
    public Integer getIntFrom() {
        return intFrom;
    }

    /**
     * @param intFrom the intFrom to set
     */
    public void setIntFrom(Integer intFrom) {
        this.intFrom = intFrom;
    }

    /**
     * @return the intTo
     */
    public Integer getIntTo() {
        return intTo;
    }

    /**
     * @param intTo the intTo to set
     */
    public void setIntTo(Integer intTo) {
        this.intTo = intTo;
    }

    /**
     * @return the doubleFrom
     */
    public Double getDoubleFrom() {
        return doubleFrom;
    }

    /**
     * @param doubleFrom the doubleFrom to set
     */
    public void setDoubleFrom(Double doubleFrom) {
        this.doubleFrom = doubleFrom;
    }

    /**
     * @return the doubleTo
     */
    public Double getDoubleTo() {
        return doubleTo;
    }

    /**
     * @param doubleTo the doubleTo to set
     */
    public void setDoubleTo(Double doubleTo) {
        this.doubleTo = doubleTo;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    
}

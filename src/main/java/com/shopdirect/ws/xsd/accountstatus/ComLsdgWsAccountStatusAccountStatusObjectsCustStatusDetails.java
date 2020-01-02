//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.02 at 03:22:26 PM IST 
//


package com.shopdirect.ws.xsd.accountstatus;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for com.lsdg.ws.AccountStatus.AccountStatusObjects.CustStatusDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.lsdg.ws.AccountStatus.AccountStatusObjects.CustStatusDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountStatusType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="accountStatusDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountStatusInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.lsdg.ws.AccountStatus.AccountStatusObjects.CustStatusDetails", propOrder = {
    "accountStatusType",
    "accountStatusDescription",
    "accountStatusInd"
})
public class ComLsdgWsAccountStatusAccountStatusObjectsCustStatusDetails {

    @XmlElement(required = true)
    protected BigInteger accountStatusType;
    @XmlElement(required = true)
    protected String accountStatusDescription;
    protected boolean accountStatusInd;

    /**
     * Gets the value of the accountStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccountStatusType() {
        return accountStatusType;
    }

    /**
     * Sets the value of the accountStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccountStatusType(BigInteger value) {
        this.accountStatusType = value;
    }

    /**
     * Gets the value of the accountStatusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStatusDescription() {
        return accountStatusDescription;
    }

    /**
     * Sets the value of the accountStatusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatusDescription(String value) {
        this.accountStatusDescription = value;
    }

    /**
     * Gets the value of the accountStatusInd property.
     * 
     */
    public boolean isAccountStatusInd() {
        return accountStatusInd;
    }

    /**
     * Sets the value of the accountStatusInd property.
     * 
     */
    public void setAccountStatusInd(boolean value) {
        this.accountStatusInd = value;
    }

}

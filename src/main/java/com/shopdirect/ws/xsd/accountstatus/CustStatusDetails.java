//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.01 at 10:01:28 PM IST 
//


package com.shopdirect.ws.xsd.accountstatus;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for custStatusDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="custStatusDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="com.lsdg.ws.AccountStatus.AccountStatusObjects.CustStatusDetails" type="{http://ws.shopdirect.com/xsd/AccountStatus}com.lsdg.ws.AccountStatus.AccountStatusObjects.CustStatusDetails" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "custStatusDetails", propOrder = {
    "comLsdgWsAccountStatusAccountStatusObjectsCustStatusDetails"
})
public class CustStatusDetails {

    @XmlElement(name = "com.lsdg.ws.AccountStatus.AccountStatusObjects.CustStatusDetails", required = true)
    protected List<ComLsdgWsAccountStatusAccountStatusObjectsCustStatusDetails> comLsdgWsAccountStatusAccountStatusObjectsCustStatusDetails;

    /**
     * Gets the value of the comLsdgWsAccountStatusAccountStatusObjectsCustStatusDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comLsdgWsAccountStatusAccountStatusObjectsCustStatusDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComLsdgWsAccountStatusAccountStatusObjectsCustStatusDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComLsdgWsAccountStatusAccountStatusObjectsCustStatusDetails }
     * 
     * 
     */
    public List<ComLsdgWsAccountStatusAccountStatusObjectsCustStatusDetails> getComLsdgWsAccountStatusAccountStatusObjectsCustStatusDetails() {
        if (comLsdgWsAccountStatusAccountStatusObjectsCustStatusDetails == null) {
            comLsdgWsAccountStatusAccountStatusObjectsCustStatusDetails = new ArrayList<ComLsdgWsAccountStatusAccountStatusObjectsCustStatusDetails>();
        }
        return this.comLsdgWsAccountStatusAccountStatusObjectsCustStatusDetails;
    }

	public void setComLsdgWsAccountStatusAccountStatusObjectsCustStatusDetails(
			List<ComLsdgWsAccountStatusAccountStatusObjectsCustStatusDetails> comLsdgWsAccountStatusAccountStatusObjectsCustStatusDetails) {
		this.comLsdgWsAccountStatusAccountStatusObjectsCustStatusDetails = comLsdgWsAccountStatusAccountStatusObjectsCustStatusDetails;
	}

}

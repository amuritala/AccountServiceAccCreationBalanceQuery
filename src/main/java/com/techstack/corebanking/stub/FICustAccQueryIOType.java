
package com.techstack.corebanking.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FICustAcc-Query-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FICustAcc-Query-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CUST_NO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ACCESS_GROUP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FICustAcc-Query-IO-Type", propOrder = {
    "custno",
    "accessgroup"
})
public class FICustAccQueryIOType {

    @XmlElement(name = "CUST_NO", required = true)
    protected String custno;
    @XmlElement(name = "ACCESS_GROUP")
    protected String accessgroup;

    /**
     * Gets the value of the custno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTNO() {
        return custno;
    }

    /**
     * Sets the value of the custno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTNO(String value) {
        this.custno = value;
    }

    /**
     * Gets the value of the accessgroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCESSGROUP() {
        return accessgroup;
    }

    /**
     * Sets the value of the accessgroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCESSGROUP(String value) {
        this.accessgroup = value;
    }

}

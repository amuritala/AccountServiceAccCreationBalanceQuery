
package com.techstack.corebanking.stub;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustAccVal-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustAccVal-Full-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CUST_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BRN_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DCINDICATOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EXTERNAL_REF_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MCY_DEFAULT_FLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CHILD_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CHILD_ACCOUNT_CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustAccVal-Full-Type", propOrder = {
    "custacno",
    "brncode",
    "ccy",
    "dcindicator",
    "externalrefno",
    "mcydefaultflg",
    "childaccount",
    "childaccountccy",
    "amount"
})
public class CustAccValFullType {

    @XmlElement(name = "CUST_AC_NO", required = true)
    protected String custacno;
    @XmlElement(name = "BRN_CODE", required = true)
    protected String brncode;
    @XmlElement(name = "CCY")
    protected String ccy;
    @XmlElement(name = "DCINDICATOR")
    protected String dcindicator;
    @XmlElement(name = "EXTERNAL_REF_NO")
    protected String externalrefno;
    @XmlElement(name = "MCY_DEFAULT_FLG")
    protected String mcydefaultflg;
    @XmlElement(name = "CHILD_ACCOUNT")
    protected String childaccount;
    @XmlElement(name = "CHILD_ACCOUNT_CCY")
    protected String childaccountccy;
    @XmlElement(name = "AMOUNT")
    protected BigDecimal amount;

    /**
     * Gets the value of the custacno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTACNO() {
        return custacno;
    }

    /**
     * Sets the value of the custacno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTACNO(String value) {
        this.custacno = value;
    }

    /**
     * Gets the value of the brncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRNCODE() {
        return brncode;
    }

    /**
     * Sets the value of the brncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRNCODE(String value) {
        this.brncode = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCY() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCY(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the dcindicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCINDICATOR() {
        return dcindicator;
    }

    /**
     * Sets the value of the dcindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCINDICATOR(String value) {
        this.dcindicator = value;
    }

    /**
     * Gets the value of the externalrefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTERNALREFNO() {
        return externalrefno;
    }

    /**
     * Sets the value of the externalrefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTERNALREFNO(String value) {
        this.externalrefno = value;
    }

    /**
     * Gets the value of the mcydefaultflg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCYDEFAULTFLG() {
        return mcydefaultflg;
    }

    /**
     * Sets the value of the mcydefaultflg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCYDEFAULTFLG(String value) {
        this.mcydefaultflg = value;
    }

    /**
     * Gets the value of the childaccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHILDACCOUNT() {
        return childaccount;
    }

    /**
     * Sets the value of the childaccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHILDACCOUNT(String value) {
        this.childaccount = value;
    }

    /**
     * Gets the value of the childaccountccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHILDACCOUNTCCY() {
        return childaccountccy;
    }

    /**
     * Sets the value of the childaccountccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHILDACCOUNTCCY(String value) {
        this.childaccountccy = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMOUNT() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMOUNT(BigDecimal value) {
        this.amount = value;
    }

}

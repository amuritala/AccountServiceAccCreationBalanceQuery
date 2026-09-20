
package com.techstack.corebanking.stub;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for McyQY-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="McyQY-Full-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MULTI_CCY_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CUSTOMERNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TOTAL_CURR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TOTAL_AVAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MULTI_CCY_IBAN_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ccy1" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ACY_CURR_ACC_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MULTI_CCY_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACY_WITHDRAWABLE_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="ACCNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "McyQY-Full-Type", propOrder = {
    "multiccyacno",
    "customerno",
    "branchcode",
    "totalcurr",
    "totalavail",
    "multiccyibanacno",
    "ccy1"
})
public class McyQYFullType {

    @XmlElement(name = "MULTI_CCY_AC_NO", required = true)
    protected String multiccyacno;
    @XmlElement(name = "CUSTOMERNO")
    protected String customerno;
    @XmlElement(name = "BRANCH_CODE")
    protected String branchcode;
    @XmlElement(name = "TOTAL_CURR")
    protected String totalcurr;
    @XmlElement(name = "TOTAL_AVAIL")
    protected String totalavail;
    @XmlElement(name = "MULTI_CCY_IBAN_AC_NO")
    protected String multiccyibanacno;
    @XmlElement(name = "Ccy1")
    protected List<Ccy1> ccy1;

    /**
     * Gets the value of the multiccyacno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMULTICCYACNO() {
        return multiccyacno;
    }

    /**
     * Sets the value of the multiccyacno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMULTICCYACNO(String value) {
        this.multiccyacno = value;
    }

    /**
     * Gets the value of the customerno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMERNO() {
        return customerno;
    }

    /**
     * Sets the value of the customerno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMERNO(String value) {
        this.customerno = value;
    }

    /**
     * Gets the value of the branchcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRANCHCODE() {
        return branchcode;
    }

    /**
     * Sets the value of the branchcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRANCHCODE(String value) {
        this.branchcode = value;
    }

    /**
     * Gets the value of the totalcurr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTALCURR() {
        return totalcurr;
    }

    /**
     * Sets the value of the totalcurr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTALCURR(String value) {
        this.totalcurr = value;
    }

    /**
     * Gets the value of the totalavail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTALAVAIL() {
        return totalavail;
    }

    /**
     * Sets the value of the totalavail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTALAVAIL(String value) {
        this.totalavail = value;
    }

    /**
     * Gets the value of the multiccyibanacno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMULTICCYIBANACNO() {
        return multiccyibanacno;
    }

    /**
     * Sets the value of the multiccyibanacno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMULTICCYIBANACNO(String value) {
        this.multiccyibanacno = value;
    }

    /**
     * Gets the value of the ccy1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ccy1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcy1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ccy1 }
     * 
     * 
     */
    public List<Ccy1> getCcy1() {
        if (ccy1 == null) {
            ccy1 = new ArrayList<Ccy1>();
        }
        return this.ccy1;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ACY_CURR_ACC_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MULTI_CCY_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACY_WITHDRAWABLE_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="ACCNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "acycurraccbal",
        "ccy",
        "multiccyacno",
        "acywithdrawablebal",
        "accnum",
        "paccount"
    })
    public static class Ccy1 {

        @XmlElement(name = "ACY_CURR_ACC_BAL")
        protected BigDecimal acycurraccbal;
        @XmlElement(name = "CCY")
        protected String ccy;
        @XmlElement(name = "MULTI_CCY_AC_NO")
        protected String multiccyacno;
        @XmlElement(name = "ACY_WITHDRAWABLE_BAL")
        protected BigDecimal acywithdrawablebal;
        @XmlElement(name = "ACCNUM")
        protected String accnum;
        @XmlElement(name = "PACCOUNT")
        protected String paccount;

        /**
         * Gets the value of the acycurraccbal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACYCURRACCBAL() {
            return acycurraccbal;
        }

        /**
         * Sets the value of the acycurraccbal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACYCURRACCBAL(BigDecimal value) {
            this.acycurraccbal = value;
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
         * Gets the value of the multiccyacno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMULTICCYACNO() {
            return multiccyacno;
        }

        /**
         * Sets the value of the multiccyacno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMULTICCYACNO(String value) {
            this.multiccyacno = value;
        }

        /**
         * Gets the value of the acywithdrawablebal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACYWITHDRAWABLEBAL() {
            return acywithdrawablebal;
        }

        /**
         * Sets the value of the acywithdrawablebal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACYWITHDRAWABLEBAL(BigDecimal value) {
            this.acywithdrawablebal = value;
        }

        /**
         * Gets the value of the accnum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCNUM() {
            return accnum;
        }

        /**
         * Sets the value of the accnum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCNUM(String value) {
            this.accnum = value;
        }

        /**
         * Gets the value of the paccount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPACCOUNT() {
            return paccount;
        }

        /**
         * Sets the value of the paccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPACCOUNT(String value) {
            this.paccount = value;
        }

    }

}

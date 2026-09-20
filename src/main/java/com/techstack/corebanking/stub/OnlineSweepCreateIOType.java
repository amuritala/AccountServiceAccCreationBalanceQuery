
package com.techstack.corebanking.stub;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OnlineSweep-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OnlineSweep-Create-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CUST_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sttms-Sweep-Details-C" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CBRANCH" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SWEEP_LIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="LIMIT_FREQUENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RETAIN_MIN_BAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Sttms-Sweep-Details-Td" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LINKED_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="LINKED_PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="DEP_ACC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Sttms-Sweep-Details-Ad" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
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
@XmlType(name = "OnlineSweep-Create-IO-Type", propOrder = {
    "branchcode",
    "custacno",
    "sttmsSweepDetailsC",
    "sttmsSweepDetailsTd",
    "sttmsSweepDetailsAd"
})
public class OnlineSweepCreateIOType {

    @XmlElement(name = "BRANCH_CODE")
    protected String branchcode;
    @XmlElement(name = "CUST_AC_NO")
    protected String custacno;
    @XmlElement(name = "Sttms-Sweep-Details-C")
    protected List<SttmsSweepDetailsC> sttmsSweepDetailsC;
    @XmlElement(name = "Sttms-Sweep-Details-Td")
    protected List<SttmsSweepDetailsTd> sttmsSweepDetailsTd;
    @XmlElement(name = "Sttms-Sweep-Details-Ad")
    protected List<SttmsSweepDetailsAd> sttmsSweepDetailsAd;

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
     * Gets the value of the sttmsSweepDetailsC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sttmsSweepDetailsC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttmsSweepDetailsC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SttmsSweepDetailsC }
     * 
     * 
     */
    public List<SttmsSweepDetailsC> getSttmsSweepDetailsC() {
        if (sttmsSweepDetailsC == null) {
            sttmsSweepDetailsC = new ArrayList<SttmsSweepDetailsC>();
        }
        return this.sttmsSweepDetailsC;
    }

    /**
     * Gets the value of the sttmsSweepDetailsTd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sttmsSweepDetailsTd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttmsSweepDetailsTd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SttmsSweepDetailsTd }
     * 
     * 
     */
    public List<SttmsSweepDetailsTd> getSttmsSweepDetailsTd() {
        if (sttmsSweepDetailsTd == null) {
            sttmsSweepDetailsTd = new ArrayList<SttmsSweepDetailsTd>();
        }
        return this.sttmsSweepDetailsTd;
    }

    /**
     * Gets the value of the sttmsSweepDetailsAd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sttmsSweepDetailsAd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttmsSweepDetailsAd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SttmsSweepDetailsAd }
     * 
     * 
     */
    public List<SttmsSweepDetailsAd> getSttmsSweepDetailsAd() {
        if (sttmsSweepDetailsAd == null) {
            sttmsSweepDetailsAd = new ArrayList<SttmsSweepDetailsAd>();
        }
        return this.sttmsSweepDetailsAd;
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
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SttmsSweepDetailsAd {


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
     *         &lt;element name="CBRANCH" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SWEEP_LIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="LIMIT_FREQUENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RETAIN_MIN_BAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "cbranch",
        "caccount",
        "brn",
        "acc",
        "sweeplimit",
        "limitfrequency",
        "retainminbal"
    })
    public static class SttmsSweepDetailsC {

        @XmlElement(name = "CBRANCH", required = true)
        protected String cbranch;
        @XmlElement(name = "CACCOUNT", required = true)
        protected String caccount;
        @XmlElement(name = "BRN")
        protected String brn;
        @XmlElement(name = "ACC")
        protected String acc;
        @XmlElement(name = "SWEEP_LIMIT")
        protected BigDecimal sweeplimit;
        @XmlElement(name = "LIMIT_FREQUENCY")
        protected String limitfrequency;
        @XmlElement(name = "RETAIN_MIN_BAL")
        protected String retainminbal;

        /**
         * Gets the value of the cbranch property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCBRANCH() {
            return cbranch;
        }

        /**
         * Sets the value of the cbranch property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCBRANCH(String value) {
            this.cbranch = value;
        }

        /**
         * Gets the value of the caccount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCACCOUNT() {
            return caccount;
        }

        /**
         * Sets the value of the caccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCACCOUNT(String value) {
            this.caccount = value;
        }

        /**
         * Gets the value of the brn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBRN() {
            return brn;
        }

        /**
         * Sets the value of the brn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBRN(String value) {
            this.brn = value;
        }

        /**
         * Gets the value of the acc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACC() {
            return acc;
        }

        /**
         * Sets the value of the acc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACC(String value) {
            this.acc = value;
        }

        /**
         * Gets the value of the sweeplimit property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSWEEPLIMIT() {
            return sweeplimit;
        }

        /**
         * Sets the value of the sweeplimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSWEEPLIMIT(BigDecimal value) {
            this.sweeplimit = value;
        }

        /**
         * Gets the value of the limitfrequency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLIMITFREQUENCY() {
            return limitfrequency;
        }

        /**
         * Sets the value of the limitfrequency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLIMITFREQUENCY(String value) {
            this.limitfrequency = value;
        }

        /**
         * Gets the value of the retainminbal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRETAINMINBAL() {
            return retainminbal;
        }

        /**
         * Sets the value of the retainminbal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRETAINMINBAL(String value) {
            this.retainminbal = value;
        }

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
     *         &lt;element name="LINKED_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="LINKED_PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="DEP_ACC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "linkedamt",
        "linkedpercentage",
        "depacc"
    })
    public static class SttmsSweepDetailsTd {

        @XmlElement(name = "LINKED_AMT")
        protected BigDecimal linkedamt;
        @XmlElement(name = "LINKED_PERCENTAGE")
        protected BigDecimal linkedpercentage;
        @XmlElement(name = "DEP_ACC", required = true)
        protected String depacc;

        /**
         * Gets the value of the linkedamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLINKEDAMT() {
            return linkedamt;
        }

        /**
         * Sets the value of the linkedamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLINKEDAMT(BigDecimal value) {
            this.linkedamt = value;
        }

        /**
         * Gets the value of the linkedpercentage property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLINKEDPERCENTAGE() {
            return linkedpercentage;
        }

        /**
         * Sets the value of the linkedpercentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLINKEDPERCENTAGE(BigDecimal value) {
            this.linkedpercentage = value;
        }

        /**
         * Gets the value of the depacc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEPACC() {
            return depacc;
        }

        /**
         * Sets the value of the depacc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEPACC(String value) {
            this.depacc = value;
        }

    }

}

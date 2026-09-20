
package com.techstack.corebanking.stub;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Mcyacc-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mcyacc-Create-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MULTICCYACNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MSKCUSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CUSTBRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MSKACCLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MSKCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MAINACNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AUTH_STAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MAKER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CHECKER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DE_MAKER_DT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CHECKER_DT_STAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Muti-Ccy-Detail" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MCY_SUBACNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MCY_CHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "Mcyacc-Create-IO-Type", propOrder = {
    "multiccyacno",
    "mskcustno",
    "custbranch",
    "mskaccls",
    "mskccy",
    "mainacno",
    "authstat",
    "makerid",
    "checkerid",
    "demakerdt",
    "checkerdtstamp",
    "mutiCcyDetail"
})
public class McyaccCreateIOType {

    @XmlElement(name = "MULTICCYACNO")
    protected String multiccyacno;
    @XmlElement(name = "MSKCUSTNO")
    protected String mskcustno;
    @XmlElement(name = "CUSTBRANCH")
    protected String custbranch;
    @XmlElement(name = "MSKACCLS")
    protected String mskaccls;
    @XmlElement(name = "MSKCCY")
    protected String mskccy;
    @XmlElement(name = "MAINACNO")
    protected String mainacno;
    @XmlElement(name = "AUTH_STAT")
    protected String authstat;
    @XmlElement(name = "MAKER_ID")
    protected String makerid;
    @XmlElement(name = "CHECKER_ID")
    protected String checkerid;
    @XmlElement(name = "DE_MAKER_DT")
    protected String demakerdt;
    @XmlElement(name = "CHECKER_DT_STAMP")
    protected String checkerdtstamp;
    @XmlElement(name = "Muti-Ccy-Detail")
    protected List<MutiCcyDetail> mutiCcyDetail;

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
     * Gets the value of the mskcustno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSKCUSTNO() {
        return mskcustno;
    }

    /**
     * Sets the value of the mskcustno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSKCUSTNO(String value) {
        this.mskcustno = value;
    }

    /**
     * Gets the value of the custbranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTBRANCH() {
        return custbranch;
    }

    /**
     * Sets the value of the custbranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTBRANCH(String value) {
        this.custbranch = value;
    }

    /**
     * Gets the value of the mskaccls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSKACCLS() {
        return mskaccls;
    }

    /**
     * Sets the value of the mskaccls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSKACCLS(String value) {
        this.mskaccls = value;
    }

    /**
     * Gets the value of the mskccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSKCCY() {
        return mskccy;
    }

    /**
     * Sets the value of the mskccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSKCCY(String value) {
        this.mskccy = value;
    }

    /**
     * Gets the value of the mainacno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAINACNO() {
        return mainacno;
    }

    /**
     * Sets the value of the mainacno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAINACNO(String value) {
        this.mainacno = value;
    }

    /**
     * Gets the value of the authstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTHSTAT() {
        return authstat;
    }

    /**
     * Sets the value of the authstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTHSTAT(String value) {
        this.authstat = value;
    }

    /**
     * Gets the value of the makerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAKERID() {
        return makerid;
    }

    /**
     * Sets the value of the makerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAKERID(String value) {
        this.makerid = value;
    }

    /**
     * Gets the value of the checkerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHECKERID() {
        return checkerid;
    }

    /**
     * Sets the value of the checkerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHECKERID(String value) {
        this.checkerid = value;
    }

    /**
     * Gets the value of the demakerdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEMAKERDT() {
        return demakerdt;
    }

    /**
     * Sets the value of the demakerdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEMAKERDT(String value) {
        this.demakerdt = value;
    }

    /**
     * Gets the value of the checkerdtstamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHECKERDTSTAMP() {
        return checkerdtstamp;
    }

    /**
     * Sets the value of the checkerdtstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHECKERDTSTAMP(String value) {
        this.checkerdtstamp = value;
    }

    /**
     * Gets the value of the mutiCcyDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the mutiCcyDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMutiCcyDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MutiCcyDetail }
     * 
     * 
     */
    public List<MutiCcyDetail> getMutiCcyDetail() {
        if (mutiCcyDetail == null) {
            mutiCcyDetail = new ArrayList<MutiCcyDetail>();
        }
        return this.mutiCcyDetail;
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
     *         &lt;element name="MCY_SUBACNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MCY_CHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "mcysubacno",
        "ccy",
        "mcycheck"
    })
    public static class MutiCcyDetail {

        @XmlElement(name = "MCY_SUBACNO")
        protected String mcysubacno;
        @XmlElement(name = "CCY")
        protected String ccy;
        @XmlElement(name = "MCY_CHECK")
        protected String mcycheck;

        /**
         * Gets the value of the mcysubacno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMCYSUBACNO() {
            return mcysubacno;
        }

        /**
         * Sets the value of the mcysubacno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMCYSUBACNO(String value) {
            this.mcysubacno = value;
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
         * Gets the value of the mcycheck property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMCYCHECK() {
            return mcycheck;
        }

        /**
         * Sets the value of the mcycheck property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMCYCHECK(String value) {
            this.mcycheck = value;
        }

    }

}

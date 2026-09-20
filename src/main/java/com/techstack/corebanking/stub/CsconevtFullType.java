
package com.techstack.corebanking.stub;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Csconevt-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Csconevt-Full-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="REFERENCE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ac-Entries-Main" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="REFERENCE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="EVENT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Ac-Entries-Detail" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="BRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DRCRINDICTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="AMOUNT_TAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TRN_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FCYAMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="LCY_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="VALUE_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Unprocessed" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TRNREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="EVENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ACSRNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="ACBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ACNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ACCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DRCRIND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TRNCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="AMTTAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FCYAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="EXRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="LCYAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="TRNDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="VALDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Event-Details" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="EVENTNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="EVENT_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="EVENT_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ADESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "Csconevt-Full-Type", propOrder = {
    "referenceno",
    "acEntriesMain",
    "eventDetails"
})
public class CsconevtFullType {

    @XmlElement(name = "REFERENCE_NO")
    protected String referenceno;
    @XmlElement(name = "Ac-Entries-Main")
    protected AcEntriesMain acEntriesMain;
    @XmlElement(name = "Event-Details")
    protected List<EventDetails> eventDetails;

    /**
     * Gets the value of the referenceno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFERENCENO() {
        return referenceno;
    }

    /**
     * Sets the value of the referenceno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFERENCENO(String value) {
        this.referenceno = value;
    }

    /**
     * Gets the value of the acEntriesMain property.
     * 
     * @return
     *     possible object is
     *     {@link AcEntriesMain }
     *     
     */
    public AcEntriesMain getAcEntriesMain() {
        return acEntriesMain;
    }

    /**
     * Sets the value of the acEntriesMain property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcEntriesMain }
     *     
     */
    public void setAcEntriesMain(AcEntriesMain value) {
        this.acEntriesMain = value;
    }

    /**
     * Gets the value of the eventDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the eventDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventDetails }
     * 
     * 
     */
    public List<EventDetails> getEventDetails() {
        if (eventDetails == null) {
            eventDetails = new ArrayList<EventDetails>();
        }
        return this.eventDetails;
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
     *         &lt;element name="REFERENCE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="EVENT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Ac-Entries-Detail" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="BRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DRCRINDICTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="AMOUNT_TAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TRN_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FCYAMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="LCY_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="VALUE_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Unprocessed" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TRNREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="EVENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ACSRNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="ACBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ACNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ACCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DRCRIND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TRNCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="AMTTAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FCYAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="EXRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="LCYAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="TRNDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="VALDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
    @XmlType(name = "", propOrder = {
        "referenceno",
        "event",
        "acEntriesDetail",
        "unprocessed"
    })
    public static class AcEntriesMain {

        @XmlElement(name = "REFERENCE_NO")
        protected String referenceno;
        @XmlElement(name = "EVENT", required = true)
        protected String event;
        @XmlElement(name = "Ac-Entries-Detail")
        protected List<AcEntriesDetail> acEntriesDetail;
        @XmlElement(name = "Unprocessed")
        protected List<Unprocessed> unprocessed;

        /**
         * Gets the value of the referenceno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREFERENCENO() {
            return referenceno;
        }

        /**
         * Sets the value of the referenceno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREFERENCENO(String value) {
            this.referenceno = value;
        }

        /**
         * Gets the value of the event property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEVENT() {
            return event;
        }

        /**
         * Sets the value of the event property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEVENT(String value) {
            this.event = value;
        }

        /**
         * Gets the value of the acEntriesDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the acEntriesDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAcEntriesDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AcEntriesDetail }
         * 
         * 
         */
        public List<AcEntriesDetail> getAcEntriesDetail() {
            if (acEntriesDetail == null) {
                acEntriesDetail = new ArrayList<AcEntriesDetail>();
            }
            return this.acEntriesDetail;
        }

        /**
         * Gets the value of the unprocessed property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the unprocessed property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUnprocessed().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Unprocessed }
         * 
         * 
         */
        public List<Unprocessed> getUnprocessed() {
            if (unprocessed == null) {
                unprocessed = new ArrayList<Unprocessed>();
            }
            return this.unprocessed;
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
         *         &lt;element name="BRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DRCRINDICTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="AMOUNT_TAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TRN_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FCYAMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="LCY_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="VALUE_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
            "branch",
            "account",
            "ccy",
            "drcrindictr",
            "amounttag",
            "trncode",
            "fcyamount",
            "lcyamount",
            "date",
            "valuedate"
        })
        public static class AcEntriesDetail {

            @XmlElement(name = "BRANCH")
            protected String branch;
            @XmlElement(name = "ACCOUNT")
            protected String account;
            @XmlElement(name = "CCY")
            protected String ccy;
            @XmlElement(name = "DRCRINDICTR")
            protected String drcrindictr;
            @XmlElement(name = "AMOUNT_TAG")
            protected String amounttag;
            @XmlElement(name = "TRN_CODE")
            protected String trncode;
            @XmlElement(name = "FCYAMOUNT")
            protected BigDecimal fcyamount;
            @XmlElement(name = "LCY_AMOUNT")
            protected BigDecimal lcyamount;
            @XmlElement(name = "DATE")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar date;
            @XmlElement(name = "VALUE_DATE")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar valuedate;

            /**
             * Gets the value of the branch property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBRANCH() {
                return branch;
            }

            /**
             * Sets the value of the branch property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBRANCH(String value) {
                this.branch = value;
            }

            /**
             * Gets the value of the account property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCOUNT() {
                return account;
            }

            /**
             * Sets the value of the account property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCOUNT(String value) {
                this.account = value;
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
             * Gets the value of the drcrindictr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDRCRINDICTR() {
                return drcrindictr;
            }

            /**
             * Sets the value of the drcrindictr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDRCRINDICTR(String value) {
                this.drcrindictr = value;
            }

            /**
             * Gets the value of the amounttag property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAMOUNTTAG() {
                return amounttag;
            }

            /**
             * Sets the value of the amounttag property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAMOUNTTAG(String value) {
                this.amounttag = value;
            }

            /**
             * Gets the value of the trncode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTRNCODE() {
                return trncode;
            }

            /**
             * Sets the value of the trncode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTRNCODE(String value) {
                this.trncode = value;
            }

            /**
             * Gets the value of the fcyamount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getFCYAMOUNT() {
                return fcyamount;
            }

            /**
             * Sets the value of the fcyamount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setFCYAMOUNT(BigDecimal value) {
                this.fcyamount = value;
            }

            /**
             * Gets the value of the lcyamount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLCYAMOUNT() {
                return lcyamount;
            }

            /**
             * Sets the value of the lcyamount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setLCYAMOUNT(BigDecimal value) {
                this.lcyamount = value;
            }

            /**
             * Gets the value of the date property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDATE() {
                return date;
            }

            /**
             * Sets the value of the date property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDATE(XMLGregorianCalendar value) {
                this.date = value;
            }

            /**
             * Gets the value of the valuedate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getVALUEDATE() {
                return valuedate;
            }

            /**
             * Sets the value of the valuedate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setVALUEDATE(XMLGregorianCalendar value) {
                this.valuedate = value;
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
         *         &lt;element name="TRNREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="EVENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ACSRNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="ACBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ACNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ACCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DRCRIND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TRNCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="AMTTAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FCYAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="EXRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="LCYAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="TRNDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="VALDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
            "trnrefno",
            "event",
            "acsrno",
            "acbrn",
            "acno",
            "acccy",
            "drcrind",
            "trncd",
            "amttag",
            "fcyamt",
            "exrate",
            "lcyamt",
            "trndt",
            "valdt"
        })
        public static class Unprocessed {

            @XmlElement(name = "TRNREFNO")
            protected String trnrefno;
            @XmlElement(name = "EVENT")
            protected String event;
            @XmlElement(name = "ACSRNO")
            protected BigDecimal acsrno;
            @XmlElement(name = "ACBRN")
            protected String acbrn;
            @XmlElement(name = "ACNO")
            protected String acno;
            @XmlElement(name = "ACCCY")
            protected String acccy;
            @XmlElement(name = "DRCRIND")
            protected String drcrind;
            @XmlElement(name = "TRNCD")
            protected String trncd;
            @XmlElement(name = "AMTTAG")
            protected String amttag;
            @XmlElement(name = "FCYAMT")
            protected BigDecimal fcyamt;
            @XmlElement(name = "EXRATE")
            protected BigDecimal exrate;
            @XmlElement(name = "LCYAMT")
            protected BigDecimal lcyamt;
            @XmlElement(name = "TRNDT")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar trndt;
            @XmlElement(name = "VALDT")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar valdt;

            /**
             * Gets the value of the trnrefno property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTRNREFNO() {
                return trnrefno;
            }

            /**
             * Sets the value of the trnrefno property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTRNREFNO(String value) {
                this.trnrefno = value;
            }

            /**
             * Gets the value of the event property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEVENT() {
                return event;
            }

            /**
             * Sets the value of the event property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEVENT(String value) {
                this.event = value;
            }

            /**
             * Gets the value of the acsrno property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getACSRNO() {
                return acsrno;
            }

            /**
             * Sets the value of the acsrno property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setACSRNO(BigDecimal value) {
                this.acsrno = value;
            }

            /**
             * Gets the value of the acbrn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACBRN() {
                return acbrn;
            }

            /**
             * Sets the value of the acbrn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACBRN(String value) {
                this.acbrn = value;
            }

            /**
             * Gets the value of the acno property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACNO() {
                return acno;
            }

            /**
             * Sets the value of the acno property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACNO(String value) {
                this.acno = value;
            }

            /**
             * Gets the value of the acccy property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCCY() {
                return acccy;
            }

            /**
             * Sets the value of the acccy property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCCY(String value) {
                this.acccy = value;
            }

            /**
             * Gets the value of the drcrind property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDRCRIND() {
                return drcrind;
            }

            /**
             * Sets the value of the drcrind property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDRCRIND(String value) {
                this.drcrind = value;
            }

            /**
             * Gets the value of the trncd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTRNCD() {
                return trncd;
            }

            /**
             * Sets the value of the trncd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTRNCD(String value) {
                this.trncd = value;
            }

            /**
             * Gets the value of the amttag property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAMTTAG() {
                return amttag;
            }

            /**
             * Sets the value of the amttag property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAMTTAG(String value) {
                this.amttag = value;
            }

            /**
             * Gets the value of the fcyamt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getFCYAMT() {
                return fcyamt;
            }

            /**
             * Sets the value of the fcyamt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setFCYAMT(BigDecimal value) {
                this.fcyamt = value;
            }

            /**
             * Gets the value of the exrate property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getEXRATE() {
                return exrate;
            }

            /**
             * Sets the value of the exrate property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setEXRATE(BigDecimal value) {
                this.exrate = value;
            }

            /**
             * Gets the value of the lcyamt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLCYAMT() {
                return lcyamt;
            }

            /**
             * Sets the value of the lcyamt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setLCYAMT(BigDecimal value) {
                this.lcyamt = value;
            }

            /**
             * Gets the value of the trndt property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getTRNDT() {
                return trndt;
            }

            /**
             * Sets the value of the trndt property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setTRNDT(XMLGregorianCalendar value) {
                this.trndt = value;
            }

            /**
             * Gets the value of the valdt property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getVALDT() {
                return valdt;
            }

            /**
             * Sets the value of the valdt property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setVALDT(XMLGregorianCalendar value) {
                this.valdt = value;
            }

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
     *         &lt;element name="EVENTNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="EVENT_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="EVENT_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ADESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "eventno",
        "eventdate",
        "eventcode",
        "adesc"
    })
    public static class EventDetails {

        @XmlElement(name = "EVENTNO")
        protected BigDecimal eventno;
        @XmlElement(name = "EVENT_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar eventdate;
        @XmlElement(name = "EVENT_CODE")
        protected String eventcode;
        @XmlElement(name = "ADESC")
        protected String adesc;

        /**
         * Gets the value of the eventno property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getEVENTNO() {
            return eventno;
        }

        /**
         * Sets the value of the eventno property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setEVENTNO(BigDecimal value) {
            this.eventno = value;
        }

        /**
         * Gets the value of the eventdate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEVENTDATE() {
            return eventdate;
        }

        /**
         * Sets the value of the eventdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEVENTDATE(XMLGregorianCalendar value) {
            this.eventdate = value;
        }

        /**
         * Gets the value of the eventcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEVENTCODE() {
            return eventcode;
        }

        /**
         * Sets the value of the eventcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEVENTCODE(String value) {
            this.eventcode = value;
        }

        /**
         * Gets the value of the adesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADESC() {
            return adesc;
        }

        /**
         * Sets the value of the adesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADESC(String value) {
            this.adesc = value;
        }

    }

}

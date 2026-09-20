
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
 * <p>Java class for AcctBal-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctBal-Full-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CUST_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AC_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CURRBAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="AVLBAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DORMANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACSTATNCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NODEBIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACSTATFRZN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CUST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BRHCODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PREV_DAY_BOOK_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CURR_DAY_BOOK_BAL1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TOTAL_TOD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PBKBAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MIN_REQD_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ACY_BLOCKED_AMOUNT1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CP_LIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="AVL_TOD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CUSTOMER_CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCLASSDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCOUNT_CLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OPRTNMDE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OWNERSHIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACSTATDEPST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STOP_PAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STATCHNGAUTMATIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACY_OPENING_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ACY_TODAY_TOVER_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ACY_TODAY_TOVER_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NSF_BLACKLIST_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACY_CURR_BALANCE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ACY_ACCRUED_CR_IC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ACY_ACCRUED_DR_IC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DR_INT_DUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CHARGE_DUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="LAST_INTEREST_DEBIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="LAST_INTEREST_CREDIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="LAST_CR_ACTIVITY" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="LAST_DR_ACTIVITY" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CURRENT_BALANCE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ACY_UNCOLLECTED" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="BLOCKED1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ACY_AVL_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ODREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DIS_TOT_AVL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="BOOK_BALANCE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SWEEP_ELIG_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TOD_LIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="AC_OPEN_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="SWP_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NET_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ONSWPELIGBAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DROVD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CROVD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Transaction" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="VALUE_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="TRN_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INSTRUMENT_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORIG_BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DEBIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="CREDIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="EXCH_RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="LCY_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="TRN_REF_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="TRN_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="AC_BRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Memo" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MEMO_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INST_ID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="INST_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INSTR_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="INST_EXPR_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MEMO_DETAIL_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DISPLAY_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Cust" minOccurs="0"&gt;
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
@XmlType(name = "AcctBal-Full-Type", propOrder = {
    "custacno",
    "acdesc",
    "customerno",
    "ccy",
    "currbal",
    "avlbal",
    "dormant",
    "acstatncr",
    "nodebit",
    "acstatfrzn",
    "status",
    "custname",
    "brhcode",
    "prevdaybookbal",
    "currdaybookbal1",
    "totaltod",
    "pbkbal",
    "minreqdbal",
    "acyblockedamount1",
    "cplimit",
    "avltod",
    "customercategory",
    "acclassdesc",
    "accountclass",
    "oprtnmde",
    "ownership",
    "acstatdepst",
    "stoppay",
    "statchngautmatic",
    "acyopeningbal",
    "acytodaytovercr",
    "acytodaytoverdr",
    "nsfblackliststatus",
    "acycurrbalance",
    "acyaccruedcric",
    "acyaccrueddric",
    "drintdue",
    "chargedue",
    "lastinterestdebit",
    "lastinterestcredit",
    "lastcractivity",
    "lastdractivity",
    "currentbalance",
    "acyuncollected",
    "blocked1",
    "acyavlbal",
    "odreq",
    "distotavlamount",
    "bookbalance",
    "sweepeligbal",
    "todlimit",
    "acopendate",
    "swpin",
    "netbal",
    "onswpeligbal",
    "drovd",
    "crovd",
    "transaction",
    "memo",
    "cust"
})
public class AcctBalFullType {

    @XmlElement(name = "CUST_AC_NO", required = true)
    protected String custacno;
    @XmlElement(name = "AC_DESC")
    protected String acdesc;
    @XmlElement(name = "CUSTOMER_NO")
    protected String customerno;
    @XmlElement(name = "CCY")
    protected String ccy;
    @XmlElement(name = "CURRBAL")
    protected BigDecimal currbal;
    @XmlElement(name = "AVLBAL")
    protected BigDecimal avlbal;
    @XmlElement(name = "DORMANT")
    protected String dormant;
    @XmlElement(name = "ACSTATNCR")
    protected String acstatncr;
    @XmlElement(name = "NODEBIT")
    protected String nodebit;
    @XmlElement(name = "ACSTATFRZN")
    protected String acstatfrzn;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "CUST_NAME")
    protected String custname;
    @XmlElement(name = "BRHCODE", required = true)
    protected String brhcode;
    @XmlElement(name = "PREV_DAY_BOOK_BAL")
    protected BigDecimal prevdaybookbal;
    @XmlElement(name = "CURR_DAY_BOOK_BAL1")
    protected BigDecimal currdaybookbal1;
    @XmlElement(name = "TOTAL_TOD")
    protected BigDecimal totaltod;
    @XmlElement(name = "PBKBAL")
    protected BigDecimal pbkbal;
    @XmlElement(name = "MIN_REQD_BAL")
    protected BigDecimal minreqdbal;
    @XmlElement(name = "ACY_BLOCKED_AMOUNT1")
    protected BigDecimal acyblockedamount1;
    @XmlElement(name = "CP_LIMIT")
    protected BigDecimal cplimit;
    @XmlElement(name = "AVL_TOD")
    protected BigDecimal avltod;
    @XmlElement(name = "CUSTOMER_CATEGORY")
    protected String customercategory;
    @XmlElement(name = "ACCLASSDESC")
    protected String acclassdesc;
    @XmlElement(name = "ACCOUNT_CLASS")
    protected String accountclass;
    @XmlElement(name = "OPRTNMDE")
    protected String oprtnmde;
    @XmlElement(name = "OWNERSHIP")
    protected String ownership;
    @XmlElement(name = "ACSTATDEPST")
    protected String acstatdepst;
    @XmlElement(name = "STOP_PAY")
    protected String stoppay;
    @XmlElement(name = "STATCHNGAUTMATIC")
    protected String statchngautmatic;
    @XmlElement(name = "ACY_OPENING_BAL")
    protected BigDecimal acyopeningbal;
    @XmlElement(name = "ACY_TODAY_TOVER_CR")
    protected BigDecimal acytodaytovercr;
    @XmlElement(name = "ACY_TODAY_TOVER_DR")
    protected BigDecimal acytodaytoverdr;
    @XmlElement(name = "NSF_BLACKLIST_STATUS")
    protected String nsfblackliststatus;
    @XmlElement(name = "ACY_CURR_BALANCE")
    protected BigDecimal acycurrbalance;
    @XmlElement(name = "ACY_ACCRUED_CR_IC")
    protected BigDecimal acyaccruedcric;
    @XmlElement(name = "ACY_ACCRUED_DR_IC")
    protected BigDecimal acyaccrueddric;
    @XmlElement(name = "DR_INT_DUE")
    protected BigDecimal drintdue;
    @XmlElement(name = "CHARGE_DUE")
    protected BigDecimal chargedue;
    @XmlElement(name = "LAST_INTEREST_DEBIT")
    protected BigDecimal lastinterestdebit;
    @XmlElement(name = "LAST_INTEREST_CREDIT")
    protected BigDecimal lastinterestcredit;
    @XmlElement(name = "LAST_CR_ACTIVITY")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastcractivity;
    @XmlElement(name = "LAST_DR_ACTIVITY")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastdractivity;
    @XmlElement(name = "CURRENT_BALANCE")
    protected BigDecimal currentbalance;
    @XmlElement(name = "ACY_UNCOLLECTED")
    protected BigDecimal acyuncollected;
    @XmlElement(name = "BLOCKED1")
    protected BigDecimal blocked1;
    @XmlElement(name = "ACY_AVL_BAL")
    protected BigDecimal acyavlbal;
    @XmlElement(name = "ODREQ")
    protected String odreq;
    @XmlElement(name = "DIS_TOT_AVL_AMOUNT")
    protected BigDecimal distotavlamount;
    @XmlElement(name = "BOOK_BALANCE")
    protected BigDecimal bookbalance;
    @XmlElement(name = "SWEEP_ELIG_BAL")
    protected BigDecimal sweepeligbal;
    @XmlElement(name = "TOD_LIMIT")
    protected BigDecimal todlimit;
    @XmlElement(name = "AC_OPEN_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar acopendate;
    @XmlElement(name = "SWP_IN")
    protected String swpin;
    @XmlElement(name = "NET_BAL")
    protected BigDecimal netbal;
    @XmlElement(name = "ONSWPELIGBAL")
    protected BigDecimal onswpeligbal;
    @XmlElement(name = "DROVD")
    protected String drovd;
    @XmlElement(name = "CROVD")
    protected String crovd;
    @XmlElement(name = "Transaction")
    protected List<Transaction> transaction;
    @XmlElement(name = "Memo")
    protected List<Memo> memo;
    @XmlElement(name = "Cust")
    protected Cust cust;

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
     * Gets the value of the acdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACDESC() {
        return acdesc;
    }

    /**
     * Sets the value of the acdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACDESC(String value) {
        this.acdesc = value;
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
     * Gets the value of the currbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCURRBAL() {
        return currbal;
    }

    /**
     * Sets the value of the currbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCURRBAL(BigDecimal value) {
        this.currbal = value;
    }

    /**
     * Gets the value of the avlbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAVLBAL() {
        return avlbal;
    }

    /**
     * Sets the value of the avlbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAVLBAL(BigDecimal value) {
        this.avlbal = value;
    }

    /**
     * Gets the value of the dormant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDORMANT() {
        return dormant;
    }

    /**
     * Sets the value of the dormant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDORMANT(String value) {
        this.dormant = value;
    }

    /**
     * Gets the value of the acstatncr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACSTATNCR() {
        return acstatncr;
    }

    /**
     * Sets the value of the acstatncr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACSTATNCR(String value) {
        this.acstatncr = value;
    }

    /**
     * Gets the value of the nodebit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNODEBIT() {
        return nodebit;
    }

    /**
     * Sets the value of the nodebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNODEBIT(String value) {
        this.nodebit = value;
    }

    /**
     * Gets the value of the acstatfrzn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACSTATFRZN() {
        return acstatfrzn;
    }

    /**
     * Sets the value of the acstatfrzn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACSTATFRZN(String value) {
        this.acstatfrzn = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the custname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTNAME() {
        return custname;
    }

    /**
     * Sets the value of the custname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTNAME(String value) {
        this.custname = value;
    }

    /**
     * Gets the value of the brhcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRHCODE() {
        return brhcode;
    }

    /**
     * Sets the value of the brhcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRHCODE(String value) {
        this.brhcode = value;
    }

    /**
     * Gets the value of the prevdaybookbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPREVDAYBOOKBAL() {
        return prevdaybookbal;
    }

    /**
     * Sets the value of the prevdaybookbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPREVDAYBOOKBAL(BigDecimal value) {
        this.prevdaybookbal = value;
    }

    /**
     * Gets the value of the currdaybookbal1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCURRDAYBOOKBAL1() {
        return currdaybookbal1;
    }

    /**
     * Sets the value of the currdaybookbal1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCURRDAYBOOKBAL1(BigDecimal value) {
        this.currdaybookbal1 = value;
    }

    /**
     * Gets the value of the totaltod property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTALTOD() {
        return totaltod;
    }

    /**
     * Sets the value of the totaltod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTALTOD(BigDecimal value) {
        this.totaltod = value;
    }

    /**
     * Gets the value of the pbkbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPBKBAL() {
        return pbkbal;
    }

    /**
     * Sets the value of the pbkbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPBKBAL(BigDecimal value) {
        this.pbkbal = value;
    }

    /**
     * Gets the value of the minreqdbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMINREQDBAL() {
        return minreqdbal;
    }

    /**
     * Sets the value of the minreqdbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMINREQDBAL(BigDecimal value) {
        this.minreqdbal = value;
    }

    /**
     * Gets the value of the acyblockedamount1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACYBLOCKEDAMOUNT1() {
        return acyblockedamount1;
    }

    /**
     * Sets the value of the acyblockedamount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACYBLOCKEDAMOUNT1(BigDecimal value) {
        this.acyblockedamount1 = value;
    }

    /**
     * Gets the value of the cplimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCPLIMIT() {
        return cplimit;
    }

    /**
     * Sets the value of the cplimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCPLIMIT(BigDecimal value) {
        this.cplimit = value;
    }

    /**
     * Gets the value of the avltod property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAVLTOD() {
        return avltod;
    }

    /**
     * Sets the value of the avltod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAVLTOD(BigDecimal value) {
        this.avltod = value;
    }

    /**
     * Gets the value of the customercategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMERCATEGORY() {
        return customercategory;
    }

    /**
     * Sets the value of the customercategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMERCATEGORY(String value) {
        this.customercategory = value;
    }

    /**
     * Gets the value of the acclassdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCLASSDESC() {
        return acclassdesc;
    }

    /**
     * Sets the value of the acclassdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCLASSDESC(String value) {
        this.acclassdesc = value;
    }

    /**
     * Gets the value of the accountclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTCLASS() {
        return accountclass;
    }

    /**
     * Sets the value of the accountclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTCLASS(String value) {
        this.accountclass = value;
    }

    /**
     * Gets the value of the oprtnmde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPRTNMDE() {
        return oprtnmde;
    }

    /**
     * Sets the value of the oprtnmde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPRTNMDE(String value) {
        this.oprtnmde = value;
    }

    /**
     * Gets the value of the ownership property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOWNERSHIP() {
        return ownership;
    }

    /**
     * Sets the value of the ownership property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOWNERSHIP(String value) {
        this.ownership = value;
    }

    /**
     * Gets the value of the acstatdepst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACSTATDEPST() {
        return acstatdepst;
    }

    /**
     * Sets the value of the acstatdepst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACSTATDEPST(String value) {
        this.acstatdepst = value;
    }

    /**
     * Gets the value of the stoppay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTOPPAY() {
        return stoppay;
    }

    /**
     * Sets the value of the stoppay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTOPPAY(String value) {
        this.stoppay = value;
    }

    /**
     * Gets the value of the statchngautmatic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATCHNGAUTMATIC() {
        return statchngautmatic;
    }

    /**
     * Sets the value of the statchngautmatic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATCHNGAUTMATIC(String value) {
        this.statchngautmatic = value;
    }

    /**
     * Gets the value of the acyopeningbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACYOPENINGBAL() {
        return acyopeningbal;
    }

    /**
     * Sets the value of the acyopeningbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACYOPENINGBAL(BigDecimal value) {
        this.acyopeningbal = value;
    }

    /**
     * Gets the value of the acytodaytovercr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACYTODAYTOVERCR() {
        return acytodaytovercr;
    }

    /**
     * Sets the value of the acytodaytovercr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACYTODAYTOVERCR(BigDecimal value) {
        this.acytodaytovercr = value;
    }

    /**
     * Gets the value of the acytodaytoverdr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACYTODAYTOVERDR() {
        return acytodaytoverdr;
    }

    /**
     * Sets the value of the acytodaytoverdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACYTODAYTOVERDR(BigDecimal value) {
        this.acytodaytoverdr = value;
    }

    /**
     * Gets the value of the nsfblackliststatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSFBLACKLISTSTATUS() {
        return nsfblackliststatus;
    }

    /**
     * Sets the value of the nsfblackliststatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSFBLACKLISTSTATUS(String value) {
        this.nsfblackliststatus = value;
    }

    /**
     * Gets the value of the acycurrbalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACYCURRBALANCE() {
        return acycurrbalance;
    }

    /**
     * Sets the value of the acycurrbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACYCURRBALANCE(BigDecimal value) {
        this.acycurrbalance = value;
    }

    /**
     * Gets the value of the acyaccruedcric property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACYACCRUEDCRIC() {
        return acyaccruedcric;
    }

    /**
     * Sets the value of the acyaccruedcric property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACYACCRUEDCRIC(BigDecimal value) {
        this.acyaccruedcric = value;
    }

    /**
     * Gets the value of the acyaccrueddric property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACYACCRUEDDRIC() {
        return acyaccrueddric;
    }

    /**
     * Sets the value of the acyaccrueddric property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACYACCRUEDDRIC(BigDecimal value) {
        this.acyaccrueddric = value;
    }

    /**
     * Gets the value of the drintdue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDRINTDUE() {
        return drintdue;
    }

    /**
     * Sets the value of the drintdue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDRINTDUE(BigDecimal value) {
        this.drintdue = value;
    }

    /**
     * Gets the value of the chargedue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCHARGEDUE() {
        return chargedue;
    }

    /**
     * Sets the value of the chargedue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCHARGEDUE(BigDecimal value) {
        this.chargedue = value;
    }

    /**
     * Gets the value of the lastinterestdebit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLASTINTERESTDEBIT() {
        return lastinterestdebit;
    }

    /**
     * Sets the value of the lastinterestdebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLASTINTERESTDEBIT(BigDecimal value) {
        this.lastinterestdebit = value;
    }

    /**
     * Gets the value of the lastinterestcredit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLASTINTERESTCREDIT() {
        return lastinterestcredit;
    }

    /**
     * Sets the value of the lastinterestcredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLASTINTERESTCREDIT(BigDecimal value) {
        this.lastinterestcredit = value;
    }

    /**
     * Gets the value of the lastcractivity property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLASTCRACTIVITY() {
        return lastcractivity;
    }

    /**
     * Sets the value of the lastcractivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLASTCRACTIVITY(XMLGregorianCalendar value) {
        this.lastcractivity = value;
    }

    /**
     * Gets the value of the lastdractivity property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLASTDRACTIVITY() {
        return lastdractivity;
    }

    /**
     * Sets the value of the lastdractivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLASTDRACTIVITY(XMLGregorianCalendar value) {
        this.lastdractivity = value;
    }

    /**
     * Gets the value of the currentbalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCURRENTBALANCE() {
        return currentbalance;
    }

    /**
     * Sets the value of the currentbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCURRENTBALANCE(BigDecimal value) {
        this.currentbalance = value;
    }

    /**
     * Gets the value of the acyuncollected property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACYUNCOLLECTED() {
        return acyuncollected;
    }

    /**
     * Sets the value of the acyuncollected property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACYUNCOLLECTED(BigDecimal value) {
        this.acyuncollected = value;
    }

    /**
     * Gets the value of the blocked1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBLOCKED1() {
        return blocked1;
    }

    /**
     * Sets the value of the blocked1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBLOCKED1(BigDecimal value) {
        this.blocked1 = value;
    }

    /**
     * Gets the value of the acyavlbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACYAVLBAL() {
        return acyavlbal;
    }

    /**
     * Sets the value of the acyavlbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACYAVLBAL(BigDecimal value) {
        this.acyavlbal = value;
    }

    /**
     * Gets the value of the odreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getODREQ() {
        return odreq;
    }

    /**
     * Sets the value of the odreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setODREQ(String value) {
        this.odreq = value;
    }

    /**
     * Gets the value of the distotavlamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDISTOTAVLAMOUNT() {
        return distotavlamount;
    }

    /**
     * Sets the value of the distotavlamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDISTOTAVLAMOUNT(BigDecimal value) {
        this.distotavlamount = value;
    }

    /**
     * Gets the value of the bookbalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBOOKBALANCE() {
        return bookbalance;
    }

    /**
     * Sets the value of the bookbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBOOKBALANCE(BigDecimal value) {
        this.bookbalance = value;
    }

    /**
     * Gets the value of the sweepeligbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSWEEPELIGBAL() {
        return sweepeligbal;
    }

    /**
     * Sets the value of the sweepeligbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSWEEPELIGBAL(BigDecimal value) {
        this.sweepeligbal = value;
    }

    /**
     * Gets the value of the todlimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTODLIMIT() {
        return todlimit;
    }

    /**
     * Sets the value of the todlimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTODLIMIT(BigDecimal value) {
        this.todlimit = value;
    }

    /**
     * Gets the value of the acopendate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getACOPENDATE() {
        return acopendate;
    }

    /**
     * Sets the value of the acopendate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setACOPENDATE(XMLGregorianCalendar value) {
        this.acopendate = value;
    }

    /**
     * Gets the value of the swpin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWPIN() {
        return swpin;
    }

    /**
     * Sets the value of the swpin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWPIN(String value) {
        this.swpin = value;
    }

    /**
     * Gets the value of the netbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNETBAL() {
        return netbal;
    }

    /**
     * Sets the value of the netbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNETBAL(BigDecimal value) {
        this.netbal = value;
    }

    /**
     * Gets the value of the onswpeligbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getONSWPELIGBAL() {
        return onswpeligbal;
    }

    /**
     * Sets the value of the onswpeligbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setONSWPELIGBAL(BigDecimal value) {
        this.onswpeligbal = value;
    }

    /**
     * Gets the value of the drovd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDROVD() {
        return drovd;
    }

    /**
     * Sets the value of the drovd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDROVD(String value) {
        this.drovd = value;
    }

    /**
     * Gets the value of the crovd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCROVD() {
        return crovd;
    }

    /**
     * Sets the value of the crovd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCROVD(String value) {
        this.crovd = value;
    }

    /**
     * Gets the value of the transaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the transaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transaction }
     * 
     * 
     */
    public List<Transaction> getTransaction() {
        if (transaction == null) {
            transaction = new ArrayList<Transaction>();
        }
        return this.transaction;
    }

    /**
     * Gets the value of the memo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the memo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Memo }
     * 
     * 
     */
    public List<Memo> getMemo() {
        if (memo == null) {
            memo = new ArrayList<Memo>();
        }
        return this.memo;
    }

    /**
     * Gets the value of the cust property.
     * 
     * @return
     *     possible object is
     *     {@link Cust }
     *     
     */
    public Cust getCust() {
        return cust;
    }

    /**
     * Sets the value of the cust property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cust }
     *     
     */
    public void setCust(Cust value) {
        this.cust = value;
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
    public static class Cust {


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
     *         &lt;element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MEMO_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INST_ID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="INST_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INSTR_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="INST_EXPR_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MEMO_DETAIL_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DISPLAY_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "customerno",
        "memoid",
        "branchcode",
        "instid",
        "instdesc",
        "instrdt",
        "instexprdate",
        "category",
        "memodetailid",
        "displaytype"
    })
    public static class Memo {

        @XmlElement(name = "CUSTOMER_NO")
        protected String customerno;
        @XmlElement(name = "MEMO_ID")
        protected String memoid;
        @XmlElement(name = "BRANCH_CODE")
        protected String branchcode;
        @XmlElement(name = "INST_ID")
        protected BigDecimal instid;
        @XmlElement(name = "INST_DESC")
        protected String instdesc;
        @XmlElement(name = "INSTR_DT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar instrdt;
        @XmlElement(name = "INST_EXPR_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar instexprdate;
        @XmlElement(name = "CATEGORY")
        protected String category;
        @XmlElement(name = "MEMO_DETAIL_ID")
        protected String memodetailid;
        @XmlElement(name = "DISPLAY_TYPE")
        protected String displaytype;

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
         * Gets the value of the memoid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMEMOID() {
            return memoid;
        }

        /**
         * Sets the value of the memoid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMEMOID(String value) {
            this.memoid = value;
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
         * Gets the value of the instid property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getINSTID() {
            return instid;
        }

        /**
         * Sets the value of the instid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setINSTID(BigDecimal value) {
            this.instid = value;
        }

        /**
         * Gets the value of the instdesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSTDESC() {
            return instdesc;
        }

        /**
         * Sets the value of the instdesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSTDESC(String value) {
            this.instdesc = value;
        }

        /**
         * Gets the value of the instrdt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getINSTRDT() {
            return instrdt;
        }

        /**
         * Sets the value of the instrdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setINSTRDT(XMLGregorianCalendar value) {
            this.instrdt = value;
        }

        /**
         * Gets the value of the instexprdate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getINSTEXPRDATE() {
            return instexprdate;
        }

        /**
         * Sets the value of the instexprdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setINSTEXPRDATE(XMLGregorianCalendar value) {
            this.instexprdate = value;
        }

        /**
         * Gets the value of the category property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCATEGORY() {
            return category;
        }

        /**
         * Sets the value of the category property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCATEGORY(String value) {
            this.category = value;
        }

        /**
         * Gets the value of the memodetailid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMEMODETAILID() {
            return memodetailid;
        }

        /**
         * Sets the value of the memodetailid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMEMODETAILID(String value) {
            this.memodetailid = value;
        }

        /**
         * Gets the value of the displaytype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDISPLAYTYPE() {
            return displaytype;
        }

        /**
         * Sets the value of the displaytype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDISPLAYTYPE(String value) {
            this.displaytype = value;
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
     *         &lt;element name="VALUE_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="TRN_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INSTRUMENT_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORIG_BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DEBIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="CREDIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="EXCH_RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="LCY_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="TRN_REF_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TRN_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="AC_BRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "valuedt",
        "trndesc",
        "instrumentcode",
        "origbrn",
        "debit",
        "credit",
        "exchrate",
        "lcyamount",
        "trnrefno",
        "trndt",
        "acbranch"
    })
    public static class Transaction {

        @XmlElement(name = "VALUE_DT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar valuedt;
        @XmlElement(name = "TRN_DESC")
        protected String trndesc;
        @XmlElement(name = "INSTRUMENT_CODE")
        protected String instrumentcode;
        @XmlElement(name = "ORIG_BRN")
        protected String origbrn;
        @XmlElement(name = "DEBIT")
        protected BigDecimal debit;
        @XmlElement(name = "CREDIT")
        protected BigDecimal credit;
        @XmlElement(name = "EXCH_RATE")
        protected BigDecimal exchrate;
        @XmlElement(name = "LCY_AMOUNT")
        protected BigDecimal lcyamount;
        @XmlElement(name = "TRN_REF_NO")
        protected String trnrefno;
        @XmlElement(name = "TRN_DT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar trndt;
        @XmlElement(name = "AC_BRANCH")
        protected String acbranch;

        /**
         * Gets the value of the valuedt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getVALUEDT() {
            return valuedt;
        }

        /**
         * Sets the value of the valuedt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setVALUEDT(XMLGregorianCalendar value) {
            this.valuedt = value;
        }

        /**
         * Gets the value of the trndesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRNDESC() {
            return trndesc;
        }

        /**
         * Sets the value of the trndesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRNDESC(String value) {
            this.trndesc = value;
        }

        /**
         * Gets the value of the instrumentcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSTRUMENTCODE() {
            return instrumentcode;
        }

        /**
         * Sets the value of the instrumentcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSTRUMENTCODE(String value) {
            this.instrumentcode = value;
        }

        /**
         * Gets the value of the origbrn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORIGBRN() {
            return origbrn;
        }

        /**
         * Sets the value of the origbrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORIGBRN(String value) {
            this.origbrn = value;
        }

        /**
         * Gets the value of the debit property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDEBIT() {
            return debit;
        }

        /**
         * Sets the value of the debit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDEBIT(BigDecimal value) {
            this.debit = value;
        }

        /**
         * Gets the value of the credit property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCREDIT() {
            return credit;
        }

        /**
         * Sets the value of the credit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCREDIT(BigDecimal value) {
            this.credit = value;
        }

        /**
         * Gets the value of the exchrate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getEXCHRATE() {
            return exchrate;
        }

        /**
         * Sets the value of the exchrate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setEXCHRATE(BigDecimal value) {
            this.exchrate = value;
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
         * Gets the value of the acbranch property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACBRANCH() {
            return acbranch;
        }

        /**
         * Sets the value of the acbranch property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACBRANCH(String value) {
            this.acbranch = value;
        }

    }

}

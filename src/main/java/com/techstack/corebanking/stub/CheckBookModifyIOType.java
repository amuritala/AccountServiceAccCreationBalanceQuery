
package com.techstack.corebanking.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckBook-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckBook-Modify-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="INCL_FOR_CHKBOOK_PRINTING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCOUNT_BRANCH" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FIRST_CHEQUE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ISSUE_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ORDER_DETAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DELIVERY_ADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DELIVERY_ADD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DELIVERY_ADD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DELIVERY_ADD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DELIVERY_MODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REQUEST_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REFERENCENO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="APPLY_CHG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MAKER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MAKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Event-Master" type="{http://fcubs.ofss.com/service/FCUBSAccService}Csconevt-Modify-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Charge-Main" type="{http://fcubs.ofss.com/service/FCUBSAccService}Csconchg-Modify-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="UDFDETAILS" type="{http://fcubs.ofss.com/service/FCUBSAccService}UDFDETAILSType2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckBook-Modify-IO-Type", propOrder = {
    "inclforchkbookprinting",
    "accountbranch",
    "account",
    "firstchequenumber",
    "issuedate",
    "orderdetails",
    "deliveryadd1",
    "deliveryadd2",
    "deliveryadd3",
    "deliveryadd4",
    "deliverymode",
    "requeststatus",
    "referenceno",
    "applychg",
    "maker",
    "makerstamp",
    "eventMaster",
    "chargeMain",
    "udfdetails"
})
public class CheckBookModifyIOType {

    @XmlElement(name = "INCL_FOR_CHKBOOK_PRINTING")
    protected String inclforchkbookprinting;
    @XmlElement(name = "ACCOUNT_BRANCH", required = true)
    protected String accountbranch;
    @XmlElement(name = "ACCOUNT", required = true)
    protected String account;
    @XmlElement(name = "FIRST_CHEQUE_NUMBER")
    protected String firstchequenumber;
    @XmlElement(name = "ISSUE_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issuedate;
    @XmlElement(name = "ORDER_DETAILS")
    protected String orderdetails;
    @XmlElement(name = "DELIVERY_ADD1")
    protected String deliveryadd1;
    @XmlElement(name = "DELIVERY_ADD2")
    protected String deliveryadd2;
    @XmlElement(name = "DELIVERY_ADD3")
    protected String deliveryadd3;
    @XmlElement(name = "DELIVERY_ADD4")
    protected String deliveryadd4;
    @XmlElement(name = "DELIVERY_MODE")
    protected String deliverymode;
    @XmlElement(name = "REQUEST_STATUS")
    protected String requeststatus;
    @XmlElement(name = "REFERENCENO")
    protected String referenceno;
    @XmlElement(name = "APPLY_CHG")
    protected String applychg;
    @XmlElement(name = "MAKER")
    protected String maker;
    @XmlElement(name = "MAKERSTAMP")
    protected String makerstamp;
    @XmlElement(name = "Event-Master")
    protected CsconevtModifyIOType eventMaster;
    @XmlElement(name = "Charge-Main")
    protected CsconchgModifyIOType chargeMain;
    @XmlElement(name = "UDFDETAILS")
    protected List<UDFDETAILSType2> udfdetails;

    /**
     * Gets the value of the inclforchkbookprinting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINCLFORCHKBOOKPRINTING() {
        return inclforchkbookprinting;
    }

    /**
     * Sets the value of the inclforchkbookprinting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINCLFORCHKBOOKPRINTING(String value) {
        this.inclforchkbookprinting = value;
    }

    /**
     * Gets the value of the accountbranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTBRANCH() {
        return accountbranch;
    }

    /**
     * Sets the value of the accountbranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTBRANCH(String value) {
        this.accountbranch = value;
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
     * Gets the value of the firstchequenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIRSTCHEQUENUMBER() {
        return firstchequenumber;
    }

    /**
     * Sets the value of the firstchequenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIRSTCHEQUENUMBER(String value) {
        this.firstchequenumber = value;
    }

    /**
     * Gets the value of the issuedate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getISSUEDATE() {
        return issuedate;
    }

    /**
     * Sets the value of the issuedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setISSUEDATE(XMLGregorianCalendar value) {
        this.issuedate = value;
    }

    /**
     * Gets the value of the orderdetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERDETAILS() {
        return orderdetails;
    }

    /**
     * Sets the value of the orderdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERDETAILS(String value) {
        this.orderdetails = value;
    }

    /**
     * Gets the value of the deliveryadd1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELIVERYADD1() {
        return deliveryadd1;
    }

    /**
     * Sets the value of the deliveryadd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELIVERYADD1(String value) {
        this.deliveryadd1 = value;
    }

    /**
     * Gets the value of the deliveryadd2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELIVERYADD2() {
        return deliveryadd2;
    }

    /**
     * Sets the value of the deliveryadd2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELIVERYADD2(String value) {
        this.deliveryadd2 = value;
    }

    /**
     * Gets the value of the deliveryadd3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELIVERYADD3() {
        return deliveryadd3;
    }

    /**
     * Sets the value of the deliveryadd3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELIVERYADD3(String value) {
        this.deliveryadd3 = value;
    }

    /**
     * Gets the value of the deliveryadd4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELIVERYADD4() {
        return deliveryadd4;
    }

    /**
     * Sets the value of the deliveryadd4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELIVERYADD4(String value) {
        this.deliveryadd4 = value;
    }

    /**
     * Gets the value of the deliverymode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELIVERYMODE() {
        return deliverymode;
    }

    /**
     * Sets the value of the deliverymode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELIVERYMODE(String value) {
        this.deliverymode = value;
    }

    /**
     * Gets the value of the requeststatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREQUESTSTATUS() {
        return requeststatus;
    }

    /**
     * Sets the value of the requeststatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREQUESTSTATUS(String value) {
        this.requeststatus = value;
    }

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
     * Gets the value of the applychg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPLYCHG() {
        return applychg;
    }

    /**
     * Sets the value of the applychg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPLYCHG(String value) {
        this.applychg = value;
    }

    /**
     * Gets the value of the maker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAKER() {
        return maker;
    }

    /**
     * Sets the value of the maker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAKER(String value) {
        this.maker = value;
    }

    /**
     * Gets the value of the makerstamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAKERSTAMP() {
        return makerstamp;
    }

    /**
     * Sets the value of the makerstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAKERSTAMP(String value) {
        this.makerstamp = value;
    }

    /**
     * Gets the value of the eventMaster property.
     * 
     * @return
     *     possible object is
     *     {@link CsconevtModifyIOType }
     *     
     */
    public CsconevtModifyIOType getEventMaster() {
        return eventMaster;
    }

    /**
     * Sets the value of the eventMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsconevtModifyIOType }
     *     
     */
    public void setEventMaster(CsconevtModifyIOType value) {
        this.eventMaster = value;
    }

    /**
     * Gets the value of the chargeMain property.
     * 
     * @return
     *     possible object is
     *     {@link CsconchgModifyIOType }
     *     
     */
    public CsconchgModifyIOType getChargeMain() {
        return chargeMain;
    }

    /**
     * Sets the value of the chargeMain property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsconchgModifyIOType }
     *     
     */
    public void setChargeMain(CsconchgModifyIOType value) {
        this.chargeMain = value;
    }

    /**
     * Gets the value of the udfdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the udfdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUDFDETAILS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UDFDETAILSType2 }
     * 
     * 
     */
    public List<UDFDETAILSType2> getUDFDETAILS() {
        if (udfdetails == null) {
            udfdetails = new ArrayList<UDFDETAILSType2>();
        }
        return this.udfdetails;
    }

}

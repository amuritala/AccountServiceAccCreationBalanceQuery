
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
 * <p>Java class for FICustAcc-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FICustAcc-Create-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CUST_NO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CCATEG" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FULLNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SNAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FSTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MIDNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LSTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WORK_PHONE_ISD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="WORK_PHONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HOME_PHONE_ISD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="HOME_PHONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EMAILID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MOB_ISD_NO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MOBNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CUST_COMM_MODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GENDER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NATIONID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="RESSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LANG" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MEDIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ADDRESS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BENEFADDR1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BENEFADDR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ADDRS3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ADDRS4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PIN_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NLTY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SAME_CORR_ADDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_ADDRESS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_BENEFADDR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_BENEFADDR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_ADDRS3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_ADDRS4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_PINCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KYCSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KYC_REFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UIDNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UIDVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCESS_GROUP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LOCATION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Account" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ACCOUNT_CLASS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="AC_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AC_OPEN_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="ALT_ACC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACC_OPENING_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="PAY_IN_OPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="OFFSET_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="TODLIMSTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="TODLIMENDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="TODLIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="PASSBOOK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Acc-Nominees" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="NAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="RELSHIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NADDR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NADDR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NADDR3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NADDR4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOMMINOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="GUARDNAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="GUARDRELNSHP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="GADDR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="GADDR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="GADDR3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="GADDR4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="P_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="G_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Doctype-Checklist" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="DOCUMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CHECKED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="EXPIRY_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="EXPECTED_DATE_SUBMISSION" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Remarks" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="REMARK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REMARK2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REMARK3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REMARK4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REMARK5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REMARK6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REMARK7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REMARK8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REMARK9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REMARK10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Tod-Renew" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="RNW_FREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NXT_RENEW_LMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="RNW_UNIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="RNW_FLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CustAcc" type="{http://fcubs.ofss.com/service/FCUBSAccService}CustAccountMIS-Create-IO-Type" minOccurs="0"/&gt;
 *                   &lt;element name="Accclose" type="{http://fcubs.ofss.com/service/FCUBSAccService}AccClose-Create-IO-Type" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Custmis" type="{http://fcubs.ofss.com/service/FCUBSAccService}Custmis-Create-IO-Type" minOccurs="0"/&gt;
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
@XmlType(name = "FICustAcc-Create-IO-Type", propOrder = {
    "custno",
    "ccateg",
    "fullname",
    "sname",
    "title",
    "fstname",
    "midname",
    "lstname",
    "workphoneisd",
    "workphone",
    "homephoneisd",
    "homephone",
    "emailid",
    "mobisdno",
    "mobnum",
    "custcommmode",
    "gender",
    "nationid",
    "dob",
    "resstatus",
    "lang",
    "media",
    "name",
    "addresscode",
    "benefaddr1",
    "benefaddr2",
    "addrs3",
    "addrs4",
    "pincode",
    "country",
    "nlty",
    "samecorraddr",
    "paddresscode",
    "pbenefaddr1",
    "pbenefaddr2",
    "paddrs3",
    "paddrs4",
    "ppincode",
    "pcountry",
    "kycstat",
    "kycrefno",
    "uidname",
    "uidval",
    "ssn",
    "accessgroup",
    "location",
    "account",
    "custmis",
    "udfdetails"
})
public class FICustAccCreateIOType {

    @XmlElement(name = "CUST_NO", required = true)
    protected String custno;
    @XmlElement(name = "CCATEG", required = true)
    protected String ccateg;
    @XmlElement(name = "FULLNAME")
    protected String fullname;
    @XmlElement(name = "SNAME", required = true)
    protected String sname;
    @XmlElement(name = "TITLE")
    protected String title;
    @XmlElement(name = "FSTNAME")
    protected String fstname;
    @XmlElement(name = "MIDNAME")
    protected String midname;
    @XmlElement(name = "LSTNAME")
    protected String lstname;
    @XmlElement(name = "WORK_PHONE_ISD")
    protected BigDecimal workphoneisd;
    @XmlElement(name = "WORK_PHONE")
    protected String workphone;
    @XmlElement(name = "HOME_PHONE_ISD")
    protected BigDecimal homephoneisd;
    @XmlElement(name = "HOME_PHONE")
    protected String homephone;
    @XmlElement(name = "EMAILID")
    protected String emailid;
    @XmlElement(name = "MOB_ISD_NO")
    protected BigDecimal mobisdno;
    @XmlElement(name = "MOBNUM")
    protected String mobnum;
    @XmlElement(name = "CUST_COMM_MODE")
    protected String custcommmode;
    @XmlElement(name = "GENDER", required = true)
    protected String gender;
    @XmlElement(name = "NATIONID")
    protected String nationid;
    @XmlElement(name = "DOB", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dob;
    @XmlElement(name = "RESSTATUS")
    protected String resstatus;
    @XmlElement(name = "LANG", required = true)
    protected String lang;
    @XmlElement(name = "MEDIA")
    protected String media;
    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "ADDRESS_CODE")
    protected String addresscode;
    @XmlElement(name = "BENEFADDR1", required = true)
    protected String benefaddr1;
    @XmlElement(name = "BENEFADDR2")
    protected String benefaddr2;
    @XmlElement(name = "ADDRS3")
    protected String addrs3;
    @XmlElement(name = "ADDRS4")
    protected String addrs4;
    @XmlElement(name = "PIN_CODE")
    protected String pincode;
    @XmlElement(name = "COUNTRY", required = true)
    protected String country;
    @XmlElement(name = "NLTY", required = true)
    protected String nlty;
    @XmlElement(name = "SAME_CORR_ADDR")
    protected String samecorraddr;
    @XmlElement(name = "P_ADDRESS_CODE")
    protected String paddresscode;
    @XmlElement(name = "P_BENEFADDR1")
    protected String pbenefaddr1;
    @XmlElement(name = "P_BENEFADDR2")
    protected String pbenefaddr2;
    @XmlElement(name = "P_ADDRS3")
    protected String paddrs3;
    @XmlElement(name = "P_ADDRS4")
    protected String paddrs4;
    @XmlElement(name = "P_PINCODE")
    protected String ppincode;
    @XmlElement(name = "P_COUNTRY")
    protected String pcountry;
    @XmlElement(name = "KYCSTAT")
    protected String kycstat;
    @XmlElement(name = "KYC_REFNO")
    protected String kycrefno;
    @XmlElement(name = "UIDNAME")
    protected String uidname;
    @XmlElement(name = "UIDVAL")
    protected String uidval;
    @XmlElement(name = "SSN")
    protected String ssn;
    @XmlElement(name = "ACCESS_GROUP")
    protected String accessgroup;
    @XmlElement(name = "LOCATION", required = true)
    protected String location;
    @XmlElement(name = "Account")
    protected Account account;
    @XmlElement(name = "Custmis")
    protected CustmisCreateIOType custmis;
    @XmlElement(name = "UDFDETAILS")
    protected List<UDFDETAILSType2> udfdetails;

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
     * Gets the value of the ccateg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCATEG() {
        return ccateg;
    }

    /**
     * Sets the value of the ccateg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCATEG(String value) {
        this.ccateg = value;
    }

    /**
     * Gets the value of the fullname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFULLNAME() {
        return fullname;
    }

    /**
     * Sets the value of the fullname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFULLNAME(String value) {
        this.fullname = value;
    }

    /**
     * Gets the value of the sname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNAME() {
        return sname;
    }

    /**
     * Sets the value of the sname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNAME(String value) {
        this.sname = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITLE() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITLE(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the fstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFSTNAME() {
        return fstname;
    }

    /**
     * Sets the value of the fstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFSTNAME(String value) {
        this.fstname = value;
    }

    /**
     * Gets the value of the midname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIDNAME() {
        return midname;
    }

    /**
     * Sets the value of the midname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIDNAME(String value) {
        this.midname = value;
    }

    /**
     * Gets the value of the lstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLSTNAME() {
        return lstname;
    }

    /**
     * Sets the value of the lstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLSTNAME(String value) {
        this.lstname = value;
    }

    /**
     * Gets the value of the workphoneisd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWORKPHONEISD() {
        return workphoneisd;
    }

    /**
     * Sets the value of the workphoneisd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWORKPHONEISD(BigDecimal value) {
        this.workphoneisd = value;
    }

    /**
     * Gets the value of the workphone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWORKPHONE() {
        return workphone;
    }

    /**
     * Sets the value of the workphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWORKPHONE(String value) {
        this.workphone = value;
    }

    /**
     * Gets the value of the homephoneisd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHOMEPHONEISD() {
        return homephoneisd;
    }

    /**
     * Sets the value of the homephoneisd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHOMEPHONEISD(BigDecimal value) {
        this.homephoneisd = value;
    }

    /**
     * Gets the value of the homephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOMEPHONE() {
        return homephone;
    }

    /**
     * Sets the value of the homephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOMEPHONE(String value) {
        this.homephone = value;
    }

    /**
     * Gets the value of the emailid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMAILID() {
        return emailid;
    }

    /**
     * Sets the value of the emailid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMAILID(String value) {
        this.emailid = value;
    }

    /**
     * Gets the value of the mobisdno property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMOBISDNO() {
        return mobisdno;
    }

    /**
     * Sets the value of the mobisdno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMOBISDNO(BigDecimal value) {
        this.mobisdno = value;
    }

    /**
     * Gets the value of the mobnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOBNUM() {
        return mobnum;
    }

    /**
     * Sets the value of the mobnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOBNUM(String value) {
        this.mobnum = value;
    }

    /**
     * Gets the value of the custcommmode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTCOMMMODE() {
        return custcommmode;
    }

    /**
     * Sets the value of the custcommmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTCOMMMODE(String value) {
        this.custcommmode = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENDER() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENDER(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the nationid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNATIONID() {
        return nationid;
    }

    /**
     * Sets the value of the nationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNATIONID(String value) {
        this.nationid = value;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDOB() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDOB(XMLGregorianCalendar value) {
        this.dob = value;
    }

    /**
     * Gets the value of the resstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESSTATUS() {
        return resstatus;
    }

    /**
     * Sets the value of the resstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESSTATUS(String value) {
        this.resstatus = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANG() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANG(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the media property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEDIA() {
        return media;
    }

    /**
     * Sets the value of the media property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEDIA(String value) {
        this.media = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the addresscode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRESSCODE() {
        return addresscode;
    }

    /**
     * Sets the value of the addresscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRESSCODE(String value) {
        this.addresscode = value;
    }

    /**
     * Gets the value of the benefaddr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBENEFADDR1() {
        return benefaddr1;
    }

    /**
     * Sets the value of the benefaddr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBENEFADDR1(String value) {
        this.benefaddr1 = value;
    }

    /**
     * Gets the value of the benefaddr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBENEFADDR2() {
        return benefaddr2;
    }

    /**
     * Sets the value of the benefaddr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBENEFADDR2(String value) {
        this.benefaddr2 = value;
    }

    /**
     * Gets the value of the addrs3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRS3() {
        return addrs3;
    }

    /**
     * Sets the value of the addrs3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRS3(String value) {
        this.addrs3 = value;
    }

    /**
     * Gets the value of the addrs4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRS4() {
        return addrs4;
    }

    /**
     * Sets the value of the addrs4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRS4(String value) {
        this.addrs4 = value;
    }

    /**
     * Gets the value of the pincode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPINCODE() {
        return pincode;
    }

    /**
     * Sets the value of the pincode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPINCODE(String value) {
        this.pincode = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTRY() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTRY(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the nlty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNLTY() {
        return nlty;
    }

    /**
     * Sets the value of the nlty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNLTY(String value) {
        this.nlty = value;
    }

    /**
     * Gets the value of the samecorraddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAMECORRADDR() {
        return samecorraddr;
    }

    /**
     * Sets the value of the samecorraddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAMECORRADDR(String value) {
        this.samecorraddr = value;
    }

    /**
     * Gets the value of the paddresscode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPADDRESSCODE() {
        return paddresscode;
    }

    /**
     * Sets the value of the paddresscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPADDRESSCODE(String value) {
        this.paddresscode = value;
    }

    /**
     * Gets the value of the pbenefaddr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPBENEFADDR1() {
        return pbenefaddr1;
    }

    /**
     * Sets the value of the pbenefaddr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPBENEFADDR1(String value) {
        this.pbenefaddr1 = value;
    }

    /**
     * Gets the value of the pbenefaddr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPBENEFADDR2() {
        return pbenefaddr2;
    }

    /**
     * Sets the value of the pbenefaddr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPBENEFADDR2(String value) {
        this.pbenefaddr2 = value;
    }

    /**
     * Gets the value of the paddrs3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPADDRS3() {
        return paddrs3;
    }

    /**
     * Sets the value of the paddrs3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPADDRS3(String value) {
        this.paddrs3 = value;
    }

    /**
     * Gets the value of the paddrs4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPADDRS4() {
        return paddrs4;
    }

    /**
     * Sets the value of the paddrs4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPADDRS4(String value) {
        this.paddrs4 = value;
    }

    /**
     * Gets the value of the ppincode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPINCODE() {
        return ppincode;
    }

    /**
     * Sets the value of the ppincode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPINCODE(String value) {
        this.ppincode = value;
    }

    /**
     * Gets the value of the pcountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCOUNTRY() {
        return pcountry;
    }

    /**
     * Sets the value of the pcountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCOUNTRY(String value) {
        this.pcountry = value;
    }

    /**
     * Gets the value of the kycstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKYCSTAT() {
        return kycstat;
    }

    /**
     * Sets the value of the kycstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKYCSTAT(String value) {
        this.kycstat = value;
    }

    /**
     * Gets the value of the kycrefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKYCREFNO() {
        return kycrefno;
    }

    /**
     * Sets the value of the kycrefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKYCREFNO(String value) {
        this.kycrefno = value;
    }

    /**
     * Gets the value of the uidname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUIDNAME() {
        return uidname;
    }

    /**
     * Sets the value of the uidname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUIDNAME(String value) {
        this.uidname = value;
    }

    /**
     * Gets the value of the uidval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUIDVAL() {
        return uidval;
    }

    /**
     * Sets the value of the uidval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUIDVAL(String value) {
        this.uidval = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSN() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSN(String value) {
        this.ssn = value;
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

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCATION() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCATION(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setAccount(Account value) {
        this.account = value;
    }

    /**
     * Gets the value of the custmis property.
     * 
     * @return
     *     possible object is
     *     {@link CustmisCreateIOType }
     *     
     */
    public CustmisCreateIOType getCustmis() {
        return custmis;
    }

    /**
     * Sets the value of the custmis property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustmisCreateIOType }
     *     
     */
    public void setCustmis(CustmisCreateIOType value) {
        this.custmis = value;
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
     *         &lt;element name="ACCOUNT_CLASS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="AC_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AC_OPEN_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="ALT_ACC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACC_OPENING_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="PAY_IN_OPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="OFFSET_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TODLIMSTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="TODLIMENDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="TODLIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="PASSBOOK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Acc-Nominees" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="RELSHIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NADDR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NADDR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NADDR3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NADDR4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOMMINOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="GUARDNAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="GUARDRELNSHP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="GADDR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="GADDR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="GADDR3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="GADDR4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="P_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="G_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Doctype-Checklist" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="DOCUMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CHECKED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="EXPIRY_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="EXPECTED_DATE_SUBMISSION" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Remarks" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="REMARK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REMARK2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REMARK3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REMARK4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REMARK5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REMARK6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REMARK7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REMARK8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REMARK9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REMARK10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Tod-Renew" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="RNW_FREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NXT_RENEW_LMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="RNW_UNIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="RNW_FLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CustAcc" type="{http://fcubs.ofss.com/service/FCUBSAccService}CustAccountMIS-Create-IO-Type" minOccurs="0"/&gt;
     *         &lt;element name="Accclose" type="{http://fcubs.ofss.com/service/FCUBSAccService}AccClose-Create-IO-Type" minOccurs="0"/&gt;
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
        "accountclass",
        "acdesc",
        "acopendate",
        "altaccno",
        "accopeningamt",
        "payinoption",
        "offsetaccount",
        "todlimstdt",
        "todlimendt",
        "todlimit",
        "passbook",
        "accNominees",
        "doctypeChecklist",
        "remarks",
        "todRenew",
        "custAcc",
        "accclose"
    })
    public static class Account {

        @XmlElement(name = "ACCOUNT_CLASS", required = true)
        protected String accountclass;
        @XmlElement(name = "AC_DESC")
        protected String acdesc;
        @XmlElement(name = "AC_OPEN_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar acopendate;
        @XmlElement(name = "ALT_ACC_NO")
        protected String altaccno;
        @XmlElement(name = "ACC_OPENING_AMT")
        protected BigDecimal accopeningamt;
        @XmlElement(name = "PAY_IN_OPTION")
        protected String payinoption;
        @XmlElement(name = "OFFSET_ACCOUNT")
        protected String offsetaccount;
        @XmlElement(name = "TODLIMSTDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar todlimstdt;
        @XmlElement(name = "TODLIMENDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar todlimendt;
        @XmlElement(name = "TODLIMIT")
        protected BigDecimal todlimit;
        @XmlElement(name = "PASSBOOK")
        protected String passbook;
        @XmlElement(name = "Acc-Nominees")
        protected List<AccNominees> accNominees;
        @XmlElement(name = "Doctype-Checklist")
        protected List<DoctypeChecklist> doctypeChecklist;
        @XmlElement(name = "Remarks")
        protected Remarks remarks;
        @XmlElement(name = "Tod-Renew")
        protected TodRenew todRenew;
        @XmlElement(name = "CustAcc")
        protected CustAccountMISCreateIOType custAcc;
        @XmlElement(name = "Accclose")
        protected AccCloseCreateIOType accclose;

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
         * Gets the value of the altaccno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getALTACCNO() {
            return altaccno;
        }

        /**
         * Sets the value of the altaccno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setALTACCNO(String value) {
            this.altaccno = value;
        }

        /**
         * Gets the value of the accopeningamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACCOPENINGAMT() {
            return accopeningamt;
        }

        /**
         * Sets the value of the accopeningamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACCOPENINGAMT(BigDecimal value) {
            this.accopeningamt = value;
        }

        /**
         * Gets the value of the payinoption property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAYINOPTION() {
            return payinoption;
        }

        /**
         * Sets the value of the payinoption property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAYINOPTION(String value) {
            this.payinoption = value;
        }

        /**
         * Gets the value of the offsetaccount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOFFSETACCOUNT() {
            return offsetaccount;
        }

        /**
         * Sets the value of the offsetaccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOFFSETACCOUNT(String value) {
            this.offsetaccount = value;
        }

        /**
         * Gets the value of the todlimstdt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTODLIMSTDT() {
            return todlimstdt;
        }

        /**
         * Sets the value of the todlimstdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTODLIMSTDT(XMLGregorianCalendar value) {
            this.todlimstdt = value;
        }

        /**
         * Gets the value of the todlimendt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTODLIMENDT() {
            return todlimendt;
        }

        /**
         * Sets the value of the todlimendt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTODLIMENDT(XMLGregorianCalendar value) {
            this.todlimendt = value;
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
         * Gets the value of the passbook property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPASSBOOK() {
            return passbook;
        }

        /**
         * Sets the value of the passbook property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPASSBOOK(String value) {
            this.passbook = value;
        }

        /**
         * Gets the value of the accNominees property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the accNominees property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccNominees().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AccNominees }
         * 
         * 
         */
        public List<AccNominees> getAccNominees() {
            if (accNominees == null) {
                accNominees = new ArrayList<AccNominees>();
            }
            return this.accNominees;
        }

        /**
         * Gets the value of the doctypeChecklist property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the doctypeChecklist property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDoctypeChecklist().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DoctypeChecklist }
         * 
         * 
         */
        public List<DoctypeChecklist> getDoctypeChecklist() {
            if (doctypeChecklist == null) {
                doctypeChecklist = new ArrayList<DoctypeChecklist>();
            }
            return this.doctypeChecklist;
        }

        /**
         * Gets the value of the remarks property.
         * 
         * @return
         *     possible object is
         *     {@link Remarks }
         *     
         */
        public Remarks getRemarks() {
            return remarks;
        }

        /**
         * Sets the value of the remarks property.
         * 
         * @param value
         *     allowed object is
         *     {@link Remarks }
         *     
         */
        public void setRemarks(Remarks value) {
            this.remarks = value;
        }

        /**
         * Gets the value of the todRenew property.
         * 
         * @return
         *     possible object is
         *     {@link TodRenew }
         *     
         */
        public TodRenew getTodRenew() {
            return todRenew;
        }

        /**
         * Sets the value of the todRenew property.
         * 
         * @param value
         *     allowed object is
         *     {@link TodRenew }
         *     
         */
        public void setTodRenew(TodRenew value) {
            this.todRenew = value;
        }

        /**
         * Gets the value of the custAcc property.
         * 
         * @return
         *     possible object is
         *     {@link CustAccountMISCreateIOType }
         *     
         */
        public CustAccountMISCreateIOType getCustAcc() {
            return custAcc;
        }

        /**
         * Sets the value of the custAcc property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustAccountMISCreateIOType }
         *     
         */
        public void setCustAcc(CustAccountMISCreateIOType value) {
            this.custAcc = value;
        }

        /**
         * Gets the value of the accclose property.
         * 
         * @return
         *     possible object is
         *     {@link AccCloseCreateIOType }
         *     
         */
        public AccCloseCreateIOType getAccclose() {
            return accclose;
        }

        /**
         * Sets the value of the accclose property.
         * 
         * @param value
         *     allowed object is
         *     {@link AccCloseCreateIOType }
         *     
         */
        public void setAccclose(AccCloseCreateIOType value) {
            this.accclose = value;
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
         *         &lt;element name="NAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="RELSHIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NADDR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NADDR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NADDR3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NADDR4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOMMINOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="GUARDNAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="GUARDRELNSHP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="GADDR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="GADDR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="GADDR3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="GADDR4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="P_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="G_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "nam",
            "dob",
            "relship",
            "naddr1",
            "naddr2",
            "naddr3",
            "naddr4",
            "nomminor",
            "guardnam",
            "guardrelnshp",
            "gaddr1",
            "gaddr2",
            "gaddr3",
            "gaddr4",
            "pcode",
            "gcode"
        })
        public static class AccNominees {

            @XmlElement(name = "NAM")
            protected String nam;
            @XmlElement(name = "DOB")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dob;
            @XmlElement(name = "RELSHIP")
            protected String relship;
            @XmlElement(name = "NADDR1")
            protected String naddr1;
            @XmlElement(name = "NADDR2")
            protected String naddr2;
            @XmlElement(name = "NADDR3")
            protected String naddr3;
            @XmlElement(name = "NADDR4")
            protected String naddr4;
            @XmlElement(name = "NOMMINOR")
            protected String nomminor;
            @XmlElement(name = "GUARDNAM")
            protected String guardnam;
            @XmlElement(name = "GUARDRELNSHP")
            protected String guardrelnshp;
            @XmlElement(name = "GADDR1")
            protected String gaddr1;
            @XmlElement(name = "GADDR2")
            protected String gaddr2;
            @XmlElement(name = "GADDR3")
            protected String gaddr3;
            @XmlElement(name = "GADDR4")
            protected String gaddr4;
            @XmlElement(name = "P_CODE")
            protected String pcode;
            @XmlElement(name = "G_CODE")
            protected String gcode;

            /**
             * Gets the value of the nam property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNAM() {
                return nam;
            }

            /**
             * Sets the value of the nam property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNAM(String value) {
                this.nam = value;
            }

            /**
             * Gets the value of the dob property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDOB() {
                return dob;
            }

            /**
             * Sets the value of the dob property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDOB(XMLGregorianCalendar value) {
                this.dob = value;
            }

            /**
             * Gets the value of the relship property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRELSHIP() {
                return relship;
            }

            /**
             * Sets the value of the relship property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRELSHIP(String value) {
                this.relship = value;
            }

            /**
             * Gets the value of the naddr1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNADDR1() {
                return naddr1;
            }

            /**
             * Sets the value of the naddr1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNADDR1(String value) {
                this.naddr1 = value;
            }

            /**
             * Gets the value of the naddr2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNADDR2() {
                return naddr2;
            }

            /**
             * Sets the value of the naddr2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNADDR2(String value) {
                this.naddr2 = value;
            }

            /**
             * Gets the value of the naddr3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNADDR3() {
                return naddr3;
            }

            /**
             * Sets the value of the naddr3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNADDR3(String value) {
                this.naddr3 = value;
            }

            /**
             * Gets the value of the naddr4 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNADDR4() {
                return naddr4;
            }

            /**
             * Sets the value of the naddr4 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNADDR4(String value) {
                this.naddr4 = value;
            }

            /**
             * Gets the value of the nomminor property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOMMINOR() {
                return nomminor;
            }

            /**
             * Sets the value of the nomminor property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOMMINOR(String value) {
                this.nomminor = value;
            }

            /**
             * Gets the value of the guardnam property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGUARDNAM() {
                return guardnam;
            }

            /**
             * Sets the value of the guardnam property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGUARDNAM(String value) {
                this.guardnam = value;
            }

            /**
             * Gets the value of the guardrelnshp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGUARDRELNSHP() {
                return guardrelnshp;
            }

            /**
             * Sets the value of the guardrelnshp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGUARDRELNSHP(String value) {
                this.guardrelnshp = value;
            }

            /**
             * Gets the value of the gaddr1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGADDR1() {
                return gaddr1;
            }

            /**
             * Sets the value of the gaddr1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGADDR1(String value) {
                this.gaddr1 = value;
            }

            /**
             * Gets the value of the gaddr2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGADDR2() {
                return gaddr2;
            }

            /**
             * Sets the value of the gaddr2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGADDR2(String value) {
                this.gaddr2 = value;
            }

            /**
             * Gets the value of the gaddr3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGADDR3() {
                return gaddr3;
            }

            /**
             * Sets the value of the gaddr3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGADDR3(String value) {
                this.gaddr3 = value;
            }

            /**
             * Gets the value of the gaddr4 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGADDR4() {
                return gaddr4;
            }

            /**
             * Sets the value of the gaddr4 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGADDR4(String value) {
                this.gaddr4 = value;
            }

            /**
             * Gets the value of the pcode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPCODE() {
                return pcode;
            }

            /**
             * Sets the value of the pcode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPCODE(String value) {
                this.pcode = value;
            }

            /**
             * Gets the value of the gcode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGCODE() {
                return gcode;
            }

            /**
             * Sets the value of the gcode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGCODE(String value) {
                this.gcode = value;
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
         *         &lt;element name="DOCUMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CHECKED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="EXPIRY_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="EXPECTED_DATE_SUBMISSION" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
            "documenttype",
            "checked",
            "expirydate",
            "expecteddatesubmission"
        })
        public static class DoctypeChecklist {

            @XmlElement(name = "DOCUMENT_TYPE")
            protected String documenttype;
            @XmlElement(name = "CHECKED")
            protected String checked;
            @XmlElement(name = "EXPIRY_DATE")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar expirydate;
            @XmlElement(name = "EXPECTED_DATE_SUBMISSION")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar expecteddatesubmission;

            /**
             * Gets the value of the documenttype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDOCUMENTTYPE() {
                return documenttype;
            }

            /**
             * Sets the value of the documenttype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDOCUMENTTYPE(String value) {
                this.documenttype = value;
            }

            /**
             * Gets the value of the checked property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCHECKED() {
                return checked;
            }

            /**
             * Sets the value of the checked property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCHECKED(String value) {
                this.checked = value;
            }

            /**
             * Gets the value of the expirydate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getEXPIRYDATE() {
                return expirydate;
            }

            /**
             * Sets the value of the expirydate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setEXPIRYDATE(XMLGregorianCalendar value) {
                this.expirydate = value;
            }

            /**
             * Gets the value of the expecteddatesubmission property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getEXPECTEDDATESUBMISSION() {
                return expecteddatesubmission;
            }

            /**
             * Sets the value of the expecteddatesubmission property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setEXPECTEDDATESUBMISSION(XMLGregorianCalendar value) {
                this.expecteddatesubmission = value;
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
         *         &lt;element name="REMARK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REMARK2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REMARK3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REMARK4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REMARK5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REMARK6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REMARK7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REMARK8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REMARK9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REMARK10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "remark1",
            "remark2",
            "remark3",
            "remark4",
            "remark5",
            "remark6",
            "remark7",
            "remark8",
            "remark9",
            "remark10"
        })
        public static class Remarks {

            @XmlElement(name = "REMARK1")
            protected String remark1;
            @XmlElement(name = "REMARK2")
            protected String remark2;
            @XmlElement(name = "REMARK3")
            protected String remark3;
            @XmlElement(name = "REMARK4")
            protected String remark4;
            @XmlElement(name = "REMARK5")
            protected String remark5;
            @XmlElement(name = "REMARK6")
            protected String remark6;
            @XmlElement(name = "REMARK7")
            protected String remark7;
            @XmlElement(name = "REMARK8")
            protected String remark8;
            @XmlElement(name = "REMARK9")
            protected String remark9;
            @XmlElement(name = "REMARK10")
            protected String remark10;

            /**
             * Gets the value of the remark1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREMARK1() {
                return remark1;
            }

            /**
             * Sets the value of the remark1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREMARK1(String value) {
                this.remark1 = value;
            }

            /**
             * Gets the value of the remark2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREMARK2() {
                return remark2;
            }

            /**
             * Sets the value of the remark2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREMARK2(String value) {
                this.remark2 = value;
            }

            /**
             * Gets the value of the remark3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREMARK3() {
                return remark3;
            }

            /**
             * Sets the value of the remark3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREMARK3(String value) {
                this.remark3 = value;
            }

            /**
             * Gets the value of the remark4 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREMARK4() {
                return remark4;
            }

            /**
             * Sets the value of the remark4 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREMARK4(String value) {
                this.remark4 = value;
            }

            /**
             * Gets the value of the remark5 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREMARK5() {
                return remark5;
            }

            /**
             * Sets the value of the remark5 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREMARK5(String value) {
                this.remark5 = value;
            }

            /**
             * Gets the value of the remark6 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREMARK6() {
                return remark6;
            }

            /**
             * Sets the value of the remark6 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREMARK6(String value) {
                this.remark6 = value;
            }

            /**
             * Gets the value of the remark7 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREMARK7() {
                return remark7;
            }

            /**
             * Sets the value of the remark7 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREMARK7(String value) {
                this.remark7 = value;
            }

            /**
             * Gets the value of the remark8 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREMARK8() {
                return remark8;
            }

            /**
             * Sets the value of the remark8 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREMARK8(String value) {
                this.remark8 = value;
            }

            /**
             * Gets the value of the remark9 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREMARK9() {
                return remark9;
            }

            /**
             * Sets the value of the remark9 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREMARK9(String value) {
                this.remark9 = value;
            }

            /**
             * Gets the value of the remark10 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREMARK10() {
                return remark10;
            }

            /**
             * Sets the value of the remark10 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREMARK10(String value) {
                this.remark10 = value;
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
         *         &lt;element name="RNW_FREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NXT_RENEW_LMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="RNW_UNIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="RNW_FLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "rnwfreq",
            "nxtrenewlmt",
            "rnwunit",
            "rnwflg"
        })
        public static class TodRenew {

            @XmlElement(name = "RNW_FREQ")
            protected String rnwfreq;
            @XmlElement(name = "NXT_RENEW_LMT")
            protected BigDecimal nxtrenewlmt;
            @XmlElement(name = "RNW_UNIT")
            protected BigDecimal rnwunit;
            @XmlElement(name = "RNW_FLG")
            protected String rnwflg;

            /**
             * Gets the value of the rnwfreq property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRNWFREQ() {
                return rnwfreq;
            }

            /**
             * Sets the value of the rnwfreq property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRNWFREQ(String value) {
                this.rnwfreq = value;
            }

            /**
             * Gets the value of the nxtrenewlmt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getNXTRENEWLMT() {
                return nxtrenewlmt;
            }

            /**
             * Sets the value of the nxtrenewlmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setNXTRENEWLMT(BigDecimal value) {
                this.nxtrenewlmt = value;
            }

            /**
             * Gets the value of the rnwunit property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getRNWUNIT() {
                return rnwunit;
            }

            /**
             * Sets the value of the rnwunit property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setRNWUNIT(BigDecimal value) {
                this.rnwunit = value;
            }

            /**
             * Gets the value of the rnwflg property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRNWFLG() {
                return rnwflg;
            }

            /**
             * Sets the value of the rnwflg property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRNWFLG(String value) {
                this.rnwflg = value;
            }

        }

    }

}


package com.techstack.corebanking.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FTdetsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FTdetsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FT_PRODUCT_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRANSFER_CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ULTBEN6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RECEIVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACC1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACC2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACC3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACC4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACC5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REMINFO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REMINFO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REMINFO3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REMINFO4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COUNTRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ULTBENDET1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ULTBENDET2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ULTBENDET3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ULTBENDET4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ULTBENDET5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FTdetsType", propOrder = {
    "ftproductcode",
    "transfercurrency",
    "ultben6",
    "receiver",
    "acc1",
    "acc2",
    "acc3",
    "acc4",
    "acc5",
    "reminfo1",
    "reminfo2",
    "reminfo3",
    "reminfo4",
    "countres",
    "ultbendet1",
    "ultbendet2",
    "ultbendet3",
    "ultbendet4",
    "ultbendet5"
})
public class FTdetsType {

    @XmlElement(name = "FT_PRODUCT_CODE")
    protected String ftproductcode;
    @XmlElement(name = "TRANSFER_CURRENCY")
    protected String transfercurrency;
    @XmlElement(name = "ULTBEN6")
    protected String ultben6;
    @XmlElement(name = "RECEIVER")
    protected String receiver;
    @XmlElement(name = "ACC1")
    protected String acc1;
    @XmlElement(name = "ACC2")
    protected String acc2;
    @XmlElement(name = "ACC3")
    protected String acc3;
    @XmlElement(name = "ACC4")
    protected String acc4;
    @XmlElement(name = "ACC5")
    protected String acc5;
    @XmlElement(name = "REMINFO1")
    protected String reminfo1;
    @XmlElement(name = "REMINFO2")
    protected String reminfo2;
    @XmlElement(name = "REMINFO3")
    protected String reminfo3;
    @XmlElement(name = "REMINFO4")
    protected String reminfo4;
    @XmlElement(name = "COUNTRES")
    protected String countres;
    @XmlElement(name = "ULTBENDET1")
    protected String ultbendet1;
    @XmlElement(name = "ULTBENDET2")
    protected String ultbendet2;
    @XmlElement(name = "ULTBENDET3")
    protected String ultbendet3;
    @XmlElement(name = "ULTBENDET4")
    protected String ultbendet4;
    @XmlElement(name = "ULTBENDET5")
    protected String ultbendet5;

    /**
     * Gets the value of the ftproductcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTPRODUCTCODE() {
        return ftproductcode;
    }

    /**
     * Sets the value of the ftproductcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTPRODUCTCODE(String value) {
        this.ftproductcode = value;
    }

    /**
     * Gets the value of the transfercurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSFERCURRENCY() {
        return transfercurrency;
    }

    /**
     * Sets the value of the transfercurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSFERCURRENCY(String value) {
        this.transfercurrency = value;
    }

    /**
     * Gets the value of the ultben6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULTBEN6() {
        return ultben6;
    }

    /**
     * Sets the value of the ultben6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULTBEN6(String value) {
        this.ultben6 = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECEIVER() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECEIVER(String value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the acc1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACC1() {
        return acc1;
    }

    /**
     * Sets the value of the acc1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACC1(String value) {
        this.acc1 = value;
    }

    /**
     * Gets the value of the acc2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACC2() {
        return acc2;
    }

    /**
     * Sets the value of the acc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACC2(String value) {
        this.acc2 = value;
    }

    /**
     * Gets the value of the acc3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACC3() {
        return acc3;
    }

    /**
     * Sets the value of the acc3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACC3(String value) {
        this.acc3 = value;
    }

    /**
     * Gets the value of the acc4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACC4() {
        return acc4;
    }

    /**
     * Sets the value of the acc4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACC4(String value) {
        this.acc4 = value;
    }

    /**
     * Gets the value of the acc5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACC5() {
        return acc5;
    }

    /**
     * Sets the value of the acc5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACC5(String value) {
        this.acc5 = value;
    }

    /**
     * Gets the value of the reminfo1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMINFO1() {
        return reminfo1;
    }

    /**
     * Sets the value of the reminfo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMINFO1(String value) {
        this.reminfo1 = value;
    }

    /**
     * Gets the value of the reminfo2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMINFO2() {
        return reminfo2;
    }

    /**
     * Sets the value of the reminfo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMINFO2(String value) {
        this.reminfo2 = value;
    }

    /**
     * Gets the value of the reminfo3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMINFO3() {
        return reminfo3;
    }

    /**
     * Sets the value of the reminfo3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMINFO3(String value) {
        this.reminfo3 = value;
    }

    /**
     * Gets the value of the reminfo4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMINFO4() {
        return reminfo4;
    }

    /**
     * Sets the value of the reminfo4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMINFO4(String value) {
        this.reminfo4 = value;
    }

    /**
     * Gets the value of the countres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTRES() {
        return countres;
    }

    /**
     * Sets the value of the countres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTRES(String value) {
        this.countres = value;
    }

    /**
     * Gets the value of the ultbendet1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULTBENDET1() {
        return ultbendet1;
    }

    /**
     * Sets the value of the ultbendet1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULTBENDET1(String value) {
        this.ultbendet1 = value;
    }

    /**
     * Gets the value of the ultbendet2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULTBENDET2() {
        return ultbendet2;
    }

    /**
     * Sets the value of the ultbendet2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULTBENDET2(String value) {
        this.ultbendet2 = value;
    }

    /**
     * Gets the value of the ultbendet3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULTBENDET3() {
        return ultbendet3;
    }

    /**
     * Sets the value of the ultbendet3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULTBENDET3(String value) {
        this.ultbendet3 = value;
    }

    /**
     * Gets the value of the ultbendet4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULTBENDET4() {
        return ultbendet4;
    }

    /**
     * Sets the value of the ultbendet4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULTBENDET4(String value) {
        this.ultbendet4 = value;
    }

    /**
     * Gets the value of the ultbendet5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULTBENDET5() {
        return ultbendet5;
    }

    /**
     * Sets the value of the ultbendet5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULTBENDET5(String value) {
        this.ultbendet5 = value;
    }

}


package com.techstack.corebanking.stub;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkedEntities-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkedEntities-Full-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CUSTACNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LinkedEntities" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="RELATIONSHIP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="INHERIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CUSTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="APP_FOR_SIGNATURE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "LinkedEntities-Full-Type", propOrder = {
    "brn",
    "custacno",
    "linkedEntities"
})
public class LinkedEntitiesFullType {

    @XmlElement(name = "BRN")
    protected String brn;
    @XmlElement(name = "CUSTACNO")
    protected String custacno;
    @XmlElement(name = "LinkedEntities")
    protected List<LinkedEntities> linkedEntities;

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
     * Gets the value of the linkedEntities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the linkedEntities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkedEntities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkedEntities }
     * 
     * 
     */
    public List<LinkedEntities> getLinkedEntities() {
        if (linkedEntities == null) {
            linkedEntities = new ArrayList<LinkedEntities>();
        }
        return this.linkedEntities;
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
     *         &lt;element name="CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="RELATIONSHIP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="INHERIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CUSTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="APP_FOR_SIGNATURE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "customer",
        "relationship",
        "inherit",
        "custname",
        "appforsignature"
    })
    public static class LinkedEntities {

        @XmlElement(name = "CUSTOMER", required = true)
        protected String customer;
        @XmlElement(name = "RELATIONSHIP", required = true)
        protected String relationship;
        @XmlElement(name = "INHERIT")
        protected String inherit;
        @XmlElement(name = "CUSTNAME")
        protected String custname;
        @XmlElement(name = "APP_FOR_SIGNATURE")
        protected String appforsignature;

        /**
         * Gets the value of the customer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTOMER() {
            return customer;
        }

        /**
         * Sets the value of the customer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTOMER(String value) {
            this.customer = value;
        }

        /**
         * Gets the value of the relationship property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRELATIONSHIP() {
            return relationship;
        }

        /**
         * Sets the value of the relationship property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRELATIONSHIP(String value) {
            this.relationship = value;
        }

        /**
         * Gets the value of the inherit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINHERIT() {
            return inherit;
        }

        /**
         * Sets the value of the inherit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINHERIT(String value) {
            this.inherit = value;
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
         * Gets the value of the appforsignature property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAPPFORSIGNATURE() {
            return appforsignature;
        }

        /**
         * Sets the value of the appforsignature property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAPPFORSIGNATURE(String value) {
            this.appforsignature = value;
        }

    }

}

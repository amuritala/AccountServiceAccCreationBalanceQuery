
package com.techstack.corebanking.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JointHoldersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JointHoldersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JNTHLDCDE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="JNTHLDDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="JNTHLDTYP" type="{http://fcubs.ofss.com/service/FCUBSAccService}JNTHLDTYPType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JointHoldersType", propOrder = {
    "jnthldcde",
    "jnthlddesc",
    "jnthldtyp"
})
public class JointHoldersType {

    @XmlElement(name = "JNTHLDCDE")
    protected String jnthldcde;
    @XmlElement(name = "JNTHLDDESC")
    protected String jnthlddesc;
    @XmlElement(name = "JNTHLDTYP", required = true)
    @XmlSchemaType(name = "string")
    protected JNTHLDTYPType jnthldtyp;

    /**
     * Gets the value of the jnthldcde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJNTHLDCDE() {
        return jnthldcde;
    }

    /**
     * Sets the value of the jnthldcde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJNTHLDCDE(String value) {
        this.jnthldcde = value;
    }

    /**
     * Gets the value of the jnthlddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJNTHLDDESC() {
        return jnthlddesc;
    }

    /**
     * Sets the value of the jnthlddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJNTHLDDESC(String value) {
        this.jnthlddesc = value;
    }

    /**
     * Gets the value of the jnthldtyp property.
     * 
     * @return
     *     possible object is
     *     {@link JNTHLDTYPType }
     *     
     */
    public JNTHLDTYPType getJNTHLDTYP() {
        return jnthldtyp;
    }

    /**
     * Sets the value of the jnthldtyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JNTHLDTYPType }
     *     
     */
    public void setJNTHLDTYP(JNTHLDTYPType value) {
        this.jnthldtyp = value;
    }

}

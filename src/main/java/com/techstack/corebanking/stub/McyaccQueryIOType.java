
package com.techstack.corebanking.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Mcyacc-Query-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mcyacc-Query-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MULTICCYACNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mcyacc-Query-IO-Type", propOrder = {
    "multiccyacno"
})
public class McyaccQueryIOType {

    @XmlElement(name = "MULTICCYACNO")
    protected String multiccyacno;

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

}

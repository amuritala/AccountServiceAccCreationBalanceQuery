
package com.techstack.corebanking.stub;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACSTMTCycleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ACSTMTCycleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="Q"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="W"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ACSTMTCycleType")
@XmlEnum
public enum ACSTMTCycleType {

    A,
    S,
    Q,
    M,
    F,
    W,
    D;

    public String value() {
        return name();
    }

    public static ACSTMTCycleType fromValue(String v) {
        return valueOf(v);
    }

}

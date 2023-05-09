
package com.xmbrace.otwebserviceapi.autogenerated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transactionTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="transactionTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *     &lt;enumeration value="PLANNED"/&gt;
 *     &lt;enumeration value="DESPATCHED"/&gt;
 *     &lt;enumeration value="RESERVED"/&gt;
 *     &lt;enumeration value="ACKNOWLEDGED"/&gt;
 *     &lt;enumeration value="ACCEPTED"/&gt;
 *     &lt;enumeration value="ARRIVED"/&gt;
 *     &lt;enumeration value="STARTED"/&gt;
 *     &lt;enumeration value="COMPLETED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "transactionTypeType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
public enum TransactionTypeType {

    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    PLANNED("PLANNED"),
    DESPATCHED("DESPATCHED"),
    RESERVED("RESERVED"),
    ACKNOWLEDGED("ACKNOWLEDGED"),
    ACCEPTED("ACCEPTED"),
    ARRIVED("ARRIVED"),
    STARTED("STARTED"),
    COMPLETED("COMPLETED");
    private final String value;

    TransactionTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionTypeType fromValue(String v) {
        for (TransactionTypeType c: TransactionTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package com.xmbrace.otwebserviceapi.autogenerated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for onlyBestSlotsValue.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="onlyBestSlotsValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *     &lt;enumeration value="no"/&gt;
 *     &lt;enumeration value="day"/&gt;
 *     &lt;enumeration value="fullPeriod"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "onlyBestSlotsValue")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
public enum OnlyBestSlotsValue {

    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("no")
    NO("no"),
    @XmlEnumValue("day")
    DAY("day"),
    @XmlEnumValue("fullPeriod")
    FULL_PERIOD("fullPeriod");
    private final String value;

    OnlyBestSlotsValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OnlyBestSlotsValue fromValue(String v) {
        for (OnlyBestSlotsValue c: OnlyBestSlotsValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

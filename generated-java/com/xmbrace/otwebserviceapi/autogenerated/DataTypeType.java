
package com.xmbrace.otwebserviceapi.autogenerated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="dataTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *     &lt;enumeration value="string"/&gt;
 *     &lt;enumeration value="numeric"/&gt;
 *     &lt;enumeration value="date"/&gt;
 *     &lt;enumeration value="datetime"/&gt;
 *     &lt;enumeration value="time"/&gt;
 *     &lt;enumeration value="bool"/&gt;
 *     &lt;enumeration value="url"/&gt;
 *     &lt;enumeration value="fixedUrl"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "dataTypeType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
public enum DataTypeType {

    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("string")
    STRING("string"),
    @XmlEnumValue("numeric")
    NUMERIC("numeric"),
    @XmlEnumValue("date")
    DATE("date"),
    @XmlEnumValue("datetime")
    DATETIME("datetime"),
    @XmlEnumValue("time")
    TIME("time"),
    @XmlEnumValue("bool")
    BOOL("bool"),
    @XmlEnumValue("url")
    URL("url"),
    @XmlEnumValue("fixedUrl")
    FIXED_URL("fixedUrl");
    private final String value;

    DataTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeType fromValue(String v) {
        for (DataTypeType c: DataTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

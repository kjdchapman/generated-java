
package com.xmbrace.otwebserviceapi.autogenerated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for selectBooking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="selectBooking"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="selectBooking" type="{http://autogenerated.OTWebServiceApi.xmbrace.com/}xmbSelectBooking" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "selectBooking", propOrder = {
    "selectBooking"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
public class SelectBooking {

    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected XmbSelectBooking selectBooking;

    /**
     * Gets the value of the selectBooking property.
     * 
     * @return
     *     possible object is
     *     {@link XmbSelectBooking }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public XmbSelectBooking getSelectBooking() {
        return selectBooking;
    }

    /**
     * Sets the value of the selectBooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmbSelectBooking }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public void setSelectBooking(XmbSelectBooking value) {
        this.selectBooking = value;
    }

}

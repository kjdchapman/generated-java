
package com.xmbrace.otwebserviceapi.autogenerated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateBookingCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateBookingCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="updateBookingCode" type="{http://autogenerated.OTWebServiceApi.xmbrace.com/}xmbUpdateBookingCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateBookingCode", propOrder = {
    "updateBookingCode"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
public class UpdateBookingCode {

    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected XmbUpdateBookingCode updateBookingCode;

    /**
     * Gets the value of the updateBookingCode property.
     * 
     * @return
     *     possible object is
     *     {@link XmbUpdateBookingCode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public XmbUpdateBookingCode getUpdateBookingCode() {
        return updateBookingCode;
    }

    /**
     * Sets the value of the updateBookingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmbUpdateBookingCode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public void setUpdateBookingCode(XmbUpdateBookingCode value) {
        this.updateBookingCode = value;
    }

}

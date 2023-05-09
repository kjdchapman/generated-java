
package com.xmbrace.otwebserviceapi.autogenerated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for command complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="command"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autogenerated.OTWebServiceApi.xmbrace.com/}entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "command", propOrder = {
    "id"
})
@XmlSeeAlso({
    XmbCheckAvailability.class,
    XmbCloseSession.class,
    XmbCompleteOrder.class,
    XmbConfirmReservation.class,
    XmbCreateBooking.class,
    XmbCreateOrder.class,
    XmbCreateReservation.class,
    XmbDeleteBooking.class,
    XmbDeleteOrder.class,
    XmbGetSchedule.class,
    XmbOpenSession.class,
    XmbScheduleBooking.class,
    XmbSelectAlerts.class,
    XmbSelectBooking.class,
    XmbSelectMetaData.class,
    XmbSelectOrder.class,
    XmbSelectResource.class,
    XmbUpdateBooking.class,
    XmbUpdateBookingCode.class,
    XmbUpdateLocation.class,
    XmbUpdateOrder.class,
    XmbUpdateResource.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
public class Command
    extends Entity
{

    @XmlElement(defaultValue = "0")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected int id;

    /**
     * Gets the value of the id property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public void setId(int value) {
        this.id = value;
    }

}
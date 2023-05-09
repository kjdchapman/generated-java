
package com.xmbrace.otwebserviceapi.autogenerated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xmbConfirmReservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xmbConfirmReservation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autogenerated.OTWebServiceApi.xmbrace.com/}command"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bookingId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="force" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="resourceLock" type="{http://autogenerated.OTWebServiceApi.xmbrace.com/}bookingResourceLock" minOccurs="0"/&gt;
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="theBooking" type="{http://autogenerated.OTWebServiceApi.xmbrace.com/}booking"/&gt;
 *         &lt;element name="timeLock" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xmbConfirmReservation", propOrder = {
    "bookingId",
    "force",
    "resourceLock",
    "sessionId",
    "theBooking",
    "timeLock",
    "userId"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
public class XmbConfirmReservation
    extends Command
{

    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected int bookingId;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected boolean force;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected BookingResourceLock resourceLock;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected String sessionId;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected Booking theBooking;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected boolean timeLock;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected String userId;

    /**
     * Gets the value of the bookingId property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public int getBookingId() {
        return bookingId;
    }

    /**
     * Sets the value of the bookingId property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public void setBookingId(int value) {
        this.bookingId = value;
    }

    /**
     * Gets the value of the force property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public boolean isForce() {
        return force;
    }

    /**
     * Sets the value of the force property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public void setForce(boolean value) {
        this.force = value;
    }

    /**
     * Gets the value of the resourceLock property.
     * 
     * @return
     *     possible object is
     *     {@link BookingResourceLock }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public BookingResourceLock getResourceLock() {
        return resourceLock;
    }

    /**
     * Sets the value of the resourceLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingResourceLock }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public void setResourceLock(BookingResourceLock value) {
        this.resourceLock = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the theBooking property.
     * 
     * @return
     *     possible object is
     *     {@link Booking }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public Booking getTheBooking() {
        return theBooking;
    }

    /**
     * Sets the value of the theBooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Booking }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public void setTheBooking(Booking value) {
        this.theBooking = value;
    }

    /**
     * Gets the value of the timeLock property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public boolean isTimeLock() {
        return timeLock;
    }

    /**
     * Sets the value of the timeLock property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public void setTimeLock(boolean value) {
        this.timeLock = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public void setUserId(String value) {
        this.userId = value;
    }

}

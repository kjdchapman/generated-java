
package com.xmbrace.otwebserviceapi.autogenerated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for xmbSelectBooking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xmbSelectBooking"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autogenerated.OTWebServiceApi.xmbrace.com/}command"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bookingStatus" type="{http://autogenerated.OTWebServiceApi.xmbrace.com/}transactionTypeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="returnBookingsFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="returnBookingsPWFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="returnBookingsPWTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="returnBookingsTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="theBusinessData" type="{http://autogenerated.OTWebServiceApi.xmbrace.com/}businessData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="theOrderBusinessData" type="{http://autogenerated.OTWebServiceApi.xmbrace.com/}businessData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="theOrderBusinessDataContracts" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="workers" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xmbSelectBooking", propOrder = {
    "bookingStatus",
    "contract",
    "returnBookingsFrom",
    "returnBookingsPWFrom",
    "returnBookingsPWTo",
    "returnBookingsTo",
    "sessionId",
    "theBusinessData",
    "theOrderBusinessData",
    "theOrderBusinessDataContracts",
    "workers"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
public class XmbSelectBooking
    extends Command
{

    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected List<TransactionTypeType> bookingStatus;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected List<String> contract;
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected XMLGregorianCalendar returnBookingsFrom;
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected XMLGregorianCalendar returnBookingsPWFrom;
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected XMLGregorianCalendar returnBookingsPWTo;
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected XMLGregorianCalendar returnBookingsTo;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected String sessionId;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected List<BusinessData> theBusinessData;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected List<BusinessData> theOrderBusinessData;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected List<String> theOrderBusinessDataContracts;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected List<String> workers;

    /**
     * Gets the value of the bookingStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionTypeType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public List<TransactionTypeType> getBookingStatus() {
        if (bookingStatus == null) {
            bookingStatus = new ArrayList<TransactionTypeType>();
        }
        return this.bookingStatus;
    }

    /**
     * Gets the value of the contract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public List<String> getContract() {
        if (contract == null) {
            contract = new ArrayList<String>();
        }
        return this.contract;
    }

    /**
     * Gets the value of the returnBookingsFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public XMLGregorianCalendar getReturnBookingsFrom() {
        return returnBookingsFrom;
    }

    /**
     * Sets the value of the returnBookingsFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public void setReturnBookingsFrom(XMLGregorianCalendar value) {
        this.returnBookingsFrom = value;
    }

    /**
     * Gets the value of the returnBookingsPWFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public XMLGregorianCalendar getReturnBookingsPWFrom() {
        return returnBookingsPWFrom;
    }

    /**
     * Sets the value of the returnBookingsPWFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public void setReturnBookingsPWFrom(XMLGregorianCalendar value) {
        this.returnBookingsPWFrom = value;
    }

    /**
     * Gets the value of the returnBookingsPWTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public XMLGregorianCalendar getReturnBookingsPWTo() {
        return returnBookingsPWTo;
    }

    /**
     * Sets the value of the returnBookingsPWTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public void setReturnBookingsPWTo(XMLGregorianCalendar value) {
        this.returnBookingsPWTo = value;
    }

    /**
     * Gets the value of the returnBookingsTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public XMLGregorianCalendar getReturnBookingsTo() {
        return returnBookingsTo;
    }

    /**
     * Sets the value of the returnBookingsTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public void setReturnBookingsTo(XMLGregorianCalendar value) {
        this.returnBookingsTo = value;
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
     * Gets the value of the theBusinessData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the theBusinessData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTheBusinessData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessData }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public List<BusinessData> getTheBusinessData() {
        if (theBusinessData == null) {
            theBusinessData = new ArrayList<BusinessData>();
        }
        return this.theBusinessData;
    }

    /**
     * Gets the value of the theOrderBusinessData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the theOrderBusinessData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTheOrderBusinessData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessData }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public List<BusinessData> getTheOrderBusinessData() {
        if (theOrderBusinessData == null) {
            theOrderBusinessData = new ArrayList<BusinessData>();
        }
        return this.theOrderBusinessData;
    }

    /**
     * Gets the value of the theOrderBusinessDataContracts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the theOrderBusinessDataContracts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTheOrderBusinessDataContracts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public List<String> getTheOrderBusinessDataContracts() {
        if (theOrderBusinessDataContracts == null) {
            theOrderBusinessDataContracts = new ArrayList<String>();
        }
        return this.theOrderBusinessDataContracts;
    }

    /**
     * Gets the value of the workers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public List<String> getWorkers() {
        if (workers == null) {
            workers = new ArrayList<String>();
        }
        return this.workers;
    }

}

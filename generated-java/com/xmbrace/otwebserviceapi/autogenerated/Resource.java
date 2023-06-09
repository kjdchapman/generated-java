
package com.xmbrace.otwebserviceapi.autogenerated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autogenerated.OTWebServiceApi.xmbrace.com/}entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bookingId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="externalResourceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isResourceLocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="lockResource" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="primaryOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resourceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resourceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="theAbilities" type="{http://autogenerated.OTWebServiceApi.xmbrace.com/}ability" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="theBusinessData" type="{http://autogenerated.OTWebServiceApi.xmbrace.com/}businessData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="theSectors" type="{http://autogenerated.OTWebServiceApi.xmbrace.com/}sector" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="theUnavailabilities" type="{http://autogenerated.OTWebServiceApi.xmbrace.com/}unavailability" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="theWorkingHours" type="{http://autogenerated.OTWebServiceApi.xmbrace.com/}workingHour" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resource", propOrder = {
    "bookingId",
    "externalResourceCode",
    "isResourceLocked",
    "lockResource",
    "orderId",
    "primaryOrderNumber",
    "resourceID",
    "resourceName",
    "theAbilities",
    "theBusinessData",
    "theSectors",
    "theUnavailabilities",
    "theWorkingHours"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
public class Resource
    extends Entity
{

    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected int bookingId;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected String externalResourceCode;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected boolean isResourceLocked;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected boolean lockResource;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected int orderId;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected String primaryOrderNumber;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected String resourceID;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected String resourceName;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected List<Ability> theAbilities;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected List<BusinessData> theBusinessData;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected List<Sector> theSectors;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected List<Unavailability> theUnavailabilities;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected List<WorkingHour> theWorkingHours;

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
     * Gets the value of the externalResourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public String getExternalResourceCode() {
        return externalResourceCode;
    }

    /**
     * Sets the value of the externalResourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public void setExternalResourceCode(String value) {
        this.externalResourceCode = value;
    }

    /**
     * Gets the value of the isResourceLocked property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public boolean isIsResourceLocked() {
        return isResourceLocked;
    }

    /**
     * Sets the value of the isResourceLocked property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public void setIsResourceLocked(boolean value) {
        this.isResourceLocked = value;
    }

    /**
     * Gets the value of the lockResource property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public boolean isLockResource() {
        return lockResource;
    }

    /**
     * Sets the value of the lockResource property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public void setLockResource(boolean value) {
        this.lockResource = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public int getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public void setOrderId(int value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the primaryOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public String getPrimaryOrderNumber() {
        return primaryOrderNumber;
    }

    /**
     * Sets the value of the primaryOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public void setPrimaryOrderNumber(String value) {
        this.primaryOrderNumber = value;
    }

    /**
     * Gets the value of the resourceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public String getResourceID() {
        return resourceID;
    }

    /**
     * Sets the value of the resourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public void setResourceID(String value) {
        this.resourceID = value;
    }

    /**
     * Gets the value of the resourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public String getResourceName() {
        return resourceName;
    }

    /**
     * Sets the value of the resourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public void setResourceName(String value) {
        this.resourceName = value;
    }

    /**
     * Gets the value of the theAbilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the theAbilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTheAbilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ability }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public List<Ability> getTheAbilities() {
        if (theAbilities == null) {
            theAbilities = new ArrayList<Ability>();
        }
        return this.theAbilities;
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
     * Gets the value of the theSectors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the theSectors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTheSectors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sector }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public List<Sector> getTheSectors() {
        if (theSectors == null) {
            theSectors = new ArrayList<Sector>();
        }
        return this.theSectors;
    }

    /**
     * Gets the value of the theUnavailabilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the theUnavailabilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTheUnavailabilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Unavailability }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public List<Unavailability> getTheUnavailabilities() {
        if (theUnavailabilities == null) {
            theUnavailabilities = new ArrayList<Unavailability>();
        }
        return this.theUnavailabilities;
    }

    /**
     * Gets the value of the theWorkingHours property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the theWorkingHours property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTheWorkingHours().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkingHour }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public List<WorkingHour> getTheWorkingHours() {
        if (theWorkingHours == null) {
            theWorkingHours = new ArrayList<WorkingHour>();
        }
        return this.theWorkingHours;
    }

}

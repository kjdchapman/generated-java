
package com.xmbrace.otwebserviceapi.autogenerated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xmbUpdateResource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xmbUpdateResource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autogenerated.OTWebServiceApi.xmbrace.com/}command"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="theResources" type="{http://autogenerated.OTWebServiceApi.xmbrace.com/}resource" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xmbUpdateResource", propOrder = {
    "contract",
    "sessionId",
    "theResources"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
public class XmbUpdateResource
    extends Command
{

    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected List<String> contract;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected String sessionId;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected List<Resource> theResources;

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
     * Gets the value of the theResources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the theResources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTheResources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Resource }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    public List<Resource> getTheResources() {
        if (theResources == null) {
            theResources = new ArrayList<Resource>();
        }
        return this.theResources;
    }

}

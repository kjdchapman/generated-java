
package com.xmbrace.otwebserviceapi.autogenerated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xmbSelectResourceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xmbSelectResourceResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://autogenerated.OTWebServiceApi.xmbrace.com/}commandResponse"&gt;
 *       &lt;sequence&gt;
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
@XmlType(name = "xmbSelectResourceResponse", propOrder = {
    "theResources"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
public class XmbSelectResourceResponse
    extends CommandResponse
{

    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.5", date = "2023-05-09T15:46:53+01:00")
    protected List<Resource> theResources;

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

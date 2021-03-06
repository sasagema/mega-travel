
package com.megatravel.agentbackend.ws;

import com.megatravel.agentbackend.ws.AccommodationSoap;
import com.megatravel.agentbackend.ws.UserSoap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accommodation" type="{http://megatravel.com/booking/ws}accommodationSoap" maxOccurs="unbounded"/>
 *         &lt;element name="agent" type="{http://megatravel.com/booking/ws}userSoap"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accommodation",
    "agent"
})
@XmlRootElement(name = "checkAgentResponse")
public class CheckAgentResponse {

    @XmlElement(required = true)
    protected List<AccommodationSoap> accommodation;
    @XmlElement(required = true)
    protected UserSoap agent;

    /**
     * Gets the value of the accommodation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accommodation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccommodation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccommodationSoap }
     * 
     * 
     */
    public List<AccommodationSoap> getAccommodation() {
        if (accommodation == null) {
            accommodation = new ArrayList<AccommodationSoap>();
        }
        return this.accommodation;
    }

    /**
     * Gets the value of the agent property.
     * 
     * @return
     *     possible object is
     *     {@link UserSoap }
     *     
     */
    public UserSoap getAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserSoap }
     *     
     */
    public void setAgent(UserSoap value) {
        this.agent = value;
    }

}

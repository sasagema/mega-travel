//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.02 at 11:33:10 PM CEST 
//


package com.megatravel.agentbackend.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for message complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="message">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="message_id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="message_content" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="message_reciever" type="{http://megatravel.com/booking}user"/>
 *         &lt;element name="message_sender" type="{http://megatravel.com/booking}user"/>
 *         &lt;element name="message_reservation" type="{http://megatravel.com/booking}reservation"/>
 *       &lt;/sequence>
 *       &lt;attribute name="status" type="{http://megatravel.com/booking}message_status" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "message", propOrder = {
    "messageId",
    "messageContent",
    "messageReciever",
    "messageSender",
    "messageReservation"
})
public class Message {

    @XmlElement(name = "message_id")
    protected long messageId;
    @XmlElement(name = "message_content", required = true)
    protected String messageContent;
    @XmlElement(name = "message_reciever", required = true)
    protected User messageReciever;
    @XmlElement(name = "message_sender", required = true)
    protected User messageSender;
    @XmlElement(name = "message_reservation", required = true)
    protected Reservation messageReservation;
    @XmlAttribute(name = "status")
    protected MessageStatus status;

    /**
     * Gets the value of the messageId property.
     * 
     */
    public long getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     */
    public void setMessageId(long value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the messageContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageContent() {
        return messageContent;
    }

    /**
     * Sets the value of the messageContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageContent(String value) {
        this.messageContent = value;
    }

    /**
     * Gets the value of the messageReciever property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getMessageReciever() {
        return messageReciever;
    }

    /**
     * Sets the value of the messageReciever property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setMessageReciever(User value) {
        this.messageReciever = value;
    }

    /**
     * Gets the value of the messageSender property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getMessageSender() {
        return messageSender;
    }

    /**
     * Sets the value of the messageSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setMessageSender(User value) {
        this.messageSender = value;
    }

    /**
     * Gets the value of the messageReservation property.
     * 
     * @return
     *     possible object is
     *     {@link Reservation }
     *     
     */
    public Reservation getMessageReservation() {
        return messageReservation;
    }

    /**
     * Sets the value of the messageReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reservation }
     *     
     */
    public void setMessageReservation(Reservation value) {
        this.messageReservation = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link MessageStatus }
     *     
     */
    public MessageStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageStatus }
     *     
     */
    public void setStatus(MessageStatus value) {
        this.status = value;
    }

}
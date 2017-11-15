
package ru.fabrikant.api.multi_integration.easuz.method;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkRequestResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkRequestResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestId" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}idString"/&gt;
 *         &lt;element name="ResponseIsReady" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Response" type="{http://api.fabrikant.ru/multi-integration/easuz/method}responseData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkRequestResponse", propOrder = {
    "requestId",
    "responseIsReady",
    "response"
})
public class CheckRequestResponse {

    @XmlElement(name = "RequestId", required = true)
    protected String requestId;
    @XmlElement(name = "ResponseIsReady")
    protected boolean responseIsReady;
    @XmlElement(name = "Response")
    protected ResponseData response;

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the responseIsReady property.
     * 
     */
    public boolean isResponseIsReady() {
        return responseIsReady;
    }

    /**
     * Sets the value of the responseIsReady property.
     * 
     */
    public void setResponseIsReady(boolean value) {
        this.responseIsReady = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseData }
     *     
     */
    public ResponseData getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseData }
     *     
     */
    public void setResponse(ResponseData value) {
        this.response = value;
    }

}

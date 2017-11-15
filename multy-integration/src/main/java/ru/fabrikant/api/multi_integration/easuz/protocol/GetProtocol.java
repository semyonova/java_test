
package ru.fabrikant.api.multi_integration.easuz.protocol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.fabrikant.api.multi_integration.easuz.types.Header;


/**
 * <p>Java class for getProtocol complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getProtocol"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Header" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}header"/&gt;
 *         &lt;element name="PurchaseId" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}idString"/&gt;
 *         &lt;element name="LotId" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}idString"/&gt;
 *         &lt;element name="ProtocolType" type="{http://api.fabrikant.ru/multi-integration/easuz/protocol/}protocolType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProtocol", propOrder = {
    "header",
    "purchaseId",
    "lotId",
    "protocolType"
})
public class GetProtocol {

    @XmlElement(name = "Header", required = true)
    protected Header header;
    @XmlElement(name = "PurchaseId", required = true)
    protected String purchaseId;
    @XmlElement(name = "LotId", required = true)
    protected String lotId;
    @XmlElement(name = "ProtocolType", required = true)
    @XmlSchemaType(name = "string")
    protected ProtocolType protocolType;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link Header }
     *     
     */
    public Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header }
     *     
     */
    public void setHeader(Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the purchaseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseId() {
        return purchaseId;
    }

    /**
     * Sets the value of the purchaseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseId(String value) {
        this.purchaseId = value;
    }

    /**
     * Gets the value of the lotId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotId() {
        return lotId;
    }

    /**
     * Sets the value of the lotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotId(String value) {
        this.lotId = value;
    }

    /**
     * Gets the value of the protocolType property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolType }
     *     
     */
    public ProtocolType getProtocolType() {
        return protocolType;
    }

    /**
     * Sets the value of the protocolType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolType }
     *     
     */
    public void setProtocolType(ProtocolType value) {
        this.protocolType = value;
    }

}

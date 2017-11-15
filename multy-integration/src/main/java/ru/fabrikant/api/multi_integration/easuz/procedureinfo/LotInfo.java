
package ru.fabrikant.api.multi_integration.easuz.procedureinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lotInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lotInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LotId" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}idString"/&gt;
 *         &lt;element name="Status"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="created"/&gt;
 *               &lt;enumeration value="published"/&gt;
 *               &lt;enumeration value="wait_decision"/&gt;
 *               &lt;enumeration value="unsealed"/&gt;
 *               &lt;enumeration value="retrading_waiting_begin"/&gt;
 *               &lt;enumeration value="retrading_under_way"/&gt;
 *               &lt;enumeration value="deleted"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OosStatus"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="not_sent"/&gt;
 *               &lt;enumeration value="sent"/&gt;
 *               &lt;enumeration value="published"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OosUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OosRegNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lotInfo", propOrder = {
    "lotId",
    "status",
    "oosStatus",
    "oosUrl",
    "oosRegNumber"
})
public class LotInfo {

    @XmlElement(name = "LotId", required = true)
    protected String lotId;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "OosStatus", required = true)
    protected String oosStatus;
    @XmlElement(name = "OosUrl")
    protected String oosUrl;
    @XmlElement(name = "OosRegNumber")
    protected String oosRegNumber;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the oosStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOosStatus() {
        return oosStatus;
    }

    /**
     * Sets the value of the oosStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOosStatus(String value) {
        this.oosStatus = value;
    }

    /**
     * Gets the value of the oosUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOosUrl() {
        return oosUrl;
    }

    /**
     * Sets the value of the oosUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOosUrl(String value) {
        this.oosUrl = value;
    }

    /**
     * Gets the value of the oosRegNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOosRegNumber() {
        return oosRegNumber;
    }

    /**
     * Sets the value of the oosRegNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOosRegNumber(String value) {
        this.oosRegNumber = value;
    }

}

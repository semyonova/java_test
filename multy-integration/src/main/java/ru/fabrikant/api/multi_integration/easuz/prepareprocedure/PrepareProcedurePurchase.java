
package ru.fabrikant.api.multi_integration.easuz.prepareprocedure;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.fabrikant.api.multi_integration.easuz.types.Header;


/**
 * <p>Java class for prepareProcedurePurchase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="prepareProcedurePurchase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Header" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}header"/&gt;
 *         &lt;element name="PurchaseId" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}idString"/&gt;
 *         &lt;element name="ProcedurePurchaseType" type="{http://api.fabrikant.ru/multi-integration/easuz/prepareProcedure/}procedurePurchaseType"/&gt;
 *         &lt;element name="Purchase" type="{http://api.fabrikant.ru/multi-integration/easuz/prepareProcedure/}procedurePurchase"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prepareProcedurePurchase", propOrder = {
    "header",
    "purchaseId",
    "procedurePurchaseType",
    "purchase"
})
public class PrepareProcedurePurchase {

    @XmlElement(name = "Header", required = true)
    protected Header header;
    @XmlElement(name = "PurchaseId", required = true)
    protected String purchaseId;
    @XmlElement(name = "ProcedurePurchaseType", required = true)
    @XmlSchemaType(name = "string")
    protected ProcedurePurchaseType procedurePurchaseType;
    @XmlElement(name = "Purchase", required = true)
    protected ProcedurePurchase purchase;

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
     * Gets the value of the procedurePurchaseType property.
     * 
     * @return
     *     possible object is
     *     {@link ProcedurePurchaseType }
     *     
     */
    public ProcedurePurchaseType getProcedurePurchaseType() {
        return procedurePurchaseType;
    }

    /**
     * Sets the value of the procedurePurchaseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedurePurchaseType }
     *     
     */
    public void setProcedurePurchaseType(ProcedurePurchaseType value) {
        this.procedurePurchaseType = value;
    }

    /**
     * Gets the value of the purchase property.
     * 
     * @return
     *     possible object is
     *     {@link ProcedurePurchase }
     *     
     */
    public ProcedurePurchase getPurchase() {
        return purchase;
    }

    /**
     * Sets the value of the purchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedurePurchase }
     *     
     */
    public void setPurchase(ProcedurePurchase value) {
        this.purchase = value;
    }

}

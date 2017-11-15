
package ru.fabrikant.api.multi_integration.easuz.prepareprocedure;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.fabrikant.api.multi_integration.easuz.types.Header;


/**
 * <p>Java class for prepareAuction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="prepareAuction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Header" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}header"/&gt;
 *         &lt;element name="PurchaseId" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}idString"/&gt;
 *         &lt;element name="AuctionType" type="{http://api.fabrikant.ru/multi-integration/easuz/prepareProcedure/}auctionType"/&gt;
 *         &lt;element name="Auction" type="{http://api.fabrikant.ru/multi-integration/easuz/prepareProcedure/}auction"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prepareAuction", propOrder = {
    "header",
    "purchaseId",
    "auctionType",
    "auction"
})
public class PrepareAuction {

    @XmlElement(name = "Header", required = true)
    protected Header header;
    @XmlElement(name = "PurchaseId", required = true)
    protected String purchaseId;
    @XmlElement(name = "AuctionType", required = true)
    @XmlSchemaType(name = "string")
    protected AuctionType auctionType;
    @XmlElement(name = "Auction", required = true)
    protected Auction auction;

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
     * Gets the value of the auctionType property.
     * 
     * @return
     *     possible object is
     *     {@link AuctionType }
     *     
     */
    public AuctionType getAuctionType() {
        return auctionType;
    }

    /**
     * Sets the value of the auctionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuctionType }
     *     
     */
    public void setAuctionType(AuctionType value) {
        this.auctionType = value;
    }

    /**
     * Gets the value of the auction property.
     * 
     * @return
     *     possible object is
     *     {@link Auction }
     *     
     */
    public Auction getAuction() {
        return auction;
    }

    /**
     * Sets the value of the auction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Auction }
     *     
     */
    public void setAuction(Auction value) {
        this.auction = value;
    }

}

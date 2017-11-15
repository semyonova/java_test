
package ru.fabrikant.api.multi_integration.easuz.prepareprocedure;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.fabrikant.api.multi_integration.easuz.types.Customer;
import ru.fabrikant.api.multi_integration.easuz.types.PurchaseMode;


/**
 * Аукцион
 * 
 * <p>Java class for auction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="auction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PurchaseMode" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}purchaseMode"/&gt;
 *         &lt;element name="PurchaseName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CommonName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="300"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NotRNP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Unscheduled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SendingProtocolsByLot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Customer" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}customer" minOccurs="0"/&gt;
 *         &lt;element name="CustomerContacts" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="4000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LotList"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Lot" type="{http://api.fabrikant.ru/multi-integration/easuz/prepareProcedure/}auctionLot" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auction", propOrder = {
    "purchaseMode",
    "purchaseName",
    "commonName",
    "notRNP",
    "unscheduled",
    "sendingProtocolsByLot",
    "customer",
    "customerContacts",
    "lotList"
})
public class Auction {

    @XmlElement(name = "PurchaseMode", required = true)
    @XmlSchemaType(name = "string")
    protected PurchaseMode purchaseMode;
    @XmlElement(name = "PurchaseName", required = true)
    protected String purchaseName;
    @XmlElement(name = "CommonName", required = true)
    protected String commonName;
    @XmlElement(name = "NotRNP")
    protected Boolean notRNP;
    @XmlElement(name = "Unscheduled")
    protected Boolean unscheduled;
    @XmlElement(name = "SendingProtocolsByLot")
    protected Boolean sendingProtocolsByLot;
    @XmlElement(name = "Customer")
    protected Customer customer;
    @XmlElement(name = "CustomerContacts")
    protected String customerContacts;
    @XmlElement(name = "LotList", required = true)
    protected Auction.LotList lotList;

    /**
     * Gets the value of the purchaseMode property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseMode }
     *     
     */
    public PurchaseMode getPurchaseMode() {
        return purchaseMode;
    }

    /**
     * Sets the value of the purchaseMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseMode }
     *     
     */
    public void setPurchaseMode(PurchaseMode value) {
        this.purchaseMode = value;
    }

    /**
     * Gets the value of the purchaseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseName() {
        return purchaseName;
    }

    /**
     * Sets the value of the purchaseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseName(String value) {
        this.purchaseName = value;
    }

    /**
     * Gets the value of the commonName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonName() {
        return commonName;
    }

    /**
     * Sets the value of the commonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonName(String value) {
        this.commonName = value;
    }

    /**
     * Gets the value of the notRNP property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotRNP() {
        return notRNP;
    }

    /**
     * Sets the value of the notRNP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotRNP(Boolean value) {
        this.notRNP = value;
    }

    /**
     * Gets the value of the unscheduled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnscheduled() {
        return unscheduled;
    }

    /**
     * Sets the value of the unscheduled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnscheduled(Boolean value) {
        this.unscheduled = value;
    }

    /**
     * Gets the value of the sendingProtocolsByLot property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendingProtocolsByLot() {
        return sendingProtocolsByLot;
    }

    /**
     * Sets the value of the sendingProtocolsByLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendingProtocolsByLot(Boolean value) {
        this.sendingProtocolsByLot = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCustomer(Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the customerContacts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerContacts() {
        return customerContacts;
    }

    /**
     * Sets the value of the customerContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerContacts(String value) {
        this.customerContacts = value;
    }

    /**
     * Gets the value of the lotList property.
     * 
     * @return
     *     possible object is
     *     {@link Auction.LotList }
     *     
     */
    public Auction.LotList getLotList() {
        return lotList;
    }

    /**
     * Sets the value of the lotList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Auction.LotList }
     *     
     */
    public void setLotList(Auction.LotList value) {
        this.lotList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Lot" type="{http://api.fabrikant.ru/multi-integration/easuz/prepareProcedure/}auctionLot" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "lot"
    })
    public static class LotList {

        @XmlElement(name = "Lot", required = true)
        protected List<AuctionLot> lot;

        /**
         * Gets the value of the lot property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lot property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLot().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AuctionLot }
         * 
         * 
         */
        public List<AuctionLot> getLot() {
            if (lot == null) {
                lot = new ArrayList<AuctionLot>();
            }
            return this.lot;
        }

    }

}

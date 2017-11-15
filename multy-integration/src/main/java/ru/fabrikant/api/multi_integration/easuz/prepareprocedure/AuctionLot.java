
package ru.fabrikant.api.multi_integration.easuz.prepareprocedure;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.fabrikant.api.multi_integration.easuz.types.Currency;
import ru.fabrikant.api.multi_integration.easuz.types.Customer;
import ru.fabrikant.api.multi_integration.easuz.types.NdsType;


/**
 * <p>Java class for auctionLot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="auctionLot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeliveryRegion" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}okatoCode" minOccurs="0"/&gt;
 *         &lt;element name="LotId" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}idString"/&gt;
 *         &lt;element name="Name"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PlanInfo" type="{http://api.fabrikant.ru/multi-integration/easuz/prepareProcedure/}planInfo" minOccurs="0"/&gt;
 *         &lt;element name="OkpdList"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OkpdCode" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}okpdCode" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OkvedCode" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}okvedCode" minOccurs="0"/&gt;
 *         &lt;element name="Customer" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}customer" minOccurs="0"/&gt;
 *         &lt;element name="CustomerContacts" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="4000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Quantity" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}quantity"/&gt;
 *           &lt;element name="Units" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}okeiCode"/&gt;
 *           &lt;element name="PricePerUnit" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}price" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="Currency" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}currency"/&gt;
 *         &lt;element name="StartingPrice" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}price"/&gt;
 *         &lt;element name="NdsType" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}ndsType"/&gt;
 *         &lt;element name="MspLimitation" type="{http://api.fabrikant.ru/multi-integration/easuz/prepareProcedure/}mspLimitation"/&gt;
 *         &lt;element name="MspProvider" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SubmissionEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ReviewDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="BiddingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="SupplyCondition"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="2000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PaymentConditions" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="4000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GiveupInfo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="4000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AdvantagesInfo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="4000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
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
@XmlType(name = "auctionLot", propOrder = {
    "deliveryRegion",
    "lotId",
    "name",
    "planInfo",
    "okpdList",
    "okvedCode",
    "customer",
    "customerContacts",
    "quantity",
    "units",
    "pricePerUnit",
    "currency",
    "startingPrice",
    "ndsType",
    "mspLimitation",
    "mspProvider",
    "submissionEndDate",
    "reviewDate",
    "biddingDate",
    "finishDate",
    "supplyCondition",
    "paymentConditions",
    "giveupInfo",
    "advantagesInfo"
})
public class AuctionLot {

    @XmlElement(name = "DeliveryRegion")
    protected String deliveryRegion;
    @XmlElement(name = "LotId", required = true)
    protected String lotId;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "PlanInfo")
    protected PlanInfo planInfo;
    @XmlElement(name = "OkpdList", required = true)
    protected AuctionLot.OkpdList okpdList;
    @XmlElement(name = "OkvedCode")
    protected String okvedCode;
    @XmlElement(name = "Customer")
    protected Customer customer;
    @XmlElement(name = "CustomerContacts")
    protected String customerContacts;
    @XmlElement(name = "Quantity")
    protected BigDecimal quantity;
    @XmlElement(name = "Units")
    protected String units;
    @XmlElement(name = "PricePerUnit")
    protected BigDecimal pricePerUnit;
    @XmlElement(name = "Currency", required = true)
    @XmlSchemaType(name = "string")
    protected Currency currency;
    @XmlElement(name = "StartingPrice", required = true)
    protected BigDecimal startingPrice;
    @XmlElement(name = "NdsType", required = true)
    @XmlSchemaType(name = "string")
    protected NdsType ndsType;
    @XmlElement(name = "MspLimitation", required = true)
    protected String mspLimitation;
    @XmlElement(name = "MspProvider")
    protected Boolean mspProvider;
    @XmlElement(name = "SubmissionEndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submissionEndDate;
    @XmlElement(name = "ReviewDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reviewDate;
    @XmlElement(name = "BiddingDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar biddingDate;
    @XmlElement(name = "FinishDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finishDate;
    @XmlElement(name = "SupplyCondition", required = true)
    protected String supplyCondition;
    @XmlElement(name = "PaymentConditions")
    protected String paymentConditions;
    @XmlElement(name = "GiveupInfo")
    protected String giveupInfo;
    @XmlElement(name = "AdvantagesInfo")
    protected String advantagesInfo;

    /**
     * Gets the value of the deliveryRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryRegion() {
        return deliveryRegion;
    }

    /**
     * Sets the value of the deliveryRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryRegion(String value) {
        this.deliveryRegion = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the planInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PlanInfo }
     *     
     */
    public PlanInfo getPlanInfo() {
        return planInfo;
    }

    /**
     * Sets the value of the planInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanInfo }
     *     
     */
    public void setPlanInfo(PlanInfo value) {
        this.planInfo = value;
    }

    /**
     * Gets the value of the okpdList property.
     * 
     * @return
     *     possible object is
     *     {@link AuctionLot.OkpdList }
     *     
     */
    public AuctionLot.OkpdList getOkpdList() {
        return okpdList;
    }

    /**
     * Sets the value of the okpdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuctionLot.OkpdList }
     *     
     */
    public void setOkpdList(AuctionLot.OkpdList value) {
        this.okpdList = value;
    }

    /**
     * Gets the value of the okvedCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOkvedCode() {
        return okvedCode;
    }

    /**
     * Sets the value of the okvedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOkvedCode(String value) {
        this.okvedCode = value;
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
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnits(String value) {
        this.units = value;
    }

    /**
     * Gets the value of the pricePerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricePerUnit() {
        return pricePerUnit;
    }

    /**
     * Sets the value of the pricePerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPricePerUnit(BigDecimal value) {
        this.pricePerUnit = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

    /**
     * Gets the value of the startingPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStartingPrice() {
        return startingPrice;
    }

    /**
     * Sets the value of the startingPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStartingPrice(BigDecimal value) {
        this.startingPrice = value;
    }

    /**
     * Gets the value of the ndsType property.
     * 
     * @return
     *     possible object is
     *     {@link NdsType }
     *     
     */
    public NdsType getNdsType() {
        return ndsType;
    }

    /**
     * Sets the value of the ndsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NdsType }
     *     
     */
    public void setNdsType(NdsType value) {
        this.ndsType = value;
    }

    /**
     * Gets the value of the mspLimitation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMspLimitation() {
        return mspLimitation;
    }

    /**
     * Sets the value of the mspLimitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMspLimitation(String value) {
        this.mspLimitation = value;
    }

    /**
     * Gets the value of the mspProvider property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMspProvider() {
        return mspProvider;
    }

    /**
     * Sets the value of the mspProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMspProvider(Boolean value) {
        this.mspProvider = value;
    }

    /**
     * Gets the value of the submissionEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmissionEndDate() {
        return submissionEndDate;
    }

    /**
     * Sets the value of the submissionEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmissionEndDate(XMLGregorianCalendar value) {
        this.submissionEndDate = value;
    }

    /**
     * Gets the value of the reviewDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReviewDate() {
        return reviewDate;
    }

    /**
     * Sets the value of the reviewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReviewDate(XMLGregorianCalendar value) {
        this.reviewDate = value;
    }

    /**
     * Gets the value of the biddingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBiddingDate() {
        return biddingDate;
    }

    /**
     * Sets the value of the biddingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBiddingDate(XMLGregorianCalendar value) {
        this.biddingDate = value;
    }

    /**
     * Gets the value of the finishDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinishDate() {
        return finishDate;
    }

    /**
     * Sets the value of the finishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinishDate(XMLGregorianCalendar value) {
        this.finishDate = value;
    }

    /**
     * Gets the value of the supplyCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplyCondition() {
        return supplyCondition;
    }

    /**
     * Sets the value of the supplyCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplyCondition(String value) {
        this.supplyCondition = value;
    }

    /**
     * Gets the value of the paymentConditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentConditions() {
        return paymentConditions;
    }

    /**
     * Sets the value of the paymentConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentConditions(String value) {
        this.paymentConditions = value;
    }

    /**
     * Gets the value of the giveupInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiveupInfo() {
        return giveupInfo;
    }

    /**
     * Sets the value of the giveupInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiveupInfo(String value) {
        this.giveupInfo = value;
    }

    /**
     * Gets the value of the advantagesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvantagesInfo() {
        return advantagesInfo;
    }

    /**
     * Sets the value of the advantagesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvantagesInfo(String value) {
        this.advantagesInfo = value;
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
     *         &lt;element name="OkpdCode" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}okpdCode" maxOccurs="unbounded"/&gt;
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
        "okpdCode"
    })
    public static class OkpdList {

        @XmlElement(name = "OkpdCode", required = true)
        protected List<String> okpdCode;

        /**
         * Gets the value of the okpdCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the okpdCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOkpdCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOkpdCode() {
            if (okpdCode == null) {
                okpdCode = new ArrayList<String>();
            }
            return this.okpdCode;
        }

    }

}


package ru.fabrikant.api.multi_integration.easuz.prepareprocedure;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.fabrikant.api.multi_integration.easuz.types.Currency;
import ru.fabrikant.api.multi_integration.easuz.types.LotType;


/**
 * <p>Java class for purchaseLot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseLot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LotId" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}idString"/&gt;
 *         &lt;element name="LotType" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}LotType"/&gt;
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
 *         &lt;element name="Quantity" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}quantity" minOccurs="0"/&gt;
 *         &lt;element name="Units" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}okeiCode" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}currency"/&gt;
 *         &lt;element name="PriceInfo" type="{http://api.fabrikant.ru/multi-integration/easuz/prepareProcedure/}priceInfo" minOccurs="0"/&gt;
 *         &lt;element name="ProposalEnsuring" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}price" minOccurs="0"/&gt;
 *         &lt;element name="SupplyCondition"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="2000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SupplyPlace"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="4000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SupplyTime" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="4000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MspLimitation" type="{http://api.fabrikant.ru/multi-integration/easuz/prepareProcedure/}mspLimitation"/&gt;
 *         &lt;element name="MspProvider" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PaymentConditions" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="4000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Comment" minOccurs="0"&gt;
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
@XmlType(name = "purchaseLot", propOrder = {
    "lotId",
    "lotType",
    "name",
    "planInfo",
    "okpdList",
    "okvedCode",
    "quantity",
    "units",
    "currency",
    "priceInfo",
    "proposalEnsuring",
    "supplyCondition",
    "supplyPlace",
    "supplyTime",
    "mspLimitation",
    "mspProvider",
    "paymentConditions",
    "comment"
})
public class PurchaseLot {

    @XmlElement(name = "LotId", required = true)
    protected String lotId;
    @XmlElement(name = "LotType", required = true)
    @XmlSchemaType(name = "string")
    protected LotType lotType;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "PlanInfo")
    protected PlanInfo planInfo;
    @XmlElement(name = "OkpdList", required = true)
    protected PurchaseLot.OkpdList okpdList;
    @XmlElement(name = "OkvedCode")
    protected String okvedCode;
    @XmlElement(name = "Quantity")
    protected BigDecimal quantity;
    @XmlElement(name = "Units")
    protected String units;
    @XmlElement(name = "Currency", required = true)
    @XmlSchemaType(name = "string")
    protected Currency currency;
    @XmlElement(name = "PriceInfo")
    protected PriceInfo priceInfo;
    @XmlElement(name = "ProposalEnsuring")
    protected BigDecimal proposalEnsuring;
    @XmlElement(name = "SupplyCondition", required = true)
    protected String supplyCondition;
    @XmlElement(name = "SupplyPlace", required = true)
    protected String supplyPlace;
    @XmlElement(name = "SupplyTime")
    protected String supplyTime;
    @XmlElement(name = "MspLimitation", required = true)
    protected String mspLimitation;
    @XmlElement(name = "MspProvider")
    protected Boolean mspProvider;
    @XmlElement(name = "PaymentConditions")
    protected String paymentConditions;
    @XmlElement(name = "Comment")
    protected String comment;

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
     * Gets the value of the lotType property.
     * 
     * @return
     *     possible object is
     *     {@link LotType }
     *     
     */
    public LotType getLotType() {
        return lotType;
    }

    /**
     * Sets the value of the lotType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotType }
     *     
     */
    public void setLotType(LotType value) {
        this.lotType = value;
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
     *     {@link PurchaseLot.OkpdList }
     *     
     */
    public PurchaseLot.OkpdList getOkpdList() {
        return okpdList;
    }

    /**
     * Sets the value of the okpdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseLot.OkpdList }
     *     
     */
    public void setOkpdList(PurchaseLot.OkpdList value) {
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
     * Gets the value of the priceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PriceInfo }
     *     
     */
    public PriceInfo getPriceInfo() {
        return priceInfo;
    }

    /**
     * Sets the value of the priceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceInfo }
     *     
     */
    public void setPriceInfo(PriceInfo value) {
        this.priceInfo = value;
    }

    /**
     * Gets the value of the proposalEnsuring property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProposalEnsuring() {
        return proposalEnsuring;
    }

    /**
     * Sets the value of the proposalEnsuring property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProposalEnsuring(BigDecimal value) {
        this.proposalEnsuring = value;
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
     * Gets the value of the supplyPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplyPlace() {
        return supplyPlace;
    }

    /**
     * Sets the value of the supplyPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplyPlace(String value) {
        this.supplyPlace = value;
    }

    /**
     * Gets the value of the supplyTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplyTime() {
        return supplyTime;
    }

    /**
     * Sets the value of the supplyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplyTime(String value) {
        this.supplyTime = value;
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
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
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

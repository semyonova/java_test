
package ru.fabrikant.api.multi_integration.easuz.prepareprocedure;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.fabrikant.api.multi_integration.easuz.types.Customer;
import ru.fabrikant.api.multi_integration.easuz.types.PriceVisibility;
import ru.fabrikant.api.multi_integration.easuz.types.PurchaseMode;


/**
 * Процедура
 * 
 * <p>Java class for procedurePurchase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="procedurePurchase"&gt;
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
 *         &lt;element name="SubmissionEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ReviewDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ReviewPlace" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="PriceVisibility" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}priceVisibility"/&gt;
 *         &lt;element name="NeedUnsealProtocol" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NotRNP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsProlongationUnsealingDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Unscheduled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Customer" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}customer" minOccurs="0"/&gt;
 *         &lt;element name="CustomerContacts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LotList"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Lot" type="{http://api.fabrikant.ru/multi-integration/easuz/prepareProcedure/}purchaseLot" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "procedurePurchase", propOrder = {
    "purchaseMode",
    "purchaseName",
    "commonName",
    "submissionEndDate",
    "reviewDate",
    "reviewPlace",
    "finishDate",
    "priceVisibility",
    "needUnsealProtocol",
    "notRNP",
    "isProlongationUnsealingDate",
    "unscheduled",
    "customer",
    "customerContacts",
    "lotList"
})
public class ProcedurePurchase {

    @XmlElement(name = "PurchaseMode", required = true)
    @XmlSchemaType(name = "string")
    protected PurchaseMode purchaseMode;
    @XmlElement(name = "PurchaseName", required = true)
    protected String purchaseName;
    @XmlElement(name = "CommonName", required = true)
    protected String commonName;
    @XmlElement(name = "SubmissionEndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submissionEndDate;
    @XmlElement(name = "ReviewDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reviewDate;
    @XmlElement(name = "ReviewPlace")
    protected String reviewPlace;
    @XmlElement(name = "FinishDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finishDate;
    @XmlElement(name = "PriceVisibility", required = true)
    @XmlSchemaType(name = "string")
    protected PriceVisibility priceVisibility;
    @XmlElement(name = "NeedUnsealProtocol", defaultValue = "1")
    protected Boolean needUnsealProtocol;
    @XmlElement(name = "NotRNP")
    protected Boolean notRNP;
    @XmlElement(name = "IsProlongationUnsealingDate")
    protected Boolean isProlongationUnsealingDate;
    @XmlElement(name = "Unscheduled")
    protected Boolean unscheduled;
    @XmlElement(name = "Customer")
    protected Customer customer;
    @XmlElement(name = "CustomerContacts")
    protected String customerContacts;
    @XmlElement(name = "LotList", required = true)
    protected ProcedurePurchase.LotList lotList;

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
     * Gets the value of the reviewPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewPlace() {
        return reviewPlace;
    }

    /**
     * Sets the value of the reviewPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewPlace(String value) {
        this.reviewPlace = value;
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
     * Gets the value of the priceVisibility property.
     * 
     * @return
     *     possible object is
     *     {@link PriceVisibility }
     *     
     */
    public PriceVisibility getPriceVisibility() {
        return priceVisibility;
    }

    /**
     * Sets the value of the priceVisibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceVisibility }
     *     
     */
    public void setPriceVisibility(PriceVisibility value) {
        this.priceVisibility = value;
    }

    /**
     * Gets the value of the needUnsealProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNeedUnsealProtocol() {
        return needUnsealProtocol;
    }

    /**
     * Sets the value of the needUnsealProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNeedUnsealProtocol(Boolean value) {
        this.needUnsealProtocol = value;
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
     * Gets the value of the isProlongationUnsealingDate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsProlongationUnsealingDate() {
        return isProlongationUnsealingDate;
    }

    /**
     * Sets the value of the isProlongationUnsealingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsProlongationUnsealingDate(Boolean value) {
        this.isProlongationUnsealingDate = value;
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
     *     {@link ProcedurePurchase.LotList }
     *     
     */
    public ProcedurePurchase.LotList getLotList() {
        return lotList;
    }

    /**
     * Sets the value of the lotList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedurePurchase.LotList }
     *     
     */
    public void setLotList(ProcedurePurchase.LotList value) {
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
     *         &lt;element name="Lot" type="{http://api.fabrikant.ru/multi-integration/easuz/prepareProcedure/}purchaseLot" maxOccurs="unbounded"/&gt;
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
        protected List<PurchaseLot> lot;

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
         * {@link PurchaseLot }
         * 
         * 
         */
        public List<PurchaseLot> getLot() {
            if (lot == null) {
                lot = new ArrayList<PurchaseLot>();
            }
            return this.lot;
        }

    }

}

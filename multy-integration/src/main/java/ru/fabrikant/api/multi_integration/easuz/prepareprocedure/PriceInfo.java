
package ru.fabrikant.api.multi_integration.easuz.prepareprocedure;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.fabrikant.api.multi_integration.easuz.types.NdsType;


/**
 * <p>Java class for priceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="priceInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartingPrice" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}price"/&gt;
 *         &lt;element name="PricePerUnit" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}price" minOccurs="0"/&gt;
 *         &lt;element name="NdsType" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}ndsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "priceInfo", propOrder = {
    "startingPrice",
    "pricePerUnit",
    "ndsType"
})
public class PriceInfo {

    @XmlElement(name = "StartingPrice", required = true)
    protected BigDecimal startingPrice;
    @XmlElement(name = "PricePerUnit")
    protected BigDecimal pricePerUnit;
    @XmlElement(name = "NdsType", required = true)
    @XmlSchemaType(name = "string")
    protected NdsType ndsType;

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

}

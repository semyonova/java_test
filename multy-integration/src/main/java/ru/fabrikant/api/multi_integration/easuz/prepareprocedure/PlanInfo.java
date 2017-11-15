
package ru.fabrikant.api.multi_integration.easuz.prepareprocedure;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for planInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="planInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PlanRegistrationNumber"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d{10}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PositionNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "planInfo", propOrder = {
    "planRegistrationNumber",
    "positionNumber"
})
public class PlanInfo {

    @XmlElement(name = "PlanRegistrationNumber", required = true)
    protected String planRegistrationNumber;
    @XmlElement(name = "PositionNumber")
    protected long positionNumber;

    /**
     * Gets the value of the planRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanRegistrationNumber() {
        return planRegistrationNumber;
    }

    /**
     * Sets the value of the planRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanRegistrationNumber(String value) {
        this.planRegistrationNumber = value;
    }

    /**
     * Gets the value of the positionNumber property.
     * 
     */
    public long getPositionNumber() {
        return positionNumber;
    }

    /**
     * Sets the value of the positionNumber property.
     * 
     */
    public void setPositionNumber(long value) {
        this.positionNumber = value;
    }

}

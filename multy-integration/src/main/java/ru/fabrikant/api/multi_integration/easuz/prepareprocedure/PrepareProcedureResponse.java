
package ru.fabrikant.api.multi_integration.easuz.prepareprocedure;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.fabrikant.api.multi_integration.easuz.types.ErrorData;


/**
 * <p>Java class for prepareProcedureResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="prepareProcedureResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="ProcedureUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="ProcedureNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="Error" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}errorData" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prepareProcedureResponse", propOrder = {
    "procedureUrl",
    "procedureNumber",
    "error"
})
public class PrepareProcedureResponse {

    @XmlElement(name = "ProcedureUrl")
    protected String procedureUrl;
    @XmlElement(name = "ProcedureNumber")
    protected String procedureNumber;
    @XmlElement(name = "Error")
    protected ErrorData error;

    /**
     * Gets the value of the procedureUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcedureUrl() {
        return procedureUrl;
    }

    /**
     * Sets the value of the procedureUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcedureUrl(String value) {
        this.procedureUrl = value;
    }

    /**
     * Gets the value of the procedureNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcedureNumber() {
        return procedureNumber;
    }

    /**
     * Sets the value of the procedureNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcedureNumber(String value) {
        this.procedureNumber = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorData }
     *     
     */
    public ErrorData getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorData }
     *     
     */
    public void setError(ErrorData value) {
        this.error = value;
    }

}

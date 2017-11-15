
package ru.fabrikant.api.multi_integration.easuz.protocol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.fabrikant.api.multi_integration.easuz.types.ErrorData;
import ru.fabrikant.api.multi_integration.easuz.types.FileInstance;


/**
 * <p>Java class for getProtocolResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getProtocolResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ProtocolFile" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}fileInstance"/&gt;
 *         &lt;element name="Error" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}errorData"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProtocolResponse", propOrder = {
    "protocolFile",
    "error"
})
public class GetProtocolResponse {

    @XmlElement(name = "ProtocolFile")
    protected FileInstance protocolFile;
    @XmlElement(name = "Error")
    protected ErrorData error;

    /**
     * Gets the value of the protocolFile property.
     * 
     * @return
     *     possible object is
     *     {@link FileInstance }
     *     
     */
    public FileInstance getProtocolFile() {
        return protocolFile;
    }

    /**
     * Sets the value of the protocolFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileInstance }
     *     
     */
    public void setProtocolFile(FileInstance value) {
        this.protocolFile = value;
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

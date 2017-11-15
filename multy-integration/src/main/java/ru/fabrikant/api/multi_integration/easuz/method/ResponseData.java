
package ru.fabrikant.api.multi_integration.easuz.method;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.fabrikant.api.multi_integration.easuz.prepareprocedure.PrepareProcedureResponse;
import ru.fabrikant.api.multi_integration.easuz.uploadfile.UploadProcedureFileResponse;


/**
 * <p>Java class for responseData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://api.fabrikant.ru/multi-integration/easuz/method}PrepareProcedureResponse"/&gt;
 *         &lt;element ref="{http://api.fabrikant.ru/multi-integration/easuz/method}UploadProcedureFileResponse"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseData", propOrder = {
    "prepareProcedureResponse",
    "uploadProcedureFileResponse"
})
public class ResponseData {

    @XmlElement(name = "PrepareProcedureResponse")
    protected PrepareProcedureResponse prepareProcedureResponse;
    @XmlElement(name = "UploadProcedureFileResponse")
    protected UploadProcedureFileResponse uploadProcedureFileResponse;

    /**
     * Gets the value of the prepareProcedureResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PrepareProcedureResponse }
     *     
     */
    public PrepareProcedureResponse getPrepareProcedureResponse() {
        return prepareProcedureResponse;
    }

    /**
     * Sets the value of the prepareProcedureResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepareProcedureResponse }
     *     
     */
    public void setPrepareProcedureResponse(PrepareProcedureResponse value) {
        this.prepareProcedureResponse = value;
    }

    /**
     * Gets the value of the uploadProcedureFileResponse property.
     * 
     * @return
     *     possible object is
     *     {@link UploadProcedureFileResponse }
     *     
     */
    public UploadProcedureFileResponse getUploadProcedureFileResponse() {
        return uploadProcedureFileResponse;
    }

    /**
     * Sets the value of the uploadProcedureFileResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadProcedureFileResponse }
     *     
     */
    public void setUploadProcedureFileResponse(UploadProcedureFileResponse value) {
        this.uploadProcedureFileResponse = value;
    }

}

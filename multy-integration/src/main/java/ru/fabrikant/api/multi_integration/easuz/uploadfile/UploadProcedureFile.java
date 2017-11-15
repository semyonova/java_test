
package ru.fabrikant.api.multi_integration.easuz.uploadfile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.fabrikant.api.multi_integration.easuz.types.FileInstance;
import ru.fabrikant.api.multi_integration.easuz.types.Header;


/**
 * <p>Java class for uploadProcedureFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uploadProcedureFile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Header" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}header"/&gt;
 *         &lt;element name="PurchaseId" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}idString"/&gt;
 *         &lt;element name="LotId" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}idString" minOccurs="0"/&gt;
 *         &lt;element name="FileId" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}idString"/&gt;
 *         &lt;element name="FileInstance" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}fileInstance"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadProcedureFile", propOrder = {
    "header",
    "purchaseId",
    "lotId",
    "fileId",
    "fileInstance"
})
public class UploadProcedureFile {

    @XmlElement(name = "Header", required = true)
    protected Header header;
    @XmlElement(name = "PurchaseId", required = true)
    protected String purchaseId;
    @XmlElement(name = "LotId")
    protected String lotId;
    @XmlElement(name = "FileId", required = true)
    protected String fileId;
    @XmlElement(name = "FileInstance", required = true)
    protected FileInstance fileInstance;

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
     * Gets the value of the fileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * Sets the value of the fileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileId(String value) {
        this.fileId = value;
    }

    /**
     * Gets the value of the fileInstance property.
     * 
     * @return
     *     possible object is
     *     {@link FileInstance }
     *     
     */
    public FileInstance getFileInstance() {
        return fileInstance;
    }

    /**
     * Sets the value of the fileInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileInstance }
     *     
     */
    public void setFileInstance(FileInstance value) {
        this.fileInstance = value;
    }

}

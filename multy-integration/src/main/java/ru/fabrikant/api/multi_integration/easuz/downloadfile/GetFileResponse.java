
package ru.fabrikant.api.multi_integration.easuz.downloadfile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.fabrikant.api.multi_integration.easuz.types.FileInstance;


/**
 * <p>Java class for getFileResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getFileResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
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
@XmlType(name = "getFileResponse", propOrder = {
    "fileId",
    "fileInstance"
})
public class GetFileResponse {

    @XmlElement(name = "FileId", required = true)
    protected String fileId;
    @XmlElement(name = "FileInstance", required = true)
    protected FileInstance fileInstance;

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

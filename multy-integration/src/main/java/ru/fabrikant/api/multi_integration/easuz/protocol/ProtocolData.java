
package ru.fabrikant.api.multi_integration.easuz.protocol;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Протокол
 * 
 * <p>Java class for protocolData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Protocol" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}idString"/&gt;
 *         &lt;element name="ProtocolFileList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FileId" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}idString" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "protocolData", propOrder = {
    "protocol",
    "protocolFileList"
})
public class ProtocolData {

    @XmlElement(name = "Protocol", required = true)
    protected String protocol;
    @XmlElement(name = "ProtocolFileList")
    protected ProtocolData.ProtocolFileList protocolFileList;

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocol(String value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the protocolFileList property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolData.ProtocolFileList }
     *     
     */
    public ProtocolData.ProtocolFileList getProtocolFileList() {
        return protocolFileList;
    }

    /**
     * Sets the value of the protocolFileList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolData.ProtocolFileList }
     *     
     */
    public void setProtocolFileList(ProtocolData.ProtocolFileList value) {
        this.protocolFileList = value;
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
     *         &lt;element name="FileId" type="{http://api.fabrikant.ru/multi-integration/easuz/types/}idString" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "fileId"
    })
    public static class ProtocolFileList {

        @XmlElement(name = "FileId")
        protected List<String> fileId;

        /**
         * Gets the value of the fileId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fileId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFileId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getFileId() {
            if (fileId == null) {
                fileId = new ArrayList<String>();
            }
            return this.fileId;
        }

    }

}

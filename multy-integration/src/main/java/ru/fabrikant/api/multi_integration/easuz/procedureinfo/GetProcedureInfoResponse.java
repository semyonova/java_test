
package ru.fabrikant.api.multi_integration.easuz.procedureinfo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getProcedureInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getProcedureInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProcedureUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ProcedureNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LotInfoList"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LotInfo" type="{http://api.fabrikant.ru/multi-integration/easuz/procedureInfo/}lotInfo" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "getProcedureInfoResponse", propOrder = {
    "procedureUrl",
    "procedureNumber",
    "lotInfoList"
})
public class GetProcedureInfoResponse {

    @XmlElement(name = "ProcedureUrl", required = true)
    protected String procedureUrl;
    @XmlElement(name = "ProcedureNumber", required = true)
    protected String procedureNumber;
    @XmlElement(name = "LotInfoList", required = true)
    protected GetProcedureInfoResponse.LotInfoList lotInfoList;

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
     * Gets the value of the lotInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link GetProcedureInfoResponse.LotInfoList }
     *     
     */
    public GetProcedureInfoResponse.LotInfoList getLotInfoList() {
        return lotInfoList;
    }

    /**
     * Sets the value of the lotInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetProcedureInfoResponse.LotInfoList }
     *     
     */
    public void setLotInfoList(GetProcedureInfoResponse.LotInfoList value) {
        this.lotInfoList = value;
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
     *         &lt;element name="LotInfo" type="{http://api.fabrikant.ru/multi-integration/easuz/procedureInfo/}lotInfo" maxOccurs="unbounded"/&gt;
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
        "lotInfo"
    })
    public static class LotInfoList {

        @XmlElement(name = "LotInfo", required = true)
        protected List<LotInfo> lotInfo;

        /**
         * Gets the value of the lotInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lotInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLotInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LotInfo }
         * 
         * 
         */
        public List<LotInfo> getLotInfo() {
            if (lotInfo == null) {
                lotInfo = new ArrayList<LotInfo>();
            }
            return this.lotInfo;
        }

    }

}

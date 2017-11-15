
package ru.fabrikant.api.multi_integration.easuz.prepareprocedure;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for auctionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="auctionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="auction"/&gt;
 *     &lt;enumeration value="quotations_request"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "auctionType")
@XmlEnum
public enum AuctionType {


    /**
     * Аукцион
     * 
     */
    @XmlEnumValue("auction")
    AUCTION("auction"),

    /**
     * Запрос котировок
     * 
     */
    @XmlEnumValue("quotations_request")
    QUOTATIONS_REQUEST("quotations_request");
    private final String value;

    AuctionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuctionType fromValue(String v) {
        for (AuctionType c: AuctionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

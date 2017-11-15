
package ru.fabrikant.api.multi_integration.easuz.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for priceVisibility.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="priceVisibility"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="own"/&gt;
 *     &lt;enumeration value="best"/&gt;
 *     &lt;enumeration value="all"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "priceVisibility")
@XmlEnum
public enum PriceVisibility {


    /**
     * Только собственные предложения
     * 
     */
    @XmlEnumValue("own")
    OWN("own"),

    /**
     * Лучшая цена на данный момент
     * 
     */
    @XmlEnumValue("best")
    BEST("best"),

    /**
     * Цены всех поставщиков
     * 
     */
    @XmlEnumValue("all")
    ALL("all");
    private final String value;

    PriceVisibility(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PriceVisibility fromValue(String v) {
        for (PriceVisibility c: PriceVisibility.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

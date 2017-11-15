
package ru.fabrikant.api.multi_integration.easuz.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LotType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LotType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="mtr"/&gt;
 *     &lt;enumeration value="work"/&gt;
 *     &lt;enumeration value="service"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LotType")
@XmlEnum
public enum LotType {


    /**
     * МТР
     * 
     */
    @XmlEnumValue("mtr")
    MTR("mtr"),

    /**
     * Работы
     * 
     */
    @XmlEnumValue("work")
    WORK("work"),

    /**
     * Услуги
     * 
     */
    @XmlEnumValue("service")
    SERVICE("service");
    private final String value;

    LotType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LotType fromValue(String v) {
        for (LotType c: LotType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

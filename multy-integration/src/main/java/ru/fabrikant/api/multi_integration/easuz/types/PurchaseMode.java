
package ru.fabrikant.api.multi_integration.easuz.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for purchaseMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="purchaseMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="open"/&gt;
 *     &lt;enumeration value="closed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "purchaseMode")
@XmlEnum
public enum PurchaseMode {


    /**
     * открытая форма
     * 
     */
    @XmlEnumValue("open")
    OPEN("open"),

    /**
     * закрытая форма (необходимо разослать персональные приглашения)
     * 
     */
    @XmlEnumValue("closed")
    CLOSED("closed");
    private final String value;

    PurchaseMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PurchaseMode fromValue(String v) {
        for (PurchaseMode c: PurchaseMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

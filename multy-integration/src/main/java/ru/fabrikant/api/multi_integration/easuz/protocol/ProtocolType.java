
package ru.fabrikant.api.multi_integration.easuz.protocol;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for protocolType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="protocolType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="unsealing"/&gt;
 *     &lt;enumeration value="determination"/&gt;
 *     &lt;enumeration value="determination_final"/&gt;
 *     &lt;enumeration value="final"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "protocolType")
@XmlEnum
public enum ProtocolType {


    /**
     *  Протокол вскрытия конвертов 
     * 
     */
    @XmlEnumValue("unsealing")
    UNSEALING("unsealing"),

    /**
     *  Протокол определения участников 
     * 
     */
    @XmlEnumValue("determination")
    DETERMINATION("determination"),

    /**
     *  Протокол оценки и сопоставления 
     * 
     */
    @XmlEnumValue("determination_final")
    DETERMINATION_FINAL("determination_final"),

    /**
     *  Протокол проведения процедуры 
     * 
     */
    @XmlEnumValue("final")
    FINAL("final");
    private final String value;

    ProtocolType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProtocolType fromValue(String v) {
        for (ProtocolType c: ProtocolType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package ru.fabrikant.api.multi_integration.easuz.prepareprocedure;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for procedurePurchaseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="procedurePurchaseType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="tender"/&gt;
 *     &lt;enumeration value="proposal_request"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "procedurePurchaseType")
@XmlEnum
public enum ProcedurePurchaseType {


    /**
     * Конкурс
     * 
     */
    @XmlEnumValue("tender")
    TENDER("tender"),

    /**
     * Запрос предложений
     * 
     */
    @XmlEnumValue("proposal_request")
    PROPOSAL_REQUEST("proposal_request");
    private final String value;

    ProcedurePurchaseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProcedurePurchaseType fromValue(String v) {
        for (ProcedurePurchaseType c: ProcedurePurchaseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

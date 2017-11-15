
package ru.fabrikant.api.multi_integration.easuz.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ndsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ndsType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="nds_10"/&gt;
 *     &lt;enumeration value="nds_18"/&gt;
 *     &lt;enumeration value="without_nds"/&gt;
 *     &lt;enumeration value="not_payer_nds"/&gt;
 *     &lt;enumeration value="not_subject_to_nds"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ndsType")
@XmlEnum
public enum NdsType {


    /**
     * В том числе НДС 10%
     * 
     */
    @XmlEnumValue("nds_10")
    NDS_10("nds_10"),

    /**
     * В том числе НДС 18%
     * 
     */
    @XmlEnumValue("nds_18")
    NDS_18("nds_18"),

    /**
     * Без НДС
     * 
     */
    @XmlEnumValue("without_nds")
    WITHOUT_NDS("without_nds"),

    /**
     * Без НДС (плательщиком НДС не является)
     * 
     */
    @XmlEnumValue("not_payer_nds")
    NOT_PAYER_NDS("not_payer_nds"),

    /**
     * НДС не облагается
     * 
     */
    @XmlEnumValue("not_subject_to_nds")
    NOT_SUBJECT_TO_NDS("not_subject_to_nds");
    private final String value;

    NdsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NdsType fromValue(String v) {
        for (NdsType c: NdsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

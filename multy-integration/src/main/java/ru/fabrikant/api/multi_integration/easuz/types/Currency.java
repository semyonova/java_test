
package ru.fabrikant.api.multi_integration.easuz.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for currency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="currency"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RUB"/&gt;
 *     &lt;enumeration value="USD"/&gt;
 *     &lt;enumeration value="EUR"/&gt;
 *     &lt;enumeration value="GBP"/&gt;
 *     &lt;enumeration value="UAH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "currency")
@XmlEnum
public enum Currency {


    /**
     * Российский рубль
     * 
     */
    RUB,

    /**
     * Американский доллар
     * 
     */
    USD,

    /**
     * Евро
     * 
     */
    EUR,

    /**
     * Фунт стерлингов
     * 
     */
    GBP,

    /**
     * Украинская гривна
     * 
     */
    UAH;

    public String value() {
        return name();
    }

    public static Currency fromValue(String v) {
        return valueOf(v);
    }

}

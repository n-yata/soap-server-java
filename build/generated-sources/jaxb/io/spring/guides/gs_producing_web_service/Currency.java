//
// このファイルは、Eclipse Implementation of JAXB、v4.0.5によって生成されました 
// https://eclipse-ee4j.github.io/jaxb-riを参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
//


package io.spring.guides.gs_producing_web_service;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>currencyのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <pre>{@code
 * <simpleType name="currency">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="GBP"/>
 *     <enumeration value="EUR"/>
 *     <enumeration value="PLN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "currency")
@XmlEnum
public enum Currency {

    GBP,
    EUR,
    PLN;

    public String value() {
        return name();
    }

    public static Currency fromValue(String v) {
        return valueOf(v);
    }

}

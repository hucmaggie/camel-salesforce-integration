/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue Mar 03 16:30:57 PST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist QuarterPrefix
 */
public enum QuarterPrefixEnum {

    // Quarter
    QUARTER("Quarter"),
    // FQ
    FQ("FQ"),
    // Q
    Q("Q"),
    // Trimester
    TRIMESTER("Trimester");

    final String value;

    private QuarterPrefixEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static QuarterPrefixEnum fromValue(String value) {
        for (QuarterPrefixEnum e : QuarterPrefixEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
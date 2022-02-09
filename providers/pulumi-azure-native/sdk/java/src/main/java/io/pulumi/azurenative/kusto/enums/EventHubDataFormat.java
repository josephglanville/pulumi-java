// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum EventHubDataFormat {
        MULTIJSON("MULTIJSON"),
        JSON("JSON"),
        CSV("CSV"),
        TSV("TSV"),
        SCSV("SCSV"),
        SOHSV("SOHSV"),
        PSV("PSV"),
        TXT("TXT"),
        RAW("RAW"),
        SINGLEJSON("SINGLEJSON"),
        AVRO("AVRO"),
        TSVE("TSVE"),
        PARQUET("PARQUET"),
        ORC("ORC"),
        APACHEAVRO("APACHEAVRO"),
        W3CLOGFILE("W3CLOGFILE");

        private final String value;

        EventHubDataFormat(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EventHubDataFormat[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }

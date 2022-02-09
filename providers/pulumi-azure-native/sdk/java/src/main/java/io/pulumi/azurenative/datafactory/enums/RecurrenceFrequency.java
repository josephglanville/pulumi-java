// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum RecurrenceFrequency {
        NotSpecified("NotSpecified"),
        Minute("Minute"),
        Hour("Hour"),
        Day("Day"),
        Week("Week"),
        Month("Month"),
        Year("Year");

        private final String value;

        RecurrenceFrequency(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RecurrenceFrequency[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }

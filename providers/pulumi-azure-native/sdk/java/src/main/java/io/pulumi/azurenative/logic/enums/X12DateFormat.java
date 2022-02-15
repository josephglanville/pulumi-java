// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum X12DateFormat {
        NotSpecified("NotSpecified"),
        CCYYMMDD("CCYYMMDD"),
        YYMMDD("YYMMDD");

        private final String value;

        X12DateFormat(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "X12DateFormat[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
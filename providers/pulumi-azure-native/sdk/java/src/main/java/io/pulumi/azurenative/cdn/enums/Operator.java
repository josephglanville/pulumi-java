// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum Operator {
        Any("Any"),
        IPMatch("IPMatch"),
        GeoMatch("GeoMatch"),
        Equal("Equal"),
        Contains("Contains"),
        LessThan("LessThan"),
        GreaterThan("GreaterThan"),
        LessThanOrEqual("LessThanOrEqual"),
        GreaterThanOrEqual("GreaterThanOrEqual"),
        BeginsWith("BeginsWith"),
        EndsWith("EndsWith"),
        RegEx("RegEx");

        private final String value;

        Operator(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "Operator[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }

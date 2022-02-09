// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum UrlFileExtensionOperator {
        Any("Any"),
        Equal("Equal"),
        Contains("Contains"),
        BeginsWith("BeginsWith"),
        EndsWith("EndsWith"),
        LessThan("LessThan"),
        LessThanOrEqual("LessThanOrEqual"),
        GreaterThan("GreaterThan"),
        GreaterThanOrEqual("GreaterThanOrEqual"),
        RegEx("RegEx");

        private final String value;

        UrlFileExtensionOperator(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "UrlFileExtensionOperator[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }

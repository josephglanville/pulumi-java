// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum Transform {
        Lowercase("Lowercase"),
        Uppercase("Uppercase"),
        Trim("Trim"),
        UrlDecode("UrlDecode"),
        UrlEncode("UrlEncode"),
        RemoveNulls("RemoveNulls");

        private final String value;

        Transform(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "Transform[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }

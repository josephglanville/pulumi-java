// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rds.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum DBProxyAuthFormatIAMAuth {
        Disabled("DISABLED"),
        Required("REQUIRED");

        private final String value;

        DBProxyAuthFormatIAMAuth(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DBProxyAuthFormatIAMAuth[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
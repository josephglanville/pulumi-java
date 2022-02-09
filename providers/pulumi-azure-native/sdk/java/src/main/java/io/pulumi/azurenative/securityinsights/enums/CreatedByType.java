// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum CreatedByType {
        User("User"),
        Application("Application"),
        ManagedIdentity("ManagedIdentity"),
        Key("Key");

        private final String value;

        CreatedByType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CreatedByType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }

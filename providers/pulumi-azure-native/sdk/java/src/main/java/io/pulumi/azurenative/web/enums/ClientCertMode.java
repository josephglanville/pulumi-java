// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum ClientCertMode {
        Required("Required"),
        Optional("Optional"),
        OptionalInteractiveUser("OptionalInteractiveUser");

        private final String value;

        ClientCertMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ClientCertMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.vmwarecloudsimple.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum DiskIndependenceMode {
        Persistent("persistent"),
        Independent_persistent("independent_persistent"),
        Independent_nonpersistent("independent_nonpersistent");

        private final String value;

        DiskIndependenceMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DiskIndependenceMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }

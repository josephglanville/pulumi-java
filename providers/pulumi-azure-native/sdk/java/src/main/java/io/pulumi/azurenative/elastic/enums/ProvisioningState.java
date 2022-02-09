// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.elastic.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum ProvisioningState {
        Accepted("Accepted"),
        Creating("Creating"),
        Updating("Updating"),
        Deleting("Deleting"),
        Succeeded("Succeeded"),
        Failed("Failed"),
        Canceled("Canceled"),
        Deleted("Deleted"),
        NotSpecified("NotSpecified");

        private final String value;

        ProvisioningState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ProvisioningState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azureactivedirectory.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum B2CResourceSKUName {
        Standard("Standard"),
        PremiumP1("PremiumP1"),
        PremiumP2("PremiumP2");

        private final String value;

        B2CResourceSKUName(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "B2CResourceSKUName[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }

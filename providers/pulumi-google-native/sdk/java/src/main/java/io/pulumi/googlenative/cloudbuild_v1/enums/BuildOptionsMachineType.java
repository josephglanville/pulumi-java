// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum BuildOptionsMachineType {
        Unspecified("UNSPECIFIED"),
        N1Highcpu8("N1_HIGHCPU_8"),
        N1Highcpu32("N1_HIGHCPU_32"),
        E2Highcpu8("E2_HIGHCPU_8"),
        E2Highcpu32("E2_HIGHCPU_32");

        private final String value;

        BuildOptionsMachineType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BuildOptionsMachineType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
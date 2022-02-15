// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_alpha.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum InputMappingLocation {
        Unknown("UNKNOWN"),
        Path("PATH"),
        Query("QUERY"),
        Body("BODY"),
        Header("HEADER");

        private final String value;

        InputMappingLocation(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InputMappingLocation[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
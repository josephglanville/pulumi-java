// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum SubnetworkIpv6AccessType {
        External("EXTERNAL"),
        UnspecifiedIpv6AccessType("UNSPECIFIED_IPV6_ACCESS_TYPE");

        private final String value;

        SubnetworkIpv6AccessType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SubnetworkIpv6AccessType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
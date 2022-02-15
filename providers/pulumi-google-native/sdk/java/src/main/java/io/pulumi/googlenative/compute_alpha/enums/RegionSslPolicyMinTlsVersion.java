// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum RegionSslPolicyMinTlsVersion {
        Tls10("TLS_1_0"),
        Tls11("TLS_1_1"),
        Tls12("TLS_1_2");

        private final String value;

        RegionSslPolicyMinTlsVersion(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RegionSslPolicyMinTlsVersion[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum CloudRunConfigLoadBalancerType {
        LoadBalancerTypeUnspecified("LOAD_BALANCER_TYPE_UNSPECIFIED"),
        LoadBalancerTypeExternal("LOAD_BALANCER_TYPE_EXTERNAL"),
        LoadBalancerTypeInternal("LOAD_BALANCER_TYPE_INTERNAL");

        private final String value;

        CloudRunConfigLoadBalancerType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CloudRunConfigLoadBalancerType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
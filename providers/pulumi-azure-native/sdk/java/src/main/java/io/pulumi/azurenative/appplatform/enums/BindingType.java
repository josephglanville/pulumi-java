// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum BindingType {
        ApplicationInsights("ApplicationInsights"),
        ApacheSkyWalking("ApacheSkyWalking"),
        AppDynamics("AppDynamics"),
        Dynatrace("Dynatrace"),
        NewRelic("NewRelic"),
        ElasticAPM("ElasticAPM");

        private final String value;

        BindingType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BindingType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum GoogleCloudMlV1__TrainingInputScaleTier {
        Basic("BASIC"),
        Standard1("STANDARD_1"),
        Premium1("PREMIUM_1"),
        BasicGpu("BASIC_GPU"),
        BasicTpu("BASIC_TPU"),
        Custom("CUSTOM");

        private final String value;

        GoogleCloudMlV1__TrainingInputScaleTier(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudMlV1__TrainingInputScaleTier[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
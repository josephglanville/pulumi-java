// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum RoboDirectiveActionType {
        ActionTypeUnspecified("ACTION_TYPE_UNSPECIFIED"),
        SingleClick("SINGLE_CLICK"),
        EnterText("ENTER_TEXT"),
        Ignore("IGNORE");

        private final String value;

        RoboDirectiveActionType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RoboDirectiveActionType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
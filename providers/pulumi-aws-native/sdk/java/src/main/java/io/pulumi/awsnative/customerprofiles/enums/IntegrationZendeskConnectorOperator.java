// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum IntegrationZendeskConnectorOperator {
        Projection("PROJECTION"),
        GreaterThan("GREATER_THAN"),
        Addition("ADDITION"),
        Multiplication("MULTIPLICATION"),
        Division("DIVISION"),
        Subtraction("SUBTRACTION"),
        MaskAll("MASK_ALL"),
        MaskFirstN("MASK_FIRST_N"),
        MaskLastN("MASK_LAST_N"),
        ValidateNonNull("VALIDATE_NON_NULL"),
        ValidateNonZero("VALIDATE_NON_ZERO"),
        ValidateNonNegative("VALIDATE_NON_NEGATIVE"),
        ValidateNumeric("VALIDATE_NUMERIC"),
        NoOp("NO_OP");

        private final String value;

        IntegrationZendeskConnectorOperator(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "IntegrationZendeskConnectorOperator[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
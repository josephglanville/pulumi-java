// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v4.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum JobDegreeTypesItem {
        DegreeTypeUnspecified("DEGREE_TYPE_UNSPECIFIED"),
        PrimaryEducation("PRIMARY_EDUCATION"),
        LowerSecondaryEducation("LOWER_SECONDARY_EDUCATION"),
        UpperSecondaryEducation("UPPER_SECONDARY_EDUCATION"),
        AdultRemedialEducation("ADULT_REMEDIAL_EDUCATION"),
        AssociatesOrEquivalent("ASSOCIATES_OR_EQUIVALENT"),
        BachelorsOrEquivalent("BACHELORS_OR_EQUIVALENT"),
        MastersOrEquivalent("MASTERS_OR_EQUIVALENT"),
        DoctoralOrEquivalent("DOCTORAL_OR_EQUIVALENT");

        private final String value;

        JobDegreeTypesItem(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "JobDegreeTypesItem[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
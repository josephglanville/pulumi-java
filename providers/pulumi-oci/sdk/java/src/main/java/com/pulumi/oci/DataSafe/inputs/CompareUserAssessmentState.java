// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CompareUserAssessmentState extends com.pulumi.resources.ResourceArgs {

    public static final CompareUserAssessmentState Empty = new CompareUserAssessmentState();

    /**
     * The OCID of the user assessment to be compared. You can compare with another user assessment, a latest assessment, or a baseline.
     * 
     */
    @Import(name="comparisonUserAssessmentId")
    private @Nullable Output<String> comparisonUserAssessmentId;

    /**
     * @return The OCID of the user assessment to be compared. You can compare with another user assessment, a latest assessment, or a baseline.
     * 
     */
    public Optional<Output<String>> comparisonUserAssessmentId() {
        return Optional.ofNullable(this.comparisonUserAssessmentId);
    }

    /**
     * The OCID of the user assessment.
     * 
     */
    @Import(name="userAssessmentId")
    private @Nullable Output<String> userAssessmentId;

    /**
     * @return The OCID of the user assessment.
     * 
     */
    public Optional<Output<String>> userAssessmentId() {
        return Optional.ofNullable(this.userAssessmentId);
    }

    private CompareUserAssessmentState() {}

    private CompareUserAssessmentState(CompareUserAssessmentState $) {
        this.comparisonUserAssessmentId = $.comparisonUserAssessmentId;
        this.userAssessmentId = $.userAssessmentId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CompareUserAssessmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CompareUserAssessmentState $;

        public Builder() {
            $ = new CompareUserAssessmentState();
        }

        public Builder(CompareUserAssessmentState defaults) {
            $ = new CompareUserAssessmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param comparisonUserAssessmentId The OCID of the user assessment to be compared. You can compare with another user assessment, a latest assessment, or a baseline.
         * 
         * @return builder
         * 
         */
        public Builder comparisonUserAssessmentId(@Nullable Output<String> comparisonUserAssessmentId) {
            $.comparisonUserAssessmentId = comparisonUserAssessmentId;
            return this;
        }

        /**
         * @param comparisonUserAssessmentId The OCID of the user assessment to be compared. You can compare with another user assessment, a latest assessment, or a baseline.
         * 
         * @return builder
         * 
         */
        public Builder comparisonUserAssessmentId(String comparisonUserAssessmentId) {
            return comparisonUserAssessmentId(Output.of(comparisonUserAssessmentId));
        }

        /**
         * @param userAssessmentId The OCID of the user assessment.
         * 
         * @return builder
         * 
         */
        public Builder userAssessmentId(@Nullable Output<String> userAssessmentId) {
            $.userAssessmentId = userAssessmentId;
            return this;
        }

        /**
         * @param userAssessmentId The OCID of the user assessment.
         * 
         * @return builder
         * 
         */
        public Builder userAssessmentId(String userAssessmentId) {
            return userAssessmentId(Output.of(userAssessmentId));
        }

        public CompareUserAssessmentState build() {
            return $;
        }
    }

}

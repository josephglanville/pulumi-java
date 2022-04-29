// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UnsetUserAssessmentBaselineState extends com.pulumi.resources.ResourceArgs {

    public static final UnsetUserAssessmentBaselineState Empty = new UnsetUserAssessmentBaselineState();

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

    private UnsetUserAssessmentBaselineState() {}

    private UnsetUserAssessmentBaselineState(UnsetUserAssessmentBaselineState $) {
        this.userAssessmentId = $.userAssessmentId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UnsetUserAssessmentBaselineState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UnsetUserAssessmentBaselineState $;

        public Builder() {
            $ = new UnsetUserAssessmentBaselineState();
        }

        public Builder(UnsetUserAssessmentBaselineState defaults) {
            $ = new UnsetUserAssessmentBaselineState(Objects.requireNonNull(defaults));
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

        public UnsetUserAssessmentBaselineState build() {
            return $;
        }
    }

}

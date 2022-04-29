// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeployStageFailurePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeployStageFailurePolicyArgs Empty = new DeployStageFailurePolicyArgs();

    /**
     * (Updatable) The threshold count of failed instances in the group, which when reached or exceeded sets the stage as FAILED.
     * 
     */
    @Import(name="failureCount")
    private @Nullable Output<Integer> failureCount;

    /**
     * @return (Updatable) The threshold count of failed instances in the group, which when reached or exceeded sets the stage as FAILED.
     * 
     */
    public Optional<Output<Integer>> failureCount() {
        return Optional.ofNullable(this.failureCount);
    }

    /**
     * (Updatable) The failure percentage threshold, which when reached or exceeded sets the stage as FAILED. Percentage is computed as the ceiling value of the number of failed instances over the total count of the instances in the group.
     * 
     */
    @Import(name="failurePercentage")
    private @Nullable Output<Integer> failurePercentage;

    /**
     * @return (Updatable) The failure percentage threshold, which when reached or exceeded sets the stage as FAILED. Percentage is computed as the ceiling value of the number of failed instances over the total count of the instances in the group.
     * 
     */
    public Optional<Output<Integer>> failurePercentage() {
        return Optional.ofNullable(this.failurePercentage);
    }

    /**
     * (Updatable) The type of policy used for rolling out a deployment stage.
     * 
     */
    @Import(name="policyType", required=true)
    private Output<String> policyType;

    /**
     * @return (Updatable) The type of policy used for rolling out a deployment stage.
     * 
     */
    public Output<String> policyType() {
        return this.policyType;
    }

    private DeployStageFailurePolicyArgs() {}

    private DeployStageFailurePolicyArgs(DeployStageFailurePolicyArgs $) {
        this.failureCount = $.failureCount;
        this.failurePercentage = $.failurePercentage;
        this.policyType = $.policyType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeployStageFailurePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeployStageFailurePolicyArgs $;

        public Builder() {
            $ = new DeployStageFailurePolicyArgs();
        }

        public Builder(DeployStageFailurePolicyArgs defaults) {
            $ = new DeployStageFailurePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param failureCount (Updatable) The threshold count of failed instances in the group, which when reached or exceeded sets the stage as FAILED.
         * 
         * @return builder
         * 
         */
        public Builder failureCount(@Nullable Output<Integer> failureCount) {
            $.failureCount = failureCount;
            return this;
        }

        /**
         * @param failureCount (Updatable) The threshold count of failed instances in the group, which when reached or exceeded sets the stage as FAILED.
         * 
         * @return builder
         * 
         */
        public Builder failureCount(Integer failureCount) {
            return failureCount(Output.of(failureCount));
        }

        /**
         * @param failurePercentage (Updatable) The failure percentage threshold, which when reached or exceeded sets the stage as FAILED. Percentage is computed as the ceiling value of the number of failed instances over the total count of the instances in the group.
         * 
         * @return builder
         * 
         */
        public Builder failurePercentage(@Nullable Output<Integer> failurePercentage) {
            $.failurePercentage = failurePercentage;
            return this;
        }

        /**
         * @param failurePercentage (Updatable) The failure percentage threshold, which when reached or exceeded sets the stage as FAILED. Percentage is computed as the ceiling value of the number of failed instances over the total count of the instances in the group.
         * 
         * @return builder
         * 
         */
        public Builder failurePercentage(Integer failurePercentage) {
            return failurePercentage(Output.of(failurePercentage));
        }

        /**
         * @param policyType (Updatable) The type of policy used for rolling out a deployment stage.
         * 
         * @return builder
         * 
         */
        public Builder policyType(Output<String> policyType) {
            $.policyType = policyType;
            return this;
        }

        /**
         * @param policyType (Updatable) The type of policy used for rolling out a deployment stage.
         * 
         * @return builder
         * 
         */
        public Builder policyType(String policyType) {
            return policyType(Output.of(policyType));
        }

        public DeployStageFailurePolicyArgs build() {
            $.policyType = Objects.requireNonNull($.policyType, "expected parameter 'policyType' to be non-null");
            return $;
        }
    }

}

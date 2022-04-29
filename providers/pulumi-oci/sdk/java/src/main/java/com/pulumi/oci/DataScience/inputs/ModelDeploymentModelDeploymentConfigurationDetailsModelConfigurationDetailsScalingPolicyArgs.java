// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataScience.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ModelDeploymentModelDeploymentConfigurationDetailsModelConfigurationDetailsScalingPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelDeploymentModelDeploymentConfigurationDetailsModelConfigurationDetailsScalingPolicyArgs Empty = new ModelDeploymentModelDeploymentConfigurationDetailsModelConfigurationDetailsScalingPolicyArgs();

    /**
     * (Updatable) The number of instances for the model deployment.
     * 
     */
    @Import(name="instanceCount", required=true)
    private Output<Integer> instanceCount;

    /**
     * @return (Updatable) The number of instances for the model deployment.
     * 
     */
    public Output<Integer> instanceCount() {
        return this.instanceCount;
    }

    /**
     * (Updatable) The type of scaling policy.
     * 
     */
    @Import(name="policyType", required=true)
    private Output<String> policyType;

    /**
     * @return (Updatable) The type of scaling policy.
     * 
     */
    public Output<String> policyType() {
        return this.policyType;
    }

    private ModelDeploymentModelDeploymentConfigurationDetailsModelConfigurationDetailsScalingPolicyArgs() {}

    private ModelDeploymentModelDeploymentConfigurationDetailsModelConfigurationDetailsScalingPolicyArgs(ModelDeploymentModelDeploymentConfigurationDetailsModelConfigurationDetailsScalingPolicyArgs $) {
        this.instanceCount = $.instanceCount;
        this.policyType = $.policyType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelDeploymentModelDeploymentConfigurationDetailsModelConfigurationDetailsScalingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelDeploymentModelDeploymentConfigurationDetailsModelConfigurationDetailsScalingPolicyArgs $;

        public Builder() {
            $ = new ModelDeploymentModelDeploymentConfigurationDetailsModelConfigurationDetailsScalingPolicyArgs();
        }

        public Builder(ModelDeploymentModelDeploymentConfigurationDetailsModelConfigurationDetailsScalingPolicyArgs defaults) {
            $ = new ModelDeploymentModelDeploymentConfigurationDetailsModelConfigurationDetailsScalingPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceCount (Updatable) The number of instances for the model deployment.
         * 
         * @return builder
         * 
         */
        public Builder instanceCount(Output<Integer> instanceCount) {
            $.instanceCount = instanceCount;
            return this;
        }

        /**
         * @param instanceCount (Updatable) The number of instances for the model deployment.
         * 
         * @return builder
         * 
         */
        public Builder instanceCount(Integer instanceCount) {
            return instanceCount(Output.of(instanceCount));
        }

        /**
         * @param policyType (Updatable) The type of scaling policy.
         * 
         * @return builder
         * 
         */
        public Builder policyType(Output<String> policyType) {
            $.policyType = policyType;
            return this;
        }

        /**
         * @param policyType (Updatable) The type of scaling policy.
         * 
         * @return builder
         * 
         */
        public Builder policyType(String policyType) {
            return policyType(Output.of(policyType));
        }

        public ModelDeploymentModelDeploymentConfigurationDetailsModelConfigurationDetailsScalingPolicyArgs build() {
            $.instanceCount = Objects.requireNonNull($.instanceCount, "expected parameter 'instanceCount' to be non-null");
            $.policyType = Objects.requireNonNull($.policyType, "expected parameter 'policyType' to be non-null");
            return $;
        }
    }

}

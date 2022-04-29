// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataScience.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DataScience.inputs.ModelDeploymentModelDeploymentConfigurationDetailsModelConfigurationDetailsArgs;
import java.lang.String;
import java.util.Objects;


public final class ModelDeploymentModelDeploymentConfigurationDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelDeploymentModelDeploymentConfigurationDetailsArgs Empty = new ModelDeploymentModelDeploymentConfigurationDetailsArgs();

    /**
     * (Updatable) The type of the model deployment.
     * 
     */
    @Import(name="deploymentType", required=true)
    private Output<String> deploymentType;

    /**
     * @return (Updatable) The type of the model deployment.
     * 
     */
    public Output<String> deploymentType() {
        return this.deploymentType;
    }

    /**
     * (Updatable) The model configuration details.
     * 
     */
    @Import(name="modelConfigurationDetails", required=true)
    private Output<ModelDeploymentModelDeploymentConfigurationDetailsModelConfigurationDetailsArgs> modelConfigurationDetails;

    /**
     * @return (Updatable) The model configuration details.
     * 
     */
    public Output<ModelDeploymentModelDeploymentConfigurationDetailsModelConfigurationDetailsArgs> modelConfigurationDetails() {
        return this.modelConfigurationDetails;
    }

    private ModelDeploymentModelDeploymentConfigurationDetailsArgs() {}

    private ModelDeploymentModelDeploymentConfigurationDetailsArgs(ModelDeploymentModelDeploymentConfigurationDetailsArgs $) {
        this.deploymentType = $.deploymentType;
        this.modelConfigurationDetails = $.modelConfigurationDetails;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelDeploymentModelDeploymentConfigurationDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelDeploymentModelDeploymentConfigurationDetailsArgs $;

        public Builder() {
            $ = new ModelDeploymentModelDeploymentConfigurationDetailsArgs();
        }

        public Builder(ModelDeploymentModelDeploymentConfigurationDetailsArgs defaults) {
            $ = new ModelDeploymentModelDeploymentConfigurationDetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deploymentType (Updatable) The type of the model deployment.
         * 
         * @return builder
         * 
         */
        public Builder deploymentType(Output<String> deploymentType) {
            $.deploymentType = deploymentType;
            return this;
        }

        /**
         * @param deploymentType (Updatable) The type of the model deployment.
         * 
         * @return builder
         * 
         */
        public Builder deploymentType(String deploymentType) {
            return deploymentType(Output.of(deploymentType));
        }

        /**
         * @param modelConfigurationDetails (Updatable) The model configuration details.
         * 
         * @return builder
         * 
         */
        public Builder modelConfigurationDetails(Output<ModelDeploymentModelDeploymentConfigurationDetailsModelConfigurationDetailsArgs> modelConfigurationDetails) {
            $.modelConfigurationDetails = modelConfigurationDetails;
            return this;
        }

        /**
         * @param modelConfigurationDetails (Updatable) The model configuration details.
         * 
         * @return builder
         * 
         */
        public Builder modelConfigurationDetails(ModelDeploymentModelDeploymentConfigurationDetailsModelConfigurationDetailsArgs modelConfigurationDetails) {
            return modelConfigurationDetails(Output.of(modelConfigurationDetails));
        }

        public ModelDeploymentModelDeploymentConfigurationDetailsArgs build() {
            $.deploymentType = Objects.requireNonNull($.deploymentType, "expected parameter 'deploymentType' to be non-null");
            $.modelConfigurationDetails = Objects.requireNonNull($.modelConfigurationDetails, "expected parameter 'modelConfigurationDetails' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentDeployPipelineEnvironmentItemDeployPipelineStageItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentDeployPipelineEnvironmentItemDeployPipelineStageItemArgs Empty = new DeploymentDeployPipelineEnvironmentItemDeployPipelineStageItemArgs();

    /**
     * Specifies the OCID of the stage to be redeployed.
     * 
     */
    @Import(name="deployStageId")
    private @Nullable Output<String> deployStageId;

    /**
     * @return Specifies the OCID of the stage to be redeployed.
     * 
     */
    public Optional<Output<String>> deployStageId() {
        return Optional.ofNullable(this.deployStageId);
    }

    /**
     * (Updatable) Deployment display name. Avoid entering confidential information.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return (Updatable) Deployment display name. Avoid entering confidential information.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    private DeploymentDeployPipelineEnvironmentItemDeployPipelineStageItemArgs() {}

    private DeploymentDeployPipelineEnvironmentItemDeployPipelineStageItemArgs(DeploymentDeployPipelineEnvironmentItemDeployPipelineStageItemArgs $) {
        this.deployStageId = $.deployStageId;
        this.displayName = $.displayName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentDeployPipelineEnvironmentItemDeployPipelineStageItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentDeployPipelineEnvironmentItemDeployPipelineStageItemArgs $;

        public Builder() {
            $ = new DeploymentDeployPipelineEnvironmentItemDeployPipelineStageItemArgs();
        }

        public Builder(DeploymentDeployPipelineEnvironmentItemDeployPipelineStageItemArgs defaults) {
            $ = new DeploymentDeployPipelineEnvironmentItemDeployPipelineStageItemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deployStageId Specifies the OCID of the stage to be redeployed.
         * 
         * @return builder
         * 
         */
        public Builder deployStageId(@Nullable Output<String> deployStageId) {
            $.deployStageId = deployStageId;
            return this;
        }

        /**
         * @param deployStageId Specifies the OCID of the stage to be redeployed.
         * 
         * @return builder
         * 
         */
        public Builder deployStageId(String deployStageId) {
            return deployStageId(Output.of(deployStageId));
        }

        /**
         * @param displayName (Updatable) Deployment display name. Avoid entering confidential information.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName (Updatable) Deployment display name. Avoid entering confidential information.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public DeploymentDeployPipelineEnvironmentItemDeployPipelineStageItemArgs build() {
            return $;
        }
    }

}

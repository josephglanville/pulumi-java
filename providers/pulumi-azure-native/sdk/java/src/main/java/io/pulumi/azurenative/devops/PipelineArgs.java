// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devops;

import io.pulumi.azurenative.devops.enums.PipelineTypeEnum;
import io.pulumi.azurenative.devops.inputs.BootstrapConfigurationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineArgs Empty = new PipelineArgs();

    /**
     * Configuration used to bootstrap the Pipeline.
     * 
     */
    @InputImport(name="bootstrapConfiguration", required=true)
      private final Input<BootstrapConfigurationArgs> bootstrapConfiguration;

    public Input<BootstrapConfigurationArgs> getBootstrapConfiguration() {
        return this.bootstrapConfiguration;
    }

    /**
     * Resource Location
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the Pipeline resource in ARM.
     * 
     */
    @InputImport(name="pipelineName")
      private final @Nullable Input<String> pipelineName;

    public Input<String> getPipelineName() {
        return this.pipelineName == null ? Input.empty() : this.pipelineName;
    }

    /**
     * Specifies which CI/CD provider to use. Valid options are 'azurePipeline', 'githubWorkflow'.
     * 
     */
    @InputImport(name="pipelineType", required=true)
      private final Input<Either<String,PipelineTypeEnum>> pipelineType;

    public Input<Either<String,PipelineTypeEnum>> getPipelineType() {
        return this.pipelineType;
    }

    /**
     * Name of the resource group within the Azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource Tags
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public PipelineArgs(
        Input<BootstrapConfigurationArgs> bootstrapConfiguration,
        @Nullable Input<String> location,
        @Nullable Input<String> pipelineName,
        Input<Either<String,PipelineTypeEnum>> pipelineType,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.bootstrapConfiguration = Objects.requireNonNull(bootstrapConfiguration, "expected parameter 'bootstrapConfiguration' to be non-null");
        this.location = location;
        this.pipelineName = pipelineName;
        this.pipelineType = Objects.requireNonNull(pipelineType, "expected parameter 'pipelineType' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private PipelineArgs() {
        this.bootstrapConfiguration = Input.empty();
        this.location = Input.empty();
        this.pipelineName = Input.empty();
        this.pipelineType = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<BootstrapConfigurationArgs> bootstrapConfiguration;
        private @Nullable Input<String> location;
        private @Nullable Input<String> pipelineName;
        private Input<Either<String,PipelineTypeEnum>> pipelineType;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootstrapConfiguration = defaults.bootstrapConfiguration;
    	      this.location = defaults.location;
    	      this.pipelineName = defaults.pipelineName;
    	      this.pipelineType = defaults.pipelineType;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setBootstrapConfiguration(Input<BootstrapConfigurationArgs> bootstrapConfiguration) {
            this.bootstrapConfiguration = Objects.requireNonNull(bootstrapConfiguration);
            return this;
        }

        public Builder setBootstrapConfiguration(BootstrapConfigurationArgs bootstrapConfiguration) {
            this.bootstrapConfiguration = Input.of(Objects.requireNonNull(bootstrapConfiguration));
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setPipelineName(@Nullable Input<String> pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }

        public Builder setPipelineName(@Nullable String pipelineName) {
            this.pipelineName = Input.ofNullable(pipelineName);
            return this;
        }

        public Builder setPipelineType(Input<Either<String,PipelineTypeEnum>> pipelineType) {
            this.pipelineType = Objects.requireNonNull(pipelineType);
            return this;
        }

        public Builder setPipelineType(Either<String,PipelineTypeEnum> pipelineType) {
            this.pipelineType = Input.of(Objects.requireNonNull(pipelineType));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public PipelineArgs build() {
            return new PipelineArgs(bootstrapConfiguration, location, pipelineName, pipelineType, resourceGroupName, tags);
        }
    }
}

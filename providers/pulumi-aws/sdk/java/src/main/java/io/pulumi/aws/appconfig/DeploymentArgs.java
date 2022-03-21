// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appconfig;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentArgs Empty = new DeploymentArgs();

    /**
     * The application ID. Must be between 4 and 7 characters in length.
     * 
     */
    @Import(name="applicationId", required=true)
      private final Output<String> applicationId;

    public Output<String> getApplicationId() {
        return this.applicationId;
    }

    /**
     * The configuration profile ID. Must be between 4 and 7 characters in length.
     * 
     */
    @Import(name="configurationProfileId", required=true)
      private final Output<String> configurationProfileId;

    public Output<String> getConfigurationProfileId() {
        return this.configurationProfileId;
    }

    /**
     * The configuration version to deploy. Can be at most 1024 characters.
     * 
     */
    @Import(name="configurationVersion", required=true)
      private final Output<String> configurationVersion;

    public Output<String> getConfigurationVersion() {
        return this.configurationVersion;
    }

    /**
     * The deployment strategy ID or name of a predefined deployment strategy. See [Predefined Deployment Strategies](https://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-creating-deployment-strategy.html#appconfig-creating-deployment-strategy-predefined) for more details.
     * 
     */
    @Import(name="deploymentStrategyId", required=true)
      private final Output<String> deploymentStrategyId;

    public Output<String> getDeploymentStrategyId() {
        return this.deploymentStrategyId;
    }

    /**
     * The description of the deployment. Can be at most 1024 characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The environment ID. Must be between 4 and 7 characters in length.
     * 
     */
    @Import(name="environmentId", required=true)
      private final Output<String> environmentId;

    public Output<String> getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public DeploymentArgs(
        Output<String> applicationId,
        Output<String> configurationProfileId,
        Output<String> configurationVersion,
        Output<String> deploymentStrategyId,
        @Nullable Output<String> description,
        Output<String> environmentId,
        @Nullable Output<Map<String,String>> tags) {
        this.applicationId = Objects.requireNonNull(applicationId, "expected parameter 'applicationId' to be non-null");
        this.configurationProfileId = Objects.requireNonNull(configurationProfileId, "expected parameter 'configurationProfileId' to be non-null");
        this.configurationVersion = Objects.requireNonNull(configurationVersion, "expected parameter 'configurationVersion' to be non-null");
        this.deploymentStrategyId = Objects.requireNonNull(deploymentStrategyId, "expected parameter 'deploymentStrategyId' to be non-null");
        this.description = description;
        this.environmentId = Objects.requireNonNull(environmentId, "expected parameter 'environmentId' to be non-null");
        this.tags = tags;
    }

    private DeploymentArgs() {
        this.applicationId = Output.empty();
        this.configurationProfileId = Output.empty();
        this.configurationVersion = Output.empty();
        this.deploymentStrategyId = Output.empty();
        this.description = Output.empty();
        this.environmentId = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> applicationId;
        private Output<String> configurationProfileId;
        private Output<String> configurationVersion;
        private Output<String> deploymentStrategyId;
        private @Nullable Output<String> description;
        private Output<String> environmentId;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.configurationProfileId = defaults.configurationProfileId;
    	      this.configurationVersion = defaults.configurationVersion;
    	      this.deploymentStrategyId = defaults.deploymentStrategyId;
    	      this.description = defaults.description;
    	      this.environmentId = defaults.environmentId;
    	      this.tags = defaults.tags;
        }

        public Builder applicationId(Output<String> applicationId) {
            this.applicationId = Objects.requireNonNull(applicationId);
            return this;
        }
        public Builder applicationId(String applicationId) {
            this.applicationId = Output.of(Objects.requireNonNull(applicationId));
            return this;
        }
        public Builder configurationProfileId(Output<String> configurationProfileId) {
            this.configurationProfileId = Objects.requireNonNull(configurationProfileId);
            return this;
        }
        public Builder configurationProfileId(String configurationProfileId) {
            this.configurationProfileId = Output.of(Objects.requireNonNull(configurationProfileId));
            return this;
        }
        public Builder configurationVersion(Output<String> configurationVersion) {
            this.configurationVersion = Objects.requireNonNull(configurationVersion);
            return this;
        }
        public Builder configurationVersion(String configurationVersion) {
            this.configurationVersion = Output.of(Objects.requireNonNull(configurationVersion));
            return this;
        }
        public Builder deploymentStrategyId(Output<String> deploymentStrategyId) {
            this.deploymentStrategyId = Objects.requireNonNull(deploymentStrategyId);
            return this;
        }
        public Builder deploymentStrategyId(String deploymentStrategyId) {
            this.deploymentStrategyId = Output.of(Objects.requireNonNull(deploymentStrategyId));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder environmentId(Output<String> environmentId) {
            this.environmentId = Objects.requireNonNull(environmentId);
            return this;
        }
        public Builder environmentId(String environmentId) {
            this.environmentId = Output.of(Objects.requireNonNull(environmentId));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public DeploymentArgs build() {
            return new DeploymentArgs(applicationId, configurationProfileId, configurationVersion, deploymentStrategyId, description, environmentId, tags);
        }
    }
}

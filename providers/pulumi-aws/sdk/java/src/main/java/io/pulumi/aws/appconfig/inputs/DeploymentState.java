// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentState extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentState Empty = new DeploymentState();

    /**
     * The application ID. Must be between 4 and 7 characters in length.
     * 
     */
    @Import(name="applicationId")
      private final @Nullable Output<String> applicationId;

    public Output<String> getApplicationId() {
        return this.applicationId == null ? Output.empty() : this.applicationId;
    }

    /**
     * The Amazon Resource Name (ARN) of the AppConfig Deployment.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The configuration profile ID. Must be between 4 and 7 characters in length.
     * 
     */
    @Import(name="configurationProfileId")
      private final @Nullable Output<String> configurationProfileId;

    public Output<String> getConfigurationProfileId() {
        return this.configurationProfileId == null ? Output.empty() : this.configurationProfileId;
    }

    /**
     * The configuration version to deploy. Can be at most 1024 characters.
     * 
     */
    @Import(name="configurationVersion")
      private final @Nullable Output<String> configurationVersion;

    public Output<String> getConfigurationVersion() {
        return this.configurationVersion == null ? Output.empty() : this.configurationVersion;
    }

    /**
     * The deployment number.
     * 
     */
    @Import(name="deploymentNumber")
      private final @Nullable Output<Integer> deploymentNumber;

    public Output<Integer> getDeploymentNumber() {
        return this.deploymentNumber == null ? Output.empty() : this.deploymentNumber;
    }

    /**
     * The deployment strategy ID or name of a predefined deployment strategy. See [Predefined Deployment Strategies](https://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-creating-deployment-strategy.html#appconfig-creating-deployment-strategy-predefined) for more details.
     * 
     */
    @Import(name="deploymentStrategyId")
      private final @Nullable Output<String> deploymentStrategyId;

    public Output<String> getDeploymentStrategyId() {
        return this.deploymentStrategyId == null ? Output.empty() : this.deploymentStrategyId;
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
    @Import(name="environmentId")
      private final @Nullable Output<String> environmentId;

    public Output<String> getEnvironmentId() {
        return this.environmentId == null ? Output.empty() : this.environmentId;
    }

    /**
     * The state of the deployment.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<String> state;

    public Output<String> getState() {
        return this.state == null ? Output.empty() : this.state;
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

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public DeploymentState(
        @Nullable Output<String> applicationId,
        @Nullable Output<String> arn,
        @Nullable Output<String> configurationProfileId,
        @Nullable Output<String> configurationVersion,
        @Nullable Output<Integer> deploymentNumber,
        @Nullable Output<String> deploymentStrategyId,
        @Nullable Output<String> description,
        @Nullable Output<String> environmentId,
        @Nullable Output<String> state,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.applicationId = applicationId;
        this.arn = arn;
        this.configurationProfileId = configurationProfileId;
        this.configurationVersion = configurationVersion;
        this.deploymentNumber = deploymentNumber;
        this.deploymentStrategyId = deploymentStrategyId;
        this.description = description;
        this.environmentId = environmentId;
        this.state = state;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private DeploymentState() {
        this.applicationId = Output.empty();
        this.arn = Output.empty();
        this.configurationProfileId = Output.empty();
        this.configurationVersion = Output.empty();
        this.deploymentNumber = Output.empty();
        this.deploymentStrategyId = Output.empty();
        this.description = Output.empty();
        this.environmentId = Output.empty();
        this.state = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> applicationId;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> configurationProfileId;
        private @Nullable Output<String> configurationVersion;
        private @Nullable Output<Integer> deploymentNumber;
        private @Nullable Output<String> deploymentStrategyId;
        private @Nullable Output<String> description;
        private @Nullable Output<String> environmentId;
        private @Nullable Output<String> state;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.arn = defaults.arn;
    	      this.configurationProfileId = defaults.configurationProfileId;
    	      this.configurationVersion = defaults.configurationVersion;
    	      this.deploymentNumber = defaults.deploymentNumber;
    	      this.deploymentStrategyId = defaults.deploymentStrategyId;
    	      this.description = defaults.description;
    	      this.environmentId = defaults.environmentId;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder applicationId(@Nullable Output<String> applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public Builder applicationId(@Nullable String applicationId) {
            this.applicationId = Output.ofNullable(applicationId);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder configurationProfileId(@Nullable Output<String> configurationProfileId) {
            this.configurationProfileId = configurationProfileId;
            return this;
        }
        public Builder configurationProfileId(@Nullable String configurationProfileId) {
            this.configurationProfileId = Output.ofNullable(configurationProfileId);
            return this;
        }
        public Builder configurationVersion(@Nullable Output<String> configurationVersion) {
            this.configurationVersion = configurationVersion;
            return this;
        }
        public Builder configurationVersion(@Nullable String configurationVersion) {
            this.configurationVersion = Output.ofNullable(configurationVersion);
            return this;
        }
        public Builder deploymentNumber(@Nullable Output<Integer> deploymentNumber) {
            this.deploymentNumber = deploymentNumber;
            return this;
        }
        public Builder deploymentNumber(@Nullable Integer deploymentNumber) {
            this.deploymentNumber = Output.ofNullable(deploymentNumber);
            return this;
        }
        public Builder deploymentStrategyId(@Nullable Output<String> deploymentStrategyId) {
            this.deploymentStrategyId = deploymentStrategyId;
            return this;
        }
        public Builder deploymentStrategyId(@Nullable String deploymentStrategyId) {
            this.deploymentStrategyId = Output.ofNullable(deploymentStrategyId);
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
        public Builder environmentId(@Nullable Output<String> environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public Builder environmentId(@Nullable String environmentId) {
            this.environmentId = Output.ofNullable(environmentId);
            return this;
        }
        public Builder state(@Nullable Output<String> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = Output.ofNullable(state);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }        public DeploymentState build() {
            return new DeploymentState(applicationId, arn, configurationProfileId, configurationVersion, deploymentNumber, deploymentStrategyId, description, environmentId, state, tags, tagsAll);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.amplify.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackendEnvironmentState extends io.pulumi.resources.ResourceArgs {

    public static final BackendEnvironmentState Empty = new BackendEnvironmentState();

    /**
     * The unique ID for an Amplify app.
     * 
     */
    @Import(name="appId")
      private final @Nullable Output<String> appId;

    public Output<String> getAppId() {
        return this.appId == null ? Output.empty() : this.appId;
    }

    /**
     * The Amazon Resource Name (ARN) for a backend environment that is part of an Amplify app.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The name of deployment artifacts.
     * 
     */
    @Import(name="deploymentArtifacts")
      private final @Nullable Output<String> deploymentArtifacts;

    public Output<String> getDeploymentArtifacts() {
        return this.deploymentArtifacts == null ? Output.empty() : this.deploymentArtifacts;
    }

    /**
     * The name for the backend environment.
     * 
     */
    @Import(name="environmentName")
      private final @Nullable Output<String> environmentName;

    public Output<String> getEnvironmentName() {
        return this.environmentName == null ? Output.empty() : this.environmentName;
    }

    /**
     * The AWS CloudFormation stack name of a backend environment.
     * 
     */
    @Import(name="stackName")
      private final @Nullable Output<String> stackName;

    public Output<String> getStackName() {
        return this.stackName == null ? Output.empty() : this.stackName;
    }

    public BackendEnvironmentState(
        @Nullable Output<String> appId,
        @Nullable Output<String> arn,
        @Nullable Output<String> deploymentArtifacts,
        @Nullable Output<String> environmentName,
        @Nullable Output<String> stackName) {
        this.appId = appId;
        this.arn = arn;
        this.deploymentArtifacts = deploymentArtifacts;
        this.environmentName = environmentName;
        this.stackName = stackName;
    }

    private BackendEnvironmentState() {
        this.appId = Output.empty();
        this.arn = Output.empty();
        this.deploymentArtifacts = Output.empty();
        this.environmentName = Output.empty();
        this.stackName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendEnvironmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> appId;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> deploymentArtifacts;
        private @Nullable Output<String> environmentName;
        private @Nullable Output<String> stackName;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendEnvironmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.arn = defaults.arn;
    	      this.deploymentArtifacts = defaults.deploymentArtifacts;
    	      this.environmentName = defaults.environmentName;
    	      this.stackName = defaults.stackName;
        }

        public Builder appId(@Nullable Output<String> appId) {
            this.appId = appId;
            return this;
        }
        public Builder appId(@Nullable String appId) {
            this.appId = Output.ofNullable(appId);
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
        public Builder deploymentArtifacts(@Nullable Output<String> deploymentArtifacts) {
            this.deploymentArtifacts = deploymentArtifacts;
            return this;
        }
        public Builder deploymentArtifacts(@Nullable String deploymentArtifacts) {
            this.deploymentArtifacts = Output.ofNullable(deploymentArtifacts);
            return this;
        }
        public Builder environmentName(@Nullable Output<String> environmentName) {
            this.environmentName = environmentName;
            return this;
        }
        public Builder environmentName(@Nullable String environmentName) {
            this.environmentName = Output.ofNullable(environmentName);
            return this;
        }
        public Builder stackName(@Nullable Output<String> stackName) {
            this.stackName = stackName;
            return this;
        }
        public Builder stackName(@Nullable String stackName) {
            this.stackName = Output.ofNullable(stackName);
            return this;
        }        public BackendEnvironmentState build() {
            return new BackendEnvironmentState(appId, arn, deploymentArtifacts, environmentName, stackName);
        }
    }
}
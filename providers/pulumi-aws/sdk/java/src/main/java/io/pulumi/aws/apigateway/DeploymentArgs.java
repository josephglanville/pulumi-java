// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentArgs Empty = new DeploymentArgs();

    /**
     * Description of the deployment
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * REST API identifier.
     * 
     */
    @Import(name="restApi", required=true)
      private final Output<String> restApi;

    public Output<String> getRestApi() {
        return this.restApi;
    }

    /**
     * Description to set on the stage managed by the `stage_name` argument.
     * 
     */
    @Import(name="stageDescription")
      private final @Nullable Output<String> stageDescription;

    public Output<String> getStageDescription() {
        return this.stageDescription == null ? Output.empty() : this.stageDescription;
    }

    /**
     * Name of the stage to create with this deployment. If the specified stage already exists, it will be updated to point to the new deployment. It is recommended to use the `aws.apigateway.Stage` resource instead to manage stages.
     * 
     */
    @Import(name="stageName")
      private final @Nullable Output<String> stageName;

    public Output<String> getStageName() {
        return this.stageName == null ? Output.empty() : this.stageName;
    }

    /**
     * Map of arbitrary keys and values that, when changed, will trigger a redeployment.
     * 
     */
    @Import(name="triggers")
      private final @Nullable Output<Map<String,String>> triggers;

    public Output<Map<String,String>> getTriggers() {
        return this.triggers == null ? Output.empty() : this.triggers;
    }

    /**
     * Map to set on the stage managed by the `stage_name` argument.
     * 
     */
    @Import(name="variables")
      private final @Nullable Output<Map<String,String>> variables;

    public Output<Map<String,String>> getVariables() {
        return this.variables == null ? Output.empty() : this.variables;
    }

    public DeploymentArgs(
        @Nullable Output<String> description,
        Output<String> restApi,
        @Nullable Output<String> stageDescription,
        @Nullable Output<String> stageName,
        @Nullable Output<Map<String,String>> triggers,
        @Nullable Output<Map<String,String>> variables) {
        this.description = description;
        this.restApi = Objects.requireNonNull(restApi, "expected parameter 'restApi' to be non-null");
        this.stageDescription = stageDescription;
        this.stageName = stageName;
        this.triggers = triggers;
        this.variables = variables;
    }

    private DeploymentArgs() {
        this.description = Output.empty();
        this.restApi = Output.empty();
        this.stageDescription = Output.empty();
        this.stageName = Output.empty();
        this.triggers = Output.empty();
        this.variables = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> restApi;
        private @Nullable Output<String> stageDescription;
        private @Nullable Output<String> stageName;
        private @Nullable Output<Map<String,String>> triggers;
        private @Nullable Output<Map<String,String>> variables;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.restApi = defaults.restApi;
    	      this.stageDescription = defaults.stageDescription;
    	      this.stageName = defaults.stageName;
    	      this.triggers = defaults.triggers;
    	      this.variables = defaults.variables;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder restApi(Output<String> restApi) {
            this.restApi = Objects.requireNonNull(restApi);
            return this;
        }
        public Builder stageDescription(@Nullable Output<String> stageDescription) {
            this.stageDescription = stageDescription;
            return this;
        }
        public Builder stageDescription(@Nullable String stageDescription) {
            this.stageDescription = Output.ofNullable(stageDescription);
            return this;
        }
        public Builder stageName(@Nullable Output<String> stageName) {
            this.stageName = stageName;
            return this;
        }
        public Builder stageName(@Nullable String stageName) {
            this.stageName = Output.ofNullable(stageName);
            return this;
        }
        public Builder triggers(@Nullable Output<Map<String,String>> triggers) {
            this.triggers = triggers;
            return this;
        }
        public Builder triggers(@Nullable Map<String,String> triggers) {
            this.triggers = Output.ofNullable(triggers);
            return this;
        }
        public Builder variables(@Nullable Output<Map<String,String>> variables) {
            this.variables = variables;
            return this;
        }
        public Builder variables(@Nullable Map<String,String> variables) {
            this.variables = Output.ofNullable(variables);
            return this;
        }        public DeploymentArgs build() {
            return new DeploymentArgs(description, restApi, stageDescription, stageName, triggers, variables);
        }
    }
}
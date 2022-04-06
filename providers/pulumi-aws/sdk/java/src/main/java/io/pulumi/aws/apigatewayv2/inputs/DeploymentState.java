// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentState extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentState Empty = new DeploymentState();

    /**
     * The API identifier.
     * 
     */
    @Import(name="apiId")
      private final @Nullable Output<String> apiId;

    public Output<String> getApiId() {
        return this.apiId == null ? Output.empty() : this.apiId;
    }

    /**
     * Whether the deployment was automatically released.
     * 
     */
    @Import(name="autoDeployed")
      private final @Nullable Output<Boolean> autoDeployed;

    public Output<Boolean> getAutoDeployed() {
        return this.autoDeployed == null ? Output.empty() : this.autoDeployed;
    }

    /**
     * The description for the deployment resource. Must be less than or equal to 1024 characters in length.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * A map of arbitrary keys and values that, when changed, will trigger a redeployment.
     * 
     */
    @Import(name="triggers")
      private final @Nullable Output<Map<String,String>> triggers;

    public Output<Map<String,String>> getTriggers() {
        return this.triggers == null ? Output.empty() : this.triggers;
    }

    public DeploymentState(
        @Nullable Output<String> apiId,
        @Nullable Output<Boolean> autoDeployed,
        @Nullable Output<String> description,
        @Nullable Output<Map<String,String>> triggers) {
        this.apiId = apiId;
        this.autoDeployed = autoDeployed;
        this.description = description;
        this.triggers = triggers;
    }

    private DeploymentState() {
        this.apiId = Output.empty();
        this.autoDeployed = Output.empty();
        this.description = Output.empty();
        this.triggers = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiId;
        private @Nullable Output<Boolean> autoDeployed;
        private @Nullable Output<String> description;
        private @Nullable Output<Map<String,String>> triggers;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.autoDeployed = defaults.autoDeployed;
    	      this.description = defaults.description;
    	      this.triggers = defaults.triggers;
        }

        public Builder apiId(@Nullable Output<String> apiId) {
            this.apiId = apiId;
            return this;
        }
        public Builder apiId(@Nullable String apiId) {
            this.apiId = Output.ofNullable(apiId);
            return this;
        }
        public Builder autoDeployed(@Nullable Output<Boolean> autoDeployed) {
            this.autoDeployed = autoDeployed;
            return this;
        }
        public Builder autoDeployed(@Nullable Boolean autoDeployed) {
            this.autoDeployed = Output.ofNullable(autoDeployed);
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
        public Builder triggers(@Nullable Output<Map<String,String>> triggers) {
            this.triggers = triggers;
            return this;
        }
        public Builder triggers(@Nullable Map<String,String> triggers) {
            this.triggers = Output.ofNullable(triggers);
            return this;
        }        public DeploymentState build() {
            return new DeploymentState(apiId, autoDeployed, description, triggers);
        }
    }
}
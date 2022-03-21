// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentArgs Empty = new DeploymentArgs();

    /**
     * The API identifier.
     * 
     */
    @Import(name="apiId", required=true)
      private final Output<String> apiId;

    public Output<String> getApiId() {
        return this.apiId;
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

    public DeploymentArgs(
        Output<String> apiId,
        @Nullable Output<String> description,
        @Nullable Output<Map<String,String>> triggers) {
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.description = description;
        this.triggers = triggers;
    }

    private DeploymentArgs() {
        this.apiId = Output.empty();
        this.description = Output.empty();
        this.triggers = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> apiId;
        private @Nullable Output<String> description;
        private @Nullable Output<Map<String,String>> triggers;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.description = defaults.description;
    	      this.triggers = defaults.triggers;
        }

        public Builder apiId(Output<String> apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }
        public Builder apiId(String apiId) {
            this.apiId = Output.of(Objects.requireNonNull(apiId));
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
        }        public DeploymentArgs build() {
            return new DeploymentArgs(apiId, description, triggers);
        }
    }
}

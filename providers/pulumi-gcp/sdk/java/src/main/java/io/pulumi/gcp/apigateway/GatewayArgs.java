// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigateway;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayArgs Empty = new GatewayArgs();

    /**
     * Resource name of the API Config for this Gateway. Format: projects/{project}/locations/global/apis/{api}/configs/{apiConfig}.
     * When changing api configs please ensure the new config is a new resource and the lifecycle rule `create_before_destroy` is set.
     * 
     */
    @InputImport(name="apiConfig", required=true)
      private final Input<String> apiConfig;

    public Input<String> getApiConfig() {
        return this.apiConfig;
    }

    /**
     * A user-visible name for the API.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Identifier to assign to the Gateway. Must be unique within scope of the parent resource(project).
     * 
     */
    @InputImport(name="gatewayId", required=true)
      private final Input<String> gatewayId;

    public Input<String> getGatewayId() {
        return this.gatewayId;
    }

    /**
     * Resource labels to represent user-provided metadata.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The region of the gateway for the API.
     * 
     */
    @InputImport(name="region")
      private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    public GatewayArgs(
        Input<String> apiConfig,
        @Nullable Input<String> displayName,
        Input<String> gatewayId,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> project,
        @Nullable Input<String> region) {
        this.apiConfig = Objects.requireNonNull(apiConfig, "expected parameter 'apiConfig' to be non-null");
        this.displayName = displayName;
        this.gatewayId = Objects.requireNonNull(gatewayId, "expected parameter 'gatewayId' to be non-null");
        this.labels = labels;
        this.project = project;
        this.region = region;
    }

    private GatewayArgs() {
        this.apiConfig = Input.empty();
        this.displayName = Input.empty();
        this.gatewayId = Input.empty();
        this.labels = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> apiConfig;
        private @Nullable Input<String> displayName;
        private Input<String> gatewayId;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiConfig = defaults.apiConfig;
    	      this.displayName = defaults.displayName;
    	      this.gatewayId = defaults.gatewayId;
    	      this.labels = defaults.labels;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder setApiConfig(Input<String> apiConfig) {
            this.apiConfig = Objects.requireNonNull(apiConfig);
            return this;
        }

        public Builder setApiConfig(String apiConfig) {
            this.apiConfig = Input.of(Objects.requireNonNull(apiConfig));
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setGatewayId(Input<String> gatewayId) {
            this.gatewayId = Objects.requireNonNull(gatewayId);
            return this;
        }

        public Builder setGatewayId(String gatewayId) {
            this.gatewayId = Input.of(Objects.requireNonNull(gatewayId));
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }
        public GatewayArgs build() {
            return new GatewayArgs(apiConfig, displayName, gatewayId, labels, project, region);
        }
    }
}

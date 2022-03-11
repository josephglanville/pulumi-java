// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.diagflow.inputs.FulfillmentFeatureGetArgs;
import io.pulumi.gcp.diagflow.inputs.FulfillmentGenericWebServiceGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FulfillmentState extends io.pulumi.resources.ResourceArgs {

    public static final FulfillmentState Empty = new FulfillmentState();

    /**
     * The human-readable name of the fulfillment, unique within the agent.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * Whether fulfillment is enabled.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * The field defines whether the fulfillment is enabled for certain features.
     * Structure is documented below.
     * 
     */
    @InputImport(name="features")
      private final @Nullable Output<List<FulfillmentFeatureGetArgs>> features;

    public Output<List<FulfillmentFeatureGetArgs>> getFeatures() {
        return this.features == null ? Output.empty() : this.features;
    }

    /**
     * Represents configuration for a generic web service. Dialogflow supports two mechanisms for authentications: - Basic authentication with username and password. - Authentication with additional authentication headers.
     * Structure is documented below.
     * 
     */
    @InputImport(name="genericWebService")
      private final @Nullable Output<FulfillmentGenericWebServiceGetArgs> genericWebService;

    public Output<FulfillmentGenericWebServiceGetArgs> getGenericWebService() {
        return this.genericWebService == null ? Output.empty() : this.genericWebService;
    }

    /**
     * The unique identifier of the fulfillment. Format: projects/<Project ID>/agent/fulfillment - projects/<Project
     * ID>/locations/<Location ID>/agent/fulfillment
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    public FulfillmentState(
        @Nullable Output<String> displayName,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<List<FulfillmentFeatureGetArgs>> features,
        @Nullable Output<FulfillmentGenericWebServiceGetArgs> genericWebService,
        @Nullable Output<String> name,
        @Nullable Output<String> project) {
        this.displayName = displayName;
        this.enabled = enabled;
        this.features = features;
        this.genericWebService = genericWebService;
        this.name = name;
        this.project = project;
    }

    private FulfillmentState() {
        this.displayName = Output.empty();
        this.enabled = Output.empty();
        this.features = Output.empty();
        this.genericWebService = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FulfillmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> displayName;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<List<FulfillmentFeatureGetArgs>> features;
        private @Nullable Output<FulfillmentGenericWebServiceGetArgs> genericWebService;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(FulfillmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.enabled = defaults.enabled;
    	      this.features = defaults.features;
    	      this.genericWebService = defaults.genericWebService;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }

        public Builder features(@Nullable Output<List<FulfillmentFeatureGetArgs>> features) {
            this.features = features;
            return this;
        }

        public Builder features(@Nullable List<FulfillmentFeatureGetArgs> features) {
            this.features = Output.ofNullable(features);
            return this;
        }

        public Builder genericWebService(@Nullable Output<FulfillmentGenericWebServiceGetArgs> genericWebService) {
            this.genericWebService = genericWebService;
            return this;
        }

        public Builder genericWebService(@Nullable FulfillmentGenericWebServiceGetArgs genericWebService) {
            this.genericWebService = Output.ofNullable(genericWebService);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public FulfillmentState build() {
            return new FulfillmentState(displayName, enabled, features, genericWebService, name, project);
        }
    }
}

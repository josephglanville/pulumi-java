// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1FulfillmentFeatureArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * By default, your agent responds to a matched intent with a static response. As an alternative, you can provide a more dynamic response by using fulfillment. When you enable fulfillment for an intent, Dialogflow responds to that intent by calling a service that you define. For example, if an end-user wants to schedule a haircut on Friday, your service can check your database and respond to the end-user with availability information for Friday. For more information, see the [fulfillment guide](https://cloud.google.com/dialogflow/docs/fulfillment-overview).
 * 
 */
public final class GoogleCloudDialogflowV2beta1FulfillmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1FulfillmentArgs Empty = new GoogleCloudDialogflowV2beta1FulfillmentArgs();

    /**
     * The human-readable name of the fulfillment, unique within the agent. This field is not used for Fulfillment in an Environment.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * Whether fulfillment is enabled.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * The field defines whether the fulfillment is enabled for certain features.
     * 
     */
    @Import(name="features")
      private final @Nullable Output<List<GoogleCloudDialogflowV2beta1FulfillmentFeatureArgs>> features;

    public Output<List<GoogleCloudDialogflowV2beta1FulfillmentFeatureArgs>> getFeatures() {
        return this.features == null ? Output.empty() : this.features;
    }

    /**
     * Configuration for a generic web service.
     * 
     */
    @Import(name="genericWebService")
      private final @Nullable Output<GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceArgs> genericWebService;

    public Output<GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceArgs> getGenericWebService() {
        return this.genericWebService == null ? Output.empty() : this.genericWebService;
    }

    /**
     * The unique identifier of the fulfillment. Supported formats: - `projects//agent/fulfillment` - `projects//locations//agent/fulfillment` This field is not used for Fulfillment in an Environment.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public GoogleCloudDialogflowV2beta1FulfillmentArgs(
        @Nullable Output<String> displayName,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<List<GoogleCloudDialogflowV2beta1FulfillmentFeatureArgs>> features,
        @Nullable Output<GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceArgs> genericWebService,
        Output<String> name) {
        this.displayName = displayName;
        this.enabled = enabled;
        this.features = features;
        this.genericWebService = genericWebService;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1FulfillmentArgs() {
        this.displayName = Output.empty();
        this.enabled = Output.empty();
        this.features = Output.empty();
        this.genericWebService = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1FulfillmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> displayName;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<List<GoogleCloudDialogflowV2beta1FulfillmentFeatureArgs>> features;
        private @Nullable Output<GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceArgs> genericWebService;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1FulfillmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.enabled = defaults.enabled;
    	      this.features = defaults.features;
    	      this.genericWebService = defaults.genericWebService;
    	      this.name = defaults.name;
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
        public Builder features(@Nullable Output<List<GoogleCloudDialogflowV2beta1FulfillmentFeatureArgs>> features) {
            this.features = features;
            return this;
        }
        public Builder features(@Nullable List<GoogleCloudDialogflowV2beta1FulfillmentFeatureArgs> features) {
            this.features = Output.ofNullable(features);
            return this;
        }
        public Builder features(GoogleCloudDialogflowV2beta1FulfillmentFeatureArgs... features) {
            return features(List.of(features));
        }
        public Builder genericWebService(@Nullable Output<GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceArgs> genericWebService) {
            this.genericWebService = genericWebService;
            return this;
        }
        public Builder genericWebService(@Nullable GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceArgs genericWebService) {
            this.genericWebService = Output.ofNullable(genericWebService);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public GoogleCloudDialogflowV2beta1FulfillmentArgs build() {
            return new GoogleCloudDialogflowV2beta1FulfillmentArgs(displayName, enabled, features, genericWebService, name);
        }
    }
}

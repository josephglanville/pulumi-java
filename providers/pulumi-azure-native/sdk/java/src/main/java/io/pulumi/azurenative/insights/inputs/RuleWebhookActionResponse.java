// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the action to post to service when the rule condition is evaluated. The discriminator is always RuleWebhookAction in this case.
 * 
 */
public final class RuleWebhookActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final RuleWebhookActionResponse Empty = new RuleWebhookActionResponse();

    /**
     * specifies the type of the action. There are two types of actions: RuleEmailAction and RuleWebhookAction.
     * Expected value is 'Microsoft.Azure.Management.Insights.Models.RuleWebhookAction'.
     * 
     */
    @Import(name="odataType", required=true)
      private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    /**
     * the dictionary of custom properties to include with the post operation. These data are appended to the webhook payload.
     * 
     */
    @Import(name="properties")
      private final @Nullable Map<String,String> properties;

    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }

    /**
     * the service uri to Post the notification when the alert activates or resolves.
     * 
     */
    @Import(name="serviceUri")
      private final @Nullable String serviceUri;

    public Optional<String> getServiceUri() {
        return this.serviceUri == null ? Optional.empty() : Optional.ofNullable(this.serviceUri);
    }

    public RuleWebhookActionResponse(
        String odataType,
        @Nullable Map<String,String> properties,
        @Nullable String serviceUri) {
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.properties = properties;
        this.serviceUri = serviceUri;
    }

    private RuleWebhookActionResponse() {
        this.odataType = null;
        this.properties = Map.of();
        this.serviceUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleWebhookActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String odataType;
        private @Nullable Map<String,String> properties;
        private @Nullable String serviceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleWebhookActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
    	      this.properties = defaults.properties;
    	      this.serviceUri = defaults.serviceUri;
        }

        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }
        public Builder serviceUri(@Nullable String serviceUri) {
            this.serviceUri = serviceUri;
            return this;
        }        public RuleWebhookActionResponse build() {
            return new RuleWebhookActionResponse(odataType, properties, serviceUri);
        }
    }
}

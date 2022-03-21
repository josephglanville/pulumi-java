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
 * An alert action.
 * 
 */
public final class MetricAlertActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final MetricAlertActionResponse Empty = new MetricAlertActionResponse();

    /**
     * the id of the action group to use.
     * 
     */
    @Import(name="actionGroupId")
      private final @Nullable String actionGroupId;

    public Optional<String> getActionGroupId() {
        return this.actionGroupId == null ? Optional.empty() : Optional.ofNullable(this.actionGroupId);
    }

    /**
     * This field allows specifying custom properties, which would be appended to the alert payload sent as input to the webhook.
     * 
     */
    @Import(name="webHookProperties")
      private final @Nullable Map<String,String> webHookProperties;

    public Map<String,String> getWebHookProperties() {
        return this.webHookProperties == null ? Map.of() : this.webHookProperties;
    }

    public MetricAlertActionResponse(
        @Nullable String actionGroupId,
        @Nullable Map<String,String> webHookProperties) {
        this.actionGroupId = actionGroupId;
        this.webHookProperties = webHookProperties;
    }

    private MetricAlertActionResponse() {
        this.actionGroupId = null;
        this.webHookProperties = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricAlertActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String actionGroupId;
        private @Nullable Map<String,String> webHookProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricAlertActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionGroupId = defaults.actionGroupId;
    	      this.webHookProperties = defaults.webHookProperties;
        }

        public Builder actionGroupId(@Nullable String actionGroupId) {
            this.actionGroupId = actionGroupId;
            return this;
        }
        public Builder webHookProperties(@Nullable Map<String,String> webHookProperties) {
            this.webHookProperties = webHookProperties;
            return this;
        }        public MetricAlertActionResponse build() {
            return new MetricAlertActionResponse(actionGroupId, webHookProperties);
        }
    }
}

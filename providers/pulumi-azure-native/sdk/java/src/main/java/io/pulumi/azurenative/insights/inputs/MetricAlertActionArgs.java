// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An alert action.
 * 
 */
public final class MetricAlertActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricAlertActionArgs Empty = new MetricAlertActionArgs();

    /**
     * the id of the action group to use.
     * 
     */
    @Import(name="actionGroupId")
      private final @Nullable Output<String> actionGroupId;

    public Output<String> getActionGroupId() {
        return this.actionGroupId == null ? Output.empty() : this.actionGroupId;
    }

    /**
     * This field allows specifying custom properties, which would be appended to the alert payload sent as input to the webhook.
     * 
     */
    @Import(name="webHookProperties")
      private final @Nullable Output<Map<String,String>> webHookProperties;

    public Output<Map<String,String>> getWebHookProperties() {
        return this.webHookProperties == null ? Output.empty() : this.webHookProperties;
    }

    public MetricAlertActionArgs(
        @Nullable Output<String> actionGroupId,
        @Nullable Output<Map<String,String>> webHookProperties) {
        this.actionGroupId = actionGroupId;
        this.webHookProperties = webHookProperties;
    }

    private MetricAlertActionArgs() {
        this.actionGroupId = Output.empty();
        this.webHookProperties = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricAlertActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> actionGroupId;
        private @Nullable Output<Map<String,String>> webHookProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricAlertActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionGroupId = defaults.actionGroupId;
    	      this.webHookProperties = defaults.webHookProperties;
        }

        public Builder actionGroupId(@Nullable Output<String> actionGroupId) {
            this.actionGroupId = actionGroupId;
            return this;
        }
        public Builder actionGroupId(@Nullable String actionGroupId) {
            this.actionGroupId = Output.ofNullable(actionGroupId);
            return this;
        }
        public Builder webHookProperties(@Nullable Output<Map<String,String>> webHookProperties) {
            this.webHookProperties = webHookProperties;
            return this;
        }
        public Builder webHookProperties(@Nullable Map<String,String> webHookProperties) {
            this.webHookProperties = Output.ofNullable(webHookProperties);
            return this;
        }        public MetricAlertActionArgs build() {
            return new MetricAlertActionArgs(actionGroupId, webHookProperties);
        }
    }
}

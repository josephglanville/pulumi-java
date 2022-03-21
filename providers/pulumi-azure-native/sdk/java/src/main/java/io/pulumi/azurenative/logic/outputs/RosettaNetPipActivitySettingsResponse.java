// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.RosettaNetPipAcknowledgmentOfReceiptSettingsResponse;
import io.pulumi.azurenative.logic.outputs.RosettaNetPipActivityBehaviorResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RosettaNetPipActivitySettingsResponse {
    /**
     * The RosettaNet ProcessConfiguration acknowledgement settings.
     * 
     */
    private final RosettaNetPipAcknowledgmentOfReceiptSettingsResponse acknowledgmentOfReceiptSettings;
    /**
     * The RosettaNet ProcessConfiguration activity behavior.
     * 
     */
    private final RosettaNetPipActivityBehaviorResponse activityBehavior;
    /**
     * The RosettaNet ProcessConfiguration activity type.
     * 
     */
    private final String activityType;

    @CustomType.Constructor
    private RosettaNetPipActivitySettingsResponse(
        @CustomType.Parameter("acknowledgmentOfReceiptSettings") RosettaNetPipAcknowledgmentOfReceiptSettingsResponse acknowledgmentOfReceiptSettings,
        @CustomType.Parameter("activityBehavior") RosettaNetPipActivityBehaviorResponse activityBehavior,
        @CustomType.Parameter("activityType") String activityType) {
        this.acknowledgmentOfReceiptSettings = acknowledgmentOfReceiptSettings;
        this.activityBehavior = activityBehavior;
        this.activityType = activityType;
    }

    /**
     * The RosettaNet ProcessConfiguration acknowledgement settings.
     * 
    */
    public RosettaNetPipAcknowledgmentOfReceiptSettingsResponse getAcknowledgmentOfReceiptSettings() {
        return this.acknowledgmentOfReceiptSettings;
    }
    /**
     * The RosettaNet ProcessConfiguration activity behavior.
     * 
    */
    public RosettaNetPipActivityBehaviorResponse getActivityBehavior() {
        return this.activityBehavior;
    }
    /**
     * The RosettaNet ProcessConfiguration activity type.
     * 
    */
    public String getActivityType() {
        return this.activityType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RosettaNetPipActivitySettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RosettaNetPipAcknowledgmentOfReceiptSettingsResponse acknowledgmentOfReceiptSettings;
        private RosettaNetPipActivityBehaviorResponse activityBehavior;
        private String activityType;

        public Builder() {
    	      // Empty
        }

        public Builder(RosettaNetPipActivitySettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acknowledgmentOfReceiptSettings = defaults.acknowledgmentOfReceiptSettings;
    	      this.activityBehavior = defaults.activityBehavior;
    	      this.activityType = defaults.activityType;
        }

        public Builder acknowledgmentOfReceiptSettings(RosettaNetPipAcknowledgmentOfReceiptSettingsResponse acknowledgmentOfReceiptSettings) {
            this.acknowledgmentOfReceiptSettings = Objects.requireNonNull(acknowledgmentOfReceiptSettings);
            return this;
        }
        public Builder activityBehavior(RosettaNetPipActivityBehaviorResponse activityBehavior) {
            this.activityBehavior = Objects.requireNonNull(activityBehavior);
            return this;
        }
        public Builder activityType(String activityType) {
            this.activityType = Objects.requireNonNull(activityType);
            return this;
        }        public RosettaNetPipActivitySettingsResponse build() {
            return new RosettaNetPipActivitySettingsResponse(acknowledgmentOfReceiptSettings, activityBehavior, activityType);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.RosettaNetPipAcknowledgmentOfReceiptSettingsResponse;
import io.pulumi.azurenative.logic.inputs.RosettaNetPipActivityBehaviorResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class RosettaNetPipActivitySettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final RosettaNetPipActivitySettingsResponse Empty = new RosettaNetPipActivitySettingsResponse();

    @InputImport(name="acknowledgmentOfReceiptSettings", required=true)
    private final RosettaNetPipAcknowledgmentOfReceiptSettingsResponse acknowledgmentOfReceiptSettings;

    public RosettaNetPipAcknowledgmentOfReceiptSettingsResponse getAcknowledgmentOfReceiptSettings() {
        return this.acknowledgmentOfReceiptSettings;
    }

    @InputImport(name="activityBehavior", required=true)
    private final RosettaNetPipActivityBehaviorResponse activityBehavior;

    public RosettaNetPipActivityBehaviorResponse getActivityBehavior() {
        return this.activityBehavior;
    }

    @InputImport(name="activityType", required=true)
    private final String activityType;

    public String getActivityType() {
        return this.activityType;
    }

    public RosettaNetPipActivitySettingsResponse(
        RosettaNetPipAcknowledgmentOfReceiptSettingsResponse acknowledgmentOfReceiptSettings,
        RosettaNetPipActivityBehaviorResponse activityBehavior,
        String activityType) {
        this.acknowledgmentOfReceiptSettings = Objects.requireNonNull(acknowledgmentOfReceiptSettings, "expected parameter 'acknowledgmentOfReceiptSettings' to be non-null");
        this.activityBehavior = Objects.requireNonNull(activityBehavior, "expected parameter 'activityBehavior' to be non-null");
        this.activityType = Objects.requireNonNull(activityType, "expected parameter 'activityType' to be non-null");
    }

    private RosettaNetPipActivitySettingsResponse() {
        this.acknowledgmentOfReceiptSettings = null;
        this.activityBehavior = null;
        this.activityType = null;
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

        public Builder setAcknowledgmentOfReceiptSettings(RosettaNetPipAcknowledgmentOfReceiptSettingsResponse acknowledgmentOfReceiptSettings) {
            this.acknowledgmentOfReceiptSettings = Objects.requireNonNull(acknowledgmentOfReceiptSettings);
            return this;
        }

        public Builder setActivityBehavior(RosettaNetPipActivityBehaviorResponse activityBehavior) {
            this.activityBehavior = Objects.requireNonNull(activityBehavior);
            return this;
        }

        public Builder setActivityType(String activityType) {
            this.activityType = Objects.requireNonNull(activityType);
            return this;
        }

        public RosettaNetPipActivitySettingsResponse build() {
            return new RosettaNetPipActivitySettingsResponse(acknowledgmentOfReceiptSettings, activityBehavior, activityType);
        }
    }
}

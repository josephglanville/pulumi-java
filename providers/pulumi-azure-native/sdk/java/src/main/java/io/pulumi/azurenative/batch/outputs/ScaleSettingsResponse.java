// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.azurenative.batch.outputs.AutoScaleSettingsResponse;
import io.pulumi.azurenative.batch.outputs.FixedScaleSettingsResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScaleSettingsResponse {
    /**
     * This property and fixedScale are mutually exclusive and one of the properties must be specified.
     * 
     */
    private final @Nullable AutoScaleSettingsResponse autoScale;
    /**
     * This property and autoScale are mutually exclusive and one of the properties must be specified.
     * 
     */
    private final @Nullable FixedScaleSettingsResponse fixedScale;

    @CustomType.Constructor
    private ScaleSettingsResponse(
        @CustomType.Parameter("autoScale") @Nullable AutoScaleSettingsResponse autoScale,
        @CustomType.Parameter("fixedScale") @Nullable FixedScaleSettingsResponse fixedScale) {
        this.autoScale = autoScale;
        this.fixedScale = fixedScale;
    }

    /**
     * This property and fixedScale are mutually exclusive and one of the properties must be specified.
     * 
    */
    public Optional<AutoScaleSettingsResponse> getAutoScale() {
        return Optional.ofNullable(this.autoScale);
    }
    /**
     * This property and autoScale are mutually exclusive and one of the properties must be specified.
     * 
    */
    public Optional<FixedScaleSettingsResponse> getFixedScale() {
        return Optional.ofNullable(this.fixedScale);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AutoScaleSettingsResponse autoScale;
        private @Nullable FixedScaleSettingsResponse fixedScale;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoScale = defaults.autoScale;
    	      this.fixedScale = defaults.fixedScale;
        }

        public Builder autoScale(@Nullable AutoScaleSettingsResponse autoScale) {
            this.autoScale = autoScale;
            return this;
        }
        public Builder fixedScale(@Nullable FixedScaleSettingsResponse fixedScale) {
            this.fixedScale = fixedScale;
            return this;
        }        public ScaleSettingsResponse build() {
            return new ScaleSettingsResponse(autoScale, fixedScale);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.inputs.AutoScaleSettingsResponse;
import io.pulumi.azurenative.batch.inputs.FixedScaleSettingsResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScaleSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ScaleSettingsResponse Empty = new ScaleSettingsResponse();

    @InputImport(name="autoScale")
    private final @Nullable AutoScaleSettingsResponse autoScale;

    public Optional<AutoScaleSettingsResponse> getAutoScale() {
        return this.autoScale == null ? Optional.empty() : Optional.ofNullable(this.autoScale);
    }

    @InputImport(name="fixedScale")
    private final @Nullable FixedScaleSettingsResponse fixedScale;

    public Optional<FixedScaleSettingsResponse> getFixedScale() {
        return this.fixedScale == null ? Optional.empty() : Optional.ofNullable(this.fixedScale);
    }

    public ScaleSettingsResponse(
        @Nullable AutoScaleSettingsResponse autoScale,
        @Nullable FixedScaleSettingsResponse fixedScale) {
        this.autoScale = autoScale;
        this.fixedScale = fixedScale;
    }

    private ScaleSettingsResponse() {
        this.autoScale = null;
        this.fixedScale = null;
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

        public Builder setAutoScale(@Nullable AutoScaleSettingsResponse autoScale) {
            this.autoScale = autoScale;
            return this;
        }

        public Builder setFixedScale(@Nullable FixedScaleSettingsResponse fixedScale) {
            this.fixedScale = fixedScale;
            return this;
        }

        public ScaleSettingsResponse build() {
            return new ScaleSettingsResponse(autoScale, fixedScale);
        }
    }
}

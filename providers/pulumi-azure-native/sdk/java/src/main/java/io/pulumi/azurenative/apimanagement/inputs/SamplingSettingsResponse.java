// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Sampling settings for Diagnostic.
 * 
 */
public final class SamplingSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final SamplingSettingsResponse Empty = new SamplingSettingsResponse();

    /**
     * Rate of sampling for fixed-rate sampling.
     * 
     */
    @Import(name="percentage")
      private final @Nullable Double percentage;

    public Optional<Double> getPercentage() {
        return this.percentage == null ? Optional.empty() : Optional.ofNullable(this.percentage);
    }

    /**
     * Sampling type.
     * 
     */
    @Import(name="samplingType")
      private final @Nullable String samplingType;

    public Optional<String> getSamplingType() {
        return this.samplingType == null ? Optional.empty() : Optional.ofNullable(this.samplingType);
    }

    public SamplingSettingsResponse(
        @Nullable Double percentage,
        @Nullable String samplingType) {
        this.percentage = percentage;
        this.samplingType = samplingType;
    }

    private SamplingSettingsResponse() {
        this.percentage = null;
        this.samplingType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SamplingSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double percentage;
        private @Nullable String samplingType;

        public Builder() {
    	      // Empty
        }

        public Builder(SamplingSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.percentage = defaults.percentage;
    	      this.samplingType = defaults.samplingType;
        }

        public Builder percentage(@Nullable Double percentage) {
            this.percentage = percentage;
            return this;
        }
        public Builder samplingType(@Nullable String samplingType) {
            this.samplingType = samplingType;
            return this;
        }        public SamplingSettingsResponse build() {
            return new SamplingSettingsResponse(percentage, samplingType);
        }
    }
}

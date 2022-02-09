// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancingSettingsParametersResponse extends io.pulumi.resources.InvokeArgs {

    public static final LoadBalancingSettingsParametersResponse Empty = new LoadBalancingSettingsParametersResponse();

    @InputImport(name="additionalLatencyInMilliseconds")
    private final @Nullable Integer additionalLatencyInMilliseconds;

    public Optional<Integer> getAdditionalLatencyInMilliseconds() {
        return this.additionalLatencyInMilliseconds == null ? Optional.empty() : Optional.ofNullable(this.additionalLatencyInMilliseconds);
    }

    @InputImport(name="sampleSize")
    private final @Nullable Integer sampleSize;

    public Optional<Integer> getSampleSize() {
        return this.sampleSize == null ? Optional.empty() : Optional.ofNullable(this.sampleSize);
    }

    @InputImport(name="successfulSamplesRequired")
    private final @Nullable Integer successfulSamplesRequired;

    public Optional<Integer> getSuccessfulSamplesRequired() {
        return this.successfulSamplesRequired == null ? Optional.empty() : Optional.ofNullable(this.successfulSamplesRequired);
    }

    public LoadBalancingSettingsParametersResponse(
        @Nullable Integer additionalLatencyInMilliseconds,
        @Nullable Integer sampleSize,
        @Nullable Integer successfulSamplesRequired) {
        this.additionalLatencyInMilliseconds = additionalLatencyInMilliseconds;
        this.sampleSize = sampleSize;
        this.successfulSamplesRequired = successfulSamplesRequired;
    }

    private LoadBalancingSettingsParametersResponse() {
        this.additionalLatencyInMilliseconds = null;
        this.sampleSize = null;
        this.successfulSamplesRequired = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancingSettingsParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer additionalLatencyInMilliseconds;
        private @Nullable Integer sampleSize;
        private @Nullable Integer successfulSamplesRequired;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancingSettingsParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalLatencyInMilliseconds = defaults.additionalLatencyInMilliseconds;
    	      this.sampleSize = defaults.sampleSize;
    	      this.successfulSamplesRequired = defaults.successfulSamplesRequired;
        }

        public Builder setAdditionalLatencyInMilliseconds(@Nullable Integer additionalLatencyInMilliseconds) {
            this.additionalLatencyInMilliseconds = additionalLatencyInMilliseconds;
            return this;
        }

        public Builder setSampleSize(@Nullable Integer sampleSize) {
            this.sampleSize = sampleSize;
            return this;
        }

        public Builder setSuccessfulSamplesRequired(@Nullable Integer successfulSamplesRequired) {
            this.successfulSamplesRequired = successfulSamplesRequired;
            return this;
        }

        public LoadBalancingSettingsParametersResponse build() {
            return new LoadBalancingSettingsParametersResponse(additionalLatencyInMilliseconds, sampleSize, successfulSamplesRequired);
        }
    }
}

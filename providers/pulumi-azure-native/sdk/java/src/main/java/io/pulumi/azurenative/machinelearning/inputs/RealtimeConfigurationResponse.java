// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RealtimeConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final RealtimeConfigurationResponse Empty = new RealtimeConfigurationResponse();

    @InputImport(name="maxConcurrentCalls")
    private final @Nullable Integer maxConcurrentCalls;

    public Optional<Integer> getMaxConcurrentCalls() {
        return this.maxConcurrentCalls == null ? Optional.empty() : Optional.ofNullable(this.maxConcurrentCalls);
    }

    public RealtimeConfigurationResponse(@Nullable Integer maxConcurrentCalls) {
        this.maxConcurrentCalls = maxConcurrentCalls;
    }

    private RealtimeConfigurationResponse() {
        this.maxConcurrentCalls = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RealtimeConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxConcurrentCalls;

        public Builder() {
    	      // Empty
        }

        public Builder(RealtimeConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxConcurrentCalls = defaults.maxConcurrentCalls;
        }

        public Builder setMaxConcurrentCalls(@Nullable Integer maxConcurrentCalls) {
            this.maxConcurrentCalls = maxConcurrentCalls;
            return this;
        }

        public RealtimeConfigurationResponse build() {
            return new RealtimeConfigurationResponse(maxConcurrentCalls);
        }
    }
}

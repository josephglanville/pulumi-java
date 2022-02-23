// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionBackendServiceCircuitBreakersConnectTimeoutArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionBackendServiceCircuitBreakersConnectTimeoutArgs Empty = new RegionBackendServiceCircuitBreakersConnectTimeoutArgs();

    /**
     * Span of time that's a fraction of a second at nanosecond resolution. Durations
     * less than one second are represented with a 0 `seconds` field and a positive
     * `nanos` field. Must be from 0 to 999,999,999 inclusive.
     * 
     */
    @InputImport(name="nanos")
      private final @Nullable Input<Integer> nanos;

    public Input<Integer> getNanos() {
        return this.nanos == null ? Input.empty() : this.nanos;
    }

    /**
     * Span of time at a resolution of a second. Must be from 0 to 315,576,000,000
     * inclusive.
     * 
     */
    @InputImport(name="seconds", required=true)
      private final Input<Integer> seconds;

    public Input<Integer> getSeconds() {
        return this.seconds;
    }

    public RegionBackendServiceCircuitBreakersConnectTimeoutArgs(
        @Nullable Input<Integer> nanos,
        Input<Integer> seconds) {
        this.nanos = nanos;
        this.seconds = Objects.requireNonNull(seconds, "expected parameter 'seconds' to be non-null");
    }

    private RegionBackendServiceCircuitBreakersConnectTimeoutArgs() {
        this.nanos = Input.empty();
        this.seconds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionBackendServiceCircuitBreakersConnectTimeoutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> nanos;
        private Input<Integer> seconds;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionBackendServiceCircuitBreakersConnectTimeoutArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nanos = defaults.nanos;
    	      this.seconds = defaults.seconds;
        }

        public Builder setNanos(@Nullable Input<Integer> nanos) {
            this.nanos = nanos;
            return this;
        }

        public Builder setNanos(@Nullable Integer nanos) {
            this.nanos = Input.ofNullable(nanos);
            return this;
        }

        public Builder setSeconds(Input<Integer> seconds) {
            this.seconds = Objects.requireNonNull(seconds);
            return this;
        }

        public Builder setSeconds(Integer seconds) {
            this.seconds = Input.of(Objects.requireNonNull(seconds));
            return this;
        }
        public RegionBackendServiceCircuitBreakersConnectTimeoutArgs build() {
            return new RegionBackendServiceCircuitBreakersConnectTimeoutArgs(nanos, seconds);
        }
    }
}

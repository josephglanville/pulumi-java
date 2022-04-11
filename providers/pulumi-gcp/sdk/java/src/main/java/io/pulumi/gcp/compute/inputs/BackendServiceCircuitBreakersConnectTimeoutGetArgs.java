// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackendServiceCircuitBreakersConnectTimeoutGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendServiceCircuitBreakersConnectTimeoutGetArgs Empty = new BackendServiceCircuitBreakersConnectTimeoutGetArgs();

    /**
     * Span of time that's a fraction of a second at nanosecond resolution. Durations
     * less than one second are represented with a 0 `seconds` field and a positive
     * `nanos` field. Must be from 0 to 999,999,999 inclusive.
     * 
     */
    @Import(name="nanos")
      private final @Nullable Output<Integer> nanos;

    public Output<Integer> getNanos() {
        return this.nanos == null ? Codegen.empty() : this.nanos;
    }

    /**
     * Span of time at a resolution of a second. Must be from 0 to 315,576,000,000
     * inclusive.
     * 
     */
    @Import(name="seconds", required=true)
      private final Output<Integer> seconds;

    public Output<Integer> getSeconds() {
        return this.seconds;
    }

    public BackendServiceCircuitBreakersConnectTimeoutGetArgs(
        @Nullable Output<Integer> nanos,
        Output<Integer> seconds) {
        this.nanos = nanos;
        this.seconds = Objects.requireNonNull(seconds, "expected parameter 'seconds' to be non-null");
    }

    private BackendServiceCircuitBreakersConnectTimeoutGetArgs() {
        this.nanos = Codegen.empty();
        this.seconds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceCircuitBreakersConnectTimeoutGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> nanos;
        private Output<Integer> seconds;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceCircuitBreakersConnectTimeoutGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nanos = defaults.nanos;
    	      this.seconds = defaults.seconds;
        }

        public Builder nanos(@Nullable Output<Integer> nanos) {
            this.nanos = nanos;
            return this;
        }
        public Builder nanos(@Nullable Integer nanos) {
            this.nanos = Codegen.ofNullable(nanos);
            return this;
        }
        public Builder seconds(Output<Integer> seconds) {
            this.seconds = Objects.requireNonNull(seconds);
            return this;
        }
        public Builder seconds(Integer seconds) {
            this.seconds = Output.of(Objects.requireNonNull(seconds));
            return this;
        }        public BackendServiceCircuitBreakersConnectTimeoutGetArgs build() {
            return new BackendServiceCircuitBreakersConnectTimeoutGetArgs(nanos, seconds);
        }
    }
}

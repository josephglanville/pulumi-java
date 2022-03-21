// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_alpha.inputs.DurationArgs;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the delay introduced by the load balancer before forwarding the request to the backend service as part of fault injection.
 * 
 */
public final class HttpFaultDelayArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpFaultDelayArgs Empty = new HttpFaultDelayArgs();

    /**
     * Specifies the value of the fixed delay interval.
     * 
     */
    @Import(name="fixedDelay")
      private final @Nullable Output<DurationArgs> fixedDelay;

    public Output<DurationArgs> getFixedDelay() {
        return this.fixedDelay == null ? Output.empty() : this.fixedDelay;
    }

    /**
     * The percentage of traffic for connections, operations, or requests for which a delay is introduced as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
     * 
     */
    @Import(name="percentage")
      private final @Nullable Output<Double> percentage;

    public Output<Double> getPercentage() {
        return this.percentage == null ? Output.empty() : this.percentage;
    }

    public HttpFaultDelayArgs(
        @Nullable Output<DurationArgs> fixedDelay,
        @Nullable Output<Double> percentage) {
        this.fixedDelay = fixedDelay;
        this.percentage = percentage;
    }

    private HttpFaultDelayArgs() {
        this.fixedDelay = Output.empty();
        this.percentage = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpFaultDelayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DurationArgs> fixedDelay;
        private @Nullable Output<Double> percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpFaultDelayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixedDelay = defaults.fixedDelay;
    	      this.percentage = defaults.percentage;
        }

        public Builder fixedDelay(@Nullable Output<DurationArgs> fixedDelay) {
            this.fixedDelay = fixedDelay;
            return this;
        }
        public Builder fixedDelay(@Nullable DurationArgs fixedDelay) {
            this.fixedDelay = Output.ofNullable(fixedDelay);
            return this;
        }
        public Builder percentage(@Nullable Output<Double> percentage) {
            this.percentage = percentage;
            return this;
        }
        public Builder percentage(@Nullable Double percentage) {
            this.percentage = Output.ofNullable(percentage);
            return this;
        }        public HttpFaultDelayArgs build() {
            return new HttpFaultDelayArgs(fixedDelay, percentage);
        }
    }
}

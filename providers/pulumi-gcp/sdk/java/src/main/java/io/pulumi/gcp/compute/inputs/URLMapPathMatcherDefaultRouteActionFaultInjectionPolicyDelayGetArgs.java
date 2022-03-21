// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayGetArgs Empty = new URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayGetArgs();

    /**
     * Specifies the value of the fixed delay interval.
     * Structure is documented below.
     * 
     */
    @Import(name="fixedDelay")
      private final @Nullable Output<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs> fixedDelay;

    public Output<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs> getFixedDelay() {
        return this.fixedDelay == null ? Output.empty() : this.fixedDelay;
    }

    /**
     * The percentage of traffic (connections/operations/requests) which will be aborted as part of fault injection.
     * The value must be between 0.0 and 100.0 inclusive.
     * 
     */
    @Import(name="percentage")
      private final @Nullable Output<Double> percentage;

    public Output<Double> getPercentage() {
        return this.percentage == null ? Output.empty() : this.percentage;
    }

    public URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayGetArgs(
        @Nullable Output<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs> fixedDelay,
        @Nullable Output<Double> percentage) {
        this.fixedDelay = fixedDelay;
        this.percentage = percentage;
    }

    private URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayGetArgs() {
        this.fixedDelay = Output.empty();
        this.percentage = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs> fixedDelay;
        private @Nullable Output<Double> percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixedDelay = defaults.fixedDelay;
    	      this.percentage = defaults.percentage;
        }

        public Builder fixedDelay(@Nullable Output<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs> fixedDelay) {
            this.fixedDelay = fixedDelay;
            return this;
        }
        public Builder fixedDelay(@Nullable URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs fixedDelay) {
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
        }        public URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayGetArgs build() {
            return new URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayGetArgs(fixedDelay, percentage);
        }
    }
}

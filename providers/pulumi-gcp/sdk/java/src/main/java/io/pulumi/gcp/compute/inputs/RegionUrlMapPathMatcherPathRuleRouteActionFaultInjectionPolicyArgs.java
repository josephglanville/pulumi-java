// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs Empty = new RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs();

    /**
     * The specification for how client requests are aborted as part of fault
     * injection.
     * Structure is documented below.
     * 
     */
    @InputImport(name="abort")
      private final @Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs> abort;

    public Input<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs> getAbort() {
        return this.abort == null ? Input.empty() : this.abort;
    }

    /**
     * The specification for how client requests are delayed as part of fault
     * injection, before being sent to a backend service.
     * Structure is documented below.
     * 
     */
    @InputImport(name="delay")
      private final @Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs> delay;

    public Input<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs> getDelay() {
        return this.delay == null ? Input.empty() : this.delay;
    }

    public RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs(
        @Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs> abort,
        @Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs> delay) {
        this.abort = abort;
        this.delay = delay;
    }

    private RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs() {
        this.abort = Input.empty();
        this.delay = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs> abort;
        private @Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs> delay;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abort = defaults.abort;
    	      this.delay = defaults.delay;
        }

        public Builder setAbort(@Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs> abort) {
            this.abort = abort;
            return this;
        }

        public Builder setAbort(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs abort) {
            this.abort = Input.ofNullable(abort);
            return this;
        }

        public Builder setDelay(@Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs> delay) {
            this.delay = delay;
            return this;
        }

        public Builder setDelay(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs delay) {
            this.delay = Input.ofNullable(delay);
            return this;
        }
        public RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs build() {
            return new RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs(abort, delay);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionFaultInjectionPolicyAbortArgs;
import io.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionFaultInjectionPolicyDelayArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapDefaultRouteActionFaultInjectionPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapDefaultRouteActionFaultInjectionPolicyArgs Empty = new URLMapDefaultRouteActionFaultInjectionPolicyArgs();

    /**
     * The specification for how client requests are aborted as part of fault injection.
     * Structure is documented below.
     * 
     */
    @Import(name="abort")
      private final @Nullable Output<URLMapDefaultRouteActionFaultInjectionPolicyAbortArgs> abort;

    public Output<URLMapDefaultRouteActionFaultInjectionPolicyAbortArgs> getAbort() {
        return this.abort == null ? Output.empty() : this.abort;
    }

    /**
     * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * Structure is documented below.
     * 
     */
    @Import(name="delay")
      private final @Nullable Output<URLMapDefaultRouteActionFaultInjectionPolicyDelayArgs> delay;

    public Output<URLMapDefaultRouteActionFaultInjectionPolicyDelayArgs> getDelay() {
        return this.delay == null ? Output.empty() : this.delay;
    }

    public URLMapDefaultRouteActionFaultInjectionPolicyArgs(
        @Nullable Output<URLMapDefaultRouteActionFaultInjectionPolicyAbortArgs> abort,
        @Nullable Output<URLMapDefaultRouteActionFaultInjectionPolicyDelayArgs> delay) {
        this.abort = abort;
        this.delay = delay;
    }

    private URLMapDefaultRouteActionFaultInjectionPolicyArgs() {
        this.abort = Output.empty();
        this.delay = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapDefaultRouteActionFaultInjectionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<URLMapDefaultRouteActionFaultInjectionPolicyAbortArgs> abort;
        private @Nullable Output<URLMapDefaultRouteActionFaultInjectionPolicyDelayArgs> delay;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapDefaultRouteActionFaultInjectionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abort = defaults.abort;
    	      this.delay = defaults.delay;
        }

        public Builder abort(@Nullable Output<URLMapDefaultRouteActionFaultInjectionPolicyAbortArgs> abort) {
            this.abort = abort;
            return this;
        }
        public Builder abort(@Nullable URLMapDefaultRouteActionFaultInjectionPolicyAbortArgs abort) {
            this.abort = Output.ofNullable(abort);
            return this;
        }
        public Builder delay(@Nullable Output<URLMapDefaultRouteActionFaultInjectionPolicyDelayArgs> delay) {
            this.delay = delay;
            return this;
        }
        public Builder delay(@Nullable URLMapDefaultRouteActionFaultInjectionPolicyDelayArgs delay) {
            this.delay = Output.ofNullable(delay);
            return this;
        }        public URLMapDefaultRouteActionFaultInjectionPolicyArgs build() {
            return new URLMapDefaultRouteActionFaultInjectionPolicyArgs(abort, delay);
        }
    }
}

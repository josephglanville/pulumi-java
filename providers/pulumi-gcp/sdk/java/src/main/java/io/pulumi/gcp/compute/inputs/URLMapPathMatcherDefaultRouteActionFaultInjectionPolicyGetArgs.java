// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbortGetArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyGetArgs Empty = new URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyGetArgs();

    /**
     * The specification for how client requests are aborted as part of fault injection.
     * Structure is documented below.
     * 
     */
    @Import(name="abort")
      private final @Nullable Output<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbortGetArgs> abort;

    public Output<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbortGetArgs> getAbort() {
        return this.abort == null ? Output.empty() : this.abort;
    }

    /**
     * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * Structure is documented below.
     * 
     */
    @Import(name="delay")
      private final @Nullable Output<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayGetArgs> delay;

    public Output<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayGetArgs> getDelay() {
        return this.delay == null ? Output.empty() : this.delay;
    }

    public URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyGetArgs(
        @Nullable Output<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbortGetArgs> abort,
        @Nullable Output<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayGetArgs> delay) {
        this.abort = abort;
        this.delay = delay;
    }

    private URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyGetArgs() {
        this.abort = Output.empty();
        this.delay = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbortGetArgs> abort;
        private @Nullable Output<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayGetArgs> delay;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abort = defaults.abort;
    	      this.delay = defaults.delay;
        }

        public Builder abort(@Nullable Output<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbortGetArgs> abort) {
            this.abort = abort;
            return this;
        }
        public Builder abort(@Nullable URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbortGetArgs abort) {
            this.abort = Output.ofNullable(abort);
            return this;
        }
        public Builder delay(@Nullable Output<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayGetArgs> delay) {
            this.delay = delay;
            return this;
        }
        public Builder delay(@Nullable URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayGetArgs delay) {
            this.delay = Output.ofNullable(delay);
            return this;
        }        public URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyGetArgs build() {
            return new URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyGetArgs(abort, delay);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.compute_beta.outputs.HttpFaultAbortResponse;
import io.pulumi.googlenative.compute_beta.outputs.HttpFaultDelayResponse;
import java.util.Objects;

@CustomType
public final class HttpFaultInjectionResponse {
    /**
     * The specification for how client requests are aborted as part of fault injection.
     * 
     */
    private final HttpFaultAbortResponse abort;
    /**
     * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * 
     */
    private final HttpFaultDelayResponse delay;

    @CustomType.Constructor
    private HttpFaultInjectionResponse(
        @CustomType.Parameter("abort") HttpFaultAbortResponse abort,
        @CustomType.Parameter("delay") HttpFaultDelayResponse delay) {
        this.abort = abort;
        this.delay = delay;
    }

    /**
     * The specification for how client requests are aborted as part of fault injection.
     * 
    */
    public HttpFaultAbortResponse getAbort() {
        return this.abort;
    }
    /**
     * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * 
    */
    public HttpFaultDelayResponse getDelay() {
        return this.delay;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpFaultInjectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpFaultAbortResponse abort;
        private HttpFaultDelayResponse delay;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpFaultInjectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abort = defaults.abort;
    	      this.delay = defaults.delay;
        }

        public Builder abort(HttpFaultAbortResponse abort) {
            this.abort = Objects.requireNonNull(abort);
            return this;
        }
        public Builder delay(HttpFaultDelayResponse delay) {
            this.delay = Objects.requireNonNull(delay);
            return this;
        }        public HttpFaultInjectionResponse build() {
            return new HttpFaultInjectionResponse(abort, delay);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyGetArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyGetArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyGetArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyGetArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionTimeoutGetArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionUrlRewriteGetArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceGetArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherPathRuleRouteActionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherPathRuleRouteActionGetArgs Empty = new RegionUrlMapPathMatcherPathRuleRouteActionGetArgs();

    /**
     * The specification for allowing client side cross-origin requests. Please see W3C
     * Recommendation for Cross Origin Resource Sharing
     * Structure is documented below.
     * 
     */
    @Import(name="corsPolicy")
      private final @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyGetArgs> corsPolicy;

    public Output<RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyGetArgs> getCorsPolicy() {
        return this.corsPolicy == null ? Output.empty() : this.corsPolicy;
    }

    /**
     * The specification for fault injection introduced into traffic to test the
     * resiliency of clients to backend service failure. As part of fault injection,
     * when clients send requests to a backend service, delays can be introduced by
     * Loadbalancer on a percentage of requests before sending those request to the
     * backend service. Similarly requests from clients can be aborted by the
     * Loadbalancer for a percentage of requests. timeout and retry_policy will be
     * ignored by clients that are configured with a fault_injection_policy.
     * Structure is documented below.
     * 
     */
    @Import(name="faultInjectionPolicy")
      private final @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyGetArgs> faultInjectionPolicy;

    public Output<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyGetArgs> getFaultInjectionPolicy() {
        return this.faultInjectionPolicy == null ? Output.empty() : this.faultInjectionPolicy;
    }

    /**
     * Specifies the policy on how requests intended for the route's backends are
     * shadowed to a separate mirrored backend service. Loadbalancer does not wait for
     * responses from the shadow service. Prior to sending traffic to the shadow
     * service, the host / authority header is suffixed with -shadow.
     * Structure is documented below.
     * 
     */
    @Import(name="requestMirrorPolicy")
      private final @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyGetArgs> requestMirrorPolicy;

    public Output<RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyGetArgs> getRequestMirrorPolicy() {
        return this.requestMirrorPolicy == null ? Output.empty() : this.requestMirrorPolicy;
    }

    /**
     * Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
     */
    @Import(name="retryPolicy")
      private final @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyGetArgs> retryPolicy;

    public Output<RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyGetArgs> getRetryPolicy() {
        return this.retryPolicy == null ? Output.empty() : this.retryPolicy;
    }

    /**
     * Specifies the timeout for the selected route. Timeout is computed from the time
     * the request is has been fully processed (i.e. end-of-stream) up until the
     * response has been completely processed. Timeout includes all retries. If not
     * specified, the default value is 15 seconds.
     * Structure is documented below.
     * 
     */
    @Import(name="timeout")
      private final @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionTimeoutGetArgs> timeout;

    public Output<RegionUrlMapPathMatcherPathRuleRouteActionTimeoutGetArgs> getTimeout() {
        return this.timeout == null ? Output.empty() : this.timeout;
    }

    /**
     * The spec to modify the URL of the request, prior to forwarding the request to
     * the matched service
     * Structure is documented below.
     * 
     */
    @Import(name="urlRewrite")
      private final @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionUrlRewriteGetArgs> urlRewrite;

    public Output<RegionUrlMapPathMatcherPathRuleRouteActionUrlRewriteGetArgs> getUrlRewrite() {
        return this.urlRewrite == null ? Output.empty() : this.urlRewrite;
    }

    /**
     * A list of weighted backend services to send traffic to when a route match
     * occurs. The weights determine the fraction of traffic that flows to their
     * corresponding backend service. If all traffic needs to go to a single backend
     * service, there must be one  weightedBackendService with weight set to a non 0
     * number. Once a backendService is identified and before forwarding the request to
     * the backend service, advanced routing actions like Url rewrites and header
     * transformations are applied depending on additional settings specified in this
     * HttpRouteAction.
     * Structure is documented below.
     * 
     */
    @Import(name="weightedBackendServices")
      private final @Nullable Output<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceGetArgs>> weightedBackendServices;

    public Output<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceGetArgs>> getWeightedBackendServices() {
        return this.weightedBackendServices == null ? Output.empty() : this.weightedBackendServices;
    }

    public RegionUrlMapPathMatcherPathRuleRouteActionGetArgs(
        @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyGetArgs> corsPolicy,
        @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyGetArgs> faultInjectionPolicy,
        @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyGetArgs> requestMirrorPolicy,
        @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyGetArgs> retryPolicy,
        @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionTimeoutGetArgs> timeout,
        @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionUrlRewriteGetArgs> urlRewrite,
        @Nullable Output<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceGetArgs>> weightedBackendServices) {
        this.corsPolicy = corsPolicy;
        this.faultInjectionPolicy = faultInjectionPolicy;
        this.requestMirrorPolicy = requestMirrorPolicy;
        this.retryPolicy = retryPolicy;
        this.timeout = timeout;
        this.urlRewrite = urlRewrite;
        this.weightedBackendServices = weightedBackendServices;
    }

    private RegionUrlMapPathMatcherPathRuleRouteActionGetArgs() {
        this.corsPolicy = Output.empty();
        this.faultInjectionPolicy = Output.empty();
        this.requestMirrorPolicy = Output.empty();
        this.retryPolicy = Output.empty();
        this.timeout = Output.empty();
        this.urlRewrite = Output.empty();
        this.weightedBackendServices = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherPathRuleRouteActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyGetArgs> corsPolicy;
        private @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyGetArgs> faultInjectionPolicy;
        private @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyGetArgs> requestMirrorPolicy;
        private @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyGetArgs> retryPolicy;
        private @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionTimeoutGetArgs> timeout;
        private @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionUrlRewriteGetArgs> urlRewrite;
        private @Nullable Output<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceGetArgs>> weightedBackendServices;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherPathRuleRouteActionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.corsPolicy = defaults.corsPolicy;
    	      this.faultInjectionPolicy = defaults.faultInjectionPolicy;
    	      this.requestMirrorPolicy = defaults.requestMirrorPolicy;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.timeout = defaults.timeout;
    	      this.urlRewrite = defaults.urlRewrite;
    	      this.weightedBackendServices = defaults.weightedBackendServices;
        }

        public Builder corsPolicy(@Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyGetArgs> corsPolicy) {
            this.corsPolicy = corsPolicy;
            return this;
        }
        public Builder corsPolicy(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyGetArgs corsPolicy) {
            this.corsPolicy = Output.ofNullable(corsPolicy);
            return this;
        }
        public Builder faultInjectionPolicy(@Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyGetArgs> faultInjectionPolicy) {
            this.faultInjectionPolicy = faultInjectionPolicy;
            return this;
        }
        public Builder faultInjectionPolicy(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyGetArgs faultInjectionPolicy) {
            this.faultInjectionPolicy = Output.ofNullable(faultInjectionPolicy);
            return this;
        }
        public Builder requestMirrorPolicy(@Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyGetArgs> requestMirrorPolicy) {
            this.requestMirrorPolicy = requestMirrorPolicy;
            return this;
        }
        public Builder requestMirrorPolicy(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyGetArgs requestMirrorPolicy) {
            this.requestMirrorPolicy = Output.ofNullable(requestMirrorPolicy);
            return this;
        }
        public Builder retryPolicy(@Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyGetArgs> retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }
        public Builder retryPolicy(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyGetArgs retryPolicy) {
            this.retryPolicy = Output.ofNullable(retryPolicy);
            return this;
        }
        public Builder timeout(@Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionTimeoutGetArgs> timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder timeout(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionTimeoutGetArgs timeout) {
            this.timeout = Output.ofNullable(timeout);
            return this;
        }
        public Builder urlRewrite(@Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionUrlRewriteGetArgs> urlRewrite) {
            this.urlRewrite = urlRewrite;
            return this;
        }
        public Builder urlRewrite(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionUrlRewriteGetArgs urlRewrite) {
            this.urlRewrite = Output.ofNullable(urlRewrite);
            return this;
        }
        public Builder weightedBackendServices(@Nullable Output<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceGetArgs>> weightedBackendServices) {
            this.weightedBackendServices = weightedBackendServices;
            return this;
        }
        public Builder weightedBackendServices(@Nullable List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceGetArgs> weightedBackendServices) {
            this.weightedBackendServices = Output.ofNullable(weightedBackendServices);
            return this;
        }
        public Builder weightedBackendServices(RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceGetArgs... weightedBackendServices) {
            return weightedBackendServices(List.of(weightedBackendServices));
        }        public RegionUrlMapPathMatcherPathRuleRouteActionGetArgs build() {
            return new RegionUrlMapPathMatcherPathRuleRouteActionGetArgs(corsPolicy, faultInjectionPolicy, requestMirrorPolicy, retryPolicy, timeout, urlRewrite, weightedBackendServices);
        }
    }
}

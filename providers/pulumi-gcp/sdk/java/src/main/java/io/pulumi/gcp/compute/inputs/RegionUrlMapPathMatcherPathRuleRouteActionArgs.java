// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionTimeoutArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionUrlRewriteArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherPathRuleRouteActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherPathRuleRouteActionArgs Empty = new RegionUrlMapPathMatcherPathRuleRouteActionArgs();

    /**
     * The specification for allowing client side cross-origin requests. Please see W3C
     * Recommendation for Cross Origin Resource Sharing
     * Structure is documented below.
     * 
     */
    @InputImport(name="corsPolicy")
      private final @Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyArgs> corsPolicy;

    public Input<RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyArgs> getCorsPolicy() {
        return this.corsPolicy == null ? Input.empty() : this.corsPolicy;
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
    @InputImport(name="faultInjectionPolicy")
      private final @Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy;

    public Input<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs> getFaultInjectionPolicy() {
        return this.faultInjectionPolicy == null ? Input.empty() : this.faultInjectionPolicy;
    }

    /**
     * Specifies the policy on how requests intended for the route's backends are
     * shadowed to a separate mirrored backend service. Loadbalancer does not wait for
     * responses from the shadow service. Prior to sending traffic to the shadow
     * service, the host / authority header is suffixed with -shadow.
     * Structure is documented below.
     * 
     */
    @InputImport(name="requestMirrorPolicy")
      private final @Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy;

    public Input<RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs> getRequestMirrorPolicy() {
        return this.requestMirrorPolicy == null ? Input.empty() : this.requestMirrorPolicy;
    }

    /**
     * Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
     */
    @InputImport(name="retryPolicy")
      private final @Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyArgs> retryPolicy;

    public Input<RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyArgs> getRetryPolicy() {
        return this.retryPolicy == null ? Input.empty() : this.retryPolicy;
    }

    /**
     * Specifies the timeout for the selected route. Timeout is computed from the time
     * the request is has been fully processed (i.e. end-of-stream) up until the
     * response has been completely processed. Timeout includes all retries. If not
     * specified, the default value is 15 seconds.
     * Structure is documented below.
     * 
     */
    @InputImport(name="timeout")
      private final @Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionTimeoutArgs> timeout;

    public Input<RegionUrlMapPathMatcherPathRuleRouteActionTimeoutArgs> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    /**
     * The spec to modify the URL of the request, prior to forwarding the request to
     * the matched service
     * Structure is documented below.
     * 
     */
    @InputImport(name="urlRewrite")
      private final @Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionUrlRewriteArgs> urlRewrite;

    public Input<RegionUrlMapPathMatcherPathRuleRouteActionUrlRewriteArgs> getUrlRewrite() {
        return this.urlRewrite == null ? Input.empty() : this.urlRewrite;
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
    @InputImport(name="weightedBackendServices")
      private final @Nullable Input<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices;

    public Input<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs>> getWeightedBackendServices() {
        return this.weightedBackendServices == null ? Input.empty() : this.weightedBackendServices;
    }

    public RegionUrlMapPathMatcherPathRuleRouteActionArgs(
        @Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyArgs> corsPolicy,
        @Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy,
        @Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy,
        @Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyArgs> retryPolicy,
        @Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionTimeoutArgs> timeout,
        @Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionUrlRewriteArgs> urlRewrite,
        @Nullable Input<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices) {
        this.corsPolicy = corsPolicy;
        this.faultInjectionPolicy = faultInjectionPolicy;
        this.requestMirrorPolicy = requestMirrorPolicy;
        this.retryPolicy = retryPolicy;
        this.timeout = timeout;
        this.urlRewrite = urlRewrite;
        this.weightedBackendServices = weightedBackendServices;
    }

    private RegionUrlMapPathMatcherPathRuleRouteActionArgs() {
        this.corsPolicy = Input.empty();
        this.faultInjectionPolicy = Input.empty();
        this.requestMirrorPolicy = Input.empty();
        this.retryPolicy = Input.empty();
        this.timeout = Input.empty();
        this.urlRewrite = Input.empty();
        this.weightedBackendServices = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherPathRuleRouteActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyArgs> corsPolicy;
        private @Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy;
        private @Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy;
        private @Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyArgs> retryPolicy;
        private @Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionTimeoutArgs> timeout;
        private @Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionUrlRewriteArgs> urlRewrite;
        private @Nullable Input<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherPathRuleRouteActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.corsPolicy = defaults.corsPolicy;
    	      this.faultInjectionPolicy = defaults.faultInjectionPolicy;
    	      this.requestMirrorPolicy = defaults.requestMirrorPolicy;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.timeout = defaults.timeout;
    	      this.urlRewrite = defaults.urlRewrite;
    	      this.weightedBackendServices = defaults.weightedBackendServices;
        }

        public Builder setCorsPolicy(@Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyArgs> corsPolicy) {
            this.corsPolicy = corsPolicy;
            return this;
        }

        public Builder setCorsPolicy(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyArgs corsPolicy) {
            this.corsPolicy = Input.ofNullable(corsPolicy);
            return this;
        }

        public Builder setFaultInjectionPolicy(@Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy) {
            this.faultInjectionPolicy = faultInjectionPolicy;
            return this;
        }

        public Builder setFaultInjectionPolicy(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs faultInjectionPolicy) {
            this.faultInjectionPolicy = Input.ofNullable(faultInjectionPolicy);
            return this;
        }

        public Builder setRequestMirrorPolicy(@Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy) {
            this.requestMirrorPolicy = requestMirrorPolicy;
            return this;
        }

        public Builder setRequestMirrorPolicy(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs requestMirrorPolicy) {
            this.requestMirrorPolicy = Input.ofNullable(requestMirrorPolicy);
            return this;
        }

        public Builder setRetryPolicy(@Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyArgs> retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }

        public Builder setRetryPolicy(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyArgs retryPolicy) {
            this.retryPolicy = Input.ofNullable(retryPolicy);
            return this;
        }

        public Builder setTimeout(@Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionTimeoutArgs> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTimeout(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionTimeoutArgs timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }

        public Builder setUrlRewrite(@Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionUrlRewriteArgs> urlRewrite) {
            this.urlRewrite = urlRewrite;
            return this;
        }

        public Builder setUrlRewrite(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionUrlRewriteArgs urlRewrite) {
            this.urlRewrite = Input.ofNullable(urlRewrite);
            return this;
        }

        public Builder setWeightedBackendServices(@Nullable Input<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices) {
            this.weightedBackendServices = weightedBackendServices;
            return this;
        }

        public Builder setWeightedBackendServices(@Nullable List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs> weightedBackendServices) {
            this.weightedBackendServices = Input.ofNullable(weightedBackendServices);
            return this;
        }
        public RegionUrlMapPathMatcherPathRuleRouteActionArgs build() {
            return new RegionUrlMapPathMatcherPathRuleRouteActionArgs(corsPolicy, faultInjectionPolicy, requestMirrorPolicy, retryPolicy, timeout, urlRewrite, weightedBackendServices);
        }
    }
}

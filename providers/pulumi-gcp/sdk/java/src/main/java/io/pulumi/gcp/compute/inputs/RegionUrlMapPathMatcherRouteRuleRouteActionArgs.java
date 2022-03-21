// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicyArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionTimeoutArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewriteArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherRouteRuleRouteActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherRouteRuleRouteActionArgs Empty = new RegionUrlMapPathMatcherRouteRuleRouteActionArgs();

    /**
     * The specification for allowing client side cross-origin requests. Please see W3C
     * Recommendation for Cross Origin Resource Sharing
     * Structure is documented below.
     * 
     */
    @Import(name="corsPolicy")
      private final @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicyArgs> corsPolicy;

    public Output<RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicyArgs> getCorsPolicy() {
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
      private final @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy;

    public Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs> getFaultInjectionPolicy() {
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
      private final @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy;

    public Output<RegionUrlMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs> getRequestMirrorPolicy() {
        return this.requestMirrorPolicy == null ? Output.empty() : this.requestMirrorPolicy;
    }

    /**
     * Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
     */
    @Import(name="retryPolicy")
      private final @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyArgs> retryPolicy;

    public Output<RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyArgs> getRetryPolicy() {
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
      private final @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionTimeoutArgs> timeout;

    public Output<RegionUrlMapPathMatcherRouteRuleRouteActionTimeoutArgs> getTimeout() {
        return this.timeout == null ? Output.empty() : this.timeout;
    }

    /**
     * The spec to modify the URL of the request, prior to forwarding the request to
     * the matched service
     * Structure is documented below.
     * 
     */
    @Import(name="urlRewrite")
      private final @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewriteArgs> urlRewrite;

    public Output<RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewriteArgs> getUrlRewrite() {
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
      private final @Nullable Output<List<RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices;

    public Output<List<RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs>> getWeightedBackendServices() {
        return this.weightedBackendServices == null ? Output.empty() : this.weightedBackendServices;
    }

    public RegionUrlMapPathMatcherRouteRuleRouteActionArgs(
        @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicyArgs> corsPolicy,
        @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy,
        @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy,
        @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyArgs> retryPolicy,
        @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionTimeoutArgs> timeout,
        @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewriteArgs> urlRewrite,
        @Nullable Output<List<RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices) {
        this.corsPolicy = corsPolicy;
        this.faultInjectionPolicy = faultInjectionPolicy;
        this.requestMirrorPolicy = requestMirrorPolicy;
        this.retryPolicy = retryPolicy;
        this.timeout = timeout;
        this.urlRewrite = urlRewrite;
        this.weightedBackendServices = weightedBackendServices;
    }

    private RegionUrlMapPathMatcherRouteRuleRouteActionArgs() {
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

    public static Builder builder(RegionUrlMapPathMatcherRouteRuleRouteActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicyArgs> corsPolicy;
        private @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy;
        private @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy;
        private @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyArgs> retryPolicy;
        private @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionTimeoutArgs> timeout;
        private @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewriteArgs> urlRewrite;
        private @Nullable Output<List<RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleRouteActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.corsPolicy = defaults.corsPolicy;
    	      this.faultInjectionPolicy = defaults.faultInjectionPolicy;
    	      this.requestMirrorPolicy = defaults.requestMirrorPolicy;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.timeout = defaults.timeout;
    	      this.urlRewrite = defaults.urlRewrite;
    	      this.weightedBackendServices = defaults.weightedBackendServices;
        }

        public Builder corsPolicy(@Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicyArgs> corsPolicy) {
            this.corsPolicy = corsPolicy;
            return this;
        }
        public Builder corsPolicy(@Nullable RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicyArgs corsPolicy) {
            this.corsPolicy = Output.ofNullable(corsPolicy);
            return this;
        }
        public Builder faultInjectionPolicy(@Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy) {
            this.faultInjectionPolicy = faultInjectionPolicy;
            return this;
        }
        public Builder faultInjectionPolicy(@Nullable RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs faultInjectionPolicy) {
            this.faultInjectionPolicy = Output.ofNullable(faultInjectionPolicy);
            return this;
        }
        public Builder requestMirrorPolicy(@Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy) {
            this.requestMirrorPolicy = requestMirrorPolicy;
            return this;
        }
        public Builder requestMirrorPolicy(@Nullable RegionUrlMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs requestMirrorPolicy) {
            this.requestMirrorPolicy = Output.ofNullable(requestMirrorPolicy);
            return this;
        }
        public Builder retryPolicy(@Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyArgs> retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }
        public Builder retryPolicy(@Nullable RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyArgs retryPolicy) {
            this.retryPolicy = Output.ofNullable(retryPolicy);
            return this;
        }
        public Builder timeout(@Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionTimeoutArgs> timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder timeout(@Nullable RegionUrlMapPathMatcherRouteRuleRouteActionTimeoutArgs timeout) {
            this.timeout = Output.ofNullable(timeout);
            return this;
        }
        public Builder urlRewrite(@Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewriteArgs> urlRewrite) {
            this.urlRewrite = urlRewrite;
            return this;
        }
        public Builder urlRewrite(@Nullable RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewriteArgs urlRewrite) {
            this.urlRewrite = Output.ofNullable(urlRewrite);
            return this;
        }
        public Builder weightedBackendServices(@Nullable Output<List<RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices) {
            this.weightedBackendServices = weightedBackendServices;
            return this;
        }
        public Builder weightedBackendServices(@Nullable List<RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs> weightedBackendServices) {
            this.weightedBackendServices = Output.ofNullable(weightedBackendServices);
            return this;
        }
        public Builder weightedBackendServices(RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs... weightedBackendServices) {
            return weightedBackendServices(List.of(weightedBackendServices));
        }        public RegionUrlMapPathMatcherRouteRuleRouteActionArgs build() {
            return new RegionUrlMapPathMatcherRouteRuleRouteActionArgs(corsPolicy, faultInjectionPolicy, requestMirrorPolicy, retryPolicy, timeout, urlRewrite, weightedBackendServices);
        }
    }
}

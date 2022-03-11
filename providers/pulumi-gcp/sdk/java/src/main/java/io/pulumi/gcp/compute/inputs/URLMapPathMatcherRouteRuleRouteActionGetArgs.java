// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionCorsPolicyGetArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyGetArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyGetArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionRetryPolicyGetArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionTimeoutGetArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionUrlRewriteGetArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceGetArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapPathMatcherRouteRuleRouteActionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherRouteRuleRouteActionGetArgs Empty = new URLMapPathMatcherRouteRuleRouteActionGetArgs();

    /**
     * The specification for allowing client side cross-origin requests. Please see
     * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
     * Structure is documented below.
     * 
     */
    @InputImport(name="corsPolicy")
      private final @Nullable Output<URLMapPathMatcherRouteRuleRouteActionCorsPolicyGetArgs> corsPolicy;

    public Output<URLMapPathMatcherRouteRuleRouteActionCorsPolicyGetArgs> getCorsPolicy() {
        return this.corsPolicy == null ? Output.empty() : this.corsPolicy;
    }

    /**
     * The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
     * As part of fault injection, when clients send requests to a backend service, delays can be introduced by Loadbalancer on a
     * percentage of requests before sending those request to the backend service. Similarly requests from clients can be aborted
     * by the Loadbalancer for a percentage of requests.
     * timeout and retryPolicy will be ignored by clients that are configured with a faultInjectionPolicy.
     * Structure is documented below.
     * 
     */
    @InputImport(name="faultInjectionPolicy")
      private final @Nullable Output<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyGetArgs> faultInjectionPolicy;

    public Output<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyGetArgs> getFaultInjectionPolicy() {
        return this.faultInjectionPolicy == null ? Output.empty() : this.faultInjectionPolicy;
    }

    /**
     * Specifies the policy on how requests intended for the route's backends are shadowed to a separate mirrored backend service.
     * Loadbalancer does not wait for responses from the shadow service. Prior to sending traffic to the shadow service,
     * the host / authority header is suffixed with -shadow.
     * Structure is documented below.
     * 
     */
    @InputImport(name="requestMirrorPolicy")
      private final @Nullable Output<URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyGetArgs> requestMirrorPolicy;

    public Output<URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyGetArgs> getRequestMirrorPolicy() {
        return this.requestMirrorPolicy == null ? Output.empty() : this.requestMirrorPolicy;
    }

    /**
     * Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
     */
    @InputImport(name="retryPolicy")
      private final @Nullable Output<URLMapPathMatcherRouteRuleRouteActionRetryPolicyGetArgs> retryPolicy;

    public Output<URLMapPathMatcherRouteRuleRouteActionRetryPolicyGetArgs> getRetryPolicy() {
        return this.retryPolicy == null ? Output.empty() : this.retryPolicy;
    }

    /**
     * Specifies the timeout for the selected route. Timeout is computed from the time the request has been
     * fully processed (i.e. end-of-stream) up until the response has been completely processed. Timeout includes all retries.
     * If not specified, will use the largest timeout among all backend services associated with the route.
     * Structure is documented below.
     * 
     */
    @InputImport(name="timeout")
      private final @Nullable Output<URLMapPathMatcherRouteRuleRouteActionTimeoutGetArgs> timeout;

    public Output<URLMapPathMatcherRouteRuleRouteActionTimeoutGetArgs> getTimeout() {
        return this.timeout == null ? Output.empty() : this.timeout;
    }

    /**
     * The spec to modify the URL of the request, prior to forwarding the request to the matched service.
     * Structure is documented below.
     * 
     */
    @InputImport(name="urlRewrite")
      private final @Nullable Output<URLMapPathMatcherRouteRuleRouteActionUrlRewriteGetArgs> urlRewrite;

    public Output<URLMapPathMatcherRouteRuleRouteActionUrlRewriteGetArgs> getUrlRewrite() {
        return this.urlRewrite == null ? Output.empty() : this.urlRewrite;
    }

    /**
     * A list of weighted backend services to send traffic to when a route match occurs.
     * The weights determine the fraction of traffic that flows to their corresponding backend service.
     * If all traffic needs to go to a single backend service, there must be one weightedBackendService
     * with weight set to a non 0 number.
     * Once a backendService is identified and before forwarding the request to the backend service,
     * advanced routing actions like Url rewrites and header transformations are applied depending on
     * additional settings specified in this HttpRouteAction.
     * Structure is documented below.
     * 
     */
    @InputImport(name="weightedBackendServices")
      private final @Nullable Output<List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceGetArgs>> weightedBackendServices;

    public Output<List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceGetArgs>> getWeightedBackendServices() {
        return this.weightedBackendServices == null ? Output.empty() : this.weightedBackendServices;
    }

    public URLMapPathMatcherRouteRuleRouteActionGetArgs(
        @Nullable Output<URLMapPathMatcherRouteRuleRouteActionCorsPolicyGetArgs> corsPolicy,
        @Nullable Output<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyGetArgs> faultInjectionPolicy,
        @Nullable Output<URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyGetArgs> requestMirrorPolicy,
        @Nullable Output<URLMapPathMatcherRouteRuleRouteActionRetryPolicyGetArgs> retryPolicy,
        @Nullable Output<URLMapPathMatcherRouteRuleRouteActionTimeoutGetArgs> timeout,
        @Nullable Output<URLMapPathMatcherRouteRuleRouteActionUrlRewriteGetArgs> urlRewrite,
        @Nullable Output<List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceGetArgs>> weightedBackendServices) {
        this.corsPolicy = corsPolicy;
        this.faultInjectionPolicy = faultInjectionPolicy;
        this.requestMirrorPolicy = requestMirrorPolicy;
        this.retryPolicy = retryPolicy;
        this.timeout = timeout;
        this.urlRewrite = urlRewrite;
        this.weightedBackendServices = weightedBackendServices;
    }

    private URLMapPathMatcherRouteRuleRouteActionGetArgs() {
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

    public static Builder builder(URLMapPathMatcherRouteRuleRouteActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<URLMapPathMatcherRouteRuleRouteActionCorsPolicyGetArgs> corsPolicy;
        private @Nullable Output<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyGetArgs> faultInjectionPolicy;
        private @Nullable Output<URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyGetArgs> requestMirrorPolicy;
        private @Nullable Output<URLMapPathMatcherRouteRuleRouteActionRetryPolicyGetArgs> retryPolicy;
        private @Nullable Output<URLMapPathMatcherRouteRuleRouteActionTimeoutGetArgs> timeout;
        private @Nullable Output<URLMapPathMatcherRouteRuleRouteActionUrlRewriteGetArgs> urlRewrite;
        private @Nullable Output<List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceGetArgs>> weightedBackendServices;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherRouteRuleRouteActionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.corsPolicy = defaults.corsPolicy;
    	      this.faultInjectionPolicy = defaults.faultInjectionPolicy;
    	      this.requestMirrorPolicy = defaults.requestMirrorPolicy;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.timeout = defaults.timeout;
    	      this.urlRewrite = defaults.urlRewrite;
    	      this.weightedBackendServices = defaults.weightedBackendServices;
        }

        public Builder corsPolicy(@Nullable Output<URLMapPathMatcherRouteRuleRouteActionCorsPolicyGetArgs> corsPolicy) {
            this.corsPolicy = corsPolicy;
            return this;
        }

        public Builder corsPolicy(@Nullable URLMapPathMatcherRouteRuleRouteActionCorsPolicyGetArgs corsPolicy) {
            this.corsPolicy = Output.ofNullable(corsPolicy);
            return this;
        }

        public Builder faultInjectionPolicy(@Nullable Output<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyGetArgs> faultInjectionPolicy) {
            this.faultInjectionPolicy = faultInjectionPolicy;
            return this;
        }

        public Builder faultInjectionPolicy(@Nullable URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyGetArgs faultInjectionPolicy) {
            this.faultInjectionPolicy = Output.ofNullable(faultInjectionPolicy);
            return this;
        }

        public Builder requestMirrorPolicy(@Nullable Output<URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyGetArgs> requestMirrorPolicy) {
            this.requestMirrorPolicy = requestMirrorPolicy;
            return this;
        }

        public Builder requestMirrorPolicy(@Nullable URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyGetArgs requestMirrorPolicy) {
            this.requestMirrorPolicy = Output.ofNullable(requestMirrorPolicy);
            return this;
        }

        public Builder retryPolicy(@Nullable Output<URLMapPathMatcherRouteRuleRouteActionRetryPolicyGetArgs> retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }

        public Builder retryPolicy(@Nullable URLMapPathMatcherRouteRuleRouteActionRetryPolicyGetArgs retryPolicy) {
            this.retryPolicy = Output.ofNullable(retryPolicy);
            return this;
        }

        public Builder timeout(@Nullable Output<URLMapPathMatcherRouteRuleRouteActionTimeoutGetArgs> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder timeout(@Nullable URLMapPathMatcherRouteRuleRouteActionTimeoutGetArgs timeout) {
            this.timeout = Output.ofNullable(timeout);
            return this;
        }

        public Builder urlRewrite(@Nullable Output<URLMapPathMatcherRouteRuleRouteActionUrlRewriteGetArgs> urlRewrite) {
            this.urlRewrite = urlRewrite;
            return this;
        }

        public Builder urlRewrite(@Nullable URLMapPathMatcherRouteRuleRouteActionUrlRewriteGetArgs urlRewrite) {
            this.urlRewrite = Output.ofNullable(urlRewrite);
            return this;
        }

        public Builder weightedBackendServices(@Nullable Output<List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceGetArgs>> weightedBackendServices) {
            this.weightedBackendServices = weightedBackendServices;
            return this;
        }

        public Builder weightedBackendServices(@Nullable List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceGetArgs> weightedBackendServices) {
            this.weightedBackendServices = Output.ofNullable(weightedBackendServices);
            return this;
        }
        public URLMapPathMatcherRouteRuleRouteActionGetArgs build() {
            return new URLMapPathMatcherRouteRuleRouteActionGetArgs(corsPolicy, faultInjectionPolicy, requestMirrorPolicy, retryPolicy, timeout, urlRewrite, weightedBackendServices);
        }
    }
}

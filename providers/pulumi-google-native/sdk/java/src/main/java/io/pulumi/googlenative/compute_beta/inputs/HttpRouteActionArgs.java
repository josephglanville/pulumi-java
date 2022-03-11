// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.inputs.CorsPolicyArgs;
import io.pulumi.googlenative.compute_beta.inputs.DurationArgs;
import io.pulumi.googlenative.compute_beta.inputs.HttpFaultInjectionArgs;
import io.pulumi.googlenative.compute_beta.inputs.HttpRetryPolicyArgs;
import io.pulumi.googlenative.compute_beta.inputs.RequestMirrorPolicyArgs;
import io.pulumi.googlenative.compute_beta.inputs.UrlRewriteArgs;
import io.pulumi.googlenative.compute_beta.inputs.WeightedBackendServiceArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HttpRouteActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpRouteActionArgs Empty = new HttpRouteActionArgs();

    /**
     * The specification for allowing client-side cross-origin requests. For more information about the W3C recommendation for cross-origin resource sharing (CORS), see Fetch API Living Standard. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    @InputImport(name="corsPolicy")
      private final @Nullable Output<CorsPolicyArgs> corsPolicy;

    public Output<CorsPolicyArgs> getCorsPolicy() {
        return this.corsPolicy == null ? Output.empty() : this.corsPolicy;
    }

    /**
     * The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure. As part of fault injection, when clients send requests to a backend service, delays can be introduced by a load balancer on a percentage of requests before sending those requests to the backend service. Similarly requests from clients can be aborted by the load balancer for a percentage of requests. For the requests impacted by fault injection, timeout and retry_policy is ignored by clients that are configured with a fault_injection_policy.
     * 
     */
    @InputImport(name="faultInjectionPolicy")
      private final @Nullable Output<HttpFaultInjectionArgs> faultInjectionPolicy;

    public Output<HttpFaultInjectionArgs> getFaultInjectionPolicy() {
        return this.faultInjectionPolicy == null ? Output.empty() : this.faultInjectionPolicy;
    }

    /**
     * Specifies the maximum duration (timeout) for streams on the selected route. Unlike the timeout field where the timeout duration starts from the time the request has been fully processed (known as *end-of-stream*), the duration in this field is computed from the beginning of the stream until the response has been processed, including all retries. A stream that does not complete in this duration is closed. If not specified, this field uses the maximum maxStreamDuration value among all backend services associated with the route. This field is only allowed if the Url map is used with backend services with loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    @InputImport(name="maxStreamDuration")
      private final @Nullable Output<DurationArgs> maxStreamDuration;

    public Output<DurationArgs> getMaxStreamDuration() {
        return this.maxStreamDuration == null ? Output.empty() : this.maxStreamDuration;
    }

    /**
     * Specifies the policy on how requests intended for the route's backends are shadowed to a separate mirrored backend service. The load balancer does not wait for responses from the shadow service. Before sending traffic to the shadow service, the host / authority header is suffixed with -shadow. Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * 
     */
    @InputImport(name="requestMirrorPolicy")
      private final @Nullable Output<RequestMirrorPolicyArgs> requestMirrorPolicy;

    public Output<RequestMirrorPolicyArgs> getRequestMirrorPolicy() {
        return this.requestMirrorPolicy == null ? Output.empty() : this.requestMirrorPolicy;
    }

    /**
     * Specifies the retry policy associated with this route.
     * 
     */
    @InputImport(name="retryPolicy")
      private final @Nullable Output<HttpRetryPolicyArgs> retryPolicy;

    public Output<HttpRetryPolicyArgs> getRetryPolicy() {
        return this.retryPolicy == null ? Output.empty() : this.retryPolicy;
    }

    /**
     * Specifies the timeout for the selected route. Timeout is computed from the time the request has been fully processed (known as *end-of-stream*) up until the response has been processed. Timeout includes all retries. If not specified, this field uses the largest timeout among all backend services associated with the route. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @InputImport(name="timeout")
      private final @Nullable Output<DurationArgs> timeout;

    public Output<DurationArgs> getTimeout() {
        return this.timeout == null ? Output.empty() : this.timeout;
    }

    /**
     * The spec to modify the URL of the request, before forwarding the request to the matched service. urlRewrite is the only action supported in UrlMaps for external HTTP(S) load balancers. Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * 
     */
    @InputImport(name="urlRewrite")
      private final @Nullable Output<UrlRewriteArgs> urlRewrite;

    public Output<UrlRewriteArgs> getUrlRewrite() {
        return this.urlRewrite == null ? Output.empty() : this.urlRewrite;
    }

    /**
     * A list of weighted backend services to send traffic to when a route match occurs. The weights determine the fraction of traffic that flows to their corresponding backend service. If all traffic needs to go to a single backend service, there must be one weightedBackendService with weight set to a non-zero number. After a backend service is identified and before forwarding the request to the backend service, advanced routing actions such as URL rewrites and header transformations are applied depending on additional settings specified in this HttpRouteAction.
     * 
     */
    @InputImport(name="weightedBackendServices")
      private final @Nullable Output<List<WeightedBackendServiceArgs>> weightedBackendServices;

    public Output<List<WeightedBackendServiceArgs>> getWeightedBackendServices() {
        return this.weightedBackendServices == null ? Output.empty() : this.weightedBackendServices;
    }

    public HttpRouteActionArgs(
        @Nullable Output<CorsPolicyArgs> corsPolicy,
        @Nullable Output<HttpFaultInjectionArgs> faultInjectionPolicy,
        @Nullable Output<DurationArgs> maxStreamDuration,
        @Nullable Output<RequestMirrorPolicyArgs> requestMirrorPolicy,
        @Nullable Output<HttpRetryPolicyArgs> retryPolicy,
        @Nullable Output<DurationArgs> timeout,
        @Nullable Output<UrlRewriteArgs> urlRewrite,
        @Nullable Output<List<WeightedBackendServiceArgs>> weightedBackendServices) {
        this.corsPolicy = corsPolicy;
        this.faultInjectionPolicy = faultInjectionPolicy;
        this.maxStreamDuration = maxStreamDuration;
        this.requestMirrorPolicy = requestMirrorPolicy;
        this.retryPolicy = retryPolicy;
        this.timeout = timeout;
        this.urlRewrite = urlRewrite;
        this.weightedBackendServices = weightedBackendServices;
    }

    private HttpRouteActionArgs() {
        this.corsPolicy = Output.empty();
        this.faultInjectionPolicy = Output.empty();
        this.maxStreamDuration = Output.empty();
        this.requestMirrorPolicy = Output.empty();
        this.retryPolicy = Output.empty();
        this.timeout = Output.empty();
        this.urlRewrite = Output.empty();
        this.weightedBackendServices = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRouteActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CorsPolicyArgs> corsPolicy;
        private @Nullable Output<HttpFaultInjectionArgs> faultInjectionPolicy;
        private @Nullable Output<DurationArgs> maxStreamDuration;
        private @Nullable Output<RequestMirrorPolicyArgs> requestMirrorPolicy;
        private @Nullable Output<HttpRetryPolicyArgs> retryPolicy;
        private @Nullable Output<DurationArgs> timeout;
        private @Nullable Output<UrlRewriteArgs> urlRewrite;
        private @Nullable Output<List<WeightedBackendServiceArgs>> weightedBackendServices;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRouteActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.corsPolicy = defaults.corsPolicy;
    	      this.faultInjectionPolicy = defaults.faultInjectionPolicy;
    	      this.maxStreamDuration = defaults.maxStreamDuration;
    	      this.requestMirrorPolicy = defaults.requestMirrorPolicy;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.timeout = defaults.timeout;
    	      this.urlRewrite = defaults.urlRewrite;
    	      this.weightedBackendServices = defaults.weightedBackendServices;
        }

        public Builder corsPolicy(@Nullable Output<CorsPolicyArgs> corsPolicy) {
            this.corsPolicy = corsPolicy;
            return this;
        }

        public Builder corsPolicy(@Nullable CorsPolicyArgs corsPolicy) {
            this.corsPolicy = Output.ofNullable(corsPolicy);
            return this;
        }

        public Builder faultInjectionPolicy(@Nullable Output<HttpFaultInjectionArgs> faultInjectionPolicy) {
            this.faultInjectionPolicy = faultInjectionPolicy;
            return this;
        }

        public Builder faultInjectionPolicy(@Nullable HttpFaultInjectionArgs faultInjectionPolicy) {
            this.faultInjectionPolicy = Output.ofNullable(faultInjectionPolicy);
            return this;
        }

        public Builder maxStreamDuration(@Nullable Output<DurationArgs> maxStreamDuration) {
            this.maxStreamDuration = maxStreamDuration;
            return this;
        }

        public Builder maxStreamDuration(@Nullable DurationArgs maxStreamDuration) {
            this.maxStreamDuration = Output.ofNullable(maxStreamDuration);
            return this;
        }

        public Builder requestMirrorPolicy(@Nullable Output<RequestMirrorPolicyArgs> requestMirrorPolicy) {
            this.requestMirrorPolicy = requestMirrorPolicy;
            return this;
        }

        public Builder requestMirrorPolicy(@Nullable RequestMirrorPolicyArgs requestMirrorPolicy) {
            this.requestMirrorPolicy = Output.ofNullable(requestMirrorPolicy);
            return this;
        }

        public Builder retryPolicy(@Nullable Output<HttpRetryPolicyArgs> retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }

        public Builder retryPolicy(@Nullable HttpRetryPolicyArgs retryPolicy) {
            this.retryPolicy = Output.ofNullable(retryPolicy);
            return this;
        }

        public Builder timeout(@Nullable Output<DurationArgs> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder timeout(@Nullable DurationArgs timeout) {
            this.timeout = Output.ofNullable(timeout);
            return this;
        }

        public Builder urlRewrite(@Nullable Output<UrlRewriteArgs> urlRewrite) {
            this.urlRewrite = urlRewrite;
            return this;
        }

        public Builder urlRewrite(@Nullable UrlRewriteArgs urlRewrite) {
            this.urlRewrite = Output.ofNullable(urlRewrite);
            return this;
        }

        public Builder weightedBackendServices(@Nullable Output<List<WeightedBackendServiceArgs>> weightedBackendServices) {
            this.weightedBackendServices = weightedBackendServices;
            return this;
        }

        public Builder weightedBackendServices(@Nullable List<WeightedBackendServiceArgs> weightedBackendServices) {
            this.weightedBackendServices = Output.ofNullable(weightedBackendServices);
            return this;
        }
        public HttpRouteActionArgs build() {
            return new HttpRouteActionArgs(corsPolicy, faultInjectionPolicy, maxStreamDuration, requestMirrorPolicy, retryPolicy, timeout, urlRewrite, weightedBackendServices);
        }
    }
}

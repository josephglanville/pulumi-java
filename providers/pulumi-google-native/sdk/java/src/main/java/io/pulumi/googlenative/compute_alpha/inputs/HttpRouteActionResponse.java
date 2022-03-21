// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_alpha.inputs.CorsPolicyResponse;
import io.pulumi.googlenative.compute_alpha.inputs.DurationResponse;
import io.pulumi.googlenative.compute_alpha.inputs.HttpFaultInjectionResponse;
import io.pulumi.googlenative.compute_alpha.inputs.HttpRetryPolicyResponse;
import io.pulumi.googlenative.compute_alpha.inputs.RequestMirrorPolicyResponse;
import io.pulumi.googlenative.compute_alpha.inputs.UrlRewriteResponse;
import io.pulumi.googlenative.compute_alpha.inputs.WeightedBackendServiceResponse;
import java.util.List;
import java.util.Objects;


public final class HttpRouteActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final HttpRouteActionResponse Empty = new HttpRouteActionResponse();

    /**
     * The specification for allowing client-side cross-origin requests. For more information about the W3C recommendation for cross-origin resource sharing (CORS), see Fetch API Living Standard. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    @Import(name="corsPolicy", required=true)
      private final CorsPolicyResponse corsPolicy;

    public CorsPolicyResponse getCorsPolicy() {
        return this.corsPolicy;
    }

    /**
     * The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure. As part of fault injection, when clients send requests to a backend service, delays can be introduced by a load balancer on a percentage of requests before sending those requests to the backend service. Similarly requests from clients can be aborted by the load balancer for a percentage of requests. For the requests impacted by fault injection, timeout and retry_policy is ignored by clients that are configured with a fault_injection_policy.
     * 
     */
    @Import(name="faultInjectionPolicy", required=true)
      private final HttpFaultInjectionResponse faultInjectionPolicy;

    public HttpFaultInjectionResponse getFaultInjectionPolicy() {
        return this.faultInjectionPolicy;
    }

    /**
     * Specifies the maximum duration (timeout) for streams on the selected route. Unlike the timeout field where the timeout duration starts from the time the request has been fully processed (known as *end-of-stream*), the duration in this field is computed from the beginning of the stream until the response has been processed, including all retries. A stream that does not complete in this duration is closed. If not specified, this field uses the maximum maxStreamDuration value among all backend services associated with the route. This field is only allowed if the Url map is used with backend services with loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    @Import(name="maxStreamDuration", required=true)
      private final DurationResponse maxStreamDuration;

    public DurationResponse getMaxStreamDuration() {
        return this.maxStreamDuration;
    }

    /**
     * Specifies the policy on how requests intended for the route's backends are shadowed to a separate mirrored backend service. The load balancer does not wait for responses from the shadow service. Before sending traffic to the shadow service, the host / authority header is suffixed with -shadow. Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * 
     */
    @Import(name="requestMirrorPolicy", required=true)
      private final RequestMirrorPolicyResponse requestMirrorPolicy;

    public RequestMirrorPolicyResponse getRequestMirrorPolicy() {
        return this.requestMirrorPolicy;
    }

    /**
     * Specifies the retry policy associated with this route.
     * 
     */
    @Import(name="retryPolicy", required=true)
      private final HttpRetryPolicyResponse retryPolicy;

    public HttpRetryPolicyResponse getRetryPolicy() {
        return this.retryPolicy;
    }

    /**
     * Specifies the timeout for the selected route. Timeout is computed from the time the request has been fully processed (known as *end-of-stream*) up until the response has been processed. Timeout includes all retries. If not specified, this field uses the largest timeout among all backend services associated with the route. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @Import(name="timeout", required=true)
      private final DurationResponse timeout;

    public DurationResponse getTimeout() {
        return this.timeout;
    }

    /**
     * The spec to modify the URL of the request, before forwarding the request to the matched service. urlRewrite is the only action supported in UrlMaps for external HTTP(S) load balancers. Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * 
     */
    @Import(name="urlRewrite", required=true)
      private final UrlRewriteResponse urlRewrite;

    public UrlRewriteResponse getUrlRewrite() {
        return this.urlRewrite;
    }

    /**
     * A list of weighted backend services to send traffic to when a route match occurs. The weights determine the fraction of traffic that flows to their corresponding backend service. If all traffic needs to go to a single backend service, there must be one weightedBackendService with weight set to a non-zero number. After a backend service is identified and before forwarding the request to the backend service, advanced routing actions such as URL rewrites and header transformations are applied depending on additional settings specified in this HttpRouteAction.
     * 
     */
    @Import(name="weightedBackendServices", required=true)
      private final List<WeightedBackendServiceResponse> weightedBackendServices;

    public List<WeightedBackendServiceResponse> getWeightedBackendServices() {
        return this.weightedBackendServices;
    }

    public HttpRouteActionResponse(
        CorsPolicyResponse corsPolicy,
        HttpFaultInjectionResponse faultInjectionPolicy,
        DurationResponse maxStreamDuration,
        RequestMirrorPolicyResponse requestMirrorPolicy,
        HttpRetryPolicyResponse retryPolicy,
        DurationResponse timeout,
        UrlRewriteResponse urlRewrite,
        List<WeightedBackendServiceResponse> weightedBackendServices) {
        this.corsPolicy = Objects.requireNonNull(corsPolicy, "expected parameter 'corsPolicy' to be non-null");
        this.faultInjectionPolicy = Objects.requireNonNull(faultInjectionPolicy, "expected parameter 'faultInjectionPolicy' to be non-null");
        this.maxStreamDuration = Objects.requireNonNull(maxStreamDuration, "expected parameter 'maxStreamDuration' to be non-null");
        this.requestMirrorPolicy = Objects.requireNonNull(requestMirrorPolicy, "expected parameter 'requestMirrorPolicy' to be non-null");
        this.retryPolicy = Objects.requireNonNull(retryPolicy, "expected parameter 'retryPolicy' to be non-null");
        this.timeout = Objects.requireNonNull(timeout, "expected parameter 'timeout' to be non-null");
        this.urlRewrite = Objects.requireNonNull(urlRewrite, "expected parameter 'urlRewrite' to be non-null");
        this.weightedBackendServices = Objects.requireNonNull(weightedBackendServices, "expected parameter 'weightedBackendServices' to be non-null");
    }

    private HttpRouteActionResponse() {
        this.corsPolicy = null;
        this.faultInjectionPolicy = null;
        this.maxStreamDuration = null;
        this.requestMirrorPolicy = null;
        this.retryPolicy = null;
        this.timeout = null;
        this.urlRewrite = null;
        this.weightedBackendServices = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRouteActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CorsPolicyResponse corsPolicy;
        private HttpFaultInjectionResponse faultInjectionPolicy;
        private DurationResponse maxStreamDuration;
        private RequestMirrorPolicyResponse requestMirrorPolicy;
        private HttpRetryPolicyResponse retryPolicy;
        private DurationResponse timeout;
        private UrlRewriteResponse urlRewrite;
        private List<WeightedBackendServiceResponse> weightedBackendServices;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRouteActionResponse defaults) {
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

        public Builder corsPolicy(CorsPolicyResponse corsPolicy) {
            this.corsPolicy = Objects.requireNonNull(corsPolicy);
            return this;
        }
        public Builder faultInjectionPolicy(HttpFaultInjectionResponse faultInjectionPolicy) {
            this.faultInjectionPolicy = Objects.requireNonNull(faultInjectionPolicy);
            return this;
        }
        public Builder maxStreamDuration(DurationResponse maxStreamDuration) {
            this.maxStreamDuration = Objects.requireNonNull(maxStreamDuration);
            return this;
        }
        public Builder requestMirrorPolicy(RequestMirrorPolicyResponse requestMirrorPolicy) {
            this.requestMirrorPolicy = Objects.requireNonNull(requestMirrorPolicy);
            return this;
        }
        public Builder retryPolicy(HttpRetryPolicyResponse retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy);
            return this;
        }
        public Builder timeout(DurationResponse timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }
        public Builder urlRewrite(UrlRewriteResponse urlRewrite) {
            this.urlRewrite = Objects.requireNonNull(urlRewrite);
            return this;
        }
        public Builder weightedBackendServices(List<WeightedBackendServiceResponse> weightedBackendServices) {
            this.weightedBackendServices = Objects.requireNonNull(weightedBackendServices);
            return this;
        }
        public Builder weightedBackendServices(WeightedBackendServiceResponse... weightedBackendServices) {
            return weightedBackendServices(List.of(weightedBackendServices));
        }        public HttpRouteActionResponse build() {
            return new HttpRouteActionResponse(corsPolicy, faultInjectionPolicy, maxStreamDuration, requestMirrorPolicy, retryPolicy, timeout, urlRewrite, weightedBackendServices);
        }
    }
}

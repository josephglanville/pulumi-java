// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderAction;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class URLMapPathMatcherPathRuleRouteActionWeightedBackendService {
    /**
     * The full or partial URL to the BackendService resource being mirrored to.
     * 
     */
    private final String backendService;
    /**
     * Specifies changes to request and response headers that need to take effect for
     * the selected backendService.
     * headerAction specified here take effect before headerAction in the enclosing
     * HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderAction headerAction;
    /**
     * Specifies the fraction of traffic sent to backendService, computed as
     * weight / (sum of all weightedBackendService weights in routeAction) .
     * The selection of a backend service is determined only for new traffic. Once a user's request
     * has been directed to a backendService, subsequent requests will be sent to the same backendService
     * as determined by the BackendService's session affinity policy.
     * The value must be between 0 and 1000
     * 
     */
    private final Integer weight;

    @CustomType.Constructor
    private URLMapPathMatcherPathRuleRouteActionWeightedBackendService(
        @CustomType.Parameter("backendService") String backendService,
        @CustomType.Parameter("headerAction") @Nullable URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderAction headerAction,
        @CustomType.Parameter("weight") Integer weight) {
        this.backendService = backendService;
        this.headerAction = headerAction;
        this.weight = weight;
    }

    /**
     * The full or partial URL to the BackendService resource being mirrored to.
     * 
    */
    public String getBackendService() {
        return this.backendService;
    }
    /**
     * Specifies changes to request and response headers that need to take effect for
     * the selected backendService.
     * headerAction specified here take effect before headerAction in the enclosing
     * HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * 
    */
    public Optional<URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderAction> getHeaderAction() {
        return Optional.ofNullable(this.headerAction);
    }
    /**
     * Specifies the fraction of traffic sent to backendService, computed as
     * weight / (sum of all weightedBackendService weights in routeAction) .
     * The selection of a backend service is determined only for new traffic. Once a user's request
     * has been directed to a backendService, subsequent requests will be sent to the same backendService
     * as determined by the BackendService's session affinity policy.
     * The value must be between 0 and 1000
     * 
    */
    public Integer getWeight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherPathRuleRouteActionWeightedBackendService defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backendService;
        private @Nullable URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderAction headerAction;
        private Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherPathRuleRouteActionWeightedBackendService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendService = defaults.backendService;
    	      this.headerAction = defaults.headerAction;
    	      this.weight = defaults.weight;
        }

        public Builder backendService(String backendService) {
            this.backendService = Objects.requireNonNull(backendService);
            return this;
        }
        public Builder headerAction(@Nullable URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderAction headerAction) {
            this.headerAction = headerAction;
            return this;
        }
        public Builder weight(Integer weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }        public URLMapPathMatcherPathRuleRouteActionWeightedBackendService build() {
            return new URLMapPathMatcherPathRuleRouteActionWeightedBackendService(backendService, headerAction, weight);
        }
    }
}

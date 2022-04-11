// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionWeightedBackendServiceHeaderActionGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapDefaultRouteActionWeightedBackendServiceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapDefaultRouteActionWeightedBackendServiceGetArgs Empty = new URLMapDefaultRouteActionWeightedBackendServiceGetArgs();

    /**
     * The full or partial URL to the BackendService resource being mirrored to.
     * 
     */
    @Import(name="backendService")
      private final @Nullable Output<String> backendService;

    public Output<String> getBackendService() {
        return this.backendService == null ? Codegen.empty() : this.backendService;
    }

    /**
     * Specifies changes to request and response headers that need to take effect for
     * the selected backendService.
     * headerAction specified here take effect before headerAction in the enclosing
     * HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * 
     */
    @Import(name="headerAction")
      private final @Nullable Output<URLMapDefaultRouteActionWeightedBackendServiceHeaderActionGetArgs> headerAction;

    public Output<URLMapDefaultRouteActionWeightedBackendServiceHeaderActionGetArgs> getHeaderAction() {
        return this.headerAction == null ? Codegen.empty() : this.headerAction;
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
    @Import(name="weight")
      private final @Nullable Output<Integer> weight;

    public Output<Integer> getWeight() {
        return this.weight == null ? Codegen.empty() : this.weight;
    }

    public URLMapDefaultRouteActionWeightedBackendServiceGetArgs(
        @Nullable Output<String> backendService,
        @Nullable Output<URLMapDefaultRouteActionWeightedBackendServiceHeaderActionGetArgs> headerAction,
        @Nullable Output<Integer> weight) {
        this.backendService = backendService;
        this.headerAction = headerAction;
        this.weight = weight;
    }

    private URLMapDefaultRouteActionWeightedBackendServiceGetArgs() {
        this.backendService = Codegen.empty();
        this.headerAction = Codegen.empty();
        this.weight = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapDefaultRouteActionWeightedBackendServiceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> backendService;
        private @Nullable Output<URLMapDefaultRouteActionWeightedBackendServiceHeaderActionGetArgs> headerAction;
        private @Nullable Output<Integer> weight;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapDefaultRouteActionWeightedBackendServiceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendService = defaults.backendService;
    	      this.headerAction = defaults.headerAction;
    	      this.weight = defaults.weight;
        }

        public Builder backendService(@Nullable Output<String> backendService) {
            this.backendService = backendService;
            return this;
        }
        public Builder backendService(@Nullable String backendService) {
            this.backendService = Codegen.ofNullable(backendService);
            return this;
        }
        public Builder headerAction(@Nullable Output<URLMapDefaultRouteActionWeightedBackendServiceHeaderActionGetArgs> headerAction) {
            this.headerAction = headerAction;
            return this;
        }
        public Builder headerAction(@Nullable URLMapDefaultRouteActionWeightedBackendServiceHeaderActionGetArgs headerAction) {
            this.headerAction = Codegen.ofNullable(headerAction);
            return this;
        }
        public Builder weight(@Nullable Output<Integer> weight) {
            this.weight = weight;
            return this;
        }
        public Builder weight(@Nullable Integer weight) {
            this.weight = Codegen.ofNullable(weight);
            return this;
        }        public URLMapDefaultRouteActionWeightedBackendServiceGetArgs build() {
            return new URLMapDefaultRouteActionWeightedBackendServiceGetArgs(backendService, headerAction, weight);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAdd;
import io.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAdd;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderAction {
    /**
     * Headers to add to a matching request prior to forwarding the request to the
     * backendService.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAdd> requestHeadersToAdds;
    /**
     * A list of header names for headers that need to be removed from the request
     * prior to forwarding the request to the backendService.
     * 
     */
    private final @Nullable List<String> requestHeadersToRemoves;
    /**
     * Headers to add the response prior to sending the response back to the client.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAdd> responseHeadersToAdds;
    /**
     * A list of header names for headers that need to be removed from the response
     * prior to sending the response back to the client.
     * 
     */
    private final @Nullable List<String> responseHeadersToRemoves;

    @CustomType.Constructor
    private RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderAction(
        @CustomType.Parameter("requestHeadersToAdds") @Nullable List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAdd> requestHeadersToAdds,
        @CustomType.Parameter("requestHeadersToRemoves") @Nullable List<String> requestHeadersToRemoves,
        @CustomType.Parameter("responseHeadersToAdds") @Nullable List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAdd> responseHeadersToAdds,
        @CustomType.Parameter("responseHeadersToRemoves") @Nullable List<String> responseHeadersToRemoves) {
        this.requestHeadersToAdds = requestHeadersToAdds;
        this.requestHeadersToRemoves = requestHeadersToRemoves;
        this.responseHeadersToAdds = responseHeadersToAdds;
        this.responseHeadersToRemoves = responseHeadersToRemoves;
    }

    /**
     * Headers to add to a matching request prior to forwarding the request to the
     * backendService.
     * Structure is documented below.
     * 
    */
    public List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAdd> getRequestHeadersToAdds() {
        return this.requestHeadersToAdds == null ? List.of() : this.requestHeadersToAdds;
    }
    /**
     * A list of header names for headers that need to be removed from the request
     * prior to forwarding the request to the backendService.
     * 
    */
    public List<String> getRequestHeadersToRemoves() {
        return this.requestHeadersToRemoves == null ? List.of() : this.requestHeadersToRemoves;
    }
    /**
     * Headers to add the response prior to sending the response back to the client.
     * Structure is documented below.
     * 
    */
    public List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAdd> getResponseHeadersToAdds() {
        return this.responseHeadersToAdds == null ? List.of() : this.responseHeadersToAdds;
    }
    /**
     * A list of header names for headers that need to be removed from the response
     * prior to sending the response back to the client.
     * 
    */
    public List<String> getResponseHeadersToRemoves() {
        return this.responseHeadersToRemoves == null ? List.of() : this.responseHeadersToRemoves;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAdd> requestHeadersToAdds;
        private @Nullable List<String> requestHeadersToRemoves;
        private @Nullable List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAdd> responseHeadersToAdds;
        private @Nullable List<String> responseHeadersToRemoves;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestHeadersToAdds = defaults.requestHeadersToAdds;
    	      this.requestHeadersToRemoves = defaults.requestHeadersToRemoves;
    	      this.responseHeadersToAdds = defaults.responseHeadersToAdds;
    	      this.responseHeadersToRemoves = defaults.responseHeadersToRemoves;
        }

        public Builder requestHeadersToAdds(@Nullable List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAdd> requestHeadersToAdds) {
            this.requestHeadersToAdds = requestHeadersToAdds;
            return this;
        }
        public Builder requestHeadersToAdds(RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAdd... requestHeadersToAdds) {
            return requestHeadersToAdds(List.of(requestHeadersToAdds));
        }
        public Builder requestHeadersToRemoves(@Nullable List<String> requestHeadersToRemoves) {
            this.requestHeadersToRemoves = requestHeadersToRemoves;
            return this;
        }
        public Builder requestHeadersToRemoves(String... requestHeadersToRemoves) {
            return requestHeadersToRemoves(List.of(requestHeadersToRemoves));
        }
        public Builder responseHeadersToAdds(@Nullable List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAdd> responseHeadersToAdds) {
            this.responseHeadersToAdds = responseHeadersToAdds;
            return this;
        }
        public Builder responseHeadersToAdds(RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAdd... responseHeadersToAdds) {
            return responseHeadersToAdds(List.of(responseHeadersToAdds));
        }
        public Builder responseHeadersToRemoves(@Nullable List<String> responseHeadersToRemoves) {
            this.responseHeadersToRemoves = responseHeadersToRemoves;
            return this;
        }
        public Builder responseHeadersToRemoves(String... responseHeadersToRemoves) {
            return responseHeadersToRemoves(List.of(responseHeadersToRemoves));
        }        public RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderAction build() {
            return new RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderAction(requestHeadersToAdds, requestHeadersToRemoves, responseHeadersToAdds, responseHeadersToRemoves);
        }
    }
}

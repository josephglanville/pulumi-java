// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.compute_v1.outputs.HttpHeaderOptionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class HttpHeaderActionResponse {
    /**
     * Headers to add to a matching request before forwarding the request to the backendService.
     * 
     */
    private final List<HttpHeaderOptionResponse> requestHeadersToAdd;
    /**
     * A list of header names for headers that need to be removed from the request before forwarding the request to the backendService.
     * 
     */
    private final List<String> requestHeadersToRemove;
    /**
     * Headers to add the response before sending the response back to the client.
     * 
     */
    private final List<HttpHeaderOptionResponse> responseHeadersToAdd;
    /**
     * A list of header names for headers that need to be removed from the response before sending the response back to the client.
     * 
     */
    private final List<String> responseHeadersToRemove;

    @CustomType.Constructor
    private HttpHeaderActionResponse(
        @CustomType.Parameter("requestHeadersToAdd") List<HttpHeaderOptionResponse> requestHeadersToAdd,
        @CustomType.Parameter("requestHeadersToRemove") List<String> requestHeadersToRemove,
        @CustomType.Parameter("responseHeadersToAdd") List<HttpHeaderOptionResponse> responseHeadersToAdd,
        @CustomType.Parameter("responseHeadersToRemove") List<String> responseHeadersToRemove) {
        this.requestHeadersToAdd = requestHeadersToAdd;
        this.requestHeadersToRemove = requestHeadersToRemove;
        this.responseHeadersToAdd = responseHeadersToAdd;
        this.responseHeadersToRemove = responseHeadersToRemove;
    }

    /**
     * Headers to add to a matching request before forwarding the request to the backendService.
     * 
    */
    public List<HttpHeaderOptionResponse> getRequestHeadersToAdd() {
        return this.requestHeadersToAdd;
    }
    /**
     * A list of header names for headers that need to be removed from the request before forwarding the request to the backendService.
     * 
    */
    public List<String> getRequestHeadersToRemove() {
        return this.requestHeadersToRemove;
    }
    /**
     * Headers to add the response before sending the response back to the client.
     * 
    */
    public List<HttpHeaderOptionResponse> getResponseHeadersToAdd() {
        return this.responseHeadersToAdd;
    }
    /**
     * A list of header names for headers that need to be removed from the response before sending the response back to the client.
     * 
    */
    public List<String> getResponseHeadersToRemove() {
        return this.responseHeadersToRemove;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpHeaderActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<HttpHeaderOptionResponse> requestHeadersToAdd;
        private List<String> requestHeadersToRemove;
        private List<HttpHeaderOptionResponse> responseHeadersToAdd;
        private List<String> responseHeadersToRemove;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpHeaderActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestHeadersToAdd = defaults.requestHeadersToAdd;
    	      this.requestHeadersToRemove = defaults.requestHeadersToRemove;
    	      this.responseHeadersToAdd = defaults.responseHeadersToAdd;
    	      this.responseHeadersToRemove = defaults.responseHeadersToRemove;
        }

        public Builder requestHeadersToAdd(List<HttpHeaderOptionResponse> requestHeadersToAdd) {
            this.requestHeadersToAdd = Objects.requireNonNull(requestHeadersToAdd);
            return this;
        }
        public Builder requestHeadersToAdd(HttpHeaderOptionResponse... requestHeadersToAdd) {
            return requestHeadersToAdd(List.of(requestHeadersToAdd));
        }
        public Builder requestHeadersToRemove(List<String> requestHeadersToRemove) {
            this.requestHeadersToRemove = Objects.requireNonNull(requestHeadersToRemove);
            return this;
        }
        public Builder requestHeadersToRemove(String... requestHeadersToRemove) {
            return requestHeadersToRemove(List.of(requestHeadersToRemove));
        }
        public Builder responseHeadersToAdd(List<HttpHeaderOptionResponse> responseHeadersToAdd) {
            this.responseHeadersToAdd = Objects.requireNonNull(responseHeadersToAdd);
            return this;
        }
        public Builder responseHeadersToAdd(HttpHeaderOptionResponse... responseHeadersToAdd) {
            return responseHeadersToAdd(List.of(responseHeadersToAdd));
        }
        public Builder responseHeadersToRemove(List<String> responseHeadersToRemove) {
            this.responseHeadersToRemove = Objects.requireNonNull(responseHeadersToRemove);
            return this;
        }
        public Builder responseHeadersToRemove(String... responseHeadersToRemove) {
            return responseHeadersToRemove(List.of(responseHeadersToRemove));
        }        public HttpHeaderActionResponse build() {
            return new HttpHeaderActionResponse(requestHeadersToAdd, requestHeadersToRemove, responseHeadersToAdd, responseHeadersToRemove);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.azurenative.servicefabricmesh.inputs.HttpRouteMatchHeaderResponse;
import io.pulumi.azurenative.servicefabricmesh.inputs.HttpRouteMatchPathResponse;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a rule for http route matching.
 * 
 */
public final class HttpRouteMatchRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final HttpRouteMatchRuleResponse Empty = new HttpRouteMatchRuleResponse();

    /**
     * headers and their values to match in request.
     * 
     */
    @Import(name="headers")
      private final @Nullable List<HttpRouteMatchHeaderResponse> headers;

    public List<HttpRouteMatchHeaderResponse> getHeaders() {
        return this.headers == null ? List.of() : this.headers;
    }

    /**
     * Path to match for routing.
     * 
     */
    @Import(name="path", required=true)
      private final HttpRouteMatchPathResponse path;

    public HttpRouteMatchPathResponse getPath() {
        return this.path;
    }

    public HttpRouteMatchRuleResponse(
        @Nullable List<HttpRouteMatchHeaderResponse> headers,
        HttpRouteMatchPathResponse path) {
        this.headers = headers;
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
    }

    private HttpRouteMatchRuleResponse() {
        this.headers = List.of();
        this.path = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRouteMatchRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<HttpRouteMatchHeaderResponse> headers;
        private HttpRouteMatchPathResponse path;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRouteMatchRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headers = defaults.headers;
    	      this.path = defaults.path;
        }

        public Builder headers(@Nullable List<HttpRouteMatchHeaderResponse> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(HttpRouteMatchHeaderResponse... headers) {
            return headers(List.of(headers));
        }
        public Builder path(HttpRouteMatchPathResponse path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }        public HttpRouteMatchRuleResponse build() {
            return new HttpRouteMatchRuleResponse(headers, path);
        }
    }
}

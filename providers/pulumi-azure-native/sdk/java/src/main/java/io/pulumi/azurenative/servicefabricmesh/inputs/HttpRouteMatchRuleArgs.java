// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.azurenative.servicefabricmesh.inputs.HttpRouteMatchHeaderArgs;
import io.pulumi.azurenative.servicefabricmesh.inputs.HttpRouteMatchPathArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a rule for http route matching.
 * 
 */
public final class HttpRouteMatchRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpRouteMatchRuleArgs Empty = new HttpRouteMatchRuleArgs();

    /**
     * headers and their values to match in request.
     * 
     */
    @Import(name="headers")
      private final @Nullable Output<List<HttpRouteMatchHeaderArgs>> headers;

    public Output<List<HttpRouteMatchHeaderArgs>> getHeaders() {
        return this.headers == null ? Output.empty() : this.headers;
    }

    /**
     * Path to match for routing.
     * 
     */
    @Import(name="path", required=true)
      private final Output<HttpRouteMatchPathArgs> path;

    public Output<HttpRouteMatchPathArgs> getPath() {
        return this.path;
    }

    public HttpRouteMatchRuleArgs(
        @Nullable Output<List<HttpRouteMatchHeaderArgs>> headers,
        Output<HttpRouteMatchPathArgs> path) {
        this.headers = headers;
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
    }

    private HttpRouteMatchRuleArgs() {
        this.headers = Output.empty();
        this.path = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRouteMatchRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<HttpRouteMatchHeaderArgs>> headers;
        private Output<HttpRouteMatchPathArgs> path;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRouteMatchRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headers = defaults.headers;
    	      this.path = defaults.path;
        }

        public Builder headers(@Nullable Output<List<HttpRouteMatchHeaderArgs>> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(@Nullable List<HttpRouteMatchHeaderArgs> headers) {
            this.headers = Output.ofNullable(headers);
            return this;
        }
        public Builder headers(HttpRouteMatchHeaderArgs... headers) {
            return headers(List.of(headers));
        }
        public Builder path(Output<HttpRouteMatchPathArgs> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder path(HttpRouteMatchPathArgs path) {
            this.path = Output.of(Objects.requireNonNull(path));
            return this;
        }        public HttpRouteMatchRuleArgs build() {
            return new HttpRouteMatchRuleArgs(headers, path);
        }
    }
}

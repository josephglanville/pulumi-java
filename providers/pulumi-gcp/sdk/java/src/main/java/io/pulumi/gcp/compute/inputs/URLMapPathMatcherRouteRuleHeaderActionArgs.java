// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleHeaderActionRequestHeadersToAddArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleHeaderActionResponseHeadersToAddArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapPathMatcherRouteRuleHeaderActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherRouteRuleHeaderActionArgs Empty = new URLMapPathMatcherRouteRuleHeaderActionArgs();

    /**
     * Headers to add to a matching request prior to forwarding the request to the backendService.
     * Structure is documented below.
     * 
     */
    @Import(name="requestHeadersToAdds")
      private final @Nullable Output<List<URLMapPathMatcherRouteRuleHeaderActionRequestHeadersToAddArgs>> requestHeadersToAdds;

    public Output<List<URLMapPathMatcherRouteRuleHeaderActionRequestHeadersToAddArgs>> getRequestHeadersToAdds() {
        return this.requestHeadersToAdds == null ? Output.empty() : this.requestHeadersToAdds;
    }

    /**
     * A list of header names for headers that need to be removed from the request prior to
     * forwarding the request to the backendService.
     * 
     */
    @Import(name="requestHeadersToRemoves")
      private final @Nullable Output<List<String>> requestHeadersToRemoves;

    public Output<List<String>> getRequestHeadersToRemoves() {
        return this.requestHeadersToRemoves == null ? Output.empty() : this.requestHeadersToRemoves;
    }

    /**
     * Headers to add the response prior to sending the response back to the client.
     * Structure is documented below.
     * 
     */
    @Import(name="responseHeadersToAdds")
      private final @Nullable Output<List<URLMapPathMatcherRouteRuleHeaderActionResponseHeadersToAddArgs>> responseHeadersToAdds;

    public Output<List<URLMapPathMatcherRouteRuleHeaderActionResponseHeadersToAddArgs>> getResponseHeadersToAdds() {
        return this.responseHeadersToAdds == null ? Output.empty() : this.responseHeadersToAdds;
    }

    /**
     * A list of header names for headers that need to be removed from the response prior to sending the
     * response back to the client.
     * 
     */
    @Import(name="responseHeadersToRemoves")
      private final @Nullable Output<List<String>> responseHeadersToRemoves;

    public Output<List<String>> getResponseHeadersToRemoves() {
        return this.responseHeadersToRemoves == null ? Output.empty() : this.responseHeadersToRemoves;
    }

    public URLMapPathMatcherRouteRuleHeaderActionArgs(
        @Nullable Output<List<URLMapPathMatcherRouteRuleHeaderActionRequestHeadersToAddArgs>> requestHeadersToAdds,
        @Nullable Output<List<String>> requestHeadersToRemoves,
        @Nullable Output<List<URLMapPathMatcherRouteRuleHeaderActionResponseHeadersToAddArgs>> responseHeadersToAdds,
        @Nullable Output<List<String>> responseHeadersToRemoves) {
        this.requestHeadersToAdds = requestHeadersToAdds;
        this.requestHeadersToRemoves = requestHeadersToRemoves;
        this.responseHeadersToAdds = responseHeadersToAdds;
        this.responseHeadersToRemoves = responseHeadersToRemoves;
    }

    private URLMapPathMatcherRouteRuleHeaderActionArgs() {
        this.requestHeadersToAdds = Output.empty();
        this.requestHeadersToRemoves = Output.empty();
        this.responseHeadersToAdds = Output.empty();
        this.responseHeadersToRemoves = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherRouteRuleHeaderActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<URLMapPathMatcherRouteRuleHeaderActionRequestHeadersToAddArgs>> requestHeadersToAdds;
        private @Nullable Output<List<String>> requestHeadersToRemoves;
        private @Nullable Output<List<URLMapPathMatcherRouteRuleHeaderActionResponseHeadersToAddArgs>> responseHeadersToAdds;
        private @Nullable Output<List<String>> responseHeadersToRemoves;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherRouteRuleHeaderActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestHeadersToAdds = defaults.requestHeadersToAdds;
    	      this.requestHeadersToRemoves = defaults.requestHeadersToRemoves;
    	      this.responseHeadersToAdds = defaults.responseHeadersToAdds;
    	      this.responseHeadersToRemoves = defaults.responseHeadersToRemoves;
        }

        public Builder requestHeadersToAdds(@Nullable Output<List<URLMapPathMatcherRouteRuleHeaderActionRequestHeadersToAddArgs>> requestHeadersToAdds) {
            this.requestHeadersToAdds = requestHeadersToAdds;
            return this;
        }
        public Builder requestHeadersToAdds(@Nullable List<URLMapPathMatcherRouteRuleHeaderActionRequestHeadersToAddArgs> requestHeadersToAdds) {
            this.requestHeadersToAdds = Output.ofNullable(requestHeadersToAdds);
            return this;
        }
        public Builder requestHeadersToAdds(URLMapPathMatcherRouteRuleHeaderActionRequestHeadersToAddArgs... requestHeadersToAdds) {
            return requestHeadersToAdds(List.of(requestHeadersToAdds));
        }
        public Builder requestHeadersToRemoves(@Nullable Output<List<String>> requestHeadersToRemoves) {
            this.requestHeadersToRemoves = requestHeadersToRemoves;
            return this;
        }
        public Builder requestHeadersToRemoves(@Nullable List<String> requestHeadersToRemoves) {
            this.requestHeadersToRemoves = Output.ofNullable(requestHeadersToRemoves);
            return this;
        }
        public Builder requestHeadersToRemoves(String... requestHeadersToRemoves) {
            return requestHeadersToRemoves(List.of(requestHeadersToRemoves));
        }
        public Builder responseHeadersToAdds(@Nullable Output<List<URLMapPathMatcherRouteRuleHeaderActionResponseHeadersToAddArgs>> responseHeadersToAdds) {
            this.responseHeadersToAdds = responseHeadersToAdds;
            return this;
        }
        public Builder responseHeadersToAdds(@Nullable List<URLMapPathMatcherRouteRuleHeaderActionResponseHeadersToAddArgs> responseHeadersToAdds) {
            this.responseHeadersToAdds = Output.ofNullable(responseHeadersToAdds);
            return this;
        }
        public Builder responseHeadersToAdds(URLMapPathMatcherRouteRuleHeaderActionResponseHeadersToAddArgs... responseHeadersToAdds) {
            return responseHeadersToAdds(List.of(responseHeadersToAdds));
        }
        public Builder responseHeadersToRemoves(@Nullable Output<List<String>> responseHeadersToRemoves) {
            this.responseHeadersToRemoves = responseHeadersToRemoves;
            return this;
        }
        public Builder responseHeadersToRemoves(@Nullable List<String> responseHeadersToRemoves) {
            this.responseHeadersToRemoves = Output.ofNullable(responseHeadersToRemoves);
            return this;
        }
        public Builder responseHeadersToRemoves(String... responseHeadersToRemoves) {
            return responseHeadersToRemoves(List.of(responseHeadersToRemoves));
        }        public URLMapPathMatcherRouteRuleHeaderActionArgs build() {
            return new URLMapPathMatcherRouteRuleHeaderActionArgs(requestHeadersToAdds, requestHeadersToRemoves, responseHeadersToAdds, responseHeadersToRemoves);
        }
    }
}

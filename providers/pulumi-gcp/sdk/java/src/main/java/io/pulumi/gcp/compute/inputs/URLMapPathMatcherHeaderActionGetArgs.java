// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherHeaderActionRequestHeadersToAddGetArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherHeaderActionResponseHeadersToAddGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapPathMatcherHeaderActionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherHeaderActionGetArgs Empty = new URLMapPathMatcherHeaderActionGetArgs();

    /**
     * Headers to add to a matching request prior to forwarding the request to the backendService.
     * Structure is documented below.
     * 
     */
    @InputImport(name="requestHeadersToAdds")
      private final @Nullable Input<List<URLMapPathMatcherHeaderActionRequestHeadersToAddGetArgs>> requestHeadersToAdds;

    public Input<List<URLMapPathMatcherHeaderActionRequestHeadersToAddGetArgs>> getRequestHeadersToAdds() {
        return this.requestHeadersToAdds == null ? Input.empty() : this.requestHeadersToAdds;
    }

    /**
     * A list of header names for headers that need to be removed from the request prior to
     * forwarding the request to the backendService.
     * 
     */
    @InputImport(name="requestHeadersToRemoves")
      private final @Nullable Input<List<String>> requestHeadersToRemoves;

    public Input<List<String>> getRequestHeadersToRemoves() {
        return this.requestHeadersToRemoves == null ? Input.empty() : this.requestHeadersToRemoves;
    }

    /**
     * Headers to add the response prior to sending the response back to the client.
     * Structure is documented below.
     * 
     */
    @InputImport(name="responseHeadersToAdds")
      private final @Nullable Input<List<URLMapPathMatcherHeaderActionResponseHeadersToAddGetArgs>> responseHeadersToAdds;

    public Input<List<URLMapPathMatcherHeaderActionResponseHeadersToAddGetArgs>> getResponseHeadersToAdds() {
        return this.responseHeadersToAdds == null ? Input.empty() : this.responseHeadersToAdds;
    }

    /**
     * A list of header names for headers that need to be removed from the response prior to sending the
     * response back to the client.
     * 
     */
    @InputImport(name="responseHeadersToRemoves")
      private final @Nullable Input<List<String>> responseHeadersToRemoves;

    public Input<List<String>> getResponseHeadersToRemoves() {
        return this.responseHeadersToRemoves == null ? Input.empty() : this.responseHeadersToRemoves;
    }

    public URLMapPathMatcherHeaderActionGetArgs(
        @Nullable Input<List<URLMapPathMatcherHeaderActionRequestHeadersToAddGetArgs>> requestHeadersToAdds,
        @Nullable Input<List<String>> requestHeadersToRemoves,
        @Nullable Input<List<URLMapPathMatcherHeaderActionResponseHeadersToAddGetArgs>> responseHeadersToAdds,
        @Nullable Input<List<String>> responseHeadersToRemoves) {
        this.requestHeadersToAdds = requestHeadersToAdds;
        this.requestHeadersToRemoves = requestHeadersToRemoves;
        this.responseHeadersToAdds = responseHeadersToAdds;
        this.responseHeadersToRemoves = responseHeadersToRemoves;
    }

    private URLMapPathMatcherHeaderActionGetArgs() {
        this.requestHeadersToAdds = Input.empty();
        this.requestHeadersToRemoves = Input.empty();
        this.responseHeadersToAdds = Input.empty();
        this.responseHeadersToRemoves = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherHeaderActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<URLMapPathMatcherHeaderActionRequestHeadersToAddGetArgs>> requestHeadersToAdds;
        private @Nullable Input<List<String>> requestHeadersToRemoves;
        private @Nullable Input<List<URLMapPathMatcherHeaderActionResponseHeadersToAddGetArgs>> responseHeadersToAdds;
        private @Nullable Input<List<String>> responseHeadersToRemoves;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherHeaderActionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestHeadersToAdds = defaults.requestHeadersToAdds;
    	      this.requestHeadersToRemoves = defaults.requestHeadersToRemoves;
    	      this.responseHeadersToAdds = defaults.responseHeadersToAdds;
    	      this.responseHeadersToRemoves = defaults.responseHeadersToRemoves;
        }

        public Builder setRequestHeadersToAdds(@Nullable Input<List<URLMapPathMatcherHeaderActionRequestHeadersToAddGetArgs>> requestHeadersToAdds) {
            this.requestHeadersToAdds = requestHeadersToAdds;
            return this;
        }

        public Builder setRequestHeadersToAdds(@Nullable List<URLMapPathMatcherHeaderActionRequestHeadersToAddGetArgs> requestHeadersToAdds) {
            this.requestHeadersToAdds = Input.ofNullable(requestHeadersToAdds);
            return this;
        }

        public Builder setRequestHeadersToRemoves(@Nullable Input<List<String>> requestHeadersToRemoves) {
            this.requestHeadersToRemoves = requestHeadersToRemoves;
            return this;
        }

        public Builder setRequestHeadersToRemoves(@Nullable List<String> requestHeadersToRemoves) {
            this.requestHeadersToRemoves = Input.ofNullable(requestHeadersToRemoves);
            return this;
        }

        public Builder setResponseHeadersToAdds(@Nullable Input<List<URLMapPathMatcherHeaderActionResponseHeadersToAddGetArgs>> responseHeadersToAdds) {
            this.responseHeadersToAdds = responseHeadersToAdds;
            return this;
        }

        public Builder setResponseHeadersToAdds(@Nullable List<URLMapPathMatcherHeaderActionResponseHeadersToAddGetArgs> responseHeadersToAdds) {
            this.responseHeadersToAdds = Input.ofNullable(responseHeadersToAdds);
            return this;
        }

        public Builder setResponseHeadersToRemoves(@Nullable Input<List<String>> responseHeadersToRemoves) {
            this.responseHeadersToRemoves = responseHeadersToRemoves;
            return this;
        }

        public Builder setResponseHeadersToRemoves(@Nullable List<String> responseHeadersToRemoves) {
            this.responseHeadersToRemoves = Input.ofNullable(responseHeadersToRemoves);
            return this;
        }
        public URLMapPathMatcherHeaderActionGetArgs build() {
            return new URLMapPathMatcherHeaderActionGetArgs(requestHeadersToAdds, requestHeadersToRemoves, responseHeadersToAdds, responseHeadersToRemoves);
        }
    }
}

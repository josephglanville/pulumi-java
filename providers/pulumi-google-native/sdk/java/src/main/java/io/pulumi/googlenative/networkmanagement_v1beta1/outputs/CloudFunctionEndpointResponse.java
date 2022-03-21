// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CloudFunctionEndpointResponse {
    /**
     * A [Cloud function](https://cloud.google.com/functions) name.
     * 
     */
    private final String uri;

    @CustomType.Constructor
    private CloudFunctionEndpointResponse(@CustomType.Parameter("uri") String uri) {
        this.uri = uri;
    }

    /**
     * A [Cloud function](https://cloud.google.com/functions) name.
     * 
    */
    public String getUri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudFunctionEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudFunctionEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.uri = defaults.uri;
        }

        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public CloudFunctionEndpointResponse build() {
            return new CloudFunctionEndpointResponse(uri);
        }
    }
}

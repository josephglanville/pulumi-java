// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetEndpointAccessArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEndpointAccessArgs Empty = new GetEndpointAccessArgs();

    /**
     * The name of the endpoint.
     * 
     */
    @InputImport(name="endpointName", required=true)
      private final String endpointName;

    public String getEndpointName() {
        return this.endpointName;
    }

    public GetEndpointAccessArgs(String endpointName) {
        this.endpointName = Objects.requireNonNull(endpointName, "expected parameter 'endpointName' to be non-null");
    }

    private GetEndpointAccessArgs() {
        this.endpointName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEndpointAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpointName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEndpointAccessArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointName = defaults.endpointName;
        }

        public Builder setEndpointName(String endpointName) {
            this.endpointName = Objects.requireNonNull(endpointName);
            return this;
        }
        public GetEndpointAccessArgs build() {
            return new GetEndpointAccessArgs(endpointName);
        }
    }
}

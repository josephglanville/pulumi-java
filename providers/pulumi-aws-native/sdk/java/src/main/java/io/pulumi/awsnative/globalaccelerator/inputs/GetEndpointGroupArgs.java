// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.globalaccelerator.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetEndpointGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEndpointGroupArgs Empty = new GetEndpointGroupArgs();

    /**
     * The Amazon Resource Name (ARN) of the endpoint group
     * 
     */
    @InputImport(name="endpointGroupArn", required=true)
      private final String endpointGroupArn;

    public String getEndpointGroupArn() {
        return this.endpointGroupArn;
    }

    public GetEndpointGroupArgs(String endpointGroupArn) {
        this.endpointGroupArn = Objects.requireNonNull(endpointGroupArn, "expected parameter 'endpointGroupArn' to be non-null");
    }

    private GetEndpointGroupArgs() {
        this.endpointGroupArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEndpointGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpointGroupArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEndpointGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointGroupArn = defaults.endpointGroupArn;
        }

        public Builder setEndpointGroupArn(String endpointGroupArn) {
            this.endpointGroupArn = Objects.requireNonNull(endpointGroupArn);
            return this;
        }
        public GetEndpointGroupArgs build() {
            return new GetEndpointGroupArgs(endpointGroupArn);
        }
    }
}

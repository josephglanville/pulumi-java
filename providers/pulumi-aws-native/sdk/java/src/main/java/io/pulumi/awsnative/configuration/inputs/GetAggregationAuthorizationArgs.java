// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.configuration.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAggregationAuthorizationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAggregationAuthorizationArgs Empty = new GetAggregationAuthorizationArgs();

    /**
     * The ARN of the AggregationAuthorization.
     * 
     */
    @Import(name="aggregationAuthorizationArn", required=true)
      private final String aggregationAuthorizationArn;

    public String getAggregationAuthorizationArn() {
        return this.aggregationAuthorizationArn;
    }

    public GetAggregationAuthorizationArgs(String aggregationAuthorizationArn) {
        this.aggregationAuthorizationArn = Objects.requireNonNull(aggregationAuthorizationArn, "expected parameter 'aggregationAuthorizationArn' to be non-null");
    }

    private GetAggregationAuthorizationArgs() {
        this.aggregationAuthorizationArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAggregationAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String aggregationAuthorizationArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAggregationAuthorizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationAuthorizationArn = defaults.aggregationAuthorizationArn;
        }

        public Builder aggregationAuthorizationArn(String aggregationAuthorizationArn) {
            this.aggregationAuthorizationArn = Objects.requireNonNull(aggregationAuthorizationArn);
            return this;
        }        public GetAggregationAuthorizationArgs build() {
            return new GetAggregationAuthorizationArgs(aggregationAuthorizationArn);
        }
    }
}

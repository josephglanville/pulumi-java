// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRouteTableArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRouteTableArgs Empty = new GetRouteTableArgs();

    /**
     * The route table ID.
     * 
     */
    @Import(name="routeTableId", required=true)
      private final String routeTableId;

    public String getRouteTableId() {
        return this.routeTableId;
    }

    public GetRouteTableArgs(String routeTableId) {
        this.routeTableId = Objects.requireNonNull(routeTableId, "expected parameter 'routeTableId' to be non-null");
    }

    private GetRouteTableArgs() {
        this.routeTableId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String routeTableId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouteTableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.routeTableId = defaults.routeTableId;
        }

        public Builder routeTableId(String routeTableId) {
            this.routeTableId = Objects.requireNonNull(routeTableId);
            return this;
        }        public GetRouteTableArgs build() {
            return new GetRouteTableArgs(routeTableId);
        }
    }
}

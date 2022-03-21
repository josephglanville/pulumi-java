// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.GetTransitGatewayRouteTablesFilter;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTransitGatewayRouteTablesArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTransitGatewayRouteTablesArgs Empty = new GetTransitGatewayRouteTablesArgs();

    /**
     * Custom filter block as described below.
     * 
     */
    @Import(name="filters")
      private final @Nullable List<GetTransitGatewayRouteTablesFilter> filters;

    public List<GetTransitGatewayRouteTablesFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * A mapping of tags, each pair of which must exactly match
     * a pair on the desired transit gateway route table.
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetTransitGatewayRouteTablesArgs(
        @Nullable List<GetTransitGatewayRouteTablesFilter> filters,
        @Nullable Map<String,String> tags) {
        this.filters = filters;
        this.tags = tags;
    }

    private GetTransitGatewayRouteTablesArgs() {
        this.filters = List.of();
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitGatewayRouteTablesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetTransitGatewayRouteTablesFilter> filters;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTransitGatewayRouteTablesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.tags = defaults.tags;
        }

        public Builder filters(@Nullable List<GetTransitGatewayRouteTablesFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetTransitGatewayRouteTablesFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }        public GetTransitGatewayRouteTablesArgs build() {
            return new GetTransitGatewayRouteTablesArgs(filters, tags);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.GetSubnetsFilter;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSubnetsArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSubnetsArgs Empty = new GetSubnetsArgs();

    /**
     * Custom filter block as described below.
     * 
     */
    @Import(name="filters")
      private final @Nullable List<GetSubnetsFilter> filters;

    public List<GetSubnetsFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * A map of tags, each pair of which must exactly match
     * a pair on the desired subnets.
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetSubnetsArgs(
        @Nullable List<GetSubnetsFilter> filters,
        @Nullable Map<String,String> tags) {
        this.filters = filters;
        this.tags = tags;
    }

    private GetSubnetsArgs() {
        this.filters = List.of();
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubnetsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetSubnetsFilter> filters;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubnetsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.tags = defaults.tags;
        }

        public Builder filters(@Nullable List<GetSubnetsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetSubnetsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }        public GetSubnetsArgs build() {
            return new GetSubnetsArgs(filters, tags);
        }
    }
}

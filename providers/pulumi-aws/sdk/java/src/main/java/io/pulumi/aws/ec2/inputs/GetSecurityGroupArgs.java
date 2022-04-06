// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.GetSecurityGroupFilter;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecurityGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSecurityGroupArgs Empty = new GetSecurityGroupArgs();

    /**
     * Custom filter block as described below.
     * 
     */
    @Import(name="filters")
      private final @Nullable List<GetSecurityGroupFilter> filters;

    public List<GetSecurityGroupFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * The id of the specific security group to retrieve.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The name of the field to filter by, as defined by
     * [the underlying AWS API](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSecurityGroups.html).
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * A map of tags, each pair of which must exactly match
     * a pair on the desired security group.
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    /**
     * The id of the VPC that the desired security group belongs to.
     * 
     */
    @Import(name="vpcId")
      private final @Nullable String vpcId;

    public Optional<String> getVpcId() {
        return this.vpcId == null ? Optional.empty() : Optional.ofNullable(this.vpcId);
    }

    public GetSecurityGroupArgs(
        @Nullable List<GetSecurityGroupFilter> filters,
        @Nullable String id,
        @Nullable String name,
        @Nullable Map<String,String> tags,
        @Nullable String vpcId) {
        this.filters = filters;
        this.id = id;
        this.name = name;
        this.tags = tags;
        this.vpcId = vpcId;
    }

    private GetSecurityGroupArgs() {
        this.filters = List.of();
        this.id = null;
        this.name = null;
        this.tags = Map.of();
        this.vpcId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecurityGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetSecurityGroupFilter> filters;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable Map<String,String> tags;
        private @Nullable String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecurityGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder filters(@Nullable List<GetSecurityGroupFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetSecurityGroupFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = vpcId;
            return this;
        }        public GetSecurityGroupArgs build() {
            return new GetSecurityGroupArgs(filters, id, name, tags, vpcId);
        }
    }
}
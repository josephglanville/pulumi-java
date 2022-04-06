// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.GetPrefixListFilter;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPrefixListArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPrefixListArgs Empty = new GetPrefixListArgs();

    /**
     * Configuration block(s) for filtering. Detailed below.
     * 
     */
    @Import(name="filters")
      private final @Nullable List<GetPrefixListFilter> filters;

    public List<GetPrefixListFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * The name of the filter field. Valid values can be found in the [EC2 DescribePrefixLists API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribePrefixLists.html).
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The ID of the prefix list to select.
     * 
     */
    @Import(name="prefixListId")
      private final @Nullable String prefixListId;

    public Optional<String> getPrefixListId() {
        return this.prefixListId == null ? Optional.empty() : Optional.ofNullable(this.prefixListId);
    }

    public GetPrefixListArgs(
        @Nullable List<GetPrefixListFilter> filters,
        @Nullable String name,
        @Nullable String prefixListId) {
        this.filters = filters;
        this.name = name;
        this.prefixListId = prefixListId;
    }

    private GetPrefixListArgs() {
        this.filters = List.of();
        this.name = null;
        this.prefixListId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrefixListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetPrefixListFilter> filters;
        private @Nullable String name;
        private @Nullable String prefixListId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrefixListArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.name = defaults.name;
    	      this.prefixListId = defaults.prefixListId;
        }

        public Builder filters(@Nullable List<GetPrefixListFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetPrefixListFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder prefixListId(@Nullable String prefixListId) {
            this.prefixListId = prefixListId;
            return this;
        }        public GetPrefixListArgs build() {
            return new GetPrefixListArgs(filters, name, prefixListId);
        }
    }
}
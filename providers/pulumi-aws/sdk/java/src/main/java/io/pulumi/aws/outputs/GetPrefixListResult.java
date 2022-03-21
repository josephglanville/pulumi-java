// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.outputs;

import io.pulumi.aws.outputs.GetPrefixListFilter;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPrefixListResult {
    /**
     * The list of CIDR blocks for the AWS service associated with the prefix list.
     * 
     */
    private final List<String> cidrBlocks;
    private final @Nullable List<GetPrefixListFilter> filters;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The name of the selected prefix list.
     * 
     */
    private final String name;
    private final @Nullable String prefixListId;

    @CustomType.Constructor
    private GetPrefixListResult(
        @CustomType.Parameter("cidrBlocks") List<String> cidrBlocks,
        @CustomType.Parameter("filters") @Nullable List<GetPrefixListFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("prefixListId") @Nullable String prefixListId) {
        this.cidrBlocks = cidrBlocks;
        this.filters = filters;
        this.id = id;
        this.name = name;
        this.prefixListId = prefixListId;
    }

    /**
     * The list of CIDR blocks for the AWS service associated with the prefix list.
     * 
    */
    public List<String> getCidrBlocks() {
        return this.cidrBlocks;
    }
    public List<GetPrefixListFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the selected prefix list.
     * 
    */
    public String getName() {
        return this.name;
    }
    public Optional<String> getPrefixListId() {
        return Optional.ofNullable(this.prefixListId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrefixListResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> cidrBlocks;
        private @Nullable List<GetPrefixListFilter> filters;
        private String id;
        private String name;
        private @Nullable String prefixListId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrefixListResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlocks = defaults.cidrBlocks;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.prefixListId = defaults.prefixListId;
        }

        public Builder cidrBlocks(List<String> cidrBlocks) {
            this.cidrBlocks = Objects.requireNonNull(cidrBlocks);
            return this;
        }
        public Builder cidrBlocks(String... cidrBlocks) {
            return cidrBlocks(List.of(cidrBlocks));
        }
        public Builder filters(@Nullable List<GetPrefixListFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetPrefixListFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder prefixListId(@Nullable String prefixListId) {
            this.prefixListId = prefixListId;
            return this;
        }        public GetPrefixListResult build() {
            return new GetPrefixListResult(cidrBlocks, filters, id, name, prefixListId);
        }
    }
}

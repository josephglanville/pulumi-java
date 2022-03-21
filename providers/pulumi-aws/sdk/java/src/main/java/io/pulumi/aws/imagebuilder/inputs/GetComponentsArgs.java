// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.inputs;

import io.pulumi.aws.imagebuilder.inputs.GetComponentsFilter;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetComponentsArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetComponentsArgs Empty = new GetComponentsArgs();

    /**
     * Configuration block(s) for filtering. Detailed below.
     * 
     */
    @Import(name="filters")
      private final @Nullable List<GetComponentsFilter> filters;

    public List<GetComponentsFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * The owner of the image recipes. Valid values are `Self`, `Shared` and `Amazon`. Defaults to `Self`.
     * 
     */
    @Import(name="owner")
      private final @Nullable String owner;

    public Optional<String> getOwner() {
        return this.owner == null ? Optional.empty() : Optional.ofNullable(this.owner);
    }

    public GetComponentsArgs(
        @Nullable List<GetComponentsFilter> filters,
        @Nullable String owner) {
        this.filters = filters;
        this.owner = owner;
    }

    private GetComponentsArgs() {
        this.filters = List.of();
        this.owner = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetComponentsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetComponentsFilter> filters;
        private @Nullable String owner;

        public Builder() {
    	      // Empty
        }

        public Builder(GetComponentsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.owner = defaults.owner;
        }

        public Builder filters(@Nullable List<GetComponentsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetComponentsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder owner(@Nullable String owner) {
            this.owner = owner;
            return this;
        }        public GetComponentsArgs build() {
            return new GetComponentsArgs(filters, owner);
        }
    }
}

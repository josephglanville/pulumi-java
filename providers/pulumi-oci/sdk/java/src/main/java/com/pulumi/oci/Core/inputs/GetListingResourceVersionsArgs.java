// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Core.inputs.GetListingResourceVersionsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetListingResourceVersionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetListingResourceVersionsArgs Empty = new GetListingResourceVersionsArgs();

    @Import(name="filters")
    private @Nullable List<GetListingResourceVersionsFilter> filters;

    public Optional<List<GetListingResourceVersionsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    @Import(name="listingId", required=true)
    private String listingId;

    public String listingId() {
        return this.listingId;
    }

    private GetListingResourceVersionsArgs() {}

    private GetListingResourceVersionsArgs(GetListingResourceVersionsArgs $) {
        this.filters = $.filters;
        this.listingId = $.listingId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetListingResourceVersionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetListingResourceVersionsArgs $;

        public Builder() {
            $ = new GetListingResourceVersionsArgs();
        }

        public Builder(GetListingResourceVersionsArgs defaults) {
            $ = new GetListingResourceVersionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable List<GetListingResourceVersionsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetListingResourceVersionsFilter... filters) {
            return filters(List.of(filters));
        }

        public Builder listingId(String listingId) {
            $.listingId = listingId;
            return this;
        }

        public GetListingResourceVersionsArgs build() {
            $.listingId = Objects.requireNonNull($.listingId, "expected parameter 'listingId' to be non-null");
            return $;
        }
    }

}

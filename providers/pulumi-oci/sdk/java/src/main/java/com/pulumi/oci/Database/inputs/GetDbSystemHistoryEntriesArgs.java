// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Database.inputs.GetDbSystemHistoryEntriesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDbSystemHistoryEntriesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDbSystemHistoryEntriesArgs Empty = new GetDbSystemHistoryEntriesArgs();

    /**
     * The DB system [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="dbSystemId", required=true)
    private String dbSystemId;

    /**
     * @return The DB system [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String dbSystemId() {
        return this.dbSystemId;
    }

    @Import(name="filters")
    private @Nullable List<GetDbSystemHistoryEntriesFilter> filters;

    public Optional<List<GetDbSystemHistoryEntriesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetDbSystemHistoryEntriesArgs() {}

    private GetDbSystemHistoryEntriesArgs(GetDbSystemHistoryEntriesArgs $) {
        this.dbSystemId = $.dbSystemId;
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDbSystemHistoryEntriesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDbSystemHistoryEntriesArgs $;

        public Builder() {
            $ = new GetDbSystemHistoryEntriesArgs();
        }

        public Builder(GetDbSystemHistoryEntriesArgs defaults) {
            $ = new GetDbSystemHistoryEntriesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dbSystemId The DB system [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder dbSystemId(String dbSystemId) {
            $.dbSystemId = dbSystemId;
            return this;
        }

        public Builder filters(@Nullable List<GetDbSystemHistoryEntriesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetDbSystemHistoryEntriesFilter... filters) {
            return filters(List.of(filters));
        }

        public GetDbSystemHistoryEntriesArgs build() {
            $.dbSystemId = Objects.requireNonNull($.dbSystemId, "expected parameter 'dbSystemId' to be non-null");
            return $;
        }
    }

}

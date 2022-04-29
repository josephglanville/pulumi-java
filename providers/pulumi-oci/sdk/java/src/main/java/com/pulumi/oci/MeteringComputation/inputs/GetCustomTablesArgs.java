// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.MeteringComputation.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.MeteringComputation.inputs.GetCustomTablesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCustomTablesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCustomTablesArgs Empty = new GetCustomTablesArgs();

    /**
     * The compartment ID in which to list resources.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The compartment ID in which to list resources.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    @Import(name="filters")
    private @Nullable List<GetCustomTablesFilter> filters;

    public Optional<List<GetCustomTablesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The saved report ID in which to list resources.
     * 
     */
    @Import(name="savedReportId", required=true)
    private String savedReportId;

    /**
     * @return The saved report ID in which to list resources.
     * 
     */
    public String savedReportId() {
        return this.savedReportId;
    }

    private GetCustomTablesArgs() {}

    private GetCustomTablesArgs(GetCustomTablesArgs $) {
        this.compartmentId = $.compartmentId;
        this.filters = $.filters;
        this.savedReportId = $.savedReportId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCustomTablesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCustomTablesArgs $;

        public Builder() {
            $ = new GetCustomTablesArgs();
        }

        public Builder(GetCustomTablesArgs defaults) {
            $ = new GetCustomTablesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The compartment ID in which to list resources.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        public Builder filters(@Nullable List<GetCustomTablesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetCustomTablesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param savedReportId The saved report ID in which to list resources.
         * 
         * @return builder
         * 
         */
        public Builder savedReportId(String savedReportId) {
            $.savedReportId = savedReportId;
            return this;
        }

        public GetCustomTablesArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            $.savedReportId = Objects.requireNonNull($.savedReportId, "expected parameter 'savedReportId' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Core.inputs.GetDrgRouteTablesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDrgRouteTablesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDrgRouteTablesArgs Empty = new GetDrgRouteTablesArgs();

    /**
     * A filter to return only resources that match the given display name exactly.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A filter to return only resources that match the given display name exactly.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG.
     * 
     */
    @Import(name="drgId", required=true)
    private String drgId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG.
     * 
     */
    public String drgId() {
        return this.drgId;
    }

    @Import(name="filters")
    private @Nullable List<GetDrgRouteTablesFilter> filters;

    public Optional<List<GetDrgRouteTablesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the import route distribution.
     * 
     */
    @Import(name="importDrgRouteDistributionId")
    private @Nullable String importDrgRouteDistributionId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the import route distribution.
     * 
     */
    public Optional<String> importDrgRouteDistributionId() {
        return Optional.ofNullable(this.importDrgRouteDistributionId);
    }

    /**
     * A filter that only returns matches for the specified lifecycle state. The value is case insensitive.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return A filter that only returns matches for the specified lifecycle state. The value is case insensitive.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetDrgRouteTablesArgs() {}

    private GetDrgRouteTablesArgs(GetDrgRouteTablesArgs $) {
        this.displayName = $.displayName;
        this.drgId = $.drgId;
        this.filters = $.filters;
        this.importDrgRouteDistributionId = $.importDrgRouteDistributionId;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDrgRouteTablesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDrgRouteTablesArgs $;

        public Builder() {
            $ = new GetDrgRouteTablesArgs();
        }

        public Builder(GetDrgRouteTablesArgs defaults) {
            $ = new GetDrgRouteTablesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName A filter to return only resources that match the given display name exactly.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param drgId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG.
         * 
         * @return builder
         * 
         */
        public Builder drgId(String drgId) {
            $.drgId = drgId;
            return this;
        }

        public Builder filters(@Nullable List<GetDrgRouteTablesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetDrgRouteTablesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param importDrgRouteDistributionId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the import route distribution.
         * 
         * @return builder
         * 
         */
        public Builder importDrgRouteDistributionId(@Nullable String importDrgRouteDistributionId) {
            $.importDrgRouteDistributionId = importDrgRouteDistributionId;
            return this;
        }

        /**
         * @param state A filter that only returns matches for the specified lifecycle state. The value is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetDrgRouteTablesArgs build() {
            $.drgId = Objects.requireNonNull($.drgId, "expected parameter 'drgId' to be non-null");
            return $;
        }
    }

}

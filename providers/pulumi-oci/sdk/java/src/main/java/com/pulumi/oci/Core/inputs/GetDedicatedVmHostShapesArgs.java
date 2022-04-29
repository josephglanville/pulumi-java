// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Core.inputs.GetDedicatedVmHostShapesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDedicatedVmHostShapesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDedicatedVmHostShapesArgs Empty = new GetDedicatedVmHostShapesArgs();

    /**
     * The name of the availability domain.  Example: `Uocm:PHX-AD-1`
     * 
     */
    @Import(name="availabilityDomain")
    private @Nullable String availabilityDomain;

    /**
     * @return The name of the availability domain.  Example: `Uocm:PHX-AD-1`
     * 
     */
    public Optional<String> availabilityDomain() {
        return Optional.ofNullable(this.availabilityDomain);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    @Import(name="filters")
    private @Nullable List<GetDedicatedVmHostShapesFilter> filters;

    public Optional<List<GetDedicatedVmHostShapesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The name for the instance&#39;s shape.
     * 
     */
    @Import(name="instanceShapeName")
    private @Nullable String instanceShapeName;

    /**
     * @return The name for the instance&#39;s shape.
     * 
     */
    public Optional<String> instanceShapeName() {
        return Optional.ofNullable(this.instanceShapeName);
    }

    private GetDedicatedVmHostShapesArgs() {}

    private GetDedicatedVmHostShapesArgs(GetDedicatedVmHostShapesArgs $) {
        this.availabilityDomain = $.availabilityDomain;
        this.compartmentId = $.compartmentId;
        this.filters = $.filters;
        this.instanceShapeName = $.instanceShapeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDedicatedVmHostShapesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDedicatedVmHostShapesArgs $;

        public Builder() {
            $ = new GetDedicatedVmHostShapesArgs();
        }

        public Builder(GetDedicatedVmHostShapesArgs defaults) {
            $ = new GetDedicatedVmHostShapesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param availabilityDomain The name of the availability domain.  Example: `Uocm:PHX-AD-1`
         * 
         * @return builder
         * 
         */
        public Builder availabilityDomain(@Nullable String availabilityDomain) {
            $.availabilityDomain = availabilityDomain;
            return this;
        }

        /**
         * @param compartmentId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        public Builder filters(@Nullable List<GetDedicatedVmHostShapesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetDedicatedVmHostShapesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param instanceShapeName The name for the instance&#39;s shape.
         * 
         * @return builder
         * 
         */
        public Builder instanceShapeName(@Nullable String instanceShapeName) {
            $.instanceShapeName = instanceShapeName;
            return this;
        }

        public GetDedicatedVmHostShapesArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}

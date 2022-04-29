// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Ocvp.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Ocvp.inputs.GetSddcsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSddcsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSddcsArgs Empty = new GetSddcsArgs();

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

    /**
     * The name of the availability domain that the Compute instances are running in.  Example: `Uocm:PHX-AD-1`
     * 
     */
    @Import(name="computeAvailabilityDomain")
    private @Nullable String computeAvailabilityDomain;

    /**
     * @return The name of the availability domain that the Compute instances are running in.  Example: `Uocm:PHX-AD-1`
     * 
     */
    public Optional<String> computeAvailabilityDomain() {
        return Optional.ofNullable(this.computeAvailabilityDomain);
    }

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

    @Import(name="filters")
    private @Nullable List<GetSddcsFilter> filters;

    public Optional<List<GetSddcsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The lifecycle state of the resource.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return The lifecycle state of the resource.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetSddcsArgs() {}

    private GetSddcsArgs(GetSddcsArgs $) {
        this.compartmentId = $.compartmentId;
        this.computeAvailabilityDomain = $.computeAvailabilityDomain;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSddcsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSddcsArgs $;

        public Builder() {
            $ = new GetSddcsArgs();
        }

        public Builder(GetSddcsArgs defaults) {
            $ = new GetSddcsArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param computeAvailabilityDomain The name of the availability domain that the Compute instances are running in.  Example: `Uocm:PHX-AD-1`
         * 
         * @return builder
         * 
         */
        public Builder computeAvailabilityDomain(@Nullable String computeAvailabilityDomain) {
            $.computeAvailabilityDomain = computeAvailabilityDomain;
            return this;
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

        public Builder filters(@Nullable List<GetSddcsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetSddcsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param state The lifecycle state of the resource.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetSddcsArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}

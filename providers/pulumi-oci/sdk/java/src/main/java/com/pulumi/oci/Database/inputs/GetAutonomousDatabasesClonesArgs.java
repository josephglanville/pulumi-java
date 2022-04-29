// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Database.inputs.GetAutonomousDatabasesClonesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAutonomousDatabasesClonesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAutonomousDatabasesClonesArgs Empty = new GetAutonomousDatabasesClonesArgs();

    /**
     * The database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="autonomousDatabaseId", required=true)
    private String autonomousDatabaseId;

    /**
     * @return The database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String autonomousDatabaseId() {
        return this.autonomousDatabaseId;
    }

    /**
     * A filter to return only resources that match the given clone type exactly.
     * 
     */
    @Import(name="cloneType")
    private @Nullable String cloneType;

    /**
     * @return A filter to return only resources that match the given clone type exactly.
     * 
     */
    public Optional<String> cloneType() {
        return Optional.ofNullable(this.cloneType);
    }

    /**
     * The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * A filter to return only resources that match the entire display name given. The match is not case sensitive.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A filter to return only resources that match the entire display name given. The match is not case sensitive.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetAutonomousDatabasesClonesFilter> filters;

    public Optional<List<GetAutonomousDatabasesClonesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to return only resources that match the given lifecycle state exactly.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return A filter to return only resources that match the given lifecycle state exactly.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetAutonomousDatabasesClonesArgs() {}

    private GetAutonomousDatabasesClonesArgs(GetAutonomousDatabasesClonesArgs $) {
        this.autonomousDatabaseId = $.autonomousDatabaseId;
        this.cloneType = $.cloneType;
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAutonomousDatabasesClonesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAutonomousDatabasesClonesArgs $;

        public Builder() {
            $ = new GetAutonomousDatabasesClonesArgs();
        }

        public Builder(GetAutonomousDatabasesClonesArgs defaults) {
            $ = new GetAutonomousDatabasesClonesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autonomousDatabaseId The database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder autonomousDatabaseId(String autonomousDatabaseId) {
            $.autonomousDatabaseId = autonomousDatabaseId;
            return this;
        }

        /**
         * @param cloneType A filter to return only resources that match the given clone type exactly.
         * 
         * @return builder
         * 
         */
        public Builder cloneType(@Nullable String cloneType) {
            $.cloneType = cloneType;
            return this;
        }

        /**
         * @param compartmentId The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param displayName A filter to return only resources that match the entire display name given. The match is not case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetAutonomousDatabasesClonesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetAutonomousDatabasesClonesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param state A filter to return only resources that match the given lifecycle state exactly.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetAutonomousDatabasesClonesArgs build() {
            $.autonomousDatabaseId = Objects.requireNonNull($.autonomousDatabaseId, "expected parameter 'autonomousDatabaseId' to be non-null");
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}

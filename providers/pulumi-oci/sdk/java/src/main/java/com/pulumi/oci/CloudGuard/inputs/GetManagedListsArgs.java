// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CloudGuard.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.CloudGuard.inputs.GetManagedListsFilter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetManagedListsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagedListsArgs Empty = new GetManagedListsArgs();

    /**
     * Valid values are `RESTRICTED` and `ACCESSIBLE`. Default is `RESTRICTED`. Setting this to `ACCESSIBLE` returns only those compartments for which the user has INSPECT permissions directly or indirectly (permissions can be on a resource in a subcompartment). When set to `RESTRICTED` permissions are checked and no partial results are displayed.
     * 
     */
    @Import(name="accessLevel")
    private @Nullable String accessLevel;

    /**
     * @return Valid values are `RESTRICTED` and `ACCESSIBLE`. Default is `RESTRICTED`. Setting this to `ACCESSIBLE` returns only those compartments for which the user has INSPECT permissions directly or indirectly (permissions can be on a resource in a subcompartment). When set to `RESTRICTED` permissions are checked and no partial results are displayed.
     * 
     */
    public Optional<String> accessLevel() {
        return Optional.ofNullable(this.accessLevel);
    }

    /**
     * The ID of the compartment in which to list resources.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The ID of the compartment in which to list resources.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * Default is false. When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned depending on the the setting of `accessLevel`.
     * 
     */
    @Import(name="compartmentIdInSubtree")
    private @Nullable Boolean compartmentIdInSubtree;

    /**
     * @return Default is false. When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned depending on the the setting of `accessLevel`.
     * 
     */
    public Optional<Boolean> compartmentIdInSubtree() {
        return Optional.ofNullable(this.compartmentIdInSubtree);
    }

    /**
     * A filter to return only resources that match the entire display name given.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A filter to return only resources that match the entire display name given.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetManagedListsFilter> filters;

    public Optional<List<GetManagedListsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The type of the ManagedList.
     * 
     */
    @Import(name="listType")
    private @Nullable String listType;

    /**
     * @return The type of the ManagedList.
     * 
     */
    public Optional<String> listType() {
        return Optional.ofNullable(this.listType);
    }

    /**
     * Default is false. When set to true, the list of all Oracle Managed Resources Metadata supported by Cloud Guard are returned.
     * 
     */
    @Import(name="resourceMetadataOnly")
    private @Nullable Boolean resourceMetadataOnly;

    /**
     * @return Default is false. When set to true, the list of all Oracle Managed Resources Metadata supported by Cloud Guard are returned.
     * 
     */
    public Optional<Boolean> resourceMetadataOnly() {
        return Optional.ofNullable(this.resourceMetadataOnly);
    }

    /**
     * The field life cycle state. Only one state can be provided. Default value for state is active. If no value is specified state is active.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return The field life cycle state. Only one state can be provided. Default value for state is active. If no value is specified state is active.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetManagedListsArgs() {}

    private GetManagedListsArgs(GetManagedListsArgs $) {
        this.accessLevel = $.accessLevel;
        this.compartmentId = $.compartmentId;
        this.compartmentIdInSubtree = $.compartmentIdInSubtree;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.listType = $.listType;
        this.resourceMetadataOnly = $.resourceMetadataOnly;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagedListsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagedListsArgs $;

        public Builder() {
            $ = new GetManagedListsArgs();
        }

        public Builder(GetManagedListsArgs defaults) {
            $ = new GetManagedListsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessLevel Valid values are `RESTRICTED` and `ACCESSIBLE`. Default is `RESTRICTED`. Setting this to `ACCESSIBLE` returns only those compartments for which the user has INSPECT permissions directly or indirectly (permissions can be on a resource in a subcompartment). When set to `RESTRICTED` permissions are checked and no partial results are displayed.
         * 
         * @return builder
         * 
         */
        public Builder accessLevel(@Nullable String accessLevel) {
            $.accessLevel = accessLevel;
            return this;
        }

        /**
         * @param compartmentId The ID of the compartment in which to list resources.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentIdInSubtree Default is false. When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned depending on the the setting of `accessLevel`.
         * 
         * @return builder
         * 
         */
        public Builder compartmentIdInSubtree(@Nullable Boolean compartmentIdInSubtree) {
            $.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        /**
         * @param displayName A filter to return only resources that match the entire display name given.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetManagedListsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetManagedListsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param listType The type of the ManagedList.
         * 
         * @return builder
         * 
         */
        public Builder listType(@Nullable String listType) {
            $.listType = listType;
            return this;
        }

        /**
         * @param resourceMetadataOnly Default is false. When set to true, the list of all Oracle Managed Resources Metadata supported by Cloud Guard are returned.
         * 
         * @return builder
         * 
         */
        public Builder resourceMetadataOnly(@Nullable Boolean resourceMetadataOnly) {
            $.resourceMetadataOnly = resourceMetadataOnly;
            return this;
        }

        /**
         * @param state The field life cycle state. Only one state can be provided. Default value for state is active. If no value is specified state is active.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetManagedListsArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}

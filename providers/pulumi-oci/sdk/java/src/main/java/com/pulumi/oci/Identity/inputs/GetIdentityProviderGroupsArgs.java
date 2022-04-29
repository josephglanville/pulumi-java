// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Identity.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Identity.inputs.GetIdentityProviderGroupsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIdentityProviderGroupsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIdentityProviderGroupsArgs Empty = new GetIdentityProviderGroupsArgs();

    @Import(name="filters")
    private @Nullable List<GetIdentityProviderGroupsFilter> filters;

    public Optional<List<GetIdentityProviderGroupsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The OCID of the identity provider.
     * 
     */
    @Import(name="identityProviderId", required=true)
    private String identityProviderId;

    /**
     * @return The OCID of the identity provider.
     * 
     */
    public String identityProviderId() {
        return this.identityProviderId;
    }

    /**
     * A filter to only return resources that match the given name exactly.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return A filter to only return resources that match the given name exactly.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A filter to only return resources that match the given lifecycle state.  The state value is case-insensitive.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return A filter to only return resources that match the given lifecycle state.  The state value is case-insensitive.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetIdentityProviderGroupsArgs() {}

    private GetIdentityProviderGroupsArgs(GetIdentityProviderGroupsArgs $) {
        this.filters = $.filters;
        this.identityProviderId = $.identityProviderId;
        this.name = $.name;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIdentityProviderGroupsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIdentityProviderGroupsArgs $;

        public Builder() {
            $ = new GetIdentityProviderGroupsArgs();
        }

        public Builder(GetIdentityProviderGroupsArgs defaults) {
            $ = new GetIdentityProviderGroupsArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable List<GetIdentityProviderGroupsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetIdentityProviderGroupsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param identityProviderId The OCID of the identity provider.
         * 
         * @return builder
         * 
         */
        public Builder identityProviderId(String identityProviderId) {
            $.identityProviderId = identityProviderId;
            return this;
        }

        /**
         * @param name A filter to only return resources that match the given name exactly.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param state A filter to only return resources that match the given lifecycle state.  The state value is case-insensitive.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetIdentityProviderGroupsArgs build() {
            $.identityProviderId = Objects.requireNonNull($.identityProviderId, "expected parameter 'identityProviderId' to be non-null");
            return $;
        }
    }

}

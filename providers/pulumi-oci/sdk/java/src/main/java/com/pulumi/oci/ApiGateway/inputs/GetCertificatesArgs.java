// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApiGateway.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.ApiGateway.inputs.GetCertificatesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCertificatesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCertificatesArgs Empty = new GetCertificatesArgs();

    /**
     * The ocid of the compartment in which to list resources.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The ocid of the compartment in which to list resources.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it&#39;s changeable.  Example: `My new resource`
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A user-friendly name. Does not have to be unique, and it&#39;s changeable.  Example: `My new resource`
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetCertificatesFilter> filters;

    public Optional<List<GetCertificatesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to return only resources that match the given lifecycle state.  Example: `ACTIVE` or `DELETED`
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return A filter to return only resources that match the given lifecycle state.  Example: `ACTIVE` or `DELETED`
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetCertificatesArgs() {}

    private GetCertificatesArgs(GetCertificatesArgs $) {
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCertificatesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCertificatesArgs $;

        public Builder() {
            $ = new GetCertificatesArgs();
        }

        public Builder(GetCertificatesArgs defaults) {
            $ = new GetCertificatesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The ocid of the compartment in which to list resources.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param displayName A user-friendly name. Does not have to be unique, and it&#39;s changeable.  Example: `My new resource`
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetCertificatesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetCertificatesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param state A filter to return only resources that match the given lifecycle state.  Example: `ACTIVE` or `DELETED`
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetCertificatesArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}

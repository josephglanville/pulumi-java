// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Kms.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Kms.inputs.GetKeyVersionsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetKeyVersionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKeyVersionsArgs Empty = new GetKeyVersionsArgs();

    @Import(name="filters")
    private @Nullable List<GetKeyVersionsFilter> filters;

    public Optional<List<GetKeyVersionsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The OCID of the key.
     * 
     */
    @Import(name="keyId", required=true)
    private String keyId;

    /**
     * @return The OCID of the key.
     * 
     */
    public String keyId() {
        return this.keyId;
    }

    /**
     * The service endpoint to perform management operations against. Management operations include &#39;Create,&#39; &#39;Update,&#39; &#39;List,&#39; &#39;Get,&#39; and &#39;Delete&#39; operations. See Vault Management endpoint.
     * 
     */
    @Import(name="managementEndpoint", required=true)
    private String managementEndpoint;

    /**
     * @return The service endpoint to perform management operations against. Management operations include &#39;Create,&#39; &#39;Update,&#39; &#39;List,&#39; &#39;Get,&#39; and &#39;Delete&#39; operations. See Vault Management endpoint.
     * 
     */
    public String managementEndpoint() {
        return this.managementEndpoint;
    }

    private GetKeyVersionsArgs() {}

    private GetKeyVersionsArgs(GetKeyVersionsArgs $) {
        this.filters = $.filters;
        this.keyId = $.keyId;
        this.managementEndpoint = $.managementEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKeyVersionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKeyVersionsArgs $;

        public Builder() {
            $ = new GetKeyVersionsArgs();
        }

        public Builder(GetKeyVersionsArgs defaults) {
            $ = new GetKeyVersionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable List<GetKeyVersionsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetKeyVersionsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param keyId The OCID of the key.
         * 
         * @return builder
         * 
         */
        public Builder keyId(String keyId) {
            $.keyId = keyId;
            return this;
        }

        /**
         * @param managementEndpoint The service endpoint to perform management operations against. Management operations include &#39;Create,&#39; &#39;Update,&#39; &#39;List,&#39; &#39;Get,&#39; and &#39;Delete&#39; operations. See Vault Management endpoint.
         * 
         * @return builder
         * 
         */
        public Builder managementEndpoint(String managementEndpoint) {
            $.managementEndpoint = managementEndpoint;
            return this;
        }

        public GetKeyVersionsArgs build() {
            $.keyId = Objects.requireNonNull($.keyId, "expected parameter 'keyId' to be non-null");
            $.managementEndpoint = Objects.requireNonNull($.managementEndpoint, "expected parameter 'managementEndpoint' to be non-null");
            return $;
        }
    }

}

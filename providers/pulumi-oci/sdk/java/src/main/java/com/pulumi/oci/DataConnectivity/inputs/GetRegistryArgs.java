// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataConnectivity.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRegistryArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegistryArgs Empty = new GetRegistryArgs();

    /**
     * The registry Ocid.
     * 
     */
    @Import(name="registryId", required=true)
    private String registryId;

    /**
     * @return The registry Ocid.
     * 
     */
    public String registryId() {
        return this.registryId;
    }

    private GetRegistryArgs() {}

    private GetRegistryArgs(GetRegistryArgs $) {
        this.registryId = $.registryId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegistryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegistryArgs $;

        public Builder() {
            $ = new GetRegistryArgs();
        }

        public Builder(GetRegistryArgs defaults) {
            $ = new GetRegistryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param registryId The registry Ocid.
         * 
         * @return builder
         * 
         */
        public Builder registryId(String registryId) {
            $.registryId = registryId;
            return this;
        }

        public GetRegistryArgs build() {
            $.registryId = Objects.requireNonNull($.registryId, "expected parameter 'registryId' to be non-null");
            return $;
        }
    }

}

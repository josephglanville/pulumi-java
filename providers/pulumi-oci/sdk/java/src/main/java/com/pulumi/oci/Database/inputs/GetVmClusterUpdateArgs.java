// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVmClusterUpdateArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVmClusterUpdateArgs Empty = new GetVmClusterUpdateArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the maintenance update.
     * 
     */
    @Import(name="updateId", required=true)
    private String updateId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the maintenance update.
     * 
     */
    public String updateId() {
        return this.updateId;
    }

    /**
     * The VM cluster [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="vmClusterId", required=true)
    private String vmClusterId;

    /**
     * @return The VM cluster [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String vmClusterId() {
        return this.vmClusterId;
    }

    private GetVmClusterUpdateArgs() {}

    private GetVmClusterUpdateArgs(GetVmClusterUpdateArgs $) {
        this.updateId = $.updateId;
        this.vmClusterId = $.vmClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVmClusterUpdateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVmClusterUpdateArgs $;

        public Builder() {
            $ = new GetVmClusterUpdateArgs();
        }

        public Builder(GetVmClusterUpdateArgs defaults) {
            $ = new GetVmClusterUpdateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param updateId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the maintenance update.
         * 
         * @return builder
         * 
         */
        public Builder updateId(String updateId) {
            $.updateId = updateId;
            return this;
        }

        /**
         * @param vmClusterId The VM cluster [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder vmClusterId(String vmClusterId) {
            $.vmClusterId = vmClusterId;
            return this;
        }

        public GetVmClusterUpdateArgs build() {
            $.updateId = Objects.requireNonNull($.updateId, "expected parameter 'updateId' to be non-null");
            $.vmClusterId = Objects.requireNonNull($.vmClusterId, "expected parameter 'vmClusterId' to be non-null");
            return $;
        }
    }

}

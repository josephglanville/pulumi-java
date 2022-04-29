// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkSecurityGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkSecurityGroupArgs Empty = new GetNetworkSecurityGroupArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network security group.
     * 
     */
    @Import(name="networkSecurityGroupId", required=true)
    private String networkSecurityGroupId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network security group.
     * 
     */
    public String networkSecurityGroupId() {
        return this.networkSecurityGroupId;
    }

    private GetNetworkSecurityGroupArgs() {}

    private GetNetworkSecurityGroupArgs(GetNetworkSecurityGroupArgs $) {
        this.networkSecurityGroupId = $.networkSecurityGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkSecurityGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkSecurityGroupArgs $;

        public Builder() {
            $ = new GetNetworkSecurityGroupArgs();
        }

        public Builder(GetNetworkSecurityGroupArgs defaults) {
            $ = new GetNetworkSecurityGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkSecurityGroupId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network security group.
         * 
         * @return builder
         * 
         */
        public Builder networkSecurityGroupId(String networkSecurityGroupId) {
            $.networkSecurityGroupId = networkSecurityGroupId;
            return this;
        }

        public GetNetworkSecurityGroupArgs build() {
            $.networkSecurityGroupId = Objects.requireNonNull($.networkSecurityGroupId, "expected parameter 'networkSecurityGroupId' to be non-null");
            return $;
        }
    }

}

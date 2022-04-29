// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFastConnectProviderServiceKeyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFastConnectProviderServiceKeyArgs Empty = new GetFastConnectProviderServiceKeyArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the provider service.
     * 
     */
    @Import(name="providerServiceId", required=true)
    private String providerServiceId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the provider service.
     * 
     */
    public String providerServiceId() {
        return this.providerServiceId;
    }

    /**
     * The provider service key that the provider gives you when you set up a virtual circuit connection from the provider to Oracle Cloud Infrastructure. You can set up that connection and get your provider service key at the provider&#39;s website or portal. For the portal location, see the `description` attribute of the [FastConnectProviderService](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/FastConnectProviderService/).
     * 
     */
    @Import(name="providerServiceKeyName", required=true)
    private String providerServiceKeyName;

    /**
     * @return The provider service key that the provider gives you when you set up a virtual circuit connection from the provider to Oracle Cloud Infrastructure. You can set up that connection and get your provider service key at the provider&#39;s website or portal. For the portal location, see the `description` attribute of the [FastConnectProviderService](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/FastConnectProviderService/).
     * 
     */
    public String providerServiceKeyName() {
        return this.providerServiceKeyName;
    }

    private GetFastConnectProviderServiceKeyArgs() {}

    private GetFastConnectProviderServiceKeyArgs(GetFastConnectProviderServiceKeyArgs $) {
        this.providerServiceId = $.providerServiceId;
        this.providerServiceKeyName = $.providerServiceKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFastConnectProviderServiceKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFastConnectProviderServiceKeyArgs $;

        public Builder() {
            $ = new GetFastConnectProviderServiceKeyArgs();
        }

        public Builder(GetFastConnectProviderServiceKeyArgs defaults) {
            $ = new GetFastConnectProviderServiceKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param providerServiceId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the provider service.
         * 
         * @return builder
         * 
         */
        public Builder providerServiceId(String providerServiceId) {
            $.providerServiceId = providerServiceId;
            return this;
        }

        /**
         * @param providerServiceKeyName The provider service key that the provider gives you when you set up a virtual circuit connection from the provider to Oracle Cloud Infrastructure. You can set up that connection and get your provider service key at the provider&#39;s website or portal. For the portal location, see the `description` attribute of the [FastConnectProviderService](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/FastConnectProviderService/).
         * 
         * @return builder
         * 
         */
        public Builder providerServiceKeyName(String providerServiceKeyName) {
            $.providerServiceKeyName = providerServiceKeyName;
            return this;
        }

        public GetFastConnectProviderServiceKeyArgs build() {
            $.providerServiceId = Objects.requireNonNull($.providerServiceId, "expected parameter 'providerServiceId' to be non-null");
            $.providerServiceKeyName = Objects.requireNonNull($.providerServiceKeyName, "expected parameter 'providerServiceKeyName' to be non-null");
            return $;
        }
    }

}

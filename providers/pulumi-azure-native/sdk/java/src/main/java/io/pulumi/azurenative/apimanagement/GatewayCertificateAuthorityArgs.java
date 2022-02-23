// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GatewayCertificateAuthorityArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayCertificateAuthorityArgs Empty = new GatewayCertificateAuthorityArgs();

    /**
     * Identifier of the certificate entity. Must be unique in the current API Management service instance.
     * 
     */
    @InputImport(name="certificateId")
      private final @Nullable Input<String> certificateId;

    public Input<String> getCertificateId() {
        return this.certificateId == null ? Input.empty() : this.certificateId;
    }

    /**
     * Gateway entity identifier. Must be unique in the current API Management service instance. Must not have value 'managed'
     * 
     */
    @InputImport(name="gatewayId", required=true)
      private final Input<String> gatewayId;

    public Input<String> getGatewayId() {
        return this.gatewayId;
    }

    /**
     * Determines whether certificate authority is trusted.
     * 
     */
    @InputImport(name="isTrusted")
      private final @Nullable Input<Boolean> isTrusted;

    public Input<Boolean> getIsTrusted() {
        return this.isTrusted == null ? Input.empty() : this.isTrusted;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @InputImport(name="serviceName", required=true)
      private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    public GatewayCertificateAuthorityArgs(
        @Nullable Input<String> certificateId,
        Input<String> gatewayId,
        @Nullable Input<Boolean> isTrusted,
        Input<String> resourceGroupName,
        Input<String> serviceName) {
        this.certificateId = certificateId;
        this.gatewayId = Objects.requireNonNull(gatewayId, "expected parameter 'gatewayId' to be non-null");
        this.isTrusted = isTrusted;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GatewayCertificateAuthorityArgs() {
        this.certificateId = Input.empty();
        this.gatewayId = Input.empty();
        this.isTrusted = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serviceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayCertificateAuthorityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> certificateId;
        private Input<String> gatewayId;
        private @Nullable Input<Boolean> isTrusted;
        private Input<String> resourceGroupName;
        private Input<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayCertificateAuthorityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateId = defaults.certificateId;
    	      this.gatewayId = defaults.gatewayId;
    	      this.isTrusted = defaults.isTrusted;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setCertificateId(@Nullable Input<String> certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        public Builder setCertificateId(@Nullable String certificateId) {
            this.certificateId = Input.ofNullable(certificateId);
            return this;
        }

        public Builder setGatewayId(Input<String> gatewayId) {
            this.gatewayId = Objects.requireNonNull(gatewayId);
            return this;
        }

        public Builder setGatewayId(String gatewayId) {
            this.gatewayId = Input.of(Objects.requireNonNull(gatewayId));
            return this;
        }

        public Builder setIsTrusted(@Nullable Input<Boolean> isTrusted) {
            this.isTrusted = isTrusted;
            return this;
        }

        public Builder setIsTrusted(@Nullable Boolean isTrusted) {
            this.isTrusted = Input.ofNullable(isTrusted);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setServiceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }
        public GatewayCertificateAuthorityArgs build() {
            return new GatewayCertificateAuthorityArgs(certificateId, gatewayId, isTrusted, resourceGroupName, serviceName);
        }
    }
}

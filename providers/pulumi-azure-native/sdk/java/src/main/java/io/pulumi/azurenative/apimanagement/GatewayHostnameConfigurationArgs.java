// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GatewayHostnameConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayHostnameConfigurationArgs Empty = new GatewayHostnameConfigurationArgs();

    /**
     * Identifier of Certificate entity that will be used for TLS connection establishment
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
     * Gateway hostname configuration identifier. Must be unique in the scope of parent Gateway entity.
     * 
     */
    @InputImport(name="hcId")
      private final @Nullable Input<String> hcId;

    public Input<String> getHcId() {
        return this.hcId == null ? Input.empty() : this.hcId;
    }

    /**
     * Hostname value. Supports valid domain name, partial or full wildcard
     * 
     */
    @InputImport(name="hostname")
      private final @Nullable Input<String> hostname;

    public Input<String> getHostname() {
        return this.hostname == null ? Input.empty() : this.hostname;
    }

    /**
     * Specifies if HTTP/2.0 is supported
     * 
     */
    @InputImport(name="http2Enabled")
      private final @Nullable Input<Boolean> http2Enabled;

    public Input<Boolean> getHttp2Enabled() {
        return this.http2Enabled == null ? Input.empty() : this.http2Enabled;
    }

    /**
     * Determines whether gateway requests client certificate
     * 
     */
    @InputImport(name="negotiateClientCertificate")
      private final @Nullable Input<Boolean> negotiateClientCertificate;

    public Input<Boolean> getNegotiateClientCertificate() {
        return this.negotiateClientCertificate == null ? Input.empty() : this.negotiateClientCertificate;
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

    /**
     * Specifies if TLS 1.0 is supported
     * 
     */
    @InputImport(name="tls10Enabled")
      private final @Nullable Input<Boolean> tls10Enabled;

    public Input<Boolean> getTls10Enabled() {
        return this.tls10Enabled == null ? Input.empty() : this.tls10Enabled;
    }

    /**
     * Specifies if TLS 1.1 is supported
     * 
     */
    @InputImport(name="tls11Enabled")
      private final @Nullable Input<Boolean> tls11Enabled;

    public Input<Boolean> getTls11Enabled() {
        return this.tls11Enabled == null ? Input.empty() : this.tls11Enabled;
    }

    public GatewayHostnameConfigurationArgs(
        @Nullable Input<String> certificateId,
        Input<String> gatewayId,
        @Nullable Input<String> hcId,
        @Nullable Input<String> hostname,
        @Nullable Input<Boolean> http2Enabled,
        @Nullable Input<Boolean> negotiateClientCertificate,
        Input<String> resourceGroupName,
        Input<String> serviceName,
        @Nullable Input<Boolean> tls10Enabled,
        @Nullable Input<Boolean> tls11Enabled) {
        this.certificateId = certificateId;
        this.gatewayId = Objects.requireNonNull(gatewayId, "expected parameter 'gatewayId' to be non-null");
        this.hcId = hcId;
        this.hostname = hostname;
        this.http2Enabled = http2Enabled;
        this.negotiateClientCertificate = negotiateClientCertificate;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.tls10Enabled = tls10Enabled;
        this.tls11Enabled = tls11Enabled;
    }

    private GatewayHostnameConfigurationArgs() {
        this.certificateId = Input.empty();
        this.gatewayId = Input.empty();
        this.hcId = Input.empty();
        this.hostname = Input.empty();
        this.http2Enabled = Input.empty();
        this.negotiateClientCertificate = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serviceName = Input.empty();
        this.tls10Enabled = Input.empty();
        this.tls11Enabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayHostnameConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> certificateId;
        private Input<String> gatewayId;
        private @Nullable Input<String> hcId;
        private @Nullable Input<String> hostname;
        private @Nullable Input<Boolean> http2Enabled;
        private @Nullable Input<Boolean> negotiateClientCertificate;
        private Input<String> resourceGroupName;
        private Input<String> serviceName;
        private @Nullable Input<Boolean> tls10Enabled;
        private @Nullable Input<Boolean> tls11Enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayHostnameConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateId = defaults.certificateId;
    	      this.gatewayId = defaults.gatewayId;
    	      this.hcId = defaults.hcId;
    	      this.hostname = defaults.hostname;
    	      this.http2Enabled = defaults.http2Enabled;
    	      this.negotiateClientCertificate = defaults.negotiateClientCertificate;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.tls10Enabled = defaults.tls10Enabled;
    	      this.tls11Enabled = defaults.tls11Enabled;
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

        public Builder setHcId(@Nullable Input<String> hcId) {
            this.hcId = hcId;
            return this;
        }

        public Builder setHcId(@Nullable String hcId) {
            this.hcId = Input.ofNullable(hcId);
            return this;
        }

        public Builder setHostname(@Nullable Input<String> hostname) {
            this.hostname = hostname;
            return this;
        }

        public Builder setHostname(@Nullable String hostname) {
            this.hostname = Input.ofNullable(hostname);
            return this;
        }

        public Builder setHttp2Enabled(@Nullable Input<Boolean> http2Enabled) {
            this.http2Enabled = http2Enabled;
            return this;
        }

        public Builder setHttp2Enabled(@Nullable Boolean http2Enabled) {
            this.http2Enabled = Input.ofNullable(http2Enabled);
            return this;
        }

        public Builder setNegotiateClientCertificate(@Nullable Input<Boolean> negotiateClientCertificate) {
            this.negotiateClientCertificate = negotiateClientCertificate;
            return this;
        }

        public Builder setNegotiateClientCertificate(@Nullable Boolean negotiateClientCertificate) {
            this.negotiateClientCertificate = Input.ofNullable(negotiateClientCertificate);
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

        public Builder setTls10Enabled(@Nullable Input<Boolean> tls10Enabled) {
            this.tls10Enabled = tls10Enabled;
            return this;
        }

        public Builder setTls10Enabled(@Nullable Boolean tls10Enabled) {
            this.tls10Enabled = Input.ofNullable(tls10Enabled);
            return this;
        }

        public Builder setTls11Enabled(@Nullable Input<Boolean> tls11Enabled) {
            this.tls11Enabled = tls11Enabled;
            return this;
        }

        public Builder setTls11Enabled(@Nullable Boolean tls11Enabled) {
            this.tls11Enabled = Input.ofNullable(tls11Enabled);
            return this;
        }
        public GatewayHostnameConfigurationArgs build() {
            return new GatewayHostnameConfigurationArgs(certificateId, gatewayId, hcId, hostname, http2Enabled, negotiateClientCertificate, resourceGroupName, serviceName, tls10Enabled, tls11Enabled);
        }
    }
}

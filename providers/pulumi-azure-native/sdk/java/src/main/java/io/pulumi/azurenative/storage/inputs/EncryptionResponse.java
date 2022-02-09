// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.inputs.EncryptionIdentityResponse;
import io.pulumi.azurenative.storage.inputs.EncryptionServicesResponse;
import io.pulumi.azurenative.storage.inputs.KeyVaultPropertiesResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EncryptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final EncryptionResponse Empty = new EncryptionResponse();

    @InputImport(name="encryptionIdentity")
    private final @Nullable EncryptionIdentityResponse encryptionIdentity;

    public Optional<EncryptionIdentityResponse> getEncryptionIdentity() {
        return this.encryptionIdentity == null ? Optional.empty() : Optional.ofNullable(this.encryptionIdentity);
    }

    @InputImport(name="keySource", required=true)
    private final String keySource;

    public String getKeySource() {
        return this.keySource;
    }

    @InputImport(name="keyVaultProperties")
    private final @Nullable KeyVaultPropertiesResponse keyVaultProperties;

    public Optional<KeyVaultPropertiesResponse> getKeyVaultProperties() {
        return this.keyVaultProperties == null ? Optional.empty() : Optional.ofNullable(this.keyVaultProperties);
    }

    @InputImport(name="requireInfrastructureEncryption")
    private final @Nullable Boolean requireInfrastructureEncryption;

    public Optional<Boolean> getRequireInfrastructureEncryption() {
        return this.requireInfrastructureEncryption == null ? Optional.empty() : Optional.ofNullable(this.requireInfrastructureEncryption);
    }

    @InputImport(name="services")
    private final @Nullable EncryptionServicesResponse services;

    public Optional<EncryptionServicesResponse> getServices() {
        return this.services == null ? Optional.empty() : Optional.ofNullable(this.services);
    }

    public EncryptionResponse(
        @Nullable EncryptionIdentityResponse encryptionIdentity,
        String keySource,
        @Nullable KeyVaultPropertiesResponse keyVaultProperties,
        @Nullable Boolean requireInfrastructureEncryption,
        @Nullable EncryptionServicesResponse services) {
        this.encryptionIdentity = encryptionIdentity;
        this.keySource = keySource == null ? "Microsoft.Storage" : Objects.requireNonNull(keySource, "expected parameter 'keySource' to be non-null");
        this.keyVaultProperties = keyVaultProperties;
        this.requireInfrastructureEncryption = requireInfrastructureEncryption;
        this.services = services;
    }

    private EncryptionResponse() {
        this.encryptionIdentity = null;
        this.keySource = null;
        this.keyVaultProperties = null;
        this.requireInfrastructureEncryption = null;
        this.services = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EncryptionIdentityResponse encryptionIdentity;
        private String keySource;
        private @Nullable KeyVaultPropertiesResponse keyVaultProperties;
        private @Nullable Boolean requireInfrastructureEncryption;
        private @Nullable EncryptionServicesResponse services;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionIdentity = defaults.encryptionIdentity;
    	      this.keySource = defaults.keySource;
    	      this.keyVaultProperties = defaults.keyVaultProperties;
    	      this.requireInfrastructureEncryption = defaults.requireInfrastructureEncryption;
    	      this.services = defaults.services;
        }

        public Builder setEncryptionIdentity(@Nullable EncryptionIdentityResponse encryptionIdentity) {
            this.encryptionIdentity = encryptionIdentity;
            return this;
        }

        public Builder setKeySource(String keySource) {
            this.keySource = Objects.requireNonNull(keySource);
            return this;
        }

        public Builder setKeyVaultProperties(@Nullable KeyVaultPropertiesResponse keyVaultProperties) {
            this.keyVaultProperties = keyVaultProperties;
            return this;
        }

        public Builder setRequireInfrastructureEncryption(@Nullable Boolean requireInfrastructureEncryption) {
            this.requireInfrastructureEncryption = requireInfrastructureEncryption;
            return this;
        }

        public Builder setServices(@Nullable EncryptionServicesResponse services) {
            this.services = services;
            return this;
        }

        public EncryptionResponse build() {
            return new EncryptionResponse(encryptionIdentity, keySource, keyVaultProperties, requireInfrastructureEncryption, services);
        }
    }
}

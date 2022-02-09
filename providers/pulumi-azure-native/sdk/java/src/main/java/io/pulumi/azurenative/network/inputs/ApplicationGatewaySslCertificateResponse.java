// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationGatewaySslCertificateResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationGatewaySslCertificateResponse Empty = new ApplicationGatewaySslCertificateResponse();

    @InputImport(name="data")
    private final @Nullable String data;

    public Optional<String> getData() {
        return this.data == null ? Optional.empty() : Optional.ofNullable(this.data);
    }

    @InputImport(name="etag", required=true)
    private final String etag;

    public String getEtag() {
        return this.etag;
    }

    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    @InputImport(name="keyVaultSecretId")
    private final @Nullable String keyVaultSecretId;

    public Optional<String> getKeyVaultSecretId() {
        return this.keyVaultSecretId == null ? Optional.empty() : Optional.ofNullable(this.keyVaultSecretId);
    }

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @InputImport(name="password")
    private final @Nullable String password;

    public Optional<String> getPassword() {
        return this.password == null ? Optional.empty() : Optional.ofNullable(this.password);
    }

    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    @InputImport(name="publicCertData", required=true)
    private final String publicCertData;

    public String getPublicCertData() {
        return this.publicCertData;
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public ApplicationGatewaySslCertificateResponse(
        @Nullable String data,
        String etag,
        @Nullable String id,
        @Nullable String keyVaultSecretId,
        @Nullable String name,
        @Nullable String password,
        String provisioningState,
        String publicCertData,
        String type) {
        this.data = data;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = id;
        this.keyVaultSecretId = keyVaultSecretId;
        this.name = name;
        this.password = password;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.publicCertData = Objects.requireNonNull(publicCertData, "expected parameter 'publicCertData' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ApplicationGatewaySslCertificateResponse() {
        this.data = null;
        this.etag = null;
        this.id = null;
        this.keyVaultSecretId = null;
        this.name = null;
        this.password = null;
        this.provisioningState = null;
        this.publicCertData = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewaySslCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String data;
        private String etag;
        private @Nullable String id;
        private @Nullable String keyVaultSecretId;
        private @Nullable String name;
        private @Nullable String password;
        private String provisioningState;
        private String publicCertData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewaySslCertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.keyVaultSecretId = defaults.keyVaultSecretId;
    	      this.name = defaults.name;
    	      this.password = defaults.password;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicCertData = defaults.publicCertData;
    	      this.type = defaults.type;
        }

        public Builder setData(@Nullable String data) {
            this.data = data;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setKeyVaultSecretId(@Nullable String keyVaultSecretId) {
            this.keyVaultSecretId = keyVaultSecretId;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublicCertData(String publicCertData) {
            this.publicCertData = Objects.requireNonNull(publicCertData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public ApplicationGatewaySslCertificateResponse build() {
            return new ApplicationGatewaySslCertificateResponse(data, etag, id, keyVaultSecretId, name, password, provisioningState, publicCertData, type);
        }
    }
}

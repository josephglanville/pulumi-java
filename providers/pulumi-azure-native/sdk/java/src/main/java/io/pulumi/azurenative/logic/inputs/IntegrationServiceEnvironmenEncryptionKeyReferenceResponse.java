// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.ResourceReferenceResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationServiceEnvironmenEncryptionKeyReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final IntegrationServiceEnvironmenEncryptionKeyReferenceResponse Empty = new IntegrationServiceEnvironmenEncryptionKeyReferenceResponse();

    @InputImport(name="keyName")
    private final @Nullable String keyName;

    public Optional<String> getKeyName() {
        return this.keyName == null ? Optional.empty() : Optional.ofNullable(this.keyName);
    }

    @InputImport(name="keyVault")
    private final @Nullable ResourceReferenceResponse keyVault;

    public Optional<ResourceReferenceResponse> getKeyVault() {
        return this.keyVault == null ? Optional.empty() : Optional.ofNullable(this.keyVault);
    }

    @InputImport(name="keyVersion")
    private final @Nullable String keyVersion;

    public Optional<String> getKeyVersion() {
        return this.keyVersion == null ? Optional.empty() : Optional.ofNullable(this.keyVersion);
    }

    public IntegrationServiceEnvironmenEncryptionKeyReferenceResponse(
        @Nullable String keyName,
        @Nullable ResourceReferenceResponse keyVault,
        @Nullable String keyVersion) {
        this.keyName = keyName;
        this.keyVault = keyVault;
        this.keyVersion = keyVersion;
    }

    private IntegrationServiceEnvironmenEncryptionKeyReferenceResponse() {
        this.keyName = null;
        this.keyVault = null;
        this.keyVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationServiceEnvironmenEncryptionKeyReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyName;
        private @Nullable ResourceReferenceResponse keyVault;
        private @Nullable String keyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationServiceEnvironmenEncryptionKeyReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.keyVault = defaults.keyVault;
    	      this.keyVersion = defaults.keyVersion;
        }

        public Builder setKeyName(@Nullable String keyName) {
            this.keyName = keyName;
            return this;
        }

        public Builder setKeyVault(@Nullable ResourceReferenceResponse keyVault) {
            this.keyVault = keyVault;
            return this;
        }

        public Builder setKeyVersion(@Nullable String keyVersion) {
            this.keyVersion = keyVersion;
            return this;
        }

        public IntegrationServiceEnvironmenEncryptionKeyReferenceResponse build() {
            return new IntegrationServiceEnvironmenEncryptionKeyReferenceResponse(keyName, keyVault, keyVersion);
        }
    }
}

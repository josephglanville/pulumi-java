// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.autonomousdevelopmentplatform.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataPoolEncryptionResponse {
    private final String keyName;
    private final String keyVaultUri;
    private final @Nullable String keyVersion;
    private final String userAssignedIdentity;

    @OutputCustomType.Constructor({"keyName","keyVaultUri","keyVersion","userAssignedIdentity"})
    private DataPoolEncryptionResponse(
        String keyName,
        String keyVaultUri,
        @Nullable String keyVersion,
        String userAssignedIdentity) {
        this.keyName = Objects.requireNonNull(keyName);
        this.keyVaultUri = Objects.requireNonNull(keyVaultUri);
        this.keyVersion = keyVersion;
        this.userAssignedIdentity = Objects.requireNonNull(userAssignedIdentity);
    }

    public String getKeyName() {
        return this.keyName;
    }
    public String getKeyVaultUri() {
        return this.keyVaultUri;
    }
    public Optional<String> getKeyVersion() {
        return Optional.ofNullable(this.keyVersion);
    }
    public String getUserAssignedIdentity() {
        return this.userAssignedIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataPoolEncryptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyName;
        private String keyVaultUri;
        private @Nullable String keyVersion;
        private String userAssignedIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(DataPoolEncryptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.keyVaultUri = defaults.keyVaultUri;
    	      this.keyVersion = defaults.keyVersion;
    	      this.userAssignedIdentity = defaults.userAssignedIdentity;
        }

        public Builder setKeyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }

        public Builder setKeyVaultUri(String keyVaultUri) {
            this.keyVaultUri = Objects.requireNonNull(keyVaultUri);
            return this;
        }

        public Builder setKeyVersion(@Nullable String keyVersion) {
            this.keyVersion = keyVersion;
            return this;
        }

        public Builder setUserAssignedIdentity(String userAssignedIdentity) {
            this.userAssignedIdentity = Objects.requireNonNull(userAssignedIdentity);
            return this;
        }

        public DataPoolEncryptionResponse build() {
            return new DataPoolEncryptionResponse(keyName, keyVaultUri, keyVersion, userAssignedIdentity);
        }
    }
}

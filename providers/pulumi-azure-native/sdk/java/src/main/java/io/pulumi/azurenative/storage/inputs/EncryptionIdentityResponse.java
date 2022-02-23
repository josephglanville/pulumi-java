// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Encryption identity for the storage account.
 * 
 */
public final class EncryptionIdentityResponse extends io.pulumi.resources.InvokeArgs {

    public static final EncryptionIdentityResponse Empty = new EncryptionIdentityResponse();

    /**
     * Resource identifier of the UserAssigned identity to be associated with server-side encryption on the storage account.
     * 
     */
    @InputImport(name="encryptionUserAssignedIdentity")
      private final @Nullable String encryptionUserAssignedIdentity;

    public Optional<String> getEncryptionUserAssignedIdentity() {
        return this.encryptionUserAssignedIdentity == null ? Optional.empty() : Optional.ofNullable(this.encryptionUserAssignedIdentity);
    }

    public EncryptionIdentityResponse(@Nullable String encryptionUserAssignedIdentity) {
        this.encryptionUserAssignedIdentity = encryptionUserAssignedIdentity;
    }

    private EncryptionIdentityResponse() {
        this.encryptionUserAssignedIdentity = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String encryptionUserAssignedIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionUserAssignedIdentity = defaults.encryptionUserAssignedIdentity;
        }

        public Builder setEncryptionUserAssignedIdentity(@Nullable String encryptionUserAssignedIdentity) {
            this.encryptionUserAssignedIdentity = encryptionUserAssignedIdentity;
            return this;
        }
        public EncryptionIdentityResponse build() {
            return new EncryptionIdentityResponse(encryptionUserAssignedIdentity);
        }
    }
}

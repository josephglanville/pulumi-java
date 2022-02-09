// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KeyVaultPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyVaultPropertiesArgs Empty = new KeyVaultPropertiesArgs();

    @InputImport(name="identityClientId")
    private final @Nullable Input<String> identityClientId;

    public Input<String> getIdentityClientId() {
        return this.identityClientId == null ? Input.empty() : this.identityClientId;
    }

    @InputImport(name="keyIdentifier", required=true)
    private final Input<String> keyIdentifier;

    public Input<String> getKeyIdentifier() {
        return this.keyIdentifier;
    }

    @InputImport(name="keyVaultArmId", required=true)
    private final Input<String> keyVaultArmId;

    public Input<String> getKeyVaultArmId() {
        return this.keyVaultArmId;
    }

    public KeyVaultPropertiesArgs(
        @Nullable Input<String> identityClientId,
        Input<String> keyIdentifier,
        Input<String> keyVaultArmId) {
        this.identityClientId = identityClientId;
        this.keyIdentifier = Objects.requireNonNull(keyIdentifier, "expected parameter 'keyIdentifier' to be non-null");
        this.keyVaultArmId = Objects.requireNonNull(keyVaultArmId, "expected parameter 'keyVaultArmId' to be non-null");
    }

    private KeyVaultPropertiesArgs() {
        this.identityClientId = Input.empty();
        this.keyIdentifier = Input.empty();
        this.keyVaultArmId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> identityClientId;
        private Input<String> keyIdentifier;
        private Input<String> keyVaultArmId;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityClientId = defaults.identityClientId;
    	      this.keyIdentifier = defaults.keyIdentifier;
    	      this.keyVaultArmId = defaults.keyVaultArmId;
        }

        public Builder setIdentityClientId(@Nullable Input<String> identityClientId) {
            this.identityClientId = identityClientId;
            return this;
        }

        public Builder setIdentityClientId(@Nullable String identityClientId) {
            this.identityClientId = Input.ofNullable(identityClientId);
            return this;
        }

        public Builder setKeyIdentifier(Input<String> keyIdentifier) {
            this.keyIdentifier = Objects.requireNonNull(keyIdentifier);
            return this;
        }

        public Builder setKeyIdentifier(String keyIdentifier) {
            this.keyIdentifier = Input.of(Objects.requireNonNull(keyIdentifier));
            return this;
        }

        public Builder setKeyVaultArmId(Input<String> keyVaultArmId) {
            this.keyVaultArmId = Objects.requireNonNull(keyVaultArmId);
            return this;
        }

        public Builder setKeyVaultArmId(String keyVaultArmId) {
            this.keyVaultArmId = Input.of(Objects.requireNonNull(keyVaultArmId));
            return this;
        }

        public KeyVaultPropertiesArgs build() {
            return new KeyVaultPropertiesArgs(identityClientId, keyIdentifier, keyVaultArmId);
        }
    }
}

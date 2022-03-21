// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This defines the format used to record keys used in the software supply chain. An in-toto link is attested using one or more keys defined in the in-toto layout. An example of this is: { "key_id": "776a00e29f3559e0141b3b096f696abc6cfb0c657ab40f441132b345b0...", "key_type": "rsa", "public_key_value": "-----BEGIN PUBLIC KEY-----\nMIIBojANBgkqhkiG9w0B...", "key_scheme": "rsassa-pss-sha256" } The format for in-toto's key definition can be found in section 4.2 of the in-toto specification.
 * 
 */
public final class SigningKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SigningKeyArgs Empty = new SigningKeyArgs();

    /**
     * key_id is an identifier for the signing key.
     * 
     */
    @Import(name="keyId")
      private final @Nullable Output<String> keyId;

    public Output<String> getKeyId() {
        return this.keyId == null ? Output.empty() : this.keyId;
    }

    /**
     * This field contains the corresponding signature scheme. Eg: "rsassa-pss-sha256".
     * 
     */
    @Import(name="keyScheme")
      private final @Nullable Output<String> keyScheme;

    public Output<String> getKeyScheme() {
        return this.keyScheme == null ? Output.empty() : this.keyScheme;
    }

    /**
     * This field identifies the specific signing method. Eg: "rsa", "ed25519", and "ecdsa".
     * 
     */
    @Import(name="keyType")
      private final @Nullable Output<String> keyType;

    public Output<String> getKeyType() {
        return this.keyType == null ? Output.empty() : this.keyType;
    }

    /**
     * This field contains the actual public key.
     * 
     */
    @Import(name="publicKeyValue")
      private final @Nullable Output<String> publicKeyValue;

    public Output<String> getPublicKeyValue() {
        return this.publicKeyValue == null ? Output.empty() : this.publicKeyValue;
    }

    public SigningKeyArgs(
        @Nullable Output<String> keyId,
        @Nullable Output<String> keyScheme,
        @Nullable Output<String> keyType,
        @Nullable Output<String> publicKeyValue) {
        this.keyId = keyId;
        this.keyScheme = keyScheme;
        this.keyType = keyType;
        this.publicKeyValue = publicKeyValue;
    }

    private SigningKeyArgs() {
        this.keyId = Output.empty();
        this.keyScheme = Output.empty();
        this.keyType = Output.empty();
        this.publicKeyValue = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> keyId;
        private @Nullable Output<String> keyScheme;
        private @Nullable Output<String> keyType;
        private @Nullable Output<String> publicKeyValue;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
    	      this.keyScheme = defaults.keyScheme;
    	      this.keyType = defaults.keyType;
    	      this.publicKeyValue = defaults.publicKeyValue;
        }

        public Builder keyId(@Nullable Output<String> keyId) {
            this.keyId = keyId;
            return this;
        }
        public Builder keyId(@Nullable String keyId) {
            this.keyId = Output.ofNullable(keyId);
            return this;
        }
        public Builder keyScheme(@Nullable Output<String> keyScheme) {
            this.keyScheme = keyScheme;
            return this;
        }
        public Builder keyScheme(@Nullable String keyScheme) {
            this.keyScheme = Output.ofNullable(keyScheme);
            return this;
        }
        public Builder keyType(@Nullable Output<String> keyType) {
            this.keyType = keyType;
            return this;
        }
        public Builder keyType(@Nullable String keyType) {
            this.keyType = Output.ofNullable(keyType);
            return this;
        }
        public Builder publicKeyValue(@Nullable Output<String> publicKeyValue) {
            this.publicKeyValue = publicKeyValue;
            return this;
        }
        public Builder publicKeyValue(@Nullable String publicKeyValue) {
            this.publicKeyValue = Output.ofNullable(publicKeyValue);
            return this;
        }        public SigningKeyArgs build() {
            return new SigningKeyArgs(keyId, keyScheme, keyType, publicKeyValue);
        }
    }
}

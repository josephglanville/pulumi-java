// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse {
    /**
     * The content key ID.
     * 
     */
    private final String keyId;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifier'.
     * 
     */
    private final String odataType;

    @CustomType.Constructor
    private ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse(
        @CustomType.Parameter("keyId") String keyId,
        @CustomType.Parameter("odataType") String odataType) {
        this.keyId = keyId;
        this.odataType = odataType;
    }

    /**
     * The content key ID.
     * 
    */
    public String getKeyId() {
        return this.keyId;
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifier'.
     * 
    */
    public String getOdataType() {
        return this.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyId;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
    	      this.odataType = defaults.odataType;
        }

        public Builder keyId(String keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }        public ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse build() {
            return new ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse(keyId, odataType);
        }
    }
}

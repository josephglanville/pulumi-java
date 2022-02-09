// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse Empty = new ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse();

    @InputImport(name="keyId", required=true)
    private final String keyId;

    public String getKeyId() {
        return this.keyId;
    }

    @InputImport(name="odataType", required=true)
    private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    public ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse(
        String keyId,
        String odataType) {
        this.keyId = Objects.requireNonNull(keyId, "expected parameter 'keyId' to be non-null");
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse() {
        this.keyId = null;
        this.odataType = null;
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

        public Builder setKeyId(String keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse build() {
            return new ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse(keyId, odataType);
        }
    }
}

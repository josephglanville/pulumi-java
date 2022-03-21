// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies that the content key ID is specified in the PlayReady configuration.
 * 
 */
public final class ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierArgs Empty = new ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierArgs();

    /**
     * The content key ID.
     * 
     */
    @Import(name="keyId", required=true)
      private final Output<String> keyId;

    public Output<String> getKeyId() {
        return this.keyId;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifier'.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> getOdataType() {
        return this.odataType;
    }

    public ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierArgs(
        Output<String> keyId,
        Output<String> odataType) {
        this.keyId = Objects.requireNonNull(keyId, "expected parameter 'keyId' to be non-null");
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierArgs() {
        this.keyId = Output.empty();
        this.odataType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> keyId;
        private Output<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
    	      this.odataType = defaults.odataType;
        }

        public Builder keyId(Output<String> keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }
        public Builder keyId(String keyId) {
            this.keyId = Output.of(Objects.requireNonNull(keyId));
            return this;
        }
        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }        public ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierArgs build() {
            return new ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierArgs(keyId, odataType);
        }
    }
}

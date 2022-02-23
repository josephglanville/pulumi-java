// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies a symmetric key for token validation.
 * 
 */
public final class ContentKeyPolicySymmetricTokenKeyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContentKeyPolicySymmetricTokenKeyResponse Empty = new ContentKeyPolicySymmetricTokenKeyResponse();

    /**
     * The key value of the key
     * 
     */
    @InputImport(name="keyValue", required=true)
      private final String keyValue;

    public String getKeyValue() {
        return this.keyValue;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ContentKeyPolicySymmetricTokenKey'.
     * 
     */
    @InputImport(name="odataType", required=true)
      private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    public ContentKeyPolicySymmetricTokenKeyResponse(
        String keyValue,
        String odataType) {
        this.keyValue = Objects.requireNonNull(keyValue, "expected parameter 'keyValue' to be non-null");
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private ContentKeyPolicySymmetricTokenKeyResponse() {
        this.keyValue = null;
        this.odataType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicySymmetricTokenKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyValue;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicySymmetricTokenKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyValue = defaults.keyValue;
    	      this.odataType = defaults.odataType;
        }

        public Builder setKeyValue(String keyValue) {
            this.keyValue = Objects.requireNonNull(keyValue);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public ContentKeyPolicySymmetricTokenKeyResponse build() {
            return new ContentKeyPolicySymmetricTokenKeyResponse(keyValue, odataType);
        }
    }
}

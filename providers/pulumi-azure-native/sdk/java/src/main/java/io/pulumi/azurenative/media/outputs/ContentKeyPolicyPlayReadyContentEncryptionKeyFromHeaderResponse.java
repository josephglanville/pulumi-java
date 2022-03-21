// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderResponse {
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeader'.
     * 
     */
    private final String odataType;

    @CustomType.Constructor
    private ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderResponse(@CustomType.Parameter("odataType") String odataType) {
        this.odataType = odataType;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeader'.
     * 
    */
    public String getOdataType() {
        return this.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
        }

        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }        public ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderResponse build() {
            return new ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderResponse(odataType);
        }
    }
}

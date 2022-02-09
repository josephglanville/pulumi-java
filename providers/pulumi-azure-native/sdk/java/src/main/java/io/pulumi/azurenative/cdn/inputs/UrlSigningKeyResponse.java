// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.KeyVaultSigningKeyParametersResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class UrlSigningKeyResponse extends io.pulumi.resources.InvokeArgs {

    public static final UrlSigningKeyResponse Empty = new UrlSigningKeyResponse();

    @InputImport(name="keyId", required=true)
    private final String keyId;

    public String getKeyId() {
        return this.keyId;
    }

    @InputImport(name="keySourceParameters", required=true)
    private final KeyVaultSigningKeyParametersResponse keySourceParameters;

    public KeyVaultSigningKeyParametersResponse getKeySourceParameters() {
        return this.keySourceParameters;
    }

    public UrlSigningKeyResponse(
        String keyId,
        KeyVaultSigningKeyParametersResponse keySourceParameters) {
        this.keyId = Objects.requireNonNull(keyId, "expected parameter 'keyId' to be non-null");
        this.keySourceParameters = Objects.requireNonNull(keySourceParameters, "expected parameter 'keySourceParameters' to be non-null");
    }

    private UrlSigningKeyResponse() {
        this.keyId = null;
        this.keySourceParameters = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlSigningKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyId;
        private KeyVaultSigningKeyParametersResponse keySourceParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlSigningKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
    	      this.keySourceParameters = defaults.keySourceParameters;
        }

        public Builder setKeyId(String keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }

        public Builder setKeySourceParameters(KeyVaultSigningKeyParametersResponse keySourceParameters) {
            this.keySourceParameters = Objects.requireNonNull(keySourceParameters);
            return this;
        }

        public UrlSigningKeyResponse build() {
            return new UrlSigningKeyResponse(keyId, keySourceParameters);
        }
    }
}

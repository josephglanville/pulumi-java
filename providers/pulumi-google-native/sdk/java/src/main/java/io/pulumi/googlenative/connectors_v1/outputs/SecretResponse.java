// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.connectors_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SecretResponse {
    /**
     * The resource name of the secret version in the format, format as: `projects/*{@literal /}secrets/*{@literal /}versions/*`.
     * 
     */
    private final String secretVersion;

    @CustomType.Constructor
    private SecretResponse(@CustomType.Parameter("secretVersion") String secretVersion) {
        this.secretVersion = secretVersion;
    }

    /**
     * The resource name of the secret version in the format, format as: `projects/*{@literal /}secrets/*{@literal /}versions/*`.
     * 
    */
    public String getSecretVersion() {
        return this.secretVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String secretVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretVersion = defaults.secretVersion;
        }

        public Builder secretVersion(String secretVersion) {
            this.secretVersion = Objects.requireNonNull(secretVersion);
            return this;
        }        public SecretResponse build() {
            return new SecretResponse(secretVersion);
        }
    }
}

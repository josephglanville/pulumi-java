// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iot.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DeviceCredentialPublicKey {
    /**
     * The format of the key.
     * Possible values are `RSA_PEM`, `RSA_X509_PEM`, `ES256_PEM`, and `ES256_X509_PEM`.
     * 
     */
    private final String format;
    /**
     * The key data.
     * 
     */
    private final String key;

    @CustomType.Constructor
    private DeviceCredentialPublicKey(
        @CustomType.Parameter("format") String format,
        @CustomType.Parameter("key") String key) {
        this.format = format;
        this.key = key;
    }

    /**
     * The format of the key.
     * Possible values are `RSA_PEM`, `RSA_X509_PEM`, `ES256_PEM`, and `ES256_X509_PEM`.
     * 
    */
    public String getFormat() {
        return this.format;
    }
    /**
     * The key data.
     * 
    */
    public String getKey() {
        return this.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceCredentialPublicKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String format;
        private String key;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceCredentialPublicKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.format = defaults.format;
    	      this.key = defaults.key;
        }

        public Builder format(String format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }        public DeviceCredentialPublicKey build() {
            return new DeviceCredentialPublicKey(format, key);
        }
    }
}

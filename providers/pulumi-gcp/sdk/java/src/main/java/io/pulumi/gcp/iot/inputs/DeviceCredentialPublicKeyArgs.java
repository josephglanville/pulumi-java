// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DeviceCredentialPublicKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeviceCredentialPublicKeyArgs Empty = new DeviceCredentialPublicKeyArgs();

    /**
     * The format of the key.
     * Possible values are `RSA_PEM`, `RSA_X509_PEM`, `ES256_PEM`, and `ES256_X509_PEM`.
     * 
     */
    @InputImport(name="format", required=true)
      private final Input<String> format;

    public Input<String> getFormat() {
        return this.format;
    }

    /**
     * The key data.
     * 
     */
    @InputImport(name="key", required=true)
      private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    public DeviceCredentialPublicKeyArgs(
        Input<String> format,
        Input<String> key) {
        this.format = Objects.requireNonNull(format, "expected parameter 'format' to be non-null");
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
    }

    private DeviceCredentialPublicKeyArgs() {
        this.format = Input.empty();
        this.key = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceCredentialPublicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> format;
        private Input<String> key;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceCredentialPublicKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.format = defaults.format;
    	      this.key = defaults.key;
        }

        public Builder setFormat(Input<String> format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }

        public Builder setFormat(String format) {
            this.format = Input.of(Objects.requireNonNull(format));
            return this;
        }

        public Builder setKey(Input<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Input.of(Objects.requireNonNull(key));
            return this;
        }
        public DeviceCredentialPublicKeyArgs build() {
            return new DeviceCredentialPublicKeyArgs(format, key);
        }
    }
}

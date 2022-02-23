// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class RegistryCredentialGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegistryCredentialGetArgs Empty = new RegistryCredentialGetArgs();

    /**
     * A public key certificate format and data.
     * 
     */
    @InputImport(name="publicKeyCertificate", required=true)
      private final Input<Map<String,Object>> publicKeyCertificate;

    public Input<Map<String,Object>> getPublicKeyCertificate() {
        return this.publicKeyCertificate;
    }

    public RegistryCredentialGetArgs(Input<Map<String,Object>> publicKeyCertificate) {
        this.publicKeyCertificate = Objects.requireNonNull(publicKeyCertificate, "expected parameter 'publicKeyCertificate' to be non-null");
    }

    private RegistryCredentialGetArgs() {
        this.publicKeyCertificate = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryCredentialGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Map<String,Object>> publicKeyCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryCredentialGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKeyCertificate = defaults.publicKeyCertificate;
        }

        public Builder setPublicKeyCertificate(Input<Map<String,Object>> publicKeyCertificate) {
            this.publicKeyCertificate = Objects.requireNonNull(publicKeyCertificate);
            return this;
        }

        public Builder setPublicKeyCertificate(Map<String,Object> publicKeyCertificate) {
            this.publicKeyCertificate = Input.of(Objects.requireNonNull(publicKeyCertificate));
            return this;
        }
        public RegistryCredentialGetArgs build() {
            return new RegistryCredentialGetArgs(publicKeyCertificate);
        }
    }
}

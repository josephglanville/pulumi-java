// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.iot.inputs.DeviceCredentialPublicKeyGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeviceCredentialGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeviceCredentialGetArgs Empty = new DeviceCredentialGetArgs();

    /**
     * The time at which this credential becomes invalid.
     * 
     */
    @InputImport(name="expirationTime")
      private final @Nullable Output<String> expirationTime;

    public Output<String> getExpirationTime() {
        return this.expirationTime == null ? Output.empty() : this.expirationTime;
    }

    /**
     * A public key used to verify the signature of JSON Web Tokens (JWTs).
     * Structure is documented below.
     * 
     */
    @InputImport(name="publicKey", required=true)
      private final Output<DeviceCredentialPublicKeyGetArgs> publicKey;

    public Output<DeviceCredentialPublicKeyGetArgs> getPublicKey() {
        return this.publicKey;
    }

    public DeviceCredentialGetArgs(
        @Nullable Output<String> expirationTime,
        Output<DeviceCredentialPublicKeyGetArgs> publicKey) {
        this.expirationTime = expirationTime;
        this.publicKey = Objects.requireNonNull(publicKey, "expected parameter 'publicKey' to be non-null");
    }

    private DeviceCredentialGetArgs() {
        this.expirationTime = Output.empty();
        this.publicKey = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceCredentialGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> expirationTime;
        private Output<DeviceCredentialPublicKeyGetArgs> publicKey;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceCredentialGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationTime = defaults.expirationTime;
    	      this.publicKey = defaults.publicKey;
        }

        public Builder expirationTime(@Nullable Output<String> expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }

        public Builder expirationTime(@Nullable String expirationTime) {
            this.expirationTime = Output.ofNullable(expirationTime);
            return this;
        }

        public Builder publicKey(Output<DeviceCredentialPublicKeyGetArgs> publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
            return this;
        }

        public Builder publicKey(DeviceCredentialPublicKeyGetArgs publicKey) {
            this.publicKey = Output.of(Objects.requireNonNull(publicKey));
            return this;
        }
        public DeviceCredentialGetArgs build() {
            return new DeviceCredentialGetArgs(expirationTime, publicKey);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.secretmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.secretmanager.inputs.SecretReplicationUserManagedReplicaCustomerManagedEncryptionGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecretReplicationUserManagedReplicaGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretReplicationUserManagedReplicaGetArgs Empty = new SecretReplicationUserManagedReplicaGetArgs();

    /**
     * Customer Managed Encryption for the secret.
     * Structure is documented below.
     * 
     */
    @Import(name="customerManagedEncryption")
      private final @Nullable Output<SecretReplicationUserManagedReplicaCustomerManagedEncryptionGetArgs> customerManagedEncryption;

    public Output<SecretReplicationUserManagedReplicaCustomerManagedEncryptionGetArgs> getCustomerManagedEncryption() {
        return this.customerManagedEncryption == null ? Output.empty() : this.customerManagedEncryption;
    }

    /**
     * The canonical IDs of the location to replicate data. For example: "us-east1".
     * 
     */
    @Import(name="location", required=true)
      private final Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }

    public SecretReplicationUserManagedReplicaGetArgs(
        @Nullable Output<SecretReplicationUserManagedReplicaCustomerManagedEncryptionGetArgs> customerManagedEncryption,
        Output<String> location) {
        this.customerManagedEncryption = customerManagedEncryption;
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
    }

    private SecretReplicationUserManagedReplicaGetArgs() {
        this.customerManagedEncryption = Output.empty();
        this.location = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretReplicationUserManagedReplicaGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SecretReplicationUserManagedReplicaCustomerManagedEncryptionGetArgs> customerManagedEncryption;
        private Output<String> location;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretReplicationUserManagedReplicaGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerManagedEncryption = defaults.customerManagedEncryption;
    	      this.location = defaults.location;
        }

        public Builder customerManagedEncryption(@Nullable Output<SecretReplicationUserManagedReplicaCustomerManagedEncryptionGetArgs> customerManagedEncryption) {
            this.customerManagedEncryption = customerManagedEncryption;
            return this;
        }
        public Builder customerManagedEncryption(@Nullable SecretReplicationUserManagedReplicaCustomerManagedEncryptionGetArgs customerManagedEncryption) {
            this.customerManagedEncryption = Output.ofNullable(customerManagedEncryption);
            return this;
        }
        public Builder location(Output<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder location(String location) {
            this.location = Output.of(Objects.requireNonNull(location));
            return this;
        }        public SecretReplicationUserManagedReplicaGetArgs build() {
            return new SecretReplicationUserManagedReplicaGetArgs(customerManagedEncryption, location);
        }
    }
}

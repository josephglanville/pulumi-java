// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.secretmanager_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.secretmanager_v1.inputs.CustomerManagedEncryptionArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A replication policy that replicates the Secret payload without any restrictions.
 * 
 */
public final class AutomaticArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutomaticArgs Empty = new AutomaticArgs();

    /**
     * Optional. The customer-managed encryption configuration of the Secret. If no configuration is provided, Google-managed default encryption is used. Updates to the Secret encryption configuration only apply to SecretVersions added afterwards. They do not apply retroactively to existing SecretVersions.
     * 
     */
    @Import(name="customerManagedEncryption")
      private final @Nullable Output<CustomerManagedEncryptionArgs> customerManagedEncryption;

    public Output<CustomerManagedEncryptionArgs> getCustomerManagedEncryption() {
        return this.customerManagedEncryption == null ? Output.empty() : this.customerManagedEncryption;
    }

    public AutomaticArgs(@Nullable Output<CustomerManagedEncryptionArgs> customerManagedEncryption) {
        this.customerManagedEncryption = customerManagedEncryption;
    }

    private AutomaticArgs() {
        this.customerManagedEncryption = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomaticArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CustomerManagedEncryptionArgs> customerManagedEncryption;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomaticArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerManagedEncryption = defaults.customerManagedEncryption;
        }

        public Builder customerManagedEncryption(@Nullable Output<CustomerManagedEncryptionArgs> customerManagedEncryption) {
            this.customerManagedEncryption = customerManagedEncryption;
            return this;
        }
        public Builder customerManagedEncryption(@Nullable CustomerManagedEncryptionArgs customerManagedEncryption) {
            this.customerManagedEncryption = Output.ofNullable(customerManagedEncryption);
            return this;
        }        public AutomaticArgs build() {
            return new AutomaticArgs(customerManagedEncryption);
        }
    }
}

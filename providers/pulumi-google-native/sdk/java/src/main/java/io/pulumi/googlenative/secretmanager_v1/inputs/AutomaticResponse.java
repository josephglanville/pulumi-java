// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.secretmanager_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.secretmanager_v1.inputs.CustomerManagedEncryptionResponse;
import java.util.Objects;


public final class AutomaticResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutomaticResponse Empty = new AutomaticResponse();

    @InputImport(name="customerManagedEncryption", required=true)
    private final CustomerManagedEncryptionResponse customerManagedEncryption;

    public CustomerManagedEncryptionResponse getCustomerManagedEncryption() {
        return this.customerManagedEncryption;
    }

    public AutomaticResponse(CustomerManagedEncryptionResponse customerManagedEncryption) {
        this.customerManagedEncryption = Objects.requireNonNull(customerManagedEncryption, "expected parameter 'customerManagedEncryption' to be non-null");
    }

    private AutomaticResponse() {
        this.customerManagedEncryption = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomaticResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomerManagedEncryptionResponse customerManagedEncryption;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomaticResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerManagedEncryption = defaults.customerManagedEncryption;
        }

        public Builder setCustomerManagedEncryption(CustomerManagedEncryptionResponse customerManagedEncryption) {
            this.customerManagedEncryption = Objects.requireNonNull(customerManagedEncryption);
            return this;
        }

        public AutomaticResponse build() {
            return new AutomaticResponse(customerManagedEncryption);
        }
    }
}
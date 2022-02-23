// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class CryptoKeyIAMPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final CryptoKeyIAMPolicyArgs Empty = new CryptoKeyIAMPolicyArgs();

    /**
     * The crypto key ID, in the form
     * `{project_id}/{location_name}/{key_ring_name}/{crypto_key_name}` or
     * `{location_name}/{key_ring_name}/{crypto_key_name}`. In the second form,
     * the provider's project setting will be used as a fallback.
     * 
     */
    @InputImport(name="cryptoKeyId", required=true)
      private final Input<String> cryptoKeyId;

    public Input<String> getCryptoKeyId() {
        return this.cryptoKeyId;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @InputImport(name="policyData", required=true)
      private final Input<String> policyData;

    public Input<String> getPolicyData() {
        return this.policyData;
    }

    public CryptoKeyIAMPolicyArgs(
        Input<String> cryptoKeyId,
        Input<String> policyData) {
        this.cryptoKeyId = Objects.requireNonNull(cryptoKeyId, "expected parameter 'cryptoKeyId' to be non-null");
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
    }

    private CryptoKeyIAMPolicyArgs() {
        this.cryptoKeyId = Input.empty();
        this.policyData = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CryptoKeyIAMPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> cryptoKeyId;
        private Input<String> policyData;

        public Builder() {
    	      // Empty
        }

        public Builder(CryptoKeyIAMPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cryptoKeyId = defaults.cryptoKeyId;
    	      this.policyData = defaults.policyData;
        }

        public Builder setCryptoKeyId(Input<String> cryptoKeyId) {
            this.cryptoKeyId = Objects.requireNonNull(cryptoKeyId);
            return this;
        }

        public Builder setCryptoKeyId(String cryptoKeyId) {
            this.cryptoKeyId = Input.of(Objects.requireNonNull(cryptoKeyId));
            return this;
        }

        public Builder setPolicyData(Input<String> policyData) {
            this.policyData = Objects.requireNonNull(policyData);
            return this;
        }

        public Builder setPolicyData(String policyData) {
            this.policyData = Input.of(Objects.requireNonNull(policyData));
            return this;
        }
        public CryptoKeyIAMPolicyArgs build() {
            return new CryptoKeyIAMPolicyArgs(cryptoKeyId, policyData);
        }
    }
}

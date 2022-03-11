// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KeyRingIAMPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final KeyRingIAMPolicyState Empty = new KeyRingIAMPolicyState();

    /**
     * (Computed) The etag of the key ring's IAM policy.
     * 
     */
    @InputImport(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Output.empty() : this.etag;
    }

    /**
     * The key ring ID, in the form
     * `{project_id}/{location_name}/{key_ring_name}` or
     * `{location_name}/{key_ring_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     * 
     */
    @InputImport(name="keyRingId")
      private final @Nullable Output<String> keyRingId;

    public Output<String> getKeyRingId() {
        return this.keyRingId == null ? Output.empty() : this.keyRingId;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @InputImport(name="policyData")
      private final @Nullable Output<String> policyData;

    public Output<String> getPolicyData() {
        return this.policyData == null ? Output.empty() : this.policyData;
    }

    public KeyRingIAMPolicyState(
        @Nullable Output<String> etag,
        @Nullable Output<String> keyRingId,
        @Nullable Output<String> policyData) {
        this.etag = etag;
        this.keyRingId = keyRingId;
        this.policyData = policyData;
    }

    private KeyRingIAMPolicyState() {
        this.etag = Output.empty();
        this.keyRingId = Output.empty();
        this.policyData = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyRingIAMPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> etag;
        private @Nullable Output<String> keyRingId;
        private @Nullable Output<String> policyData;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyRingIAMPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.keyRingId = defaults.keyRingId;
    	      this.policyData = defaults.policyData;
        }

        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = Output.ofNullable(etag);
            return this;
        }

        public Builder keyRingId(@Nullable Output<String> keyRingId) {
            this.keyRingId = keyRingId;
            return this;
        }

        public Builder keyRingId(@Nullable String keyRingId) {
            this.keyRingId = Output.ofNullable(keyRingId);
            return this;
        }

        public Builder policyData(@Nullable Output<String> policyData) {
            this.policyData = policyData;
            return this;
        }

        public Builder policyData(@Nullable String policyData) {
            this.policyData = Output.ofNullable(policyData);
            return this;
        }
        public KeyRingIAMPolicyState build() {
            return new KeyRingIAMPolicyState(etag, keyRingId, policyData);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.inputs.QuarantinePolicyArgs;
import io.pulumi.azurenative.containerregistry.inputs.RetentionPolicyArgs;
import io.pulumi.azurenative.containerregistry.inputs.TrustPolicyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The policies for a container registry.
 * 
 */
public final class PoliciesArgs extends io.pulumi.resources.ResourceArgs {

    public static final PoliciesArgs Empty = new PoliciesArgs();

    /**
     * The quarantine policy for a container registry.
     * 
     */
    @InputImport(name="quarantinePolicy")
      private final @Nullable Input<QuarantinePolicyArgs> quarantinePolicy;

    public Input<QuarantinePolicyArgs> getQuarantinePolicy() {
        return this.quarantinePolicy == null ? Input.empty() : this.quarantinePolicy;
    }

    /**
     * The retention policy for a container registry.
     * 
     */
    @InputImport(name="retentionPolicy")
      private final @Nullable Input<RetentionPolicyArgs> retentionPolicy;

    public Input<RetentionPolicyArgs> getRetentionPolicy() {
        return this.retentionPolicy == null ? Input.empty() : this.retentionPolicy;
    }

    /**
     * The content trust policy for a container registry.
     * 
     */
    @InputImport(name="trustPolicy")
      private final @Nullable Input<TrustPolicyArgs> trustPolicy;

    public Input<TrustPolicyArgs> getTrustPolicy() {
        return this.trustPolicy == null ? Input.empty() : this.trustPolicy;
    }

    public PoliciesArgs(
        @Nullable Input<QuarantinePolicyArgs> quarantinePolicy,
        @Nullable Input<RetentionPolicyArgs> retentionPolicy,
        @Nullable Input<TrustPolicyArgs> trustPolicy) {
        this.quarantinePolicy = quarantinePolicy;
        this.retentionPolicy = retentionPolicy;
        this.trustPolicy = trustPolicy;
    }

    private PoliciesArgs() {
        this.quarantinePolicy = Input.empty();
        this.retentionPolicy = Input.empty();
        this.trustPolicy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PoliciesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<QuarantinePolicyArgs> quarantinePolicy;
        private @Nullable Input<RetentionPolicyArgs> retentionPolicy;
        private @Nullable Input<TrustPolicyArgs> trustPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(PoliciesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.quarantinePolicy = defaults.quarantinePolicy;
    	      this.retentionPolicy = defaults.retentionPolicy;
    	      this.trustPolicy = defaults.trustPolicy;
        }

        public Builder setQuarantinePolicy(@Nullable Input<QuarantinePolicyArgs> quarantinePolicy) {
            this.quarantinePolicy = quarantinePolicy;
            return this;
        }

        public Builder setQuarantinePolicy(@Nullable QuarantinePolicyArgs quarantinePolicy) {
            this.quarantinePolicy = Input.ofNullable(quarantinePolicy);
            return this;
        }

        public Builder setRetentionPolicy(@Nullable Input<RetentionPolicyArgs> retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }

        public Builder setRetentionPolicy(@Nullable RetentionPolicyArgs retentionPolicy) {
            this.retentionPolicy = Input.ofNullable(retentionPolicy);
            return this;
        }

        public Builder setTrustPolicy(@Nullable Input<TrustPolicyArgs> trustPolicy) {
            this.trustPolicy = trustPolicy;
            return this;
        }

        public Builder setTrustPolicy(@Nullable TrustPolicyArgs trustPolicy) {
            this.trustPolicy = Input.ofNullable(trustPolicy);
            return this;
        }
        public PoliciesArgs build() {
            return new PoliciesArgs(quarantinePolicy, retentionPolicy, trustPolicy);
        }
    }
}

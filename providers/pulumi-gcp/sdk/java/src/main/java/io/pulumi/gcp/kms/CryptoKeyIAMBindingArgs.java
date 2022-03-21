// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.kms.inputs.CryptoKeyIAMBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CryptoKeyIAMBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final CryptoKeyIAMBindingArgs Empty = new CryptoKeyIAMBindingArgs();

    /**
     * ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @Import(name="condition")
      private final @Nullable Output<CryptoKeyIAMBindingConditionArgs> condition;

    public Output<CryptoKeyIAMBindingConditionArgs> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    /**
     * The crypto key ID, in the form
     * `{project_id}/{location_name}/{key_ring_name}/{crypto_key_name}` or
     * `{location_name}/{key_ring_name}/{crypto_key_name}`. In the second form,
     * the provider's project setting will be used as a fallback.
     * 
     */
    @Import(name="cryptoKeyId", required=true)
      private final Output<String> cryptoKeyId;

    public Output<String> getCryptoKeyId() {
        return this.cryptoKeyId;
    }

    @Import(name="members", required=true)
      private final Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members;
    }

    /**
     * The role that should be applied. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    public CryptoKeyIAMBindingArgs(
        @Nullable Output<CryptoKeyIAMBindingConditionArgs> condition,
        Output<String> cryptoKeyId,
        Output<List<String>> members,
        Output<String> role) {
        this.condition = condition;
        this.cryptoKeyId = Objects.requireNonNull(cryptoKeyId, "expected parameter 'cryptoKeyId' to be non-null");
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private CryptoKeyIAMBindingArgs() {
        this.condition = Output.empty();
        this.cryptoKeyId = Output.empty();
        this.members = Output.empty();
        this.role = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CryptoKeyIAMBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CryptoKeyIAMBindingConditionArgs> condition;
        private Output<String> cryptoKeyId;
        private Output<List<String>> members;
        private Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(CryptoKeyIAMBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.cryptoKeyId = defaults.cryptoKeyId;
    	      this.members = defaults.members;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Output<CryptoKeyIAMBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable CryptoKeyIAMBindingConditionArgs condition) {
            this.condition = Output.ofNullable(condition);
            return this;
        }
        public Builder cryptoKeyId(Output<String> cryptoKeyId) {
            this.cryptoKeyId = Objects.requireNonNull(cryptoKeyId);
            return this;
        }
        public Builder cryptoKeyId(String cryptoKeyId) {
            this.cryptoKeyId = Output.of(Objects.requireNonNull(cryptoKeyId));
            return this;
        }
        public Builder members(Output<List<String>> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }
        public Builder members(List<String> members) {
            this.members = Output.of(Objects.requireNonNull(members));
            return this;
        }
        public Builder members(String... members) {
            return members(List.of(members));
        }
        public Builder role(Output<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder role(String role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }        public CryptoKeyIAMBindingArgs build() {
            return new CryptoKeyIAMBindingArgs(condition, cryptoKeyId, members, role);
        }
    }
}

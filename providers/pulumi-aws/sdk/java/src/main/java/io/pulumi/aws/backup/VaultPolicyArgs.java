// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class VaultPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final VaultPolicyArgs Empty = new VaultPolicyArgs();

    /**
     * Name of the backup vault to add policy for.
     * 
     */
    @Import(name="backupVaultName", required=true)
      private final Output<String> backupVaultName;

    public Output<String> getBackupVaultName() {
        return this.backupVaultName;
    }

    /**
     * The backup vault access policy document in JSON format.
     * 
     */
    @Import(name="policy", required=true)
      private final Output<String> policy;

    public Output<String> getPolicy() {
        return this.policy;
    }

    public VaultPolicyArgs(
        Output<String> backupVaultName,
        Output<String> policy) {
        this.backupVaultName = Objects.requireNonNull(backupVaultName, "expected parameter 'backupVaultName' to be non-null");
        this.policy = Objects.requireNonNull(policy, "expected parameter 'policy' to be non-null");
    }

    private VaultPolicyArgs() {
        this.backupVaultName = Output.empty();
        this.policy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> backupVaultName;
        private Output<String> policy;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupVaultName = defaults.backupVaultName;
    	      this.policy = defaults.policy;
        }

        public Builder backupVaultName(Output<String> backupVaultName) {
            this.backupVaultName = Objects.requireNonNull(backupVaultName);
            return this;
        }
        public Builder backupVaultName(String backupVaultName) {
            this.backupVaultName = Output.of(Objects.requireNonNull(backupVaultName));
            return this;
        }
        public Builder policy(Output<String> policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }
        public Builder policy(String policy) {
            this.policy = Output.of(Objects.requireNonNull(policy));
            return this;
        }        public VaultPolicyArgs build() {
            return new VaultPolicyArgs(backupVaultName, policy);
        }
    }
}
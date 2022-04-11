// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glacier;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VaultLockArgs extends io.pulumi.resources.ResourceArgs {

    public static final VaultLockArgs Empty = new VaultLockArgs();

    /**
     * Boolean whether to permanently apply this Glacier Lock Policy. Once completed, this cannot be undone. If set to `false`, the Glacier Lock Policy remains in a testing mode for 24 hours. After that time, the Glacier Lock Policy is automatically removed by Glacier and the this provider resource will show as needing recreation. Changing this from `false` to `true` will show as resource recreation, which is expected. Changing this from `true` to `false` is not possible unless the Glacier Vault is recreated at the same time.
     * 
     */
    @Import(name="completeLock", required=true)
      private final Output<Boolean> completeLock;

    public Output<Boolean> getCompleteLock() {
        return this.completeLock;
    }

    /**
     * Allow this provider to ignore the error returned when attempting to delete the Glacier Lock Policy. This can be used to delete or recreate the Glacier Vault via this provider, for example, if the Glacier Vault Lock policy permits that action. This should only be used in conjunction with `complete_lock` being set to `true`.
     * 
     */
    @Import(name="ignoreDeletionError")
      private final @Nullable Output<Boolean> ignoreDeletionError;

    public Output<Boolean> getIgnoreDeletionError() {
        return this.ignoreDeletionError == null ? Codegen.empty() : this.ignoreDeletionError;
    }

    /**
     * JSON string containing the IAM policy to apply as the Glacier Vault Lock policy.
     * 
     */
    @Import(name="policy", required=true)
      private final Output<String> policy;

    public Output<String> getPolicy() {
        return this.policy;
    }

    /**
     * The name of the Glacier Vault.
     * 
     */
    @Import(name="vaultName", required=true)
      private final Output<String> vaultName;

    public Output<String> getVaultName() {
        return this.vaultName;
    }

    public VaultLockArgs(
        Output<Boolean> completeLock,
        @Nullable Output<Boolean> ignoreDeletionError,
        Output<String> policy,
        Output<String> vaultName) {
        this.completeLock = Objects.requireNonNull(completeLock, "expected parameter 'completeLock' to be non-null");
        this.ignoreDeletionError = ignoreDeletionError;
        this.policy = Objects.requireNonNull(policy, "expected parameter 'policy' to be non-null");
        this.vaultName = Objects.requireNonNull(vaultName, "expected parameter 'vaultName' to be non-null");
    }

    private VaultLockArgs() {
        this.completeLock = Codegen.empty();
        this.ignoreDeletionError = Codegen.empty();
        this.policy = Codegen.empty();
        this.vaultName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultLockArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> completeLock;
        private @Nullable Output<Boolean> ignoreDeletionError;
        private Output<String> policy;
        private Output<String> vaultName;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultLockArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.completeLock = defaults.completeLock;
    	      this.ignoreDeletionError = defaults.ignoreDeletionError;
    	      this.policy = defaults.policy;
    	      this.vaultName = defaults.vaultName;
        }

        public Builder completeLock(Output<Boolean> completeLock) {
            this.completeLock = Objects.requireNonNull(completeLock);
            return this;
        }
        public Builder completeLock(Boolean completeLock) {
            this.completeLock = Output.of(Objects.requireNonNull(completeLock));
            return this;
        }
        public Builder ignoreDeletionError(@Nullable Output<Boolean> ignoreDeletionError) {
            this.ignoreDeletionError = ignoreDeletionError;
            return this;
        }
        public Builder ignoreDeletionError(@Nullable Boolean ignoreDeletionError) {
            this.ignoreDeletionError = Codegen.ofNullable(ignoreDeletionError);
            return this;
        }
        public Builder policy(Output<String> policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }
        public Builder policy(String policy) {
            this.policy = Output.of(Objects.requireNonNull(policy));
            return this;
        }
        public Builder vaultName(Output<String> vaultName) {
            this.vaultName = Objects.requireNonNull(vaultName);
            return this;
        }
        public Builder vaultName(String vaultName) {
            this.vaultName = Output.of(Objects.requireNonNull(vaultName));
            return this;
        }        public VaultLockArgs build() {
            return new VaultLockArgs(completeLock, ignoreDeletionError, policy, vaultName);
        }
    }
}

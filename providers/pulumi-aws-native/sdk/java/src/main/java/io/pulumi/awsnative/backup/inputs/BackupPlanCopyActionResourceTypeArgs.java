// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.inputs;

import io.pulumi.awsnative.backup.inputs.BackupPlanLifecycleResourceTypeArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackupPlanCopyActionResourceTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupPlanCopyActionResourceTypeArgs Empty = new BackupPlanCopyActionResourceTypeArgs();

    @Import(name="destinationBackupVaultArn", required=true)
      private final Output<String> destinationBackupVaultArn;

    public Output<String> getDestinationBackupVaultArn() {
        return this.destinationBackupVaultArn;
    }

    @Import(name="lifecycle")
      private final @Nullable Output<BackupPlanLifecycleResourceTypeArgs> lifecycle;

    public Output<BackupPlanLifecycleResourceTypeArgs> getLifecycle() {
        return this.lifecycle == null ? Output.empty() : this.lifecycle;
    }

    public BackupPlanCopyActionResourceTypeArgs(
        Output<String> destinationBackupVaultArn,
        @Nullable Output<BackupPlanLifecycleResourceTypeArgs> lifecycle) {
        this.destinationBackupVaultArn = Objects.requireNonNull(destinationBackupVaultArn, "expected parameter 'destinationBackupVaultArn' to be non-null");
        this.lifecycle = lifecycle;
    }

    private BackupPlanCopyActionResourceTypeArgs() {
        this.destinationBackupVaultArn = Output.empty();
        this.lifecycle = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupPlanCopyActionResourceTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> destinationBackupVaultArn;
        private @Nullable Output<BackupPlanLifecycleResourceTypeArgs> lifecycle;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupPlanCopyActionResourceTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationBackupVaultArn = defaults.destinationBackupVaultArn;
    	      this.lifecycle = defaults.lifecycle;
        }

        public Builder destinationBackupVaultArn(Output<String> destinationBackupVaultArn) {
            this.destinationBackupVaultArn = Objects.requireNonNull(destinationBackupVaultArn);
            return this;
        }
        public Builder destinationBackupVaultArn(String destinationBackupVaultArn) {
            this.destinationBackupVaultArn = Output.of(Objects.requireNonNull(destinationBackupVaultArn));
            return this;
        }
        public Builder lifecycle(@Nullable Output<BackupPlanLifecycleResourceTypeArgs> lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }
        public Builder lifecycle(@Nullable BackupPlanLifecycleResourceTypeArgs lifecycle) {
            this.lifecycle = Output.ofNullable(lifecycle);
            return this;
        }        public BackupPlanCopyActionResourceTypeArgs build() {
            return new BackupPlanCopyActionResourceTypeArgs(destinationBackupVaultArn, lifecycle);
        }
    }
}

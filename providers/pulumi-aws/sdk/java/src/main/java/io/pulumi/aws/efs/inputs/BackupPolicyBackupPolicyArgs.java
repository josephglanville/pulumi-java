// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.efs.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class BackupPolicyBackupPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupPolicyBackupPolicyArgs Empty = new BackupPolicyBackupPolicyArgs();

    /**
     * A status of the backup policy. Valid values: `ENABLED`, `DISABLED`.
     * 
     */
    @Import(name="status", required=true)
      private final Output<String> status;

    public Output<String> getStatus() {
        return this.status;
    }

    public BackupPolicyBackupPolicyArgs(Output<String> status) {
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private BackupPolicyBackupPolicyArgs() {
        this.status = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupPolicyBackupPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupPolicyBackupPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
        }

        public Builder status(Output<String> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder status(String status) {
            this.status = Output.of(Objects.requireNonNull(status));
            return this;
        }        public BackupPolicyBackupPolicyArgs build() {
            return new BackupPolicyBackupPolicyArgs(status);
        }
    }
}

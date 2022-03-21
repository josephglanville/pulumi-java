// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SnapshotCreateVolumePermissionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SnapshotCreateVolumePermissionArgs Empty = new SnapshotCreateVolumePermissionArgs();

    /**
     * An AWS Account ID to add create volume permissions
     * 
     */
    @Import(name="accountId", required=true)
      private final Output<String> accountId;

    public Output<String> getAccountId() {
        return this.accountId;
    }

    /**
     * A snapshot ID
     * 
     */
    @Import(name="snapshotId", required=true)
      private final Output<String> snapshotId;

    public Output<String> getSnapshotId() {
        return this.snapshotId;
    }

    public SnapshotCreateVolumePermissionArgs(
        Output<String> accountId,
        Output<String> snapshotId) {
        this.accountId = Objects.requireNonNull(accountId, "expected parameter 'accountId' to be non-null");
        this.snapshotId = Objects.requireNonNull(snapshotId, "expected parameter 'snapshotId' to be non-null");
    }

    private SnapshotCreateVolumePermissionArgs() {
        this.accountId = Output.empty();
        this.snapshotId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotCreateVolumePermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountId;
        private Output<String> snapshotId;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotCreateVolumePermissionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.snapshotId = defaults.snapshotId;
        }

        public Builder accountId(Output<String> accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        public Builder accountId(String accountId) {
            this.accountId = Output.of(Objects.requireNonNull(accountId));
            return this;
        }
        public Builder snapshotId(Output<String> snapshotId) {
            this.snapshotId = Objects.requireNonNull(snapshotId);
            return this;
        }
        public Builder snapshotId(String snapshotId) {
            this.snapshotId = Output.of(Objects.requireNonNull(snapshotId));
            return this;
        }        public SnapshotCreateVolumePermissionArgs build() {
            return new SnapshotCreateVolumePermissionArgs(accountId, snapshotId);
        }
    }
}

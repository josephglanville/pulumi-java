// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SnapshotArgs extends io.pulumi.resources.ResourceArgs {

    public static final SnapshotArgs Empty = new SnapshotArgs();

    /**
     * The name of the NetApp account
     * 
     */
    @InputImport(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * Resource location
     * 
     */
    @InputImport(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The name of the capacity pool
     * 
     */
    @InputImport(name="poolName", required=true)
      private final Output<String> poolName;

    public Output<String> getPoolName() {
        return this.poolName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the snapshot
     * 
     */
    @InputImport(name="snapshotName")
      private final @Nullable Output<String> snapshotName;

    public Output<String> getSnapshotName() {
        return this.snapshotName == null ? Output.empty() : this.snapshotName;
    }

    /**
     * The name of the volume
     * 
     */
    @InputImport(name="volumeName", required=true)
      private final Output<String> volumeName;

    public Output<String> getVolumeName() {
        return this.volumeName;
    }

    public SnapshotArgs(
        Output<String> accountName,
        @Nullable Output<String> location,
        Output<String> poolName,
        Output<String> resourceGroupName,
        @Nullable Output<String> snapshotName,
        Output<String> volumeName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.location = location;
        this.poolName = Objects.requireNonNull(poolName, "expected parameter 'poolName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.snapshotName = snapshotName;
        this.volumeName = Objects.requireNonNull(volumeName, "expected parameter 'volumeName' to be non-null");
    }

    private SnapshotArgs() {
        this.accountName = Output.empty();
        this.location = Output.empty();
        this.poolName = Output.empty();
        this.resourceGroupName = Output.empty();
        this.snapshotName = Output.empty();
        this.volumeName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<String> location;
        private Output<String> poolName;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> snapshotName;
        private Output<String> volumeName;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.location = defaults.location;
    	      this.poolName = defaults.poolName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.snapshotName = defaults.snapshotName;
    	      this.volumeName = defaults.volumeName;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder poolName(Output<String> poolName) {
            this.poolName = Objects.requireNonNull(poolName);
            return this;
        }

        public Builder poolName(String poolName) {
            this.poolName = Output.of(Objects.requireNonNull(poolName));
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder snapshotName(@Nullable Output<String> snapshotName) {
            this.snapshotName = snapshotName;
            return this;
        }

        public Builder snapshotName(@Nullable String snapshotName) {
            this.snapshotName = Output.ofNullable(snapshotName);
            return this;
        }

        public Builder volumeName(Output<String> volumeName) {
            this.volumeName = Objects.requireNonNull(volumeName);
            return this;
        }

        public Builder volumeName(String volumeName) {
            this.volumeName = Output.of(Objects.requireNonNull(volumeName));
            return this;
        }
        public SnapshotArgs build() {
            return new SnapshotArgs(accountName, location, poolName, resourceGroupName, snapshotName, volumeName);
        }
    }
}

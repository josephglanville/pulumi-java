// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.efs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MountTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MountTargetArgs Empty = new MountTargetArgs();

    @InputImport(name="fileSystemId", required=true)
      private final Input<String> fileSystemId;

    public Input<String> getFileSystemId() {
        return this.fileSystemId;
    }

    @InputImport(name="ipAddress")
      private final @Nullable Input<String> ipAddress;

    public Input<String> getIpAddress() {
        return this.ipAddress == null ? Input.empty() : this.ipAddress;
    }

    @InputImport(name="securityGroups", required=true)
      private final Input<List<String>> securityGroups;

    public Input<List<String>> getSecurityGroups() {
        return this.securityGroups;
    }

    @InputImport(name="subnetId", required=true)
      private final Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId;
    }

    public MountTargetArgs(
        Input<String> fileSystemId,
        @Nullable Input<String> ipAddress,
        Input<List<String>> securityGroups,
        Input<String> subnetId) {
        this.fileSystemId = Objects.requireNonNull(fileSystemId, "expected parameter 'fileSystemId' to be non-null");
        this.ipAddress = ipAddress;
        this.securityGroups = Objects.requireNonNull(securityGroups, "expected parameter 'securityGroups' to be non-null");
        this.subnetId = Objects.requireNonNull(subnetId, "expected parameter 'subnetId' to be non-null");
    }

    private MountTargetArgs() {
        this.fileSystemId = Input.empty();
        this.ipAddress = Input.empty();
        this.securityGroups = Input.empty();
        this.subnetId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MountTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> fileSystemId;
        private @Nullable Input<String> ipAddress;
        private Input<List<String>> securityGroups;
        private Input<String> subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(MountTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.ipAddress = defaults.ipAddress;
    	      this.securityGroups = defaults.securityGroups;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder setFileSystemId(Input<String> fileSystemId) {
            this.fileSystemId = Objects.requireNonNull(fileSystemId);
            return this;
        }

        public Builder setFileSystemId(String fileSystemId) {
            this.fileSystemId = Input.of(Objects.requireNonNull(fileSystemId));
            return this;
        }

        public Builder setIpAddress(@Nullable Input<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = Input.ofNullable(ipAddress);
            return this;
        }

        public Builder setSecurityGroups(Input<List<String>> securityGroups) {
            this.securityGroups = Objects.requireNonNull(securityGroups);
            return this;
        }

        public Builder setSecurityGroups(List<String> securityGroups) {
            this.securityGroups = Input.of(Objects.requireNonNull(securityGroups));
            return this;
        }

        public Builder setSubnetId(Input<String> subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }

        public Builder setSubnetId(String subnetId) {
            this.subnetId = Input.of(Objects.requireNonNull(subnetId));
            return this;
        }
        public MountTargetArgs build() {
            return new MountTargetArgs(fileSystemId, ipAddress, securityGroups, subnetId);
        }
    }
}

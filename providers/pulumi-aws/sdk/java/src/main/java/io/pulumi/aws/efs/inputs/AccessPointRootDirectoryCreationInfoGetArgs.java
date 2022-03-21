// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.efs.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class AccessPointRootDirectoryCreationInfoGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessPointRootDirectoryCreationInfoGetArgs Empty = new AccessPointRootDirectoryCreationInfoGetArgs();

    /**
     * POSIX group ID to apply to the `root_directory`.
     * 
     */
    @Import(name="ownerGid", required=true)
      private final Output<Integer> ownerGid;

    public Output<Integer> getOwnerGid() {
        return this.ownerGid;
    }

    /**
     * POSIX user ID to apply to the `root_directory`.
     * 
     */
    @Import(name="ownerUid", required=true)
      private final Output<Integer> ownerUid;

    public Output<Integer> getOwnerUid() {
        return this.ownerUid;
    }

    /**
     * POSIX permissions to apply to the RootDirectory, in the format of an octal number representing the file's mode bits.
     * 
     */
    @Import(name="permissions", required=true)
      private final Output<String> permissions;

    public Output<String> getPermissions() {
        return this.permissions;
    }

    public AccessPointRootDirectoryCreationInfoGetArgs(
        Output<Integer> ownerGid,
        Output<Integer> ownerUid,
        Output<String> permissions) {
        this.ownerGid = Objects.requireNonNull(ownerGid, "expected parameter 'ownerGid' to be non-null");
        this.ownerUid = Objects.requireNonNull(ownerUid, "expected parameter 'ownerUid' to be non-null");
        this.permissions = Objects.requireNonNull(permissions, "expected parameter 'permissions' to be non-null");
    }

    private AccessPointRootDirectoryCreationInfoGetArgs() {
        this.ownerGid = Output.empty();
        this.ownerUid = Output.empty();
        this.permissions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPointRootDirectoryCreationInfoGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> ownerGid;
        private Output<Integer> ownerUid;
        private Output<String> permissions;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPointRootDirectoryCreationInfoGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ownerGid = defaults.ownerGid;
    	      this.ownerUid = defaults.ownerUid;
    	      this.permissions = defaults.permissions;
        }

        public Builder ownerGid(Output<Integer> ownerGid) {
            this.ownerGid = Objects.requireNonNull(ownerGid);
            return this;
        }
        public Builder ownerGid(Integer ownerGid) {
            this.ownerGid = Output.of(Objects.requireNonNull(ownerGid));
            return this;
        }
        public Builder ownerUid(Output<Integer> ownerUid) {
            this.ownerUid = Objects.requireNonNull(ownerUid);
            return this;
        }
        public Builder ownerUid(Integer ownerUid) {
            this.ownerUid = Output.of(Objects.requireNonNull(ownerUid));
            return this;
        }
        public Builder permissions(Output<String> permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }
        public Builder permissions(String permissions) {
            this.permissions = Output.of(Objects.requireNonNull(permissions));
            return this;
        }        public AccessPointRootDirectoryCreationInfoGetArgs build() {
            return new AccessPointRootDirectoryCreationInfoGetArgs(ownerGid, ownerUid, permissions);
        }
    }
}

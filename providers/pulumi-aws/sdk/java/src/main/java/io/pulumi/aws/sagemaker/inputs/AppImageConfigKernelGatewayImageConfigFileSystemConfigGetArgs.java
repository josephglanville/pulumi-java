// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppImageConfigKernelGatewayImageConfigFileSystemConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppImageConfigKernelGatewayImageConfigFileSystemConfigGetArgs Empty = new AppImageConfigKernelGatewayImageConfigFileSystemConfigGetArgs();

    /**
     * The default POSIX group ID (GID). If not specified, defaults to `100`. Valid values are `0` and `100`.
     * 
     */
    @Import(name="defaultGid")
      private final @Nullable Output<Integer> defaultGid;

    public Output<Integer> getDefaultGid() {
        return this.defaultGid == null ? Codegen.empty() : this.defaultGid;
    }

    /**
     * The default POSIX user ID (UID). If not specified, defaults to `1000`. Valid values are `0` and `1000`.
     * 
     */
    @Import(name="defaultUid")
      private final @Nullable Output<Integer> defaultUid;

    public Output<Integer> getDefaultUid() {
        return this.defaultUid == null ? Codegen.empty() : this.defaultUid;
    }

    /**
     * The path within the image to mount the user's EFS home directory. The directory should be empty. If not specified, defaults to `/home/sagemaker-user`.
     * 
     */
    @Import(name="mountPath")
      private final @Nullable Output<String> mountPath;

    public Output<String> getMountPath() {
        return this.mountPath == null ? Codegen.empty() : this.mountPath;
    }

    public AppImageConfigKernelGatewayImageConfigFileSystemConfigGetArgs(
        @Nullable Output<Integer> defaultGid,
        @Nullable Output<Integer> defaultUid,
        @Nullable Output<String> mountPath) {
        this.defaultGid = defaultGid;
        this.defaultUid = defaultUid;
        this.mountPath = mountPath;
    }

    private AppImageConfigKernelGatewayImageConfigFileSystemConfigGetArgs() {
        this.defaultGid = Codegen.empty();
        this.defaultUid = Codegen.empty();
        this.mountPath = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppImageConfigKernelGatewayImageConfigFileSystemConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> defaultGid;
        private @Nullable Output<Integer> defaultUid;
        private @Nullable Output<String> mountPath;

        public Builder() {
    	      // Empty
        }

        public Builder(AppImageConfigKernelGatewayImageConfigFileSystemConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultGid = defaults.defaultGid;
    	      this.defaultUid = defaults.defaultUid;
    	      this.mountPath = defaults.mountPath;
        }

        public Builder defaultGid(@Nullable Output<Integer> defaultGid) {
            this.defaultGid = defaultGid;
            return this;
        }
        public Builder defaultGid(@Nullable Integer defaultGid) {
            this.defaultGid = Codegen.ofNullable(defaultGid);
            return this;
        }
        public Builder defaultUid(@Nullable Output<Integer> defaultUid) {
            this.defaultUid = defaultUid;
            return this;
        }
        public Builder defaultUid(@Nullable Integer defaultUid) {
            this.defaultUid = Codegen.ofNullable(defaultUid);
            return this;
        }
        public Builder mountPath(@Nullable Output<String> mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public Builder mountPath(@Nullable String mountPath) {
            this.mountPath = Codegen.ofNullable(mountPath);
            return this;
        }        public AppImageConfigKernelGatewayImageConfigFileSystemConfigGetArgs build() {
            return new AppImageConfigKernelGatewayImageConfigFileSystemConfigGetArgs(defaultGid, defaultUid, mountPath);
        }
    }
}

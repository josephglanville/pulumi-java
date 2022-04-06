// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.inputs;

import io.pulumi.aws.fsx.inputs.OpenZfsFileSystemRootVolumeConfigurationNfsExportsGetArgs;
import io.pulumi.aws.fsx.inputs.OpenZfsFileSystemRootVolumeConfigurationUserAndGroupQuotaGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OpenZfsFileSystemRootVolumeConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OpenZfsFileSystemRootVolumeConfigurationGetArgs Empty = new OpenZfsFileSystemRootVolumeConfigurationGetArgs();

    /**
     * - A boolean flag indicating whether tags for the file system should be copied to snapshots. The default value is false.
     * 
     */
    @Import(name="copyTagsToSnapshots")
      private final @Nullable Output<Boolean> copyTagsToSnapshots;

    public Output<Boolean> getCopyTagsToSnapshots() {
        return this.copyTagsToSnapshots == null ? Output.empty() : this.copyTagsToSnapshots;
    }

    /**
     * - Method used to compress the data on the volume. Valid values are `NONE` or `ZSTD`. Child volumes that don't specify compression option will inherit from parent volume. This option on file system applies to the root volume.
     * 
     */
    @Import(name="dataCompressionType")
      private final @Nullable Output<String> dataCompressionType;

    public Output<String> getDataCompressionType() {
        return this.dataCompressionType == null ? Output.empty() : this.dataCompressionType;
    }

    /**
     * - NFS export configuration for the root volume. Exactly 1 item. See NFS Exports Below.
     * 
     */
    @Import(name="nfsExports")
      private final @Nullable Output<OpenZfsFileSystemRootVolumeConfigurationNfsExportsGetArgs> nfsExports;

    public Output<OpenZfsFileSystemRootVolumeConfigurationNfsExportsGetArgs> getNfsExports() {
        return this.nfsExports == null ? Output.empty() : this.nfsExports;
    }

    /**
     * - specifies whether the volume is read-only. Default is false.
     * 
     */
    @Import(name="readOnly")
      private final @Nullable Output<Boolean> readOnly;

    public Output<Boolean> getReadOnly() {
        return this.readOnly == null ? Output.empty() : this.readOnly;
    }

    /**
     * - Specify how much storage users or groups can use on the volume. Maximum of 100 items. See User and Group Quotas Below.
     * 
     */
    @Import(name="userAndGroupQuotas")
      private final @Nullable Output<List<OpenZfsFileSystemRootVolumeConfigurationUserAndGroupQuotaGetArgs>> userAndGroupQuotas;

    public Output<List<OpenZfsFileSystemRootVolumeConfigurationUserAndGroupQuotaGetArgs>> getUserAndGroupQuotas() {
        return this.userAndGroupQuotas == null ? Output.empty() : this.userAndGroupQuotas;
    }

    public OpenZfsFileSystemRootVolumeConfigurationGetArgs(
        @Nullable Output<Boolean> copyTagsToSnapshots,
        @Nullable Output<String> dataCompressionType,
        @Nullable Output<OpenZfsFileSystemRootVolumeConfigurationNfsExportsGetArgs> nfsExports,
        @Nullable Output<Boolean> readOnly,
        @Nullable Output<List<OpenZfsFileSystemRootVolumeConfigurationUserAndGroupQuotaGetArgs>> userAndGroupQuotas) {
        this.copyTagsToSnapshots = copyTagsToSnapshots;
        this.dataCompressionType = dataCompressionType;
        this.nfsExports = nfsExports;
        this.readOnly = readOnly;
        this.userAndGroupQuotas = userAndGroupQuotas;
    }

    private OpenZfsFileSystemRootVolumeConfigurationGetArgs() {
        this.copyTagsToSnapshots = Output.empty();
        this.dataCompressionType = Output.empty();
        this.nfsExports = Output.empty();
        this.readOnly = Output.empty();
        this.userAndGroupQuotas = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenZfsFileSystemRootVolumeConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> copyTagsToSnapshots;
        private @Nullable Output<String> dataCompressionType;
        private @Nullable Output<OpenZfsFileSystemRootVolumeConfigurationNfsExportsGetArgs> nfsExports;
        private @Nullable Output<Boolean> readOnly;
        private @Nullable Output<List<OpenZfsFileSystemRootVolumeConfigurationUserAndGroupQuotaGetArgs>> userAndGroupQuotas;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenZfsFileSystemRootVolumeConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copyTagsToSnapshots = defaults.copyTagsToSnapshots;
    	      this.dataCompressionType = defaults.dataCompressionType;
    	      this.nfsExports = defaults.nfsExports;
    	      this.readOnly = defaults.readOnly;
    	      this.userAndGroupQuotas = defaults.userAndGroupQuotas;
        }

        public Builder copyTagsToSnapshots(@Nullable Output<Boolean> copyTagsToSnapshots) {
            this.copyTagsToSnapshots = copyTagsToSnapshots;
            return this;
        }
        public Builder copyTagsToSnapshots(@Nullable Boolean copyTagsToSnapshots) {
            this.copyTagsToSnapshots = Output.ofNullable(copyTagsToSnapshots);
            return this;
        }
        public Builder dataCompressionType(@Nullable Output<String> dataCompressionType) {
            this.dataCompressionType = dataCompressionType;
            return this;
        }
        public Builder dataCompressionType(@Nullable String dataCompressionType) {
            this.dataCompressionType = Output.ofNullable(dataCompressionType);
            return this;
        }
        public Builder nfsExports(@Nullable Output<OpenZfsFileSystemRootVolumeConfigurationNfsExportsGetArgs> nfsExports) {
            this.nfsExports = nfsExports;
            return this;
        }
        public Builder nfsExports(@Nullable OpenZfsFileSystemRootVolumeConfigurationNfsExportsGetArgs nfsExports) {
            this.nfsExports = Output.ofNullable(nfsExports);
            return this;
        }
        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = Output.ofNullable(readOnly);
            return this;
        }
        public Builder userAndGroupQuotas(@Nullable Output<List<OpenZfsFileSystemRootVolumeConfigurationUserAndGroupQuotaGetArgs>> userAndGroupQuotas) {
            this.userAndGroupQuotas = userAndGroupQuotas;
            return this;
        }
        public Builder userAndGroupQuotas(@Nullable List<OpenZfsFileSystemRootVolumeConfigurationUserAndGroupQuotaGetArgs> userAndGroupQuotas) {
            this.userAndGroupQuotas = Output.ofNullable(userAndGroupQuotas);
            return this;
        }
        public Builder userAndGroupQuotas(OpenZfsFileSystemRootVolumeConfigurationUserAndGroupQuotaGetArgs... userAndGroupQuotas) {
            return userAndGroupQuotas(List.of(userAndGroupQuotas));
        }        public OpenZfsFileSystemRootVolumeConfigurationGetArgs build() {
            return new OpenZfsFileSystemRootVolumeConfigurationGetArgs(copyTagsToSnapshots, dataCompressionType, nfsExports, readOnly, userAndGroupQuotas);
        }
    }
}
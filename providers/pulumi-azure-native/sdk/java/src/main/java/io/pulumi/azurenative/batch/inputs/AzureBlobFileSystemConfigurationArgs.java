// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AzureBlobFileSystemConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureBlobFileSystemConfigurationArgs Empty = new AzureBlobFileSystemConfigurationArgs();

    /**
     * This property is mutually exclusive with sasKey and one must be specified.
     * 
     */
    @Import(name="accountKey")
      private final @Nullable Output<String> accountKey;

    public Output<String> getAccountKey() {
        return this.accountKey == null ? Codegen.empty() : this.accountKey;
    }

    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * These are 'net use' options in Windows and 'mount' options in Linux.
     * 
     */
    @Import(name="blobfuseOptions")
      private final @Nullable Output<String> blobfuseOptions;

    public Output<String> getBlobfuseOptions() {
        return this.blobfuseOptions == null ? Codegen.empty() : this.blobfuseOptions;
    }

    @Import(name="containerName", required=true)
      private final Output<String> containerName;

    public Output<String> getContainerName() {
        return this.containerName;
    }

    /**
     * All file systems are mounted relative to the Batch mounts directory, accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
     * 
     */
    @Import(name="relativeMountPath", required=true)
      private final Output<String> relativeMountPath;

    public Output<String> getRelativeMountPath() {
        return this.relativeMountPath;
    }

    /**
     * This property is mutually exclusive with accountKey and one must be specified.
     * 
     */
    @Import(name="sasKey")
      private final @Nullable Output<String> sasKey;

    public Output<String> getSasKey() {
        return this.sasKey == null ? Codegen.empty() : this.sasKey;
    }

    public AzureBlobFileSystemConfigurationArgs(
        @Nullable Output<String> accountKey,
        Output<String> accountName,
        @Nullable Output<String> blobfuseOptions,
        Output<String> containerName,
        Output<String> relativeMountPath,
        @Nullable Output<String> sasKey) {
        this.accountKey = accountKey;
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.blobfuseOptions = blobfuseOptions;
        this.containerName = Objects.requireNonNull(containerName, "expected parameter 'containerName' to be non-null");
        this.relativeMountPath = Objects.requireNonNull(relativeMountPath, "expected parameter 'relativeMountPath' to be non-null");
        this.sasKey = sasKey;
    }

    private AzureBlobFileSystemConfigurationArgs() {
        this.accountKey = Codegen.empty();
        this.accountName = Codegen.empty();
        this.blobfuseOptions = Codegen.empty();
        this.containerName = Codegen.empty();
        this.relativeMountPath = Codegen.empty();
        this.sasKey = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBlobFileSystemConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountKey;
        private Output<String> accountName;
        private @Nullable Output<String> blobfuseOptions;
        private Output<String> containerName;
        private Output<String> relativeMountPath;
        private @Nullable Output<String> sasKey;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBlobFileSystemConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountKey = defaults.accountKey;
    	      this.accountName = defaults.accountName;
    	      this.blobfuseOptions = defaults.blobfuseOptions;
    	      this.containerName = defaults.containerName;
    	      this.relativeMountPath = defaults.relativeMountPath;
    	      this.sasKey = defaults.sasKey;
        }

        public Builder accountKey(@Nullable Output<String> accountKey) {
            this.accountKey = accountKey;
            return this;
        }
        public Builder accountKey(@Nullable String accountKey) {
            this.accountKey = Codegen.ofNullable(accountKey);
            return this;
        }
        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }
        public Builder blobfuseOptions(@Nullable Output<String> blobfuseOptions) {
            this.blobfuseOptions = blobfuseOptions;
            return this;
        }
        public Builder blobfuseOptions(@Nullable String blobfuseOptions) {
            this.blobfuseOptions = Codegen.ofNullable(blobfuseOptions);
            return this;
        }
        public Builder containerName(Output<String> containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }
        public Builder containerName(String containerName) {
            this.containerName = Output.of(Objects.requireNonNull(containerName));
            return this;
        }
        public Builder relativeMountPath(Output<String> relativeMountPath) {
            this.relativeMountPath = Objects.requireNonNull(relativeMountPath);
            return this;
        }
        public Builder relativeMountPath(String relativeMountPath) {
            this.relativeMountPath = Output.of(Objects.requireNonNull(relativeMountPath));
            return this;
        }
        public Builder sasKey(@Nullable Output<String> sasKey) {
            this.sasKey = sasKey;
            return this;
        }
        public Builder sasKey(@Nullable String sasKey) {
            this.sasKey = Codegen.ofNullable(sasKey);
            return this;
        }        public AzureBlobFileSystemConfigurationArgs build() {
            return new AzureBlobFileSystemConfigurationArgs(accountKey, accountName, blobfuseOptions, containerName, relativeMountPath, sasKey);
        }
    }
}

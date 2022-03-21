// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AzureFileShareConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureFileShareConfigurationArgs Empty = new AzureFileShareConfigurationArgs();

    @Import(name="accountKey", required=true)
      private final Output<String> accountKey;

    public Output<String> getAccountKey() {
        return this.accountKey;
    }

    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * This is of the form 'https://{account}.file.core.windows.net/'.
     * 
     */
    @Import(name="azureFileUrl", required=true)
      private final Output<String> azureFileUrl;

    public Output<String> getAzureFileUrl() {
        return this.azureFileUrl;
    }

    /**
     * These are 'net use' options in Windows and 'mount' options in Linux.
     * 
     */
    @Import(name="mountOptions")
      private final @Nullable Output<String> mountOptions;

    public Output<String> getMountOptions() {
        return this.mountOptions == null ? Output.empty() : this.mountOptions;
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

    public AzureFileShareConfigurationArgs(
        Output<String> accountKey,
        Output<String> accountName,
        Output<String> azureFileUrl,
        @Nullable Output<String> mountOptions,
        Output<String> relativeMountPath) {
        this.accountKey = Objects.requireNonNull(accountKey, "expected parameter 'accountKey' to be non-null");
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.azureFileUrl = Objects.requireNonNull(azureFileUrl, "expected parameter 'azureFileUrl' to be non-null");
        this.mountOptions = mountOptions;
        this.relativeMountPath = Objects.requireNonNull(relativeMountPath, "expected parameter 'relativeMountPath' to be non-null");
    }

    private AzureFileShareConfigurationArgs() {
        this.accountKey = Output.empty();
        this.accountName = Output.empty();
        this.azureFileUrl = Output.empty();
        this.mountOptions = Output.empty();
        this.relativeMountPath = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFileShareConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountKey;
        private Output<String> accountName;
        private Output<String> azureFileUrl;
        private @Nullable Output<String> mountOptions;
        private Output<String> relativeMountPath;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFileShareConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountKey = defaults.accountKey;
    	      this.accountName = defaults.accountName;
    	      this.azureFileUrl = defaults.azureFileUrl;
    	      this.mountOptions = defaults.mountOptions;
    	      this.relativeMountPath = defaults.relativeMountPath;
        }

        public Builder accountKey(Output<String> accountKey) {
            this.accountKey = Objects.requireNonNull(accountKey);
            return this;
        }
        public Builder accountKey(String accountKey) {
            this.accountKey = Output.of(Objects.requireNonNull(accountKey));
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
        public Builder azureFileUrl(Output<String> azureFileUrl) {
            this.azureFileUrl = Objects.requireNonNull(azureFileUrl);
            return this;
        }
        public Builder azureFileUrl(String azureFileUrl) {
            this.azureFileUrl = Output.of(Objects.requireNonNull(azureFileUrl));
            return this;
        }
        public Builder mountOptions(@Nullable Output<String> mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }
        public Builder mountOptions(@Nullable String mountOptions) {
            this.mountOptions = Output.ofNullable(mountOptions);
            return this;
        }
        public Builder relativeMountPath(Output<String> relativeMountPath) {
            this.relativeMountPath = Objects.requireNonNull(relativeMountPath);
            return this;
        }
        public Builder relativeMountPath(String relativeMountPath) {
            this.relativeMountPath = Output.of(Objects.requireNonNull(relativeMountPath));
            return this;
        }        public AzureFileShareConfigurationArgs build() {
            return new AzureFileShareConfigurationArgs(accountKey, accountName, azureFileUrl, mountOptions, relativeMountPath);
        }
    }
}

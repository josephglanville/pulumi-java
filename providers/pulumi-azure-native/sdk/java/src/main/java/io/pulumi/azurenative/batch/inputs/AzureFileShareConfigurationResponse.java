// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureFileShareConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureFileShareConfigurationResponse Empty = new AzureFileShareConfigurationResponse();

    @InputImport(name="accountKey", required=true)
    private final String accountKey;

    public String getAccountKey() {
        return this.accountKey;
    }

    @InputImport(name="accountName", required=true)
    private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    @InputImport(name="azureFileUrl", required=true)
    private final String azureFileUrl;

    public String getAzureFileUrl() {
        return this.azureFileUrl;
    }

    @InputImport(name="mountOptions")
    private final @Nullable String mountOptions;

    public Optional<String> getMountOptions() {
        return this.mountOptions == null ? Optional.empty() : Optional.ofNullable(this.mountOptions);
    }

    @InputImport(name="relativeMountPath", required=true)
    private final String relativeMountPath;

    public String getRelativeMountPath() {
        return this.relativeMountPath;
    }

    public AzureFileShareConfigurationResponse(
        String accountKey,
        String accountName,
        String azureFileUrl,
        @Nullable String mountOptions,
        String relativeMountPath) {
        this.accountKey = Objects.requireNonNull(accountKey, "expected parameter 'accountKey' to be non-null");
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.azureFileUrl = Objects.requireNonNull(azureFileUrl, "expected parameter 'azureFileUrl' to be non-null");
        this.mountOptions = mountOptions;
        this.relativeMountPath = Objects.requireNonNull(relativeMountPath, "expected parameter 'relativeMountPath' to be non-null");
    }

    private AzureFileShareConfigurationResponse() {
        this.accountKey = null;
        this.accountName = null;
        this.azureFileUrl = null;
        this.mountOptions = null;
        this.relativeMountPath = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFileShareConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountKey;
        private String accountName;
        private String azureFileUrl;
        private @Nullable String mountOptions;
        private String relativeMountPath;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFileShareConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountKey = defaults.accountKey;
    	      this.accountName = defaults.accountName;
    	      this.azureFileUrl = defaults.azureFileUrl;
    	      this.mountOptions = defaults.mountOptions;
    	      this.relativeMountPath = defaults.relativeMountPath;
        }

        public Builder setAccountKey(String accountKey) {
            this.accountKey = Objects.requireNonNull(accountKey);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAzureFileUrl(String azureFileUrl) {
            this.azureFileUrl = Objects.requireNonNull(azureFileUrl);
            return this;
        }

        public Builder setMountOptions(@Nullable String mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }

        public Builder setRelativeMountPath(String relativeMountPath) {
            this.relativeMountPath = Objects.requireNonNull(relativeMountPath);
            return this;
        }

        public AzureFileShareConfigurationResponse build() {
            return new AzureFileShareConfigurationResponse(accountKey, accountName, azureFileUrl, mountOptions, relativeMountPath);
        }
    }
}

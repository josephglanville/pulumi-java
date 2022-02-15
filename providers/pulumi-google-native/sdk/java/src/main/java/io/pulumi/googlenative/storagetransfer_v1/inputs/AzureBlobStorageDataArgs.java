// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.storagetransfer_v1.inputs.AzureCredentialsArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AzureBlobStorageDataArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureBlobStorageDataArgs Empty = new AzureBlobStorageDataArgs();

    @InputImport(name="azureCredentials", required=true)
    private final Input<AzureCredentialsArgs> azureCredentials;

    public Input<AzureCredentialsArgs> getAzureCredentials() {
        return this.azureCredentials;
    }

    @InputImport(name="container", required=true)
    private final Input<String> container;

    public Input<String> getContainer() {
        return this.container;
    }

    @InputImport(name="path")
    private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    @InputImport(name="storageAccount", required=true)
    private final Input<String> storageAccount;

    public Input<String> getStorageAccount() {
        return this.storageAccount;
    }

    public AzureBlobStorageDataArgs(
        Input<AzureCredentialsArgs> azureCredentials,
        Input<String> container,
        @Nullable Input<String> path,
        Input<String> storageAccount) {
        this.azureCredentials = Objects.requireNonNull(azureCredentials, "expected parameter 'azureCredentials' to be non-null");
        this.container = Objects.requireNonNull(container, "expected parameter 'container' to be non-null");
        this.path = path;
        this.storageAccount = Objects.requireNonNull(storageAccount, "expected parameter 'storageAccount' to be non-null");
    }

    private AzureBlobStorageDataArgs() {
        this.azureCredentials = Input.empty();
        this.container = Input.empty();
        this.path = Input.empty();
        this.storageAccount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBlobStorageDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<AzureCredentialsArgs> azureCredentials;
        private Input<String> container;
        private @Nullable Input<String> path;
        private Input<String> storageAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBlobStorageDataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureCredentials = defaults.azureCredentials;
    	      this.container = defaults.container;
    	      this.path = defaults.path;
    	      this.storageAccount = defaults.storageAccount;
        }

        public Builder setAzureCredentials(Input<AzureCredentialsArgs> azureCredentials) {
            this.azureCredentials = Objects.requireNonNull(azureCredentials);
            return this;
        }

        public Builder setAzureCredentials(AzureCredentialsArgs azureCredentials) {
            this.azureCredentials = Input.of(Objects.requireNonNull(azureCredentials));
            return this;
        }

        public Builder setContainer(Input<String> container) {
            this.container = Objects.requireNonNull(container);
            return this;
        }

        public Builder setContainer(String container) {
            this.container = Input.of(Objects.requireNonNull(container));
            return this;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder setStorageAccount(Input<String> storageAccount) {
            this.storageAccount = Objects.requireNonNull(storageAccount);
            return this;
        }

        public Builder setStorageAccount(String storageAccount) {
            this.storageAccount = Input.of(Objects.requireNonNull(storageAccount));
            return this;
        }

        public AzureBlobStorageDataArgs build() {
            return new AzureBlobStorageDataArgs(azureCredentials, container, path, storageAccount);
        }
    }
}
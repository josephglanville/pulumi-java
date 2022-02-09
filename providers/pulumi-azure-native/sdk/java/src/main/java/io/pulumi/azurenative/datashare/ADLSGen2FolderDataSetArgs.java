// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ADLSGen2FolderDataSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ADLSGen2FolderDataSetArgs Empty = new ADLSGen2FolderDataSetArgs();

    @InputImport(name="accountName", required=true)
    private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    @InputImport(name="dataSetName")
    private final @Nullable Input<String> dataSetName;

    public Input<String> getDataSetName() {
        return this.dataSetName == null ? Input.empty() : this.dataSetName;
    }

    @InputImport(name="fileSystem", required=true)
    private final Input<String> fileSystem;

    public Input<String> getFileSystem() {
        return this.fileSystem;
    }

    @InputImport(name="folderPath", required=true)
    private final Input<String> folderPath;

    public Input<String> getFolderPath() {
        return this.folderPath;
    }

    @InputImport(name="kind", required=true)
    private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    @InputImport(name="resourceGroup", required=true)
    private final Input<String> resourceGroup;

    public Input<String> getResourceGroup() {
        return this.resourceGroup;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="shareName", required=true)
    private final Input<String> shareName;

    public Input<String> getShareName() {
        return this.shareName;
    }

    @InputImport(name="storageAccountName", required=true)
    private final Input<String> storageAccountName;

    public Input<String> getStorageAccountName() {
        return this.storageAccountName;
    }

    @InputImport(name="subscriptionId", required=true)
    private final Input<String> subscriptionId;

    public Input<String> getSubscriptionId() {
        return this.subscriptionId;
    }

    public ADLSGen2FolderDataSetArgs(
        Input<String> accountName,
        @Nullable Input<String> dataSetName,
        Input<String> fileSystem,
        Input<String> folderPath,
        Input<String> kind,
        Input<String> resourceGroup,
        Input<String> resourceGroupName,
        Input<String> shareName,
        Input<String> storageAccountName,
        Input<String> subscriptionId) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.dataSetName = dataSetName;
        this.fileSystem = Objects.requireNonNull(fileSystem, "expected parameter 'fileSystem' to be non-null");
        this.folderPath = Objects.requireNonNull(folderPath, "expected parameter 'folderPath' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.resourceGroup = Objects.requireNonNull(resourceGroup, "expected parameter 'resourceGroup' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shareName = Objects.requireNonNull(shareName, "expected parameter 'shareName' to be non-null");
        this.storageAccountName = Objects.requireNonNull(storageAccountName, "expected parameter 'storageAccountName' to be non-null");
        this.subscriptionId = Objects.requireNonNull(subscriptionId, "expected parameter 'subscriptionId' to be non-null");
    }

    private ADLSGen2FolderDataSetArgs() {
        this.accountName = Input.empty();
        this.dataSetName = Input.empty();
        this.fileSystem = Input.empty();
        this.folderPath = Input.empty();
        this.kind = Input.empty();
        this.resourceGroup = Input.empty();
        this.resourceGroupName = Input.empty();
        this.shareName = Input.empty();
        this.storageAccountName = Input.empty();
        this.subscriptionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ADLSGen2FolderDataSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private @Nullable Input<String> dataSetName;
        private Input<String> fileSystem;
        private Input<String> folderPath;
        private Input<String> kind;
        private Input<String> resourceGroup;
        private Input<String> resourceGroupName;
        private Input<String> shareName;
        private Input<String> storageAccountName;
        private Input<String> subscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(ADLSGen2FolderDataSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.dataSetName = defaults.dataSetName;
    	      this.fileSystem = defaults.fileSystem;
    	      this.folderPath = defaults.folderPath;
    	      this.kind = defaults.kind;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shareName = defaults.shareName;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.subscriptionId = defaults.subscriptionId;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setDataSetName(@Nullable Input<String> dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }

        public Builder setDataSetName(@Nullable String dataSetName) {
            this.dataSetName = Input.ofNullable(dataSetName);
            return this;
        }

        public Builder setFileSystem(Input<String> fileSystem) {
            this.fileSystem = Objects.requireNonNull(fileSystem);
            return this;
        }

        public Builder setFileSystem(String fileSystem) {
            this.fileSystem = Input.of(Objects.requireNonNull(fileSystem));
            return this;
        }

        public Builder setFolderPath(Input<String> folderPath) {
            this.folderPath = Objects.requireNonNull(folderPath);
            return this;
        }

        public Builder setFolderPath(String folderPath) {
            this.folderPath = Input.of(Objects.requireNonNull(folderPath));
            return this;
        }

        public Builder setKind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder setResourceGroup(Input<String> resourceGroup) {
            this.resourceGroup = Objects.requireNonNull(resourceGroup);
            return this;
        }

        public Builder setResourceGroup(String resourceGroup) {
            this.resourceGroup = Input.of(Objects.requireNonNull(resourceGroup));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setShareName(Input<String> shareName) {
            this.shareName = Objects.requireNonNull(shareName);
            return this;
        }

        public Builder setShareName(String shareName) {
            this.shareName = Input.of(Objects.requireNonNull(shareName));
            return this;
        }

        public Builder setStorageAccountName(Input<String> storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }

        public Builder setStorageAccountName(String storageAccountName) {
            this.storageAccountName = Input.of(Objects.requireNonNull(storageAccountName));
            return this;
        }

        public Builder setSubscriptionId(Input<String> subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }

        public Builder setSubscriptionId(String subscriptionId) {
            this.subscriptionId = Input.of(Objects.requireNonNull(subscriptionId));
            return this;
        }

        public ADLSGen2FolderDataSetArgs build() {
            return new ADLSGen2FolderDataSetArgs(accountName, dataSetName, fileSystem, folderPath, kind, resourceGroup, resourceGroupName, shareName, storageAccountName, subscriptionId);
        }
    }
}

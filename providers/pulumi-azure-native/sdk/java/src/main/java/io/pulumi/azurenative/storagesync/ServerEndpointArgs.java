// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagesync;

import io.pulumi.azurenative.storagesync.enums.FeatureStatus;
import io.pulumi.azurenative.storagesync.enums.InitialDownloadPolicy;
import io.pulumi.azurenative.storagesync.enums.LocalCacheMode;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServerEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerEndpointArgs Empty = new ServerEndpointArgs();

    /**
     * Cloud Tiering.
     * 
     */
    @InputImport(name="cloudTiering")
      private final @Nullable Input<Either<String,FeatureStatus>> cloudTiering;

    public Input<Either<String,FeatureStatus>> getCloudTiering() {
        return this.cloudTiering == null ? Input.empty() : this.cloudTiering;
    }

    /**
     * Friendly Name
     * 
     */
    @InputImport(name="friendlyName")
      private final @Nullable Input<String> friendlyName;

    public Input<String> getFriendlyName() {
        return this.friendlyName == null ? Input.empty() : this.friendlyName;
    }

    /**
     * Policy for how namespace and files are recalled during FastDr.
     * 
     */
    @InputImport(name="initialDownloadPolicy")
      private final @Nullable Input<Either<String,InitialDownloadPolicy>> initialDownloadPolicy;

    public Input<Either<String,InitialDownloadPolicy>> getInitialDownloadPolicy() {
        return this.initialDownloadPolicy == null ? Input.empty() : this.initialDownloadPolicy;
    }

    /**
     * Policy for enabling follow-the-sun business models: link local cache to cloud behavior to pre-populate before local access.
     * 
     */
    @InputImport(name="localCacheMode")
      private final @Nullable Input<Either<String,LocalCacheMode>> localCacheMode;

    public Input<Either<String,LocalCacheMode>> getLocalCacheMode() {
        return this.localCacheMode == null ? Input.empty() : this.localCacheMode;
    }

    /**
     * Offline data transfer
     * 
     */
    @InputImport(name="offlineDataTransfer")
      private final @Nullable Input<Either<String,FeatureStatus>> offlineDataTransfer;

    public Input<Either<String,FeatureStatus>> getOfflineDataTransfer() {
        return this.offlineDataTransfer == null ? Input.empty() : this.offlineDataTransfer;
    }

    /**
     * Offline data transfer share name
     * 
     */
    @InputImport(name="offlineDataTransferShareName")
      private final @Nullable Input<String> offlineDataTransferShareName;

    public Input<String> getOfflineDataTransferShareName() {
        return this.offlineDataTransferShareName == null ? Input.empty() : this.offlineDataTransferShareName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of Server Endpoint object.
     * 
     */
    @InputImport(name="serverEndpointName")
      private final @Nullable Input<String> serverEndpointName;

    public Input<String> getServerEndpointName() {
        return this.serverEndpointName == null ? Input.empty() : this.serverEndpointName;
    }

    /**
     * Server Local path.
     * 
     */
    @InputImport(name="serverLocalPath")
      private final @Nullable Input<String> serverLocalPath;

    public Input<String> getServerLocalPath() {
        return this.serverLocalPath == null ? Input.empty() : this.serverLocalPath;
    }

    /**
     * Server Resource Id.
     * 
     */
    @InputImport(name="serverResourceId")
      private final @Nullable Input<String> serverResourceId;

    public Input<String> getServerResourceId() {
        return this.serverResourceId == null ? Input.empty() : this.serverResourceId;
    }

    /**
     * Name of Storage Sync Service resource.
     * 
     */
    @InputImport(name="storageSyncServiceName", required=true)
      private final Input<String> storageSyncServiceName;

    public Input<String> getStorageSyncServiceName() {
        return this.storageSyncServiceName;
    }

    /**
     * Name of Sync Group resource.
     * 
     */
    @InputImport(name="syncGroupName", required=true)
      private final Input<String> syncGroupName;

    public Input<String> getSyncGroupName() {
        return this.syncGroupName;
    }

    /**
     * Tier files older than days.
     * 
     */
    @InputImport(name="tierFilesOlderThanDays")
      private final @Nullable Input<Integer> tierFilesOlderThanDays;

    public Input<Integer> getTierFilesOlderThanDays() {
        return this.tierFilesOlderThanDays == null ? Input.empty() : this.tierFilesOlderThanDays;
    }

    /**
     * Level of free space to be maintained by Cloud Tiering if it is enabled.
     * 
     */
    @InputImport(name="volumeFreeSpacePercent")
      private final @Nullable Input<Integer> volumeFreeSpacePercent;

    public Input<Integer> getVolumeFreeSpacePercent() {
        return this.volumeFreeSpacePercent == null ? Input.empty() : this.volumeFreeSpacePercent;
    }

    public ServerEndpointArgs(
        @Nullable Input<Either<String,FeatureStatus>> cloudTiering,
        @Nullable Input<String> friendlyName,
        @Nullable Input<Either<String,InitialDownloadPolicy>> initialDownloadPolicy,
        @Nullable Input<Either<String,LocalCacheMode>> localCacheMode,
        @Nullable Input<Either<String,FeatureStatus>> offlineDataTransfer,
        @Nullable Input<String> offlineDataTransferShareName,
        Input<String> resourceGroupName,
        @Nullable Input<String> serverEndpointName,
        @Nullable Input<String> serverLocalPath,
        @Nullable Input<String> serverResourceId,
        Input<String> storageSyncServiceName,
        Input<String> syncGroupName,
        @Nullable Input<Integer> tierFilesOlderThanDays,
        @Nullable Input<Integer> volumeFreeSpacePercent) {
        this.cloudTiering = cloudTiering;
        this.friendlyName = friendlyName;
        this.initialDownloadPolicy = initialDownloadPolicy == null ? Input.ofLeft("NamespaceThenModifiedFiles") : initialDownloadPolicy;
        this.localCacheMode = localCacheMode == null ? Input.ofLeft("UpdateLocallyCachedFiles") : localCacheMode;
        this.offlineDataTransfer = offlineDataTransfer;
        this.offlineDataTransferShareName = offlineDataTransferShareName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverEndpointName = serverEndpointName;
        this.serverLocalPath = serverLocalPath;
        this.serverResourceId = serverResourceId;
        this.storageSyncServiceName = Objects.requireNonNull(storageSyncServiceName, "expected parameter 'storageSyncServiceName' to be non-null");
        this.syncGroupName = Objects.requireNonNull(syncGroupName, "expected parameter 'syncGroupName' to be non-null");
        this.tierFilesOlderThanDays = tierFilesOlderThanDays;
        this.volumeFreeSpacePercent = volumeFreeSpacePercent;
    }

    private ServerEndpointArgs() {
        this.cloudTiering = Input.empty();
        this.friendlyName = Input.empty();
        this.initialDownloadPolicy = Input.empty();
        this.localCacheMode = Input.empty();
        this.offlineDataTransfer = Input.empty();
        this.offlineDataTransferShareName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serverEndpointName = Input.empty();
        this.serverLocalPath = Input.empty();
        this.serverResourceId = Input.empty();
        this.storageSyncServiceName = Input.empty();
        this.syncGroupName = Input.empty();
        this.tierFilesOlderThanDays = Input.empty();
        this.volumeFreeSpacePercent = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,FeatureStatus>> cloudTiering;
        private @Nullable Input<String> friendlyName;
        private @Nullable Input<Either<String,InitialDownloadPolicy>> initialDownloadPolicy;
        private @Nullable Input<Either<String,LocalCacheMode>> localCacheMode;
        private @Nullable Input<Either<String,FeatureStatus>> offlineDataTransfer;
        private @Nullable Input<String> offlineDataTransferShareName;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> serverEndpointName;
        private @Nullable Input<String> serverLocalPath;
        private @Nullable Input<String> serverResourceId;
        private Input<String> storageSyncServiceName;
        private Input<String> syncGroupName;
        private @Nullable Input<Integer> tierFilesOlderThanDays;
        private @Nullable Input<Integer> volumeFreeSpacePercent;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudTiering = defaults.cloudTiering;
    	      this.friendlyName = defaults.friendlyName;
    	      this.initialDownloadPolicy = defaults.initialDownloadPolicy;
    	      this.localCacheMode = defaults.localCacheMode;
    	      this.offlineDataTransfer = defaults.offlineDataTransfer;
    	      this.offlineDataTransferShareName = defaults.offlineDataTransferShareName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverEndpointName = defaults.serverEndpointName;
    	      this.serverLocalPath = defaults.serverLocalPath;
    	      this.serverResourceId = defaults.serverResourceId;
    	      this.storageSyncServiceName = defaults.storageSyncServiceName;
    	      this.syncGroupName = defaults.syncGroupName;
    	      this.tierFilesOlderThanDays = defaults.tierFilesOlderThanDays;
    	      this.volumeFreeSpacePercent = defaults.volumeFreeSpacePercent;
        }

        public Builder setCloudTiering(@Nullable Input<Either<String,FeatureStatus>> cloudTiering) {
            this.cloudTiering = cloudTiering;
            return this;
        }

        public Builder setCloudTiering(@Nullable Either<String,FeatureStatus> cloudTiering) {
            this.cloudTiering = Input.ofNullable(cloudTiering);
            return this;
        }

        public Builder setFriendlyName(@Nullable Input<String> friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = Input.ofNullable(friendlyName);
            return this;
        }

        public Builder setInitialDownloadPolicy(@Nullable Input<Either<String,InitialDownloadPolicy>> initialDownloadPolicy) {
            this.initialDownloadPolicy = initialDownloadPolicy;
            return this;
        }

        public Builder setInitialDownloadPolicy(@Nullable Either<String,InitialDownloadPolicy> initialDownloadPolicy) {
            this.initialDownloadPolicy = Input.ofNullable(initialDownloadPolicy);
            return this;
        }

        public Builder setLocalCacheMode(@Nullable Input<Either<String,LocalCacheMode>> localCacheMode) {
            this.localCacheMode = localCacheMode;
            return this;
        }

        public Builder setLocalCacheMode(@Nullable Either<String,LocalCacheMode> localCacheMode) {
            this.localCacheMode = Input.ofNullable(localCacheMode);
            return this;
        }

        public Builder setOfflineDataTransfer(@Nullable Input<Either<String,FeatureStatus>> offlineDataTransfer) {
            this.offlineDataTransfer = offlineDataTransfer;
            return this;
        }

        public Builder setOfflineDataTransfer(@Nullable Either<String,FeatureStatus> offlineDataTransfer) {
            this.offlineDataTransfer = Input.ofNullable(offlineDataTransfer);
            return this;
        }

        public Builder setOfflineDataTransferShareName(@Nullable Input<String> offlineDataTransferShareName) {
            this.offlineDataTransferShareName = offlineDataTransferShareName;
            return this;
        }

        public Builder setOfflineDataTransferShareName(@Nullable String offlineDataTransferShareName) {
            this.offlineDataTransferShareName = Input.ofNullable(offlineDataTransferShareName);
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

        public Builder setServerEndpointName(@Nullable Input<String> serverEndpointName) {
            this.serverEndpointName = serverEndpointName;
            return this;
        }

        public Builder setServerEndpointName(@Nullable String serverEndpointName) {
            this.serverEndpointName = Input.ofNullable(serverEndpointName);
            return this;
        }

        public Builder setServerLocalPath(@Nullable Input<String> serverLocalPath) {
            this.serverLocalPath = serverLocalPath;
            return this;
        }

        public Builder setServerLocalPath(@Nullable String serverLocalPath) {
            this.serverLocalPath = Input.ofNullable(serverLocalPath);
            return this;
        }

        public Builder setServerResourceId(@Nullable Input<String> serverResourceId) {
            this.serverResourceId = serverResourceId;
            return this;
        }

        public Builder setServerResourceId(@Nullable String serverResourceId) {
            this.serverResourceId = Input.ofNullable(serverResourceId);
            return this;
        }

        public Builder setStorageSyncServiceName(Input<String> storageSyncServiceName) {
            this.storageSyncServiceName = Objects.requireNonNull(storageSyncServiceName);
            return this;
        }

        public Builder setStorageSyncServiceName(String storageSyncServiceName) {
            this.storageSyncServiceName = Input.of(Objects.requireNonNull(storageSyncServiceName));
            return this;
        }

        public Builder setSyncGroupName(Input<String> syncGroupName) {
            this.syncGroupName = Objects.requireNonNull(syncGroupName);
            return this;
        }

        public Builder setSyncGroupName(String syncGroupName) {
            this.syncGroupName = Input.of(Objects.requireNonNull(syncGroupName));
            return this;
        }

        public Builder setTierFilesOlderThanDays(@Nullable Input<Integer> tierFilesOlderThanDays) {
            this.tierFilesOlderThanDays = tierFilesOlderThanDays;
            return this;
        }

        public Builder setTierFilesOlderThanDays(@Nullable Integer tierFilesOlderThanDays) {
            this.tierFilesOlderThanDays = Input.ofNullable(tierFilesOlderThanDays);
            return this;
        }

        public Builder setVolumeFreeSpacePercent(@Nullable Input<Integer> volumeFreeSpacePercent) {
            this.volumeFreeSpacePercent = volumeFreeSpacePercent;
            return this;
        }

        public Builder setVolumeFreeSpacePercent(@Nullable Integer volumeFreeSpacePercent) {
            this.volumeFreeSpacePercent = Input.ofNullable(volumeFreeSpacePercent);
            return this;
        }
        public ServerEndpointArgs build() {
            return new ServerEndpointArgs(cloudTiering, friendlyName, initialDownloadPolicy, localCacheMode, offlineDataTransfer, offlineDataTransferShareName, resourceGroupName, serverEndpointName, serverLocalPath, serverResourceId, storageSyncServiceName, syncGroupName, tierFilesOlderThanDays, volumeFreeSpacePercent);
        }
    }
}

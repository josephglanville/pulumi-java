// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.enums.AssetContainerPermission;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListAssetContainerSasArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListAssetContainerSasArgs Empty = new ListAssetContainerSasArgs();

    @InputImport(name="accountName", required=true)
    private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    @InputImport(name="assetName", required=true)
    private final String assetName;

    public String getAssetName() {
        return this.assetName;
    }

    @InputImport(name="expiryTime")
    private final @Nullable String expiryTime;

    public Optional<String> getExpiryTime() {
        return this.expiryTime == null ? Optional.empty() : Optional.ofNullable(this.expiryTime);
    }

    @InputImport(name="permissions")
    private final @Nullable Either<String,AssetContainerPermission> permissions;

    public Either<String,AssetContainerPermission> getPermissions() {
        return this.permissions == null ? null : this.permissions;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ListAssetContainerSasArgs(
        String accountName,
        String assetName,
        @Nullable String expiryTime,
        @Nullable Either<String,AssetContainerPermission> permissions,
        String resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.assetName = Objects.requireNonNull(assetName, "expected parameter 'assetName' to be non-null");
        this.expiryTime = expiryTime;
        this.permissions = permissions;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ListAssetContainerSasArgs() {
        this.accountName = null;
        this.assetName = null;
        this.expiryTime = null;
        this.permissions = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListAssetContainerSasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String assetName;
        private @Nullable String expiryTime;
        private @Nullable Either<String,AssetContainerPermission> permissions;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListAssetContainerSasArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.assetName = defaults.assetName;
    	      this.expiryTime = defaults.expiryTime;
    	      this.permissions = defaults.permissions;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAssetName(String assetName) {
            this.assetName = Objects.requireNonNull(assetName);
            return this;
        }

        public Builder setExpiryTime(@Nullable String expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }

        public Builder setPermissions(@Nullable Either<String,AssetContainerPermission> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public ListAssetContainerSasArgs build() {
            return new ListAssetContainerSasArgs(accountName, assetName, expiryTime, permissions, resourceGroupName);
        }
    }
}

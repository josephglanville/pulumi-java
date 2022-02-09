// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media;

import io.pulumi.azurenative.media.enums.StorageAuthentication;
import io.pulumi.azurenative.media.inputs.AccountEncryptionArgs;
import io.pulumi.azurenative.media.inputs.MediaServiceIdentityArgs;
import io.pulumi.azurenative.media.inputs.StorageAccountArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MediaServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final MediaServiceArgs Empty = new MediaServiceArgs();

    @InputImport(name="accountName")
    private final @Nullable Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName == null ? Input.empty() : this.accountName;
    }

    @InputImport(name="encryption")
    private final @Nullable Input<AccountEncryptionArgs> encryption;

    public Input<AccountEncryptionArgs> getEncryption() {
        return this.encryption == null ? Input.empty() : this.encryption;
    }

    @InputImport(name="identity")
    private final @Nullable Input<MediaServiceIdentityArgs> identity;

    public Input<MediaServiceIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="storageAccounts")
    private final @Nullable Input<List<StorageAccountArgs>> storageAccounts;

    public Input<List<StorageAccountArgs>> getStorageAccounts() {
        return this.storageAccounts == null ? Input.empty() : this.storageAccounts;
    }

    @InputImport(name="storageAuthentication")
    private final @Nullable Input<Either<String,StorageAuthentication>> storageAuthentication;

    public Input<Either<String,StorageAuthentication>> getStorageAuthentication() {
        return this.storageAuthentication == null ? Input.empty() : this.storageAuthentication;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public MediaServiceArgs(
        @Nullable Input<String> accountName,
        @Nullable Input<AccountEncryptionArgs> encryption,
        @Nullable Input<MediaServiceIdentityArgs> identity,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<List<StorageAccountArgs>> storageAccounts,
        @Nullable Input<Either<String,StorageAuthentication>> storageAuthentication,
        @Nullable Input<Map<String,String>> tags) {
        this.accountName = accountName;
        this.encryption = encryption;
        this.identity = identity;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.storageAccounts = storageAccounts;
        this.storageAuthentication = storageAuthentication;
        this.tags = tags;
    }

    private MediaServiceArgs() {
        this.accountName = Input.empty();
        this.encryption = Input.empty();
        this.identity = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.storageAccounts = Input.empty();
        this.storageAuthentication = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MediaServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accountName;
        private @Nullable Input<AccountEncryptionArgs> encryption;
        private @Nullable Input<MediaServiceIdentityArgs> identity;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<List<StorageAccountArgs>> storageAccounts;
        private @Nullable Input<Either<String,StorageAuthentication>> storageAuthentication;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(MediaServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.encryption = defaults.encryption;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.storageAccounts = defaults.storageAccounts;
    	      this.storageAuthentication = defaults.storageAuthentication;
    	      this.tags = defaults.tags;
        }

        public Builder setAccountName(@Nullable Input<String> accountName) {
            this.accountName = accountName;
            return this;
        }

        public Builder setAccountName(@Nullable String accountName) {
            this.accountName = Input.ofNullable(accountName);
            return this;
        }

        public Builder setEncryption(@Nullable Input<AccountEncryptionArgs> encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder setEncryption(@Nullable AccountEncryptionArgs encryption) {
            this.encryption = Input.ofNullable(encryption);
            return this;
        }

        public Builder setIdentity(@Nullable Input<MediaServiceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable MediaServiceIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public Builder setStorageAccounts(@Nullable Input<List<StorageAccountArgs>> storageAccounts) {
            this.storageAccounts = storageAccounts;
            return this;
        }

        public Builder setStorageAccounts(@Nullable List<StorageAccountArgs> storageAccounts) {
            this.storageAccounts = Input.ofNullable(storageAccounts);
            return this;
        }

        public Builder setStorageAuthentication(@Nullable Input<Either<String,StorageAuthentication>> storageAuthentication) {
            this.storageAuthentication = storageAuthentication;
            return this;
        }

        public Builder setStorageAuthentication(@Nullable Either<String,StorageAuthentication> storageAuthentication) {
            this.storageAuthentication = Input.ofNullable(storageAuthentication);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public MediaServiceArgs build() {
            return new MediaServiceArgs(accountName, encryption, identity, location, resourceGroupName, storageAccounts, storageAuthentication, tags);
        }
    }
}

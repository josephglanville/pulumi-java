// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoindexer;

import io.pulumi.azurenative.videoindexer.inputs.ManagedServiceIdentityArgs;
import io.pulumi.azurenative.videoindexer.inputs.MediaServicesForPutRequestArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccountArgs Empty = new AccountArgs();

    /**
     * The account's data-plane ID
     * 
     */
    @Import(name="accountId")
      private final @Nullable Output<String> accountId;

    public Output<String> getAccountId() {
        return this.accountId == null ? Codegen.empty() : this.accountId;
    }

    /**
     * The name of the Azure Video Analyzer for Media account.
     * 
     */
    @Import(name="accountName")
      private final @Nullable Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName == null ? Codegen.empty() : this.accountName;
    }

    /**
     * Managed service identity (system assigned and/or user assigned identities)
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<ManagedServiceIdentityArgs> identity;

    public Output<ManagedServiceIdentityArgs> getIdentity() {
        return this.identity == null ? Codegen.empty() : this.identity;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The media services details
     * 
     */
    @Import(name="mediaServices")
      private final @Nullable Output<MediaServicesForPutRequestArgs> mediaServices;

    public Output<MediaServicesForPutRequestArgs> getMediaServices() {
        return this.mediaServices == null ? Codegen.empty() : this.mediaServices;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public AccountArgs(
        @Nullable Output<String> accountId,
        @Nullable Output<String> accountName,
        @Nullable Output<ManagedServiceIdentityArgs> identity,
        @Nullable Output<String> location,
        @Nullable Output<MediaServicesForPutRequestArgs> mediaServices,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.identity = identity;
        this.location = location;
        this.mediaServices = mediaServices;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private AccountArgs() {
        this.accountId = Codegen.empty();
        this.accountName = Codegen.empty();
        this.identity = Codegen.empty();
        this.location = Codegen.empty();
        this.mediaServices = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountId;
        private @Nullable Output<String> accountName;
        private @Nullable Output<ManagedServiceIdentityArgs> identity;
        private @Nullable Output<String> location;
        private @Nullable Output<MediaServicesForPutRequestArgs> mediaServices;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.accountName = defaults.accountName;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.mediaServices = defaults.mediaServices;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            this.accountId = accountId;
            return this;
        }
        public Builder accountId(@Nullable String accountId) {
            this.accountId = Codegen.ofNullable(accountId);
            return this;
        }
        public Builder accountName(@Nullable Output<String> accountName) {
            this.accountName = accountName;
            return this;
        }
        public Builder accountName(@Nullable String accountName) {
            this.accountName = Codegen.ofNullable(accountName);
            return this;
        }
        public Builder identity(@Nullable Output<ManagedServiceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable ManagedServiceIdentityArgs identity) {
            this.identity = Codegen.ofNullable(identity);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder mediaServices(@Nullable Output<MediaServicesForPutRequestArgs> mediaServices) {
            this.mediaServices = mediaServices;
            return this;
        }
        public Builder mediaServices(@Nullable MediaServicesForPutRequestArgs mediaServices) {
            this.mediaServices = Codegen.ofNullable(mediaServices);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public AccountArgs build() {
            return new AccountArgs(accountId, accountName, identity, location, mediaServices, resourceGroupName, tags);
        }
    }
}

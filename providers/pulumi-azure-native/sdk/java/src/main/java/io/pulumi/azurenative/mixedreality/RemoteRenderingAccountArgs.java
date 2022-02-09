// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.mixedreality;

import io.pulumi.azurenative.mixedreality.inputs.IdentityArgs;
import io.pulumi.azurenative.mixedreality.inputs.SkuArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RemoteRenderingAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final RemoteRenderingAccountArgs Empty = new RemoteRenderingAccountArgs();

    @InputImport(name="accountName")
    private final @Nullable Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName == null ? Input.empty() : this.accountName;
    }

    @InputImport(name="identity")
    private final @Nullable Input<IdentityArgs> identity;

    public Input<IdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    @InputImport(name="kind")
    private final @Nullable Input<SkuArgs> kind;

    public Input<SkuArgs> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="plan")
    private final @Nullable Input<IdentityArgs> plan;

    public Input<IdentityArgs> getPlan() {
        return this.plan == null ? Input.empty() : this.plan;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="sku")
    private final @Nullable Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    @InputImport(name="storageAccountName")
    private final @Nullable Input<String> storageAccountName;

    public Input<String> getStorageAccountName() {
        return this.storageAccountName == null ? Input.empty() : this.storageAccountName;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public RemoteRenderingAccountArgs(
        @Nullable Input<String> accountName,
        @Nullable Input<IdentityArgs> identity,
        @Nullable Input<SkuArgs> kind,
        @Nullable Input<String> location,
        @Nullable Input<IdentityArgs> plan,
        Input<String> resourceGroupName,
        @Nullable Input<SkuArgs> sku,
        @Nullable Input<String> storageAccountName,
        @Nullable Input<Map<String,String>> tags) {
        this.accountName = accountName;
        this.identity = identity;
        this.kind = kind;
        this.location = location;
        this.plan = plan;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.storageAccountName = storageAccountName;
        this.tags = tags;
    }

    private RemoteRenderingAccountArgs() {
        this.accountName = Input.empty();
        this.identity = Input.empty();
        this.kind = Input.empty();
        this.location = Input.empty();
        this.plan = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.storageAccountName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RemoteRenderingAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accountName;
        private @Nullable Input<IdentityArgs> identity;
        private @Nullable Input<SkuArgs> kind;
        private @Nullable Input<String> location;
        private @Nullable Input<IdentityArgs> plan;
        private Input<String> resourceGroupName;
        private @Nullable Input<SkuArgs> sku;
        private @Nullable Input<String> storageAccountName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(RemoteRenderingAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.plan = defaults.plan;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.storageAccountName = defaults.storageAccountName;
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

        public Builder setIdentity(@Nullable Input<IdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable IdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setKind(@Nullable Input<SkuArgs> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable SkuArgs kind) {
            this.kind = Input.ofNullable(kind);
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

        public Builder setPlan(@Nullable Input<IdentityArgs> plan) {
            this.plan = plan;
            return this;
        }

        public Builder setPlan(@Nullable IdentityArgs plan) {
            this.plan = Input.ofNullable(plan);
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

        public Builder setSku(@Nullable Input<SkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable SkuArgs sku) {
            this.sku = Input.ofNullable(sku);
            return this;
        }

        public Builder setStorageAccountName(@Nullable Input<String> storageAccountName) {
            this.storageAccountName = storageAccountName;
            return this;
        }

        public Builder setStorageAccountName(@Nullable String storageAccountName) {
            this.storageAccountName = Input.ofNullable(storageAccountName);
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

        public RemoteRenderingAccountArgs build() {
            return new RemoteRenderingAccountArgs(accountName, identity, kind, location, plan, resourceGroupName, sku, storageAccountName, tags);
        }
    }
}

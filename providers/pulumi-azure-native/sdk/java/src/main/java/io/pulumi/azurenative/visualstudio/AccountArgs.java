// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.visualstudio;

import io.pulumi.azurenative.visualstudio.enums.AccountResourceRequestOperationType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccountArgs Empty = new AccountArgs();

    /**
     * The account name.
     * 
     */
    @InputImport(name="accountName")
      private final @Nullable Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName == null ? Output.empty() : this.accountName;
    }

    /**
     * The Azure instance location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The type of the operation.
     * 
     */
    @InputImport(name="operationType")
      private final @Nullable Output<Either<String,AccountResourceRequestOperationType>> operationType;

    public Output<Either<String,AccountResourceRequestOperationType>> getOperationType() {
        return this.operationType == null ? Output.empty() : this.operationType;
    }

    /**
     * The custom properties of the resource.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Output<Map<String,String>> properties;

    public Output<Map<String,String>> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * Name of the resource group within the Azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the resource.
     * 
     */
    @InputImport(name="resourceName")
      private final @Nullable Output<String> resourceName;

    public Output<String> getPropResourceName() {
        return this.resourceName == null ? Output.empty() : this.resourceName;
    }

    /**
     * The custom tags of the resource.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public AccountArgs(
        @Nullable Output<String> accountName,
        @Nullable Output<String> location,
        @Nullable Output<Either<String,AccountResourceRequestOperationType>> operationType,
        @Nullable Output<Map<String,String>> properties,
        Output<String> resourceGroupName,
        @Nullable Output<String> resourceName,
        @Nullable Output<Map<String,String>> tags) {
        this.accountName = accountName;
        this.location = location;
        this.operationType = operationType;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = resourceName;
        this.tags = tags;
    }

    private AccountArgs() {
        this.accountName = Output.empty();
        this.location = Output.empty();
        this.operationType = Output.empty();
        this.properties = Output.empty();
        this.resourceGroupName = Output.empty();
        this.resourceName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountName;
        private @Nullable Output<String> location;
        private @Nullable Output<Either<String,AccountResourceRequestOperationType>> operationType;
        private @Nullable Output<Map<String,String>> properties;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> resourceName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.location = defaults.location;
    	      this.operationType = defaults.operationType;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.tags = defaults.tags;
        }

        public Builder accountName(@Nullable Output<String> accountName) {
            this.accountName = accountName;
            return this;
        }

        public Builder accountName(@Nullable String accountName) {
            this.accountName = Output.ofNullable(accountName);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder operationType(@Nullable Output<Either<String,AccountResourceRequestOperationType>> operationType) {
            this.operationType = operationType;
            return this;
        }

        public Builder operationType(@Nullable Either<String,AccountResourceRequestOperationType> operationType) {
            this.operationType = Output.ofNullable(operationType);
            return this;
        }

        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = Output.ofNullable(properties);
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

        public Builder resourceName(@Nullable Output<String> resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        public Builder resourceName(@Nullable String resourceName) {
            this.resourceName = Output.ofNullable(resourceName);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public AccountArgs build() {
            return new AccountArgs(accountName, location, operationType, properties, resourceGroupName, resourceName, tags);
        }
    }
}

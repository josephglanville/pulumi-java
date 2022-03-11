// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection;

import io.pulumi.azurenative.dataprotection.inputs.DppIdentityDetailsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackupVaultArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupVaultArgs Empty = new BackupVaultArgs();

    /**
     * Optional ETag.
     * 
     */
    @InputImport(name="eTag")
      private final @Nullable Output<String> eTag;

    public Output<String> getETag() {
        return this.eTag == null ? Output.empty() : this.eTag;
    }

    /**
     * Input Managed Identity Details
     * 
     */
    @InputImport(name="identity")
      private final @Nullable Output<DppIdentityDetailsArgs> identity;

    public Output<DppIdentityDetailsArgs> getIdentity() {
        return this.identity == null ? Output.empty() : this.identity;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * BackupVaultResource properties
     * 
     */
    @InputImport(name="properties", required=true)
      private final Output<io.pulumi.azurenative.dataprotection.inputs.BackupVaultArgs> properties;

    public Output<io.pulumi.azurenative.dataprotection.inputs.BackupVaultArgs> getProperties() {
        return this.properties;
    }

    /**
     * The name of the resource group where the backup vault is present.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The name of the backup vault.
     * 
     */
    @InputImport(name="vaultName")
      private final @Nullable Output<String> vaultName;

    public Output<String> getVaultName() {
        return this.vaultName == null ? Output.empty() : this.vaultName;
    }

    public BackupVaultArgs(
        @Nullable Output<String> eTag,
        @Nullable Output<DppIdentityDetailsArgs> identity,
        @Nullable Output<String> location,
        Output<io.pulumi.azurenative.dataprotection.inputs.BackupVaultArgs> properties,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> vaultName) {
        this.eTag = eTag;
        this.identity = identity;
        this.location = location;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.vaultName = vaultName;
    }

    private BackupVaultArgs() {
        this.eTag = Output.empty();
        this.identity = Output.empty();
        this.location = Output.empty();
        this.properties = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tags = Output.empty();
        this.vaultName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupVaultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> eTag;
        private @Nullable Output<DppIdentityDetailsArgs> identity;
        private @Nullable Output<String> location;
        private Output<io.pulumi.azurenative.dataprotection.inputs.BackupVaultArgs> properties;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> vaultName;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupVaultArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eTag = defaults.eTag;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.vaultName = defaults.vaultName;
        }

        public Builder eTag(@Nullable Output<String> eTag) {
            this.eTag = eTag;
            return this;
        }

        public Builder eTag(@Nullable String eTag) {
            this.eTag = Output.ofNullable(eTag);
            return this;
        }

        public Builder identity(@Nullable Output<DppIdentityDetailsArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder identity(@Nullable DppIdentityDetailsArgs identity) {
            this.identity = Output.ofNullable(identity);
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

        public Builder properties(Output<io.pulumi.azurenative.dataprotection.inputs.BackupVaultArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder properties(io.pulumi.azurenative.dataprotection.inputs.BackupVaultArgs properties) {
            this.properties = Output.of(Objects.requireNonNull(properties));
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
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder vaultName(@Nullable Output<String> vaultName) {
            this.vaultName = vaultName;
            return this;
        }

        public Builder vaultName(@Nullable String vaultName) {
            this.vaultName = Output.ofNullable(vaultName);
            return this;
        }
        public BackupVaultArgs build() {
            return new BackupVaultArgs(eTag, identity, location, properties, resourceGroupName, tags, vaultName);
        }
    }
}

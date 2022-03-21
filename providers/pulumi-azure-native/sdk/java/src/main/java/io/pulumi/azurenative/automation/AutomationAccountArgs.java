// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.automation.inputs.EncryptionPropertiesArgs;
import io.pulumi.azurenative.automation.inputs.IdentityArgs;
import io.pulumi.azurenative.automation.inputs.SkuArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutomationAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutomationAccountArgs Empty = new AutomationAccountArgs();

    /**
     * The name of the automation account.
     * 
     */
    @Import(name="automationAccountName")
      private final @Nullable Output<String> automationAccountName;

    public Output<String> getAutomationAccountName() {
        return this.automationAccountName == null ? Output.empty() : this.automationAccountName;
    }

    /**
     * Indicates whether requests using non-AAD authentication are blocked
     * 
     */
    @Import(name="disableLocalAuth")
      private final @Nullable Output<Boolean> disableLocalAuth;

    public Output<Boolean> getDisableLocalAuth() {
        return this.disableLocalAuth == null ? Output.empty() : this.disableLocalAuth;
    }

    /**
     * Set the encryption properties for the automation account
     * 
     */
    @Import(name="encryption")
      private final @Nullable Output<EncryptionPropertiesArgs> encryption;

    public Output<EncryptionPropertiesArgs> getEncryption() {
        return this.encryption == null ? Output.empty() : this.encryption;
    }

    /**
     * Sets the identity property for automation account
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<IdentityArgs> identity;

    public Output<IdentityArgs> getIdentity() {
        return this.identity == null ? Output.empty() : this.identity;
    }

    /**
     * Gets or sets the location of the resource.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Gets or sets name of the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Indicates whether traffic on the non-ARM endpoint (Webhook/Agent) is allowed from the public internet
     * 
     */
    @Import(name="publicNetworkAccess")
      private final @Nullable Output<Boolean> publicNetworkAccess;

    public Output<Boolean> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Output.empty() : this.publicNetworkAccess;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Gets or sets account SKU.
     * 
     */
    @Import(name="sku")
      private final @Nullable Output<SkuArgs> sku;

    public Output<SkuArgs> getSku() {
        return this.sku == null ? Output.empty() : this.sku;
    }

    /**
     * Gets or sets the tags attached to the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public AutomationAccountArgs(
        @Nullable Output<String> automationAccountName,
        @Nullable Output<Boolean> disableLocalAuth,
        @Nullable Output<EncryptionPropertiesArgs> encryption,
        @Nullable Output<IdentityArgs> identity,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<Boolean> publicNetworkAccess,
        Output<String> resourceGroupName,
        @Nullable Output<SkuArgs> sku,
        @Nullable Output<Map<String,String>> tags) {
        this.automationAccountName = automationAccountName;
        this.disableLocalAuth = disableLocalAuth;
        this.encryption = encryption;
        this.identity = identity;
        this.location = location;
        this.name = name;
        this.publicNetworkAccess = publicNetworkAccess;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
    }

    private AutomationAccountArgs() {
        this.automationAccountName = Output.empty();
        this.disableLocalAuth = Output.empty();
        this.encryption = Output.empty();
        this.identity = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.publicNetworkAccess = Output.empty();
        this.resourceGroupName = Output.empty();
        this.sku = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> automationAccountName;
        private @Nullable Output<Boolean> disableLocalAuth;
        private @Nullable Output<EncryptionPropertiesArgs> encryption;
        private @Nullable Output<IdentityArgs> identity;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<Boolean> publicNetworkAccess;
        private Output<String> resourceGroupName;
        private @Nullable Output<SkuArgs> sku;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.disableLocalAuth = defaults.disableLocalAuth;
    	      this.encryption = defaults.encryption;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder automationAccountName(@Nullable Output<String> automationAccountName) {
            this.automationAccountName = automationAccountName;
            return this;
        }
        public Builder automationAccountName(@Nullable String automationAccountName) {
            this.automationAccountName = Output.ofNullable(automationAccountName);
            return this;
        }
        public Builder disableLocalAuth(@Nullable Output<Boolean> disableLocalAuth) {
            this.disableLocalAuth = disableLocalAuth;
            return this;
        }
        public Builder disableLocalAuth(@Nullable Boolean disableLocalAuth) {
            this.disableLocalAuth = Output.ofNullable(disableLocalAuth);
            return this;
        }
        public Builder encryption(@Nullable Output<EncryptionPropertiesArgs> encryption) {
            this.encryption = encryption;
            return this;
        }
        public Builder encryption(@Nullable EncryptionPropertiesArgs encryption) {
            this.encryption = Output.ofNullable(encryption);
            return this;
        }
        public Builder identity(@Nullable Output<IdentityArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable IdentityArgs identity) {
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
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder publicNetworkAccess(@Nullable Output<Boolean> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }
        public Builder publicNetworkAccess(@Nullable Boolean publicNetworkAccess) {
            this.publicNetworkAccess = Output.ofNullable(publicNetworkAccess);
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
        public Builder sku(@Nullable Output<SkuArgs> sku) {
            this.sku = sku;
            return this;
        }
        public Builder sku(@Nullable SkuArgs sku) {
            this.sku = Output.ofNullable(sku);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public AutomationAccountArgs build() {
            return new AutomationAccountArgs(automationAccountName, disableLocalAuth, encryption, identity, location, name, publicNetworkAccess, resourceGroupName, sku, tags);
        }
    }
}

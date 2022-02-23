// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aadiam;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateLinkForAzureAdArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateLinkForAzureAdArgs Empty = new PrivateLinkForAzureAdArgs();

    /**
     * Flag indicating whether all tenants are allowed
     * 
     */
    @InputImport(name="allTenants")
      private final @Nullable Input<Boolean> allTenants;

    public Input<Boolean> getAllTenants() {
        return this.allTenants == null ? Input.empty() : this.allTenants;
    }

    /**
     * Name of this resource.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Guid of the owner tenant
     * 
     */
    @InputImport(name="ownerTenantId")
      private final @Nullable Input<String> ownerTenantId;

    public Input<String> getOwnerTenantId() {
        return this.ownerTenantId == null ? Input.empty() : this.ownerTenantId;
    }

    /**
     * The name of the private link policy in Azure AD.
     * 
     */
    @InputImport(name="policyName")
      private final @Nullable Input<String> policyName;

    public Input<String> getPolicyName() {
        return this.policyName == null ? Input.empty() : this.policyName;
    }

    /**
     * Name of the resource group
     * 
     */
    @InputImport(name="resourceGroup")
      private final @Nullable Input<String> resourceGroup;

    public Input<String> getResourceGroup() {
        return this.resourceGroup == null ? Input.empty() : this.resourceGroup;
    }

    /**
     * Name of an Azure resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the private link policy resource
     * 
     */
    @InputImport(name="resourceName")
      private final @Nullable Input<String> resourceName;

    public Input<String> getPropResourceName() {
        return this.resourceName == null ? Input.empty() : this.resourceName;
    }

    /**
     * Subscription Identifier
     * 
     */
    @InputImport(name="subscriptionId")
      private final @Nullable Input<String> subscriptionId;

    public Input<String> getSubscriptionId() {
        return this.subscriptionId == null ? Input.empty() : this.subscriptionId;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The list of tenantIds.
     * 
     */
    @InputImport(name="tenants")
      private final @Nullable Input<List<String>> tenants;

    public Input<List<String>> getTenants() {
        return this.tenants == null ? Input.empty() : this.tenants;
    }

    public PrivateLinkForAzureAdArgs(
        @Nullable Input<Boolean> allTenants,
        @Nullable Input<String> name,
        @Nullable Input<String> ownerTenantId,
        @Nullable Input<String> policyName,
        @Nullable Input<String> resourceGroup,
        Input<String> resourceGroupName,
        @Nullable Input<String> resourceName,
        @Nullable Input<String> subscriptionId,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<List<String>> tenants) {
        this.allTenants = allTenants;
        this.name = name;
        this.ownerTenantId = ownerTenantId;
        this.policyName = policyName;
        this.resourceGroup = resourceGroup;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = resourceName;
        this.subscriptionId = subscriptionId;
        this.tags = tags;
        this.tenants = tenants;
    }

    private PrivateLinkForAzureAdArgs() {
        this.allTenants = Input.empty();
        this.name = Input.empty();
        this.ownerTenantId = Input.empty();
        this.policyName = Input.empty();
        this.resourceGroup = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceName = Input.empty();
        this.subscriptionId = Input.empty();
        this.tags = Input.empty();
        this.tenants = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkForAzureAdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allTenants;
        private @Nullable Input<String> name;
        private @Nullable Input<String> ownerTenantId;
        private @Nullable Input<String> policyName;
        private @Nullable Input<String> resourceGroup;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> resourceName;
        private @Nullable Input<String> subscriptionId;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<List<String>> tenants;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkForAzureAdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allTenants = defaults.allTenants;
    	      this.name = defaults.name;
    	      this.ownerTenantId = defaults.ownerTenantId;
    	      this.policyName = defaults.policyName;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tags = defaults.tags;
    	      this.tenants = defaults.tenants;
        }

        public Builder setAllTenants(@Nullable Input<Boolean> allTenants) {
            this.allTenants = allTenants;
            return this;
        }

        public Builder setAllTenants(@Nullable Boolean allTenants) {
            this.allTenants = Input.ofNullable(allTenants);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOwnerTenantId(@Nullable Input<String> ownerTenantId) {
            this.ownerTenantId = ownerTenantId;
            return this;
        }

        public Builder setOwnerTenantId(@Nullable String ownerTenantId) {
            this.ownerTenantId = Input.ofNullable(ownerTenantId);
            return this;
        }

        public Builder setPolicyName(@Nullable Input<String> policyName) {
            this.policyName = policyName;
            return this;
        }

        public Builder setPolicyName(@Nullable String policyName) {
            this.policyName = Input.ofNullable(policyName);
            return this;
        }

        public Builder setResourceGroup(@Nullable Input<String> resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        public Builder setResourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = Input.ofNullable(resourceGroup);
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

        public Builder setResourceName(@Nullable Input<String> resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        public Builder setResourceName(@Nullable String resourceName) {
            this.resourceName = Input.ofNullable(resourceName);
            return this;
        }

        public Builder setSubscriptionId(@Nullable Input<String> subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        public Builder setSubscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = Input.ofNullable(subscriptionId);
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

        public Builder setTenants(@Nullable Input<List<String>> tenants) {
            this.tenants = tenants;
            return this;
        }

        public Builder setTenants(@Nullable List<String> tenants) {
            this.tenants = Input.ofNullable(tenants);
            return this;
        }
        public PrivateLinkForAzureAdArgs build() {
            return new PrivateLinkForAzureAdArgs(allTenants, name, ownerTenantId, policyName, resourceGroup, resourceGroupName, resourceName, subscriptionId, tags, tenants);
        }
    }
}

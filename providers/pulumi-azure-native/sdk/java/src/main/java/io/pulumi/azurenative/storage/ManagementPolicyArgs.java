// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.storage.inputs.ManagementPolicySchemaArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagementPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagementPolicyArgs Empty = new ManagementPolicyArgs();

    /**
     * The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    @InputImport(name="accountName", required=true)
      private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the Storage Account Management Policy. It should always be 'default'
     * 
     */
    @InputImport(name="managementPolicyName")
      private final @Nullable Input<String> managementPolicyName;

    public Input<String> getManagementPolicyName() {
        return this.managementPolicyName == null ? Input.empty() : this.managementPolicyName;
    }

    /**
     * The Storage Account ManagementPolicy, in JSON format. See more details in: https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     * 
     */
    @InputImport(name="policy", required=true)
      private final Input<ManagementPolicySchemaArgs> policy;

    public Input<ManagementPolicySchemaArgs> getPolicy() {
        return this.policy;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ManagementPolicyArgs(
        Input<String> accountName,
        @Nullable Input<String> managementPolicyName,
        Input<ManagementPolicySchemaArgs> policy,
        Input<String> resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.managementPolicyName = managementPolicyName;
        this.policy = Objects.requireNonNull(policy, "expected parameter 'policy' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ManagementPolicyArgs() {
        this.accountName = Input.empty();
        this.managementPolicyName = Input.empty();
        this.policy = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private @Nullable Input<String> managementPolicyName;
        private Input<ManagementPolicySchemaArgs> policy;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.managementPolicyName = defaults.managementPolicyName;
    	      this.policy = defaults.policy;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setManagementPolicyName(@Nullable Input<String> managementPolicyName) {
            this.managementPolicyName = managementPolicyName;
            return this;
        }

        public Builder setManagementPolicyName(@Nullable String managementPolicyName) {
            this.managementPolicyName = Input.ofNullable(managementPolicyName);
            return this;
        }

        public Builder setPolicy(Input<ManagementPolicySchemaArgs> policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }

        public Builder setPolicy(ManagementPolicySchemaArgs policy) {
            this.policy = Input.of(Objects.requireNonNull(policy));
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
        public ManagementPolicyArgs build() {
            return new ManagementPolicyArgs(accountName, managementPolicyName, policy, resourceGroupName);
        }
    }
}

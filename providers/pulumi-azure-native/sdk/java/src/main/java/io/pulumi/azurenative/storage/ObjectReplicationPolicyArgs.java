// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.storage.inputs.ObjectReplicationPolicyRuleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ObjectReplicationPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectReplicationPolicyArgs Empty = new ObjectReplicationPolicyArgs();

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
     * Required. Destination account name.
     * 
     */
    @InputImport(name="destinationAccount", required=true)
      private final Input<String> destinationAccount;

    public Input<String> getDestinationAccount() {
        return this.destinationAccount;
    }

    /**
     * The ID of object replication policy or 'default' if the policy ID is unknown.
     * 
     */
    @InputImport(name="objectReplicationPolicyId")
      private final @Nullable Input<String> objectReplicationPolicyId;

    public Input<String> getObjectReplicationPolicyId() {
        return this.objectReplicationPolicyId == null ? Input.empty() : this.objectReplicationPolicyId;
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

    /**
     * The storage account object replication rules.
     * 
     */
    @InputImport(name="rules")
      private final @Nullable Input<List<ObjectReplicationPolicyRuleArgs>> rules;

    public Input<List<ObjectReplicationPolicyRuleArgs>> getRules() {
        return this.rules == null ? Input.empty() : this.rules;
    }

    /**
     * Required. Source account name.
     * 
     */
    @InputImport(name="sourceAccount", required=true)
      private final Input<String> sourceAccount;

    public Input<String> getSourceAccount() {
        return this.sourceAccount;
    }

    public ObjectReplicationPolicyArgs(
        Input<String> accountName,
        Input<String> destinationAccount,
        @Nullable Input<String> objectReplicationPolicyId,
        Input<String> resourceGroupName,
        @Nullable Input<List<ObjectReplicationPolicyRuleArgs>> rules,
        Input<String> sourceAccount) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.destinationAccount = Objects.requireNonNull(destinationAccount, "expected parameter 'destinationAccount' to be non-null");
        this.objectReplicationPolicyId = objectReplicationPolicyId;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.rules = rules;
        this.sourceAccount = Objects.requireNonNull(sourceAccount, "expected parameter 'sourceAccount' to be non-null");
    }

    private ObjectReplicationPolicyArgs() {
        this.accountName = Input.empty();
        this.destinationAccount = Input.empty();
        this.objectReplicationPolicyId = Input.empty();
        this.resourceGroupName = Input.empty();
        this.rules = Input.empty();
        this.sourceAccount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectReplicationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private Input<String> destinationAccount;
        private @Nullable Input<String> objectReplicationPolicyId;
        private Input<String> resourceGroupName;
        private @Nullable Input<List<ObjectReplicationPolicyRuleArgs>> rules;
        private Input<String> sourceAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectReplicationPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.destinationAccount = defaults.destinationAccount;
    	      this.objectReplicationPolicyId = defaults.objectReplicationPolicyId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.rules = defaults.rules;
    	      this.sourceAccount = defaults.sourceAccount;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setDestinationAccount(Input<String> destinationAccount) {
            this.destinationAccount = Objects.requireNonNull(destinationAccount);
            return this;
        }

        public Builder setDestinationAccount(String destinationAccount) {
            this.destinationAccount = Input.of(Objects.requireNonNull(destinationAccount));
            return this;
        }

        public Builder setObjectReplicationPolicyId(@Nullable Input<String> objectReplicationPolicyId) {
            this.objectReplicationPolicyId = objectReplicationPolicyId;
            return this;
        }

        public Builder setObjectReplicationPolicyId(@Nullable String objectReplicationPolicyId) {
            this.objectReplicationPolicyId = Input.ofNullable(objectReplicationPolicyId);
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

        public Builder setRules(@Nullable Input<List<ObjectReplicationPolicyRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder setRules(@Nullable List<ObjectReplicationPolicyRuleArgs> rules) {
            this.rules = Input.ofNullable(rules);
            return this;
        }

        public Builder setSourceAccount(Input<String> sourceAccount) {
            this.sourceAccount = Objects.requireNonNull(sourceAccount);
            return this;
        }

        public Builder setSourceAccount(String sourceAccount) {
            this.sourceAccount = Input.of(Objects.requireNonNull(sourceAccount));
            return this;
        }
        public ObjectReplicationPolicyArgs build() {
            return new ObjectReplicationPolicyArgs(accountName, destinationAccount, objectReplicationPolicyId, resourceGroupName, rules, sourceAccount);
        }
    }
}

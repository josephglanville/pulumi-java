// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.enums.AdminRuleKind;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AdminRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final AdminRuleArgs Empty = new AdminRuleArgs();

    /**
     * The name of the network manager security Configuration.
     * 
     */
    @InputImport(name="configurationName", required=true)
      private final Input<String> configurationName;

    public Input<String> getConfigurationName() {
        return this.configurationName;
    }

    /**
     * Whether the rule is custom or default.
     * 
     */
    @InputImport(name="kind", required=true)
      private final Input<Either<String,AdminRuleKind>> kind;

    public Input<Either<String,AdminRuleKind>> getKind() {
        return this.kind;
    }

    /**
     * The name of the network manager.
     * 
     */
    @InputImport(name="networkManagerName", required=true)
      private final Input<String> networkManagerName;

    public Input<String> getNetworkManagerName() {
        return this.networkManagerName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the network manager security Configuration rule collection.
     * 
     */
    @InputImport(name="ruleCollectionName", required=true)
      private final Input<String> ruleCollectionName;

    public Input<String> getRuleCollectionName() {
        return this.ruleCollectionName;
    }

    /**
     * The name of the rule.
     * 
     */
    @InputImport(name="ruleName")
      private final @Nullable Input<String> ruleName;

    public Input<String> getRuleName() {
        return this.ruleName == null ? Input.empty() : this.ruleName;
    }

    public AdminRuleArgs(
        Input<String> configurationName,
        Input<Either<String,AdminRuleKind>> kind,
        Input<String> networkManagerName,
        Input<String> resourceGroupName,
        Input<String> ruleCollectionName,
        @Nullable Input<String> ruleName) {
        this.configurationName = Objects.requireNonNull(configurationName, "expected parameter 'configurationName' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.networkManagerName = Objects.requireNonNull(networkManagerName, "expected parameter 'networkManagerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleCollectionName = Objects.requireNonNull(ruleCollectionName, "expected parameter 'ruleCollectionName' to be non-null");
        this.ruleName = ruleName;
    }

    private AdminRuleArgs() {
        this.configurationName = Input.empty();
        this.kind = Input.empty();
        this.networkManagerName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.ruleCollectionName = Input.empty();
        this.ruleName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdminRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> configurationName;
        private Input<Either<String,AdminRuleKind>> kind;
        private Input<String> networkManagerName;
        private Input<String> resourceGroupName;
        private Input<String> ruleCollectionName;
        private @Nullable Input<String> ruleName;

        public Builder() {
    	      // Empty
        }

        public Builder(AdminRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationName = defaults.configurationName;
    	      this.kind = defaults.kind;
    	      this.networkManagerName = defaults.networkManagerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleCollectionName = defaults.ruleCollectionName;
    	      this.ruleName = defaults.ruleName;
        }

        public Builder setConfigurationName(Input<String> configurationName) {
            this.configurationName = Objects.requireNonNull(configurationName);
            return this;
        }

        public Builder setConfigurationName(String configurationName) {
            this.configurationName = Input.of(Objects.requireNonNull(configurationName));
            return this;
        }

        public Builder setKind(Input<Either<String,AdminRuleKind>> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(Either<String,AdminRuleKind> kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder setNetworkManagerName(Input<String> networkManagerName) {
            this.networkManagerName = Objects.requireNonNull(networkManagerName);
            return this;
        }

        public Builder setNetworkManagerName(String networkManagerName) {
            this.networkManagerName = Input.of(Objects.requireNonNull(networkManagerName));
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

        public Builder setRuleCollectionName(Input<String> ruleCollectionName) {
            this.ruleCollectionName = Objects.requireNonNull(ruleCollectionName);
            return this;
        }

        public Builder setRuleCollectionName(String ruleCollectionName) {
            this.ruleCollectionName = Input.of(Objects.requireNonNull(ruleCollectionName));
            return this;
        }

        public Builder setRuleName(@Nullable Input<String> ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        public Builder setRuleName(@Nullable String ruleName) {
            this.ruleName = Input.ofNullable(ruleName);
            return this;
        }
        public AdminRuleArgs build() {
            return new AdminRuleArgs(configurationName, kind, networkManagerName, resourceGroupName, ruleCollectionName, ruleName);
        }
    }
}

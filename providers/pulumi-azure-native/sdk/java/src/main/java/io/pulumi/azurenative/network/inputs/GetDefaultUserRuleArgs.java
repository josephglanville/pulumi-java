// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDefaultUserRuleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDefaultUserRuleArgs Empty = new GetDefaultUserRuleArgs();

    /**
     * The name of the network manager security Configuration.
     * 
     */
    @InputImport(name="configurationName", required=true)
      private final String configurationName;

    public String getConfigurationName() {
        return this.configurationName;
    }

    /**
     * The name of the network manager.
     * 
     */
    @InputImport(name="networkManagerName", required=true)
      private final String networkManagerName;

    public String getNetworkManagerName() {
        return this.networkManagerName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the network manager security Configuration rule collection.
     * 
     */
    @InputImport(name="ruleCollectionName", required=true)
      private final String ruleCollectionName;

    public String getRuleCollectionName() {
        return this.ruleCollectionName;
    }

    /**
     * The name of the rule.
     * 
     */
    @InputImport(name="ruleName", required=true)
      private final String ruleName;

    public String getRuleName() {
        return this.ruleName;
    }

    public GetDefaultUserRuleArgs(
        String configurationName,
        String networkManagerName,
        String resourceGroupName,
        String ruleCollectionName,
        String ruleName) {
        this.configurationName = Objects.requireNonNull(configurationName, "expected parameter 'configurationName' to be non-null");
        this.networkManagerName = Objects.requireNonNull(networkManagerName, "expected parameter 'networkManagerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleCollectionName = Objects.requireNonNull(ruleCollectionName, "expected parameter 'ruleCollectionName' to be non-null");
        this.ruleName = Objects.requireNonNull(ruleName, "expected parameter 'ruleName' to be non-null");
    }

    private GetDefaultUserRuleArgs() {
        this.configurationName = null;
        this.networkManagerName = null;
        this.resourceGroupName = null;
        this.ruleCollectionName = null;
        this.ruleName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDefaultUserRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String configurationName;
        private String networkManagerName;
        private String resourceGroupName;
        private String ruleCollectionName;
        private String ruleName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDefaultUserRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationName = defaults.configurationName;
    	      this.networkManagerName = defaults.networkManagerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleCollectionName = defaults.ruleCollectionName;
    	      this.ruleName = defaults.ruleName;
        }

        public Builder setConfigurationName(String configurationName) {
            this.configurationName = Objects.requireNonNull(configurationName);
            return this;
        }

        public Builder setNetworkManagerName(String networkManagerName) {
            this.networkManagerName = Objects.requireNonNull(networkManagerName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setRuleCollectionName(String ruleCollectionName) {
            this.ruleCollectionName = Objects.requireNonNull(ruleCollectionName);
            return this;
        }

        public Builder setRuleName(String ruleName) {
            this.ruleName = Objects.requireNonNull(ruleName);
            return this;
        }
        public GetDefaultUserRuleArgs build() {
            return new GetDefaultUserRuleArgs(configurationName, networkManagerName, resourceGroupName, ruleCollectionName, ruleName);
        }
    }
}

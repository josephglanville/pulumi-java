// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAdminRuleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAdminRuleArgs Empty = new GetAdminRuleArgs();

    /**
     * The name of the network manager security Configuration.
     * 
     */
    @Import(name="configurationName", required=true)
      private final String configurationName;

    public String getConfigurationName() {
        return this.configurationName;
    }

    /**
     * The name of the network manager.
     * 
     */
    @Import(name="networkManagerName", required=true)
      private final String networkManagerName;

    public String getNetworkManagerName() {
        return this.networkManagerName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the network manager security Configuration rule collection.
     * 
     */
    @Import(name="ruleCollectionName", required=true)
      private final String ruleCollectionName;

    public String getRuleCollectionName() {
        return this.ruleCollectionName;
    }

    /**
     * The name of the rule.
     * 
     */
    @Import(name="ruleName", required=true)
      private final String ruleName;

    public String getRuleName() {
        return this.ruleName;
    }

    public GetAdminRuleArgs(
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

    private GetAdminRuleArgs() {
        this.configurationName = null;
        this.networkManagerName = null;
        this.resourceGroupName = null;
        this.ruleCollectionName = null;
        this.ruleName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAdminRuleArgs defaults) {
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

        public Builder(GetAdminRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationName = defaults.configurationName;
    	      this.networkManagerName = defaults.networkManagerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleCollectionName = defaults.ruleCollectionName;
    	      this.ruleName = defaults.ruleName;
        }

        public Builder configurationName(String configurationName) {
            this.configurationName = Objects.requireNonNull(configurationName);
            return this;
        }
        public Builder networkManagerName(String networkManagerName) {
            this.networkManagerName = Objects.requireNonNull(networkManagerName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder ruleCollectionName(String ruleCollectionName) {
            this.ruleCollectionName = Objects.requireNonNull(ruleCollectionName);
            return this;
        }
        public Builder ruleName(String ruleName) {
            this.ruleName = Objects.requireNonNull(ruleName);
            return this;
        }        public GetAdminRuleArgs build() {
            return new GetAdminRuleArgs(configurationName, networkManagerName, resourceGroupName, ruleCollectionName, ruleName);
        }
    }
}

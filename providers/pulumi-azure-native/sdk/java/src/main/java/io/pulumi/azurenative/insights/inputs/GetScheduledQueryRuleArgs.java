// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetScheduledQueryRuleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetScheduledQueryRuleArgs Empty = new GetScheduledQueryRuleArgs();

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
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

    public GetScheduledQueryRuleArgs(
        String resourceGroupName,
        String ruleName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleName = Objects.requireNonNull(ruleName, "expected parameter 'ruleName' to be non-null");
    }

    private GetScheduledQueryRuleArgs() {
        this.resourceGroupName = null;
        this.ruleName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScheduledQueryRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String ruleName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScheduledQueryRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleName = defaults.ruleName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setRuleName(String ruleName) {
            this.ruleName = Objects.requireNonNull(ruleName);
            return this;
        }
        public GetScheduledQueryRuleArgs build() {
            return new GetScheduledQueryRuleArgs(resourceGroupName, ruleName);
        }
    }
}

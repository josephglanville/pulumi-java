// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDataCollectionRuleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDataCollectionRuleArgs Empty = new GetDataCollectionRuleArgs();

    /**
     * The name of the data collection rule. The name is case insensitive.
     * 
     */
    @InputImport(name="dataCollectionRuleName", required=true)
      private final String dataCollectionRuleName;

    public String getDataCollectionRuleName() {
        return this.dataCollectionRuleName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetDataCollectionRuleArgs(
        String dataCollectionRuleName,
        String resourceGroupName) {
        this.dataCollectionRuleName = Objects.requireNonNull(dataCollectionRuleName, "expected parameter 'dataCollectionRuleName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetDataCollectionRuleArgs() {
        this.dataCollectionRuleName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataCollectionRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataCollectionRuleName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataCollectionRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataCollectionRuleName = defaults.dataCollectionRuleName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setDataCollectionRuleName(String dataCollectionRuleName) {
            this.dataCollectionRuleName = Objects.requireNonNull(dataCollectionRuleName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetDataCollectionRuleArgs build() {
            return new GetDataCollectionRuleArgs(dataCollectionRuleName, resourceGroupName);
        }
    }
}

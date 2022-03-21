// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetHealthAlertArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetHealthAlertArgs Empty = new GetHealthAlertArgs();

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
     * The name of the rule.
     * 
     */
    @Import(name="ruleName", required=true)
      private final String ruleName;

    public String getRuleName() {
        return this.ruleName;
    }

    public GetHealthAlertArgs(
        String resourceGroupName,
        String ruleName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleName = Objects.requireNonNull(ruleName, "expected parameter 'ruleName' to be non-null");
    }

    private GetHealthAlertArgs() {
        this.resourceGroupName = null;
        this.ruleName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHealthAlertArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String ruleName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHealthAlertArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleName = defaults.ruleName;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder ruleName(String ruleName) {
            this.ruleName = Objects.requireNonNull(ruleName);
            return this;
        }        public GetHealthAlertArgs build() {
            return new GetHealthAlertArgs(resourceGroupName, ruleName);
        }
    }
}

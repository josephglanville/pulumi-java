// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDscNodeConfigurationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDscNodeConfigurationArgs Empty = new GetDscNodeConfigurationArgs();

    @InputImport(name="automationAccountName", required=true)
    private final String automationAccountName;

    public String getAutomationAccountName() {
        return this.automationAccountName;
    }

    @InputImport(name="nodeConfigurationName", required=true)
    private final String nodeConfigurationName;

    public String getNodeConfigurationName() {
        return this.nodeConfigurationName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetDscNodeConfigurationArgs(
        String automationAccountName,
        String nodeConfigurationName,
        String resourceGroupName) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.nodeConfigurationName = Objects.requireNonNull(nodeConfigurationName, "expected parameter 'nodeConfigurationName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetDscNodeConfigurationArgs() {
        this.automationAccountName = null;
        this.nodeConfigurationName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDscNodeConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String automationAccountName;
        private String nodeConfigurationName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDscNodeConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.nodeConfigurationName = defaults.nodeConfigurationName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAutomationAccountName(String automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }

        public Builder setNodeConfigurationName(String nodeConfigurationName) {
            this.nodeConfigurationName = Objects.requireNonNull(nodeConfigurationName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetDscNodeConfigurationArgs build() {
            return new GetDscNodeConfigurationArgs(automationAccountName, nodeConfigurationName, resourceGroupName);
        }
    }
}

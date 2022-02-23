// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetHybridRunbookWorkerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetHybridRunbookWorkerArgs Empty = new GetHybridRunbookWorkerArgs();

    /**
     * The name of the automation account.
     * 
     */
    @InputImport(name="automationAccountName", required=true)
      private final String automationAccountName;

    public String getAutomationAccountName() {
        return this.automationAccountName;
    }

    /**
     * The hybrid runbook worker group name
     * 
     */
    @InputImport(name="hybridRunbookWorkerGroupName", required=true)
      private final String hybridRunbookWorkerGroupName;

    public String getHybridRunbookWorkerGroupName() {
        return this.hybridRunbookWorkerGroupName;
    }

    /**
     * The hybrid runbook worker id
     * 
     */
    @InputImport(name="hybridRunbookWorkerId", required=true)
      private final String hybridRunbookWorkerId;

    public String getHybridRunbookWorkerId() {
        return this.hybridRunbookWorkerId;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetHybridRunbookWorkerArgs(
        String automationAccountName,
        String hybridRunbookWorkerGroupName,
        String hybridRunbookWorkerId,
        String resourceGroupName) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.hybridRunbookWorkerGroupName = Objects.requireNonNull(hybridRunbookWorkerGroupName, "expected parameter 'hybridRunbookWorkerGroupName' to be non-null");
        this.hybridRunbookWorkerId = Objects.requireNonNull(hybridRunbookWorkerId, "expected parameter 'hybridRunbookWorkerId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetHybridRunbookWorkerArgs() {
        this.automationAccountName = null;
        this.hybridRunbookWorkerGroupName = null;
        this.hybridRunbookWorkerId = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHybridRunbookWorkerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String automationAccountName;
        private String hybridRunbookWorkerGroupName;
        private String hybridRunbookWorkerId;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHybridRunbookWorkerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.hybridRunbookWorkerGroupName = defaults.hybridRunbookWorkerGroupName;
    	      this.hybridRunbookWorkerId = defaults.hybridRunbookWorkerId;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAutomationAccountName(String automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }

        public Builder setHybridRunbookWorkerGroupName(String hybridRunbookWorkerGroupName) {
            this.hybridRunbookWorkerGroupName = Objects.requireNonNull(hybridRunbookWorkerGroupName);
            return this;
        }

        public Builder setHybridRunbookWorkerId(String hybridRunbookWorkerId) {
            this.hybridRunbookWorkerId = Objects.requireNonNull(hybridRunbookWorkerId);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetHybridRunbookWorkerArgs build() {
            return new GetHybridRunbookWorkerArgs(automationAccountName, hybridRunbookWorkerGroupName, hybridRunbookWorkerId, resourceGroupName);
        }
    }
}

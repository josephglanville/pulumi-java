// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationsmanagement.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetManagementConfigurationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetManagementConfigurationArgs Empty = new GetManagementConfigurationArgs();

    @InputImport(name="managementConfigurationName", required=true)
    private final String managementConfigurationName;

    public String getManagementConfigurationName() {
        return this.managementConfigurationName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetManagementConfigurationArgs(
        String managementConfigurationName,
        String resourceGroupName) {
        this.managementConfigurationName = Objects.requireNonNull(managementConfigurationName, "expected parameter 'managementConfigurationName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetManagementConfigurationArgs() {
        this.managementConfigurationName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagementConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String managementConfigurationName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagementConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managementConfigurationName = defaults.managementConfigurationName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setManagementConfigurationName(String managementConfigurationName) {
            this.managementConfigurationName = Objects.requireNonNull(managementConfigurationName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetManagementConfigurationArgs build() {
            return new GetManagementConfigurationArgs(managementConfigurationName, resourceGroupName);
        }
    }
}
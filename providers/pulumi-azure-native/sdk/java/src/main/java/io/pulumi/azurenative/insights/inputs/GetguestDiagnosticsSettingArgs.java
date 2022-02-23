// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetguestDiagnosticsSettingArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetguestDiagnosticsSettingArgs Empty = new GetguestDiagnosticsSettingArgs();

    /**
     * The name of the diagnostic setting.
     * 
     */
    @InputImport(name="diagnosticSettingsName", required=true)
      private final String diagnosticSettingsName;

    public String getDiagnosticSettingsName() {
        return this.diagnosticSettingsName;
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

    public GetguestDiagnosticsSettingArgs(
        String diagnosticSettingsName,
        String resourceGroupName) {
        this.diagnosticSettingsName = Objects.requireNonNull(diagnosticSettingsName, "expected parameter 'diagnosticSettingsName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetguestDiagnosticsSettingArgs() {
        this.diagnosticSettingsName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetguestDiagnosticsSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String diagnosticSettingsName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetguestDiagnosticsSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diagnosticSettingsName = defaults.diagnosticSettingsName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setDiagnosticSettingsName(String diagnosticSettingsName) {
            this.diagnosticSettingsName = Objects.requireNonNull(diagnosticSettingsName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetguestDiagnosticsSettingArgs build() {
            return new GetguestDiagnosticsSettingArgs(diagnosticSettingsName, resourceGroupName);
        }
    }
}

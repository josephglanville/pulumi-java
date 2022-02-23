// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAzurePowerShellScriptArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAzurePowerShellScriptArgs Empty = new GetAzurePowerShellScriptArgs();

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
     * Name of the deployment script.
     * 
     */
    @InputImport(name="scriptName", required=true)
      private final String scriptName;

    public String getScriptName() {
        return this.scriptName;
    }

    public GetAzurePowerShellScriptArgs(
        String resourceGroupName,
        String scriptName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scriptName = Objects.requireNonNull(scriptName, "expected parameter 'scriptName' to be non-null");
    }

    private GetAzurePowerShellScriptArgs() {
        this.resourceGroupName = null;
        this.scriptName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAzurePowerShellScriptArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String scriptName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAzurePowerShellScriptArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scriptName = defaults.scriptName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setScriptName(String scriptName) {
            this.scriptName = Objects.requireNonNull(scriptName);
            return this;
        }
        public GetAzurePowerShellScriptArgs build() {
            return new GetAzurePowerShellScriptArgs(resourceGroupName, scriptName);
        }
    }
}

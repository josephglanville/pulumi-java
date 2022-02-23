// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListIntegrationAccountAssemblyContentCallbackUrlArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListIntegrationAccountAssemblyContentCallbackUrlArgs Empty = new ListIntegrationAccountAssemblyContentCallbackUrlArgs();

    /**
     * The assembly artifact name.
     * 
     */
    @InputImport(name="assemblyArtifactName", required=true)
      private final String assemblyArtifactName;

    public String getAssemblyArtifactName() {
        return this.assemblyArtifactName;
    }

    /**
     * The integration account name.
     * 
     */
    @InputImport(name="integrationAccountName", required=true)
      private final String integrationAccountName;

    public String getIntegrationAccountName() {
        return this.integrationAccountName;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ListIntegrationAccountAssemblyContentCallbackUrlArgs(
        String assemblyArtifactName,
        String integrationAccountName,
        String resourceGroupName) {
        this.assemblyArtifactName = Objects.requireNonNull(assemblyArtifactName, "expected parameter 'assemblyArtifactName' to be non-null");
        this.integrationAccountName = Objects.requireNonNull(integrationAccountName, "expected parameter 'integrationAccountName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ListIntegrationAccountAssemblyContentCallbackUrlArgs() {
        this.assemblyArtifactName = null;
        this.integrationAccountName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListIntegrationAccountAssemblyContentCallbackUrlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assemblyArtifactName;
        private String integrationAccountName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListIntegrationAccountAssemblyContentCallbackUrlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assemblyArtifactName = defaults.assemblyArtifactName;
    	      this.integrationAccountName = defaults.integrationAccountName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAssemblyArtifactName(String assemblyArtifactName) {
            this.assemblyArtifactName = Objects.requireNonNull(assemblyArtifactName);
            return this;
        }

        public Builder setIntegrationAccountName(String integrationAccountName) {
            this.integrationAccountName = Objects.requireNonNull(integrationAccountName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public ListIntegrationAccountAssemblyContentCallbackUrlArgs build() {
            return new ListIntegrationAccountAssemblyContentCallbackUrlArgs(assemblyArtifactName, integrationAccountName, resourceGroupName);
        }
    }
}

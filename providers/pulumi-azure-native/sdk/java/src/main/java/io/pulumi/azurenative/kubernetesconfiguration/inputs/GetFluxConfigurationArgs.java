// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetFluxConfigurationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFluxConfigurationArgs Empty = new GetFluxConfigurationArgs();

    /**
     * The name of the kubernetes cluster.
     * 
     */
    @InputImport(name="clusterName", required=true)
      private final String clusterName;

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * The Kubernetes cluster resource name - either managedClusters (for AKS clusters) or connectedClusters (for OnPrem K8S clusters).
     * 
     */
    @InputImport(name="clusterResourceName", required=true)
      private final String clusterResourceName;

    public String getClusterResourceName() {
        return this.clusterResourceName;
    }

    /**
     * The Kubernetes cluster RP - either Microsoft.ContainerService (for AKS clusters) or Microsoft.Kubernetes (for OnPrem K8S clusters).
     * 
     */
    @InputImport(name="clusterRp", required=true)
      private final String clusterRp;

    public String getClusterRp() {
        return this.clusterRp;
    }

    /**
     * Name of the Flux Configuration.
     * 
     */
    @InputImport(name="fluxConfigurationName", required=true)
      private final String fluxConfigurationName;

    public String getFluxConfigurationName() {
        return this.fluxConfigurationName;
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

    public GetFluxConfigurationArgs(
        String clusterName,
        String clusterResourceName,
        String clusterRp,
        String fluxConfigurationName,
        String resourceGroupName) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.clusterResourceName = Objects.requireNonNull(clusterResourceName, "expected parameter 'clusterResourceName' to be non-null");
        this.clusterRp = Objects.requireNonNull(clusterRp, "expected parameter 'clusterRp' to be non-null");
        this.fluxConfigurationName = Objects.requireNonNull(fluxConfigurationName, "expected parameter 'fluxConfigurationName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetFluxConfigurationArgs() {
        this.clusterName = null;
        this.clusterResourceName = null;
        this.clusterRp = null;
        this.fluxConfigurationName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFluxConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterName;
        private String clusterResourceName;
        private String clusterRp;
        private String fluxConfigurationName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFluxConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.clusterResourceName = defaults.clusterResourceName;
    	      this.clusterRp = defaults.clusterRp;
    	      this.fluxConfigurationName = defaults.fluxConfigurationName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setClusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder setClusterResourceName(String clusterResourceName) {
            this.clusterResourceName = Objects.requireNonNull(clusterResourceName);
            return this;
        }

        public Builder setClusterRp(String clusterRp) {
            this.clusterRp = Objects.requireNonNull(clusterRp);
            return this;
        }

        public Builder setFluxConfigurationName(String fluxConfigurationName) {
            this.fluxConfigurationName = Objects.requireNonNull(fluxConfigurationName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetFluxConfigurationArgs build() {
            return new GetFluxConfigurationArgs(clusterName, clusterResourceName, clusterRp, fluxConfigurationName, resourceGroupName);
        }
    }
}

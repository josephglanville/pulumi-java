// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServiceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetServiceArgs Empty = new GetServiceArgs();

    /**
     * The name of the application resource.
     * 
     */
    @Import(name="applicationName", required=true)
      private final String applicationName;

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * The name of the cluster resource.
     * 
     */
    @Import(name="clusterName", required=true)
      private final String clusterName;

    public String getClusterName() {
        return this.clusterName;
    }

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
     * The name of the service resource in the format of {applicationName}~{serviceName}.
     * 
     */
    @Import(name="serviceName", required=true)
      private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    public GetServiceArgs(
        String applicationName,
        String clusterName,
        String resourceGroupName,
        String serviceName) {
        this.applicationName = Objects.requireNonNull(applicationName, "expected parameter 'applicationName' to be non-null");
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GetServiceArgs() {
        this.applicationName = null;
        this.clusterName = null;
        this.resourceGroupName = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String applicationName;
        private String clusterName;
        private String resourceGroupName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationName = defaults.applicationName;
    	      this.clusterName = defaults.clusterName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder applicationName(String applicationName) {
            this.applicationName = Objects.requireNonNull(applicationName);
            return this;
        }
        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }        public GetServiceArgs build() {
            return new GetServiceArgs(applicationName, clusterName, resourceGroupName, serviceName);
        }
    }
}

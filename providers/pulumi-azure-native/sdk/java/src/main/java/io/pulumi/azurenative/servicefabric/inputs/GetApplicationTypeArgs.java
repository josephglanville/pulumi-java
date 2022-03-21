// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetApplicationTypeArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetApplicationTypeArgs Empty = new GetApplicationTypeArgs();

    /**
     * The name of the application type name resource.
     * 
     */
    @Import(name="applicationTypeName", required=true)
      private final String applicationTypeName;

    public String getApplicationTypeName() {
        return this.applicationTypeName;
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

    public GetApplicationTypeArgs(
        String applicationTypeName,
        String clusterName,
        String resourceGroupName) {
        this.applicationTypeName = Objects.requireNonNull(applicationTypeName, "expected parameter 'applicationTypeName' to be non-null");
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetApplicationTypeArgs() {
        this.applicationTypeName = null;
        this.clusterName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String applicationTypeName;
        private String clusterName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationTypeName = defaults.applicationTypeName;
    	      this.clusterName = defaults.clusterName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder applicationTypeName(String applicationTypeName) {
            this.applicationTypeName = Objects.requireNonNull(applicationTypeName);
            return this;
        }
        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetApplicationTypeArgs build() {
            return new GetApplicationTypeArgs(applicationTypeName, clusterName, resourceGroupName);
        }
    }
}

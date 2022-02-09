// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetApplicationTypeVersionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetApplicationTypeVersionArgs Empty = new GetApplicationTypeVersionArgs();

    @InputImport(name="applicationTypeName", required=true)
    private final String applicationTypeName;

    public String getApplicationTypeName() {
        return this.applicationTypeName;
    }

    @InputImport(name="clusterName", required=true)
    private final String clusterName;

    public String getClusterName() {
        return this.clusterName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="version", required=true)
    private final String version;

    public String getVersion() {
        return this.version;
    }

    public GetApplicationTypeVersionArgs(
        String applicationTypeName,
        String clusterName,
        String resourceGroupName,
        String version) {
        this.applicationTypeName = Objects.requireNonNull(applicationTypeName, "expected parameter 'applicationTypeName' to be non-null");
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private GetApplicationTypeVersionArgs() {
        this.applicationTypeName = null;
        this.clusterName = null;
        this.resourceGroupName = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationTypeVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String applicationTypeName;
        private String clusterName;
        private String resourceGroupName;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationTypeVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationTypeName = defaults.applicationTypeName;
    	      this.clusterName = defaults.clusterName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.version = defaults.version;
        }

        public Builder setApplicationTypeName(String applicationTypeName) {
            this.applicationTypeName = Objects.requireNonNull(applicationTypeName);
            return this;
        }

        public Builder setClusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public GetApplicationTypeVersionArgs build() {
            return new GetApplicationTypeVersionArgs(applicationTypeName, clusterName, resourceGroupName, version);
        }
    }
}

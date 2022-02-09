// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSourceControlConfigurationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSourceControlConfigurationArgs Empty = new GetSourceControlConfigurationArgs();

    @InputImport(name="clusterName", required=true)
    private final String clusterName;

    public String getClusterName() {
        return this.clusterName;
    }

    @InputImport(name="clusterResourceName", required=true)
    private final String clusterResourceName;

    public String getClusterResourceName() {
        return this.clusterResourceName;
    }

    @InputImport(name="clusterRp", required=true)
    private final String clusterRp;

    public String getClusterRp() {
        return this.clusterRp;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="sourceControlConfigurationName", required=true)
    private final String sourceControlConfigurationName;

    public String getSourceControlConfigurationName() {
        return this.sourceControlConfigurationName;
    }

    public GetSourceControlConfigurationArgs(
        String clusterName,
        String clusterResourceName,
        String clusterRp,
        String resourceGroupName,
        String sourceControlConfigurationName) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.clusterResourceName = Objects.requireNonNull(clusterResourceName, "expected parameter 'clusterResourceName' to be non-null");
        this.clusterRp = Objects.requireNonNull(clusterRp, "expected parameter 'clusterRp' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sourceControlConfigurationName = Objects.requireNonNull(sourceControlConfigurationName, "expected parameter 'sourceControlConfigurationName' to be non-null");
    }

    private GetSourceControlConfigurationArgs() {
        this.clusterName = null;
        this.clusterResourceName = null;
        this.clusterRp = null;
        this.resourceGroupName = null;
        this.sourceControlConfigurationName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSourceControlConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterName;
        private String clusterResourceName;
        private String clusterRp;
        private String resourceGroupName;
        private String sourceControlConfigurationName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSourceControlConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.clusterResourceName = defaults.clusterResourceName;
    	      this.clusterRp = defaults.clusterRp;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sourceControlConfigurationName = defaults.sourceControlConfigurationName;
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

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSourceControlConfigurationName(String sourceControlConfigurationName) {
            this.sourceControlConfigurationName = Objects.requireNonNull(sourceControlConfigurationName);
            return this;
        }

        public GetSourceControlConfigurationArgs build() {
            return new GetSourceControlConfigurationArgs(clusterName, clusterResourceName, clusterRp, resourceGroupName, sourceControlConfigurationName);
        }
    }
}

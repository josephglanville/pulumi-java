// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigNamespacedGkeDeploymentTargetGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigNamespacedGkeDeploymentTargetGetArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigNamespacedGkeDeploymentTargetGetArgs();

    /**
     * Optional. A namespace within the GKE cluster to deploy into.
     * 
     */
    @InputImport(name="clusterNamespace")
      private final @Nullable Input<String> clusterNamespace;

    public Input<String> getClusterNamespace() {
        return this.clusterNamespace == null ? Input.empty() : this.clusterNamespace;
    }

    /**
     * Optional. The target GKE cluster to deploy to. Format: 'projects/{project}/locations/{location}/clusters/{cluster_id}'
     * 
     */
    @InputImport(name="targetGkeCluster")
      private final @Nullable Input<String> targetGkeCluster;

    public Input<String> getTargetGkeCluster() {
        return this.targetGkeCluster == null ? Input.empty() : this.targetGkeCluster;
    }

    public WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigNamespacedGkeDeploymentTargetGetArgs(
        @Nullable Input<String> clusterNamespace,
        @Nullable Input<String> targetGkeCluster) {
        this.clusterNamespace = clusterNamespace;
        this.targetGkeCluster = targetGkeCluster;
    }

    private WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigNamespacedGkeDeploymentTargetGetArgs() {
        this.clusterNamespace = Input.empty();
        this.targetGkeCluster = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigNamespacedGkeDeploymentTargetGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clusterNamespace;
        private @Nullable Input<String> targetGkeCluster;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigNamespacedGkeDeploymentTargetGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterNamespace = defaults.clusterNamespace;
    	      this.targetGkeCluster = defaults.targetGkeCluster;
        }

        public Builder setClusterNamespace(@Nullable Input<String> clusterNamespace) {
            this.clusterNamespace = clusterNamespace;
            return this;
        }

        public Builder setClusterNamespace(@Nullable String clusterNamespace) {
            this.clusterNamespace = Input.ofNullable(clusterNamespace);
            return this;
        }

        public Builder setTargetGkeCluster(@Nullable Input<String> targetGkeCluster) {
            this.targetGkeCluster = targetGkeCluster;
            return this;
        }

        public Builder setTargetGkeCluster(@Nullable String targetGkeCluster) {
            this.targetGkeCluster = Input.ofNullable(targetGkeCluster);
            return this;
        }
        public WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigNamespacedGkeDeploymentTargetGetArgs build() {
            return new WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigNamespacedGkeDeploymentTargetGetArgs(clusterNamespace, targetGkeCluster);
        }
    }
}

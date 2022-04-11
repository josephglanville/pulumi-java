// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.ClusterSelectorArgs;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.ManagedClusterArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies workflow execution target.Either managed_cluster or cluster_selector is required.
 * 
 */
public final class WorkflowTemplatePlacementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementArgs Empty = new WorkflowTemplatePlacementArgs();

    /**
     * Optional. A selector that chooses target cluster for jobs based on metadata.The selector is evaluated at the time each job is submitted.
     * 
     */
    @Import(name="clusterSelector")
      private final @Nullable Output<ClusterSelectorArgs> clusterSelector;

    public Output<ClusterSelectorArgs> getClusterSelector() {
        return this.clusterSelector == null ? Codegen.empty() : this.clusterSelector;
    }

    /**
     * Optional. A cluster that is managed by the workflow.
     * 
     */
    @Import(name="managedCluster")
      private final @Nullable Output<ManagedClusterArgs> managedCluster;

    public Output<ManagedClusterArgs> getManagedCluster() {
        return this.managedCluster == null ? Codegen.empty() : this.managedCluster;
    }

    public WorkflowTemplatePlacementArgs(
        @Nullable Output<ClusterSelectorArgs> clusterSelector,
        @Nullable Output<ManagedClusterArgs> managedCluster) {
        this.clusterSelector = clusterSelector;
        this.managedCluster = managedCluster;
    }

    private WorkflowTemplatePlacementArgs() {
        this.clusterSelector = Codegen.empty();
        this.managedCluster = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ClusterSelectorArgs> clusterSelector;
        private @Nullable Output<ManagedClusterArgs> managedCluster;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterSelector = defaults.clusterSelector;
    	      this.managedCluster = defaults.managedCluster;
        }

        public Builder clusterSelector(@Nullable Output<ClusterSelectorArgs> clusterSelector) {
            this.clusterSelector = clusterSelector;
            return this;
        }
        public Builder clusterSelector(@Nullable ClusterSelectorArgs clusterSelector) {
            this.clusterSelector = Codegen.ofNullable(clusterSelector);
            return this;
        }
        public Builder managedCluster(@Nullable Output<ManagedClusterArgs> managedCluster) {
            this.managedCluster = managedCluster;
            return this;
        }
        public Builder managedCluster(@Nullable ManagedClusterArgs managedCluster) {
            this.managedCluster = Codegen.ofNullable(managedCluster);
            return this;
        }        public WorkflowTemplatePlacementArgs build() {
            return new WorkflowTemplatePlacementArgs(clusterSelector, managedCluster);
        }
    }
}

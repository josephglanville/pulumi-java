// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementClusterSelectorArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementArgs Empty = new WorkflowTemplatePlacementArgs();

    /**
     * Optional. A selector that chooses target cluster for jobs based on metadata. The selector is evaluated at the time each job is submitted.
     * 
     */
    @InputImport(name="clusterSelector")
      private final @Nullable Input<WorkflowTemplatePlacementClusterSelectorArgs> clusterSelector;

    public Input<WorkflowTemplatePlacementClusterSelectorArgs> getClusterSelector() {
        return this.clusterSelector == null ? Input.empty() : this.clusterSelector;
    }

    /**
     * A cluster that is managed by the workflow.
     * 
     */
    @InputImport(name="managedCluster")
      private final @Nullable Input<WorkflowTemplatePlacementManagedClusterArgs> managedCluster;

    public Input<WorkflowTemplatePlacementManagedClusterArgs> getManagedCluster() {
        return this.managedCluster == null ? Input.empty() : this.managedCluster;
    }

    public WorkflowTemplatePlacementArgs(
        @Nullable Input<WorkflowTemplatePlacementClusterSelectorArgs> clusterSelector,
        @Nullable Input<WorkflowTemplatePlacementManagedClusterArgs> managedCluster) {
        this.clusterSelector = clusterSelector;
        this.managedCluster = managedCluster;
    }

    private WorkflowTemplatePlacementArgs() {
        this.clusterSelector = Input.empty();
        this.managedCluster = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WorkflowTemplatePlacementClusterSelectorArgs> clusterSelector;
        private @Nullable Input<WorkflowTemplatePlacementManagedClusterArgs> managedCluster;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterSelector = defaults.clusterSelector;
    	      this.managedCluster = defaults.managedCluster;
        }

        public Builder setClusterSelector(@Nullable Input<WorkflowTemplatePlacementClusterSelectorArgs> clusterSelector) {
            this.clusterSelector = clusterSelector;
            return this;
        }

        public Builder setClusterSelector(@Nullable WorkflowTemplatePlacementClusterSelectorArgs clusterSelector) {
            this.clusterSelector = Input.ofNullable(clusterSelector);
            return this;
        }

        public Builder setManagedCluster(@Nullable Input<WorkflowTemplatePlacementManagedClusterArgs> managedCluster) {
            this.managedCluster = managedCluster;
            return this;
        }

        public Builder setManagedCluster(@Nullable WorkflowTemplatePlacementManagedClusterArgs managedCluster) {
            this.managedCluster = Input.ofNullable(managedCluster);
            return this;
        }
        public WorkflowTemplatePlacementArgs build() {
            return new WorkflowTemplatePlacementArgs(clusterSelector, managedCluster);
        }
    }
}

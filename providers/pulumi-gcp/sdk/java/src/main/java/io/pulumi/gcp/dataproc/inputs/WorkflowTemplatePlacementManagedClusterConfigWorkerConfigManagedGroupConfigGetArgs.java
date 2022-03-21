// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigGetArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigGetArgs();

    @Import(name="instanceGroupManagerName")
      private final @Nullable Output<String> instanceGroupManagerName;

    public Output<String> getInstanceGroupManagerName() {
        return this.instanceGroupManagerName == null ? Output.empty() : this.instanceGroupManagerName;
    }

    @Import(name="instanceTemplateName")
      private final @Nullable Output<String> instanceTemplateName;

    public Output<String> getInstanceTemplateName() {
        return this.instanceTemplateName == null ? Output.empty() : this.instanceTemplateName;
    }

    public WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigGetArgs(
        @Nullable Output<String> instanceGroupManagerName,
        @Nullable Output<String> instanceTemplateName) {
        this.instanceGroupManagerName = instanceGroupManagerName;
        this.instanceTemplateName = instanceTemplateName;
    }

    private WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigGetArgs() {
        this.instanceGroupManagerName = Output.empty();
        this.instanceTemplateName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> instanceGroupManagerName;
        private @Nullable Output<String> instanceTemplateName;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceGroupManagerName = defaults.instanceGroupManagerName;
    	      this.instanceTemplateName = defaults.instanceTemplateName;
        }

        public Builder instanceGroupManagerName(@Nullable Output<String> instanceGroupManagerName) {
            this.instanceGroupManagerName = instanceGroupManagerName;
            return this;
        }
        public Builder instanceGroupManagerName(@Nullable String instanceGroupManagerName) {
            this.instanceGroupManagerName = Output.ofNullable(instanceGroupManagerName);
            return this;
        }
        public Builder instanceTemplateName(@Nullable Output<String> instanceTemplateName) {
            this.instanceTemplateName = instanceTemplateName;
            return this;
        }
        public Builder instanceTemplateName(@Nullable String instanceTemplateName) {
            this.instanceTemplateName = Output.ofNullable(instanceTemplateName);
            return this;
        }        public WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigGetArgs build() {
            return new WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigGetArgs(instanceGroupManagerName, instanceTemplateName);
        }
    }
}

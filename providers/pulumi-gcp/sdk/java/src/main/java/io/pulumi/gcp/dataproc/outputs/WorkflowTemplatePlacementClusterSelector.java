// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkflowTemplatePlacementClusterSelector {
    private final Map<String,String> clusterLabels;
    private final @Nullable String zone;

    @OutputCustomType.Constructor({"clusterLabels","zone"})
    private WorkflowTemplatePlacementClusterSelector(
        Map<String,String> clusterLabels,
        @Nullable String zone) {
        this.clusterLabels = Objects.requireNonNull(clusterLabels);
        this.zone = zone;
    }

    public Map<String,String> getClusterLabels() {
        return this.clusterLabels;
    }
    public Optional<String> getZone() {
        return Optional.ofNullable(this.zone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementClusterSelector defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> clusterLabels;
        private @Nullable String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementClusterSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterLabels = defaults.clusterLabels;
    	      this.zone = defaults.zone;
        }

        public Builder setClusterLabels(Map<String,String> clusterLabels) {
            this.clusterLabels = Objects.requireNonNull(clusterLabels);
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = zone;
            return this;
        }

        public WorkflowTemplatePlacementClusterSelector build() {
            return new WorkflowTemplatePlacementClusterSelector(clusterLabels, zone);
        }
    }
}
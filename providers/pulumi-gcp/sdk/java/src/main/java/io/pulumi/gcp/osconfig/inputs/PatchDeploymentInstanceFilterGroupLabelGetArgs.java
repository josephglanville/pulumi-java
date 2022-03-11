// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class PatchDeploymentInstanceFilterGroupLabelGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentInstanceFilterGroupLabelGetArgs Empty = new PatchDeploymentInstanceFilterGroupLabelGetArgs();

    /**
     * Compute Engine instance labels that must be present for a VM instance to be targeted by this filter
     * 
     */
    @InputImport(name="labels", required=true)
      private final Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }

    public PatchDeploymentInstanceFilterGroupLabelGetArgs(Output<Map<String,String>> labels) {
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
    }

    private PatchDeploymentInstanceFilterGroupLabelGetArgs() {
        this.labels = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentInstanceFilterGroupLabelGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Map<String,String>> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentInstanceFilterGroupLabelGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
        }

        public Builder labels(Output<Map<String,String>> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Output.of(Objects.requireNonNull(labels));
            return this;
        }
        public PatchDeploymentInstanceFilterGroupLabelGetArgs build() {
            return new PatchDeploymentInstanceFilterGroupLabelGetArgs(labels);
        }
    }
}

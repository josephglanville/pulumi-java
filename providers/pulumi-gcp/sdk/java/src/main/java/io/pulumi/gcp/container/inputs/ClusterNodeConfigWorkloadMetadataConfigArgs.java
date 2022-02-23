// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ClusterNodeConfigWorkloadMetadataConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterNodeConfigWorkloadMetadataConfigArgs Empty = new ClusterNodeConfigWorkloadMetadataConfigArgs();

    /**
     * How to expose the node metadata to the workload running on the node.
     * Accepted values are:
     * * UNSPECIFIED: Not Set
     * * GCE_METADATA: Expose all Compute Engine metadata to pods.
     * * GKE_METADATA: Run the GKE Metadata Server on this node. The GKE Metadata Server exposes a metadata API to workloads that is compatible with the V1 Compute Metadata APIs exposed by the Compute Engine and App Engine Metadata Servers. This feature can only be enabled if [workload identity](https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity) is enabled at the cluster level.
     * 
     */
    @InputImport(name="mode", required=true)
      private final Input<String> mode;

    public Input<String> getMode() {
        return this.mode;
    }

    public ClusterNodeConfigWorkloadMetadataConfigArgs(Input<String> mode) {
        this.mode = Objects.requireNonNull(mode, "expected parameter 'mode' to be non-null");
    }

    private ClusterNodeConfigWorkloadMetadataConfigArgs() {
        this.mode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeConfigWorkloadMetadataConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> mode;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodeConfigWorkloadMetadataConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
        }

        public Builder setMode(Input<String> mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public Builder setMode(String mode) {
            this.mode = Input.of(Objects.requireNonNull(mode));
            return this;
        }
        public ClusterNodeConfigWorkloadMetadataConfigArgs build() {
            return new ClusterNodeConfigWorkloadMetadataConfigArgs(mode);
        }
    }
}

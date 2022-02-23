// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class ClusterNodeConfigEphemeralStorageConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterNodeConfigEphemeralStorageConfigGetArgs Empty = new ClusterNodeConfigEphemeralStorageConfigGetArgs();

    /**
     * Number of local SSDs to use to back ephemeral storage. Uses NVMe interfaces. Each local SSD is 375 GB in size. If zero, it means to disable using local SSDs as ephemeral storage.
     * 
     */
    @InputImport(name="localSsdCount", required=true)
      private final Input<Integer> localSsdCount;

    public Input<Integer> getLocalSsdCount() {
        return this.localSsdCount;
    }

    public ClusterNodeConfigEphemeralStorageConfigGetArgs(Input<Integer> localSsdCount) {
        this.localSsdCount = Objects.requireNonNull(localSsdCount, "expected parameter 'localSsdCount' to be non-null");
    }

    private ClusterNodeConfigEphemeralStorageConfigGetArgs() {
        this.localSsdCount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeConfigEphemeralStorageConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> localSsdCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodeConfigEphemeralStorageConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localSsdCount = defaults.localSsdCount;
        }

        public Builder setLocalSsdCount(Input<Integer> localSsdCount) {
            this.localSsdCount = Objects.requireNonNull(localSsdCount);
            return this;
        }

        public Builder setLocalSsdCount(Integer localSsdCount) {
            this.localSsdCount = Input.of(Objects.requireNonNull(localSsdCount));
            return this;
        }
        public ClusterNodeConfigEphemeralStorageConfigGetArgs build() {
            return new ClusterNodeConfigEphemeralStorageConfigGetArgs(localSsdCount);
        }
    }
}

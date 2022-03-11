// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


/**
 * The properties of a default cluster
 * 
 */
public final class ManagementClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagementClusterArgs Empty = new ManagementClusterArgs();

    /**
     * The cluster size
     * 
     */
    @InputImport(name="clusterSize", required=true)
      private final Output<Integer> clusterSize;

    public Output<Integer> getClusterSize() {
        return this.clusterSize;
    }

    public ManagementClusterArgs(Output<Integer> clusterSize) {
        this.clusterSize = Objects.requireNonNull(clusterSize, "expected parameter 'clusterSize' to be non-null");
    }

    private ManagementClusterArgs() {
        this.clusterSize = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> clusterSize;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterSize = defaults.clusterSize;
        }

        public Builder clusterSize(Output<Integer> clusterSize) {
            this.clusterSize = Objects.requireNonNull(clusterSize);
            return this;
        }

        public Builder clusterSize(Integer clusterSize) {
            this.clusterSize = Output.of(Objects.requireNonNull(clusterSize));
            return this;
        }
        public ManagementClusterArgs build() {
            return new ManagementClusterArgs(clusterSize);
        }
    }
}

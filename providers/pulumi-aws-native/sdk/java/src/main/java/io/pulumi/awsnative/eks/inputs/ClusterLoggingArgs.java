// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.eks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Enable exporting the Kubernetes control plane logs for your cluster to CloudWatch Logs based on log types. By default, cluster control plane logs aren't exported to CloudWatch Logs.
 * 
 */
public final class ClusterLoggingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterLoggingArgs Empty = new ClusterLoggingArgs();

    /**
     * The cluster control plane logging configuration for your cluster.
     * 
     */
    @Import(name="clusterLogging")
      private final @Nullable Output<ClusterLoggingArgs> clusterLogging;

    public Output<ClusterLoggingArgs> getClusterLogging() {
        return this.clusterLogging == null ? Output.empty() : this.clusterLogging;
    }

    public ClusterLoggingArgs(@Nullable Output<ClusterLoggingArgs> clusterLogging) {
        this.clusterLogging = clusterLogging;
    }

    private ClusterLoggingArgs() {
        this.clusterLogging = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterLoggingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ClusterLoggingArgs> clusterLogging;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterLoggingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterLogging = defaults.clusterLogging;
        }

        public Builder clusterLogging(@Nullable Output<ClusterLoggingArgs> clusterLogging) {
            this.clusterLogging = clusterLogging;
            return this;
        }
        public Builder clusterLogging(@Nullable ClusterLoggingArgs clusterLogging) {
            this.clusterLogging = Output.ofNullable(clusterLogging);
            return this;
        }        public ClusterLoggingArgs build() {
            return new ClusterLoggingArgs(clusterLogging);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppProfileSingleClusterRoutingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppProfileSingleClusterRoutingGetArgs Empty = new AppProfileSingleClusterRoutingGetArgs();

    /**
     * If true, CheckAndMutateRow and ReadModifyWriteRow requests are allowed by this app profile.
     * It is unsafe to send these requests to the same table/row/column in multiple clusters.
     * 
     */
    @Import(name="allowTransactionalWrites")
      private final @Nullable Output<Boolean> allowTransactionalWrites;

    public Output<Boolean> getAllowTransactionalWrites() {
        return this.allowTransactionalWrites == null ? Output.empty() : this.allowTransactionalWrites;
    }

    /**
     * The cluster to which read/write requests should be routed.
     * 
     */
    @Import(name="clusterId", required=true)
      private final Output<String> clusterId;

    public Output<String> getClusterId() {
        return this.clusterId;
    }

    public AppProfileSingleClusterRoutingGetArgs(
        @Nullable Output<Boolean> allowTransactionalWrites,
        Output<String> clusterId) {
        this.allowTransactionalWrites = allowTransactionalWrites;
        this.clusterId = Objects.requireNonNull(clusterId, "expected parameter 'clusterId' to be non-null");
    }

    private AppProfileSingleClusterRoutingGetArgs() {
        this.allowTransactionalWrites = Output.empty();
        this.clusterId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppProfileSingleClusterRoutingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowTransactionalWrites;
        private Output<String> clusterId;

        public Builder() {
    	      // Empty
        }

        public Builder(AppProfileSingleClusterRoutingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowTransactionalWrites = defaults.allowTransactionalWrites;
    	      this.clusterId = defaults.clusterId;
        }

        public Builder allowTransactionalWrites(@Nullable Output<Boolean> allowTransactionalWrites) {
            this.allowTransactionalWrites = allowTransactionalWrites;
            return this;
        }
        public Builder allowTransactionalWrites(@Nullable Boolean allowTransactionalWrites) {
            this.allowTransactionalWrites = Output.ofNullable(allowTransactionalWrites);
            return this;
        }
        public Builder clusterId(Output<String> clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }
        public Builder clusterId(String clusterId) {
            this.clusterId = Output.of(Objects.requireNonNull(clusterId));
            return this;
        }        public AppProfileSingleClusterRoutingGetArgs build() {
            return new AppProfileSingleClusterRoutingGetArgs(allowTransactionalWrites, clusterId);
        }
    }
}

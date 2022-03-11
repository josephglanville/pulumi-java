// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobPlacementArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobPlacementArgs Empty = new JobPlacementArgs();

    @InputImport(name="clusterName", required=true)
      private final Output<String> clusterName;

    public Output<String> getClusterName() {
        return this.clusterName;
    }

    @InputImport(name="clusterUuid")
      private final @Nullable Output<String> clusterUuid;

    public Output<String> getClusterUuid() {
        return this.clusterUuid == null ? Output.empty() : this.clusterUuid;
    }

    public JobPlacementArgs(
        Output<String> clusterName,
        @Nullable Output<String> clusterUuid) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.clusterUuid = clusterUuid;
    }

    private JobPlacementArgs() {
        this.clusterName = Output.empty();
        this.clusterUuid = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobPlacementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> clusterName;
        private @Nullable Output<String> clusterUuid;

        public Builder() {
    	      // Empty
        }

        public Builder(JobPlacementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.clusterUuid = defaults.clusterUuid;
        }

        public Builder clusterName(Output<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder clusterName(String clusterName) {
            this.clusterName = Output.of(Objects.requireNonNull(clusterName));
            return this;
        }

        public Builder clusterUuid(@Nullable Output<String> clusterUuid) {
            this.clusterUuid = clusterUuid;
            return this;
        }

        public Builder clusterUuid(@Nullable String clusterUuid) {
            this.clusterUuid = Output.ofNullable(clusterUuid);
            return this;
        }
        public JobPlacementArgs build() {
            return new JobPlacementArgs(clusterName, clusterUuid);
        }
    }
}

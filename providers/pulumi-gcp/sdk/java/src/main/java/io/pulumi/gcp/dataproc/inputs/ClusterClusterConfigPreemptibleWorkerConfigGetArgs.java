// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigDiskConfigGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterClusterConfigPreemptibleWorkerConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterClusterConfigPreemptibleWorkerConfigGetArgs Empty = new ClusterClusterConfigPreemptibleWorkerConfigGetArgs();

    /**
     * Disk Config
     * 
     */
    @Import(name="diskConfig")
      private final @Nullable Output<ClusterClusterConfigPreemptibleWorkerConfigDiskConfigGetArgs> diskConfig;

    public Output<ClusterClusterConfigPreemptibleWorkerConfigDiskConfigGetArgs> getDiskConfig() {
        return this.diskConfig == null ? Output.empty() : this.diskConfig;
    }

    @Import(name="instanceNames")
      private final @Nullable Output<List<String>> instanceNames;

    public Output<List<String>> getInstanceNames() {
        return this.instanceNames == null ? Output.empty() : this.instanceNames;
    }

    /**
     * Specifies the number of preemptible nodes to create.
     * Defaults to 0.
     * 
     */
    @Import(name="numInstances")
      private final @Nullable Output<Integer> numInstances;

    public Output<Integer> getNumInstances() {
        return this.numInstances == null ? Output.empty() : this.numInstances;
    }

    public ClusterClusterConfigPreemptibleWorkerConfigGetArgs(
        @Nullable Output<ClusterClusterConfigPreemptibleWorkerConfigDiskConfigGetArgs> diskConfig,
        @Nullable Output<List<String>> instanceNames,
        @Nullable Output<Integer> numInstances) {
        this.diskConfig = diskConfig;
        this.instanceNames = instanceNames;
        this.numInstances = numInstances;
    }

    private ClusterClusterConfigPreemptibleWorkerConfigGetArgs() {
        this.diskConfig = Output.empty();
        this.instanceNames = Output.empty();
        this.numInstances = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigPreemptibleWorkerConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ClusterClusterConfigPreemptibleWorkerConfigDiskConfigGetArgs> diskConfig;
        private @Nullable Output<List<String>> instanceNames;
        private @Nullable Output<Integer> numInstances;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigPreemptibleWorkerConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskConfig = defaults.diskConfig;
    	      this.instanceNames = defaults.instanceNames;
    	      this.numInstances = defaults.numInstances;
        }

        public Builder diskConfig(@Nullable Output<ClusterClusterConfigPreemptibleWorkerConfigDiskConfigGetArgs> diskConfig) {
            this.diskConfig = diskConfig;
            return this;
        }
        public Builder diskConfig(@Nullable ClusterClusterConfigPreemptibleWorkerConfigDiskConfigGetArgs diskConfig) {
            this.diskConfig = Output.ofNullable(diskConfig);
            return this;
        }
        public Builder instanceNames(@Nullable Output<List<String>> instanceNames) {
            this.instanceNames = instanceNames;
            return this;
        }
        public Builder instanceNames(@Nullable List<String> instanceNames) {
            this.instanceNames = Output.ofNullable(instanceNames);
            return this;
        }
        public Builder instanceNames(String... instanceNames) {
            return instanceNames(List.of(instanceNames));
        }
        public Builder numInstances(@Nullable Output<Integer> numInstances) {
            this.numInstances = numInstances;
            return this;
        }
        public Builder numInstances(@Nullable Integer numInstances) {
            this.numInstances = Output.ofNullable(numInstances);
            return this;
        }        public ClusterClusterConfigPreemptibleWorkerConfigGetArgs build() {
            return new ClusterClusterConfigPreemptibleWorkerConfigGetArgs(diskConfig, instanceNames, numInstances);
        }
    }
}

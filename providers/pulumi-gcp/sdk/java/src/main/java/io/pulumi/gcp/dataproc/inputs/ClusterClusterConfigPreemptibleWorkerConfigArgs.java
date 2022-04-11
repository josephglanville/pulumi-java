// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigDiskConfigArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterClusterConfigPreemptibleWorkerConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterClusterConfigPreemptibleWorkerConfigArgs Empty = new ClusterClusterConfigPreemptibleWorkerConfigArgs();

    /**
     * Disk Config
     * 
     */
    @Import(name="diskConfig")
      private final @Nullable Output<ClusterClusterConfigPreemptibleWorkerConfigDiskConfigArgs> diskConfig;

    public Output<ClusterClusterConfigPreemptibleWorkerConfigDiskConfigArgs> getDiskConfig() {
        return this.diskConfig == null ? Codegen.empty() : this.diskConfig;
    }

    @Import(name="instanceNames")
      private final @Nullable Output<List<String>> instanceNames;

    public Output<List<String>> getInstanceNames() {
        return this.instanceNames == null ? Codegen.empty() : this.instanceNames;
    }

    /**
     * Specifies the number of preemptible nodes to create.
     * Defaults to 0.
     * 
     */
    @Import(name="numInstances")
      private final @Nullable Output<Integer> numInstances;

    public Output<Integer> getNumInstances() {
        return this.numInstances == null ? Codegen.empty() : this.numInstances;
    }

    public ClusterClusterConfigPreemptibleWorkerConfigArgs(
        @Nullable Output<ClusterClusterConfigPreemptibleWorkerConfigDiskConfigArgs> diskConfig,
        @Nullable Output<List<String>> instanceNames,
        @Nullable Output<Integer> numInstances) {
        this.diskConfig = diskConfig;
        this.instanceNames = instanceNames;
        this.numInstances = numInstances;
    }

    private ClusterClusterConfigPreemptibleWorkerConfigArgs() {
        this.diskConfig = Codegen.empty();
        this.instanceNames = Codegen.empty();
        this.numInstances = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigPreemptibleWorkerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ClusterClusterConfigPreemptibleWorkerConfigDiskConfigArgs> diskConfig;
        private @Nullable Output<List<String>> instanceNames;
        private @Nullable Output<Integer> numInstances;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigPreemptibleWorkerConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskConfig = defaults.diskConfig;
    	      this.instanceNames = defaults.instanceNames;
    	      this.numInstances = defaults.numInstances;
        }

        public Builder diskConfig(@Nullable Output<ClusterClusterConfigPreemptibleWorkerConfigDiskConfigArgs> diskConfig) {
            this.diskConfig = diskConfig;
            return this;
        }
        public Builder diskConfig(@Nullable ClusterClusterConfigPreemptibleWorkerConfigDiskConfigArgs diskConfig) {
            this.diskConfig = Codegen.ofNullable(diskConfig);
            return this;
        }
        public Builder instanceNames(@Nullable Output<List<String>> instanceNames) {
            this.instanceNames = instanceNames;
            return this;
        }
        public Builder instanceNames(@Nullable List<String> instanceNames) {
            this.instanceNames = Codegen.ofNullable(instanceNames);
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
            this.numInstances = Codegen.ofNullable(numInstances);
            return this;
        }        public ClusterClusterConfigPreemptibleWorkerConfigArgs build() {
            return new ClusterClusterConfigPreemptibleWorkerConfigArgs(diskConfig, instanceNames, numInstances);
        }
    }
}
